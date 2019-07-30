package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality

import com.google.common.collect.ImmutableList
import com.google.common.collect.ImmutableMap
import com.google.common.collect.Maps
import com.google.common.collect.Sets
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns.UnifinishedMultiplicityQueries
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialPrimitiveInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.Scope
import java.util.ArrayDeque
import java.util.ArrayList
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import javax.naming.OperationNotSupportedException
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.query.runtime.emf.EMFScope
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

class PolyhedronScopePropagator extends ScopePropagator {
	val Map<Scope, LinearBoundedExpression> scopeBounds
	val LinearBoundedExpression topLevelBounds
	val Polyhedron polyhedron
	val PolyhedronSaturationOperator operator
	List<RelationConstraintUpdater> updaters = emptyList

	new(PartialInterpretation p, Set<? extends Type> possibleNewDynamicTypes,
		Map<RelationMultiplicityConstraint, UnifinishedMultiplicityQueries> unfinishedMultiplicityQueries,
		IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> hasElementInContainmentQuery,
		PolyhedronSolver solver, boolean propagateRelations) {
		super(p)
		val builder = new PolyhedronBuilder(p)
		builder.buildPolyhedron(possibleNewDynamicTypes)
		scopeBounds = builder.scopeBounds
		topLevelBounds = builder.topLevelBounds
		polyhedron = builder.polyhedron
		operator = solver.createSaturationOperator(polyhedron)
		if (propagateRelations) {
			propagateAllScopeConstraints()
			val maximumNumberOfNewNodes = topLevelBounds.upperBound
			if (maximumNumberOfNewNodes === null) {
				throw new IllegalStateException("Could not determine maximum number of new nodes, it may be unbounded")
			}
			if (maximumNumberOfNewNodes <= 0) {
				throw new IllegalStateException("Maximum number of new nodes is not positive")
			}
			builder.buildMultiplicityConstraints(unfinishedMultiplicityQueries, hasElementInContainmentQuery,
				maximumNumberOfNewNodes)
			updaters = builder.updaters
		}
	}

	override void propagateAllScopeConstraints() {
		resetBounds()
		populatePolyhedronFromScope()
//		println(polyhedron)
		val result = operator.saturate()
//		println(polyhedron)
		if (result == PolyhedronSaturationResult.EMPTY) {
			setScopesInvalid()
		} else {
			populateScopesFromPolyhedron()
			if (result != PolyhedronSaturationResult.SATURATED) {
				super.propagateAllScopeConstraints()
			}
		}
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

	private def setScopesInvalid() {
		partialInterpretation.minNewElements = Integer.MAX_VALUE
		partialInterpretation.maxNewElements = 0
		for (scope : partialInterpretation.scopes) {
			scope.minNewElements = Integer.MAX_VALUE
			scope.maxNewElements = 0
		}
	}

	private static def <T extends IPatternMatch> getCalculatedMultiplicity(ViatraQueryMatcher<T> matcher,
		PartialInterpretation p) {
		val match = matcher.newEmptyMatch
		match.set(0, p.problem)
		match.set(1, p)
		val iterator = matcher.streamAllMatches(match).iterator
		if (!iterator.hasNext) {
			return null
		}
		val value = iterator.next.get(2) as Integer
		if (iterator.hasNext) {
			throw new IllegalArgumentException("Multiplicity calculation query has more than one match")
		}
		value
	}

	@FinalFieldsConstructor
	private static class PolyhedronBuilder {
		static val INFINITY_SCALE = 10

		val PartialInterpretation p

		Map<Type, Dimension> instanceCounts
		Map<Type, Map<Dimension, Integer>> subtypeDimensions
		Map<Map<Dimension, Integer>, LinearBoundedExpression> expressionsCache
		Map<Type, LinearBoundedExpression> typeBounds
		int infinity
		ViatraQueryEngine queryEngine
		ImmutableList.Builder<RelationConstraintUpdater> updatersBuilder

		Map<Scope, LinearBoundedExpression> scopeBounds
		LinearBoundedExpression topLevelBounds
		Polyhedron polyhedron
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
			int maximumNuberOfNewNodes) {
			infinity = maximumNuberOfNewNodes * INFINITY_SCALE
			queryEngine = ViatraQueryEngine.on(new EMFScope(p))
			updatersBuilder = ImmutableList.builder
			val containmentConstraints = constraints.entrySet.filter[key.containment].groupBy[key.targetType]
			for (pair : containmentConstraints.entrySet) {
				buildContainmentConstraints(pair.key, pair.value)
			}
			buildConstainmentRootConstraints(containmentConstraints.keySet, hasElementInContainmentQuery)
			for (pair : constraints.entrySet) {
				val constraint = pair.key
				if (!constraint.containment) {
					buildNonContainmentConstraints(constraint, pair.value)
				}
			}
			updaters = updatersBuilder.build
			addCachedConstraintsToPolyhedron()
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
			val unfinishedMultiplicitiesMatchersBuilder = ImmutableList.builder
			val remainingContentsQueriesBuilder = ImmutableList.builder
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
				if (constraint.constrainsUnfinished) {
					if (queries.unfinishedMultiplicityQuery === null) {
						throw new IllegalArgumentException(
							"Containment constraints need unfinished multiplicity queries")
					}
					unfinishedMultiplicitiesMatchersBuilder.add(
						queries.unfinishedMultiplicityQuery.getMatcher(queryEngine))
				}
				if (queries.remainingContentsQuery === null) {
					throw new IllegalArgumentException("Containment constraints need remaining contents queries")
				}
				remainingContentsQueriesBuilder.add(queries.remainingContentsQuery.getMatcher(queryEngine))
			}
			val orphanLowerBound = orphansLowerBoundCoefficients.toExpression
			val orphanUpperBound = orphansUpperBoundCoefficients.toExpression
			val updater = new ContainmentConstraintUpdater(containedType.name, orphanLowerBound, orphanUpperBound,
				unfinishedMultiplicitiesMatchersBuilder.build, remainingContentsQueriesBuilder.build)
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
			if (constraint.constrainsRemainingInverse) {
				if (queries.unfinishedMultiplicityQuery === null) {
					throw new IllegalArgumentException("Reference constraints need unfinished multiplicity queries")
				}
				val unfinishedMultiplicityMatcher = queries.unfinishedMultiplicityQuery.getMatcher(queryEngine)
				if (queries.remainingInverseMultiplicityQuery === null) {
					throw new IllegalArgumentException(
						"Reference constraints need remaining inverse multiplicity queries")
				}
				val remainingInverseMultiplicityMatcher = queries.remainingInverseMultiplicityQuery.getMatcher(
					queryEngine)
				val availableMultiplicityCoefficients = new HashMap
				availableMultiplicityCoefficients.addCoefficients(constraint.inverseUpperBound,
					subtypeDimensions.get(constraint.targetType))
				availableMultiplicityCoefficients.addCoefficients(-constraint.lowerBound,
					subtypeDimensions.get(constraint.targetType))
				val availableMultiplicity = availableMultiplicityCoefficients.toExpression
				updatersBuilder.add(
					new UnfinishedMultiplicityConstraintUpdater(constraint.relation.name, availableMultiplicity,
						unfinishedMultiplicityMatcher, remainingInverseMultiplicityMatcher))
			}
			if (constraint.constrainsUnrepairable) {
				if (queries.unrepairableMultiplicityQuery === null) {
					throw new IllegalArgumentException("Reference constraints need unrepairable multiplicity queries")
				}
				val unrepairableMultiplicityMatcher = queries.unrepairableMultiplicityQuery.getMatcher(queryEngine)
				val targetTypeCardinality = typeBounds.get(constraint.targetType)
				updatersBuilder.add(
					new UnrepairableMultiplicityConstraintUpdater(constraint.relation.name, targetTypeCardinality,
						unrepairableMultiplicityMatcher))
			}
		}

