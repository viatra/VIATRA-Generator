package hu.bme.mit.inf.dslreasoner.run

import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasoner
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage
import org.eclipse.emf.ecore.resource.Resource
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.StateCoderStrategy
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeInferenceMethod
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.DiversityDescriptor
import org.eclipse.xtend.lib.annotations.Data
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import org.eclipse.emf.ecore.EObject
import java.util.List
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult
import hu.bme.mit.inf.dslreasoner.logic.model.statistics.StatisticSections2Print

enum Metamodel {
	FAM, YakinduWOSynch, Yakindu
}
enum Constraints {
	None, PlusOne, MinusOne
}
enum StateCoder {
	ID, R1, R2, R3;
}

@Data
class Scenario {
	int number
	int size
	public Metamodel metamodel
	Constraints constraints
	StateCoder statecoder
	int runs
}

class ScenarioRunner {
	
	// Workspace
	private val FileSystemWorkspace inputs = new FileSystemWorkspace('''initialModels/''',"")
	private val ViatraReasoner viatraSolver = new ViatraReasoner
	private var MetamodelLoader loader
	
	val Ecore2Logic ecore2Logic = new Ecore2Logic
	val Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic)
	val InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic
	
	
	public def runScenario(Scenario scenario) {
		init()
		initLoader(scenario.metamodel)
		val mm = loader.loadMetamodel()
		val vq = loader.loadQueries(mm)
		val ps = loader.loadPartialModel()
		
//		printHeader(scenario)
		
		if(scenario.constraints == Constraints.None) {
			
			mm.attributes.forEach[it.lowerBound = 0]
			mm.references.forEach[it.lowerBound = 0]
			mm.references.removeAll(vq.derivedFeatures.values)
			mm.attributes.removeAll(vq.derivedFeatures.values)
			for(run : 1..scenario.runs) {
				runCase(run==1,"noConstraints"+run,scenario,mm,new ViatraQuerySetDescriptor(vq.patterns,emptySet,emptyMap),ps)
			}
		} else {
			
		}
		
		
	}
	
//	private def printHeader(Scenario scenario) {
//		print("id;Solution type (ms);Transformation time (ms);Solver time (ms);")
//		(1..scenario.number).forEach[print("sol"+it+" (nano);")]
//		print("TransformationExecutionTime (ms);TypeAnalysisTime (ms);StateCoderTime (ms);SolutionCopyTime (ms);")
//		print("SolutionDiversityCheckTime (ms);SolutionDiversitySuccessRate (%);")
//		println("save")
//	}
	
	private def runCase(boolean first, String id, Scenario scenario, EcoreMetamodelDescriptor mm, ViatraQuerySetDescriptor vq, List<EObject> partialModel) {
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
		val solution = viatraSolver.solve(problem,config,workspace)
		printStatistics(solution,scenario,workspace,id,first)
		
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
			new YakinduLoader(inputs)
		} else throw new IllegalArgumentException('''Unknown domain: «metamodel»''')
	}
	
	def private getSolverConfiguration(Scenario scenario, ViatraQuerySetDescriptor vq) {
		val viatraConfig = new ViatraReasonerConfiguration => [
			it.runtimeLimit = 300
			it.typeScopes.maxNewElements = scenario.size
			it.typeScopes.minNewElements = scenario.size
			it.solutionScope.numberOfRequiredSolution = scenario.number
			it.existingQueries = vq.patterns.map[it.internalQueryRepresentation]
			it.nameNewElements = false
			it.typeInferenceMethod = TypeInferenceMethod.PreliminaryAnalysis
			it.additionalGlobalConstraints += loader.additionalConstraints
			it.stateCoderStrategy = StateCoderStrategy::Neighbourhood
			if(scenario.statecoder != StateCoder::ID) {
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
	}
	
	def printStatistics(LogicResult solution, Scenario scenario, FileSystemWorkspace workspace, String id, boolean printHeader) {
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
		
		if(solution instanceof ModelResult) {
			val representations = solution.representation
			for(representationIndex : 0..<representations.size) {
				val representation = representations.get(representationIndex)
				val representationNumber = representationIndex + 1
				if(representation instanceof PartialInterpretation) {
					workspace.writeModel(representation, '''solution«representationNumber».partialinterpretation''')
				} else {
					workspace.writeText('''solution«representationNumber».txt''',representation.toString)
				}
			}
			println('''saved''')
		} else {
			println('''notsaved''')
		}
	}
}

class DiverseMeasurementRunner {
	def static void main(String[] args) {
		val scenario = new Scenario(50,50,Metamodel::Yakindu,Constraints.None,StateCoder.ID,12)
		val scenarioRunner = new ScenarioRunner
		scenarioRunner.runScenario(scenario)
	}
}