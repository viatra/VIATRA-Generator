package ca.mcgill.ecse.dslreasoner.realistic.metrics.examples

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations.CalcC
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations.CalcEDA
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations.CalcMPC
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations.CalcMetric
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations.CalcNA
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations.CalcNDA
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations.CalcNDC
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations.CalcSQRCNT
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations.CalcSQRMAX
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations.CalcSQRNUM
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations.CalcSQROCOOL
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations.CalcSQROSZ
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations.CalcSQROSZ2
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations.CalcSQRTOT
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.io.File
import java.io.PrintWriter
import java.math.RoundingMode
import java.text.DecimalFormat
import java.util.ArrayList
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

abstract class MetricsCalculationUsingShapes {
	static val partialVisualizer = new PartialInterpretation2Gml
	private static DecimalFormat df = new DecimalFormat("0.00000");

	private static val PROGRESSPERCENTAGEJUMP = 10

	def static void main(String[] args) {
		df.roundingMode = RoundingMode.UP
		val outputFolder = "outputs//calculatedMetrics//"

		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("*", new XMIResourceFactoryImpl)
		YakindummPackage.eINSTANCE.eClass
		LinkedListPackage.eINSTANCE.eClass
		ReteEngine.getClass

		// SELECTION
		val testing = false
		val bounded = false
		val lowEnd = 0
		val highEnd = 20
		val calcTesting = "max" // max, true, false, min
		// END SELECTION
		var fileDir = ""

		var files = newArrayList( 
			"A0"
//			, "A20"
//			, "R1"
//			, "R2"
//			, "V1"
//			, "V2"
//			, "V3"
//			, "V4"
//			, "V5"
//			, "H"
		)
		if (testing) {
			files = newArrayList("test")
		}
		val metrics = new ArrayList<CalcMetric> 
//		metrics.add(new CalcNA)
//		metrics.add(new CalcMPC)
//		metrics.add(new CalcNDA)
//		metrics.add(new CalcNDC)
//		metrics.add(new CalcEDA)
//		metrics.add(new CalcC)
		metrics.add(new CalcSQRCNT)
//		metrics.add(new CalcSQRMAX)
		metrics.add(new CalcSQRNUM)
//		metrics.add(new CalcSQROCOOL)
//		metrics.add(new CalcSQROSZ)
//		metrics.add(new CalcSQROSZ2)
		metrics.add(new CalcSQRTOT)
//		
		var calcMethods = newArrayList
		switch calcTesting {
			case "max": calcMethods = newArrayList("Model", "NHLattice 0", "NHLattice 1", "NHLattice 2", "NHLattice 3")
			case "true": calcMethods = newArrayList("Model", "NHLattice 0", "NHLattice 1")
			case "false": calcMethods = newArrayList("Model", "NHLattice")
			case "min": calcMethods = newArrayList("Model")
			default: calcMethods = newArrayList("ERROR")
		}

		for (fileSelector : files) {
			switch fileSelector {
				case "A0": fileDir = "A0//models//"
				case "A20": fileDir = "A20//models//"
				case "R1": fileDir = "RandomEMF-WF+7//models//"
				case "R2": fileDir = "RandomEMF30//models//"
				case "V1": fileDir = "VS-i//models//"
				case "V2": fileDir = "VS-WF+All5//models//"
				case "V3": fileDir = "VS-WF+All6//models//"
				case "V4": fileDir = "VS-WF+All7//models//"
				case "V5": fileDir = "VS+i//models//"
				case "H" : fileDir = "Human//"
				default: fileDir = "_Test//"
			}
			var inputs = ""
			if (testing) {
				inputs = "resources//" // TESTING
			} else {
				inputs = "inputs//" + fileDir
			}
			val workspace = new FileSystemWorkspace(inputs, "")
			// Create stats storage directory if necessary
			var directoryPath = outputFolder + fileDir.split("//").get(0)
			
			new File(directoryPath).mkdirs

			// var List<List<String>> metricValues = newArrayList
			// for (var i = 0; i < 15; i++) {
			// // metric name -> (list(realMetricVals), list(NHMetricVals) ) 
			// metricValues.add(newArrayList)
			// }
			// // Where we store deltas
			// var List<Double> totalDeltas = newArrayList
			// var List<List<String>> deltas = newArrayList
			// for (var i = 0; i < NUMMEASUREMENTS; i++) {
			// deltas.add(newArrayList)
			// totalDeltas.add(0.0)
			// }
			
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
					// NOT GENERAL
					var index = 0
					for (run : workspace.allFiles) {
						if (new File(URI.createFileURI(inputs + "/" + run).toFileString).isDirectory) {
							val subWS = workspace.subWorkspace(run, "")
							if (new File(subWS.workspaceURI.toFileString).isDirectory) {
								for (file : subWS.allFiles) {
									if (index >= lowEnd && index <= highEnd) {
										listToLookThrough.add(run + "/" + file)
									}
									index++
								}
							}
						} else {
							listToLookThrough.add(run)
							index++
						}
					}

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
			for (metricClass : metrics) {
				val metricName = metricClass.class.simpleName.substring(4)
				// print and write
				println("(" + fileDir.split("//").get(0) + ") Metric: " + metricName)
				var writer = new PrintWriter(directoryPath + "//" + metricName + ".csv")
				
				//Calculate approximations
				val List<String> baseVals = newArrayList
				val List<String> expVals = newArrayList
				//End Calculate Approximation

				// realVsNH
				for (calcMethod : calcMethods) {
					// print and write
					print(metricName + " " + calcMethod + " : ")
					if (calcMethod == "Model") {
						print("    ")
					}
					writer.append(metricName + ",")
					writer.append(calcMethod)

//					var startTime = System.currentTimeMillis
					expVals.clear
					// for each file
					var fileIndex = 0
					val numFiles = listToLookThrough.length
					var currentProgress = 0
					for (fileName : listToLookThrough) {
						val nameWOExt = fileName.substring(0, fileName.indexOf("."))
						val model = workspace.readModel(EObject, fileName)
						val partialModel = Util.getPartialModel(workspace, model)
						// For visualisation
//					writer.close
//					writer = new PrintWriter(outputFolder + fileSelector + "//" + nameWOExt + ".gml")
//					writer.print(partialVisualizer.transform(partialModel))
//					writer.close
//					writer = new PrintWriter(outputFolder + fileSelector + "//" + metric + ".csv")					
						// END VIDUALISATON
						// get method and invoke
//						var methodName = "get" + metric + "from" + calcMethod
						var value = 0.0
						if (calcMethod == "Model") {
							value = metricClass.calcFromModel(model)
							baseVals.add(df.format(value))
						} else {
							// EXPERIMENTAL
							if (calcTesting == "false" || calcTesting == "min") {								
								value = metricClass.calcFromNHLattice(partialModel)
							} else {
								val depth = Integer.valueOf(calcMethod.split(" ").get(1))
								value = metricClass.calcFromNHLattice(partialModel, depth)
								expVals.add(df.format(value))
							}
						// END EXPERIMENTAL
//						
						}

						// print and write
						var valAsStr = df.format(value)
//						print(valAsStr + " ")
						writer.append("," + valAsStr)

						// PROGRESS TRACKER
						var ratioAchieved = fileIndex * 100 / numFiles
						if (ratioAchieved >= currentProgress) {
							print(currentProgress + "%-")
							currentProgress += PROGRESSPERCENTAGEJUMP
						}
						if (fileIndex == numFiles - 1) {
							print("100%")
						}
						fileIndex += 1
					// END PROGRESS TRACKER
					}
//					var duration = System.currentTimeMillis - startTime
					if (calcMethod != "Model" && calcTesting != "false" && calcTesting != "min") {
						print("  AVG Dif% : " + Util.difference(baseVals, expVals))
					}
					// print and write
					println()
//					println("    time: " + duration)
					writer.append("\n");

				}
				writer.close
				println()
			}

//			// ////////////
//			// EXPERIMENTAL
//			// ////////////
//			val METRICNAME = "SQR"
//			var writer = new PrintWriter(directoryPath + "//" + METRICNAME + "tot.csv")
//			println("Metric: " + METRICNAME)
//
//			for (var depth = -1; depth < 0; depth++) {
//				writer.append(METRICNAME + ",")
//				if (depth == -1) {
//					writer.append("Model")
//					print(METRICNAME + " Model    : ")
//
//					for (fileName : listToLookThrough) {
//						val model = workspace.readModel(EObject, fileName)
//						var value = CalcSQRtot.getSQRtotfromModel(model)
//						// print and write
//						var valAsStr = df.format(value)
//						print(valAsStr + " ")
//						writer.append(',' + valAsStr)
//					}
//					println()
//					writer.append("\n");
//
//				} else {
//					for (var version = 0; version < 3; version++) {
//						writer.append("NHLatticeD" + depth + "V" + version)
//						print(METRICNAME + " NH D" + depth + " V" + version + " : ")
//
//						for (fileName : listToLookThrough) {
//							val model = workspace.readModel(EObject, fileName)
//							val partialModel = Util.getPartialModel(workspace, model)
//							var value = CalcSQRtot.getSQRtotfromNHLattice(partialModel, depth, version)
//							// print and write
//							var valAsStr = df.format(value)
//							print(valAsStr + " ")
//							writer.append(',' + valAsStr)
//
//						}
//						println()
//						writer.append("\n");
//					}
//				}
//			}
//			writer.close
//
//		// ////////////
//		// EXPERIMENTAL
//		// ////////////
		}
		
		//Atempt to run Python
		
//		var location ="python /c start python ../../../../../../../../../MetricFigures/plotFigure.py"
//		var command = "python ";
//		var param = newArrayList
//		val Process p = Runtime.getRuntime().exec(location, null);
//		print(p)
////		Runtime.getRuntime().exec("cmd.exe /c \"" + command +  "\"", null);

	}

	def static printer(Map<EObject, Integer> map) {
		for (key : map.keySet) {
			print((key as EReferenceImpl).name + "=" + key.lookup(map) + ", ")
		}
	}

	def static printStrMap(Map<String, Integer> map) {
		for (key : map.keySet) {
			print(key + "=" + key.lookup(map) + ", ")
		}
	}

	def static printMap(Map<String, Set<String>> map) {
		for (key : map.keySet) {
			println(key + " -> " + key.lookup(map))
		}
	}

}
