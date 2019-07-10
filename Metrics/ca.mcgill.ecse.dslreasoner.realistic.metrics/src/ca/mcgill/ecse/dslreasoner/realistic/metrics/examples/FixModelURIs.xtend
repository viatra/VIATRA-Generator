package ca.mcgill.ecse.dslreasoner.realistic.metrics.examples

import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.io.File
import java.io.PrintWriter
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Paths
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class FixModelURIs {
def static void main(String[] args) {
	val location = "inputs/VS+i/models/"
	val workspace = new FileSystemWorkspace(location, "")
	YakindummPackage.eINSTANCE.eClass
	Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("*", new XMIResourceFactoryImpl)
//		YakindummPackage.eINSTANCE.eClass
	val rs = new ResourceSetImpl

	// NOT GENERAL
	for (run : workspace.allFiles) {
		if (new File(URI.createFileURI(location + run).toFileString).isDirectory) {
			val subWS = workspace.subWorkspace(run, "")
			if (new File(subWS.workspaceURI.toFileString).isDirectory) {
				for (file : subWS.allFiles) {
					val path = location + run +'/' + file
					val txt = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8)
					val newTxt = txt.replace("\"viatrasolver.domain.sgraph\"", "\"hu.bme.mit.inf.yakindumm\"")

					println(path)

					val writer = new PrintWriter(path)
					writer.append(newTxt)

					writer.close
				}
			}
		} else {
			val path = location + run
			val txt = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8)
			val newTxt = txt.replace("\"viatrasolver.domain.sgraph\"", "\"hu.bme.mit.inf.yakindumm\"")

			println(path)

			val writer = new PrintWriter(path)
			writer.append(newTxt)

			writer.close
		}

	}

//		val isParentDir = true
//
//		if (isParentDir) {
//			for (var i = 1; i < 21; i++) {
//				for (var j = 1; j < 31; j++) {
//					val path = location + "run" + i + "/" + i + "_" + j + ".xmi"
//					val uri = URI.createFileURI(path)
////				val res = rs.createResource(uri)
////				res.load(null)
////				print(res.allContents.toList)
//					val txt = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8)
//					val newTxt = txt.replace("\"viatrasolver.domain.sgraph\"", "\"hu.bme.mit.inf.yakindumm\"")
//
//					println(path)
//
//					val writer = new PrintWriter(path)
//					writer.append(newTxt)
//
//					writer.close
//
//				}
//
//			}
//		} else {
//
//			for (f : workspace.allFiles) {
//				val path = location + "/" + f
//				val txt = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8)
//				val newTxt = txt.replace("\"viatrasolver.domain.sgraph\"", "\"hu.bme.mit.inf.yakindumm\"")
//
//				println(path)
//
//				val writer = new PrintWriter(path)
//				writer.append(newTxt)
//
//				writer.close
//			}
//		}
//
	}
}
