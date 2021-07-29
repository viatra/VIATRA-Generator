package org.eclipse.viatra.solver.data;

public class DefinedSymbol extends Symbol {
	private final String name;
	public DefinedSymbol(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
