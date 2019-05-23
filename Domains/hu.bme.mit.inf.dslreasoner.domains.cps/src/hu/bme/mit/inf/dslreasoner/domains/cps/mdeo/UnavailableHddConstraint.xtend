package hu.bme.mit.inf.dslreasoner.domains.cps.mdeo

import hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.IGuidanceFunction
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.interpreter.guidance.Solution

class UnavailableHddConstraint implements IGuidanceFunction {
	override getName() {
		"UnavailableHdd"
	}

	override computeFitness(Solution solution) {
		val cps = solution.model as CyberPhysicalSystem
		var int cost = 0
		for (hostType : cps.hostTypes) {
			for (host : hostType.instances) {
				val utilization = ResourceUtilizationUtil.getHddUtilization(host)
				val difference = utilization - hostType.defaultHdd
				if (difference > 0) {
					cost += difference
				}
			}
		}
		cost
	}

}
