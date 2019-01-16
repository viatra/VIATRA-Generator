package ca.mcgill.ecse.dslreasoner.vampire.test

import ca.mcgill.ecse.dslreasoner.VampireLanguageStandaloneSetup
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasoner
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolver
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolverConfiguration
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguageFactory
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireModel
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class MedicalSystem {
	def static void main(String[] args) {
		init()
		val workspace = new FileSystemWorkspace('''outputModels/''',"")
		workspace.initAndClear
		val root = load()
		println("Problem Loaded")
		
//		val rs = new ResourceSetImpl
//		val logRes = rs.createResource(URI.createFileURI("vampireMidel.tptp"))
//		
//		var vampireModel = VampireLanguageFactory.eINSTANCE.createVampireModel()
		

		
		var LogicResult solution
		var LogicReasoner reasoner
		
		reasoner = new VampireSolver
		val vampireConfig = new VampireSolverConfiguration => [
			//add configuration things, in config file first
			it.writeToFile = false
		]
		
		solution = reasoner.solve(root, vampireConfig,	workspace)
		
//		vampireModel = solution
//		
//		logRes.contents.add(vampireModel)
//		logRes.save(Collections.EMPTY_MAP)
		
		
		println("Problem Solved")
		
	}
	
	protected def static LogicProblem load() {
		val resourceSet = new ResourceSetImpl
		val resource = resourceSet.getResource(URI.createURI("inputLPs/newMedicalSystem.logicproblem"),true)
		val root = resource.contents.get(0) as LogicProblem
		root
	}
	
	protected def static void init() {
		LogiclanguagePackage.eINSTANCE.eClass
		LogicproblemPackage.eINSTANCE.eClass()
		Ecore2logicannotationsPackage.eINSTANCE.eClass()
		Viatra2LogicAnnotationsPackage.eINSTANCE.eClass()
		val reg = Resource.Factory.Registry.INSTANCE
		val map = reg.extensionToFactoryMap
		map.put("logicproblem", new XMIResourceFactoryImpl)
		map.put("tptp", new XMIResourceFactoryImpl)
		VampireLanguageStandaloneSetup.doSetup
	}
}
