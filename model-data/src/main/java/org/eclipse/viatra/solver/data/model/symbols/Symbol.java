package org.eclipse.viatra.solver.data.model.symbols;

public class Symbol {
	private final String name;
	private final int arity;
	
	public Symbol(String name, int arity) {
		super();
		this.name = name;
		this.arity = arity;
	}
	
	public String getName() {
		return name;
	}
	public int getArity() {
		return arity;
	}
}
