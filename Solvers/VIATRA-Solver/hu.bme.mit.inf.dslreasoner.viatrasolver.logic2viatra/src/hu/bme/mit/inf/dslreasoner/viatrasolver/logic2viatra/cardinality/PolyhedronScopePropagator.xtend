package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality

import com.google.common.collect.ImmutableList
import com.google.common.collect.ImmutableMap
import com.google.common.collect.ImmutableSet
import com.google.common.collect.Maps
import com.google.common.collect.Sets
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.ModelGenerationStatistics
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns.UnifinishedMultiplicityQueries
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialPrimitiveInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.Scope
import java.util.ArrayDeque
import java.util.ArrayList
import java.util.Collection
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.query.runtime.emf.EMFScope
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

class PolyhedronScopePropagator extends TypeHierarchyScopePropagator {
	val boolean updateHeuristic
	val Map<Scope, LinearBoundedExpression> scopeBounds
	val LinearBoundedExpression topLevelBounds
	val Polyhedron polyhedron
	val PolyhedronScopePropagatorStrategy strategy
	val Set<Relation> relevantRelations
	List<RelationConstraintUpdater> updaters = emptyList

	new(PartialInterpretation p, ModelGenerationStatistics statistics, Set<? extends Type> possibleNewDynamicTypes,
		Map<RelationMultiplicityConstraint, UnifinishedMultiplicityQueries> unfinishedMultiplicityQueries,
		IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> hasElementInContainmentQuery,
		Map<String, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> allPatternsByName,
		Collection<LinearTypeConstraintHint> hints, PolyhedronScopePropagatorStrategy strategy,
		boolean propagateRelations, boolean updateHeuristic) {
		super(p, statistics)
		this.updateHeuristic = updateHeuristic
		this.strategy = strategy
		val builder = new PolyhedronBuilder(p)
		builder.buildPolyhedron(possibleNewDynamicTypes)
		scopeBounds = builder.scopeBounds
		topLevelBounds = builder.topLevelBounds
		polyhedron = builder.polyhedron
		strategy.setPolyhedron(polyhedron, builder.typeBounds, builder.expressionsCache)
		propagateAllScopeConstraints()
		if (propagateRelations) {
			val maximumNumberOfNewNodes = topLevelBounds.upperBound
			if (maximumNumberOfNewNodes === null) {
				throw new IllegalStateException("Could not determine maximum number of new nodes, it may be unbounded")
			}
			if (maximumNumberOfNewNodes <= 0) {
				throw new IllegalStateException("Maximum number of new nodes is not positive")
			}
			builder.buildMultiplicityConstraints(unfinishedMultiplicityQueries, hasElementInContainmentQuery,
				allPatternsByName, hints, maximumNumberOfNewNodes)
			relevantRelations = builder.relevantRelations
			updaters = builder.updaters
		} else {
			relevantRelations = emptySet
		}
	}

	override void doPropagateAllScopeConstraints() {
		super.doPropagateAllScopeConstraints()
		resetBounds()
		populatePolyhedronFromScope()
//		println(polyhedron)
		if (strategy.saturate) {
			populateScopesFromPolyhedron()
		} else {
			setScopesInvalid()
		}
//		println(polyhedron)
		if (updateHeuristic) {
			copyScopeBoundsToHeuristic()
		}
	}

	override isPropagationNeededAfterAdditionToRelation(Relation r) {
		relevantRelations.contains(r) || strategy.isRelevantRelation(r) || super.isPropagationNeededAfterAdditionToRelation(r)
	}

	override isQueryEngineFlushRequiredBeforePropagation() {
		true
	}

	def resetBounds() {
		for (dimension : polyhedron.dimensions) {
			dimension.lowerBound = 0
			dimension.upperBound = null
		}
		for (constraint : polyhedron.constraints) {
			constraint.lowerBound = null
			constraint.upperBound = null
		}
	}

	private def populatePolyhedronFromScope() {
		topLevelBounds.tightenLowerBound(partialInterpretation.minNewElements)
		if (partialInterpretation.maxNewElements >= 0) {
			topLevelBounds.tightenUpperBound(partialInterpretation.maxNewElements)
		}
		for (pair : scopeBounds.entrySet) {
			val scope = pair.key
			val bounds = pair.value
			bounds.tightenLowerBound(scope.minNewElements)
			if (scope.maxNewElements >= 0) {
				bounds.tightenUpperBound(scope.maxNewElements)
			}
		}
		for (updater : updaters) {
			updater.update(partialInterpretation)
		}
	}

