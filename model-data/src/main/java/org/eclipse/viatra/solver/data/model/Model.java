package org.eclipse.viatra.solver.data.model;

import java.util.Set;

import org.eclipse.viatra.solver.data.map.Cursor;
import org.eclipse.viatra.solver.data.map.Versioned;
import org.eclipse.viatra.solver.data.model.representation.DataRepresentation;

public interface Model extends Versioned{
	@SuppressWarnings("squid:S1452")
	Set<DataRepresentation<?, ?>> getDataRepresentations();
	
	<K,V> V get(DataRepresentation<K,V> representation, K key);
	<K,V> Cursor<K,V> getAll(DataRepresentation<K,V> representation);
	<K,V> V put(DataRepresentation<K,V> representation, K key, V value);
	<K,V> void putAll(DataRepresentation<K,V> representation, Cursor<K,V> cursor);
	<K,V> long getSize(DataRepresentation<K,V> representation);
	
	ModelDiffCursor getDiffCursor(long to);
}
