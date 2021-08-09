package org.eclipse.viatra.solver.data.model.representation;

import org.eclipse.viatra.solver.data.model.Tuple;
import org.eclipse.viatra.solver.data.model.TupleHashProvider;
import org.eclipse.viatra.solver.data.model.symbols.Symbol;

public class SymbolRepresentation <D> extends DataRepresentation<Tuple,D> {
	private final Symbol symbol;

	public SymbolRepresentation(Symbol symbol,Class<D> domain, D defaultValue) {
		super(Tuple.class,TupleHashProvider.singleton(),domain,defaultValue);
		this.symbol = symbol;
	}

	public Symbol getSymbol() {
		return symbol;
	}
}
