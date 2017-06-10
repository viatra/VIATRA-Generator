package hu.bme.mit.inf.dslreasoner.smt.reasoner

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Constant
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Function
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicDeclaration
import java.util.HashMap
import java.util.List
import java.util.Map

class Logic2SmtMapperTrace {
	public var LogicProblem problem
	public var Logic2SmtMapper forwardMapper
	public var Logic2Smt_TypeMapperTrace typeMapperTrace

	public val Map<Relation,List<Descriptor<Relation>>> relationUnfolding = new HashMap
	public val Map<Descriptor<Relation>,SMTSymbolicDeclaration> relationMap = new HashMap
	public val Map<Function,List<Descriptor<Function>>> functionUnfolding = new HashMap
	public val Map<Descriptor<Function>,SMTSymbolicDeclaration> functionMap = new HashMap
	public val Map<Function,List<Descriptor<Constant>>> constantUnfolding = new HashMap
	public val Map<Descriptor<Constant>,SMTSymbolicDeclaration> constantMap = new HashMap
}