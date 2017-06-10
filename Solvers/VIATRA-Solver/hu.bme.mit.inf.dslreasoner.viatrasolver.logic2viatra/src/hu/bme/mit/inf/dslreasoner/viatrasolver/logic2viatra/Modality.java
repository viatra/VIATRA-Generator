package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra;

public enum Modality {
	MUST, MAY, CURRENT;
	public boolean isMust() {
		return this == MUST;
	}
	public boolean isMay() {
		return this == MAY;
	}
	public boolean isCurrent() {
		return this == CURRENT;
	}
	public boolean isMustOrCurrent() {
		return isMust() || isCurrent();
	}
	public Modality getDual() {
		if(this.isCurrent()) return CURRENT;
		else if(this.isMust())return MAY;
		else return MUST;
	}
}
