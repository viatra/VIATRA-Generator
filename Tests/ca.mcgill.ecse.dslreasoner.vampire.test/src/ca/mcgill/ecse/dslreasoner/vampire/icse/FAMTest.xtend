package ca.mcgill.ecse.dslreasoner.vampire.icse

import functionalarchitecture.FunctionalarchitecturePackage
import hu.bme.mit.inf.dslreasoner.domains.transima.fam.FamPatterns
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class FAMTest {
	def static void main(String[] args) {
		//Workspace setup
		val inputs = new FileSystemWorkspace('''initialModels/''', "")
		val workspace = new FileSystemWorkspace('''output/FAMTest/''', "")
		workspace.initAndClear
		
		//Logicproblem writing setup
		val reg = Resource.Factory.Registry.INSTANCE
		val map = reg.extensionToFactoryMap
		map.put("logicproblem", new XMIResourceFactoryImpl)

		println("Input and output workspaces are created")

		val metamodel = GeneralTest.loadMetamodel(FunctionalarchitecturePackage.eINSTANCE)
		val partialModel = GeneralTest.loadPartialModel(inputs, "FunctionalArchitectureModel.xmi")
		val queries = GeneralTest.loadQueries(metamodel, FamPatterns.instance)

		println("DSL loaded")
		
		GeneralTest.createAndSolveProblem(metamodel, partialModel, queries, workspace)	
	}
	
	
}
