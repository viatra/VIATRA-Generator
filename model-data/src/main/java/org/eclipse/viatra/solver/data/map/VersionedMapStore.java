package org.eclipse.viatra.solver.data.map;

public interface VersionedMapStore<K, V> {
	
	public VersionedMap<K, V> createMap();

	public VersionedMap<K, V> createMap(long state);

	public DiffCursor<K,V> getDiffCursor(long fromState, long toState);
}