package org.eclipse.viatra.solver.data.map;

import java.util.Iterator;
import java.util.Map;

public interface VersionedMap<KEY,VALUE> extends Versioned{
	public void put(KEY key, VALUE value);
	public VALUE get(KEY key);
	public int getSize();
	public Iterator<Map.Entry<KEY,VALUE>> getIterator();
	public Cursor<KEY,VALUE> getCursor();
}
