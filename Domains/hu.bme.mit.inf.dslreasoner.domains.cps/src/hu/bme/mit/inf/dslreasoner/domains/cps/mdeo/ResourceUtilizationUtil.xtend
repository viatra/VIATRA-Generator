package hu.bme.mit.inf.dslreasoner.domains.cps.mdeo

import hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance

class ResourceUtilizationUtil {
	private new() {
		new IllegalStateException("This is a static utility class and should not be instantiated directly.")
	}

	static def getMemoryUtilization(HostInstance host) {
		var int utilization = 0
		for (app : host.applications) {
			val req = app.type.requirements.findFirst[hostType == host.type]
			if (req !== null) {
				utilization += req.requiredMemory
			}
		}
		utilization
	}

	static def getHddUtilization(HostInstance host) {
		var int utilization = 0
		for (app : host.applications) {
			val req = app.type.requirements.findFirst[hostType == host.type]
			if (req !== null) {
				utilization += req.requiredHdd
			}
		}
		utilization
	}
}
