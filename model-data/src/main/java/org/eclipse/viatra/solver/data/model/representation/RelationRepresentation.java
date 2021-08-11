package org.eclipse.viatra.solver.data.model.representation;

import org.eclipse.viatra.solver.data.model.Tuple;
import org.eclipse.viatra.solver.data.model.TupleHashProvider;
import org.eclipse.viatra.solver.data.model.symbols.Symbol;

public class RelationRepresentation <D> extends DataRepresentation<Tuple,D> {
	private final Symbol symbol;

	public RelationRepresentation(Symbol symbol,Class<D> domain, D defaultValue) {
		super(Tuple.class,TupleHashProvider.singleton(),domain,defaultValue);
		this.symbol = symbol;
	}
	
	@Override
	public String getName() {
		return symbol.getName();
	}

	public Symbol getSymbol() {
		return symbol;
	}
	
	@Override
	public boolean isValidKey(Tuple key) {
		return key.getSize() == symbol.getArity();
	}


}
