package hu.bme.mit.inf.dslreasoner.application.execution

import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.AlloyBackendSolver
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.AlloySolver
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.AlloySolverConfiguration
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.Solver
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration
import hu.bme.mit.inf.dslreasoner.smt.reasoner.SMTSolver
import hu.bme.mit.inf.dslreasoner.smt.reasoner.SmtSolverConfiguration
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasoner
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration
import java.util.Map
import java.util.Optional
import org.eclipse.xtext.xbase.lib.Functions.Function1
import hu.bme.mit.inf.dslreasoner.visualisation.pi2graphviz.GraphvizVisualiser
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.DiversityDescriptor
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder.SolverConfiguration

class SolverLoader {
	def loadSolver(Solver solver, Map<String, String> config) {
		switch(solver) {
			case ALLOY_SOLVER: return new AlloySolver
			case SMT_SOLVER: return new SMTSolver
			case VIATRA_SOLVER: return new ViatraReasoner
		}
	}
	
	
	
	private def <Type>  Optional<Type> getAsType(
		Map<String, String> config,
		String key,
		ScriptConsole console,
		Function1<String,Type> parser,
		Class<Type> requestedType)
	{
		if(config.containsKey(key)) {
			val stringValue = config.get(key)
			try{
				val parsedValue = parser.apply(stringValue)
				return Optional.of(parsedValue)
			} catch(Exception e) {
				console.writeError('''Unable to parse configuration value for "«key»" to «requestedType.simpleName»!''')
				return Optional::empty
			}
		} else {
			return Optional::empty
		}
	}
	private def getAsInteger(Map<String, String> config, String key, ScriptConsole console) {
		return getAsType(config,key,console,[x|Integer.parseInt(x)],Integer)
	}
	private def getAsBoolean(Map<String, String> config, String key, ScriptConsole console) {
		return getAsType(config,key,console,[x|Boolean.parseBoolean(x)],Boolean)
	}
	private def getAsDouble(Map<String, String> config, String key, ScriptConsole console) {
		return getAsType(config,key,console,[x|Double.parseDouble(x)],Double)
	}
	
	def loadSolverConfig(
		Solver solver,
		Map<String, String> config,
		ScriptConsole console)
	{
		if(solver === Solver::ALLOY_SOLVER) {
			return new AlloySolverConfiguration => [c|
				config.getAsInteger("symmetry",console)
					.ifPresent[c.symmetry = it]
				config.getAsType("solver",console,[x|AlloyBackendSolver::valueOf(x)],AlloyBackendSolver)
					.ifPresent[c.solver = it]
			]
		} else if(solver === Solver::SMT_SOLVER) {
			return new SmtSolverConfiguration => [c|
				config.getAsBoolean("fixRandomSeed",console).ifPresent[c.fixRandomSeed = it]
				config.getAsType("path",console,[it],String).ifPresent[c.solverPath = it]
			]
		} else if(solver === Solver::VIATRA_SOLVER) {
			return new ViatraReasonerConfiguration => [c|
				c.debugCongiguration.partialInterpretatioVisualiser = new GraphvizVisualiser
				if(config.containsKey("diversity-range")) {
					val stringValue = config.get("diversity-range")
					try{
						val range = Integer.parseInt(stringValue)
						c.diversityRequirement = new DiversityDescriptor => [
							it.ensureDiversity = true
							it.range = range
						]
					} catch (NumberFormatException e) {console.writeError('''Malformed number format: «e.message»''')}
				}
				if(config.containsKey("numeric-solver-at-end")) {
					val stringValue = config.get("numeric-solver-at-end")
					if(stringValue.equals("true")) {
						println("numeric-solver-at-end")
						c.runIntermediateNumericalConsistencyChecks= false
					}
				}
				if(config.containsKey("fitness-punishSize")) {
					val stringValue = config.get("fitness-punishSize")
					try {
						c.punishSize = Boolean.parseBoolean(stringValue)
					} catch(Exception e) {}
				}
				if(config.containsKey("fitness-scope")) {
					val stringValue = config.get("fitness-scope")
					try {
						c.scopeWeight = Integer.parseInt(stringValue)
					} catch(Exception e) {}
				}
				if(config.containsKey("fitness-missing-containent")) {
					val stringValue = config.get("fitness-missing-containent")
					try {
						c.conaintmentWeight = Integer.parseInt(stringValue)
					} catch(Exception e) {}
				}
				if(config.containsKey("fitness-missing-noncontainent")) {
					val stringValue = config.get("fitness-missing-noncontainent")
					try {
						c.nonContainmentWeight = Integer.parseInt(stringValue)
					} catch(Exception e) {}
				}
				if(config.containsKey("fitness-missing-wf")) {
					val stringValue = config.get("fitness-missing-wf")
					try {
						c.unfinishedWFWeight = Integer.parseInt(stringValue)
					} catch(Exception e) {}
				}
			]
		} else {
			throw new UnsupportedOperationException('''Unknown solver: «solver»''')
		}
	}
	
	def dispatch void setRunIndex(AlloySolverConfiguration config, Map<String, String> parameters, int runIndex, ScriptConsole console) {
		parameters.getAsBoolean("randomize",console).ifPresent[
			if(it) {
				config.randomise = runIndex-1
			}
		]
	}
	def dispatch void setRunIndex(LogicSolverConfiguration config, Map<String, String> parameters, int runIndex, ScriptConsole console) {
		
	}
}