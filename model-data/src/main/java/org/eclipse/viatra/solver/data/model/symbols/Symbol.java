package org.eclipse.viatra.solver.data.model.symbols;

import java.util.Comparator;

public class Symbol {
	public static final Comparator<Symbol> symbolComparator = (o1, o2) -> o1.getName().compareTo(o2.getName());
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
