package hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft

import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.LookupDefinition
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.MappingDefinition
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher

class LookupHandler {
	val int[] argumentIndices
	val ViatraQueryMatcher<? extends IPatternMatch> lookedUpMatcher

	new(MappingDefinition mappingDefinition, LookupDefinition lookupDefinition,
		ViatraQueryMatcher<? extends IPatternMatch> lookedUpMatcher) {
		if (lookupDefinition.eContainer != mappingDefinition) {
			throw new IllegalArgumentException("lookupDefinition must be contained in mappingDefinition")
		}
		val argumentCount = lookupDefinition.arguments.size
		if (argumentCount != lookedUpMatcher.parameterNames.length) {
			throw new IllegalArgumentException(
				"lookupDefinition (name: " + lookupDefinition.mapping?.pattern?.name +
					") must have as many arguments as lookedUpMatcher (name: " + lookedUpMatcher.patternName + ")")
		}
		argumentIndices = newIntArrayOfSize(argumentCount)
		for (var int i = 0; i < argumentCount; i++) {
			val argument = lookupDefinition.arguments.get(i)
			val argumentIndex = mappingDefinition.parameters.indexOf(argument)
			argumentIndices.set(i, argumentIndex)
		}
		this.lookedUpMatcher = lookedUpMatcher
	}

	def lookupForMatch(ComponentFaultTreeTrace faultTreeTrace, IPatternMatch match) {
		val lookedUpMatch = createLookedUpMatch(match)
		faultTreeTrace.lookup(lookedUpMatch)
	}

	private def createLookedUpMatch(IPatternMatch match) {
		val lookedUpMatch = lookedUpMatcher.newEmptyMatch
		val argumentCount = argumentIndices.length
		for (var int i = 0; i < argumentCount; i++) {
			val argumentIndex = argumentIndices.get(i)
			var argumentValue = match.get(argumentIndex)
			lookedUpMatch.set(i, argumentValue)
		}
		lookedUpMatch
	}
}
