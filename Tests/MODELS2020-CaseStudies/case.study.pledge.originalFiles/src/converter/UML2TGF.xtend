package converter

import java.io.PrintWriter
import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.Collection
import java.util.Date
import java.util.HashMap
import java.util.HashSet
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.uml2.uml.EnumerationLiteral
import org.eclipse.uml2.uml.InstanceSpecification
import org.eclipse.uml2.uml.InstanceValue
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Slot
import org.eclipse.uml2.uml.UMLPackage
import org.eclipse.uml2.uml.resource.UMLResource
import org.eclipse.emf.ecore.xmi.XMLResource

class UML2TGF {
	def static void main(String[] args) {

		// access UML
		val resourceSet = new ResourceSetImpl();
		resourceSet.packageRegistry.put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE)
		resourceSet.resourceFactoryRegistry.extensionToFactoryMap.put(UMLResource.FILE_EXTENSION,
			UMLResource.Factory.INSTANCE)

//				resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xodr",
//			new OpenDrive15ResourceFactoryImpl);
		val res = resourceSet.getResource(URI.createFileURI("instance//Instance_model_A.uml"), true);
		val docRoot = res.contents.get(0) as Model

//		val nodes = docRoot.allOwnedElements.filter [it instanceof InstanceSpecification && it instanceof EnumerationLiteral != true]
		val nodes = docRoot.allOwnedElements.filter[it instanceof InstanceSpecification]
		val allTypes = new HashSet<Object>

		for (e : nodes) {
			allTypes.add(e.class)
		}

		// create file
		val Date date = new Date(System.currentTimeMillis)
		val SimpleDateFormat format = new SimpleDateFormat("dd-HHmm");
		val formattedDate = format.format(date)
		val map = new HashMap<InstanceSpecification, Integer>
		val set = new HashSet<String>
		val unidentified = new ArrayList<Object>
		val enums = new ArrayList<Object>

		/*
		 * 		val writer = new PrintWriter("output//graph-" + formattedDate + ".tgf")

		 * 		println("begin Writing")

		 * 		// transform Nodes
		 * 		var ind = 0
		 * 		for (node : nodes) {
		 * 			val n = node as InstanceSpecification
		 * 			map.put(n, ind)

		 * 			writer.append(ind + " " + n.name + "\n")
		 * 			ind++
		 * 		}
		 * 		writer.append("#\n")

		 * //		println(node.name)
		 * //
		 * //		println(node.slots)
		 * //		val sl = node.slots
		 * //
		 * //		for (s : sl) {
		 * //			val v = s.values.get(0)
		 * //			if (v instanceof InstanceValue) {
		 * //				println(map.get(v.instance))
		 * //			} else {
		 * //				println("--" + v.class)
		 * //			}
		 * //		}
		 * 		// transform Edges
		 * 		var Slot s = null
		 * 		try {
		 * 			for (node : nodes) {
		 * 				val n = node as InstanceSpecification
		 * 				val nind = map.get(n)
		 * 				for (slot : n.slots) {
		 * 					s = slot
		 * 					var fname = "null"
		 * 					if(slot.definingFeature !== null) fname = slot.definingFeature.name
		 * 					for (v : slot.values) {
		 * 						if (v instanceof InstanceValue) {
		 * 							val vind = map.get(v.instance)

		 * 							writer.append(nind + " " + vind + " " + fname + "\n")
		 * 						}
		 * //					else {
		 * //						println("--" + v.class)
		 * //					}
		 * 					}
		 * 				}
		 * 			}
		 * 		} catch (Exception e) {
		 * 			println(s.definingFeature)
		 * 		}

		 * 		writer.close
		 println("End")*/
		val writer = new PrintWriter("output//graph-" + formattedDate + ".gml")

		println("begin Writing")
		writer.append("graph\n[\n")

		// transform Nodes
		var ind = 0
		var numNodes = nodes.length
		var numEdges = 0
		for (node : nodes) {
			val n = node as InstanceSpecification
			if(map.keySet.contains(n)) System.err.println("contained")
			map.put(n, ind)

			writer.append('''  node
  [
   id «ind»
   label "«IF n.name !== null»«n.name»«ENDIF»"
«IF n.name !== null && (n.name.contains("Household")|| n.name.contains("Household"))»     graphics
       [
         fill	"#00FF00"
       ]
         «ENDIF»
 «IF node instanceof EnumerationLiteral»     graphics
       [
         fill	"#FF0000"
       ]
         «ENDIF»
  ]
			  ''')
			ind++
		}

//		println(node.name)
//
//		println(node.slots)
//		val sl = node.slots
//
//		for (s : sl) {
//			val v = s.values.get(0)
//			if (v instanceof InstanceValue) {
//				println(map.get(v.instance))
//			} else {
//				println("--" + v.class)
//			}
//		}
		// transform Edges
		var Slot s = null
		try {
			for (node : nodes) {
//				if (node instanceof EnumerationLiteral != true) {
					val n = node as InstanceSpecification
					val nind = map.get(n)
					for (slot : n.slots) {
						s = slot
						var fname = ""
						if(slot.definingFeature !== null) fname = slot.definingFeature.name
						for (v : slot.values) {
							if (v instanceof InstanceValue) {
								val value = v as InstanceValue
								if (map.containsKey(value.instance)) {
									if (value.instance instanceof EnumerationLiteral != true) {
										val vind = map.get(value.instance)
										writer.append('''  edge
  [
   source «nind»
   target «vind»
   label "«fname»"
  ]
							  ''')
//							writer.append(nind + " " + vind + " " + fname + "\n")
										numEdges++
									} else {
										enums.add(value + " -> " + value.instance)
									}
								} else {
									unidentified.add(value + " -> " + value.instance)
								}
							} else {
								set.add(v.class.toString)
							}
						}
					}
//				}

			}
		} catch (Exception e) {
			println(s.definingFeature)
		}
//		printset("All types", allTypes)
		printset("Unhandled Edges", set)
		printset("Unidentified trgs", unidentified)
		printset("Enums:", enums)
		writer.append("]")
		writer.close
		println("End")
		println("#nodes:" + numNodes + ", #edges:" + numEdges)

	}

	static def printset(String name, Collection s) {
		println(name + ":")
		for (k : s) {
			println("- " + k)
		}
		println()
	}
}
