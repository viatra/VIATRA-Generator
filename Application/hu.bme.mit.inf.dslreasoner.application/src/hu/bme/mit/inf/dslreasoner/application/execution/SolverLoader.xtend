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
			]
		} else if(solver === Solver::VIATRA_SOLVER) {
			return new ViatraReasonerConfiguration => [c|
			]
		} else {
			throw new UnsupportedOperationException('''Unknown solver: «solver»''')
		}
	}
	
	def dispatch void setRunIndex(AlloySolverConfiguration config, Map<String, String> parameters, int runIndex, ScriptConsole console) {
		parameters.getAsBoolean("randomise",console).ifPresent[config.randomise = runIndex]
	}
	def dispatch void setRunIndex(LogicSolverConfiguration config, Map<String, String> parameters, int runIndex, ScriptConsole console) {
		
	}
}