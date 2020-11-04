package hu.bme.mit.inf.dslreasoner.domains.cps.dse

import hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance
import hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem
import hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance
import hu.bme.mit.inf.dslreasoner.domains.cps.HostType
import hu.bme.mit.inf.dslreasoner.domains.cps.Request
import hu.bme.mit.inf.dslreasoner.domains.cps.Requirement
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.viatra.dse.statecode.IStateCoder
import org.eclipse.viatra.dse.statecode.IStateCoderFactory
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.xtend2.lib.StringConcatenationClient

class CpsStateCoder implements IStateCoder {
	CyberPhysicalSystem cps

	protected new() {
	}

	override init(Notifier notifier) {
		cps = switch (notifier) {
			ResourceSet: getCpsFromResourceSet(notifier)
			Resource: getCpsFromResource(notifier)
			CyberPhysicalSystem: notifier
			default: throw new IllegalArgumentException("notifier is not a CyberPhysicalSystem")
		}
	}

	private def getCpsFromResourceSet(ResourceSet resourceSet) {
		if (resourceSet.resources.empty) {
			throw new IllegalArgumentException("No Resource in ResourceSet")
		}
		val resource = resourceSet.resources.head
		getCpsFromResource(resource)
	}

	private def getCpsFromResource(Resource resource) {
		if (resource.contents.empty) {
			throw new IllegalArgumentException("No EObject in Resource")
		}
		val cps = resource.contents.head
		if (cps instanceof CyberPhysicalSystem) {
			cps
		} else {
			throw new IllegalArgumentException("EObject in Resource is not a CyberPhysicalSystem")
		}
	}

	override String createStateCode() {
		'''«createRequestsCode»«createHostTypesCode»'''
	}

	private def StringConcatenationClient createRequestsCode() {
		'''«FOR request : cps.requests»«createRequestCode(request)»«ENDFOR»'''
	}

	private def StringConcatenationClient createRequestCode(Request request) {
		'''[«FOR requirement : request.requirements»«createRequirementCode(requirement)»«ENDFOR»]'''
	}

	private def StringConcatenationClient createRequirementCode(Requirement requirement) {
		'''[«FOR app : requirement.instances SEPARATOR ","»«createAppCode(app)»«ENDFOR»]'''
	}

	private def createAppCode(ApplicationInstance app) {
		if (app.allocatedTo === null) {
			"-"
		} else {
			createMatchArgumentCode(app.allocatedTo)
		}
	}

	private def createHostTypesCode() {
		'''(«FOR hostType : cps.hostTypes SEPARATOR ","»«hostType.instances.size»«ENDFOR»)'''
	}

	override String createActivationCode(IPatternMatch match) {
		'''«match.specification.simpleName»(«FOR arg : match.toArray SEPARATOR ","»«createMatchArgumentCode(arg)»«ENDFOR»)'''
	}

	protected dispatch def String createMatchArgumentCode(Requirement requirement) {
		val request = requirement.eContainer
		if (request instanceof Request) {
			if (request.eContainer != cps) {
				throw new IllegalArgumentException("Request is not contained in the CPS")
			}
			val requestIndex = cps.requests.indexOf(request)
			val requirementIndex = request.requirements.indexOf(requirement)
			requestIndex + "." + requirementIndex
		} else {
			throw new IllegalArgumentException("Requirement is not contained in a request")
		}
	}

	protected dispatch def String createMatchArgumentCode(ApplicationInstance app) {
		val requirement = app.requirement
		if (requirement === null) {
			throw new IllegalArgumentException("Application instance is not associated with a requirement")
		}
		val instanceIndex = requirement.instances.indexOf(app)
		createMatchArgumentCode(requirement) + "." + instanceIndex
	}

	protected dispatch def String createMatchArgumentCode(HostInstance host) {
		val hostType = host.eContainer
		if (hostType instanceof HostType) {
			val hostIndex = hostType.instances.indexOf(host)
			createMatchArgumentCode(hostType) + "." + hostIndex
		} else {
			throw new IllegalArgumentException("Host is not contained in a host type")
		}
	}

	protected dispatch def String createMatchArgumentCode(HostType hostType) {
		if (hostType.eContainer != cps) {
			throw new IllegalArgumentException("Host type is not contained in the CPS")
		}
		val hostTypeIndex = cps.hostTypes.indexOf(hostType)
		hostTypeIndex.toString
	}

	protected dispatch def createMatchArgumentCode(Object object) {
		throw new IllegalArgumentException("Unknown match argument: ")
	}

	static class Factory implements IStateCoderFactory {
		override createStateCoder() {
			new CpsStateCoder
		}
	}
}
