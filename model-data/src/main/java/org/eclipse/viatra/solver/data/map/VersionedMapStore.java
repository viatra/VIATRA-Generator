package org.eclipse.viatra.solver.data.map;

public interface VersionedMapStore<KEY, VALUE> {
	
	public VersionedMap<KEY, VALUE> createMap();

	public VersionedMap<KEY, VALUE> createMap(long state) throws IllegalAccessException;

	public DiffCursor<KEY,VALUE> getDiffCursor(long fromState, long toState);
}