package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import org.eclipse.emf.ecore.EClass
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.Modality
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeAnalysisResult
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IntTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RealTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.StringTypeReference
import java.math.BigDecimal

abstract class TypeIndexer {
	public def CharSequence getRequiredQueries()
	public def boolean requiresTypeAnalysis()
	public def CharSequence generateInstanceOfQueries(LogicProblem problem,PartialInterpretation emptySolution,TypeAnalysisResult typeAnalysisResult)
	public def CharSequence referInstanceOf(Type type, Modality modality, String variableName)
	public def CharSequence referInstanceOf(EClass type, Modality modality, String variableName)
	
	public def dispatch CharSequence referInstanceOfByReference(ComplexTypeReference reference, Modality modality, String variableName) {
		reference.referred.referInstanceOf(modality,variableName)
	}
	public def dispatch CharSequence referInstanceOfByReference(BoolTypeReference reference, Modality modality, String variableName) {
		'''BooleanElement(«variableName»);'''
	}
	public def dispatch CharSequence referInstanceOfByReference(IntTypeReference reference, Modality modality, String variableName) {
		'''IntegerElement(«variableName»);'''
	}
	public def dispatch CharSequence referInstanceOfByReference(RealTypeReference reference, Modality modality, String variableName) {
		'''RealElement(«variableName»);'''
	}
	public def dispatch CharSequence referInstanceOfByReference(StringTypeReference reference, Modality modality, String variableName) {
		'''StringElement(«variableName»);'''
	}
	public def dispatch CharSequence referPrimitiveValue(String variableName, Boolean value) {
		'''BooleanElement.value(«variableName»,«value»);'''
	}
	public def dispatch CharSequence referPrimitiveValue(String variableName, Integer value) {
		'''IntegerElement.value(«variableName»,«value»);'''
	}
	public def dispatch CharSequence referPrimitiveValue(String variableName, BigDecimal value) {
		'''RealElement.value(«variableName»,«value»);'''
	}
	///TODO: de-escaping string literals
	public def dispatch CharSequence referPrimitiveValue(String variableName, String value) {
		'''StringElement.value(«variableName»,"«value»");'''
	}
	public def CharSequence referPrimitiveFilled(String variableName, boolean isFilled) {
		'''PrimitiveElement.valueSet(«variableName»,«isFilled»);'''
	}
}