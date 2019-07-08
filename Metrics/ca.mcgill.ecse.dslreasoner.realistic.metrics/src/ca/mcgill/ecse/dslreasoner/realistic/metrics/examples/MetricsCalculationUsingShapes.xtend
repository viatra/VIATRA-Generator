package ca.mcgill.ecse.dslreasoner.realistic.metrics.examples

import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.FurtherNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.GraphNodeDescriptorGND
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.GraphShape
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.IncomingRelation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2ShapeGraph
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.OutgoingRelation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.io.File
import java.io.PrintWriter
import java.math.RoundingMode
import java.text.DecimalFormat
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import linkedList.LinkedListPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.impl.EReferenceImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.viatra.query.runtime.rete.matcher.ReteEngine

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import java.lang.reflect.Method

abstract class MetricsCalculationUsingShapes {

	static val neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice

	static val neighbouhood2ShapeGraph = new Neighbourhood2ShapeGraph
	private static DecimalFormat df = new DecimalFormat("0.000");

	private static final Integer NUMMEASUREMENTS = 15
	private static final Integer NUMNA = 2
	private static final Integer NUMMPC = 4
	private static final Integer NUMNDA = 6

	def static void main(String[] args) {
		df.roundingMode = RoundingMode.UP
		val outputFolder = "outputs//calculatedMetrics//stats//"

		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("*", new XMIResourceFactoryImpl)
		YakindummPackage.eINSTANCE.eClass
		LinkedListPackage.eINSTANCE.eClass
		ReteEngine.getClass

		// SELECTION
		val testing = false
		val fileSelector = "A0"
		val bounded = false
		val lowEnd = 0
		val highEnd = 1
		// END SELECTION
		var fileDir = ""

		switch fileSelector {
			case "A0": fileDir = "A0//models//"
			case "A20": fileDir = "A20//models//"
			case "R1": fileDir = "RandomEMF-WF+7//models//"
			case "R2": fileDir = "RandomEMF30//models//"
			default: fileDir = "Human//"
		}
		var inputs = ""
		if (testing) {
			inputs = "resources//" // TESTING
		} else {
			inputs = "inputs//" + fileDir
		}
		val workspace = new FileSystemWorkspace(inputs, "")

		// Where we store metric values
		val metrics = newArrayList("NA" , "MPC" , "NDA", "NDC"/*, "EDA"*/ )
		val calcMethods = newArrayList("Model", "NHShape")

//		var List<List<String>> metricValues = newArrayList
//		for (var i = 0; i < 15; i++) {
//			// metric name -> (list(realMetricVals), list(NHMetricVals) ) 
//			metricValues.add(newArrayList)
//		}
//		// Where we store deltas
//		var List<Double> totalDeltas = newArrayList
//		var List<List<String>> deltas = newArrayList
//		for (var i = 0; i < NUMMEASUREMENTS; i++) {
//			deltas.add(newArrayList)
//			totalDeltas.add(0.0)
//		}
		// ////////////////////
		// Create list of things to look at
		// ////////////////////
		var calcVal = 0.0
		var realVal = 0.0
		var progressTracker = 0
		var List<String> listToLookThrough = newArrayList
		var List<String> subDirList = newArrayList
		if (testing) {
			listToLookThrough = newArrayList("sampleList.xmi")
		} else {
			if (bounded) {
				listToLookThrough = workspace.allFiles.subList(lowEnd, highEnd)
			} else {
				// NOT GENERAL
				for (run : workspace.allFiles) {
					if (new File(URI.createFileURI(inputs + "/" + run).toFileString).isDirectory) {
						val subWS = workspace.subWorkspace(run, "")
						if (new File(subWS.workspaceURI.toFileString).isDirectory) {
							for (file : subWS.allFiles) {
								listToLookThrough.add(run + "/" + file)
							}
						}
					} else {
						listToLookThrough.add(run)
					}

				}
			}
		}

		// ////////////////////
		// PERFORM MEASUREMENTS
		// ////////////////////
		var method = MetricsCalculationUsingShapes.methods.get(0) // initialisation
		// for each metric
		for (metric : metrics) {
			println("Metric: " + metric)
			var writer = new PrintWriter(outputFolder + "stats" + metric + ".csv")

			val className = "ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations.Calc" + metric
			val classObj = Class.forName(className)
			// realVsNH
			for (calcMethod : calcMethods) {
				print(metric + " " + calcMethod + " : ")
				if (calcMethod == "Model") {
					print("  ")
				}
				writer.append(metric)
				writer.append(calcMethod)
				
				
				// for each file
				for (fileName : listToLookThrough) {
					val nameWOExt = fileName.substring(0, fileName.indexOf("."))
					val model = workspace.readModel(EObject, fileName)
					val partialModel = Util.getPartialModel(workspace, model)

					// get method and invoke
					val methodName = "get" + metric + "from" + calcMethod
					var value = 0.0
					if (calcMethod == "Model") {
						method = classObj.getMethod(methodName, EObject)
						value = method.invoke(null, model) as Double
					} else {
						method = classObj.getMethod(methodName, PartialInterpretation)
						value = method.invoke(null, partialModel) as Double
					}

					// print and write
					var valAsStr = df.format(value)
					print(valAsStr + " ")
					writer.append(valAsStr)
					writer.close
				}
				println()
				writer.append("\n");
			}
			println()
		}

	/*

	 * // BEGIN
	 * //		print(listToLookThrough)
	 * for (fileName : listToLookThrough) {
	 * //			print(progressTracker++ + "-")
	 * 	val nameWOExt = fileName.substring(0, fileName.indexOf("."))
	 * 	val model = workspace.readModel(EObject, fileName)
	 * 	val partialModel = Util.getPartialModel(workspace, model)

	 * 	// /////////////
	 * 	// NODE ACTIVITY
	 * 	// /////////////
	 * 	// Calculate NA from partial model
	 * 	realVal = getNAfromModel(model)
	 * 	metricValues.get(0).add(df.format(realVal))
	 * 	// Calculate NA from neighbourhood shape
	 * 	calcVal = getNAfromNHLattice(partialModel)
	 * 	metricValues.get(1).add(df.format(calcVal))
	 * 	// Calculate delta
	 * 	totalDeltas.set(0, totalDeltas.get(0) + (Math.abs((calcVal - realVal) / realVal * 100)))

	 * 	// /////////////
	 * 	// Multiplex Participation Coeffifcient
	 * 	// /////////////
	 * 	// Calculate MPC from partial model
	 * 	realVal = getMPCfromModel(model)
	 * 	metricValues.get(2).add(df.format(realVal))
	 * 	// Calculate MPC from neighbourhood shape
	 * 	calcVal = getMPCfromNHShape(partialModel)
	 * 	metricValues.get(3).add(df.format(calcVal))
	 * 	// Calculate delta
	 * 	totalDeltas.set(1, totalDeltas.get(1) + (Math.abs((calcVal - realVal) / realVal * 100)))

	 * 	// /////////////
	 * 	// Node Dimension Activity
	 * 	// /////////////
	 * 	// Calculate MPC from partial model
	 * 	realVal = getNDAfromModel(model)
	 * 	metricValues.get(4).add(df.format(realVal))

	 * 	// Calculate MPC from neighbourhood shape
	 * 	calcVal = getNDAfromNHShape(partialModel)
	 * 	metricValues.get(5).add(df.format(calcVal))
	 * 	// Calculate delta
	 * 	totalDeltas.set(2, totalDeltas.get(2) + (Math.abs((calcVal - realVal) / realVal * 100)))

	 * 	// /////////////
	 * 	// Node Dimension Connectivity
	 * 	// /////////////
	 * 	// Calculate MPC from partial model
	 * 	realVal = getNDCfromModel(model)
	 * 	metricValues.get(6).add(df.format(realVal))

	 * 	// Calculate MPC from neighbourhood shape
	 * 	calcVal = getNDCfromNHShape(partialModel)
	 * 	metricValues.get(7).add(df.format(calcVal))
	 * 	// Calculate delta
	 * 	totalDeltas.set(3, totalDeltas.get(3) + (Math.abs((calcVal - realVal) / realVal * 100)))

	 * 	// /////////////
	 * 	// Edge Dimension Activity
	 * 	// /////////////
	 * 	// Calculate MPC from partial model
	 * 	realVal = getEDAfromModel(model)
	 * 	metricValues.get(8).add(df.format(realVal))

	 * 	// Calculate MPC from neighbourhood shape
	 * 	calcVal = getEDAfromNHShape(partialModel, 2, 0)
	 * 	metricValues.get(9).add(df.format(calcVal))
	 * 	// Calculate delta
	 * 	deltas.get(0).add(df.format(Math.abs((calcVal - realVal) / realVal * 100)))
	 * 	totalDeltas.set(4, totalDeltas.get(4) + (Math.abs((calcVal - realVal) / realVal * 100)))

	 * 	// Calculate MPC from neighbourhood shape
	 * 	calcVal = getEDAfromNHShape(partialModel, 2, 1)
	 * 	metricValues.get(10).add(df.format(calcVal))
	 * 	// Calculate delta
	 * 	deltas.get(1).add(df.format(Math.abs((calcVal - realVal) / realVal * 100)))
	 * 	totalDeltas.set(5, totalDeltas.get(5) + (Math.abs((calcVal - realVal) / realVal * 100)))

	 * 	// Calculate MPC from neighbourhood shape
	 * 	calcVal = getEDAfromNHShape(partialModel, 2, 2)
	 * 	metricValues.get(11).add(df.format(calcVal))
	 * 	// Calculate delta
	 * 	deltas.get(2).add(df.format(Math.abs((calcVal - realVal) / realVal * 100)))
	 * 	totalDeltas.set(6, totalDeltas.get(6) + (Math.abs((calcVal - realVal) / realVal * 100)))
	 * // /////////////
	 * // new metric
	 * // /////////////
	 * // Calculate MPC from partial model
	 * //			for (var i = 0; i < NUMMEASUREMENTS - 3; i++) {
	 * //				// Calculate MPC from neighbourhood shape
	 * //				metricVal = getMPCfromNHShape(partialModel, i)
	 * //				metricValues.get(i + 3).add(df.format(metricVal))
	 * //				val deltaVal = metricVal - Double.valueOf(metricValues.get(2).get(metricValues.get(2).length - 1))
	 * ////				deltas.add(i+3, deltas.get(i+3) + Math.abs(deltaVal)) 
	 * //				deltas.get(i + 3).add(df.format(Math.abs(deltaVal)))
	 * //
	 * //			}
	 * }

	 * // Write to .csv
	 * val headers = newArrayList("NA,Model,", "NA,Shape,", "MPC,Model,", "MPC,Shape,", "NDA,Model,", "NDA,Shape,",
	 * 	"NDC,Model,", "NDC,Shape,", "EDA,Model,", "EDA,Shape,", "EDA,Deltas,", "EDA,Deltas,", "EDA,Deltas,")
	 * var writer = new PrintWriter(outputFolder + "statsNA.csv")
	 * for (var i = 0; i < NUMNA; i++) {
	 * 	writer.append(headers.get(i))
	 * 	writer.append(String.join(",", metricValues.get(i)))
	 * 	writer.append("\n");
	 * }
	 * writer.close

	 * writer = new PrintWriter(outputFolder + "statsMPC.csv")
	 * for (var i = NUMNA; i < MetricsCalculationUsingShapes.NUMMPC; i++) {
	 * 	writer.append(headers.get(i))
	 * 	writer.append(String.join(",", metricValues.get(i)))
	 * 	writer.append("\n");
	 * }
	 * writer.close

	 * writer = new PrintWriter(outputFolder + "statsD0EDA1.csv")
	 * for (var i = 8; i < 10; i++) {
	 * 	writer.append(headers.get(i))
	 * 	writer.append(String.join(",", metricValues.get(i)))
	 * 	writer.append("\n");
	 * }
	 * writer.append(headers.get(10))
	 * writer.append(String.join(",", deltas.get(0)))
	 * writer.append("\n");

	 * writer.close

	 * writer = new PrintWriter(outputFolder + "statsD0EDA2.csv")
	 * for (var i = 8; i < 11; i += 2) {
	 * 	writer.append(headers.get(i))
	 * 	writer.append(String.join(",", metricValues.get(i)))
	 * 	writer.append("\n");
	 * }
	 * writer.append(headers.get(10))
	 * writer.append(String.join(",", deltas.get(1)))
	 * writer.append("\n");

	 * writer.close

	 * writer = new PrintWriter(outputFolder + "statsD0EDA3.csv")
	 * for (var i = 8; i < 12; i += 3) {
	 * 	writer.append(headers.get(i))
	 * 	writer.append(String.join(",", metricValues.get(i)))
	 * 	writer.append("\n");
	 * }
	 * writer.append(headers.get(10))
	 * writer.append(String.join(",", deltas.get(2)))
	 * writer.append("\n");

	 * writer.close

	 * //		writeResults(metricValues, headerList)

	 * printResults(metricValues, totalDeltas, deltas)
	 * 
	 * 
	 */
	}

