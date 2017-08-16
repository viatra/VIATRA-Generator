package hu.bme.mit.inf.dslreasoner.run

import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.AlloySolver
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.AlloySolverConfiguration
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult
import hu.bme.mit.inf.dslreasoner.logic.model.statistics.StatisticSections2Print
import hu.bme.mit.inf.dslreasoner.smt.reasoner.SMTSolver
import hu.bme.mit.inf.dslreasoner.smt.reasoner.SmtSolverConfiguration
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeInferenceMethod
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.DiversityDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.StateCoderStrategy
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasoner
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.junit.Test

enum UseSolver{Viatra, Smt, ViatraWithSmt, Alloy}
enum Domain{FAM, Yakindu}
enum Diversity{No, Diverse}

class RunMeasurements {
	val String id
	
	new(String id) {
		this.id = id
		inputs = new FileSystemWorkspace('''initialModels/''',"")
		workspace = new FileSystemWorkspace('''output_«id»/''',"")
	}
	
	// Workspace
	val FileSystemWorkspace inputs
	val FileSystemWorkspace workspace
	
	// Mappers
	val Ecore2Logic ecore2Logic = new Ecore2Logic
	val Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic)
	val InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic
	
	// Solvers
	val SMTSolver smtSolver = new SMTSolver
	val ViatraReasoner viatraSolver = new ViatraReasoner
	val ViatraReasoner viatraWithSmtSolver = new ViatraReasoner
	val AlloySolver alloyReasoner = new AlloySolver
	
	def  dslLoader(Domain dsl) {
		if(dsl == Domain::FAM) {
			return new FAMLoader(inputs)
		} else if(dsl == Domain::Yakindu) {
			return new YakinduLoader(inputs)
		} else throw new IllegalArgumentException('''Unknown domain: «dsl»''')
	}
	def static init() {
		LogiclanguagePackage.eINSTANCE.class
		LogicproblemPackage.eINSTANCE.class
		PartialinterpretationPackage.eINSTANCE.class
		Ecore2logicannotationsPackage.eINSTANCE.class
		Viatra2LogicAnnotationsPackage.eINSTANCE.class
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("ecore",new XMIResourceFactoryImpl)
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("logicproblem",new XMIResourceFactoryImpl)
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("partialinterpretation",new XMIResourceFactoryImpl)
	}
	
	def transformMMtoLogic(EcoreMetamodelDescriptor mm) {
		ecore2Logic.transformMetamodel(mm,new Ecore2LogicConfiguration())
	}
	def transformPSToLogic(List<EObject> objects, TracedOutput<LogicProblem, Ecore2Logic_Trace> metamodelProblem) {
		instanceModel2Logic.transform(metamodelProblem,objects)
	}
	def transformQueriesToLogic(ViatraQuerySetDescriptor descriptor, TracedOutput<LogicProblem, Ecore2Logic_Trace> metamodelProblem) {
		viatra2Logic.transformQueries(descriptor,metamodelProblem,new Viatra2LogicConfiguration)
	}
	def transformDiversity(MetamodelLoader dsl, Ecore2Logic_Trace trace, EcoreMetamodelDescriptor descriptor) {
		if(diverse) {
			val relevantClasses = dsl.getRelevantTypes(descriptor)
			val relevantReferences = dsl.getRelevantReferences(descriptor)
			val relevantTypes = relevantClasses.map[this.ecore2Logic.TypeofEClass(trace,it) as TypeDeclaration].toSet
			val relevantRelations = relevantReferences.map[this.ecore2Logic.relationOfReference(trace,it) as RelationDeclaration].toSet
			return new DiversityDescriptor => [
				it.relevantTypes = relevantTypes
				it.relevantRelations = relevantRelations
				it.maxNumber = 2
				it.range = 2
				it.parallels = 2
			]
		} else {
			return null
		}		
	}
	
	def executeSolver(
		LogicProblem problem,
		ViatraQuerySetDescriptor vq,
		MetamodelLoader loader,
		DiversityDescriptor diversityRequirement,
		int size)
	{
		if(solver == UseSolver.Smt) {
			val smtConfig = new SmtSolverConfiguration() => [
				it.typeScopes.maxNewElements = size
				it.typeScopes.minNewElements = size
				it.solutionScope.numberOfRequiredSolution = number
				it.solverPath = '''"D:/Programs/Z3/4.3/z3.exe"'''
			]
			val solution = this.smtSolver.solve(
				problem,
				smtConfig,
				this.workspace
			)
			return solution
		} if(solver==UseSolver::Alloy) {
			val alloyConfig = new AlloySolverConfiguration => [
				it.typeScopes.maxNewElements = size
				it.typeScopes.minNewElements = size
				it.solutionScope.numberOfRequiredSolution = number
				it.typeScopes.maxNewIntegers = 0
				it.writeToFile = true
			]
			val solution = this.alloyReasoner.solve(
				problem,
				alloyConfig,
				this.workspace
			)
			return solution
		} else {
			val viatraConfig = new ViatraReasonerConfiguration => [
				it.runtimeLimit = 20
				it.typeScopes.maxNewElements = size
				it.typeScopes.minNewElements = size
				it.solutionScope.numberOfRequiredSolution = number
				it.existingQueries = vq.patterns.map[it.internalQueryRepresentation]
				it.nameNewElements = false
				it.typeInferenceMethod = TypeInferenceMethod.PreliminaryAnalysis
				it.searchSpaceConstraints.additionalGlobalConstraints += loader.additionalConstraints
				it.stateCoderStrategy = StateCoderStrategy::Neighbourhood
			]
			viatraConfig.diversityRequirement = diversityRequirement
			if (solver == UseSolver.Viatra) {
				val solution = this.viatraSolver.solve(
					problem,
					viatraConfig,
					this.workspace
				)
				return solution
			} else if(solver == UseSolver.ViatraWithSmt) {
				val inconsistency = new SmtSolverConfiguration() => [
					it.solverPath = '''"D:/Programs/Z3/4.3/z3.exe"'''
					it.runtimeLimit = 10
				]
				val solution = this.viatraWithSmtSolver.solve(
					problem,
					viatraConfig =>[
						it.internalConsistencyCheckerConfiguration.internalIncosnsitencyDetector = smtSolver
						it.internalConsistencyCheckerConfiguration.internalInconsistencDetectorConfiguration = inconsistency
					],
					this.workspace
				)
				return solution
			}
		}
	}
	
	@Test
	def runAsTest() {
		main(#[])
	}
	
	static val monitoring = false
	static val clean = false
	static val domain = Domain::Yakindu
	static val solver = UseSolver::Viatra
	static val diverse = true
	static val wf = false
	public static var sizes =  #[50]
	static var int number = 3
	
	def static void waitForEnter() {
		if(monitoring) {
			println('''  Press ENTER to continue''')
			(new BufferedReader(new InputStreamReader(System.in))).readLine
		}
	}
	
	def static runMeasure(String id, int size) {
		val r = new RunMeasurements(id)
		r.workspace.initAndClear
		init
		//println("- init")
		val dsl = r.dslLoader(domain)
		val mm = dsl.loadMetamodel()
		val vq = dsl.loadQueries(mm)
		//println("- Queries loaded")
		
		if(!wf) {
			mm.attributes.forEach[it.lowerBound = 0]
			mm.references.forEach[it.lowerBound = 0]
			mm.references.removeAll(vq.derivedFeatures.values)
			mm.attributes.removeAll(vq.derivedFeatures.values)
		}
		
		val metamodelProblem = r.transformMMtoLogic(mm)
		r.transformPSToLogic(dsl.loadPartialModel,metamodelProblem)
		if(wf) {
			r.transformQueriesToLogic(vq,metamodelProblem)
		}
		val logicProblem = metamodelProblem.output
		
		//r.workspace.writeModel(logicProblem,"problem.logicproblem")
		//resSet.resources += viatraProblem.output.eResource
		val diversityRequirement = r.transformDiversity(dsl,metamodelProblem.trace,mm)
		
		//println("- DSL -> Logic problem transformation finished")
		
		waitForEnter
		
		val solution = r.executeSolver(logicProblem, vq, dsl, diversityRequirement, size)
		
		print(solution.class.simpleName+";");
		print(solution.statistics.transformationTime+";")
		print(solution.statistics.solverTime+";")
		print((new StatisticSections2Print).transformStatisticDatas2CSV(solution.statistics.entries))
		
		waitForEnter
		
		if(solution instanceof ModelResult) {
			val representations = solution.representation
			for(representationIndex : 0..<representations.size) {
				val representation = representations.get(representationIndex)
				val representationNumber = representationIndex + 1
				if(representation instanceof PartialInterpretation) {
					r.workspace.writeModel(representation, '''solution«representationNumber».partialinterpretation''')
				} else {
					r.workspace.writeText('''solution«representationNumber».txt''',representation.toString)
				}
			}
			println('''saved''')
		} else {
			val partial = logicProblem//.eContainer
			r.workspace.writeModel(partial, "solution.partialinterpretation")
			println('''saved''')
		}
	}
	
	def static void main(String[] args) {
		print("id;")
		(1..number).forEach[print("sol"+it+" (nano);")]
		print("Solution type (ms);Transformation time (ms);Solver time (ms);TransformationExecutionTime (ms);TypeAnalysisTime (ms);StateCoderTime (ms);SolutionCopyTime (ms);")
		if(diverse) {
			print("SolutionDiversityCheckTime (ms);SolutionDiversitySuccessRate (%);")
		}
		println("save")
		//val id = 50//args.get(0)
		for(size : sizes) {
			val run = (1..50).map['''r«it»''']
			for(runIndex : run) {
				val runID = runIndex+"_"+size
				print(runID + ";")
				
				try {
					runMeasure(runID,size)
				} catch(Exception e) {}
				
				System.gc System.gc System.gc
				Thread.sleep(2000)
			}
		}
		
	}
}