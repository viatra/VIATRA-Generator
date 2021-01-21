package hu.bme.mit.inf.dslreasoner.application.execution

import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.AlloySolver
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.AlloySolverConfiguration
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.CostObjectiveFunction
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ObjectiveEntry
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.OptimizationEntry
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.Solver
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ThresholdEntry
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration
import hu.bme.mit.inf.dslreasoner.smt.reasoner.SMTSolver
import hu.bme.mit.inf.dslreasoner.smt.reasoner.SmtSolverConfiguration
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.PolyhedralScopePropagatorConstraints
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.PolyhedralScopePropagatorSolver
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.ScopePropagatorStrategy
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.CostObjectiveConfiguration
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.CostObjectiveElementConfiguration
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.DiversityDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.PunishSizeStrategy
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasoner
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.ObjectiveKind
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.ObjectiveThreshold
import hu.bme.mit.inf.dslreasoner.visualisation.pi2graphviz.GraphvizVisualiser
import java.util.List
import java.util.Map
import java.util.Optional
import org.eclipse.viatra.query.patternlanguage.emf.vql.PatternModel
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.xbase.lib.Functions.Function1
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.AlloyBackendSolver
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.NumericSolverSelection
import java.util.HashMap

class SolverLoader {
	def loadSolver(Solver solver, Map<String, String> config) {
		switch (solver) {
			case ALLOY_SOLVER: return new AlloySolver
			case SMT_SOLVER: return new SMTSolver
			case VIATRA_SOLVER: return new ViatraReasoner
		}
	}

	private def <Type> Optional<Type> getAsType(Map<String, String> config, String key, ScriptConsole console,
		Function1<String, Type> parser, Class<Type> requestedType) {
		if (config.containsKey(key)) {
			val stringValue = config.get(key)
			try {
				val parsedValue = parser.apply(stringValue)
				return Optional.of(parsedValue)
			} catch (Exception e) {
				console.writeError('''Unable to parse configuration value for "«key»" to «requestedType.simpleName»!''')
				return Optional::empty
			}
		} else {
			return Optional::empty
		}
	}

	private def getAsInteger(Map<String, String> config, String key, ScriptConsole console) {
		return getAsType(config, key, console, [x|Integer.parseInt(x)], Integer)
	}

	private def getAsBoolean(Map<String, String> config, String key, ScriptConsole console) {
		return getAsType(config, key, console, [x|Boolean.parseBoolean(x)], Boolean)
	}

	private def getAsDouble(Map<String, String> config, String key, ScriptConsole console) {
		return getAsType(config, key, console, [x|Double.parseDouble(x)], Double)
	}

