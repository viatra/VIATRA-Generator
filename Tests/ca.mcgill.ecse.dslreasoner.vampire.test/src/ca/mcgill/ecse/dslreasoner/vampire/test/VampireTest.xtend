package ca.mcgill.ecse.dslreasoner.vampire.test


import ca.mcgill.ecse.dslreasoner.VampireLanguageStandaloneSetup
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicProblemBuilder
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasoner
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolver
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolverConfiguration
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class VampireTest {
	
	val static extension LogicProblemBuilder builder = new LogicProblemBuilder
	
	def static void main(String[] args) {
//		val inputs = new FileSystemWorkspace('''initialModels/''',"")
		
		
		//create logic problem
		//var LogicProblem problem = builder.createProblem
		

		
		LogicproblemPackage.eINSTANCE.eClass()
		Ecore2logicannotationsPackage.eINSTANCE.eClass()
		Viatra2LogicAnnotationsPackage.eINSTANCE.eClass()
		val reg = Resource.Factory.Registry.INSTANCE
		val map = reg.extensionToFactoryMap
		map.put("logicproblem", new XMIResourceFactoryImpl)
		VampireLanguageStandaloneSetup.doSetup
		
		val workspace = new FileSystemWorkspace('''output/models/''',"")
		workspace.initAndClear
		
		// Load and create top level elements
		// Load source model
		val rs = new ResourceSetImpl
		val logicURI = URI.createFileURI("output/files/logProb.logicproblem")
		val logRes = rs.createResource(logicURI)
		
		var LogicProblem problem = builder.createProblem
		
		//*
		deMorgan(problem)
		/*/
		rockPaperScisors(problem)
		//*/
		
		logRes.contents.add(problem)
		logRes.save(Collections.EMPTY_MAP)

		//problem.add(Assertion( Y && X <=> X) )
		
		println("Problem Created");
		
		var LogicResult solution
		var LogicReasoner reasoner
		
		reasoner = new VampireSolver
		val vampireConfig = new VampireSolverConfiguration => [
			//add configuration things, in config file first
			it.writeToFile = false
		]
		
		solution = reasoner.solve(problem, vampireConfig,	workspace)
		
//		if(solution instanceof ModelResult) {
//			reasoner.getInterpretations(solution)
//		}
		//^can extract everything (ex, vars) from solver

		
		//call the solver
		
		println("Problem Solved")
		
		//output solution
		
	}
	
	static def deMorgan(LogicProblem problem) {
		
		
		var X = ConstantDeclaration(LogicBool)
		var Y = ConstantDeclaration(LogicBool)
		problem.add(X)
		problem.add(Y)
		
		//assertion is negated manually because logic problem can only handle axioms (assertions)
		//so ya
		problem.add(Assertion( !(X && Y) <=> ( !X || !Y)) )
	}
	
	static def rockPaperScisors(LogicProblem problem) {

		val rock = Element("Rock")
		val paper= Element("Paper")
		val scissor = Element("Scissor")
		
		problem.elements += rock
		problem.elements += paper
		problem.elements += scissor 
		
//		val red = Element("Red")
//		val green = Element("Green")
//		
//		problem.elements += red
//		problem.elements += green
		
		
		//val allRPS = problem.add(TypeDeclaration("allRPS", true))
		//val newRPS = problem.add(TypeDeclaration("newRPS", false))
		val oldRPS = problem.add(TypeDefinition("oldRPS", false, rock, paper, scissor)) //n+1 axioms, where n is the number of type definitions. 1. rocjk, paper, scissor are all rps. 2. every object is rps
		
//		val color = problem.add(TypeDefinition("color", false, red, green ))
		//Supertype(oldRPS,allRPS)
		//Supertype(newRPS,oldRPS)
		
		
		
		
		/* Remains
		val beats = problem.add(RelationDefinition("beats",[
			val x = addVar("x",oldRPS)
			val y = addVar("y",oldRPS)
			(x==rock && y==scissor)||(x==scissor && y==paper)||(x==paper && y==rock)
		]))
		
		/*/
		//below needs to be added as an axiom
		val beats2 = problem.add(RelationDeclaration("beats2",oldRPS,oldRPS))
		problem.add(Assertion(Forall[
			val x = addVar("x",oldRPS) 
			//x.range
			Exists[
				val y = addVar("y",oldRPS)
				beats2.call(x,y)
			]
		]))
		//*/
		
	}
}