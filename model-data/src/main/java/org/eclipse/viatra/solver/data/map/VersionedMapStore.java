package org.eclipse.viatra.solver.data.map;

public interface VersionedMapStore<K, V> {
	
	public VersionedMap<K, V> createMap();

	public VersionedMap<K, V> createMap(long state) throws IllegalAccessException;

	public DiffCursor<K,V> getDiffCursor(long fromState, long toState);
}