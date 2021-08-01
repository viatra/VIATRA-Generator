package org.eclipse.viatra.solver.data.map;

public interface Versioned {
	public long commit();
	//maybe revert()?
	public void restore(long state);
}
