package cpsgen

import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
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
import hu.bme.mit.inf.dslreasoner.visualisation.pi2graphviz.GraphvizVisualisation
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import hu.bme.mit.inf.smartgrid.SmartgridPackage
import java.util.LinkedHashMap
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
import patterns.Pattern
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration
class Run {
	
     /**
     *  Initializes the files needed for the generate method. Iterates over all the query specifications contained by <b>queriesToGenerateFrom</b> 
     *  and calls the generate method for each ViatraQuerySetDescriptor.
     */
    def static void main(String[] args) {
    	
        val initialModelsLocation = new FileSystemWorkspace('''initialModels/''',"")
        val outputModelsLocation = new FileSystemWorkspace('''outputModels/''',"")
        outputModelsLocation.initAndClear     
         
        println("Input and output workspaces are created")    
            
        val metamodel = loadMetamodel(SmartgridPackage.eINSTANCE)
        val initialModel = loadInitialModel(initialModelsLocation, "grid.xmi")       
        val queries = loadQueries(metamodel)
        
		println("DSL loaded")
		
		val Ecore2Logic ecore2Logic = new Ecore2Logic
		val Logic2Ecore logic2Ecore = new Logic2Ecore(ecore2Logic)
		val Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic)
		val InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic
		
		val modelGenerationProblem = ecore2Logic.transformMetamodel(metamodel,new Ecore2LogicConfiguration())
		val modelExtensionProblem = instanceModel2Logic.transform(modelGenerationProblem, initialModel)
		val validModelExtensionProblem = viatra2Logic.transformQueries(queries,modelGenerationProblem,new Viatra2LogicConfiguration)
		
		val logicProblem = validModelExtensionProblem.output
		
		println("Problem created")
		var LogicResult solution
		var LogicReasoner reasoner
		//*
		reasoner = new ViatraReasoner
		val viatraConfig = new ViatraReasonerConfiguration => [
			it.typeScopes.maxNewElements = 100
			it.typeScopes.minNewElements = 100
			it.solutionScope.numberOfRequiredSolution = 1
			it.existingQueries = queries.patterns.map[it.internalQueryRepresentation]
			it.debugCongiguration.logging = false
			//it.debugCongiguration.partalInterpretationVisualisationFrequency = 100
			//it.debugCongiguration.partialInterpretatioVisualiser = new GraphvizVisualisation
		]
		solution = reasoner.solve(logicProblem,viatraConfig,outputModelsLocation)
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
		
		val interpretations = reasoner.getInterpretations(solution as ModelResult)
		val models = new LinkedList
		for(interpretation : interpretations) {
			val instanceModel = logic2Ecore.transformInterpretation(interpretation,modelGenerationProblem.trace)
			models+=instanceModel
		}
		
		solution.writeSolution(outputModelsLocation, #[])
    }       
    /**
     * Creates an EcoreMetamodelDescriptor as the metamodel to be used by the generator.
     */
    def private static EcoreMetamodelDescriptor loadMetamodel(EPackage pckg) {
        val List<EClass> classes = pckg.EClassifiers.filter(EClass).toList
        val List<EEnum> enums = pckg.EClassifiers.filter(EEnum).toList
        val List<EEnumLiteral> literals = enums.map[ELiterals].flatten.toList
        val List<EReference> references = classes.map[EReferences].flatten.toList
        val List<EAttribute> attributes = emptyList//classes.map[EAttributes].flatten.toList
        return new EcoreMetamodelDescriptor(classes,#{},false,enums,literals,references, attributes)
    }
    
    /**
     * Creates a <b>ViatraQuerySetDescriptor</b> from the provided metamodel, baseSpecifications and specifications.
     * Well-formedness patterns must be marked with the <b>@Constraint</b> annotation.
     * All the patterns referred by the <b>specifications</b> must be included in <b>baseSpecifications</b>. The non referred queries are filtered automatically.
     * 
     * @param metamodel 
     * @param baseSpecifications 
     * @param specifications
     */
	def private static loadQueries(EcoreMetamodelDescriptor metamodel) {
		val i = Pattern.instance//hu.bme.mit.inf.dslreasoner.domains.transima.fam.patterns.Pattern.instance
		val patterns = i.specifications.toList
		val wfPatterns = patterns.filter[it.allAnnotations.exists[it.name== "Constraint"]].toSet
		val derivedFeatures = new LinkedHashMap
		//derivedFeatures.put(i.type.internalQueryRepresentation,metamodel.attributes.filter[it.name == "type"].head)
		//derivedFeatures.put(i.model.internalQueryRepresentation,metamodel.references.filter[it.name == "model"].head)
		val res = new ViatraQuerySetDescriptor(
			patterns,
			wfPatterns,
			derivedFeatures
		)
		return res
	}
    
    /**
     * Loads the initial model and registers the resource.
     */
    def static List<EObject> loadInitialModel(FileSystemWorkspace location, String fileName) {
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
        return location.readModel(EObject, fileName).eResource.allContents.toList
    }
    
    /**
     * 
     */
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