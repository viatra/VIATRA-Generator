package hu.bme.mit.inf.dslreasoner.run

import functionalarchitecture.FunctionalarchitecturePackage
import hu.bme.mit.inf.dslreasoner.domains.alloyexamples.Filesystem.Model
import hu.bme.mit.inf.dslreasoner.domains.transima.fam.FamPatterns
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasoner
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
import java.util.LinkedHashMap
import java.util.LinkedList
import java.util.List
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup
import org.eclipse.viatra.query.runtime.rete.matcher.ReteEngine

class SimpleRun {
	
	def static void main(String[] args) {
		val inputs = new FileSystemWorkspace('''initialModels/''',"")
		val workspace = new FileSystemWorkspace('''outputModels/''',"")
		workspace.initAndClear
		
		println("Input and output workspaces are created")
		
		val metamodel = loadMetamodel()
		val partialModel = loadPartialModel(inputs)
		val queries = loadQueries(metamodel)
		
		println("DSL loaded")
		
		val Ecore2Logic ecore2Logic = new Ecore2Logic
		val Logic2Ecore logic2Ecore = new Logic2Ecore(ecore2Logic)
		val Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic)
		val InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic
		
		val modelGenerationProblem = ecore2Logic.transformMetamodel(metamodel,new Ecore2LogicConfiguration())
		val modelExtensionProblem = instanceModel2Logic.transform(modelGenerationProblem,partialModel)
		val validModelExtensionProblem = viatra2Logic.transformQueries(queries,modelExtensionProblem,new Viatra2LogicConfiguration)
//		workspace.writeModel(validModelExtensionProblem.output, "generation.logicproblem")
		
		val logicProblem = validModelExtensionProblem.output
		
		println("Problem created")
		var LogicResult solution
		var LogicReasoner reasoner
		//*
		reasoner = new ViatraReasoner
		val viatraConfig = new ViatraReasonerConfiguration => [
			it.typeScopes.maxNewElements = 40
			it.typeScopes.minNewElements = 40
			it.solutionScope.numberOfRequiredSolutions = 1
//			it.scopePropagatorStrategy = ScopePropagatorStrategy.BasicTypeHierarchy
			it.documentationLevel = DocumentationLevel.NONE
			it.debugConfiguration.partalInterpretationVisualisationFrequency = 1
			it.debugConfiguration.partialInterpretatioVisualiser = new GraphvizVisualiser
		]
		solution = reasoner.solve(logicProblem,viatraConfig,workspace)
		/*/
		reasoner = new AlloySolver
		val alloyConfig = new AlloySolverConfiguration => [
				it.typeScopes.maxNewElements = 5
				it.typeScopes.minNewElements = 5
				it.solutionScope.numberOfRequiredSolution = 1
				it.typeScopes.maxNewIntegers = 0
				it.writeToFile = true
			]
		solution = reasoner.solve(logicProblem,alloyConfig,workspace)
		//*/
		
		println("Problem solved")
		
		val result = solution as ModelResult
		val interpretations = reasoner.getInterpretations(result)
		val models = new LinkedList
		for(interpretation : interpretations) {
			val instanceModel = logic2Ecore.transformInterpretation(interpretation,modelGenerationProblem.trace)
			models+=instanceModel
		}
		println(result.statistics.solverTime)
		
		solution.writeSolution(workspace, #[])
	}
	
	def private static loadMetamodel() {
		val pckg = FunctionalarchitecturePackage.eINSTANCE
		val List<EClass> classes = pckg.EClassifiers.filter(EClass).toList
		val List<EEnum> enums = pckg.EClassifiers.filter(EEnum).toList
		val List<EEnumLiteral> literals = enums.map[ELiterals].flatten.toList
		val List<EReference> references = classes.map[EReferences].flatten.toList
		val List<EAttribute> attributes = classes.map[EAttributes].flatten.toList
		return new EcoreMetamodelDescriptor(classes,#{},false,enums,literals,references,attributes)
	}
	
	def private static loadQueries(EcoreMetamodelDescriptor metamodel) {
		val i = FamPatterns.instance
		val patterns = i.specifications.toList
		val wfPatterns = patterns.filter[it.allAnnotations.exists[it.name== "Constraint"]].toSet
		val derivedFeatures = new LinkedHashMap
		val res = new ViatraQuerySetDescriptor(
			patterns,
			wfPatterns,
			derivedFeatures
		)
		return res
	}
	
	def static loadPartialModel(ReasonerWorkspace inputs) {
		EMFPatternLanguageStandaloneSetup.doSetup
		ReteEngine.getClass
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		inputs.readModel(EObject,"FAM.xmi").eResource.allContents.toList
	}
	
	def static writeSolution(LogicResult solution, ReasonerWorkspace workspace, List<EObject> models) {
		if(solution instanceof ModelResult) {
			val representations = solution.representation
			for(representationIndex : 0..<representations.size) {
				val representation = representations.get(representationIndex)
				val representationNumber = representationIndex + 1
				if(representation instanceof PartialInterpretation) {
					workspace.writeModel(representation, '''solution«representationNumber».partialinterpretation''')
					val partialInterpretation2GML = new PartialInterpretation2Gml
					val gml = partialInterpretation2GML.transform(representation)
						//ecore2GML.transform(root)
						workspace.writeText('''solutionVisualisation.gml''',gml)
						
				} else {
					workspace.writeText('''solution«representationNumber».txt''',representation.toString)
				}
			}
			for(model : models) {
				workspace.writeModel(model,"model.xmi")
			}
			println("Solution saved and visualised")
		} 
	}
}