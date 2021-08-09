package org.eclipse.viatra.solver.data.model;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.eclipse.viatra.solver.data.map.VersionedMap;
import org.eclipse.viatra.solver.data.map.VersionedMapStore;
import org.eclipse.viatra.solver.data.map.VersionedMapStoreImpl;
import org.eclipse.viatra.solver.data.model.symbols.IntegerSymbol;
import org.eclipse.viatra.solver.data.model.symbols.PredicateSymbol;
import org.eclipse.viatra.solver.data.model.symbols.RealSymbol;
import org.eclipse.viatra.solver.data.model.symbols.Symbol;
import org.eclipse.viatra.solver.data.model.values.TruthValue;

public class ModelStoreImpl implements ModelStore {
	
	private final Map<Symbol, VersionedMapStore<Tuple, Object>> stores;
	private final Set<Long> states = new HashSet<>();

	public ModelStoreImpl(Set<Symbol> symbols) {
		stores = initStores(symbols);
	}

	private Map<Symbol, VersionedMapStore<Tuple, Object>> initStores(Set<Symbol> symbols) {
		Map<Symbol, VersionedMapStore<Tuple, Object>> result = new TreeMap<>(Symbol.symbolComparator);
		
		Map<Integer, List<PredicateSymbol>> predicateSymbols = new HashMap<>();
		Map<Integer, List<IntegerSymbol>> integerSymbols = new HashMap<>();
		Map<Integer, List<RealSymbol>> realSymbols = new HashMap<>();
		for (Symbol symbol : symbols) {
			if (symbol instanceof PredicateSymbol) {
				ModelStoreImpl.addOrCreate(predicateSymbols, symbol.getArity(), (PredicateSymbol) symbol);
			} else if (symbol instanceof IntegerSymbol) {
				ModelStoreImpl.addOrCreate(integerSymbols, symbol.getArity(), (IntegerSymbol) symbol);
			} else if (symbol instanceof RealSymbol) {
				ModelStoreImpl.addOrCreate(realSymbols, symbol.getArity(), (RealSymbol) symbol);
			}
		}
		
		initPredicateGroup(result, predicateSymbols.values(),TruthValue.False);
		initPredicateGroup(result, integerSymbols.values(), null);
		initPredicateGroup(result, realSymbols.values(), null);
		
		return result;
	}

	private <V> void initPredicateGroup(Map<Symbol, VersionedMapStore<Tuple, Object>> result,
			Collection<? extends List<? extends Symbol>> symbolGroups, V defaultValue) {
		for (List<? extends Symbol> similarSymbols : symbolGroups) {
			List<VersionedMapStore<Tuple, Object>> maps = VersionedMapStoreImpl.createSharedVersionedMapStores(
					similarSymbols.size(), TupleHashProvider.instance, defaultValue);
			for (int i = 0; i < similarSymbols.size(); i++) {
				result.put(similarSymbols.get(i), maps.get(i));
			}
		}
	}

	private static <K, V> void addOrCreate(Map<K, List<V>> map, K key, V value) {
		List<V> list;
		if (map.containsKey(key)) {
			list = map.get(key);
		} else {
			list = new LinkedList<>();
			map.put(key, list);
		}
		list.add(value);
	}
	@Override
	public Set<Symbol> getSymbols() {
		return this.stores.keySet();
	}
	@Override
	public Model createModel() {
		Map<Symbol, VersionedMap<Tuple,Object>> maps = new TreeMap<>(Symbol.symbolComparator);
		for(Entry<Symbol, VersionedMapStore<Tuple, Object>> entry : this.stores.entrySet()) {
			maps.put(entry.getKey(),entry.getValue().createMap());
		}
		return new Model(this, maps);
	}

	@Override
	public synchronized Model createModel(long state) {
		Map<Symbol, VersionedMap<Tuple,Object>> maps = new TreeMap<>(Symbol.symbolComparator);
		for(Entry<Symbol, VersionedMapStore<Tuple, Object>> entry : this.stores.entrySet()) {
			maps.put(entry.getKey(),entry.getValue().createMap(state));
		}
		return new Model(this, maps);
	}

	@Override
	synchronized public Set<Long> getStates() {
		return this.states;
	}
}
