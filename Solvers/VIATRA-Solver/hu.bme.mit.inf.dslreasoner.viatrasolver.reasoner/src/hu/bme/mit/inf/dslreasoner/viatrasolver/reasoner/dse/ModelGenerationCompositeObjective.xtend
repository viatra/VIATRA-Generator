package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import com.google.common.collect.ImmutableList
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.IThreeValuedObjective
import java.util.Comparator
import java.util.List
import org.eclipse.viatra.dse.base.ThreadContext
import org.eclipse.viatra.dse.objectives.Comparators
import org.eclipse.viatra.dse.objectives.IObjective
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PrimitiveElement

class ModelGenerationCompositeObjective implements IThreeValuedObjective {
	val IObjective scopeObjective
	val List<UnfinishedMultiplicityObjective> unfinishedMultiplicityObjectives
	val UnfinishedWFObjective unfinishedWFObjective
	var PartialInterpretation model = null
	val int scopeWeight
	val int conaintmentWeight
	val int nonContainmentWeight
	val int unfinishedWFWeight
	
	new(
		IObjective scopeObjective,
		List<UnfinishedMultiplicityObjective> unfinishedMultiplicityObjectives,
		UnfinishedWFObjective unfinishedWFObjective,
		ViatraReasonerConfiguration configuration)
	{
		this(
			scopeObjective, unfinishedMultiplicityObjectives, unfinishedWFObjective,
			configuration.scopeWeight, configuration.conaintmentWeight, configuration.nonContainmentWeight,
			configuration.unfinishedWFWeight
		)
	}

	new(
		IObjective scopeObjective,
		List<UnfinishedMultiplicityObjective> unfinishedMultiplicityObjectives,
		UnfinishedWFObjective unfinishedWFObjective,
		int scopeWeight, int conaintmentWeight, int nonContainmentWeight, int unfinishedWFWeight)
	{
		this.scopeObjective = scopeObjective
		this.unfinishedMultiplicityObjectives = unfinishedMultiplicityObjectives
		this.unfinishedWFObjective = unfinishedWFObjective
		
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
			scopeObjective.createNew,
			ImmutableList.copyOf(unfinishedMultiplicityObjectives.map[createNew as UnfinishedMultiplicityObjective]),
			unfinishedWFObjective.createNew as UnfinishedWFObjective,
			scopeWeight, conaintmentWeight, nonContainmentWeight, unfinishedWFWeight
		)
	}

	override getComparator() { Comparators.LOWER_IS_BETTER }

	override getFitness(ThreadContext context) {
		
		val scopeFitnes = scopeObjective.getFitness(context)
		val unfinishedWFsFitness = unfinishedWFObjective.getFitness(context)
		
		var containmentMultiplicity = 0.0
		var nonContainmentMultiplicity = 0.0
		for(multiplicityObjective : unfinishedMultiplicityObjectives) {
			val multiplicity = multiplicityObjective.getFitness(context)
//			println(multiplicityObjective.name + "=" + multiplicity)
			if(multiplicityObjective.containment) {
				containmentMultiplicity+=multiplicity
			} else {
				nonContainmentMultiplicity+=multiplicity
			}
			
		}
		
		var sum = 0.0
		sum += scopeFitnes*scopeWeight
		sum += containmentMultiplicity*conaintmentWeight
		sum += nonContainmentMultiplicity*nonContainmentWeight
		sum += unfinishedWFsFitness*unfinishedWFWeight
		
//		println('''scope=«scopeFitnes», containment=«containmentMultiplicity», nonContainment=«nonContainmentMultiplicity», wf=«unfinishedWFsFitness», sum=«sum»''')
		
		return sum
	}
	
	override getWorstPossibleFitness(ThreadContext threadContext) {
		Double.POSITIVE_INFINITY
	}
	
	override getBestPossibleFitness(ThreadContext threadContext) {
		0.0
	}

	override getLevel() { 2 }

	override getName() { "CompositeUnfinishednessObjective" }

	override isHardObjective() { true }

	override satisifiesHardObjective(Double fitness) { fitness < 0.01 }

	override setComparator(Comparator<Double> comparator) {
		throw new UnsupportedOperationException("Model generation objective comparator cannot be set.")
	}

	override setLevel(int level) {
		throw new UnsupportedOperationException("Model generation objective level cannot be set.")
	}
}
