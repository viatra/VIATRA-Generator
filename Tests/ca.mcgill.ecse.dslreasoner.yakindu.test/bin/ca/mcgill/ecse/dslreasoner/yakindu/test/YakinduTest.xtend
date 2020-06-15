package ca.mcgill.ecse.dslreasoner.yakindu.test

import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicProblemBuilder
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicStructureBuilder
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasoner
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import java.util.LinkedList
import java.util.List
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import hu.bme.mit.inf.dslreasoner.logic.model.builder.SolutionScope

class YakinduTest {

	static String inWS = "input"
	static String outWS = "output"
	static String imName = "Yakindu.xmi"

	def static void main(String[] args) {
		val Ecore2Logic ecore2Logic = new Ecore2Logic
		val Logic2Ecore logic2Ecore = new Logic2Ecore(ecore2Logic)
		val Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic)
		val InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic

		// Workspace setup
		val inputs = new FileSystemWorkspace(inWS + '''/''', "")
		val workspace = new FileSystemWorkspace(outWS + '''/''', "")
		workspace.initAndClear

		// Logicproblem writing setup
		val reg = Resource.Factory.Registry.INSTANCE
		val map = reg.extensionToFactoryMap
		map.put("logicproblem", new XMIResourceFactoryImpl)

		println("Input and output workspaces are created")

		//loading the modeling environment
		val metamodel = loadMetamodel(YakindummPackage.eINSTANCE) // TODO
		val partialModel = loadPartialModel(inputs, imName)
//		val queries = loadQueries(metamodel, Patterns.instance)
		val modelGenerationProblem = ecore2Logic.transformMetamodel(metamodel, new Ecore2LogicConfiguration())
		var modelExtensionProblem = instanceModel2Logic.transform(modelGenerationProblem, partialModel)
//		var validModelExtensionProblem = viatra2Logic.transformQueries(queries, modelExtensionProblem, new Viatra2LogicConfiguration)
		var problem = modelExtensionProblem.output
		
		println("Modelling environment Loaded")
		

		val ss = new SolutionScope()
		ss.numberOfRequiredSolution = 5
		
		var reasoner = new ViatraReasoner
		val vampireConfig = new ViatraReasonerConfiguration => [
			// add configuration things, in config file first
//			it.documentationLevel = DocumentationLevel::FULL
			it.solutionScope = ss
			it.typeScopes.maxNewElements = 10
			it.typeScopes.minNewElements = 5
		]
		
		println("Problem Ready")

		var LogicResult solution = reasoner.solve(problem, vampireConfig, workspace)
		
		println("Problem solved")
		
		val interpretations = reasoner.getInterpretations(solution as ModelResult)
		val models = new LinkedList
		for (interpretation : interpretations) {
//			val extension b = new LogicStructureBuilder
//			val extension a = new LogicProblemBuilder

			val instanceModel = logic2Ecore.transformInterpretation(interpretation, modelGenerationProblem.trace)
			models += instanceModel
		}

		solution.writeSolution(workspace, models)
//				print((solution as ModelResult).representation.get(0))
//				val soln = ((solution as ModelResult).representation.get(0) as VampireModel)
//				println(soln.confirmations)
//				println((solution as ModelResult).representation)
//				modelFound = !soln.confirmations.filter [
//					class == VLSFiniteModelImpl
//				].isEmpty
	}

//	def static Map<Type, Integer> getTypeMap(Map<Class, Integer> classMap, EcoreMetamodelDescriptor metamodel,
//		Ecore2Logic e2l, Ecore2Logic_Trace trace) {
//		val typeMap = new HashMap<Type, Integer>
//		val listMap = metamodel.classes.toMap[s|s.name]
//
//		for (Class  elem : classMap.keySet) {
//			typeMap.put(e2l.TypeofEClass(
//				trace,
//				listMap.get(elem.simpleName)
//			), classMap.get(elem))
//		}
//		return typeMap
//	}
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

//	def static loadQueries(EcoreMetamodelDescriptor metamodel, IQueryGroup i) {
//		val patterns = i.specifications.toList
//		val wfPatterns = patterns.filter[it.allAnnotations.exists[it.name == "Constraint"]].toSet
//		val derivedFeatures = emptyMap
//		// NO DERIVED FEATURES
////		val derivedFeatures = new LinkedHashMap
////		derivedFeatures.put(i.type,metamodel.attributes.filter[it.name == "type"].head)
////		derivedFeatures.put(i.model,metamodel.references.filter[it.name == "model"].head)
//		val res = new ViatraQuerySetDescriptor(
//			patterns,
//			wfPatterns,
//			derivedFeatures
//		)
//		return res
//	}

def static writeSolution(LogicResult solution, ReasonerWorkspace workspace, List<EObject> models) {
		if(solution instanceof ModelResult) {
			val representations = solution.representation
			
			for(representationIndex : 0..<representations.size) {
				val representation = representations.get(representationIndex)
				val representationNumber = representationIndex + 1
				if(representation instanceof PartialInterpretation) {
//					workspace.writeModel(representation, '''solution«representationNumber».partialinterpretation''')
					val partialInterpretation2GML = new PartialInterpretation2Gml
					val gml = partialInterpretation2GML.transform(representation)
						//ecore2GML.transform(root)
						workspace.writeText('''solution«representationNumber»Visualisation.gml''',gml)
						
				} else {
					workspace.writeText('''solution«representationNumber».txt''',representation.toString)
				}
			}
			
			for(modelIndex : 0..<models.size) {
				val model = models.get(modelIndex)
				val representationNumber = modelIndex + 1
				workspace.writeModel(model,'''model«representationNumber».xmi''')
			}
			println("Solution saved and visualised")
		} 
	}
}
