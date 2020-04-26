package run

import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl.ModelResultImpl
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasoner
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import java.io.PrintWriter
import java.text.SimpleDateFormat
import java.util.Date
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.viatra.query.runtime.api.IQueryGroup
import Taxation.TaxationPackage

class GenerateScenarios {
	def static void main(String[] args) {
		val Ecore2Logic ecore2Logic = new Ecore2Logic
//		val Logic2Ecore logic2Ecore = new Logic2Ecore(ecore2Logic)
//		val Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic)
//		val InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic
		// Workspace setup
		val Date date = new Date(System.currentTimeMillis)
		val SimpleDateFormat format = new SimpleDateFormat("dd-HHmm");
		val formattedDate = format.format(date)

		val workspace = new FileSystemWorkspace('''output/''' + formattedDate + '''/''', "")
		workspace.initAndClear

		// Logicproblem writing setup
		val reg = Resource.Factory.Registry.INSTANCE
		val map = reg.extensionToFactoryMap
		map.put("logicproblem", new XMIResourceFactoryImpl)

		println("Input and output workspaces are created")
		
		print(TaxationPackage.eINSTANCE.getEClassifiers.filter(EClass).toList.get(0))

		val metamodel = loadMetamodel(TaxationPackage.eINSTANCE)
//		val partialModel = loadPartialModel(inputs, "yakindu/Yakindu.xmi")
//		val queries = loadQueries(metamodel, Patterns.instance)
		println("DSL loaded")

		val SIZE = 10
		var REPS = 1

		val RUNTIME = 300

		val modelGenerationProblem = ecore2Logic.transformMetamodel(metamodel, new Ecore2LogicConfiguration())
//				var modelExtensionProblem = instanceModel2Logic.transform(modelGenerationProblem, partialModel)
//				var validModelExtensionProblem = viatra2Logic.transformQueries(queries, modelExtensionProblem,
//					new Viatra2LogicConfiguration)
		var problem = modelGenerationProblem.output
		workspace.writeModel(problem, "scenario.logicproblem")
		println("Problem created")
		
		for (var i = 0; i <= REPS; i++) {

			var ViatraReasoner reasoner = new ViatraReasoner

			// /////////////////////////////////////////////////////
			// Define Config File	
			val solverConfig = new ViatraReasonerConfiguration => [
				// add configuration things, in config file first
//						it.documentationLevel = DocumentationLevel::FULL
//						it.iteration = iter
				it.runtimeLimit = RUNTIME
				it.typeScopes.maxNewElements = SIZE
				it.typeScopes.minNewElements = SIZE
			]

			var solution = reasoner.solve(problem, solverConfig, workspace)
			print("Problem Solved")

			// Run Garbage Collector
			val Runtime r = Runtime.getRuntime();
			r.gc();
			r.gc();
			r.gc();
			Thread.sleep(3000)
		}

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

}
