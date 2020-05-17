package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import java.util.Comparator
import java.util.List
import org.eclipse.viatra.dse.base.ThreadContext
import org.eclipse.viatra.dse.objectives.Comparators
import org.eclipse.viatra.dse.objectives.IObjective
import org.eclipse.viatra.dse.objectives.impl.BaseObjective
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration

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
	var PartialInterpretation model=null;
	val boolean punishSize
	val int scopeWeight
	val int conaintmentWeight
	val int nonContainmentWeight
	val int unfinishedWFWeight
	
	new(
		ScopeObjective scopeObjective,
		List<UnfinishedMultiplicityObjective> unfinishedMultiplicityObjectives,
		UnfinishedWFObjective unfinishedWFObjective,
		ViatraReasonerConfiguration configuration)
	{
		this.scopeObjective = scopeObjective
		this.unfinishedMultiplicityObjectives = unfinishedMultiplicityObjectives
		this.unfinishedWFObjective = unfinishedWFObjective
		
		this.punishSize = configuration.punishSize
		this.scopeWeight = configuration.scopeWeight
		this.conaintmentWeight = configuration.conaintmentWeight
		this.nonContainmentWeight = configuration.nonContainmentWeight
		this.unfinishedWFWeight = configuration.unfinishedWFWeight
	}
	new(
		ScopeObjective scopeObjective,
		List<UnfinishedMultiplicityObjective> unfinishedMultiplicityObjectives,
		UnfinishedWFObjective unfinishedWFObjective,
		boolean punishSize, int scopeWeight, int conaintmentWeight, int nonContainmentWeight, int unfinishedWFWeight)
	{
		this.scopeObjective = scopeObjective
		this.unfinishedMultiplicityObjectives = unfinishedMultiplicityObjectives
		this.unfinishedWFObjective = unfinishedWFObjective
		
		this.punishSize = punishSize
		this.scopeWeight = scopeWeight
		this.conaintmentWeight = conaintmentWeight
		this.nonContainmentWeight = nonContainmentWeight
		this.unfinishedWFWeight = unfinishedWFWeight
	}
	
	override init(ThreadContext context) {
		model = context.model as PartialInterpretation
		this.scopeObjective.init(context)
		this.unfinishedMultiplicityObjectives.forEach[it.init(context)]
		this.unfinishedWFObjective.init(context)
	}
	
	override createNew() {
		return new ModelGenerationCompositeObjective(
			this.scopeObjective, this.unfinishedMultiplicityObjectives, this.unfinishedWFObjective,
			this.punishSize, this.scopeWeight, this.conaintmentWeight, this.nonContainmentWeight, this.unfinishedWFWeight)
	}
	
	override getComparator() { Comparators.LOWER_IS_BETTER }
	override getFitness(ThreadContext context) {
		
		val scopeFitnes = scopeObjective.getFitness(context)
		//val unfinishedMultiplicitiesFitneses = unfinishedMultiplicityObjectives.map[x|x.getFitness(context)]
		val unfinishedWFsFitness = unfinishedWFObjective.getFitness(context)
		
		var containmentMultiplicity = 0.0
		var nonContainmentMultiplicity = 0.0
		for(multiplicityObjective : unfinishedMultiplicityObjectives) {
			if(multiplicityObjective.containment) {
				containmentMultiplicity+=multiplicityObjective.getFitness(context)
			} else {
				nonContainmentMultiplicity+=multiplicityObjective.getFitness(context)
			}
		}
		val size = if(punishSize) {
			0.9/model.newElements.size
		} else {
			0
		}
		
		var sum = 0.0
		sum += scopeFitnes*scopeWeight
		sum += containmentMultiplicity*conaintmentWeight
		sum += nonContainmentMultiplicity*nonContainmentWeight
		sum += unfinishedWFsFitness*unfinishedWFWeight
		sum+=size
		
		//println('''Sum=«sum»|Scope=«scopeFitnes»|ContainmentMultiplicity=«containmentMultiplicity»|NonContainmentMultiplicity=«nonContainmentMultiplicity»|WFs=«unfinishedWFsFitness»''')
		
		return sum
	}
	
	override getLevel() { 2 }
	override getName() { "CompositeUnfinishednessObjective"}
	
	override isHardObjective() { true }
	override satisifiesHardObjective(Double fitness) { fitness < 0.95 }
	
	
	override setComparator(Comparator<Double> comparator) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	override setLevel(int level) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}