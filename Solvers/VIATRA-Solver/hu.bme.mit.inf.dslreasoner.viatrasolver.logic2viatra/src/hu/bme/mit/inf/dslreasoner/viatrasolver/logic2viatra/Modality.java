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
		switch (this) {
		case CURRENT:
			return CURRENT;
		case MUST:
			return MAY;
		case MAY:
			return MUST;
		default:
			throw new UnsupportedOperationException("Unknown Modality: " + this);
		}
	}

	public Modality toBase() {
		if (this.isCurrent()) {
			return MUST;
		} else {
			return this;
		}
	}

	@Override
	public String toString() {
		return super.toString().toLowerCase();
	}
}
