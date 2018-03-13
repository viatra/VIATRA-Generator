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
		
		//*
		deMorgan(problem)
		/*/
		rockPaperScisors(problem)
		//*/
		
		println("Problem Created");
		
		var LogicResult solution
		var LogicReasoner reasoner
		
		reasoner = new VampireSolver
		val vampireConfig = new VampireSolverConfiguration => [
			//add configuration things, in config file first
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
		
		val RPS = problem.add(TypeDefinition("RPS", false, rock, paper, scissor))
		
		val beats = problem.add(RelationDefinition("beats",[
			val x = addVar("x",RPS)
			val y = addVar("y",RPS)
			(x==rock && y==scissor)||(x==scissor && y==paper)||(x==paper && y==rock)
		]))
		
		//below needs to be added as an axiom
		val beats2 = problem.add(RelationDeclaration("beats2",RPS,RPS))
		problem.add(Assertion(Forall[
			val x = addVar("x",RPS)
			Exists[
				val y = addVar("y",RPS)
				beats2.call(x,y)
			]
		]))
	}
}