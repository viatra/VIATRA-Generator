package hu.bme.mit.inf.dslreasoner.run

import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.Modality
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.LinearTypeExpressionBuilderFactory
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns.PatternGenerator

class SatelliteHint extends Ecore2LogicTraceBasedHint {
	static val INTERFEROMETY_PAYLOAD = "hint_interferometryPayload"
	static val REMAINING_CONTENTS_KA_COMM_SUBSYSTEM = "hint_kaCommSubsystem"

	new(Ecore2Logic ecore2Logic, Ecore2Logic_Trace trace) {
		super(ecore2Logic, trace)
	}

	override getAdditionalPatterns(PatternGenerator it) '''
		pattern «INTERFEROMETY_PAYLOAD»(problem:LogicProblem, interpretation:PartialInterpretation, object:DefinedElement) {
			find interpretation(problem, interpretation);
			find mustExist(problem, interpretation, object);
			«typeIndexer.referInstanceOf("InterferometryPayload".type, Modality.MUST, "object")»
		}
		
		private pattern «REMAINING_CONTENTS_KA_COMM_SUBSYSTEM»_helper(problem:LogicProblem, interpretation:PartialInterpretation, object:DefinedElement, remainingContents:java Integer) {
			find remainingContents_commSubsystem_reference_CommunicatingElement_helper(problem, interpretation, object, remainingContents);
			«typeIndexer.referInstanceOf("SmallSat".type, Modality.MUST, "object")»
		}
		
		pattern «REMAINING_CONTENTS_KA_COMM_SUBSYSTEM»(problem:LogicProblem, interpretation:PartialInterpretation, remainingContents:java Integer) {
			find interpretation(problem, interpretation);
			remainingContents == sum find «REMAINING_CONTENTS_KA_COMM_SUBSYSTEM»_helper(problem, interpretation, _, #_);
		}
	'''

	override createConstraintUpdater(LinearTypeExpressionBuilderFactory it) {
		val interferometryPayloadCount = createBuilder.add(1, "InterferometryPayload".type).build
		val kaCommSubsystemWithoutSmallSatCount = createBuilder.add(1, "KaCommSubsystem".type).add(-2, "SmallSat".type).
			build

		val interferometryPayloadMatcher = createMatcher(INTERFEROMETY_PAYLOAD)
		val kaCommSubsystemRemainingContentsMatcher = createMatcher(REMAINING_CONTENTS_KA_COMM_SUBSYSTEM)

		return [ p |
			interferometryPayloadCount.tightenLowerBound(2 - interferometryPayloadMatcher.countMatches(p))
			kaCommSubsystemWithoutSmallSatCount.tightenUpperBound(kaCommSubsystemRemainingContentsMatcher.getCount(p))
		]
	}

}