	private def populateScopesFromPolyhedron() {
		checkBounds(topLevelBounds)
		if (partialInterpretation.minNewElements > topLevelBounds.lowerBound) {
			throw new IllegalArgumentException('''Lower bound of «topLevelBounds» smaller than top-level scope: «partialInterpretation.minNewElements»''')
		} else if (partialInterpretation.minNewElements != topLevelBounds.lowerBound) {
			partialInterpretation.minNewElements = topLevelBounds.lowerBound
		}
		val topLevelUpperBound = topLevelBounds.upperBound ?: -1
		if (partialInterpretation.maxNewElements >= 0 && topLevelUpperBound >= 0 &&
			partialInterpretation.maxNewElements < topLevelUpperBound) {
			throw new IllegalArgumentException('''Upper bound of «topLevelBounds» larger than top-level scope: «partialInterpretation.maxNewElements»''')
		} else if (partialInterpretation.maxNewElements != topLevelUpperBound) {
			partialInterpretation.maxNewElements = topLevelUpperBound
		}
		for (pair : scopeBounds.entrySet) {
			val scope = pair.key
			val bounds = pair.value
			checkBounds(bounds)
			if (scope.minNewElements > bounds.lowerBound) {
				throw new IllegalArgumentException('''Lower bound of «bounds» smaller than «scope.targetTypeInterpretation» scope: «scope.minNewElements»''')
			} else if (scope.minNewElements != bounds.lowerBound) {
				scope.minNewElements = bounds.lowerBound
			}
			val upperBound = bounds.upperBound ?: -1
			if (scope.maxNewElements >= 0 && upperBound >= 0 && scope.maxNewElements < upperBound) {
				throw new IllegalArgumentException('''Upper bound of «bounds» larger than «scope.targetTypeInterpretation» scope: «scope.maxNewElements»''')
			} else if (scope.maxNewElements != upperBound) {
				scope.maxNewElements = upperBound
			}
		}
	}

	private def checkBounds(LinearBoundedExpression bounds) {
		if (bounds.lowerBound === null) {
			throw new IllegalArgumentException("Infinite lower bound: " + bounds)
		} else if (bounds.lowerBound < 0) {
			throw new IllegalArgumentException("Negative lower bound: " + bounds)
		}
		if (bounds.upperBound !== null && bounds.upperBound < 0) {
			throw new IllegalArgumentException("Negative upper bound: " + bounds)
		}
	}

	@FinalFieldsConstructor
	private static class PolyhedronBuilder implements LinearTypeExpressionBuilderFactory {
		static val INFINITY_SCALE = 10

		val PartialInterpretation p

		Map<Type, Dimension> instanceCounts
		Map<Type, Map<Dimension, Integer>> subtypeDimensions
		Map<Map<Dimension, Integer>, LinearBoundedExpression> expressionsCache
		Map<Type, LinearBoundedExpression> typeBounds
		int infinity
		ViatraQueryEngine queryEngine
		Map<String, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> allPatternsByName
		ImmutableList.Builder<RelationConstraintUpdater> updatersBuilder

		Map<Scope, LinearBoundedExpression> scopeBounds
		LinearBoundedExpression topLevelBounds
		Polyhedron polyhedron
		Set<Relation> relevantRelations
		List<RelationConstraintUpdater> updaters

		def buildPolyhedron(Set<? extends Type> possibleNewDynamicTypes) {
			instanceCounts = possibleNewDynamicTypes.toInvertedMap[new Dimension(name, 0, null)]
			val types = p.problem.types
			expressionsCache = Maps.newHashMapWithExpectedSize(types.size)
			subtypeDimensions = types.toInvertedMap[findSubtypeDimensions.toInvertedMap[1]]
			typeBounds = ImmutableMap.copyOf(subtypeDimensions.mapValues[toExpression])
			scopeBounds = buildScopeBounds
			topLevelBounds = instanceCounts.values.toInvertedMap[1].toExpression
			val dimensions = ImmutableList.copyOf(instanceCounts.values)
			val expressionsToSaturate = ImmutableList.copyOf(scopeBounds.values)
			polyhedron = new Polyhedron(dimensions, new ArrayList, expressionsToSaturate)
			addCachedConstraintsToPolyhedron()
		}

