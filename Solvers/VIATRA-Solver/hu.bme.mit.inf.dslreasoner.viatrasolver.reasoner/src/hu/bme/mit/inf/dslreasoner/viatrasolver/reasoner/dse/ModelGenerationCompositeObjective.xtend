package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import java.util.Comparator
import java.util.List
import org.eclipse.viatra.dse.base.ThreadContext
import org.eclipse.viatra.dse.objectives.Comparators
import org.eclipse.viatra.dse.objectives.IObjective
import org.eclipse.viatra.dse.objectives.impl.BaseObjective

//class ViatraReasonerNumbers {
//	public static val scopePriority = 2
//	public static val unfinishedMultiplicityPriority = 2
//	public static val unifinshedWFPriority = 2
//	//public static val complexityPriority = 4
//	
//	public static val scopeWeigth = 1.0
//	public static val unfinishedMultiplicityWeigth = 1.5
//	public static val unfinishedWFWeigth = 1.5
//	//public static val complexityWeigth = 0.1
//	
//	public static val useCompositeObjective = true
//	public static val compositePriority = 2
//}

class ModelGenerationCompositeObjective implements IObjective{
	val ScopeObjective scopeObjective
	val List<UnfinishedMultiplicityObjective> unfinishedMultiplicityObjectives
	val UnfinishedWFObjective unfinishedWFObjective
	
	public new(
		ScopeObjective scopeObjective,
		List<UnfinishedMultiplicityObjective> unfinishedMultiplicityObjectives,
		UnfinishedWFObjective unfinishedWFObjective)
	{
		this.scopeObjective = scopeObjective
		this.unfinishedMultiplicityObjectives = unfinishedMultiplicityObjectives
		this.unfinishedWFObjective = unfinishedWFObjective
	}
	
	override init(ThreadContext context) {
		this.scopeObjective.init(context)
		this.unfinishedMultiplicityObjectives.forEach[it.init(context)]
		this.unfinishedWFObjective.init(context)
	}
	
	override createNew() {
		return new ModelGenerationCompositeObjective(
			this.scopeObjective, this.unfinishedMultiplicityObjectives, this.unfinishedWFObjective)
	}
	
	override getComparator() { Comparators.LOWER_IS_BETTER }
	override getFitness(ThreadContext context) {
		
		val scopeFitnes = scopeObjective.getFitness(context)
		//val unfinishedMultiplicitiesFitneses = unfinishedMultiplicityObjectives.map[x|x.getFitness(context)]
		val unfinishedWFsFitness = unfinishedWFObjective.getFitness(context)
		
		
		var multiplicity = 0.0
		for(multiplicityObjective : unfinishedMultiplicityObjectives) {
			multiplicity+=multiplicityObjective.getFitness(context)
		}
		var sum = 0.0
		sum += scopeFitnes
		sum +=multiplicity
		sum += unfinishedWFsFitness//*0.5
		
		println('''Sum=«sum»|Scope=«scopeFitnes»|Multiplicity=«multiplicity»|WFs=«unfinishedWFsFitness»''')
		
		return sum
	}
	
	override getLevel() { 2 }
	override getName() { "CompositeUnfinishednessObjective"}
	
	override isHardObjective() { true }
	override satisifiesHardObjective(Double fitness) { fitness <= 0.001 }
	
	
	override setComparator(Comparator<Double> comparator) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	override setLevel(int level) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}