		private def addCoefficients(Map<Dimension, Integer> accumulator, int scale, Map<Dimension, Integer> a) {
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
						throw new OperationNotSupportedException("Primitive type scopes are not yet implemented")
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
	}

	private static interface RelationConstraintUpdater {
		def void update(PartialInterpretation p)
	}

	@FinalFieldsConstructor
	static class ContainmentConstraintUpdater implements RelationConstraintUpdater {
		val String name
		val LinearBoundedExpression orphansLowerBound
		val LinearBoundedExpression orphansUpperBound
		val List<ViatraQueryMatcher<? extends IPatternMatch>> unfinishedMultiplicitiesMatchers
		val List<ViatraQueryMatcher<? extends IPatternMatch>> remainingContentsQueries

		override update(PartialInterpretation p) {
			tightenLowerBound(p)
			tightenUpperBound(p)
		}

		private def tightenLowerBound(PartialInterpretation p) {
			var int sum = 0
			for (matcher : remainingContentsQueries) {
				val value = matcher.getCalculatedMultiplicity(p)
				if (value === null) {
					throw new IllegalArgumentException("Remaining contents count is missing for " + name)
				}
				if (value == -1) {
					// Infinite upper bound, no need to tighten.
					return
				}
				sum += value
			}
			orphansLowerBound.tightenUpperBound(sum)
		}

		private def tightenUpperBound(PartialInterpretation p) {
			var int sum = 0
			for (matcher : unfinishedMultiplicitiesMatchers) {
				val value = matcher.getCalculatedMultiplicity(p)
				if (value === null) {
					throw new IllegalArgumentException("Unfinished multiplicity is missing for " + name)
				}
				sum += value
			}
			orphansUpperBound.tightenLowerBound(sum)
		}
	}

	@FinalFieldsConstructor
	static class ContainmentRootConstraintUpdater implements RelationConstraintUpdater {
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
	static class UnfinishedMultiplicityConstraintUpdater implements RelationConstraintUpdater {
		val String name
		val LinearBoundedExpression availableMultiplicityExpression
		val ViatraQueryMatcher<? extends IPatternMatch> unfinishedMultiplicityMatcher
		val ViatraQueryMatcher<? extends IPatternMatch> remainingInverseMultiplicityMatcher

		override update(PartialInterpretation p) {
			val unfinishedMultiplicity = unfinishedMultiplicityMatcher.getCalculatedMultiplicity(p)
			if (unfinishedMultiplicity === null) {
				throw new IllegalArgumentException("Unfinished multiplicity is missing for " + name)
			}
			val remainingInverseMultiplicity = remainingInverseMultiplicityMatcher.getCalculatedMultiplicity(p)
			if (remainingInverseMultiplicity === null) {
				throw new IllegalArgumentException("Remaining inverse multiplicity is missing for " + name)
			}
			val int requiredMultiplicity = unfinishedMultiplicity - remainingInverseMultiplicity
			availableMultiplicityExpression.tightenLowerBound(requiredMultiplicity)
		}
	}

	@FinalFieldsConstructor
	static class UnrepairableMultiplicityConstraintUpdater implements RelationConstraintUpdater {
		val String name
		val LinearBoundedExpression targetCardinalityExpression
		val ViatraQueryMatcher<? extends IPatternMatch> unrepairableMultiplicityMatcher

		override update(PartialInterpretation p) {
			val value = unrepairableMultiplicityMatcher.getCalculatedMultiplicity(p)
			if (value === null) {
				throw new IllegalArgumentException("Unrepairable multiplicity is missing for " + name)
			}
			targetCardinalityExpression.tightenLowerBound(value)
		}
	}
}
