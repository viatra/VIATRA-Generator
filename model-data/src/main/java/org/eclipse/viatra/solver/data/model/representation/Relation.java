package org.eclipse.viatra.solver.data.model.representation;

import org.eclipse.viatra.solver.data.model.Tuple;
import org.eclipse.viatra.solver.data.model.TupleHashProvider;

public class Relation<D> extends DataRepresentation<Tuple, D> {
	private final String name;
	private final int arity;

	public Relation(String name, int arity, Class<D> domain, D defaultValue) {
		super(Tuple.class, TupleHashProvider.singleton(), domain, defaultValue);
		this.name = name;
		this.arity = arity;
	}

	@Override
	public String getName() {
		return name;
	}

	public int getArity() {
		return arity;
	}

	@Override
	public boolean isValidKey(Tuple key) {
		return key.getSize() == getArity();
	}
}
