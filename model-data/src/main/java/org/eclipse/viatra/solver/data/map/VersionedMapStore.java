package org.eclipse.viatra.solver.data.map;

import java.util.Set;

public interface VersionedMapStore<K, V> {
	
	public VersionedMap<K, V> createMap();

	public VersionedMap<K, V> createMap(long state);
	
	public Set<Long> getStates();

	public DiffCursor<K,V> getDiffCursor(long fromState, long toState);
}