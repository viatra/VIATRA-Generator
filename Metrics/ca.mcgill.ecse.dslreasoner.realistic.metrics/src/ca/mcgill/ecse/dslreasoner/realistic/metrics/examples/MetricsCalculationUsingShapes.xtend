package ca.mcgill.ecse.dslreasoner.realistic.metrics.examples

import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.FurtherNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.IncomingRelation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.LocalNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2Gml
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.OutgoingRelation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.math.RoundingMode
import java.text.DecimalFormat
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

class MetricsCalculationUsingShapes {
	static val partialInterpretation2Logic = new InstanceModel2PartialInterpretation
	static val neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice
	static val Ecore2Logic ecore2Logic = new Ecore2Logic
	static val partialVisualizer = new PartialInterpretation2Gml
	static val neighbourhoodVisualizer = new Neighbourhood2Gml
	 private static DecimalFormat df = new DecimalFormat("0.000");
	
	def static void main(String[] args) {
		df.roundingMode = RoundingMode.UP

		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("*", new XMIResourceFactoryImpl)
		YakindummPackage.eINSTANCE.eClass
		ReteEngine.getClass
		

		val fileDir = "Human//"
		val outputs = "outputs//calculatedMetrics//" + fileDir
		val inputs = "inputs//" + fileDir

		val workspace = new FileSystemWorkspace(inputs, "")

		var naForAllModelsWnh1 = newArrayList
		var naForAllModelsWnh2 = newArrayList
		var naForAllModelsWnh3 = newArrayList
		var naForAllModelsWOnh = newArrayList
		var modelNA = newArrayList
		
		println("Average NAs per model")
		
		for (fileName : workspace.allFiles.subList(0, 10)) {
			val nameWOExt = fileName.substring(0, fileName.indexOf("."))
			val model = workspace.readModel(EObject, fileName)
			
			//Calculate NA without nh
			modelNA = measureNAwithoutNH(model)
			naForAllModelsWOnh.add(df.format(modelNA.get(0)))
			
			
			//Calculate NA with nh
			val partialModel = getPartialModel(workspace, model)
			modelNA = measureNAwithNH(partialModel)
			naForAllModelsWnh1.add(df.format(modelNA.get(0)))
			naForAllModelsWnh2.add(df.format(modelNA.get(1)))
			//println(nameWOExt + " : " + df.format(modelNA))

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
		println("W/O NH : " + naForAllModelsWOnh)
		println("W/ NH 1: " + naForAllModelsWnh1)
		println("W/ NH 2: " + naForAllModelsWnh2)
		println("W/ NH 3: " + naForAllModelsWnh3)
		

	}
	
	def static measureNAwithoutNH(EObject model) {
		val nodes = model.eResource.allContents.toList
		val numNodes = nodes.length
		
		var currentNA = 0
		var seenDims = newArrayList
		
		var totalNA = 0.0
		
		for(node: nodes){
			currentNA = 0
			seenDims.clear
			for(reference : node.eClass.EAllReferences){
				if(!seenDims.contains(reference.name)){
					currentNA++
					seenDims.add(reference.name)
				}
			}
			
			totalNA += currentNA			
		}
		
		val averageNA = totalNA/numNodes
		
		return newArrayList(averageNA)
	}

	def static measureNAwithNH(PartialInterpretation partialModel) {
		// Get neighbouhood at d=0
		val nh = neighbourhoodComputer.createRepresentation(partialModel, 1, Integer.MAX_VALUE, Integer.MAX_VALUE)
		val nhDeepRep = nh.modelRepresentation as HashMap
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
		var totalNA = 0.0
		//weight is the number of model nodes that are linked to the NH node
		var totalNAwithWeight = 0.0
		var numModelElemsWithWeight = 0
		for (nhNode : activeDims.keySet) {
			
			var activeDimsForNode = nhNode.lookup(activeDims)
			var numNodeOccurences = nhNode.lookup(nhRep) as Integer
			
			naDistrib.add(activeDimsForNode.length)
			totalNA += activeDimsForNode.length
			
			totalNAwithWeight += activeDimsForNode.length * numNodeOccurences
			numModelElemsWithWeight += numNodeOccurences
			
		}
//		println(activeDims)

		// return average NA
		val averageNA = totalNA / activeDims.values.length
		val averageNAwithWeight = totalNAwithWeight / numModelElemsWithWeight
		return newArrayList(averageNA, averageNAwithWeight)

	}

	def static getPartialModel(FileSystemWorkspace workspace, EObject model) {
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
