package ca.mcgill.ecse.dslreasoner.realistic.metrics.examples

import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.FurtherNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.LocalNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2Gml
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.util.Collections
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.viatra.query.runtime.rete.matcher.ReteEngine

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.IncomingRelation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.OutgoingRelation

class MetricsCalculationUsingShapes {
	static val partialInterpretation2Logic = new InstanceModel2PartialInterpretation
	static val neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice
	static val Ecore2Logic ecore2Logic = new Ecore2Logic
	static val partialVisualizer = new PartialInterpretation2Gml
	static val neighbourhoodVisualizer = new Neighbourhood2Gml
	static val depth = 0

	def static void main(String[] args) {

		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("*", new XMIResourceFactoryImpl)
		YakindummPackage.eINSTANCE.eClass
		ReteEngine.getClass

		val fileDir = "Human//"
		val outputs = "outputs//calculatedMetrics//" + fileDir
		val inputs = "inputs//" + fileDir

		val workspace = new FileSystemWorkspace(inputs, "")

		var naForAllModels = newArrayList
		var modelNA = 0.0
		
		println("Average NAs per model")
		
		for (fileName : workspace.allFiles/*.subList(0, 100)*/) {
			val nameWOExt = fileName.substring(0, fileName.indexOf("."))
			val partialModel = getPartialModel(workspace, fileName)
			
			modelNA = measureNodeActivitiy(partialModel)
			//TEMP
			naForAllModels.add(modelNA)
			
			println(nameWOExt + " : " + modelNA)

		// Visualize Model
//			val writer = new PrintWriter(outputs + "//" + nameWOExt + "MODEL.gml")
//			writer.print(partialVisualizer.transform(partialModel))
//			writer.close
		// Visualize Neighbourhood
//			val hood = neighbourhoodComputer.createRepresentation(partialModel, depth, Integer.MAX_VALUE,
//				Integer.MAX_VALUE)
//			val w2 = new PrintWriter(outputs + nameWOExt + "NHOOD" + depth + ".gml")
//			w2.print(neighbourhoodVisualizer.transform(hood, partialModel))
//			w2.close
		}

	}

	def static measureNodeActivitiy(PartialInterpretation partialModel) {
		val depth = 1
		// Get neighbouhood at d=0
		val nh = neighbourhoodComputer.createRepresentation(partialModel, depth, Integer.MAX_VALUE, Integer.MAX_VALUE)
		val nhDeepRep = nh.modelRepresentation as HashMap
//		val nhRep = nh.previousRepresentation.modelRepresentation as HashMap
		val nhRep = neighbourhoodComputer.createRepresentation(partialModel, 0, Integer.MAX_VALUE, Integer.MAX_VALUE).modelRepresentation as HashMap
		val nhDeepNodes = nhDeepRep.keySet
		val nhNodes = nhRep.keySet

		var Map<LocalNodeDescriptor, List<String>> activeDims = newHashMap
		// fill activeDims with empty lists for each node descriptor
		for (nhNode : nhNodes) {
			activeDims.put(nhNode as LocalNodeDescriptor, newArrayList)
		}

		// populate activeDims
		for (nhDeepNode : nhDeepNodes) {
			val nhDeepNodeDesc = nhDeepNode as FurtherNodeDescriptor
			val nhParentNode = (nhDeepNodeDesc.previousRepresentation as LocalNodeDescriptor)
			// for incoming Edges
			for (inEdge : nhDeepNodeDesc.incomingEdges.keySet) {
				val edgeDim = (inEdge as IncomingRelation).type
				if (!nhParentNode.lookup(activeDims).contains(edgeDim)) {
					nhParentNode.lookup(activeDims).add(edgeDim)
				}
			}

			// for outgoing Edges
			for (outEdge : nhDeepNodeDesc.outgoingEdges.keySet) {
				val edgeDim = (outEdge as OutgoingRelation).type
				if (!nhParentNode.lookup(activeDims).contains(edgeDim)) {
					nhParentNode.lookup(activeDims).add(edgeDim)
				}
			}
		}

		// Get NAs per node (distribution)
		val naDistrib = newArrayList
		var avgNA = 0
		for (activeDimsForNode : activeDims.values) {
			naDistrib.add(activeDimsForNode.length)
			avgNA += activeDimsForNode.length
		}
//		println(activeDims)

		// return average NA
		return (avgNA as float) / activeDims.values.length

	}

	def static getPartialModel(FileSystemWorkspace workspace, String fileName) {
		val model = workspace.readModel(EObject, fileName)

		val pckg = model.eClass.EPackage
		val metamodel = new EcoreMetamodelDescriptor(
			pckg.EClassifiers.filter(EClass).toList,
			Collections::emptySet,
			false,
			pckg.EClassifiers.filter(EEnum).toList,
			pckg.EClassifiers.filter(EEnum).map[ELiterals].flatten.toList,
			pckg.EClassifiers.filter(EClass).map[EReferences].flatten.toList,
			pckg.EClassifiers.filter(EClass).map[EAttributes].flatten.toList
		)
		val metamodelTransformationOutput = ecore2Logic.transformMetamodel(metamodel, new Ecore2LogicConfiguration)

		return partialInterpretation2Logic.transform(metamodelTransformationOutput, model.eResource, false)
	}

}
