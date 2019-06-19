package ca.mcgill.ecse.dslreasoner.realistic.metrics.examples

import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.FurtherNodeDescriptor
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
	static val neighbouhood2ShapeGraph = new Neighbourhood2ShapeGraph
	private static DecimalFormat df = new DecimalFormat("0.000");

	def static void main(String[] args) {
		df.roundingMode = RoundingMode.UP
		val outputFolder = "outputs//calculatedMetrics//stats//"

		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("*", new XMIResourceFactoryImpl)
		YakindummPackage.eINSTANCE.eClass
		ReteEngine.getClass

		val fileDir = "Human//"
		val outputFileName = "stats.csv"
		val inputs = "inputs//" + fileDir

		val workspace = new FileSystemWorkspace(inputs, "")

		var naForAllModelsWnh = new ArrayList<List<String>>
		var naForAllModelsWOnh = newArrayList
		var modelNA = newArrayList

		println("Average NAs per model")

		for (fileName : workspace.allFiles.subList(0, 200)) {
			val nameWOExt = fileName.substring(0, fileName.indexOf("."))
			val model = workspace.readModel(EObject, fileName)

			// Calculate NA without nh
			modelNA = measureNAwithoutNH(model)
			naForAllModelsWOnh.add(df.format(modelNA.get(0)))

			// Calculate NA with nh
			val partialModel = getPartialModel(workspace, model)
			val upLim = 3
			for (var i = 0; i < upLim; i++) {
				modelNA = measureNAwithNH(partialModel, i)
				if (naForAllModelsWnh.length <= i) {
					naForAllModelsWnh.add(newArrayList(df.format(modelNA.get(1))))
				} else {
					naForAllModelsWnh.get(i).add(df.format(modelNA.get(1)))
				}

			}

			for (var i = upLim; i < upLim * 2; i++) {
				modelNA = measureNAwithNHNew(partialModel, i-upLim)
				if (naForAllModelsWnh.length <= i) {
					naForAllModelsWnh.add(newArrayList(df.format(modelNA.get(1))))
				} else {
					naForAllModelsWnh.get(i).add(df.format(modelNA.get(1)))
				}

			}

//			naForAllModelsWnh2.add(df.format(modelNA.get(1)))
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
		}
		// Write to .csv
		val writer = new PrintWriter(outputFolder + outputFileName)
		writer.append("noNH")
		writer.append(",")
		writer.append(String.join(",", naForAllModelsWOnh))
		writer.append("\n");

		var ind = 0
		for (List<String> rowData : naForAllModelsWnh) {
			writer.append("NHD" + ind.toString)
			writer.append(",")
			writer.append(String.join(",", rowData));
			writer.append("\n");
			ind++
		}

		writer.close

		// print Results
		println("W/O NH : " + naForAllModelsWOnh)
		var i = 0
		for (sublist : naForAllModelsWnh) {
			println("W/ NH " + i + ": " + sublist)
			i++
		}

	}

	def static measureNAwithoutNH(EObject model) {
		val nodes = model.eResource.allContents.toList
		val numNodes = nodes.length

		var currentNA = 0
		var seenDims = newArrayList

		var totalNA = 0.0

		for (node : nodes) {
			currentNA = 0
			seenDims.clear
			for (reference : node.eClass.EAllReferences) {
				if (!seenDims.contains(reference.name)) {
					currentNA++
					seenDims.add(reference.name)
				}
			}

			totalNA += currentNA
		}

		val averageNA = totalNA / numNodes

		return newArrayList(averageNA)
	}

	def static measureNAwithNH(PartialInterpretation partialModel, Integer depth) {
		// Get neighbouhood at d=0
//		val depth = 2
		val nh = neighbourhoodComputer.createRepresentation(partialModel, depth + 1, Integer.MAX_VALUE,
			Integer.MAX_VALUE)
		val nhDeepRep = nh.modelRepresentation as HashMap
		val nhRep = neighbourhoodComputer.createRepresentation(partialModel, depth, Integer.MAX_VALUE,
			Integer.MAX_VALUE).modelRepresentation as HashMap
		val nhDeepNodes = nhDeepRep.keySet
		val nhNodes = nhRep.keySet

		var Map<AbstractNodeDescriptor, List<String>> activeDims = newHashMap
		// fill activeDims with empty lists for each node descriptor
		for (nhNode : nhNodes) {
			activeDims.put(nhNode as AbstractNodeDescriptor, newArrayList)
		}

		// populate activeDims
		for (nhDeepNode : nhDeepNodes) {
			val nhDeepNodeDesc = nhDeepNode as FurtherNodeDescriptor
			val nhParentNode = (nhDeepNodeDesc.previousRepresentation as AbstractNodeDescriptor)
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
		// weight is the number of model nodes that are linked to the NH node
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

	def static measureNAwithNHNew(PartialInterpretation partialModel, Integer depth) {
		// Get neighbouhood at d=0
		val nh = neighbourhoodComputer.createRepresentation(partialModel, depth, Integer.MAX_VALUE, Integer.MAX_VALUE)
		val nhRep = nh.modelRepresentation as HashMap
		val nhShapeGraph = neighbouhood2ShapeGraph.createShapeGraph(nh, partialModel)

		var totalMetricValue = 0.0
		var numNodes = 0
		var weightedActiveDimSum = 0.0
		var partialSum = 0.0
		for (node : nhShapeGraph.nodes) {
			weightedActiveDimSum = 0.0
			for (inDistrib : node.incomingEdges.values) {
				partialSum = 0.0
				for (value : inDistrib as List<Integer>) {
					if (value != 0) {
						partialSum += 1
					}

				}
				val distribSize = (inDistrib as List).length
				weightedActiveDimSum += (partialSum / distribSize)
				print(inDistrib as List<Integer>)
				println((partialSum / distribSize))
			}

			for (outDistrib : node.outgoingEdges.values) {
				partialSum = 0.0
				for (value : outDistrib as List<Integer>) {
					if (value != 0) {
						partialSum += 1
					}
				}
				val distribSize = (outDistrib as List).length
				weightedActiveDimSum += (partialSum / distribSize)
				print(outDistrib as List<Integer>)
				println((partialSum / distribSize))
			}

			val actDim = node.outgoingEdges.size + node.incomingEdges.size
			println("---------------")
			println("activeDims : " + actDim)
			println("weightedSum: " + weightedActiveDimSum)
			println("---------------")

			val numOccurrences = node.getCorrespondingAND.lookup(nhRep) as Integer

			numNodes += 1 // numOccurrences

			val nodeMetricVal = weightedActiveDimSum //* numOccurrences

			totalMetricValue += nodeMetricVal

		}

		val averageMetricValue = totalMetricValue / numNodes

		return newArrayList(0.0, averageMetricValue)

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
