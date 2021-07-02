package org.eclipse.viatra.solver.data;

public class NamedTruthValue implements TruthValue {
	private final String name;
	public NamedTruthValue(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return this.name;
	}

}
