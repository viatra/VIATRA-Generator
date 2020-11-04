package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import com.google.common.collect.HashMultiset
import com.google.common.collect.ImmutableSet
import com.google.common.collect.Multiset
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.NeighbourhoodWithTraces
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.DiversityDescriptor
import java.util.Collection
import java.util.HashSet
import java.util.Map
import java.util.Set
import org.eclipse.viatra.dse.base.ThreadContext
import org.eclipse.xtend.lib.annotations.Accessors

interface DiversityChecker {
	public static val NO_DIVERSITY_CHECKER = new DiversityChecker {
		override isActive() {
			false
		}

		override getTotalRuntime() {
			0
		}

		override getSuccessRate() {
			1.0
		}

		override newSolution(ThreadContext threadContext, Object solutionId, Collection<Object> dominatedSolutionIds) {
			true
		}
	}

	def boolean isActive()

	def long getTotalRuntime()

	def double getSuccessRate()

	def boolean newSolution(ThreadContext threadContext, Object solutionId, Collection<Object> dominatedSolutionIds)

	static def of(DiversityDescriptor descriptor) {
		if (descriptor.ensureDiversity) {
			new NodewiseDiversityChecker(descriptor)
		} else {
			NO_DIVERSITY_CHECKER
		}
	}
}

abstract class AbstractDiversityChecker implements DiversityChecker {
	val DiversityDescriptor descriptor
	val PartialInterpretation2ImmutableTypeLattice solutionCoder = new PartialInterpretation2ImmutableTypeLattice

	@Accessors(PUBLIC_GETTER) var long totalRuntime = 0
	var int allCheckCount = 0
	var int successfulCheckCount = 0

	protected new(DiversityDescriptor descriptor) {
		if (!descriptor.ensureDiversity) {
			throw new IllegalArgumentException(
				"Diversity description should enforce diversity or NO_DIVERSITY_CHECKER should be used instead.")
		}
		this.descriptor = descriptor
	}

	override isActive() {
		true
	}

	override getTotalRuntime() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override getSuccessRate() {
		(allCheckCount as double) / (successfulCheckCount as double)
	}

	override newSolution(ThreadContext threadContext, Object solutionId, Collection<Object> dominatedSolutionIds) {
		val start = System.nanoTime
		val model = threadContext.model as PartialInterpretation
		val representation = solutionCoder.createRepresentation(model, descriptor.range, descriptor.parallels,
			descriptor.maxNumber, descriptor.relevantTypes, descriptor.relevantRelations)
		val isDifferent = internalNewSolution(representation, solutionId, dominatedSolutionIds)
		totalRuntime += System.nanoTime - start
		allCheckCount++
		if (isDifferent) {
			successfulCheckCount++
		}
		isDifferent
	}

	protected abstract def boolean internalNewSolution(
		NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor> representation,
		Object solutionId, Collection<Object> dominatedSolutionIds)
}

class NodewiseDiversityChecker extends AbstractDiversityChecker {
	var Multiset<Integer> nodeCodes = HashMultiset.create
	val Map<Object, Set<Integer>> tracedNodeCodes = newHashMap

	new(DiversityDescriptor descriptor) {
		super(descriptor)
	}

	override protected internalNewSolution(
		NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor> representation,
		Object solutionId, Collection<Object> dominatedSolutionIds) {
		val nodeCodesInSolution = ImmutableSet.copyOf(representation.modelRepresentation.keySet.map[hashCode])
		val remainingNodeCodes = if (dominatedSolutionIds.empty) {
				nodeCodes
			} else {
				getRemainingNodeCodes(dominatedSolutionIds)
			}
		val hasNewCode = nodeCodesInSolution.exists[!remainingNodeCodes.contains(it)]
		if (hasNewCode) {
			nodeCodes = remainingNodeCodes
			nodeCodes.addAll(nodeCodesInSolution)
			for (dominatedSolutionId : dominatedSolutionIds) {
				tracedNodeCodes.remove(dominatedSolutionId)
			}
			tracedNodeCodes.put(solutionId, nodeCodesInSolution)
		}
		hasNewCode
	}

	private def getRemainingNodeCodes(Collection<Object> dominatedSolutionIds) {
		// TODO Optimize multiset operations.
		val copyOfNodeCodes = HashMultiset.create(nodeCodes)
		for (dominatedSolutionId : dominatedSolutionIds) {
			val dominatedModelCode = tracedNodeCodes.get(dominatedSolutionId)
			if (dominatedModelCode === null) {
				throw new IllegalArgumentException("Unknown dominated solution: " + dominatedSolutionId)
			}
			copyOfNodeCodes.removeAll(dominatedModelCode)
		}
		copyOfNodeCodes
	}
}

class GraphwiseDiversityChecker extends AbstractDiversityChecker {
	var Set<Integer> modelCodes = newHashSet
	val Map<Object, Integer> tracedModelCodes = newHashMap

	new(DiversityDescriptor descriptor) {
		super(descriptor)
	}

	override protected internalNewSolution(
		NeighbourhoodWithTraces<Map<? extends AbstractNodeDescriptor, Integer>, AbstractNodeDescriptor> representation,
		Object solutionId, Collection<Object> dominatedSolutionIds) {
		val modelCodeOfSolution = representation.modelRepresentation.hashCode
		val remainingModelCodes = if (dominatedSolutionIds.empty) {
				modelCodes
			} else {
				getRemainingModelCodes(dominatedSolutionIds)
			}
		val isNewCode = !remainingModelCodes.contains(modelCodeOfSolution)
		if (isNewCode) {
			modelCodes = remainingModelCodes
			modelCodes += modelCodeOfSolution
			for (dominatedSolutionId : dominatedSolutionIds) {
				tracedModelCodes.remove(dominatedSolutionId)
			}
			tracedModelCodes.put(solutionId, modelCodeOfSolution)
		}
		isNewCode
	}

	private def getRemainingModelCodes(Collection<Object> dominatedSolutionIds) {
		val copyOfModelCodes = new HashSet(modelCodes)
		for (dominatedSolutionId : dominatedSolutionIds) {
			val dominatedModelCode = tracedModelCodes.get(dominatedSolutionId)
			if (dominatedModelCode === null) {
				throw new IllegalArgumentException("Unknown dominated solution: " + dominatedSolutionId)
			}
			copyOfModelCodes -= dominatedModelCode
		}
		copyOfModelCodes
	}
}