	def loadSolverConfig(Solver solver, Map<String, String> config, List<ObjectiveEntry> objectiveEntries,
		ScriptConsole console) {
		switch (solver) {
			case ALLOY_SOLVER: {
				if (!objectiveEntries.empty) {
					throw new IllegalArgumentException("Objectives are not supported by Alloy.")
				}
				val c = new AlloySolverConfiguration
				config.getAsInteger("symmetry", console).ifPresent[c.symmetry = it]
				config.getAsType("solver",console,[x|AlloyBackendSolver::valueOf(x)],AlloyBackendSolver).ifPresent[c.solver = it]
				c
			}
			case SMT_SOLVER: {
				if (!objectiveEntries.empty) {
					throw new IllegalArgumentException("Objectives are not supported by Z3.")
				}
				val c = new SmtSolverConfiguration
				config.getAsBoolean("fixRandomSeed", console).ifPresent[c.fixRandomSeed = it]
				config.getAsType("path", console, [it], String).ifPresent[c.solverPath = it]
				c
			}
			case VIATRA_SOLVER: {
				val c = new ViatraReasonerConfiguration
				c.debugConfiguration.partialInterpretatioVisualiser = new GraphvizVisualiser
				if (config.containsKey("diversity-range")) {
					val stringValue = config.get("diversity-range")
					try {
						val range = Integer.parseInt(stringValue)
						c.diversityRequirement = new DiversityDescriptor => [
							it.ensureDiversity = true
							it.range = range
						]
					} catch (NumberFormatException e) {
						console.writeError('''Malformed number format: «e.message»''')
					}
				}
				if (config.containsKey("numeric-solver-at-end")) {
					val stringValue = config.get("numeric-solver-at-end")
					if (stringValue.equals("true")) {
						println("numeric-solver-at-end")
						c.runIntermediateNumericalConsistencyChecks = false
					}
				}
				if (config.containsKey("fitness-punishSize")) {
					val stringValue = config.get("fitness-punishSize")
					c.punishSize = switch (stringValue) {
						case "false": PunishSizeStrategy.NONE
						case "true": PunishSizeStrategy.SMALLER_IS_BETTER
						case "inverse": PunishSizeStrategy.LARGER_IS_BETTER
						default: throw new IllegalArgumentException("Unknown punish size strategy: " + stringValue)
					}
				}
				if (config.containsKey("fitness-scope")) {
					val stringValue = config.get("fitness-scope")
					c.scopeWeight = Integer.parseInt(stringValue)
				}
				if (config.containsKey("fitness-missing-containment")) {
					val stringValue = config.get("fitness-missing-containment")
					c.conaintmentWeight = Integer.parseInt(stringValue)
				}
				if (config.containsKey("fitness-missing-noncontainment")) {
					val stringValue = config.get("fitness-missing-noncontainment")
					c.nonContainmentWeight = Integer.parseInt(stringValue)
				}
				if (config.containsKey("fitness-missing-wf")) {
					val stringValue = config.get("fitness-missing-wf")
					c.unfinishedWFWeight = Integer.parseInt(stringValue)
				}
				if (config.containsKey("fitness-objectCreationCosts")) {
					val stringValue = config.get("fitness-objectCreationCosts")
					c.calculateObjectCreationCosts = Boolean.parseBoolean(stringValue)
				}
				if (config.containsKey("numeric-solver")) {
					val stringValue = config.get("numeric-solver")
					c.numericSolverSelection = switch (stringValue) {
						case "dreal-docker": NumericSolverSelection.DREAL_DOCKER
						case "dreal-local": NumericSolverSelection.DREAL_LOCAL
						case "z3": NumericSolverSelection.Z3
						default: throw new IllegalArgumentException("Unknown numeric solver selection: " + stringValue)
					}
				}
				if (config.containsKey("dreal-local-path")) {
					val stringValue = config.get("dreal-local-path")
					if (!stringValue.equals("")){
						c.drealLocalPath = stringValue;	
					}
				}
				if (config.containsKey("scopePropagator")) {
					val stringValue = config.get("scopePropagator")
					c.scopePropagatorStrategy = switch (stringValue) {
						case "polyhedral": new ScopePropagatorStrategy.Polyhedral(
							PolyhedralScopePropagatorConstraints.Relational, PolyhedralScopePropagatorSolver.Clp, true)
						case "hybrid": new ScopePropagatorStrategy.Polyhedral(
							PolyhedralScopePropagatorConstraints.Relational, PolyhedralScopePropagatorSolver.Clp, false)
						case "typeHierarchy": ScopePropagatorStrategy.BasicTypeHierarchy
						default: throw new IllegalArgumentException("Unknown scope propagator: " + stringValue)
					}
				}
				if (config.containsKey("ignored-attributes")) {
					val stringValue = config.get("ignored-attributes")
					c.ignoredAttributesMap = parseIgnoredAttributes(stringValue) 
				}
				for (objectiveEntry : objectiveEntries) {
					val costObjectiveConfig = new CostObjectiveConfiguration
					switch (objectiveEntry) {
						OptimizationEntry: {
							costObjectiveConfig.findExtremum = true
							costObjectiveConfig.kind = switch (direction : objectiveEntry.direction) {
								case MAXIMIZE:
									ObjectiveKind.HIGHER_IS_BETTER
								case MINIMIZE:
									ObjectiveKind.LOWER_IS_BETTER
								default:
									throw new IllegalArgumentException("Unknown direction: " + direction)
							}
							costObjectiveConfig.threshold = ObjectiveThreshold.NO_THRESHOLD
						}
						ThresholdEntry: {
							costObjectiveConfig.findExtremum = false
							val threshold = objectiveEntry.threshold.doubleValue
							switch (operator : objectiveEntry.operator) {
								case LESS: {
									costObjectiveConfig.kind = ObjectiveKind.LOWER_IS_BETTER
									costObjectiveConfig.threshold = new ObjectiveThreshold.Exclusive(threshold)
								}
								case GREATER: {
									costObjectiveConfig.kind = ObjectiveKind.HIGHER_IS_BETTER
									costObjectiveConfig.threshold = new ObjectiveThreshold.Exclusive(threshold)
								}
								case LESS_EQUALS: {
									costObjectiveConfig.kind = ObjectiveKind.LOWER_IS_BETTER
									costObjectiveConfig.threshold = new ObjectiveThreshold.Exclusive(threshold)
								}
								case GREATER_EQUALS: {
									costObjectiveConfig.kind = ObjectiveKind.HIGHER_IS_BETTER
									costObjectiveConfig.threshold = new ObjectiveThreshold.Exclusive(threshold)
								}
								default:
									throw new IllegalArgumentException("Unknown operator: " + operator)
							}
						}
					}
					val function = objectiveEntry.function
					if (function instanceof CostObjectiveFunction) {
						for (costEntry : function.entries) {
							val element = new CostObjectiveElementConfiguration
							val pattern = costEntry.patternElement.pattern
							val packageName = costEntry.patternElement.package?.packageName ?:
								EcoreUtil2.getContainerOfType(pattern, PatternModel)?.packageName
							element.patternQualifiedName = if (packageName.nullOrEmpty) {
								pattern.name
							} else {
								packageName + "." + pattern.name
							}
							element.weight = costEntry.weight
							costObjectiveConfig.elements += element
						}
					} else {
						throw new IllegalArgumentException("Only cost objectives are supported by VIATRA.")
					}
					c.costObjectives += costObjectiveConfig
				}
				c
			}
			default:
				throw new UnsupportedOperationException('''Unknown solver: «solver»''')
		}
	}
	