		def buildMultiplicityConstraints(
			Map<RelationMultiplicityConstraint, UnifinishedMultiplicityQueries> constraints,
			IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> hasElementInContainmentQuery,
			Map<String, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> allPatternsByName,
			Collection<LinearTypeConstraintHint> hints, int maximumNuberOfNewNodes) {
			infinity = if (maximumNuberOfNewNodes <= Integer.MAX_VALUE / INFINITY_SCALE) {
				maximumNuberOfNewNodes * INFINITY_SCALE
			} else {
				Integer.MAX_VALUE
			}

			queryEngine = ViatraQueryEngine.on(new EMFScope(p))
			this.allPatternsByName = allPatternsByName
			updatersBuilder = ImmutableList.builder
			val containmentConstraints = constraints.entrySet.filter[key.containment].groupBy[key.targetType]
			for (pair : containmentConstraints.entrySet) {
				buildContainmentConstraints(pair.key, pair.value)
			}
			buildConstainmentRootConstraints(containmentConstraints.keySet, hasElementInContainmentQuery)
			for (pair : constraints.entrySet) {
				val constraint = pair.key
				if (!constraint.containment && !constraint.container) {
					buildNonContainmentConstraints(constraint, pair.value)
				}
			}
			buildRelevantRelations(constraints.keySet)
			for (hint : hints) {
				val updater = hint.createConstraintUpdater(this)
				if (updater !== null) {
					updatersBuilder.add(updater)
				}
			}
			updaters = updatersBuilder.build
			addCachedConstraintsToPolyhedron()
		}

		private def buildRelevantRelations(Set<RelationMultiplicityConstraint> constraints) {
			val builder = ImmutableSet.builder
			for (constraint : constraints) {
				builder.add(constraint.relation)
				if (constraint.inverseRelation !== null) {
					builder.add(constraint.inverseRelation)
				}
			}
			relevantRelations = builder.build
		}

		private def addCachedConstraintsToPolyhedron() {
			val constraints = new HashSet
			constraints.addAll(expressionsCache.values.filter(LinearConstraint))
			constraints.removeAll(polyhedron.constraints)
			polyhedron.constraints.addAll(constraints)
		}

		private def buildContainmentConstraints(Type containedType,
			List<Map.Entry<RelationMultiplicityConstraint, UnifinishedMultiplicityQueries>> constraints) {
			val typeCoefficients = subtypeDimensions.get(containedType)
			val orphansLowerBoundCoefficients = new HashMap(typeCoefficients)
			val orphansUpperBoundCoefficients = new HashMap(typeCoefficients)
			val unfinishedMultiplicitiesBuilder = ImmutableList.builder
			val remainingContentsBuilder = ImmutableList.builder
			for (pair : constraints) {
				val constraint = pair.key
				val containerCoefficients = subtypeDimensions.get(constraint.sourceType)
				if (constraint.isUpperBoundFinite) {
					orphansLowerBoundCoefficients.addCoefficients(-constraint.upperBound, containerCoefficients)
				} else {
					orphansLowerBoundCoefficients.addCoefficients(-infinity, containerCoefficients)
				}
				orphansUpperBoundCoefficients.addCoefficients(-constraint.lowerBound, containerCoefficients)
				val queries = pair.value
				if (queries.existingMultiplicityQuery !== null) {
					val matcher = queries.existingMultiplicityQuery.getMatcher(queryEngine)
					if (constraint.constrainsUnfinished) {
						unfinishedMultiplicitiesBuilder.add(
							RemainingMultiplicityCalculator.of(matcher, constraint.lowerBound))
					}
					remainingContentsBuilder.add(RemainingMultiplicityCalculator.of(matcher, constraint.upperBound))
				} else if (constraint.constrainsUnfinished) {
					throw new IllegalArgumentException("Containment constraints need multiplicity queries")
				}
			}
			val orphanLowerBound = orphansLowerBoundCoefficients.toExpression
			val orphanUpperBound = orphansUpperBoundCoefficients.toExpression
			val updater = new ContainmentConstraintUpdater(orphanLowerBound, orphanUpperBound,
				unfinishedMultiplicitiesBuilder.build, remainingContentsBuilder.build)
			updatersBuilder.add(updater)
		}

		private def buildConstainmentRootConstraints(Set<Type> containedTypes,
			IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> hasElementInContainmentQuery) {
			val matcher = hasElementInContainmentQuery.getMatcher(queryEngine)
			val rootDimensions = Sets.newHashSet(instanceCounts.values)
			for (type : containedTypes) {
				val containedDimensions = subtypeDimensions.get(type).keySet
				rootDimensions.removeAll(containedDimensions)
			}
			for (dimension : rootDimensions) {
				updatersBuilder.add(new ContainmentRootConstraintUpdater(dimension, matcher))
			}
		}

