package org.eclipse.viatra.solver.data.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.viatra.solver.data.map.ContinousHashProvider;
import org.eclipse.viatra.solver.data.map.DiffCursor;
import org.eclipse.viatra.solver.data.map.VersionedMap;
import org.eclipse.viatra.solver.data.map.VersionedMapStore;
import org.eclipse.viatra.solver.data.map.VersionedMapStoreImpl;
import org.eclipse.viatra.solver.data.model.internal.ModelImpl;
import org.eclipse.viatra.solver.data.model.internal.SymbolRepresentationEquivalenceClass;
import org.eclipse.viatra.solver.data.model.representation.AuxilaryDataRepresentation;
import org.eclipse.viatra.solver.data.model.representation.DataRepresentation;
import org.eclipse.viatra.solver.data.model.representation.SymbolRepresentation;

public class ModelStoreImpl implements ModelStore {

	private final Map<DataRepresentation<?, ?>, VersionedMapStore<?, ?>> stores;

	public ModelStoreImpl(Set<DataRepresentation<?, ?>> dataRepresentations) {
		stores = initStores(dataRepresentations);
	}

	private Map<DataRepresentation<?, ?>, VersionedMapStore<?, ?>> initStores(
			Set<DataRepresentation<?, ?>> dataRepresentations) {
		Map<DataRepresentation<?, ?>, VersionedMapStore<?, ?>> result = new HashMap<>();

		Map<SymbolRepresentationEquivalenceClass, List<SymbolRepresentation<?>>> symbolRepresentationsPerHashPerArity = new HashMap<>();

		for (DataRepresentation<?, ?> dataRepresentation : dataRepresentations) {
			if (dataRepresentation instanceof SymbolRepresentation<?>) {
				SymbolRepresentation<?> symbolRepresentation = (SymbolRepresentation<?>) dataRepresentation;
				addOrCreate(symbolRepresentationsPerHashPerArity,
						new SymbolRepresentationEquivalenceClass(symbolRepresentation), symbolRepresentation);
			} else if (dataRepresentation instanceof AuxilaryDataRepresentation<?, ?>) {
				VersionedMapStoreImpl<?, ?> store = new VersionedMapStoreImpl<>(dataRepresentation.getHashProvider(),
						dataRepresentation.getDefaultValue());
				result.put(dataRepresentation, store);
			} else {
				throw new UnsupportedOperationException(
						"Model store does not have strategy to use " + dataRepresentation.getClass() + "!");
			}
		}
		for (List<SymbolRepresentation<?>> symbolGroup : symbolRepresentationsPerHashPerArity.values()) {
			initRepresentationGroup(result, symbolGroup);
		}

		return result;
	}

	private void initRepresentationGroup(Map<DataRepresentation<?, ?>, VersionedMapStore<?, ?>> result,
			List<SymbolRepresentation<?>> symbolGroup) {
		final ContinousHashProvider<Tuple> hashProvider = symbolGroup.get(0).getHashProvider();
		final Object defaultValue = symbolGroup.get(0).getDefaultValue();
		
		List<VersionedMapStore<Tuple, Object>> maps = VersionedMapStoreImpl
				.createSharedVersionedMapStores(symbolGroup.size(), hashProvider, defaultValue);
		
		for (int i = 0; i < symbolGroup.size(); i++) {
			result.put(symbolGroup.get(i), maps.get(i));
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
	public Set<DataRepresentation<?, ?>> getDataRepresentations() {
		return this.stores.keySet();
	}

	@Override
	public ModelImpl createModel() {
		Map<DataRepresentation<?, ?>, VersionedMap<?, ?>> maps = new HashMap<>();
		for (Entry<DataRepresentation<?, ?>, VersionedMapStore<?, ?>> entry : this.stores.entrySet()) {
			maps.put(entry.getKey(), entry.getValue().createMap());
		}
		return new ModelImpl(this, maps);
	}

	@Override
	public synchronized ModelImpl createModel(long state) {
		Map<DataRepresentation<?, ?>, VersionedMap<?, ?>> maps = new HashMap<>();
		for (Entry<DataRepresentation<?, ?>, VersionedMapStore<?, ?>> entry : this.stores.entrySet()) {
			maps.put(entry.getKey(), entry.getValue().createMap(state));
		}
		return new ModelImpl(this, maps);
	}
	
	@Override
	@SuppressWarnings("squid:S1751")
	public synchronized Set<Long> getStates() {
		// if not empty, return first
		for(VersionedMapStore<?, ?> store : stores.values()) {
			return new HashSet<>(store.getStates());
		}
		// if empty
		Set<Long> result = new HashSet<>();
		result.add(0l);
		return result;
	}

	@Override
	public synchronized ModelDiffCursor getDiffCursor(long from, long to) {
		Map<DataRepresentation<?, ?>,DiffCursor<?,?>> diffcursors = new HashMap<>();
		for(Entry<DataRepresentation<?, ?>, VersionedMapStore<?, ?>> entry : stores.entrySet()) {
			DataRepresentation<?, ?> representation = entry.getKey();
			DiffCursor<?, ?> diffCursor = entry.getValue().getDiffCursor(from, to);
			diffcursors.put(representation, diffCursor);
		}
		return new ModelDiffCursor(diffcursors);
	}
}
