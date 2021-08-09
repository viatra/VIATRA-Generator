package org.eclipse.viatra.solver.data.map;

import java.util.List;

public interface Cursor<K,V> {
	public K getKey();
	public V getValue();
	public boolean isTerminated();
	public boolean move();
	public boolean isDirty();
	
	@SuppressWarnings("squid:S1452")
	public List<VersionedMap<?,?>> getDependingMaps();
}
