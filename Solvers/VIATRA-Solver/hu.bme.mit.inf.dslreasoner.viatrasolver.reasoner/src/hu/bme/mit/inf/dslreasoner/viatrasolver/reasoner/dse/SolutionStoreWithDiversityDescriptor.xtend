package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.DiversityDescriptor
import java.util.LinkedList
import java.util.List
import org.eclipse.viatra.dse.base.ThreadContext
import java.util.HashSet
import java.util.Set

enum DiversityGranularity {
	Nodewise, Graphwise
}

class SolutionStoreWithDiversityDescriptor {
	val DiversityDescriptor descriptor
	DiversityGranularity granularity
	val PartialInterpretation2ImmutableTypeLattice solutionCoder = new PartialInterpretation2ImmutableTypeLattice
	val Set<Integer> solutionCodeList = new HashSet
	
	var long runtime
	var int allCheck
	var int successfulCheck
	
	new(DiversityDescriptor descriptor) {
		if(descriptor.ensureDiversity) {
			this.descriptor = descriptor
			this.granularity = DiversityGranularity::Nodewise
		} else {
			this.descriptor = null
			this.granularity = DiversityGranularity::Nodewise
		}
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
			var boolean isDifferent
			if(this.granularity == DiversityGranularity::Graphwise) {
				val code = solutionCoder.createRepresentation(model,
				descriptor.range,
				descriptor.parallels,
				descriptor.maxNumber,
				descriptor.relevantTypes,
				descriptor.relevantRelations).modelRepresentation.hashCode
			
				isDifferent = !solutionCodeList.contains(code)
			} else if(this.granularity == DiversityGranularity::Nodewise){
				val codes = solutionCoder.createRepresentation(model,
				descriptor.range,
				descriptor.parallels,
				descriptor.maxNumber,
				descriptor.relevantTypes,
				descriptor.relevantRelations).modelRepresentation.keySet.map[hashCode].toList
				val differentCodes = codes.filter[!solutionCodeList.contains(it)]
				//println(differentCodes.size)
				
				isDifferent = differentCodes.size>=3
				if(isDifferent)println(differentCodes.size)
			} else {
				throw new UnsupportedOperationException('''Unsupported diversity type: «this.granularity»''')
			}
			
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
			if(this.granularity == DiversityGranularity::Graphwise) {
				val code = solutionCoder.createRepresentation(model,
				descriptor.range,
				descriptor.parallels,
				descriptor.maxNumber,
				descriptor.relevantTypes,
				descriptor.relevantRelations).modelRepresentation.hashCode
			
				solutionCodeList += code.hashCode
			} else if(this.granularity == DiversityGranularity::Nodewise){
				val codes = solutionCoder.createRepresentation(model,
				descriptor.range,
				descriptor.parallels,
				descriptor.maxNumber,
				descriptor.relevantTypes,
				descriptor.relevantRelations).modelRepresentation.keySet.map[hashCode].toList
				
				solutionCodeList += codes.map[it.hashCode]
			} else {
				throw new UnsupportedOperationException('''Unsupported diversity type: «this.granularity»''')
			}
			
			runtime += System.nanoTime - start
		}
	}
}