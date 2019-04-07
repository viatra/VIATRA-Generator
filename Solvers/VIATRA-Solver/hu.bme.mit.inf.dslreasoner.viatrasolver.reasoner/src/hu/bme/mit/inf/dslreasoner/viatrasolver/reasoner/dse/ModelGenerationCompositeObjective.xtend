package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import com.google.common.collect.ImmutableList
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.IThreeValuedObjective
import java.util.Comparator
import java.util.List
import org.eclipse.viatra.dse.base.ThreadContext
import org.eclipse.viatra.dse.objectives.Comparators
import org.eclipse.viatra.dse.objectives.IObjective
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

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

@FinalFieldsConstructor
class ModelGenerationCompositeObjective implements IThreeValuedObjective {
	val IObjective scopeObjective
	val List<IObjective> unfinishedMultiplicityObjectives
	val IObjective unfinishedWFObjective

	override init(ThreadContext context) {
		this.scopeObjective.init(context)
		this.unfinishedMultiplicityObjectives.forEach[it.init(context)]
		this.unfinishedWFObjective.init(context)
	}

	override createNew() {
		return new ModelGenerationCompositeObjective(
			scopeObjective.createNew,
			ImmutableList.copyOf(unfinishedMultiplicityObjectives.map[createNew]),
			unfinishedWFObjective.createNew
		)
	}

	override getComparator() { Comparators.LOWER_IS_BETTER }

	override getFitness(ThreadContext context) {
		var sum = 0.0
		val scopeFitnes = scopeObjective.getFitness(context)
		// val unfinishedMultiplicitiesFitneses = unfinishedMultiplicityObjectives.map[x|x.getFitness(context)]
		val unfinishedWFsFitness = unfinishedWFObjective.getFitness(context)

		sum += scopeFitnes
		var multiplicity = 0.0
		for (multiplicityObjective : unfinishedMultiplicityObjectives) {
			multiplicity += multiplicityObjective.getFitness(context) // *0.5
		}
		sum += multiplicity
		sum += unfinishedWFsFitness // *0.5
		// println('''Sum=«sum»|Scope=«scopeFitnes»|Multiplicity=«multiplicity»|WFs=«unfinishedWFsFitness»''')
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

	override satisifiesHardObjective(Double fitness) { fitness <= 0.001 }

	override setComparator(Comparator<Double> comparator) {
		throw new UnsupportedOperationException("Model generation objective comparator cannot be set.")
	}

	override setLevel(int level) {
		throw new UnsupportedOperationException("Model generation objective level cannot be set.")
	}
}
