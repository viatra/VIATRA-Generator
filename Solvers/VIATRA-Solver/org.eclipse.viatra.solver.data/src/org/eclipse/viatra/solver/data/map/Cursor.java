package org.eclipse.viatra.solver.data.map;

public interface Cursor<KEY,VALUE> {
	public KEY getKey();
	public VALUE getValue();
	public boolean isTerminated();
	public boolean move();
}
