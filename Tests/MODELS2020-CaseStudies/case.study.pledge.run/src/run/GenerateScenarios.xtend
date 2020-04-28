package run

import Taxation.TaxationPackage
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasoner
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration
import hu.bme.mit.inf.dslreasoner.visualisation.pi2graphviz.GraphvizVisualiser
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import java.math.BigDecimal
import java.text.SimpleDateFormat
import java.util.Date
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.TreeSet
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup
import org.eclipse.viatra.query.runtime.api.IQueryGroup
import org.eclipse.viatra.query.runtime.rete.matcher.ReteEngine
import queries.Case_study_A

class GenerateScenarios {
	def static void main(String[] args) {
		val x = (new EMFPatternLanguageStandaloneSetup).createInjectorAndDoEMFRegistration
//		//PatternLanguageWithRSSetup.createInjectorAndDoEMFRegistration
//		ApplicationConfigurationStandaloneSetup.doSetup
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl)
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("logicproblem", new XMIResourceFactoryImpl)
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("partialmodel", new XMIResourceFactoryImpl)
		ReteEngine.getClass

		val Ecore2Logic ecore2Logic = new Ecore2Logic
		val Logic2Ecore logic2Ecore = new Logic2Ecore(ecore2Logic)
		val Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic)
		val InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic
		
		// Workspace setup
		val Date date = new Date(System.currentTimeMillis)
		val SimpleDateFormat format = new SimpleDateFormat("dd-HHmm");
		val formattedDate = format.format(date)

		val inputs = new FileSystemWorkspace('''inputs/''', "")
		val workspace = new FileSystemWorkspace('''output/''' + formattedDate + '''/''', "")
		workspace.initAndClear

		println("Input and output workspaces are created")

//		print(TaxationPackage.eINSTANCE.getEClassifiers.filter(EClass).toList.get(0))
		
		//*
		val metamodel = loadMetamodel(TaxationPackage.eINSTANCE)
		val partialModel = loadPartialModel(inputs, "Household.xmi")
		val queries = loadQueries(metamodel, Case_study_A.instance)
		/*/
		val metamodel = loadMetamodel(FamilytreePackage.eINSTANCE)
//		val partialModel = loadPartialModel(inputs, "yakindu/Yakindu.xmi")
		val queries = loadQueries(metamodel, FamilyTreeConstraints.instance)
		//*/
		println("DSL loaded")

		val SIZE = 10
		var REPS = 1
		val RUNTIME = 600
	
		// /////////////////////////
		// Prepare Problem
		val modelGenerationProblem = ecore2Logic.transformMetamodel(metamodel, new Ecore2LogicConfiguration())
		var problem = modelGenerationProblem.output
		
//		val modelExtensionProblem = instanceModel2Logic.transform(modelGenerationProblem, partialModel)
//		problem = modelExtensionProblem.output
		
		val validModelExtensionProblem = viatra2Logic.transformQueries(queries, modelGenerationProblem,
			new Viatra2LogicConfiguration)
		problem = validModelExtensionProblem.output

		workspace.writeModel(problem, "problem.logicproblem")
		println("Problem created")

		for (var i = 0; i < REPS; i++) {

			println("Run #" + i + ":")

			var ViatraReasoner reasoner = new ViatraReasoner

			// /////////////////////////////////////////////////////
			// Define Config File	
			val knownIntegers = new TreeSet<Integer>
			knownIntegers.addAll(0)
			
			val knownReals = new TreeSet<BigDecimal>
			knownReals.addAll(new BigDecimal("0.0"))

			val knownStrings = new TreeSet<String>
			knownStrings.addAll("r0", "r1", "r2")
			
			
			val solverConfig = new ViatraReasonerConfiguration => [
				it.runtimeLimit = RUNTIME
				it.typeScopes.maxNewElements = SIZE
//				it.typeScopes.minNewElements = SIZE
				if(!knownIntegers.isEmpty) it.typeScopes.knownIntegers = knownIntegers
				if(!knownReals.isEmpty) it.typeScopes.knownReals = knownReals
//				if(!knownStrings.isEmpty) it.typeScopes.knownStrings = knownStrings
			]
			
			val startTime = System.currentTimeMillis
			var solution = reasoner.solve(problem, solverConfig, workspace)
			val totalTime = System.currentTimeMillis-startTime
			
			println("  Problem Solved")
			solution.writeStats(totalTime)

			if (solution instanceof ModelResult) {
				solution.writeRepresentation(workspace, i)
//				solution.writeInterpretation(logic2Ecore, workspace, i, reasoner, modelGenerationProblem)
				println("  Solution saved and visualised")
			} else
				println("  Returned: " + solution.class.simpleName.toString)


//			println("Stats Created")
			// Run Garbage Collector
			val Runtime r = Runtime.getRuntime();
			r.gc();
			r.gc();
			r.gc();
			Thread.sleep(3000)
		}
		println("---End---")

	}

	def static Map<Type, Integer> getTypeMap(Map<Class, Integer> classMap, EcoreMetamodelDescriptor metamodel,
		Ecore2Logic e2l, Ecore2Logic_Trace trace) {
		val typeMap = new HashMap<Type, Integer>
		val listMap = metamodel.classes.toMap[s|s.name]

		for (Class  elem : classMap.keySet) {
			typeMap.put(e2l.TypeofEClass(
				trace,
				listMap.get(elem.simpleName)
			), classMap.get(elem))
		}
		return typeMap
	}

	def static loadMetamodel(EPackage pckg) {
		val List<EClass> classes = pckg.getEClassifiers.filter(EClass).toList
		val List<EEnum> enums = pckg.getEClassifiers.filter(EEnum).toList
		val List<EEnumLiteral> literals = enums.map[getELiterals].flatten.toList
		val List<EReference> references = classes.map[getEReferences].flatten.toList
		val List<EAttribute> attributes = classes.map[getEAttributes].flatten.toList
		return new EcoreMetamodelDescriptor(classes, #{}, false, enums, literals, references, attributes)
	}

	def static loadPartialModel(ReasonerWorkspace inputs, String path) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl())
		inputs.readModel(EObject, path).eResource.contents
