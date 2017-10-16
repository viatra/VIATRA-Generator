package hu.bme.mit.inf.dslreasoner.run

import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.ModelGenerationMethod
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ModelGenerationMethodBasedGlobalConstraint
import org.eclipse.viatra.dse.base.ThreadContext
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher

class SGraphInconsistencyDetector extends ModelGenerationMethodBasedGlobalConstraint {
	
	var PartialInterpretation partialInterpretation
	var ViatraQueryMatcher<?> noEntry
	var ViatraQueryMatcher<?> entryHasNoOutgoing
	var ViatraQueryMatcher<?>  choiceHasNoOutgiong
	//var ViatraQueryMatcher<?>  choiceHasNoIncoming
	var ViatraQueryMatcher<?> noSynch
	var ViatraQueryMatcher<?> synchronizationHasNoOutgoing
	
	var ViatraQueryMatcher<?> synchronizedSiblingRegions
	var ViatraQueryMatcher<?> noStateInRegion
	
	new(ModelGenerationMethod method) {
		super(method)
	}
	
	override getName() {
		return SGraphInconsistencyDetector.simpleName
	}
	
	def private selectMatcher(ThreadContext context, String name) {
		val x = method.unfinishedWF.filter[
				it.fullyQualifiedName.equals(name)
			].head
		if(x!==null) {
			x.getMatcher(context.queryEngine)
		} else {
			return null
		}
	}
	
	def private numberOfMatches(ViatraQueryMatcher<?> matcher) {
		if(matcher!==null) {
			matcher.countMatches
		} else {
			return 0
		}
	}
	
	override init(ThreadContext context) {
		partialInterpretation = context.model as PartialInterpretation
		this.noEntry = context.selectMatcher("unfinishedBy_pattern_hu_bme_mit_inf_dslreasoner_partialsnapshot_mavo_yakindu_noEntryInRegion")
		this.entryHasNoOutgoing = context.selectMatcher("unfinishedBy_pattern_hu_bme_mit_inf_dslreasoner_partialsnapshot_mavo_yakindu_noOutgoingTransitionFromEntry")
		this.noStateInRegion = context.selectMatcher("unfinishedBy_pattern_hu_bme_mit_inf_dslreasoner_partialsnapshot_mavo_yakindu_noStateInRegion")
		this.choiceHasNoOutgiong = context.selectMatcher("unfinishedBy_pattern_hu_bme_mit_inf_dslreasoner_partialsnapshot_mavo_yakindu_choiceHasNoOutgoing")
		this.noSynch = context.selectMatcher("unfinishedBy_pattern_hu_bme_mit_inf_dslreasoner_partialsnapshot_mavo_yakindu_noSynch")
		this.synchronizedSiblingRegions = context.selectMatcher("unfinishedBy_pattern_hu_bme_mit_inf_dslreasoner_partialsnapshot_mavo_yakindu_SynchronizedRegionDoesNotHaveMultipleRegions")
		this.synchronizationHasNoOutgoing = context.selectMatcher("unfinishedBy_pattern_hu_bme_mit_inf_dslreasoner_partialsnapshot_mavo_yakindu_synchHasNoOutgoing")
	}
	
	override checkGlobalConstraint(ThreadContext context) {
		var requiredNewObjects =
			noEntry.numberOfMatches*2 +
			entryHasNoOutgoing.numberOfMatches +
			noStateInRegion.numberOfMatches +
			choiceHasNoOutgiong.numberOfMatches +
			noSynch.numberOfMatches*2 + 
			synchronizationHasNoOutgoing.numberOfMatches +
			synchronizedSiblingRegions.numberOfMatches*4 
		val availableNewObjects = partialInterpretation.maxNewElements
		val res = availableNewObjects >= requiredNewObjects
		return res
	}
	override createNew() {
		return new SGraphInconsistencyDetector(this.method)
	}
//	
//	def hasSynchronization() {
//		this.partialInterpretation.partialtypeinterpratation.
//	}
}