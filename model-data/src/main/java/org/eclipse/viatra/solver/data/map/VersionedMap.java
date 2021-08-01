package org.eclipse.viatra.solver.data.map;

public interface VersionedMap<K,V> extends Versioned{
	public void put(K key, V value);
	public V get(K key);
	public long getSize();
	
	public Cursor<K,V> getCursor();
	public DiffCursor<K,V> getDiffCursor(long state);
	public void putAll(Cursor<K,V> cursor);
}
