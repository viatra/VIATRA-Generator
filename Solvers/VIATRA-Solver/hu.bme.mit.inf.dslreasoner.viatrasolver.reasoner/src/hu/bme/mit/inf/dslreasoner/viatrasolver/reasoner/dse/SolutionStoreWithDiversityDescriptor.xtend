package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.DiversityDescriptor
import java.util.LinkedList
import java.util.List
import org.eclipse.viatra.dse.base.ThreadContext

class SolutionStoreWithDiversityDescriptor {
	val DiversityDescriptor descriptor
	val PartialInterpretation2ImmutableTypeLattice solutionCoder = new PartialInterpretation2ImmutableTypeLattice
	val List<Integer> solutionCodeList = new LinkedList
	
	var long runtime
	var int allCheck
	var int successfulCheck
	
	public new(DiversityDescriptor descriptor) {
		this.descriptor = descriptor
	}
	
	def public isActive() {
		descriptor!==null
	}
	
	def getSumRuntime() {
		return runtime
	}
	def getSuccessRate() {
		return successfulCheck as double / allCheck
	}
	
	def isDifferent(ThreadContext context) {
		if(active) {
			val start = System.nanoTime
			val model = context.model as PartialInterpretation
			val code = solutionCoder.createRepresentation(model,
				descriptor.range,
				descriptor.parallels,
				descriptor.maxNumber,
				descriptor.relevantTypes,
				descriptor.relevantRelations,null).modelRepresentation.hashCode
			val isDifferent = solutionCodeList.forall[previous | ! code.equals(previous)]
			runtime += System.nanoTime - start
			allCheck++
			if(isDifferent) { successfulCheck++ }
			return isDifferent
		} else {
			allCheck++
			successfulCheck++
			return true
		}
	}
	
	def canBeDifferent(ThreadContext context) {
		return true
	}
	
	def newSolution(ThreadContext context) {
		if(active) {
			val start = System.nanoTime
			val model = context.model as PartialInterpretation
			val code = solutionCoder.createRepresentation(model,
				descriptor.range,
				descriptor.parallels,
				descriptor.maxNumber,
				descriptor.relevantTypes,
				descriptor.relevantRelations,null).modelRepresentation.hashCode
			solutionCodeList += code
			runtime += System.nanoTime - start
		}
	}
}