package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import java.util.Random
import java.util.Collection
import java.util.Collections
import java.util.ArrayList

class EvenActivationSelector extends ActivationSelector {
	
	new(Random r) {
		super(r)
	}
	
	override protected internalRandomizationOfActivationIDs(Collection<Object> activationIDs) {
		val toShuffle = new ArrayList<Object>(activationIDs);
		Collections.shuffle(toShuffle);
		return toShuffle
	}
	
}