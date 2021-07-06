package org.eclipse.viatra.solver.data.map;

public interface VersionedMapStore<KEY, VALUE> {
	
	public VersionedMap<KEY, VALUE> createMap();

	public VersionedMap<KEY, VALUE> createMap(long state) throws IllegalAccessException;

	// long addState(Node<KEY, VALUE> data);
	//public void removeState(long state);
}