		private def buildNonContainmentConstraints(RelationMultiplicityConstraint constraint,
			UnifinishedMultiplicityQueries queries) {
			if (!constraint.reference) {
				return
			}
			if (constraint.constrainsRemainingInverse) {
				if (queries.getExistingMultiplicityQuery === null) {
					throw new IllegalArgumentException("Reference constraints need unfinished multiplicity queries: " +
						constraint.relation)
				}
				val existingMultiplicityMatcher = queries.getExistingMultiplicityQuery.getMatcher(queryEngine)
				val unfinishedMultiplicityCalculator = RemainingMultiplicityCalculator.of(existingMultiplicityMatcher,
					constraint.lowerBound)
				val existingInverseMultiplicityMatcher = queries.existingInverseMultiplicityQuery.getMatcher(
					queryEngine)
				val remainingInverseMultiplicityCalculator = new RemainingInverseMultiplicityCalculator(
					existingInverseMultiplicityMatcher, constraint.upperBound)
				val availableMultiplicityCoefficients = new HashMap
				availableMultiplicityCoefficients.addCoefficients(constraint.inverseUpperBound,
					subtypeDimensions.get(constraint.targetType))
				availableMultiplicityCoefficients.addCoefficients(-constraint.lowerBound,
					subtypeDimensions.get(constraint.targetType))
				val availableMultiplicity = availableMultiplicityCoefficients.toExpression
				updatersBuilder.add(
					new UnfinishedMultiplicityConstraintUpdater(availableMultiplicity, unfinishedMultiplicityCalculator,
						remainingInverseMultiplicityCalculator))
			}
			if (constraint.constrainsUnrepairable) {
				if (queries.existingMultiplicityQuery.parameters.size < 5) {
					throw new IllegalArgumentException("Reference constraints need repairable multiplicity queries: " +
						constraint.relation)
				}
				val matcher = queries.existingMultiplicityQuery.getMatcher(queryEngine)
				val calculator = new UnrepairableMultiplicityCalculator(matcher, constraint.lowerBound)
				val targetTypeCardinality = typeBounds.get(constraint.targetType)
				updatersBuilder.add(new UnrepairableMultiplicityConstraintUpdater(targetTypeCardinality, calculator))
			}
		}

		private static def addCoefficients(Map<Dimension, Integer> accumulator, int scale, Map<Dimension, Integer> a) {
			for (pair : a.entrySet) {
				val dimension = pair.key
				val currentValue = accumulator.get(pair.key) ?: 0
				val newValue = currentValue + scale * pair.value
				if (newValue == 0) {
					accumulator.remove(dimension)
				} else {
					accumulator.put(dimension, newValue)
				}
			}
		}

		private def findSubtypeDimensions(Type type) {
			val subtypes = new HashSet
			val dimensions = new HashSet
			val stack = new ArrayDeque
			stack.addLast(type)
			while (!stack.empty) {
				val subtype = stack.removeLast
				if (subtypes.add(subtype)) {
					val dimension = instanceCounts.get(subtype)
					if (dimension !== null) {
						dimensions.add(dimension)
					}
					stack.addAll(subtype.subtypes)
				}
			}
			dimensions
		}

		private def toExpression(Map<Dimension, Integer> coefficients) {
			expressionsCache.computeIfAbsent(coefficients) [ c |
				if (c.size == 1 && c.entrySet.head.value == 1) {
					c.entrySet.head.key
				} else {
					new LinearConstraint(c, null, null)
				}
			]
		}

		private def buildScopeBounds() {
			val scopeBoundsBuilder = ImmutableMap.builder
			for (scope : p.scopes) {
				switch (targetTypeInterpretation : scope.targetTypeInterpretation) {
					PartialPrimitiveInterpretation:
						throw new IllegalStateException("Primitive type scopes are not yet implemented")
					PartialComplexTypeInterpretation: {
						val complexType = targetTypeInterpretation.interpretationOf
						val typeBound = typeBounds.get(complexType)
						if (typeBound === null) {
							if (scope.minNewElements > 0) {
								throw new IllegalArgumentException("Found scope for " + complexType.name +
									", but the type cannot be instantiated")
							}
						} else {
							scopeBoundsBuilder.put(scope, typeBound)
						}
					}
					default:
						throw new IllegalArgumentException("Unknown PartialTypeInterpretation: " +
							targetTypeInterpretation)
				}
			}
			scopeBoundsBuilder.build
		}

