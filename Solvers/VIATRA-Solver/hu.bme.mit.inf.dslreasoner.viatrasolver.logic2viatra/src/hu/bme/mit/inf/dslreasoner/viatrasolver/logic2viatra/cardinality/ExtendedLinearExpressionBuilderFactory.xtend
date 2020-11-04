package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality

import com.google.common.collect.ImmutableList
import com.google.common.collect.ImmutableMap
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import java.util.ArrayList
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

interface BoundSaturationListener {
	def void boundsSaturated(Integer lower, Integer upper)
}

interface ExtendedLinearExpressionBuilderFactory {
	def ExtendedLinearExpressionBuilder createBuilder()

	def Dimension getDimension(IPatternMatch patternMatch)
}

interface ExtendedLinearExpressionBuilder extends LinearTypeExpressionBuilder {
	override ExtendedLinearExpressionBuilder add(int scale, Type type)

	def ExtendedLinearExpressionBuilder add(int scale, IPatternMatch patternMatch)

	def ExtendedLinearExpressionBuilder add(int scale, Dimension dimension)

	def LinearBoundedExpression build(BoundSaturationListener listener)
}

class ExtendedPolyhedronBuilder implements ExtendedLinearExpressionBuilderFactory {
	val Map<Type, LinearBoundedExpression> typeBounds
	val Map<Map<Dimension, Integer>, LinearBoundedExpression> expressionsCache

	val ImmutableList.Builder<Dimension> dimensions = ImmutableList.builder
	val Set<LinearConstraint> constraints = new HashSet
	val Set<LinearBoundedExpression> expressionsToSaturate = new HashSet
	val Map<IPatternMatch, Dimension> patternMatchCounts = new HashMap
	@Accessors(PUBLIC_GETTER) val List<Pair<LinearBoundedExpression, BoundSaturationListener>> saturationListeners = new ArrayList

	new(Polyhedron polyhedron, Map<Type, LinearBoundedExpression> typeBounds,
		Map<Map<Dimension, Integer>, LinearBoundedExpression> initialExpressionsCache) {
		this.typeBounds = typeBounds
		this.expressionsCache = new HashMap(initialExpressionsCache)
		dimensions.addAll(polyhedron.dimensions)
		constraints.addAll(polyhedron.constraints)
		expressionsToSaturate.addAll(polyhedron.expressionsToSaturate)
	}

	override createBuilder() {
		new ExtendedLinearExpressionBuilderImpl(this)
	}

	override getDimension(IPatternMatch patternMatch) {
		patternMatchCounts.computeIfAbsent(patternMatch) [ key |
			val dimension = new Dimension(key.toString, 0, null)
			dimensions.add(dimension)
			dimension
		]
	}

	def buildPolyhedron() {
		new Polyhedron(
			dimensions.build,
			ImmutableList.copyOf(constraints),
			ImmutableList.copyOf(expressionsToSaturate)
		)
	}

	@FinalFieldsConstructor
	private static class ExtendedLinearExpressionBuilderImpl implements ExtendedLinearExpressionBuilder {
		val ExtendedPolyhedronBuilder polyhedronBuilder

		val Map<Dimension, Integer> coefficients = new HashMap

		override add(int scale, Type type) {
			val expression = polyhedronBuilder.typeBounds.get(type)
			if (expression === null) {
				throw new IllegalArgumentException("Unknown Type: " + type)
			}
			add(scale, expression)
		}

		override add(int scale, IPatternMatch patternMatch) {
			val dimension = polyhedronBuilder.getDimension(patternMatch)
			add(scale, dimension)
		}

		private def add(int scale, LinearBoundedExpression expression) {
			switch (expression) {
				Dimension: add(scale, expression)
				LinearConstraint: add(scale, expression.coefficients)
				default: throw new IllegalArgumentException("Unknown LinearBoundedExpression: " + expression)
			}
		}

		private def add(int scale, Map<Dimension, Integer> coefficients) {
			for (pair : coefficients.entrySet) {
				add(scale * pair.value, pair.key)
			}
			this
		}

		override add(int scale, Dimension dimension) {
			coefficients.merge(dimension, scale)[a, b|a + b]
			this
		}

		override build() {
			val filteredCoefficients = ImmutableMap.copyOf(coefficients.filter [ x, coefficient |
				coefficient != 0
			])
			polyhedronBuilder.expressionsCache.computeIfAbsent(filteredCoefficients) [ map |
				if (map.size == 1) {
					val pair = map.entrySet.head
					if (pair.value == 1) {
						return pair.key
					}
				}
				val constraint = new LinearConstraint(map)
				polyhedronBuilder.constraints.add(constraint)
				constraint
			]
		}

		override build(BoundSaturationListener listener) {
			val expression = build()
			if (listener !== null) {
				polyhedronBuilder.expressionsToSaturate.add(expression)
				polyhedronBuilder.saturationListeners.add(expression -> listener)
			}
			expression
		}
	}
}
