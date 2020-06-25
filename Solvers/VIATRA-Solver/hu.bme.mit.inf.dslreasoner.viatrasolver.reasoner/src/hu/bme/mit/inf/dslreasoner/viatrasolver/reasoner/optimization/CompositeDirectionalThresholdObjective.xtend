package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization

import com.google.common.collect.ImmutableList
import java.util.Collection
import org.eclipse.viatra.dse.base.ThreadContext

class CompositeDirectionalThresholdObjective extends DirectionalThresholdObjective {
	val Collection<DirectionalThresholdObjective> objectives

	new(String name, Collection<DirectionalThresholdObjective> objectives) {
		this(name, objectives, getKind(objectives), getThreshold(objectives), getLevel(objectives))
	}

	new(String name, DirectionalThresholdObjective... objectives) {
		this(name, objectives as Collection<DirectionalThresholdObjective>)
	}

	protected new(String name, Iterable<DirectionalThresholdObjective> objectives, ObjectiveKind kind,
		ObjectiveThreshold threshold, int level) {
		super(name, kind, threshold, level)
		this.objectives = ImmutableList.copyOf(objectives)
	}

	override createNew() {
		new CompositeDirectionalThresholdObjective(name, objectives.map[createNew as DirectionalThresholdObjective],
			kind, threshold, level)
	}

	override init(ThreadContext context) {
		for (objective : objectives) {
			objective.init(context)
		}
	}

	override protected getRawFitness(ThreadContext context) {
		var double fitness = 0
		for (objective : objectives) {
			fitness += objective.getFitness(context)
		}
		fitness
	}

	private static def getKind(Collection<DirectionalThresholdObjective> objectives) {
		val kinds = objectives.map[kind].toSet
		if (kinds.size != 1) {
			throw new IllegalArgumentException("Passed objectives must have the same kind")
		}
		kinds.head
	}

	private static def getThreshold(Collection<DirectionalThresholdObjective> objectives) {
		objectives.map[threshold].reduce[a, b|a.merge(b)]
	}

	private static def int getLevel(Collection<DirectionalThresholdObjective> objectives) {
		val levels = objectives.map[level].toSet
		if (levels.size != 1) {
			throw new IllegalArgumentException("Passed objectives must have the same level")
		}
		levels.head
	}
}
