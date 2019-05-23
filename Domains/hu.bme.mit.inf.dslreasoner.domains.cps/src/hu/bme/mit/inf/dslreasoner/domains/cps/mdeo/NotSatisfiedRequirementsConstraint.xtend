package hu.bme.mit.inf.dslreasoner.domains.cps.mdeo

import hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.IGuidanceFunction
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.interpreter.guidance.Solution

class NotSatisfiedRequirementsConstraint implements IGuidanceFunction {
	override getName() {
		"NotSatisfiedRequirements"
	}

	override computeFitness(Solution solution) {
		val cps = solution.model as CyberPhysicalSystem
		var int cost = 0
		for (request : cps.requests) {
			for (requirement : request.requirements) {
				cost += Math.abs(requirement.count - requirement.instances.size)
				for (app : requirement.instances) {
					if (app.type != requirement.type) {
						cost++
					}
				}
			}
		}
		cost
	}
}
