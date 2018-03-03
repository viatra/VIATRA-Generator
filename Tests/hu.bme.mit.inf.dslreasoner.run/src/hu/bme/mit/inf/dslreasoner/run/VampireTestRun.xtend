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
		var extension builder = new LogicProblemBuilder
		var LogicProblem problem1 = builder.createProblem
		
		var X = ConstantDeclaration(LogicBool)
		var Y = ConstantDeclaration(LogicBool)
		problem1.add(X)
		problem1.add(Y)
		
		//assertion is negated manually because logic problem can only handle axioms (assertions)
		//so ya
		problem1.add(Assertion( !(X && Y) <=> ( !X || !Y)) )
		//do this for next meeting
		
		println("Problem Created");
		
		var LogicResult solution
		var LogicReasoner reasoner
		
		//ASK OSZKAR: errors?
		reasoner = new VampireSolver
		val vampireConfig = new VampireSolverConfiguration => [
			//add configuration things, in config file first
		]
		
		solution = reasoner.solve(problem1, vampireConfig,	workspace)
		
//		if(solution instanceof ModelResult) {
//			reasoner.getInterpretations(solution)
//		}
		//^can extract everything (ex, vars) from solver

		
		//call the solver
		
		println("Problem Solved")
		
		//output solution
		
	}
}