package org.eclipse.viatra.solver.data.map;

public interface VersionedMap<K,V> extends Versioned{
	public V get(K key);
	public Cursor<K,V> getAll();
	
	public void put(K key, V value);
	public void putAll(Cursor<K,V> cursor);
	
	public long getSize();
	
	public DiffCursor<K,V> getDiffCursor(long state);
}
