package hu.bme.mit.inf.dslreasoner.run

import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml
import hu.bme.mit.inf.dslreasoner.visualisation.pi2graphviz.GraphvizVisualiser
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.io.File
import org.eclipse.emf.ecore.resource.Resource
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
		visualise('''D:\FASE18Meas\OneMinus_Alloy''')
	}
	
	def static void visualise(String path) {
		val file = new File(path)
		if(file.isDirectory) {
			for(subFileName : file.list) {
				(path + "/" + subFileName).visualise
			}
		} else if(file.isFile) {
			if(path.endsWith("partialinterpretation")) {
				visualiseModel(file,path)
			}
		}	
	}
	
	def static visualiseModel(File file, String fileName) {
		val list = file.name.split("\\.")
		val fileNameWithoutExtension = list.subList(0,list.length-1).join('.')
		val parent = file.parent
		
		val hasPng = new File(parent + "/" + fileNameWithoutExtension+".png").exists
		val hasGml = new File(parent + "/" + fileNameWithoutExtension+".gml").exists
		
		val workspace = new FileSystemWorkspace(parent,"")
		val model = workspace.readModel(PartialInterpretation,'''«fileNameWithoutExtension».partialinterpretation''')
		
		if(!hasGml) {
			val partialInterpretation2GML = new PartialInterpretation2Gml
			val gmlText = partialInterpretation2GML.transform(model)
			workspace.writeText('''«fileNameWithoutExtension».gml''',gmlText)
			println('''«fileNameWithoutExtension».gml''')
		}

		if(!hasPng && model.newElements.size <160) {
			val visualiser = new GraphvizVisualiser
			val visualisation = visualiser.visualiseConcretization(model)
			visualisation.writeToFile(workspace,fileNameWithoutExtension)
			println('''«fileNameWithoutExtension».png''')
		}
		
		println('''«parent»/«fileNameWithoutExtension» visualised''')
	}
}