//		inputs.readModel(EObject,"FamInstance.xmi").eResource.allContents.toList
	}

	def static loadQueries(EcoreMetamodelDescriptor metamodel, IQueryGroup i) {
		val patterns = i.specifications.toList
		val wfPatterns = patterns.filter[it.allAnnotations.exists[it.name == "Constraint"]].toSet
		val derivedFeatures = emptyMap
		// NO DERIVED FEATURES
//		val derivedFeatures = new LinkedHashMap
//		derivedFeatures.put(i.type,metamodel.attributes.filter[it.name == "type"].head)
//		derivedFeatures.put(i.model,metamodel.references.filter[it.name == "model"].head)
		val res = new ViatraQuerySetDescriptor(
			patterns,
			wfPatterns,
			derivedFeatures
		)
		return res
	}

	def static writeInterpretation(LogicResult solution, Logic2Ecore logic2Ecore, ReasonerWorkspace workspace, int i,
		ViatraReasoner reasoner, TracedOutput<LogicProblem, Ecore2Logic_Trace> mgProb) {
		val interpretations = reasoner.getInterpretations(solution as ModelResult)
		for (interpIndex : 0 ..< interpretations.size) {
//				val extension b = new LogicStructureBuilder
//				val extension a = new LogicProblemBuilder
			val interpretation = interpretations.get(interpIndex)
			val model = logic2Ecore.transformInterpretation(interpretation, mgProb.trace)
			workspace.writeModel(model, '''solution«i»_«interpIndex».xmi''')
		}
	}

	def static writeRepresentation(LogicResult solution, ReasonerWorkspace workspace, int i) {
		val representations = solution.representation
		for (representationIndex : 0 ..< representations.size) {
			val representation = representations.get(representationIndex)
			if (representation instanceof PartialInterpretation) {
				val gml = (new PartialInterpretation2Gml).transform(representation)
				workspace.writeText('''solution«i»_«representationIndex».gml''', gml)

				val png = (new GraphvizVisualiser).visualiseConcretization(representation)
				png.writeToFile(workspace, '''solution«i»_«representationIndex».png''')

//				workspace.writeModel(representation, '''solution«representationIndex».partialintrpretation''')
			} else {
				workspace.writeText('''solution«representationIndex».txt''', representation.toString)
			}
		}
	}

	def static writeStats(LogicResult solution, long time) {
		val stats = solution.statistics
		println("  Statistics:")
//		for (e : stats.entries.filter[name.substring(0, 9) == "_Solution"]) {
//			println("    " + e.name + ": " + (e as IntStatisticEntry).value + " ms")
//		}
		println("    \"solve\" time: " + time as double/1000 + " s")

//		println("<<End Statistics>>")
	}
}