	def static printResults(List<List<String>> metricValues, List<Double> totalDeltas, List<List<String>> deltas) {
		val numModels = metricValues.get(0).length
		println()
		println("Node Activity:")
		println("from Partial Model: " + metricValues.get(0))
		println("from NH Shape     : " + metricValues.get(1))
		println("       Avg % delta: " + df.format(totalDeltas.get(0) / numModels))

		println("MPC:")
		println("from Partial Model: " + metricValues.get(2))
		println("from NH Shape     : " + metricValues.get(3))
		println("       Avg % delta: " + df.format(totalDeltas.get(1) / numModels))

		println("NDA:")
		println("from Partial Model: " + metricValues.get(4))
		println("from NH Shape     : " + metricValues.get(5))
		println("       Avg % delta: " + df.format(totalDeltas.get(2) / numModels))

		println("NDC:")
		println("from Partial Model: " + metricValues.get(6))
		println("from NH Shape     : " + metricValues.get(7))
		println("       Avg % delta: " + df.format(totalDeltas.get(3) / numModels))

		println("EDA:")
		println("from Partial Model: " + metricValues.get(8))
		println("from NH Shape In  : " + metricValues.get(9))
		println("           deltas : " + deltas.get(0))
		println("       Avg % delta: " + df.format(totalDeltas.get(4) / numModels))
		println("from NH Shape Out : " + metricValues.get(10))
		println("           deltas : " + deltas.get(1))
		println("       Avg % delta: " + df.format(totalDeltas.get(5) / numModels))
		println("from NH Shape Avg : " + metricValues.get(11))
		println("           deltas : " + deltas.get(2))
		println("       Avg % delta: " + df.format(totalDeltas.get(6) / numModels))

//		println("new metric:")
//		println("from Partial Model: " + metricValues.get(4))
//		println("-----------------")
//		for (var i = 0; i < NUMMEASUREMENTS - NUMNAMPC-1; i++) {
//			println("from NH Shape " + i + "   : " + metricValues.get(i + NUMNAMPC+1))
//			println("  avg delta=" + df.format(findSum2(deltas.get(i + NUMNAMPC+1)) / deltas.get(i+3).size) + "   " + deltas.get(i + NUMNAMPC+1))
//			println("-----------------")
//		}
	}

