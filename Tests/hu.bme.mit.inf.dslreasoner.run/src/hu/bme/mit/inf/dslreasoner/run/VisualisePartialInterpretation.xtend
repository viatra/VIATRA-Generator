package hu.bme.mit.inf.dslreasoner.run

import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml
import java.io.FileNotFoundException

class VisualisePartialInterpretation {
	def static void main(String[] args) {
		
		val runs = 1..10
		
		
		for(actualRun : runs) {
			for(actualSize : RunMeasurements::sizes) {
				val workspace = new FileSystemWorkspace('''output_r«actualRun»_«actualSize»/''',"")
				//val ecore2GML = new Ecore2GML
				val partialInterpretation2GML = new PartialInterpretation2Gml
				RunMeasurements.init
				var int i = 1
				var boolean fileExist = true
				while(fileExist) {
					try{
						val root = workspace.readModel(PartialInterpretation,'''solution«i».partialinterpretation''')
						val gml = partialInterpretation2GML.transform(root)
						//ecore2GML.transform(root)
						workspace.writeText('''solutionVisualisation«i».gml''',gml)
						println('''Solution «i» visualised''')
						i++
					} catch(FileNotFoundException e) {
						fileExist = false
					}
				}
						
				println('''Visualisation of «i-1» models are finished''')
			}
		}
	}	
}