package hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft

import com.google.common.collect.ImmutableMap
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.LookupDefinition
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.MappingDefinition
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.TransformationDefinition
import java.util.Map
import org.eclipse.viatra.query.patternlanguage.emf.specification.SpecificationBuilder
import org.eclipse.viatra.query.runtime.api.GenericQueryGroup
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher

class MappingQueries {
	val Map<MappingDefinition, ViatraQueryMatcher<? extends IPatternMatch>> matchersMap

	new(TransformationDefinition transformationDefinition, ViatraQueryEngine viatraQueryEngine) {
		val specificationBuilder = new SpecificationBuilder
		val querySpecificationsMap = transformationDefinition.mappingDefinitions.toMap([it], [
			specificationBuilder.getOrCreateSpecification(pattern)
		])
		GenericQueryGroup.of(querySpecificationsMap.values).prepare(viatraQueryEngine)
		matchersMap = ImmutableMap.copyOf(querySpecificationsMap.mapValues[getMatcher(viatraQueryEngine)])
	}

	def getMatcher(MappingDefinition mappingDefinition) {
		val matcher = matchersMap.get(mappingDefinition)
		if (matcher === null) {
			throw new IllegalArgumentException("Unknown mapping definition: " + mappingDefinition)
		}
		matcher
	}
	
	def createLookupHandler(MappingDefinition mappingDefinition, LookupDefinition lookupDefinition) {
		val lookedUpMatcher = getMatcher(lookupDefinition.mapping)
		new LookupHandler(mappingDefinition, lookupDefinition, lookedUpMatcher)
	}
}
