package hu.bme.mit.inf.dslreasoner.logic.model.builder

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Assertion
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Constant
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Function
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TermDescription
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem

class TracedLogicProblem {
	val LogicProblemBuilder builder = new LogicProblemBuilder
	val LogicProblem problem = builder.createProblem
	
	def public getProblem() { return problem }
	
	def public add(TypeDeclaration type) { builder.add(problem,type) }
	def public add(TypeDefinition type) { builder.add(problem,type) }
	def public add(Function function) { builder.add(problem,function) }
	def public add(FunctionDescription functionDescription) { builder.add(problem,functionDescription) }
	def public add(Relation relation) { builder.add(problem, relation) }
	def public add(Constant constant) { builder.add(problem, constant) }
	def public add(Assertion assertion) { builder.add(problem,assertion) }
	def public add(TermDescription termDescription) { builder.add(problem,termDescription) }
}