		override createMatcher(String queryName) {
			val querySpecification = allPatternsByName.get(queryName)
			if (querySpecification === null) {
				throw new IllegalArgumentException("Unknown pattern: " + queryName)
			}
			querySpecification.getMatcher(queryEngine)
		}

		override createBuilder() {
			new PolyhedronBuilderLinearTypeExpressionBuilder(this)
		}
	}

	@FinalFieldsConstructor
	private static class PolyhedronBuilderLinearTypeExpressionBuilder implements LinearTypeExpressionBuilder {
		val PolyhedronBuilder polyhedronBuilder
		val Map<Dimension, Integer> coefficients = new HashMap

		override add(int scale, Type type) {
			val typeCoefficients = polyhedronBuilder.subtypeDimensions.get(type)
			if (typeCoefficients === null) {
				throw new IllegalArgumentException("Unknown type: " + type)
			}
			PolyhedronBuilder.addCoefficients(coefficients, scale, typeCoefficients)
			this
		}

		override build() {
			polyhedronBuilder.toExpression(coefficients)
		}
	}

	@FinalFieldsConstructor
	private static class ContainmentConstraintUpdater implements RelationConstraintUpdater {
		val LinearBoundedExpression orphansLowerBound
		val LinearBoundedExpression orphansUpperBound
		val List<MultiplicityCalculator<? extends IPatternMatch>> unfinishedMultiplicities
		val List<MultiplicityCalculator<? extends IPatternMatch>> remainingContents

		override update(PartialInterpretation p) {
			tightenLowerBound(p)
			tightenUpperBound(p)
		}

		private def tightenLowerBound(PartialInterpretation p) {
			var int sum = 0
			for (calculator : remainingContents) {
				val value = calculator.getMultiplicity(p)
				if (value < 0) {
					// Infinite upper bound, no need to tighten.
					return
				}
				sum += value
			}
			orphansLowerBound.tightenUpperBound(sum)
		}

		private def tightenUpperBound(PartialInterpretation p) {
			var int sum = 0
			for (calculator : unfinishedMultiplicities) {
				val value = calculator.getMultiplicity(p)
				sum += value
			}
			orphansUpperBound.tightenLowerBound(sum)
		}
	}

	@FinalFieldsConstructor
	private static class ContainmentRootConstraintUpdater implements RelationConstraintUpdater {
		val LinearBoundedExpression typeCardinality
		val ViatraQueryMatcher<? extends IPatternMatch> hasElementInContainmentMatcher

		override update(PartialInterpretation p) {
			if (hasElementInContainmentMatcher.hasMatch(p)) {
				typeCardinality.tightenUpperBound(0)
			} else {
				typeCardinality.tightenUpperBound(1)
			}
		}

		private static def <T extends IPatternMatch> hasMatch(ViatraQueryMatcher<T> matcher, PartialInterpretation p) {
			val match = matcher.newMatch(p.problem, p)
			matcher.countMatches(match) != 0
		}
	}

	@FinalFieldsConstructor
	private static class UnfinishedMultiplicityConstraintUpdater implements RelationConstraintUpdater {
		val LinearBoundedExpression availableMultiplicityExpression
		val MultiplicityCalculator<? extends IPatternMatch> unfinishedMultiplicityCalculator
		val MultiplicityCalculator<? extends IPatternMatch> remainingInverseMultiplcityCalculator

		override update(PartialInterpretation p) {
			val unfinishedMultiplicity = unfinishedMultiplicityCalculator.getMultiplicity(p)
			val remainingInverseMultiplicity = remainingInverseMultiplcityCalculator.getMultiplicity(p)
			val int requiredMultiplicity = unfinishedMultiplicity - remainingInverseMultiplicity
			availableMultiplicityExpression.tightenLowerBound(requiredMultiplicity)
		}
	}

	@FinalFieldsConstructor
	private static class UnrepairableMultiplicityConstraintUpdater implements RelationConstraintUpdater {
		val LinearBoundedExpression targetCardinalityExpression
		val MultiplicityCalculator<? extends IPatternMatch> calculator

		override update(PartialInterpretation p) {
			val value = calculator.getMultiplicity(p)
			targetCardinalityExpression.tightenLowerBound(value)
		}
	}
}
