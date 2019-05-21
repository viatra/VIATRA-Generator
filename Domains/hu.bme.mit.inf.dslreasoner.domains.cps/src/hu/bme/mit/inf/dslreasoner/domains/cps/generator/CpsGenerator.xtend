package hu.bme.mit.inf.dslreasoner.domains.cps.generator

import hu.bme.mit.inf.dslreasoner.domains.cps.CpsFactory
import hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem
import hu.bme.mit.inf.dslreasoner.domains.cps.HostType
import java.util.Collection
import java.util.Random
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

class CpsGenerator {
	extension val CpsFactory = CpsFactory.eINSTANCE

	static val MIN_MEMORY = 1
	static val MAX_MEMORY = 6
	static val MIN_HDD = 1
	static val MAX_HDD = 30
	static val HIGH_CPU_FRACTION = 4
	static val MIN_REPLICAS = 1
	static val MAX_REPLICAS = 4

	val Random random
	val int applicationTypeCount
	val int demandFactor

	new(long randomSeed, int applicationTypeCount, int demandFactor) {
		this.random = new Random(randomSeed)
		this.applicationTypeCount = applicationTypeCount
		this.demandFactor = demandFactor
	}

	def generateCpsProblem() {
		val resourceSet = new ResourceSetImpl
		val resource = resourceSet.createResource(URI.createFileURI("dummy.dummyext"))
		createCyberPhysicalSystem => [
			val cps = it
			resource.contents += cps
			createLowCpuHostTypes
			val highCpuHostTypes = createHighCpuHostTypes
			for (var int i = 0; i < applicationTypeCount; i++) {
				if (i % HIGH_CPU_FRACTION == 0) {
					createRandomApplicationType(highCpuHostTypes)
				} else {
					createRandomApplicationType(hostTypes)
				}
			}
			for (var int i = 0; i < demandFactor; i++) {
				requests += createRequest => [
					for (appType : cps.applicationTypes) {
						requirements += createRequirement => [
							count = nextInt(CpsGenerator.MIN_REPLICAS, CpsGenerator.MAX_REPLICAS)
							type = appType
						]
					}
				]
			}
		]
	}

	private def void createRandomApplicationType(CyberPhysicalSystem it, Collection<HostType> allowedHostTypes) {
		val appType = createApplicationType
		val memory = nextInt(MIN_MEMORY, MAX_MEMORY)
		val hdd = nextInt(MIN_HDD, MAX_HDD)
		for (hostType : allowedHostTypes) {
			appType.requirements += createResourceRequirement => [
				it.hostType = hostType
				requiredMemory = memory
				requiredHdd = hdd
			]
		}
		applicationTypes += appType
	}

	private def createLowCpuHostTypes(CyberPhysicalSystem it) {
		#[
			createHostType(2, 8, 75), // m5d.large
			createHostType(4, 16, 150), // m5d.xlarge
			createHostType(3, 16, 75), // r5d.large
			createHostType(6, 32, 150) // r5d.xlarge
		]
	}

	private def createHighCpuHostTypes(CyberPhysicalSystem it) {
		#[
			createHostType(2, 4, 50), // c5d.large
			createHostType(4, 8, 100) // c5d.xlarge
		]
	}

	private def createHostType(CyberPhysicalSystem it, int cost, int memory, int hdd) {
		val hostType = createHostType => [
			it.cost = cost
			defaultMemory = memory
			defaultHdd = hdd
		]
		hostTypes += hostType
		hostType
	}

	private def nextInt(int lower, int upper) {
		lower + random.nextInt(upper - lower + 1)
	}
}
