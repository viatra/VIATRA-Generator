package hu.bme.mit.inf.dslreasoner.domains.cps.cplex

import com.google.common.collect.ImmutableList
import com.google.common.collect.ImmutableMap
import hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationType
import hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem
import hu.bme.mit.inf.dslreasoner.domains.cps.HostType
import hu.bme.mit.inf.dslreasoner.domains.cps.Requirement
import java.util.List
import java.util.Map

class CpsToLpTranslator {
	static val MINIMUM_MEMORY_USAGE = 0.25
	static val MINIMUM_HDD_USAGE = 0.25

	val CyberPhysicalSystem cps
	val Map<Requirement, ? extends List<String>> appInstances
	val Map<HostType, ? extends List<String>> hostInstances
	val boolean breakSymmetry

	new(CyberPhysicalSystem cps, int hostInstanceCount, boolean breakSymmetry) {
		this.cps = cps
		appInstances = createAppInstances
		hostInstances = createHostInstances(hostInstanceCount)
		this.breakSymmetry = breakSymmetry
	}

	private def createAppInstances() {
		val builder = ImmutableMap.builder
		var int i = 0
		for (req : requirements) {
			val listBuilder = ImmutableList.builder
			for (var int j = 0; j < req.count; j++) {
				listBuilder.add('''r«i»a«j»''')
			}
			builder.put(req, listBuilder.build)
			i++
		}
		builder.build
	}

	private def createHostInstances(int hostInstanceCount) {
		val builder = ImmutableMap.builder
		var int i = 0
		for (hostType : cps.hostTypes) {
			val listBuilder = ImmutableList.builder
			for (var int j = 0; j < hostInstanceCount; j++) {
				listBuilder.add('''h«i»i«j»''')
			}
			builder.put(hostType, listBuilder.build)
			i++
		}
		builder.build
	}

	def getLpProblem() {
		'''
			Minimize
				total_cost: «objective»
			Subject To
				«constraints»
			Bounds
				«bounds»
			Binary
				«binaryVariables»
			End
		'''
	}

	private def getObjective() {
		'''«FOR pair : hostInstancesWithType SEPARATOR " + "»«pair.key.cost» «pair.value.existsVariable»«ENDFOR»'''
	}

	private def getConstraints() {
		'''
			«FOR appPair : appInstancesWithType»
				«appPair.value»_allocated: «FOR host : appPair.key.possibleHostInstances SEPARATOR " + "»«getAllocatedToVariable(appPair.value, host)»«ENDFOR» = 1
				«FOR host : appPair.key.possibleHostInstances»
					«appPair.value»_to_«host»_exists: «host.existsVariable» - «getAllocatedToVariable(appPair.value, host)» >= 0
				«ENDFOR»
			«ENDFOR»
			«FOR hostPair : hostInstancesWithType»
				«hostPair.value»_mem_use: «FOR appPair : hostPair.key.possibleAppInstancesWithRequirements SEPARATOR " + "»«appPair.key.requiredMemory» «getAllocatedToVariable(appPair.value, hostPair.value)»«ENDFOR» - «hostPair.key.defaultMemory» «hostPair.value.memoryUsageVariable» = 0
				«hostPair.value»_hdd_use: «FOR appPair : hostPair.key.possibleAppInstancesWithRequirements SEPARATOR " + "»«appPair.key.requiredHdd» «getAllocatedToVariable(appPair.value, hostPair.value)»«ENDFOR» - «hostPair.key.defaultHdd» «hostPair.value.hddUsageVariable» = 0
			«ENDFOR»
			average_mem: «FOR host : allHostInstances SEPARATOR " + "»«host.memoryUsageVariable» - «MINIMUM_MEMORY_USAGE» «host.existsVariable»«ENDFOR» >= 0
			average_hdd: «FOR host : allHostInstances SEPARATOR " + "»«host.memoryUsageVariable» - «MINIMUM_HDD_USAGE» «host.existsVariable»«ENDFOR» >= 0
			«FOR reqPair : requirements.filter[count > 1].indexed»
				«FOR host : reqPair.value.type.requirements.flatMap[hostInstances.get(hostType)]»
					r«reqPair.key»_«host»_redundant: «FOR app : appInstances.get(reqPair.value) SEPARATOR " + "»«getAllocatedToVariable(app, host)»«ENDFOR» <= 1
				«ENDFOR»
			«ENDFOR»
			«IF breakSymmetry»
				«FOR hosts : hostInstances.values»
					«FOR i : 0 ..< (hosts.size - 1)»
						«hosts.get(i + 1)»_after_«hosts.get(i)»: «hosts.get(i).existsVariable» - «hosts.get(i + 1).existsVariable» >= 0
					«ENDFOR»
				«ENDFOR»
			«ENDIF»
		'''
	}

	private def getBounds() {
		'''
			«FOR host : allHostInstances»
				0 <= «host.memoryUsageVariable» <= 1
				0 <= «host.hddUsageVariable» <= 1
			«ENDFOR»
		'''
	}

	private def getBinaryVariables() {
		'''
			«FOR host : allHostInstances»
				«host.existsVariable»
			«ENDFOR»
			«FOR appPair : appInstancesWithType»
				«FOR host : appPair.key.possibleHostInstances»
					«getAllocatedToVariable(appPair.value, host)»
				«ENDFOR»
			«ENDFOR»
		'''
	}

	private def getRequirements() {
		cps.requests.flatMap[requirements]
	}

	private def getAllHostInstances() {
		hostInstances.values.flatMap[it]
	}

	private def getHostInstancesWithType() {
		hostInstances.entrySet.flatMap[pair|pair.value.map[pair.key -> it]]
	}

	private def getAppInstancesWithType() {
		appInstances.entrySet.flatMap[pair|pair.value.map[pair.key.type -> it]]
	}

	private def getPossibleHostInstances(ApplicationType appType) {
		appType.requirements.flatMap[req|hostInstances.get(req.hostType)]
	}

	private def getPossibleAppInstancesWithRequirements(HostType hostType) {
		appInstances.entrySet.flatMap [ pair |
			val resourceReq = pair.key.type.requirements.findFirst[it.hostType == hostType]
			if (resourceReq === null) {
				emptyList
			} else {
				pair.value.map[resourceReq -> it]
			}
		]
	}

	private def getExistsVariable(String hostInstance) {
		'''«hostInstance»_exists'''
	}

	private def getMemoryUsageVariable(String hostInstance) {
		'''«hostInstance»_mem'''
	}

	private def getHddUsageVariable(String hostInstance) {
		'''«hostInstance»_hdd'''
	}

	private def getAllocatedToVariable(String appInstance, String hostInstance) {
		'''«appInstance»_to_«hostInstance»'''
	}
}
