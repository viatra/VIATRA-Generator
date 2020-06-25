package hu.bme.mit.inf.dslreasoner.run

import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.AlloySolver
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.AlloySolverConfiguration
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.Statechart
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage
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
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.DiversityDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.StateCoderStrategy
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasoner
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration
import hu.bme.mit.inf.dslreasoner.visualisation.pi2graphviz.GraphvizVisualiser
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.ArrayList
import java.util.Collections
import java.util.LinkedList
import java.util.List
import java.util.Random
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope

enum PartialModelSource { Homeworks, Random }
enum ValidationTechique {Alloy, Viatra}

class RunModelExtensionMeasurements {
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
			return new YakinduLoader(inputs) =>[it.useSynchronization = false useComplexStates = true]
		} else if(dsl == Domain::FileSystem){
			return new FileSystemLoader(inputs)
		} else if(dsl == Domain::Ecore) {
			return new EcoreLoader(inputs)
		}else throw new IllegalArgumentException('''Unknown domain: «dsl»''')
	}
	def static init() {
		LogiclanguagePackage.eINSTANCE.class
		LogicproblemPackage.eINSTANCE.class
		PartialinterpretationPackage.eINSTANCE.class
		Ecore2logicannotationsPackage.eINSTANCE.class
		Viatra2LogicAnnotationsPackage.eINSTANCE.class
		YakindummPackage.eINSTANCE.class
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("*",new XMIResourceFactoryImpl)
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
	
	def executeSolver(
		LogicProblem problem,
		ViatraQuerySetDescriptor vq,
		MetamodelLoader loader,
		DiversityDescriptor diversityRequirement,
		int size,
		UseSolver solver)
	{
		if(solver == UseSolver.Smt) {
			val smtConfig = new SmtSolverConfiguration() => [
				it.typeScopes.maxNewElements = size
				it.typeScopes.minNewElements = size
				it.solutionScope.numberOfRequiredSolutions = 1
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
				it.solutionScope.numberOfRequiredSolutions = 1
				it.typeScopes.maxNewIntegers = 0
			]
			val solution = this.alloyReasoner.solve(
				problem,
				alloyConfig,
				this.workspace
			)
			return solution
		} else {
			val viatraConfig = new ViatraReasonerConfiguration => [
				it.runtimeLimit = 400
				it.typeScopes.maxNewElements = size
				it.typeScopes.minNewElements = size
				it.solutionScope.numberOfRequiredSolutions = 1
				it.nameNewElements = false
				it.typeInferenceMethod = TypeInferenceMethod.PreliminaryAnalysis
				it.searchSpaceConstraints.additionalGlobalConstraints += loader.additionalConstraints
				it.stateCoderStrategy = StateCoderStrategy::Neighbourhood
				it.debugConfiguration.partalInterpretationVisualisationFrequency = 100
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
	
	def public static loadPartialModels(int size, int max) {
		if(partialModelSource === PartialModelSource::Homeworks) {
			val hfs = new FileSystemWorkspace("D:/Eclipse/GIT/RemoHF/Extracted/output","")
			val allFileNames = hfs.allFiles.toList
			
			
			val models = allFileNames.map[hfs.readModel(Statechart,it)]
			//println("loaded")
			val filtered = if(size===-1) {
					models
				} else {
					models.filter[it.eAllContents.size + 1 >= size].toList
				}
			//println("filtered")
			
			val selected = if(max!==-1) {
					Collections.shuffle(filtered);
					filtered.subList(0,max)
				} else {
					filtered
				}
			//println("selected "+ selected.size)
			val collected = selected.map[
				val r = new LinkedList
				r.add(it)
				r.addAll(it.eAllContents.toIterable)
				return r
			].toList
			//println("collected to lists")
			
			val list = new ArrayList(collected.size)
			for(s : collected) {
				list.add(s.prune(size))
			}
			//println("pruned to " + size)
			
			return list
		} else if(partialModelSource === PartialModelSource::Random) {
			
		}
	}
	
	static val Random pruningRandom = new Random(0)
//	def private void prune(EObject root, int targetSize) {
//		var size = root.eAllContents.size + 1
//		while(size>targetSize) {
//			val leafs = root.eAllContents.filter[it.eContents.empty].toList
//			val leafToRemove = leafs.get(pruningRandom.nextInt(leafs.size))
//			EcoreUtil.delete(leafToRemove)
//			size--
//		}
//	}
	def static private prune(List<EObject> objects, int targetSize) {
		if(targetSize !== -1) {
			var size = objects.size
			while(size>targetSize) {
				val leafs = objects.filter[!it.eAllContents.toList.exists[child | objects.contains(child)]].toList
				if(leafs.exists[it instanceof Statechart]) {
					println("Gebasz!")
				}
				objects.remove(leafs.get(pruningRandom.nextInt(leafs.size)))
				size--
			}
			if(!objects.exists[it instanceof Statechart]) {
				println("Gebasz2!")
			}
			
		}
		return objects;
	}
	
	static val partialModelSource = PartialModelSource::Homeworks
	static val monitoring = false
	static val clean = true
	public static var sizes =  #[-1/*,5,10,15,20,25,30,35,40,45,50*/]
	
	def static void waitForEnter() {
		if(monitoring) {
			println('''  Press ENTER to continue''')
			(new BufferedReader(new InputStreamReader(System.in))).readLine
		}
	}
	
	def static runMeasure(String id, int size){
		init
		
		val partialModels = loadPartialModels(size,-1)
		var pmIndex = 1
		
		for(partialModel : partialModels) {
			
			val pmID = id+"_"+(pmIndex++)
			val r = new RunModelExtensionMeasurements(pmID)
			r.workspace.initAndClear
			print(pmID + ";")
			print(partialModel.size + ";")
			//println("- init")
			val dsl = r.dslLoader(Domain::Yakindu)
			val mm = dsl.loadMetamodel()
			val vq = dsl.loadQueries(mm)
			//println("- Queries loaded")
			
			val metamodelProblem = r.transformMMtoLogic(mm)
			r.transformPSToLogic(partialModel,metamodelProblem)
			r.transformQueriesToLogic(vq,metamodelProblem)
			val logicProblem = metamodelProblem.output
			
			//println("- DSL -> Logic problem transformation finished")
			
			waitForEnter
			
			val ValidationTechique validationTechnique = ValidationTechique::Viatra
			if(validationTechnique === ValidationTechique::Alloy) {
				val solution = r.executeSolver(logicProblem, vq, dsl, null, 0, UseSolver::Alloy)
				
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
							val partialInterpretation2GML = new PartialInterpretation2Gml
							val gml = partialInterpretation2GML.transform(representation)
							r.workspace.writeText('''solution«representationNumber».gml''',gml)
							if(representation.newElements.size <160) {
								val visualiser = new GraphvizVisualiser
								val visualisation = visualiser.visualiseConcretization(representation)
								visualisation.writeToFile(r.workspace,'''solution«representationNumber»''')
							}
		
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
			} else if(validationTechnique === ValidationTechique::Viatra) {
				val validationPatterns = vq.validationPatterns
				val resource = partialModel.head.eResource
				
				val startTime = System.currentTimeMillis
				val ViatraQueryEngine engine = ViatraQueryEngine.on(new EMFScope(resource) )
				val matchers = new ArrayList(validationPatterns.size)
				val validationResult = new ArrayList(validationPatterns.size)
				for(validationPattern : validationPatterns) {
					val matcher = validationPattern.getMatcher(engine)
					matchers += matcher
					validationResult += matcher.hasMatch
				}
				val finishTime = System.currentTimeMillis-startTime
				
				print(finishTime + ";")
				print(!validationResult.exists[it] + ";")
				for(patternResult : validationResult) {
					print(patternResult + ";")
				}
				println
			}
			
			System.gc System.gc System.gc
			Thread.sleep(2000)			
		}
	}
	
	def static void main(String[] args) {
		//val id = 50//args.get(0)
		for(size : sizes) {
			val run = (1..1).map['''r«it»''']
			for(runIndex : run) {
				val runID = runIndex+"_"+size
				
				
				try {
					runMeasure(runID,size)
				} catch(Exception e) {e.printStackTrace}
				
				System.gc System.gc System.gc
				Thread.sleep(2000)
			}
		}
		
	}
}