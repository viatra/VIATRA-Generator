package org.eclipse.viatra.solver.language.serializer

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.nodemodel.INode

class SolverLanguageSyntheticTokenSyntacticSequencer extends SolverLanguageSyntacticSequencer {
	
	override protected getTRANSITIVE_CLOSUREToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		"+"
	}
	
	override protected getREFLEXIVE_TRANSITIVE_CLOSUREToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		"*"
	}
	
	override protected getFULL_STOPToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		"."
	}
	
}