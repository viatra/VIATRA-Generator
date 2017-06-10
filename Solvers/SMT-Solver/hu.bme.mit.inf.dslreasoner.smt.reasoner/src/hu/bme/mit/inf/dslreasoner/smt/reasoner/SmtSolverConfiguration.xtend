package hu.bme.mit.inf.dslreasoner.smt.reasoner

import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTReasoningTactic

class SmtSolverConfiguration extends LogicSolverConfiguration{
	public boolean fixRandomSeed = false
	public SMTReasoningTactic strategy = null
}
