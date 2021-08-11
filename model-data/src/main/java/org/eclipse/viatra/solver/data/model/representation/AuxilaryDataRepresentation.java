package org.eclipse.viatra.solver.data.model.representation;

import org.eclipse.viatra.solver.data.map.ContinousHashProvider;

public class AuxilaryDataRepresentation<K,V> extends DataRepresentation<K, V> {
	private final String name;

	public AuxilaryDataRepresentation(String name, Class<K> keyClass, ContinousHashProvider<K> hashProvider, Class<V> valueClass,
			V defaultValue) {
		super(keyClass, hashProvider, valueClass, defaultValue);
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public boolean isValidKey(K key) {
		return true;
	}
}
