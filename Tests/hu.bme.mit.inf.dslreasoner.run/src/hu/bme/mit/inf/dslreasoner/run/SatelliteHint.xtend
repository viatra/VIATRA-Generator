package hu.bme.mit.inf.dslreasoner.run

import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.Modality
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.LinearTypeExpressionBuilderFactory
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns.PatternGenerator

class SatelliteHint extends Ecore2LogicTraceBasedHint {
	static val INTERFEROMETY_PAYLOAD = "hint_interferometryPayload"
	static val REMAINING_CONTENTS_KA_COMM_SUBSYSTEM = "hint_kaCommSubsystem"
	static val HINT_SPACECRAFT_UHF_POSSIBLE_LINK = "hint_spacecraftWithUhfPossibleLink"
	static val HINT_SPACECRAFT_UHF_ONLY_NO_LINK = "hint_spacecraftUhfOnlyNoLink"

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
		
		private pattern hint_spacecraftNotUhfOnly(problem:LogicProblem, interpretation:PartialInterpretation, spacecraft:DefinedElement) {
			find interpretation(problem, interpretation);
			find mustExist(problem, interpretation, spacecraft);
			«typeIndexer.referInstanceOf("Spacecraft".type, Modality.MUST, "spacecraft")»
			«relationDeclarationIndexer.referRelation("CommunicatingElement".relation("commSubsystem"), "spacecraft", "comm", Modality.MAY)»
			neg «typeIndexer.referInstanceOf("UHFCommSubsystem".type, Modality.MUST, "comm")»
		}
		
		private pattern hint_spacecraftWithUhf(problem:LogicProblem, interpretation:PartialInterpretation, spacecraft:DefinedElement) {
			find interpretation(problem, interpretation);
			find mustExist(problem, interpretation, spacecraft);
			«typeIndexer.referInstanceOf("Spacecraft".type, Modality.MUST, "spacecraft")»
			«relationDeclarationIndexer.referRelation("CommunicatingElement".relation("commSubsystem"), "spacecraft", "comm", Modality.MUST)»
			«typeIndexer.referInstanceOf("UHFCommSubsystem".type, Modality.MUST, "comm")»
		}
		
		pattern «HINT_SPACECRAFT_UHF_POSSIBLE_LINK»(problem:LogicProblem, interpretation:PartialInterpretation) {
			find hint_spacecraftWithUhf(problem, interpretation, spacecraft);
			find hint_spacecraftNotUhfOnly(problem, interpretation, spacecraft);
		}
		
		pattern «HINT_SPACECRAFT_UHF_ONLY_NO_LINK»(problem:LogicProblem, interpretation:PartialInterpretation) {
			find interpretation(problem, interpretation);
			find mustExist(problem, interpretation, spacecraft);
			«typeIndexer.referInstanceOf("Spacecraft".type, Modality.MUST, "spacecraft")»
			neg find hint_spacecraftNotUhfOnly(problem, interpretation, spacecraft);
			find currentInRelation_pattern_hu_bme_mit_inf_dslreasoner_domains_satellite_queries_noLinkToGroundStation(problem, interpretation, spacecraft);
		}
	'''

	override createConstraintUpdater(LinearTypeExpressionBuilderFactory it) {
		val interferometryPayloadCount = createBuilder.add(1, "InterferometryPayload".type).build
		val kaCommSubsystemWithoutSmallSatCount = createBuilder.add(1, "KaCommSubsystem".type).add(-2, "SmallSat".type).
			build
		val uhfCommSubsystemCount = createBuilder.add(1, "UHFCommSubsystem".type).build

		val interferometryPayloadMatcher = createMatcher(INTERFEROMETY_PAYLOAD)
		val kaCommSubsystemRemainingContentsMatcher = createMatcher(REMAINING_CONTENTS_KA_COMM_SUBSYSTEM)
		val uhfPossibleLinkMatcher = createMatcher(HINT_SPACECRAFT_UHF_POSSIBLE_LINK)
		val uhfNoLinkMatcher = createMatcher(HINT_SPACECRAFT_UHF_ONLY_NO_LINK)

		return [ p |
			interferometryPayloadCount.tightenLowerBound(2 - interferometryPayloadMatcher.countMatches(p))
			kaCommSubsystemWithoutSmallSatCount.tightenUpperBound(kaCommSubsystemRemainingContentsMatcher.getCount(p))
			if (uhfPossibleLinkMatcher.countMatches(p) == 0 && uhfNoLinkMatcher.countMatches(p) >= 1) {
				uhfCommSubsystemCount.tightenLowerBound(1)
			}
		]
	}

}
