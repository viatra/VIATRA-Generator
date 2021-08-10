package org.eclipse.viatra.solver.data.model.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.viatra.solver.data.map.ContinousHashProvider;
import org.eclipse.viatra.solver.data.map.Cursor;
import org.eclipse.viatra.solver.data.map.DiffCursor;
import org.eclipse.viatra.solver.data.map.VersionedMap;
import org.eclipse.viatra.solver.data.map.internal.MapDiffCursor;
import org.eclipse.viatra.solver.data.model.Model;
import org.eclipse.viatra.solver.data.model.ModelDiffCursor;
import org.eclipse.viatra.solver.data.model.ModelStore;
import org.eclipse.viatra.solver.data.model.representation.DataRepresentation;

public class ModelImpl implements Model {
	private final ModelStore store;
	private final Map<DataRepresentation<?, ?>, VersionedMap<?, ?>> maps;

	public ModelImpl(ModelStore store, Map<DataRepresentation<?, ?>, VersionedMap<?, ?>> maps) {
		this.store = store;
		this.maps = maps;
	}

	@Override
	public Set<DataRepresentation<?, ?>> getDataRepresentations() {
		return maps.keySet();
	}

	@SuppressWarnings("unchecked")
	private <K, V> VersionedMap<K, V> getMap(DataRepresentation<K, V> representation) {
		if (maps.containsKey(representation)) {
			return (VersionedMap<K, V>) maps.get(representation);
		} else {
			throw new IllegalArgumentException("Model does have representation " + representation);
		}
	}

	private <K, V> VersionedMap<K, V> getMapValidateKey(DataRepresentation<K, V> representation, K key) {
		if (representation.isValidKey(key)) {
			return getMap(representation);
		} else {
			throw new IllegalArgumentException(
					"Key is not valid for representation! (representation=" + representation + ", key=" + key + ");");
		}
	}

	@Override
	public <K, V> V get(DataRepresentation<K, V> representation, K key) {
		return getMapValidateKey(representation, key).get(key);
	}

	@Override
	public <K, V> Cursor<K, V> getAll(DataRepresentation<K, V> representation) {
		return getMap(representation).getCursor();
	}

	@Override
	public <K, V> void put(DataRepresentation<K, V> representation, K key, V value) {
		getMapValidateKey(representation, key).put(key, value);
	}

	@Override
	public <K, V> void putAll(DataRepresentation<K, V> representation, Cursor<K, V> cursor) {
		getMap(representation).putAll(cursor);
	}

	@Override
	public <K, V> long getSize(DataRepresentation<K, V> representation) {
		return getMap(representation).getSize();
	}

	@Override
	public ModelDiffCursor getDiffCursor(long to) {
		Model toModel = store.createModel(to);
		Map<DataRepresentation<?, ?>, DiffCursor<?, ?>> diffCursors = new HashMap<>();
		for (DataRepresentation<?, ?> representation : this.maps.keySet()) {
			MapDiffCursor<?, ?> diffCursor = constructDiffCursor(toModel, representation);
			diffCursors.put(representation, diffCursor);
		}
		return new ModelDiffCursor(diffCursors);
	}

	private <K, V> MapDiffCursor<K, V> constructDiffCursor(Model toModel, DataRepresentation<K, V> representation) {
		@SuppressWarnings("unchecked")
		Cursor<K, V> fromCursor = (Cursor<K, V>) this.maps.get(representation).getCursor();
		Cursor<K, V> toCursor = toModel.getAll(representation);

		ContinousHashProvider<K> hashProvider = representation.getHashProvider();
		V defaultValue = representation.getDefaultValue();
		return new MapDiffCursor<>(hashProvider, defaultValue, fromCursor, toCursor);
	}

	@Override
	public long commit() {
		long version = 0;
		boolean versionSet = false;
		for (VersionedMap<?, ?> map : maps.values()) {
			long newVersion = map.commit();
			if (versionSet) {
				if (version != newVersion) {
					throw new IllegalStateException(
							"Maps in model have different versions! (" + version + " and" + newVersion + ")");
				}
			} else {
				version = newVersion;
				versionSet = true;
			}
		}
		return version;
	}

	@Override
	public void restore(long state) {
		if(store.getStates().contains(state)) {
			for (VersionedMap<?, ?> map : maps.values()) {
				map.restore(state);
			}
		} else {
			throw new IllegalArgumentException("Map does not contain state "+state+"!");
		}
	}
}
