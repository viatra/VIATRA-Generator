package ca.mcgill.ecse.dslreasoner.realistic.metrics.examples

import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.FurtherNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.IncomingRelation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2ShapeGraph
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.OutgoingRelation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.io.PrintWriter
import java.math.RoundingMode
import java.text.DecimalFormat
import java.util.Collection
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
	static val neighbouhood2ShapeGraph = new Neighbourhood2ShapeGraph
	private static DecimalFormat df = new DecimalFormat("0.000");
	private static final Integer NUMMEASUREMENTS = 9
	private static final Integer NUMNA = 2

	def static void main(String[] args) {
		df.roundingMode = RoundingMode.UP
		val outputFolder = "outputs//calculatedMetrics//stats//"

		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("*", new XMIResourceFactoryImpl)
		YakindummPackage.eINSTANCE.eClass
		LinkedListPackage.eINSTANCE.eClass
		ReteEngine.getClass

		val fileDir = "Human//"
		val outputFileName = "stats.csv"
//		val inputs = "inputs//" + fileDir
		val inputs = "resources//" // TESTING
		val workspace = new FileSystemWorkspace(inputs, "")

		var List<List<String>> metricValues = newArrayList

		for (var i = 0; i < NUMMEASUREMENTS; i++) {
			metricValues.add(newArrayList)
		}
		var metricVal = 0.0

		var index = 0
//		for (fileName : workspace.allFiles.subList(0, 100)) {
		for (fileName : newArrayList("sampleList.xmi")) { // TESTING
			println(index++)
			val nameWOExt = fileName.substring(0, fileName.indexOf("."))
			val model = workspace.readModel(EObject, fileName)
			val partialModel = getPartialModel(workspace, model)

			// /////////////
			// NODE ACTIVITY
			// /////////////
			// Calculate NA from partial model
			metricVal = getNAfromModel(model)
			metricValues.get(0).add(df.format(metricVal))

			// Calculate NA from neighbourhood shape
			metricVal = MetricsCalculationUsingShapes.getNAfromNHShape(partialModel)
			metricValues.get(1).add(df.format(metricVal))

			// /////////////
			// MPC
			// /////////////
			// Calculate MPC from partial model
			metricVal = getMPCfromModel(model)
			metricValues.get(2).add(df.format(metricVal))

			for (var i = 0; i < NUMMEASUREMENTS - 3; i++) {
				// Calculate MPC from neighbourhood shape
				metricVal = getMPCfromNHShape(partialModel, i)
				metricValues.get(i + 3).add(df.format(metricVal))
			}

		}

		// Write to .csv
		val headers = newArrayList("NA,Model,", "NA,Shape,", "MPC,Model,", "MPC,Shape0,", "MPC,Shape1,", "MPC,Shape2,",
			"MPC,Shape3,", "MPC,Shape4,", "MPC,Shape5,")
		var writer = new PrintWriter(outputFolder + "statsNA.csv")
		for (var i = 0; i < NUMNA; i++) {
			writer.append(headers.get(i))
			writer.append(String.join(",", metricValues.get(i)))
			writer.append("\n");
		}
		writer.close
		
		writer = new PrintWriter(outputFolder + "statsMPC.csv")
		for (var i = NUMNA; i < NUMMEASUREMENTS; i++) {
			writer.append(headers.get(i))
			writer.append(String.join(",", metricValues.get(i)))
			writer.append("\n");
		}
		writer.close

		// print Results
		println("Node Activity:")
		println("from Partial Model: " + metricValues.get(0))
		println("from NH Shape     : " + metricValues.get(1))
		println("MPC:")
		println("from Partial Model: " + metricValues.get(2))
		for (var i = 0; i < NUMMEASUREMENTS - 3; i++) {
			println("from NH Shape " + i + "   : " + metricValues.get(i + 3))
		}

	}

	def static getNAfromModel(EObject model) {
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

	def static getNAfromNHLattice(PartialInterpretation partialModel) {
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

	def static getNAfromNHShape(PartialInterpretation pm) {
		getNAfromNHShape(pm, 1)
	}

	def static getNAfromNHShape(PartialInterpretation partialModel, Integer depth) {
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

		val averageMetricValue = totalMetricValue / numNodesTotal
		return averageMetricValue

	}

	def static getMPCfromModel(EObject model) {
		val nodes = model.eResource.allContents.toList

		var Set<String> allDimensions = new HashSet

		// fill HashSet
		var Map<EObject, Map<String, Integer>> node2Degrees = new HashMap
		for (node : nodes) {
			node2Degrees.put(node, newHashMap)
		}

		// iterate over nodes and their references
		for (node : nodes) {

			// calculate Degree for each reference Type
			for (reference : node.eClass.EAllReferences) {
				val pointingTo = node.eGet(reference)

				if (!(pointingTo instanceof List)) {
					if (pointingTo !== null) {
						allDimensions.add(reference.name) // TODO
						// Add for source
						putInside(node, reference.name, 1, node2Degrees)
						// Add for target
						putInside((pointingTo as EObject), reference.name, 1, node2Degrees)
					}
				} else {
					val pointingToList = pointingTo as List
					if (!pointingToList.empty) {
						allDimensions.add(reference.name) // TODO
						// Add for source
						putInside(node, reference.name, pointingToList.size, node2Degrees)
						for (target : pointingToList) {
							// Add for target
							putInside((target as EObject), reference.name, 1, node2Degrees)
						}
					}
				}
			}
		}

		// Measure MPC
		val numNodes = nodes.length
		val totalNumDims = allDimensions.length
		var totalMPC = 0.0
		for (degrees : node2Degrees.values) {
			var totalDegree = findSum(degrees.values)
			var partialMPC = 1.0
			for (degree : degrees.values) {
				partialMPC -= Math.pow(degree.floatValue / totalDegree, 2)
			}
			totalMPC += partialMPC
		}

		val averageMPC = ( totalNumDims.floatValue / (totalNumDims - 1) ) * (totalMPC / numNodes)
		return averageMPC
	}

	def static getMPCfromNHShape(PartialInterpretation pm) {
		getMPCfromNHShape(pm, 2)
	}

	def static getMPCfromNHShape(PartialInterpretation partialModel, Integer depth) {
		// Get NH Shape
		val nh = neighbourhoodComputer.createRepresentation(partialModel, depth, Integer.MAX_VALUE, Integer.MAX_VALUE)
		val nhRep = nh.modelRepresentation as HashMap
		val nhShapeGraph = neighbouhood2ShapeGraph.createShapeGraph(nh, partialModel)

		// Useful variable initializations
		var totalMPC = 0.0
		var totalDegree = 0
		var partialMPC = 0.0
		var numNodes = 0
		var Set<String> allDimensions = new HashSet
		var Map<String, Integer> type2Num = new HashMap

		// look at the in and out edges of each shape node
		for (node : nhShapeGraph.nodes) {
			totalDegree = node.incomingEdges.size + node.outgoingEdges.size

			for (inEdge : node.incomingEdges) {
				val edgeName = inEdge.type
				allDimensions.add(edgeName)
				if (type2Num.keySet.contains(edgeName)) {
					type2Num.put(edgeName, edgeName.lookup(type2Num) + 1)
				} else {
					type2Num.put(edgeName, 1)
				}
			}
			for (outEdge : node.outgoingEdges) {
				val edgeName = outEdge.type
				allDimensions.add(edgeName)
				if (type2Num.keySet.contains(edgeName)) {
					type2Num.put(edgeName, edgeName.lookup(type2Num) + 1)
				} else {
					type2Num.put(edgeName, 1)
				}
			}

			// Measure preliminary results for MPC
			partialMPC = 1.0
			for (degree : type2Num.values) {
				partialMPC -= Math.pow(degree.floatValue / totalDegree, 2)
			}

			val numOccurrences = node.correspondingAND.lookup(nhRep) as Integer
			numNodes += numOccurrences

			totalMPC += partialMPC * numOccurrences
			type2Num.clear
		}

		val totalNumDims = allDimensions.size

		val averageMPC = ( totalNumDims.floatValue / (totalNumDims - 1) ) * (totalMPC / numNodes)
		return averageMPC
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

	def static findSum(Collection<Integer> integers) {
		var sum = 0
		for (integer : integers) {
			sum += integer
		}
		return sum
	}

	def static putInside(EObject object, String string, int i, Map<EObject, Map<String, Integer>> map) {
		val Map<String, Integer> correspondingMap = object.lookup(map)
		if (correspondingMap.keySet.contains(string)) {
			correspondingMap.put(string, string.lookup(correspondingMap) + i)
		} else {
			correspondingMap.put(string, i)
		}
	}

}
