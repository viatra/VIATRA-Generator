package org.eclipse.viatra.solver.data.map;

public interface VersionedMap<KEY,VALUE> extends Versioned{
	public void put(KEY key, VALUE value);
	public VALUE get(KEY key);
	public long getSize();
	
	public Cursor<KEY,VALUE> getCursor();
	public DiffCursor<KEY,VALUE> getDiffCursor(long state);
	public void putAll(Cursor<KEY,VALUE> cursor);
}
