package hu.bme.mit.inf.dslreasoner.domains.cps.mdeo

import hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.IGuidanceFunction
import uk.ac.kcl.inf.mdeoptimiser.libraries.core.optimisation.interpreter.guidance.Solution

class TooLowAverageHddConstraint implements IGuidanceFunction {
	static val THRESHOLD = 0.25
	
	override getName() {
		"TooLowAverageHdd"
	}

	override computeFitness(Solution solution) {
		val cps = solution.model as CyberPhysicalSystem
		var double sumUtilization
		var int numHosts
		for (hostType : cps.hostTypes) {
			numHosts += hostType.instances.size
			for (host : hostType.instances) {
				val utilization = ResourceUtilizationUtil.getHddUtilization(host)
				sumUtilization += (utilization as double) / hostType.defaultHdd
			}
		}
		val averageUtilization = sumUtilization / numHosts
		val difference = THRESHOLD - averageUtilization
		if (difference > 0) {
			difference
		} else {
			0
		}
	}
}
