package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import com.google.common.collect.ImmutableList
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.LinkedHashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.viatra.dse.base.ThreadContext
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
class CopiedSolution {
	@Accessors val PartialInterpretation partialInterpretations
	@Accessors val Map<EObject, EObject> trace
	@Accessors val long copierRuntime
	@Accessors var boolean current = true
}

/**
 * Based on {@link SolutionStore.BestSolutionSaver}.
 * 
 * Will also automatically fill any missing numerical values in the saved solutions
 * using the supplied {@link NumericSolver}.
 */
class SolutionCopier {
	val NumericSolver numericSolver
	val copiedSolutions = new LinkedHashMap<Object, CopiedSolution>

	long startTime = System.nanoTime
	@Accessors(PUBLIC_GETTER) long totalCopierRuntime = 0

	new(NumericSolver numericSolver) {
		this.numericSolver = numericSolver
	}

	def void copySolution(ThreadContext context, Object solutionId) {
		val existingCopy = copiedSolutions.get(solutionId)
		if (existingCopy === null) {
			val copyStart = System.nanoTime
			val solution = context.model as PartialInterpretation
			val copier = new EcoreUtil.Copier
			val copiedPartialInterpretation = copier.copy(solution) as PartialInterpretation
			copier.copyReferences
			totalCopierRuntime += System.nanoTime - copyStart
			val copierRuntime = System.nanoTime - startTime
			val copiedSolution = new CopiedSolution(copiedPartialInterpretation, copier, copierRuntime)
			numericSolver.fillSolutionCopy(copiedSolution.trace)
			copiedSolutions.put(solutionId, copiedSolution)
		} else {
			existingCopy.current = true
		}
	}

	def void markAsObsolete(Object solutionId) {
		val copiedSolution = copiedSolutions.get(solutionId)
		if (copiedSolution === null) {
			throw new IllegalStateException("No solution to mark as obsolete for state code: " + solutionId)
		}
		copiedSolution.current = false
	}

	def List<PartialInterpretation> getPartialInterpretations(boolean currentOnly) {
		getListOfCopiedSolutions(currentOnly).map[partialInterpretations]
	}

	def List<Map<EObject, EObject>> getTraces(boolean currentOnly) {
		getListOfCopiedSolutions(currentOnly).map[trace]
	}

	def List<Long> getAllCopierRuntimes(boolean currentOnly) {
		getListOfCopiedSolutions(currentOnly).map[copierRuntime]
	}

	def List<CopiedSolution> getListOfCopiedSolutions(boolean currentOnly) {
		val values = copiedSolutions.values
		val filteredSolutions = if (currentOnly) {
				values.filter[current]
			} else {
				values
			}
		ImmutableList.copyOf(filteredSolutions)
	}
}
