package hu.bme.mit.inf.dslreasoner.run

import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicProblemBuilder
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasoner
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.VampireSolver
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.VampireSolverConfiguration
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace

class VampireTestRun {
	
	val static extension LogicProblemBuilder builder = new LogicProblemBuilder
	
	def static void main(String[] args) {
//		val inputs = new FileSystemWorkspace('''initialModels/''',"")
		val workspace = new FileSystemWorkspace('''outputModels/''',"")
		workspace.initAndClear
		
		//create logic problem
		var LogicProblem problem = builder.createProblem
		
		
		
		/*
		deMorgan(problem)
		/*/
		rockPaperScisors(problem)
		//*/
		

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
		
		
		val allRPS = problem.add(TypeDeclaration("allRPS", true))
		val newRPS = problem.add(TypeDeclaration("newRPS", false))
		val oldRPS = problem.add(TypeDefinition("oldRPS", false, rock, paper, scissor)) //n+1 axioms, where n is the number of type definitions. 1. rocjk, paper, scissor are all rps. 2. every object is rps
		
//		val color = problem.add(TypeDefinition("color", false, red, green ))
		Supertype(oldRPS,allRPS)
		Supertype(newRPS,oldRPS)
		
//		val beats = problem.add(RelationDefinition("beats",[
//			val x = addVar("x",oldRPS)
//			val y = addVar("y",oldRPS)
//			(x==rock && y==scissor)||(x==scissor && y==paper)||(x==paper && y==rock)
//		]))
//		
//		//below needs to be added as an axiom
//		val beats2 = problem.add(RelationDeclaration("beats2",oldRPS,oldRPS))
//		problem.add(Assertion(Forall[
//			val x = addVar("x",oldRPS)
//			Exists[
//				val y = addVar("y",oldRPS)
//				beats2.call(x,y)
//			]
//		]))
	}
}