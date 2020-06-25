package hu.bme.mit.inf.dslreasoner.run

import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.LinearTypeExpressionBuilderFactory
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns.PatternGenerator

class SGraphHint extends Ecore2LogicTraceBasedHint {
	new(Ecore2Logic ecore2Logic, Ecore2Logic_Trace trace) {
		super(ecore2Logic, trace)
	}

	override getAdditionalPatterns(extension PatternGenerator patternGenerator) {
		""
	}

	override createConstraintUpdater(LinearTypeExpressionBuilderFactory it) {
		val newEntriesWithoutRegionCount = createBuilder.add(1, "Entry".type).add(-1, "Region".type).build
		val newStatesWithoutRegionCount = createBuilder.add(1, "State".type).add(-1, "Region".type).build
		val newTransitionWithoutNeedsOutgoingCount = createBuilder.add(1, "Transition".type).add(-1, "Entry".type).
			add(-1, "Choice".type).build
		val newTransitionWithoutNeedsIncomingCount = createBuilder.add(1, "Transition".type).add(-1, "Choice".type).
			build

		val regionsWithoutEntryMatcher = createMatcher(
			"unfinishedBy_pattern_hu_bme_mit_inf_dslreasoner_partialsnapshot_mavo_yakindu_noEntryInRegion")
		val regionsWithoutStateMatcher = createMatcher(
			"unfinishedBy_pattern_hu_bme_mit_inf_dslreasoner_partialsnapshot_mavo_yakindu_noStateInRegion")
		val entryHasNoOutgoingMatcher = createMatcher(
			"unfinishedBy_pattern_hu_bme_mit_inf_dslreasoner_partialsnapshot_mavo_yakindu_noOutgoingTransitionFromEntry")
		val choiceHasNoOutgoingMatcher = createMatcher(
			"unfinishedBy_pattern_hu_bme_mit_inf_dslreasoner_partialsnapshot_mavo_yakindu_choiceHasNoOutgoing")
		val choiceHasNoIncomingMatcher = createMatcher(
			"unfinishedBy_pattern_hu_bme_mit_inf_dslreasoner_partialsnapshot_mavo_yakindu_choiceHasNoIncoming")
		val transitionWithoutTargetMatcher = createMatcher("unfinishedLowerMultiplicity_target_reference_Transition")

		return [ p |
			newEntriesWithoutRegionCount.assertEqualsTo(regionsWithoutEntryMatcher.countMatches(p))
			newStatesWithoutRegionCount.tightenLowerBound(regionsWithoutStateMatcher.countMatches(p))
			newTransitionWithoutNeedsOutgoingCount.tightenLowerBound(
				entryHasNoOutgoingMatcher.countMatches(p) + choiceHasNoOutgoingMatcher.countMatches(p))
			newTransitionWithoutNeedsIncomingCount.tightenLowerBound(
				choiceHasNoIncomingMatcher.countMatches(p) - transitionWithoutTargetMatcher.getCount(p))
		]
	}
}
