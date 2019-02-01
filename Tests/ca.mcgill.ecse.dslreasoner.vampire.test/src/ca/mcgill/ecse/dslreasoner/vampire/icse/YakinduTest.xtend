package ca.mcgill.ecse.dslreasoner.vampire.icse

import functionalarchitecture.FunctionalarchitecturePackage
import hu.bme.mit.inf.dslreasoner.domains.y
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage

class YakinduTest {
	def static void main(String[] args) {
		//Workspace setup
		val inputs = new FileSystemWorkspace('''initialModels/''', "")
		val workspace = new FileSystemWorkspace('''output/YakinduTest/''', "")
		workspace.initAndClear
		
		//Logicproblem writing setup
		val reg = Resource.Factory.Registry.INSTANCE
		val map = reg.extensionToFactoryMap
		map.put("logicproblem", new XMIResourceFactoryImpl)

		println("Input and output workspaces are created")

		val metamodel = GeneralTest.loadMetamodel(YakindummPackage.eINSTANCE)
		val partialModel = GeneralTest.loadPartialModel(inputs, "Yakindu.xmi")
		val queries = GeneralTest.loadQueries(metamodel, 

		println("DSL loaded")
		
		GeneralTest.createAndSolveProblem(metamodel, partialModel, queries, workspace)	
	}
	
	
}
