package modes3.run

import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.Modality
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.LinearTypeConstraintHint
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.LinearTypeExpressionBuilderFactory
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns.PatternGenerator
import java.util.Map
import modes3.Modes3Package
import modes3.queries.Adjacent
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation

class Modes3TypeScopeHint implements LinearTypeConstraintHint {
	static val TURNOUT_NEIGHBOR_COUNT = "turnoutNeighborCount"

	val Type segmentType
	val Type turnoutType

	new(extension Ecore2Logic ecore2Logic, Ecore2Logic_Trace ecore2LogicTrace) {
		extension val Modes3Package = Modes3Package.eINSTANCE
		segmentType = ecore2LogicTrace.TypeofEClass(segment)
		turnoutType = ecore2LogicTrace.TypeofEClass(turnout)
	}

	override getAdditionalPatterns(extension PatternGenerator patternGenerator, Map<String, PQuery> fqnToPQuery) {
		'''
			pattern «TURNOUT_NEIGHBOR_COUNT»_helper(problem: LogicProblem, interpretation: PartialInterpretation, source: DefinedElement, target: DefinedElement) {
				find interpretation(problem, interpretation);
				find mustExist(problem, interpretation, source);
				find mustExist(problem, interpretation, target);
				«typeIndexer.referInstanceOf(turnoutType, Modality.MUST, "source")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "target")»
				«relationDefinitionIndexer.referPattern(fqnToPQuery.get(Adjacent.instance.fullyQualifiedName), #["source", "target"], Modality.MUST, true, false)»
			}
		
			pattern «TURNOUT_NEIGHBOR_COUNT»(problem: LogicProblem, interpretation: PartialInterpretation, element: DefinedElement, N) {
				find interpretation(problem, interpretation);
				find mustExist(problem, interpretation, element);
				«typeIndexer.referInstanceOf(turnoutType, Modality.MUST, "element")»
				N == count find «TURNOUT_NEIGHBOR_COUNT»_helper(problem, interpretation, element, _);
			}
		'''
	}

	override createConstraintUpdater(LinearTypeExpressionBuilderFactory builderFactory) {
		val turnoutNeighborCountMatcher = builderFactory.createMatcher(TURNOUT_NEIGHBOR_COUNT)
		val newNeighbors = builderFactory.createBuilder.add(1, segmentType).build

		return [ partialInterpretation |
			val requiredNeighbbors = turnoutNeighborCountMatcher.getRemainingCount(partialInterpretation, 3)
			newNeighbors.tightenLowerBound(requiredNeighbbors)
		]
	}

	private static def <T extends IPatternMatch> getRemainingCount(ViatraQueryMatcher<T> matcher,
		PartialInterpretation partialInterpretation, int capacity) {
		val partialMatch = matcher.newEmptyMatch
		partialMatch.set(0, partialInterpretation.problem)
		partialMatch.set(1, partialInterpretation)
		val iterator = matcher.streamAllMatches(partialMatch).iterator
		var int max = 0
		while (iterator.hasNext) {
			val match = iterator.next
			val n = (match.get(3) as Integer).intValue
			if (n < capacity) {
				val required = capacity - n
				if (max < required) {
					max = required
				}
			}
		}
		max
	}
}
