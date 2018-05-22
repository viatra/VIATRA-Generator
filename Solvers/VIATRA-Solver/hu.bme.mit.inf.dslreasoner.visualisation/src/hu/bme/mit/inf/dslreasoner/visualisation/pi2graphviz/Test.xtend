package hu.bme.mit.inf.dslreasoner.visualisation.pi2graphviz

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class Test {
	def static void main(String[] args) {
		println("xxx")
		val workspace = new FileSystemWorkspace("input/","")
		
		PartialinterpretationPackage.eINSTANCE.eClass
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("*",new XMIResourceFactoryImpl)
		
		val model = workspace.readModel(PartialInterpretation,"solution1.partialinterpretation")
		println("loaded")
		val translator = new GraphvizVisualiser
		val visualisation = translator.visualiseConcretization(model)
		println("visualised")
		visualisation.writeToFile(workspace,"output")
		println("saved")
	}
}