	def static getEDAfromModel(EObject model) {
		val Map<EObject, Integer> dim2Occ = dim2NumOccurencesFromModel(model)

		print("Real  :")
		printer(dim2Occ)
		println()

		var totalEDA = Util.sum(dim2Occ.values)
		val numDims = dim2Occ.keySet.length
		val avgEDA = Double.valueOf(totalEDA) / numDims
		return avgEDA
	}

	def static getEDAfromNHShape(PartialInterpretation pm) {
		return getEDAfromNHShape(pm, 1, 0)
	}

	def static getEDAfromNHShape(PartialInterpretation pm, Integer depth, Integer vers) {
		// Get NH Shape
		val nh = neighbourhoodComputer.createRepresentation(pm, depth, Integer.MAX_VALUE, Integer.MAX_VALUE)
		val nhRep = nh.modelRepresentation as HashMap
		val gs = neighbouhood2ShapeGraph.createShapeGraph(nh, pm)

		// TODO make below map from OutgoingRelationGND to value
		// calculations
		val nodes = gs.nodes as List<GraphNodeDescriptorGND>

		val Map<String, Double> dim2Occ = new HashMap
		var newVal = 0.0
		for (node : nodes) {
			for (dim : node.outgoingEdges) {
				val dimName = dim.type
				val numNodeOcc = node.correspondingAND.lookup(nhRep) as Integer
				val numNodeChildren = dim.sourceDistrib.size

				val toNode = dim.to
				val numToNodeOcc = toNode.correspondingAND.lookup(nhRep) as Integer
				val numToNodeChildren = dim.targetDistrib.size

				var amountToAdd = 0.0

				switch vers {
					case 0:
						amountToAdd = (Util.sum(dim.sourceDistrib) * numNodeOcc / numNodeChildren) // +
//					Util.sum(dim.targetDistrib) * numToNodeOcc / numToNodeChildren) /2
					case 1:
						amountToAdd = (Util.sum(dim.targetDistrib) * numToNodeOcc / numToNodeChildren)
					default:
						amountToAdd = (Util.sum(dim.sourceDistrib) * numNodeOcc / numNodeChildren +
							Util.sum(dim.targetDistrib) * numToNodeOcc / numToNodeChildren) / 2.0
				}

				if (dim2Occ.keySet.contains(dimName)) {
					newVal = dimName.lookup(dim2Occ) + amountToAdd
				} else {
					newVal = amountToAdd
				}
				dim2Occ.put(dimName, newVal)
			}
		}
		println("Calc    :" + dim2Occ)
		// calculations
		var totalEDA = Util.sum2(dim2Occ.values)
		val numDims = dim2Occ.keySet.length
		val avgEDA = Double.valueOf(totalEDA) / numDims
		return avgEDA
	}

	def static printer(Map<EObject, Integer> map) {
		for (key : map.keySet) {
			print((key as EReferenceImpl).name + "=" + key.lookup(map) + ", ")
		}
	}


	def static printMap(Map<String, Set<String>> map) {
		for (key : map.keySet) {
			println(key + " -> " + key.lookup(map))
		}
	}

}
