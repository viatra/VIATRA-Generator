package org.eclipse.viatra.solver.data.map;

import java.util.List;

public interface Cursor<K,V> {
	public K getKey();
	public V getValue();
	public boolean isTerminated();
	public boolean move();
	public boolean isDirty();
	
	public List<VersionedMap<K,V>> getDependingMaps();
}
