package hu.bme.mit.inf.dslreasoner.run

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.io.File
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage
import org.eclipse.emf.ecore.resource.Resource
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml
import hu.bme.mit.inf.dslreasoner.visualisation.pi2graphviz.GraphvizVisualisation
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class VisualiseAllModelInDirectory {
	def static void main(String[] args) {
		LogiclanguagePackage.eINSTANCE.class
		LogicproblemPackage.eINSTANCE.class
		PartialinterpretationPackage.eINSTANCE.class
		Ecore2logicannotationsPackage.eINSTANCE.class
		Viatra2LogicAnnotationsPackage.eINSTANCE.class
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("*",new XMIResourceFactoryImpl)
		
		//"D:/Data/ICSE18/Yakindu-WF/Largest-by-Graph-Solver".visualiseModel
//		val folderName = new File("D:/Data/ICSE18/FAM+WF/Largest-by-Graph-Solver")
//		for(subFolderName : folderName.listFiles) {
//			subFolderName.absolutePath.visualiseModel
//		}
	}
	
	def static visualiseModel(String folderName) {
		val file = new File(folderName+"/"+"solution1.partialinterpretation")
		val hasSource = file.exists

		
		if(hasSource) {
			val hasPng = new File(folderName+"/"+"solution1.png").exists
			val hasGml = new File(folderName+"/"+"solution1.gml").exists
			
			val workspace = new FileSystemWorkspace(folderName,"")
			val model = workspace.readModel(PartialInterpretation,"solution1.partialinterpretation")
			
			if(!hasGml) {
				val partialInterpretation2GML = new PartialInterpretation2Gml
				val gmlText = partialInterpretation2GML.transform(model)
				workspace.writeText('''solution1.gml''',gmlText)
				println('''solution1.gml''')
			}

			if(!hasPng && model.newElements.size <160) {
				val visualiser = new GraphvizVisualisation
				val visualisation = visualiser.visualiseConcretization(model)
				visualisation.writeToFile(workspace,"solution1")
				println("solution1.png")
				println("Need png!")
			}
			
			println('''«folderName» visualised''')
		} else {
			println('''«folderName» missing''')
		}
	}
}
