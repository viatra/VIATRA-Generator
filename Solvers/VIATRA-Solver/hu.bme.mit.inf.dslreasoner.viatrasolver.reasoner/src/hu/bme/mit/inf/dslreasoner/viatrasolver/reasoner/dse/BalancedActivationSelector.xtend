package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import java.util.Collection
import java.util.HashMap
import java.util.Map
import java.util.List
import java.util.Random
import java.util.ArrayList
import java.util.LinkedList
import java.util.Collections

class BalancedActivationSelector extends ActivationSelector{
	val Random r = new Random
	
	new(Random r) {
		super(r)
	}
	
	override protected internalRandomizationOfActivationIDs(Collection<Object> activationIDs) {
		val Map<String,List<Object>> urns = new HashMap
		val res = new ArrayList(activationIDs.size)
		for(activationID : activationIDs) {
			val pair = activationID as Pair<String,? extends Object>
			val name = pair.key
			val selectedUrn = urns.get(name)
			if(selectedUrn!==null) {
				selectedUrn.add(activationID)
			} else {
				val collection = new LinkedList
				collection.add(activationID)
				urns.put(name,collection)
			}
		}
		
		for(list:urns.values) {
			Collections.shuffle(list,r)
		}
		
		while(!urns.empty) {
			val randomEntry = urns.entrySet.get(r.nextInt(urns.size))
			val list = randomEntry.value
			val removedLast = list.remove(list.size-1)
			res.add(removedLast)
			if(list.empty) {
				urns.remove(randomEntry.key)
			}
		}
		return res
	}
	
}