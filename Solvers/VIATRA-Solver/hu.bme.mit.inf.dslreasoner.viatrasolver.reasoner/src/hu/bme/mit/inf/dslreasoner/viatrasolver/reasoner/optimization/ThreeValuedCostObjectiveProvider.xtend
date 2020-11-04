package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization

import com.google.common.collect.ImmutableList
import com.google.common.collect.ImmutableMap
import com.google.common.collect.Lists
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IntTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RealTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.StringTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeReference
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransfomedViatraQuery
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.PolyhedronExtensionOperator
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns.ModalPatternQueries
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialBooleanInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialIntegerInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRealInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialStringInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.Scope
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.CostObjectiveConfiguration
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.CostObjectiveElementConfiguration
import java.util.Collection
import java.util.Map
import org.eclipse.viatra.dse.objectives.IObjective
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.xtend.lib.annotations.Data

@Data
class ThreeValuedCostObjectiveProviderResult {
	val Collection<IObjective> objectives
	val Collection<CostObjectiveHint> hints
	val Collection<PolyhedronExtensionOperator> extensionOperators
	val IObjective[][] leveledExtremalObjectives
	val boolean optimizationProblem
}

class ThreeValuedCostObjectiveProvider {
	static val COST_OBJECTIVE_LEVEL = 3

	val ViatraQueryEngine queryEngine
	val Map<String, ModalPatternQueries> modalRelationQueries
	val Map<String, Relation> qualifiedNameToRelationMap
	val ParameterScopeBound defaultBounds
	val ParameterScopeBound booleanBounds
	val ParameterScopeBound integerBounds
	val ParameterScopeBound realBounds
	val ParameterScopeBound stringBounds
	val Map<TypeDeclaration, ParameterScopeBound> typeDeclarationToBoundsMap

	new(ViatraQueryEngine queryEngine, PartialInterpretation interpretation,
		Map<String, ModalPatternQueries> modalRelationQueries) {
		this.queryEngine = queryEngine
		this.modalRelationQueries = modalRelationQueries
		qualifiedNameToRelationMap = ImmutableMap.copyOf(
			interpretation.problem.annotations.filter(TransfomedViatraQuery).
				toMap([patternFullyQualifiedName], [target]))
		defaultBounds = new PartialInterpretationBasedParameterScopeBound(interpretation)
		var ParameterScopeBound booleanBounds = null
		var ParameterScopeBound integerBounds = null
		var ParameterScopeBound realBounds = null
		var ParameterScopeBound stringBounds = null
		val typeDeclarationToBoundsMapBuilder = ImmutableMap.builder
		for (scope : interpretation.scopes) {
			val bounds = new ScopeBasedParameterScopeBound(scope)
			switch (typeInterpretation : scope.targetTypeInterpretation) {
				PartialBooleanInterpretation:
					if (booleanBounds === null) {
						booleanBounds = bounds
					} else {
						throw new IllegalStateException("Duplicate partial boolean interpretation")
					}
				PartialIntegerInterpretation:
					if (integerBounds === null) {
						integerBounds = bounds
					} else {
						throw new IllegalStateException("Duplicate partial integer interpretation")
					}
				PartialRealInterpretation:
					if (realBounds === null) {
						realBounds = bounds
					} else {
						throw new IllegalStateException("Duplicate partial real interpretation")
					}
				PartialStringInterpretation:
					if (stringBounds === null) {
						stringBounds = bounds
					} else {
						throw new IllegalStateException("Duplicate partial string interpretation")
					}
				PartialComplexTypeInterpretation:
					typeDeclarationToBoundsMapBuilder.put(typeInterpretation.interpretationOf, bounds)
			}
		}
		this.booleanBounds = booleanBounds ?: defaultBounds
		this.integerBounds = integerBounds ?: defaultBounds
		this.realBounds = realBounds ?: defaultBounds
		this.stringBounds = stringBounds ?: defaultBounds
		typeDeclarationToBoundsMap = typeDeclarationToBoundsMapBuilder.build
	}

	def getCostObjectives(Collection<CostObjectiveConfiguration> costObjectives) {
		val objectives = ImmutableList.<IObjective>builder
		val hints = ImmutableList.<CostObjectiveHint>builder
		val extensionOperators = ImmutableList.<PolyhedronExtensionOperator>builder
		val extremalObjectives = Lists.newArrayListWithExpectedSize(costObjectives.size)
		for (entry : costObjectives.indexed) {
			val objectiveName = '''costObjective«entry.key»'''
			val objectiveConfig = entry.value
			val costObjective = transformCostObjective(objectiveConfig, objectiveName)
			objectives.add(costObjective)
			if (objectiveConfig.findExtremum) {
				extremalObjectives += costObjective
			}
			val hint = objectiveConfig.hint
			if (hint !== null) {
				hints.add(hint)
				hint.objective = costObjective
				val extensionOperator = hint.createPolyhedronExtensionOperator(costObjective.matchers)
				if (extensionOperator !== null) {
					extensionOperators.add(extensionOperator)
				}
			}
		}
		new ThreeValuedCostObjectiveProviderResult(
			objectives.build,
			hints.build,
			extensionOperators.build,
			newArrayList(extremalObjectives),
			!extremalObjectives.empty
		)
	}

	private def transformCostObjective(CostObjectiveConfiguration configuration, String name) {
		val costElements = ImmutableMap.copyOf(configuration.elements.toMap([patternQualifiedName], [
			transformCostElement
		]))
		new ThreeValuedCostObjective(name, costElements, configuration.kind, configuration.threshold,
			COST_OBJECTIVE_LEVEL)
	}

	private def transformCostElement(CostObjectiveElementConfiguration elementConfig) {
		val relationName = elementConfig.patternQualifiedName
		val modalQueries = modalRelationQueries.get(relationName)
		if (modalQueries === null) {
			throw new IllegalArgumentException("Unknown relation queries: " + relationName)
		}
		val relation = qualifiedNameToRelationMap.get(relationName)
		if (relation === null) {
			throw new IllegalArgumentException("Unknown transformed relation: " + relationName)
		}
		val parameterBounds = ImmutableList.copyOf(relation.parameters.map[parameterBound])
		new CostElementMatchers(
			queryEngine.getMatcher(modalQueries.currentQuery),
			queryEngine.getMatcher(modalQueries.mayQuery),
			queryEngine.getMatcher(modalQueries.mustQuery),
			parameterBounds,
			elementConfig.weight
		)
	}

	private def getParameterBound(TypeReference typeReference) {
		switch (typeReference) {
			BoolTypeReference: booleanBounds
			IntTypeReference: integerBounds
			RealTypeReference: realBounds
			StringTypeReference: stringBounds
			ComplexTypeReference: typeDeclarationToBoundsMap.getOrDefault(typeReference.referred, defaultBounds)
		}
	}

	private static abstract class AbstractParameterScopeBound implements ParameterScopeBound {
		override getUpperBound() {
			val rawValue = rawUpperBound
			if (rawValue < 0) {
				Double.POSITIVE_INFINITY
			} else {
				rawValue
			}
		}

		protected def int getRawUpperBound()
	}

	@Data
	private static class ScopeBasedParameterScopeBound extends AbstractParameterScopeBound {
		val Scope scope

		override protected getRawUpperBound() {
			scope.maxNewElements
		}
	}

	@Data
	private static class PartialInterpretationBasedParameterScopeBound extends AbstractParameterScopeBound {
		val PartialInterpretation interpretation

		override protected getRawUpperBound() {
			interpretation.maxNewElements
		}
	}
}
