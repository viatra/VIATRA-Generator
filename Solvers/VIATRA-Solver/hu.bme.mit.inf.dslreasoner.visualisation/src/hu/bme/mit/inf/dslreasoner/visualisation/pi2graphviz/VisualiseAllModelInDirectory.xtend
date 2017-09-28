package hu.bme.mit.inf.dslreasoner.visualisation.pi2graphviz

import java.io.File

class VisualiseAllModelInDirectory {
	def static void main(String[] args) {
		
	}
	
	def static visualiseModel(String folderName) {
		val file = new File(folderName+"/"+"solution1.partialinterpretation")
		val png = new File(folderName+"/"+"solution1.png")
		val gml = new File(folderName+"/"+"solution1.gml")
		
	}
}