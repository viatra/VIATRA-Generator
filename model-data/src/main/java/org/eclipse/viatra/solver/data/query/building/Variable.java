package org.eclipse.viatra.solver.data.query.building;

public class Variable {
	private final String name;
	private final String uniqueName;

	public Variable(String name) {
		super();
		this.name = name;
		this.uniqueName = DNFPredicate.generateUniqueName(name, "variable");
		
	}
	public String getName() {
		return name;
	}
	public String getUniqueName() {
		return uniqueName;
	}
	public boolean isNamed() {
		return name != null;
	}
}
