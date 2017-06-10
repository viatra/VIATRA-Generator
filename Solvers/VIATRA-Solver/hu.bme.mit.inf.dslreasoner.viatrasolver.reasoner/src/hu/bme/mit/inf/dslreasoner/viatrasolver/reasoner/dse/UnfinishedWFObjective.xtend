package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import org.eclipse.viatra.dse.objectives.IObjective
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import java.util.Collection
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope
import org.eclipse.viatra.dse.base.ThreadContext
import java.util.List
import org.eclipse.viatra.dse.objectives.Comparators
import java.util.ArrayList
import java.util.Comparator

class UnfinishedWFObjective implements IObjective {
	Collection<? extends IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> unfinishedWFs
	val List<ViatraQueryMatcher<?>> matchers
	
	public new(Collection<? extends IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> unfinishedWFs) {
		this.unfinishedWFs = unfinishedWFs
		matchers = new ArrayList(unfinishedWFs.size)
	}
	override getName() '''unfinishedWFs'''
	override createNew() {
		return new UnfinishedWFObjective(unfinishedWFs)
	}
	override init(ThreadContext context) {
		val engine = context.queryEngine//ViatraQueryEngine.on(new EMFScope(context.model))
		for(unfinishedWF : unfinishedWFs) {
			matchers += unfinishedWF.getMatcher(engine)
		}
	}
	
	override getComparator() { Comparators.LOWER_IS_BETTER }
	override getFitness(ThreadContext context) {
		var sumOfMatches = 0
		for(matcher : matchers) {
			val number = matcher.countMatches
//			println('''«matcher.patternName» = «number»''')
			sumOfMatches+=number
		}
		return sumOfMatches.doubleValue
	}
	
	override getLevel() { 2 }
	override isHardObjective() { true }
	override satisifiesHardObjective(Double fitness) { return fitness <=0.01 }
	
	override setComparator(Comparator<Double> comparator) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	override setLevel(int level) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}