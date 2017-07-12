package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse;

import java.util.Arrays;

import org.eclipse.viatra.dse.objectives.Fitness;

class TrajectoryWithFitness {

	public Object[] trajectory;
	public Fitness fitness;

	public TrajectoryWithFitness(Object[] trajectory, Fitness fitness) {
		super();
		this.trajectory = trajectory;
		this.fitness = fitness;
	}

	@Override
	public String toString() {
		return Arrays.toString(trajectory) + fitness.toString();
	}
}