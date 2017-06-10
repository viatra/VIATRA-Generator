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
	var ViatraQueryMatcher<?> synchronizationHasNoOutgoing
	var ViatraQueryMatcher<?> noSynch
	var ViatraQueryMatcher<?> synchronizedSiblingRegions
	var ViatraQueryMatcher<?> noStateInRegion
	
	new(ModelGenerationMethod method) {
		super(method)
	}
	
	override getName() {
		return SGraphInconsistencyDetector.simpleName
	}
	
	override init(ThreadContext context) {
		partialInterpretation = context.model as PartialInterpretation
		
		try{
			this.noEntry = method.unfinishedWF.filter[
				it.fullyQualifiedName.equals("unfinishedBy_pattern_hu_bme_mit_inf_dslreasoner_partialsnapshot_mavo_yakindu_noEntryInRegion")
			].head.getMatcher(context.queryEngine)
			
			this.entryHasNoOutgoing = method.unfinishedWF.filter[
				it.fullyQualifiedName.equals("unfinishedBy_pattern_hu_bme_mit_inf_dslreasoner_partialsnapshot_mavo_yakindu_noOutgoingTransitionFromEntry")
			].head.getMatcher(context.queryEngine)
			
			this.synchronizationHasNoOutgoing = method.unfinishedWF.filter[
				it.fullyQualifiedName.equals("unfinishedBy_pattern_hu_bme_mit_inf_dslreasoner_partialsnapshot_mavo_yakindu_hasNoOutgoing")
			].head.getMatcher(context.queryEngine)
			
			this.noSynch = method.unfinishedWF.filter[
				it.fullyQualifiedName.equals("unfinishedBy_pattern_hu_bme_mit_inf_dslreasoner_partialsnapshot_mavo_yakindu_noSynch")
			].head.getMatcher(context.queryEngine)
			
			this.synchronizedSiblingRegions = method.unfinishedWF.filter[
				it.fullyQualifiedName.equals("unfinishedBy_pattern_hu_bme_mit_inf_dslreasoner_partialsnapshot_mavo_yakindu_SynchronizedRegionDoesNotHaveMultipleRegions")
			].head.getMatcher(context.queryEngine)
			
			this.noStateInRegion = method.unfinishedWF.filter[
				it.fullyQualifiedName.equals("unfinishedBy_pattern_hu_bme_mit_inf_dslreasoner_partialsnapshot_mavo_yakindu_noStateInRegion")
			].head.getMatcher(context.queryEngine)
		} catch(Exception e) {	}
	}
	
	override checkGlobalConstraint(ThreadContext context) {
		if(noEntry !== null) {
			val requiredNewObjects = 
				noEntry.countMatches*2 +
				entryHasNoOutgoing.countMatches + 
				synchronizationHasNoOutgoing.countMatches +
				noSynch.countMatches*2 + 
				synchronizedSiblingRegions.countMatches*4 
				noStateInRegion.countMatches
			val availableNewObjects = partialInterpretation.maxNewElements
			val res = availableNewObjects >= requiredNewObjects
			//println('''[«availableNewObjects» >= «requiredNewObjects»] = «res»''')
			return res
		} else {
			true
		}
		
	}
	override createNew() {
		return new SGraphInconsistencyDetector(this.method)
	}
//	
//	def hasSynchronization() {
//		this.partialInterpretation.partialtypeinterpratation.
//	}
}