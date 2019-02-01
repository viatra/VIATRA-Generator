package ca.mcgill.ecse.dslreasoner.vampire.test

import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolver
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolverConfiguration
import functionalarchitecture.FunctionalarchitecturePackage
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasoner
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import java.util.List
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class DslTest {
	def static void main(String[] args) {
		val inputs = new FileSystemWorkspace('''initialModels/''', "")
		val workspace = new FileSystemWorkspace('''outputDslModels/''', "")
		workspace.initAndClear

		println("Input and output workspaces are created")

		val metamodel = loadMetamodel()
		val partialModel = loadPartialModel(inputs)
//		val queries = loadQueries(metamodel)

		println("DSL loaded")
		
		val Ecore2Logic ecore2Logic = new Ecore2Logic
		val Logic2Ecore logic2Ecore = new Logic2Ecore(ecore2Logic)
		val Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic)
		val InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic
		
		val modelGenerationProblem = ecore2Logic.transformMetamodel(metamodel,new Ecore2LogicConfiguration())
//		val modelExtensionProblem = instanceModel2Logic.transform(modelGenerationProblem,partialModel)
//		val validModelExtensionProblem = viatra2Logic.transformQueries(queries,modelGenerationProblem,new Viatra2LogicConfiguration)
		
		val logicProblem = modelGenerationProblem.output
//		val logicProblem = modelExtensionProblem.output
//		val logicProblem = validModelExtensionProblem.output
		
		
		println("Problem created")
		
		var LogicResult solution
		var LogicReasoner reasoner
		//*
		reasoner = new VampireSolver
		val vampireConfig = new VampireSolverConfiguration => [
			//add configuration things, in config file first
			it.writeToFile = false
		]
		
		solution = reasoner.solve(logicProblem, vampireConfig,	workspace)
		
		println("Problem solved")
		
		
	}

	def private static loadMetamodel() {
		//FAM
		val pckg = FunctionalarchitecturePackage.eINSTANCE
		val List<EClass> classes = pckg.EClassifiers.filter(EClass).toList
		val List<EEnum> enums = pckg.EClassifiers.filter(EEnum).toList
		val List<EEnumLiteral> literals = enums.map[getELiterals].flatten.toList
		val List<EReference> references = classes.map[getEReferences].flatten.toList
		val List<EAttribute> attributes = classes.map[getEAttributes].flatten.toList
		return new EcoreMetamodelDescriptor(classes,#{},false,enums,literals,references,attributes)
	}

	def private static loadPartialModel(ReasonerWorkspace inputs) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		inputs.readModel(EObject,"FunctionalArchitectureModel.xmi").eResource.allContents.toList
//		inputs.readModel(EObject,"FAM.xmi").eResource.allContents.toList
	}

//	def private static loadQueries(EcoreMetamodelDescriptor metamodel) {
//		val i = hu.bme.mit.inf.dslreasoner.domains.transima.fam.patterns.Pattern.instance
//		val patterns = i.specifications.toList
//		val wfPatterns = patterns.filter[it.allAnnotations.exists[it.name== "Constraint"]].toSet
//		val derivedFeatures = new LinkedHashMap
//		derivedFeatures.put(i.type,metamodel.attributes.filter[it.name == "type"].head)
//		derivedFeatures.put(i.model,metamodel.references.filter[it.name == "model"].head)
//		val res = new ViatraQuerySetDescriptor(
//			patterns,
//			wfPatterns,
//			derivedFeatures
//		)
//		return res
//	}
}
