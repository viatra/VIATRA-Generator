package hu.bme.mit.inf.dslreasoner.domains.cps.mdeo

import hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.IGuidanceFunction
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.interpreter.guidance.Solution

class NotAllocatedAppInstancesConstraint implements IGuidanceFunction {
	override getName() {
		"NotAllocatedAppInstances"
	}

	override computeFitness(Solution solution) {
		val cps = solution.model as CyberPhysicalSystem
		var int cost = 0
		for (appType : cps.applicationTypes) {
			for (app : appType.instances) {
				if (app.allocatedTo === null || !appType.requirements.exists[hostType == app.allocatedTo.type]) {
					cost++
				}
			}
		}
		cost
	}
}
