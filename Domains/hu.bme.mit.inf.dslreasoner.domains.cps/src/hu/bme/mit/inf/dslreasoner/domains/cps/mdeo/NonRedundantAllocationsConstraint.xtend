package hu.bme.mit.inf.dslreasoner.domains.cps.mdeo

import hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.IGuidanceFunction
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.interpreter.guidance.Solution
import com.google.common.collect.HashMultiset

class NonRedundantAllocationsConstraint implements IGuidanceFunction {
	override getName() {
		"NonRedundantAllocations"
	}

	override computeFitness(Solution solution) {
		val cps = solution.model as CyberPhysicalSystem
		var int cost = 0
		for (hostType : cps.hostTypes) {
			for (host : hostType.instances) {
				val bins = HashMultiset.create
				for (app : host.applications) {
					bins.add(app.requirement)
				}
				for (entry : bins.entrySet) {
					cost += entry.count - 1	
				}
			}
		}
		cost
	}
}
