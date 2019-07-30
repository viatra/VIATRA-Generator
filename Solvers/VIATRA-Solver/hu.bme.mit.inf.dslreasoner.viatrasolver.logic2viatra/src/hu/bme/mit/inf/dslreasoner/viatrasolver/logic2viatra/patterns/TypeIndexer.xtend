package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IntTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RealTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.StringTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.Modality
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeAnalysisResult
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.math.BigDecimal
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
abstract class TypeIndexer {
	@Accessors(PROTECTED_GETTER) val PatternGenerator base

	def CharSequence getRequiredQueries() '''
		private pattern typeInterpretation(problem:LogicProblem, interpretation:PartialInterpretation, type:TypeDeclaration, typeInterpretation:PartialComplexTypeInterpretation) {
			find interpretation(problem,interpretation);
			LogicProblem.types(problem,type);
			PartialInterpretation.partialtypeinterpratation(interpretation,typeInterpretation);
			PartialComplexTypeInterpretation.interpretationOf(typeInterpretation,type);
		}
		
		private pattern directInstanceOf(problem:LogicProblem, interpretation:PartialInterpretation, element:DefinedElement, type:Type) {
			find interpretation(problem,interpretation);
			LogicProblem.types(problem,type);
			TypeDefinition.elements(type,element);
		} or {
			find interpretation(problem,interpretation);
			find typeInterpretation(problem,interpretation,type,typeInterpretation);
			PartialComplexTypeInterpretation.elements(typeInterpretation,element);
		}
		
		private pattern isPrimitive(element: PrimitiveElement) {
			PrimitiveElement(element);
		}
	'''

	def boolean requiresTypeAnalysis()

	def CharSequence generateInstanceOfQueries(LogicProblem problem, PartialInterpretation emptySolution,
		TypeAnalysisResult typeAnalysisResult) '''
		«FOR type : problem.types»
			«problem.generateMustInstenceOf(type, typeAnalysisResult)»
			«problem.generateMayInstanceOf(type, typeAnalysisResult)»
		«ENDFOR»
	'''

	protected def CharSequence generateMustInstenceOf(LogicProblem problem, Type type,
		TypeAnalysisResult typeAnalysisResult) '''
		/**
		 * An element must be an instance of type "«type.name»".
		 */
		private pattern «patternName(type,Modality.MUST)»(problem:LogicProblem, interpretation:PartialInterpretation, element:DefinedElement) {
			Type.name(type,"«type.name»");
			find directInstanceOf(problem,interpretation,element,type);
		}
	'''

	protected def CharSequence generateMayInstanceOf(LogicProblem problem, Type type,
		TypeAnalysisResult typeAnalysisResult)

	protected def patternName(Type type,
		Modality modality) '''«modality.toBase»InstanceOf«base.canonizeName(type.name)»'''

	def referInstanceOf(Type type, Modality modality, String variableName) {
		'''find «patternName(type,modality)»(problem,interpretation,«variableName»);'''
	}

	def referInstanceOf(EClass type, Modality modality, String variableName) {
		'''find «modality.toBase»InstanceOf«base.canonizeName('''«type.name» class''')»(problem,interpretation,«variableName»);'''
	}

	def dispatch CharSequence referInstanceOfByReference(ComplexTypeReference reference, Modality modality,
		String variableName) {
		reference.referred.referInstanceOf(modality, variableName)
	}

	def dispatch CharSequence referInstanceOfByReference(BoolTypeReference reference, Modality modality,
		String variableName) {
		'''BooleanElement(«variableName»);'''
	}

	def dispatch CharSequence referInstanceOfByReference(IntTypeReference reference, Modality modality,
		String variableName) {
		'''IntegerElement(«variableName»);'''
	}

	def dispatch CharSequence referInstanceOfByReference(RealTypeReference reference, Modality modality,
		String variableName) {
		'''RealElement(«variableName»);'''
	}

	def dispatch CharSequence referInstanceOfByReference(StringTypeReference reference, Modality modality,
		String variableName) {
		'''StringElement(«variableName»);'''
	}

	def dispatch CharSequence referPrimitiveValue(String variableName, Boolean value) {
		'''BooleanElement.value(«variableName»,«value»);'''
	}

	def dispatch CharSequence referPrimitiveValue(String variableName, Integer value) {
		'''IntegerElement.value(«variableName»,«value»);'''
	}

	def dispatch CharSequence referPrimitiveValue(String variableName, BigDecimal value) {
		'''RealElement.value(«variableName»,«value»);'''
	}

	def dispatch CharSequence referPrimitiveValue(String variableName, String value) {
		// /TODO: de-escaping string literals
		'''StringElement.value(«variableName»,"«value»");'''
	}

}
