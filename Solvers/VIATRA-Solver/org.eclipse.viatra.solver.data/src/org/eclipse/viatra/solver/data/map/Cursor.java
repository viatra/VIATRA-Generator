package org.eclipse.viatra.solver.data.map;

import java.util.List;

public interface Cursor<KEY,VALUE> {
	public KEY getKey();
	public VALUE getValue();
	public boolean isTerminated();
	public boolean move();
	public boolean isDirty();
	
	public List<VersionedMap<KEY,VALUE>> getDependingMaps();
}