	def Map<String, Map<String, String>> parseIgnoredAttributes(String input) {
		val Map<String, Map<String, String>>  clAttVal = newHashMap
		val List<String> entries = input.split(",")
		//TODO add some validation here
		for (entry : entries) {
			val List<String> components = entry.split("=")
			if (components.size != 2)
				throw new IllegalArgumentException("Invalid ignoredAttributes Specification: \"" + entry + "\"")

			val clAtt = components.get(0)
			val List<String> clAttArray = clAtt.split("\\.")
			if (clAttArray.size != 2)
				throw new IllegalArgumentException("Invalid attribute specification : \"" + clAtt + "\"")
			
			val c = clAttArray.get(0).strip
			val a = clAttArray.get(1).strip	
			val v = components.get(1).strip
			
			val clInMap = clAttVal.get(c)
			if (clInMap === null) {
				clAttVal.put(c, newHashMap(a -> v))
			} else {
				clInMap.put(a, v)
			}
		}
		return clAttVal
	}

	def dispatch void setRunIndex(AlloySolverConfiguration config, Map<String, String> parameters, int runIndex,
		ScriptConsole console) {
		parameters.getAsBoolean("randomize", console).ifPresent [
			if (it) {
				config.randomise = runIndex - 1
			}
		]
	}

	def dispatch void setRunIndex(LogicSolverConfiguration config, Map<String, String> parameters, int runIndex,
		ScriptConsole console) {
	}
}
