package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.Modality
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeAnalysisResult

class TypeIndexerWithPreliminaryTypeAnalysis extends TypeIndexer {
	new(PatternGenerator base) {
		super(base)
	}

	override requiresTypeAnalysis() { true }

	protected override generateMayInstanceOf(LogicProblem problem, Type type, TypeAnalysisResult typeAnalysisResult) {
		val precondition = typeAnalysisResult?.mayNewTypePreconditions?.get(type)
		val inhibitorTypes = precondition?.inhibitorTypes
		'''
			private pattern scopeDisallowsNew«base.canonizeName(type.name)»(problem:LogicProblem, interpretation:PartialInterpretation) {
				find interpretation(problem,interpretation);
				PartialInterpretation.scopes(interpretation,scope);
				Scope.targetTypeInterpretation(scope,typeInterpretation);
				Scope.maxNewElements(scope,0);
				PartialComplexTypeInterpretation.interpretationOf(typeInterpretation,type);
				Type.name(type,"«type.name»");
			}
			
			/**
			 * An element may be an instance of type "«type.name»".
			 */
			private pattern «patternName(type,Modality.MAY)»(problem:LogicProblem, interpretation:PartialInterpretation, element:DefinedElement)
			«IF inhibitorTypes !== null»
				{
					find interpretation(problem,interpretation);
					PartialInterpretation.newElements(interpretation,element);
					«FOR inhibitorType : inhibitorTypes»
						neg «referInstanceOf(inhibitorType,Modality.MUST,"element")»
					«ENDFOR»
					neg find scopeDisallowsNew«base.canonizeName(type.name)»(problem, interpretation);
					neg find isPrimitive(element);
				} or {
					find interpretation(problem,interpretation);
					PartialInterpretation.openWorldElements(interpretation,element);
					«FOR inhibitorType : inhibitorTypes»
						neg «referInstanceOf(inhibitorType,Modality.MUST,"element")»
					«ENDFOR»
					neg find scopeDisallowsNew«base.canonizeName(type.name)»(problem, interpretation);
					neg find isPrimitive(element);
				} or
			«ENDIF»
			{ «referInstanceOf(type,Modality.MUST,"element")» }
		'''
	}
}
