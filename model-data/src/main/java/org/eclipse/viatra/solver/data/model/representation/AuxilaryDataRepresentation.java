package org.eclipse.viatra.solver.data.model.representation;

import org.eclipse.viatra.solver.data.map.ContinousHashProvider;

public class AuxilaryDataRepresentation<K,V> extends DataRepresentation<K, V> {

	public AuxilaryDataRepresentation(Class<K> keyClass, ContinousHashProvider<K> hashProvider, Class<V> valueClass,
			V defaultValue) {
		super(keyClass, hashProvider, valueClass, defaultValue);
	}
}
