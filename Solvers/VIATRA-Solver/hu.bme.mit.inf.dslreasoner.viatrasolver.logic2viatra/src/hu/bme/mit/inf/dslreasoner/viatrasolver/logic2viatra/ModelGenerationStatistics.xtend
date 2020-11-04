package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra

class ModelGenerationStatistics {
	public var long transformationExecutionTime = 0
	public var long metricCalculationTime = 0
	
	
	synchronized def addMetricCalculationTime(long amount) {
		metricCalculationTime+=amount
	}
	synchronized def addExecutionTime(long amount) {
		transformationExecutionTime += amount
	}

	public var long scopePropagationTime = 0

	synchronized def addScopePropagationTime(long amount) {
		scopePropagationTime += amount
	}

	public var long mustRelationPropagationTime = 0

	synchronized def addMustRelationPropagationTime(long amount) {
		mustRelationPropagationTime += amount
	}

	public var long preliminaryTypeAnalisisTime = 0

	public var int decisionsTried = 0

	synchronized def incrementDecisionCount() {
		decisionsTried++
	}

	public var int transformationInvocations

	synchronized def incrementTransformationCount() {
		transformationInvocations++
	}

	public var int scopePropagatorInvocations

	synchronized def incrementScopePropagationCount() {
		scopePropagatorInvocations++
	}

	public var int scopePropagatorSolverInvocations

	synchronized def incrementScopePropagationSolverCount() {
		scopePropagatorSolverInvocations++
	}
}
