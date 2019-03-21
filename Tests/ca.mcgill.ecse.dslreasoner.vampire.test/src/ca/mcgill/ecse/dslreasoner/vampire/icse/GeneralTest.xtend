package ca.mcgill.ecse.dslreasoner.vampire.icse

import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolver
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolverConfiguration
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguageFactory
import functionalarchitecture.Function
import functionalarchitecture.FunctionalInterface
import functionalarchitecture.FunctionalOutput
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasoner
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import java.util.HashMap
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
import org.eclipse.viatra.query.runtime.api.IQueryGroup
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel

class GeneralTest {
	def static String createAndSolveProblem(EcoreMetamodelDescriptor metamodel, List<EObject> partialModel,
		ViatraQuerySetDescriptor queries, FileSystemWorkspace workspace) {
		val extension VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE
		val Ecore2Logic ecore2Logic = new Ecore2Logic
		val Logic2Ecore logic2Ecore = new Logic2Ecore(ecore2Logic)
		val Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic)
		val InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic

		val modelGenerationProblem = ecore2Logic.transformMetamodel(metamodel, new Ecore2LogicConfiguration())
		var problem = modelGenerationProblem.output
//		problem = instanceModel2Logic.transform(modelGenerationProblem, partialModel).output
//		problem = viatra2Logic.transformQueries(queries, modelGenerationProblem, new Viatra2LogicConfiguration).output
		workspace.writeModel(problem, "Fam.logicproblem")

		println("Problem created")

		var LogicResult solution
		var LogicReasoner reasoner

		// *
		reasoner = new VampireSolver

		// Setting up scope
		val typeMapMin = new HashMap<Type, Integer>
		val typeMapMax = new HashMap<Type, Integer>
		val list2MapMin = metamodel.classes.toMap[s|s.name]
		val list2MapMax = metamodel.classes.toMap[s|s.name]

		// Minimum Scope
		typeMapMin.put(ecore2Logic.TypeofEClass(modelGenerationProblem.trace, 
			list2MapMin.get(Function.simpleName)
		), 1)
		typeMapMin.put(ecore2Logic.TypeofEClass(modelGenerationProblem.trace, 
			list2MapMin.get(FunctionalInterface.simpleName)
		), 2)
		typeMapMin.put(ecore2Logic.TypeofEClass(modelGenerationProblem.trace, 
			list2MapMin.get(FunctionalOutput.simpleName)
		), 3)

		// Maximum Scope
		typeMapMax.put(ecore2Logic.TypeofEClass(
			modelGenerationProblem.trace,
			list2MapMax.get(Function.simpleName)
		), 5)
		typeMapMax.put(ecore2Logic.TypeofEClass(
			modelGenerationProblem.trace,
			list2MapMax.get(FunctionalInterface.simpleName)
		), 2)
		typeMapMax.put(ecore2Logic.TypeofEClass(
			modelGenerationProblem.trace,
			list2MapMax.get(FunctionalOutput.simpleName)
		), 4)

		// Configuration
		val vampireConfig = new VampireSolverConfiguration => [
			// add configuration things, in config file first
			it.documentationLevel = DocumentationLevel::FULL
			it.typeScopes.minNewElements = 6
			it.typeScopes.maxNewElements = 40
			it.typeScopes.minNewElementsByType = typeMapMin
			it.typeScopes.maxNewElementsByType = typeMapMax
		]
		solution = reasoner.solve(problem, vampireConfig, workspace)

		/*/
		 * 
		 * reasoner = new AlloySolver
		 * val alloyConfig = new AlloySolverConfiguration => [
		 * 	it.typeScopes.maxNewElements = 7
		 * 	it.typeScopes.minNewElements = 3
		 * 	it.solutionScope.numberOfRequiredSolution = 1
		 * 	it.typeScopes.maxNewIntegers = 0
		 * 	it.documentationLevel = DocumentationLevel::NORMAL
		 * ]
		 * solution = reasoner.solve(problem, alloyConfig, workspace)
		 //*/
		println("Problem solved")
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
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
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
