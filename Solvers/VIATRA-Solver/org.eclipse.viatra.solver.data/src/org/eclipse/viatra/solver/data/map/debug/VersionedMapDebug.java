package org.eclipse.viatra.solver.data.map.debug;

import java.util.Iterator;
import java.util.Map.Entry;

import org.eclipse.viatra.solver.data.map.Cursor;
import org.eclipse.viatra.solver.data.map.VersionedMap;

public class VersionedMapDebug<KEY, VALUE> implements VersionedMap<KEY, VALUE> {

	@Override
	public long commit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void restore(long state) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void put(KEY key, VALUE value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public VALUE get(KEY key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterator<Entry<KEY, VALUE>> getIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cursor<KEY, VALUE> getCursor() {
		// TODO Auto-generated method stub
		return null;
	}

}
