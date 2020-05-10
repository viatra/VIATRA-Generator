package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import java.util.ArrayList
import java.util.Collection
import java.util.Random

abstract class ActivationSelector {
	long runtime = 0
	protected val Random r
	new(Random r) {
		this.r = r
	}
	
	def randomizeActivationIDs(Collection<Object> activationIDs) {
		val startTime = System.nanoTime
		val res = internalRandomizationOfActivationIDs(activationIDs)
		runtime+= System.nanoTime-startTime
		return res
	}
	def protected ArrayList<Object> internalRandomizationOfActivationIDs(Collection<Object> activationIDs);
	def getRuntime(){
		return runtime
	}
}