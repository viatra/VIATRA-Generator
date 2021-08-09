package org.eclipse.viatra.solver.data.model;

import java.util.Map;
import java.util.Set;

import org.eclipse.viatra.solver.data.map.Versioned;
import org.eclipse.viatra.solver.data.map.VersionedMap;
import org.eclipse.viatra.solver.data.model.symbols.Symbol;

public class Model implements Versioned {
	private final ModelStore store;
	private final Map<Symbol, VersionedMap<Tuple,Object>> maps;

	public Model(ModelStore store, Map<Symbol, VersionedMap<Tuple, Object>> maps) {
		this.store = store;
		this.maps = maps;
	}

	public Set<Symbol> getSymbols() {
		return store.getSymbols();
	}

	public Object get(Symbol symbol, int... key) {
		if (maps.containsKey(symbol)) {
			if (key.length == symbol.getArity()) {
				return maps.get(symbol).get(Tuple.of(key));
			} else {
				throw new IllegalArgumentException("The arity of symbol " + symbol.getName() + "is " + symbol.getArity()
						+ " and not " + key.length);
			}
		} else {
			throw new IllegalArgumentException("Model does define symbol " + symbol.getName());
		}
	}

	public void put(Symbol symbol, Object value, int... key) {
		if (maps.containsKey(symbol)) {
			if (key.length == symbol.getArity()) {
				maps.get(symbol).put(Tuple.of(key),value);
			} else {
				throw new IllegalArgumentException("The arity of symbol " + symbol.getName() + "is " + symbol.getArity()
						+ " and not " + key.length);
			}
		} else {
			throw new IllegalArgumentException("Model does define symbol " + symbol.getName());
		}
	}

	@Override
	public long commit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void restore(long state) {
		// TODO Auto-generated method stub

	}
}
