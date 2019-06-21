package ca.mcgill.ecse.dslreasoner.realistic.metrics.examples

import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.FurtherNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.GraphNodeDescriptorGND
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.IncomingRelation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2Gml
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2ShapeGraph
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.OutgoingRelation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.io.PrintWriter
import java.math.RoundingMode
import java.text.DecimalFormat
import java.util.ArrayList
import java.util.Collections
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import linkedList.LinkedListPackage
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
	static val neighbouhood2ShapeGraph = new Neighbourhood2ShapeGraph
	private static DecimalFormat df = new DecimalFormat("0.000");

	def static void main(String[] args) {
		df.roundingMode = RoundingMode.UP
		val outputFolder = "outputs//calculatedMetrics//stats//"

		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("*", new XMIResourceFactoryImpl)
		YakindummPackage.eINSTANCE.eClass
		LinkedListPackage.eINSTANCE.eClass
		ReteEngine.getClass

		val fileDir = "Human//"
		val outputFileName = "stats.csv"
		val inputs = "inputs//" + fileDir
//		val inputs = "resources//" // TESTING
		val workspace = new FileSystemWorkspace(inputs, "")

		var naForAllModelsWOnh = newArrayList
		var naForAllModelsWnh = new ArrayList<String>
		var naForAllModelsWnhSHAPE = new ArrayList<String>

		var modelNA = 0.0

		println("Average NAs per model")

		for (fileName : workspace.allFiles.subList(0, 100)) {
//		for (fileName : newArrayList("sampleList.xmi")) { // TESTING
			val nameWOExt = fileName.substring(0, fileName.indexOf("."))
			val model = workspace.readModel(EObject, fileName)

			// Calculate NA without nh
			modelNA = measureNAwithoutNH(model)
			naForAllModelsWOnh.add(df.format(modelNA))

			// Calculate NA with nh
			val partialModel = getPartialModel(workspace, model)
			modelNA = measureNAwithNH(partialModel)
			naForAllModelsWnh.add(df.format(modelNA))

			// Calculate NA with nh using SHAPE
			modelNA = MetricsCalculationUsingShapes.measureNAwithNHShape(partialModel, 1)
			naForAllModelsWnhSHAPE.add(df.format(modelNA))

		// TEMP
		// println(nameWOExt + " : " + df.format(modelNA))
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
		// ENDTEMP
		}

		// Write to .csv
		val writer = new PrintWriter(outputFolder + outputFileName)
		writer.append("noNH,")
		writer.append(String.join(",", naForAllModelsWOnh))
		writer.append("\n");

		writer.append("NH-NoShape,")
		writer.append(String.join(",", naForAllModelsWnh));
		writer.append("\n");

		writer.append("NH-Shape,")
		writer.append(String.join(",", naForAllModelsWnhSHAPE));
		writer.append("\n");

		writer.close

		// print Results
		println("W/O NH       : " + naForAllModelsWOnh)
		println("W/ NH NoShape: " + naForAllModelsWnh)
		println("W/ NH Shape 1: " + naForAllModelsWnhSHAPE)

	}

	def static measureNAwithoutNH(EObject model) {
		val nodes = model.eResource.allContents.toList

		var totalNA = 0.0
		val numNodes = nodes.length

		// fill HashSet
		var Map<EObject, Set<String>> node2ActiveDims = new HashMap
		for (node : nodes) {
			node2ActiveDims.put(node, new HashSet)
		}

		// iterate over nodes and their references
		for (node : nodes) {
			for (reference : node.eClass.EAllReferences) {
				val pointingTo = node.eGet(reference)

				if (!(pointingTo instanceof List)) {
					if (pointingTo !== null) {
						// Add for source
						node.lookup(node2ActiveDims).add(reference.name)
						// Add for target
						(pointingTo as EObject).lookup(node2ActiveDims).add(reference.name)
					}
				} else {
					val pointingToSet = pointingTo as List
					if (!pointingToSet.empty) {
						for (target : pointingToSet) {
							// Add for source
							node.lookup(node2ActiveDims).add(reference.name)
							// Add for target
							(target as EObject).lookup(node2ActiveDims).add(reference.name)
						}
					}
				}
			}
		}

		// Measure NA
		for (activeDims : node2ActiveDims.values) {
			totalNA += activeDims.length
		}

		val averageNA = totalNA / numNodes

		return averageNA
	}

	def static measureNAwithNH(PartialInterpretation partialModel) {
		// Get required neighbourhoods
		val nh = neighbourhoodComputer.createRepresentation(partialModel, 2, Integer.MAX_VALUE, Integer.MAX_VALUE)
		val nhDeepRep = nh.modelRepresentation as HashMap
		val nhRep = neighbourhoodComputer.createRepresentation(partialModel, 1, Integer.MAX_VALUE, Integer.MAX_VALUE).
			modelRepresentation as HashMap
		val nhDeepNodes = nhDeepRep.keySet
		val nhNodes = nhRep.keySet

		// Storing active dims in a HashMap
		var Map<AbstractNodeDescriptor, Set<String>> node2ActiveDims = new HashMap

		// fill activeDims with empty lists for each node descriptor
		for (nhNode : nhNodes) {
			node2ActiveDims.put(nhNode as AbstractNodeDescriptor, new HashSet)
		}

		// populate node2ActiveDims HashMap
		for (nhDeepNode : nhDeepNodes) {
			val nhDeepNodeDesc = nhDeepNode as FurtherNodeDescriptor
			val nhParentNode = (nhDeepNodeDesc.previousRepresentation as AbstractNodeDescriptor)
			// for incoming Edges
			for (inEdge : nhDeepNodeDesc.incomingEdges.keySet) {
				val edgeDim = (inEdge as IncomingRelation).type
				nhParentNode.lookup(node2ActiveDims).add(edgeDim)
			}

			// for outgoing Edges
			for (outEdge : nhDeepNodeDesc.outgoingEdges.keySet) {
				val edgeDim = (outEdge as OutgoingRelation).type
				nhParentNode.lookup(node2ActiveDims).add(edgeDim)
			}
		}

		// Get NAs per node, considering the number of occurences in the partialModel
		var totalNA = 0.0
		var numModelElems = 0
		for (nhNode : node2ActiveDims.keySet) {
			var activeDimsForNode = nhNode.lookup(node2ActiveDims)
			var numNodeOccurences = nhNode.lookup(nhRep) as Integer

			// ASSUME THAT THERE IS NO NODE WITHOUT ANY CONNECTIONS
			// ^valid assumption because of containment edges
			if (!activeDimsForNode.empty) {
				totalNA += (activeDimsForNode.length * numNodeOccurences)
				numModelElems += numNodeOccurences
			}
		}

		// return average NA
		val averageNAwithWeight = totalNA / numModelElems
		return averageNAwithWeight

	}

	def static measureNAwithNHShape(PartialInterpretation partialModel, Integer depth) {
		// Get NH Shape
		val nh = neighbourhoodComputer.createRepresentation(partialModel, depth, Integer.MAX_VALUE, Integer.MAX_VALUE)
		val nhRep = nh.modelRepresentation as HashMap
		val nhShapeGraph = neighbouhood2ShapeGraph.createShapeGraph(nh, partialModel)

		// Useful variable initializations
		var totalMetricValue = 0.0
		var numNodesTotal = 0
		var Set<Object> activeDims = new HashSet

		// look at the in and out edges of each shape node
		for (node : nhShapeGraph.nodes) {
			for (inEdge : node.incomingEdges) {
				activeDims.add(inEdge.type)
			}
			for (outEdge : node.outgoingEdges) {
				activeDims.add(outEdge.type)
			}

			// Measure preliminary results for NA
			val numOccurrences = node.correspondingAND.lookup(nhRep) as Integer
			val numActDims = activeDims.length
			val totalActDims = numActDims * numOccurrences

			numNodesTotal += numOccurrences
			totalMetricValue += totalActDims
			activeDims.clear
		}

		val averageMetricValue =  totalMetricValue / numNodesTotal
		return averageMetricValue

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
