package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality

import com.google.common.collect.ImmutableList
import com.google.common.collect.ImmutableMap
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialPrimitiveInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.Scope
import java.util.ArrayDeque
import java.util.HashMap
import java.util.HashSet
import java.util.Map
import java.util.Set

class PolyhedronScopePropagator extends ScopePropagator {
	val Map<Scope, LinearBoundedExpression> scopeBounds
	val LinearConstraint topLevelBounds
	val PolyhedronSaturationOperator operator

	new(PartialInterpretation p, Set<? extends Type> possibleNewDynamicTypes, PolyhedronSolver solver) {
		super(p)
		val instanceCounts = possibleNewDynamicTypes.toInvertedMap[new Dimension(name, 0, null)]
		val primitiveDimensions = new HashMap
		val constraintsBuilder = ImmutableList.builder
		val scopeBoundsBuilder = ImmutableMap.builder
		// Dimensions for instantiable types were created according to the type analysis,
		// but for any possible primitive types, we create them on demand,
		// as there is no Type directly associated with a PartialPrimitiveInterpretation.
		for (scope : p.scopes) {
			switch (targetTypeInterpretation : scope.targetTypeInterpretation) {
				PartialPrimitiveInterpretation: {
					val dimension = primitiveDimensions.computeIfAbsent(targetTypeInterpretation) [ interpretation |
						new Dimension(interpretation.eClass.name, 0, null)
					]
					scopeBoundsBuilder.put(scope, dimension)
				}
				PartialComplexTypeInterpretation: {
					val complexType = targetTypeInterpretation.interpretationOf
					val dimensions = findSubtypeDimensions(complexType, instanceCounts)
					switch (dimensions.size) {
						case 0:
							if (scope.minNewElements > 0) {
								throw new IllegalArgumentException("Found scope for " + complexType.name +
									", but the type cannot be instantiated")
							}
						case 1:
							scopeBoundsBuilder.put(scope, dimensions.head)
						default: {
							val constraint = new LinearConstraint(dimensions.toInvertedMap[1], null, null)
							constraintsBuilder.add(constraint)
							scopeBoundsBuilder.put(scope, constraint)
						}
					}
				}
				default:
					throw new IllegalArgumentException("Unknown PartialTypeInterpretation: " + targetTypeInterpretation)
			}
		}
		val allDimensions = ImmutableList.builder.addAll(instanceCounts.values).addAll(primitiveDimensions.values).build
		scopeBounds = scopeBoundsBuilder.build
		topLevelBounds = new LinearConstraint(allDimensions.toInvertedMap[1], null, null)
		constraintsBuilder.add(topLevelBounds)
		val expressionsToSaturate = ImmutableList.builder.addAll(scopeBounds.values).add(topLevelBounds).build
		val polyhedron = new Polyhedron(allDimensions, constraintsBuilder.build, expressionsToSaturate)
		operator = solver.createSaturationOperator(polyhedron)
	}

	private def findSubtypeDimensions(Type type, Map<Type, Dimension> instanceCounts) {
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

	override void propagateAllScopeConstraints() {
		populatePolyhedronFromScope()
		val result = operator.saturate()
		if (result == PolyhedronSaturationResult.EMPTY) {
			throw new IllegalStateException("Scope bounds cannot be satisfied")
		} else {
			populateScopesFromPolyhedron()
			if (result != PolyhedronSaturationResult.SATURATED) {
				super.propagateAllScopeConstraints()
			}
		}
	}

	private def populatePolyhedronFromScope() {
		topLevelBounds.lowerBound = partialInterpretation.minNewElements
		if (partialInterpretation.maxNewElements >= 0) {
			topLevelBounds.upperBound = partialInterpretation.maxNewElements
		}
		for (pair : scopeBounds.entrySet) {
			val scope = pair.key
			val bounds = pair.value
			bounds.lowerBound = scope.minNewElements
			if (scope.maxNewElements >= 0) {
				bounds.upperBound = scope.maxNewElements
			}
		}
	}

	private def populateScopesFromPolyhedron() {
		checkFiniteBounds(topLevelBounds)
		if (partialInterpretation.minNewElements > topLevelBounds.lowerBound) {
			throw new IllegalArgumentException('''Lower bound of «topLevelBounds» smaller than top-level scope: «partialInterpretation.minNewElements»''')
		} else if (partialInterpretation.minNewElements != topLevelBounds.lowerBound) {
			partialInterpretation.minNewElements = topLevelBounds.lowerBound
		}
		if (partialInterpretation.maxNewElements >= 0 &&
			partialInterpretation.maxNewElements < topLevelBounds.upperBound) {
			throw new IllegalArgumentException('''Upper bound of «topLevelBounds» larger than top-level scope: «partialInterpretation.maxNewElements»''')
		} else if (partialInterpretation.maxNewElements != topLevelBounds.upperBound) {
			partialInterpretation.maxNewElements = topLevelBounds.upperBound
		}
		for (pair : scopeBounds.entrySet) {
			val scope = pair.key
			val bounds = pair.value
			checkFiniteBounds(bounds)
			if (scope.minNewElements > bounds.lowerBound) {
				throw new IllegalArgumentException('''Lower bound of «bounds» smaller than «scope.targetTypeInterpretation» scope: «scope.minNewElements»''')
			} else if (scope.minNewElements != bounds.lowerBound) {
				scope.minNewElements = bounds.lowerBound
			}
			if (scope.maxNewElements >= 0 && scope.maxNewElements < bounds.upperBound) {
				throw new IllegalArgumentException('''Upper bound of «bounds» larger than «scope.targetTypeInterpretation» scope: «scope.maxNewElements»''')
			} else if (scope.maxNewElements != bounds.upperBound) {
				scope.maxNewElements = bounds.upperBound
			}
		}
	}

	private def checkFiniteBounds(LinearBoundedExpression bounds) {
		if (bounds.lowerBound === null) {
			throw new IllegalArgumentException("Infinite lower bound: " + bounds)
		}
		if (bounds.upperBound === null) {
			throw new IllegalArgumentException("Infinite upper bound: " + bounds)
		}
	}
}
