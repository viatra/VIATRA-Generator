package hu.bme.mit.inf.dslreasoner.run

import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult
import hu.bme.mit.inf.dslreasoner.logic.model.statistics.StatisticSections2Print
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeInferenceMethod
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.DiversityDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.StateCoderStrategy
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasoner
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.xtend.lib.annotations.Data
import java.util.LinkedList
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.AlloySolver
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.AlloySolverConfiguration

enum Metamodel {
	FAM, YakinduWOSynch, Yakindu
}
enum Constraints {
	None, Metamodel, All, PlusOne, MinusOne
}
enum StateCoder {
	ID, Normal, R1, R2, R3;
}
enum Solver {
	ViatraSolver, Alloy
}

@Data
class Scenario {
	int number
	int size
	public Metamodel metamodel
	Constraints constraints
	StateCoder statecoder
	int runs
	Solver solver
}

class ScenarioRunner {
	
	// Workspace
	private val FileSystemWorkspace inputs = new FileSystemWorkspace('''initialModels/''',"")
	private val ViatraReasoner viatraSolver = new ViatraReasoner
	private val AlloySolver alloySolver = new AlloySolver
	private var MetamodelLoader loader
	
	val Ecore2Logic ecore2Logic = new Ecore2Logic
	val Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic)
	val Logic2Ecore logic2Ecore = new Logic2Ecore(ecore2Logic)
	val InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic
	
	var matchStatistics = ""
	
	public def runScenario(Scenario scenario) {
		init()
		initLoader(scenario.metamodel)
		val mm = loader.loadMetamodel()
		val vq = loader.loadQueries(mm)
		val ps = loader.loadPartialModel()
		
//		printHeader(scenario)
		
		if(	scenario.constraints == Constraints.None ||
			scenario.constraints == Constraints.Metamodel||
			scenario.constraints == Constraints.All)
		{
			if(scenario.constraints == Constraints.None) {
				mm.attributes.forEach[it.lowerBound = 0]
				mm.references.forEach[it.lowerBound = 0]
			}
			
			val useVQ = if(scenario.constraints == Constraints.None || scenario.constraints == Constraints.Metamodel) {
				new ViatraQuerySetDescriptor(emptyList,emptySet,emptyMap)
			} else {
				vq
			}
			
			for(run : 1..scenario.runs) {
				runCase(run==1,scenario.constraints+""+run,run,scenario,mm,useVQ,ps)
				
				System.gc System.gc System.gc
				Thread.sleep(3000)
			}
			println(matchStatistics)
			
		} else if(scenario.constraints == Constraints.MinusOne) {
			var first = true
			//for(remove : vq.validationPatterns) {
				for(run : 1..scenario.runs) {
					
					//val removeName = remove.fullyQualifiedName
					//val desc = new ViatraQuerySetDescriptor(vq.patterns,vq.validationPatterns.filter[it != remove].toSet,emptyMap)
					runCase(first,"minusOne"+run,run,scenario,mm,vq,ps)
					first = false
					System.gc System.gc System.gc
					//Thread.sleep(3000)
				}
			//}
		}
	}
	
	private def runCase(boolean first, String id, int run, Scenario scenario, EcoreMetamodelDescriptor mm, ViatraQuerySetDescriptor vq, List<EObject> partialModel) {
		// Transform
		val metamodelProblem = ecore2Logic.transformMetamodel(mm,new Ecore2LogicConfiguration())
		instanceModel2Logic.transform(metamodelProblem,partialModel)
		if(vq!=null) {
			viatra2Logic.transformQueries(vq,metamodelProblem,new Viatra2LogicConfiguration)
		}
		val problem = metamodelProblem.output
		
		var FileSystemWorkspace workspace = new FileSystemWorkspace('''output_«id»/''',"")
		workspace.initAndClear
		val config = getSolverConfiguration(scenario,vq)
		
		// Execute
		val solution = getSolver(scenario).solve(problem,config,workspace)
		//printMatchCountStatistics(solution,id)
		val emfModels = new LinkedList
		if(solution instanceof ModelResult) {
			val interpretations = getSolver(scenario).getInterpretations(solution)
			for(interpretation : interpretations) {
				val instanceModel = logic2Ecore.transformInterpretation(interpretation,metamodelProblem.trace)
				emfModels+=instanceModel
			}
			
		}
		printStatistics(solution,emfModels,scenario,workspace,id,run,first)

	}
	
	private def init() {
		LogiclanguagePackage.eINSTANCE.class
		LogicproblemPackage.eINSTANCE.class
		PartialinterpretationPackage.eINSTANCE.class
		Ecore2logicannotationsPackage.eINSTANCE.class
		Viatra2LogicAnnotationsPackage.eINSTANCE.class
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("ecore",new XMIResourceFactoryImpl)
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi",new XMIResourceFactoryImpl)
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("logicproblem",new XMIResourceFactoryImpl)
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("partialinterpretation",new XMIResourceFactoryImpl)
	}
	
	private def initLoader(Metamodel metamodel) {
		loader = if(metamodel == Metamodel::FAM) {
			new FAMLoader(inputs)
		} else if(metamodel == Metamodel::Yakindu || metamodel == Metamodel::YakinduWOSynch) {
			new YakinduLoader(inputs) => [it.useSynchronization = false]
		} else throw new IllegalArgumentException('''Unknown domain: «metamodel»''')
	}
	
	def private getSolver(Scenario scenario) {
		if(scenario.solver == Solver::ViatraSolver) {
			viatraSolver
		} else if(scenario.solver == Solver::Alloy) {
			alloySolver
		}
	}
	
	def private getSolverConfiguration(Scenario scenario, ViatraQuerySetDescriptor vq) {
		if(scenario.solver == Solver.ViatraSolver) {
			val viatraConfig = new ViatraReasonerConfiguration => [
				it.runtimeLimit = 300
				it.typeScopes.maxNewElements = scenario.size
				it.typeScopes.minNewElements = scenario.size
				it.solutionScope.numberOfRequiredSolution = scenario.number
				it.existingQueries = vq.patterns.map[it.internalQueryRepresentation]
				it.nameNewElements = false
				it.typeInferenceMethod = TypeInferenceMethod.PreliminaryAnalysis
				it.additionalGlobalConstraints += loader.additionalConstraints
				it.stateCoderStrategy = if(scenario.statecoder == StateCoder::ID) {
					StateCoderStrategy::IDBased
				} else {
					StateCoderStrategy::Neighbourhood
				}
				if(scenario.statecoder != StateCoder::ID || scenario.statecoder != StateCoder::Normal) {
					val range = if(scenario.statecoder != StateCoder::R1) {
						1
					} else if(scenario.statecoder != StateCoder::R2) {
						2
					} else if(scenario.statecoder != StateCoder::R3) {
						3
					}
					
					it.diversityRequirement = new DiversityDescriptor => [
						it.relevantTypes = null
						it.relevantRelations = null
						it.maxNumber = 1
						it.range = range
						it.parallels = 1
					]
				}
			]
			return viatraConfig
		} else if(scenario.solver == Solver::Alloy) {
			return new AlloySolverConfiguration => [
				it.runtimeLimit = 300
				it.typeScopes.maxNewElements = scenario.size
				it.typeScopes.minNewElements = scenario.size
				it.solutionScope.numberOfRequiredSolution = scenario.number
				it.typeScopes.maxIntScope = 0
				it.writeToFile=true
			]
		}
		
	}
	
	def printStatistics(LogicResult solution, List<EObject> emfModels, Scenario scenario, FileSystemWorkspace workspace, String id,int run, boolean printHeader) {
		if(printHeader) {
			print("id;Solution type (ms);Transformation time (ms);Solver time (ms);")
			solution.statistics.entries.map[name].forEach[print(it+";")]
			println("save")
		}
		
		
		print(id+";")
		print(solution.class.simpleName+";");
		print(solution.statistics.transformationTime+";")
		print(solution.statistics.solverTime+";")
		
		print((new StatisticSections2Print).transformStatisticDatas2CSV(solution.statistics.entries))
		
		val representations = solution.representation
		for(representationIndex : 0..<representations.size) {
			val representation = representations.get(representationIndex)
			val emfModel = emfModels.get(representationIndex)
			val representationNumber = representationIndex + 1
			if(representation instanceof PartialInterpretation) {
				workspace.writeModel(representation, '''solution«representationNumber».partialinterpretation''')
				val partialInterpretation2GML = new PartialInterpretation2Gml
				val gml = partialInterpretation2GML.transform(representation)
				//ecore2GML.transform(root)
				workspace.writeText('''solutionVisualisation«representationNumber».gml''',gml)
			} else {
				workspace.writeText('''solution«representationNumber».txt''',representation.toString)
			}
			workspace.writeModel(emfModel,'''AM_«run»_«representationIndex+1».xmi''')
		}
		println('''saved''')
	}
	
	/*
	def printMatchCountStatistics(LogicResult solution, String run) {
		//val additionalMatches = ViatraReasoner::additionalMatches
		val allPatterns = ViatraReasoner::allPatterns
		val allModels = solution.representation
		//val header = additionalMatches.head.keySet
		//var res = '''run;model;«FOR pattern: header SEPARATOR ";"»«pattern»«ENDFOR»
		//'''
		var res = '''run;model;«FOR pattern: allPatterns.filter[calculateCount] SEPARATOR ";"»«pattern.fullyQualifiedName»«ENDFOR»
		'''
		var modelIndex = 1
		for(model : allModels) {
			//println(modelIndex)
			val actualModel = model as PartialInterpretation
			
			// Access the default local search hint
			val localSearchHint = LocalSearchHints.getDefault().build();
			 
			// Build an engine options with the local search hint
			//val options = ViatraQueryEngineOptions.
			//		defineOptions().
			//		withDefaultHint(localSearchHint).
			//                withDefaultBackend(localSearchHint.getQueryBackendFactory()). // this line is needed in 1.4 due to bug 507777
			//		build();
			
			val engine = ViatraQueryEngine.on(new EMFScope(actualModel),options)
			var line = '''«run»;«modelIndex»'''
			for(pattern : allPatterns.filter[calculateCount]) {
				val matcher = pattern.getMatcher(engine)
				line+=";"+matcher.countMatches
			}
			//;«FOR pattern : model.entrySet SEPARATOR ";"»«pattern.value»«ENDFOR»'''
			//val p = model as PartialInterpretation;
			modelIndex++
			res+=line+"\n"
		}
		matchStatistics+= res
	}
	
	def boolean calculateCount(IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> pattern) {
		pattern.fullyQualifiedName.startsWith("currentInRelation_pattern")
		//true
	}*/
}

class DiverseMeasurementRunner {
	def static void main(String[] args) {
		val scenario = new Scenario(100,49,Metamodel::Yakindu,Constraints.All,StateCoder.Normal,1,Solver::Alloy)
		val scenarioRunner = new ScenarioRunner
		scenarioRunner.runScenario(scenario)
	}
}