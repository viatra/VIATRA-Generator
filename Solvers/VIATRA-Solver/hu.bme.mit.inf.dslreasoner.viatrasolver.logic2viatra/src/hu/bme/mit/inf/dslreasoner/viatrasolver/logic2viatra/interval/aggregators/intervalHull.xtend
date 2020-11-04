package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.interval.aggregators

import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.interval.Interval
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.interval.IntervalHullAggregatorOperator
import java.math.BigDecimal
import java.math.BigInteger
import java.math.MathContext
import org.eclipse.viatra.query.runtime.matchers.psystem.aggregations.AggregatorType
import org.eclipse.viatra.query.runtime.matchers.psystem.aggregations.BoundAggregator
import org.eclipse.viatra.query.runtime.matchers.psystem.aggregations.IAggregatorFactory

@AggregatorType(parameterTypes=#[BigDecimal, BigInteger, Byte, Double, Float, Integer, Long, Short], returnTypes=#[
	Interval, Interval, Interval, Interval, Interval, Interval, Interval, Interval])
class intervalHull implements IAggregatorFactory {

	override getAggregatorLogic(Class<?> domainClass) {
		new BoundAggregator(getAggregationOperator(domainClass), domainClass, Interval)
	}

	private def getAggregationOperator(Class<?> domainClass) {
		switch (domainClass) {
			case BigDecimal:
				new IntervalHullAggregatorOperator<BigDecimal>() {
					override protected toBigDecimal(BigDecimal value, MathContext mc) {
						value.round(mc)
					}
				}
			case BigInteger:
				new IntervalHullAggregatorOperator<BigInteger>() {
					override protected toBigDecimal(BigInteger value, MathContext mc) {
						new BigDecimal(value, mc)
					}
				}
			case Byte:
				new IntervalHullAggregatorOperator<Byte>() {
					override protected toBigDecimal(Byte value, MathContext mc) {
						new BigDecimal(value, mc)
					}
				}
			case Double:
				new IntervalHullAggregatorOperator<Double>() {
					override protected toBigDecimal(Double value, MathContext mc) {
						new BigDecimal(value, mc)
					}
				}
			case Float:
				new IntervalHullAggregatorOperator<Float>() {
					override protected toBigDecimal(Float value, MathContext mc) {
						new BigDecimal(value, mc)
					}
				}
			case Integer:
				new IntervalHullAggregatorOperator<Integer>() {
					override protected toBigDecimal(Integer value, MathContext mc) {
						new BigDecimal(value, mc)
					}
				}
			case Long:
				new IntervalHullAggregatorOperator<Long>() {
					override protected toBigDecimal(Long value, MathContext mc) {
						new BigDecimal(value, mc)
					}
				}
			case Short:
				new IntervalHullAggregatorOperator<Short>() {
					override protected toBigDecimal(Short value, MathContext mc) {
						new BigDecimal(value, mc)
					}
				}
			default:
				throw new IllegalArgumentException("Unknown domain class: " + domainClass)
		}
	}
}
