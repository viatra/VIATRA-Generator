package org.eclipse.viatra.solver.data.model.representation;

import org.eclipse.viatra.solver.data.map.ContinousHashProvider;

public abstract class DataRepresentation<K, V> {
	protected final Class<K> keyClass;
	protected final Class<V> valueClass;
	protected final ContinousHashProvider<K> hashProvider;
	protected final V defaultValue;

	protected DataRepresentation(Class<K> keyClass, ContinousHashProvider<K> hashProvider, Class<V> valueClass,
			V defaultValue) {
		this.keyClass = keyClass;
		this.hashProvider = hashProvider;
		this.valueClass = valueClass;
		this.defaultValue = defaultValue;
	}
	
	public abstract String getName();
	
	public Class<K> getKeyClass() {
		return keyClass;
	}
	
	public Class<V> getValueClass() {
		return valueClass;
	}
	
	public ContinousHashProvider<K> getHashProvider() {
		return hashProvider;
	}
	public abstract boolean isValidKey(K key);

	public V getDefaultValue() {
		return defaultValue;
	}
}
