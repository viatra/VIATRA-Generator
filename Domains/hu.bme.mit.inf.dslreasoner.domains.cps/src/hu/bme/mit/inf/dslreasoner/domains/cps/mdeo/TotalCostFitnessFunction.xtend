package hu.bme.mit.inf.dslreasoner.domains.cps.mdeo

import hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.IGuidanceFunction
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.interpreter.guidance.Solution

class TotalCostFitnessFunction implements IGuidanceFunction {
	override getName() {
		"TotalCost"
	}

	override computeFitness(Solution solution) {
		val cps = solution.model as CyberPhysicalSystem
		var int cost = 0
		for (appType : cps.applicationTypes) {
			cost += 5 * appType.instances.size
		}
		for (hostType : cps.hostTypes) {
			cost += hostType.cost * hostType.instances.size
		}
		cost
	}
}
