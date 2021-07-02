package org.eclipse.viatra.solver.data.map;

public interface Versioned {
	public long commit();
	public void restore(long state);
}
