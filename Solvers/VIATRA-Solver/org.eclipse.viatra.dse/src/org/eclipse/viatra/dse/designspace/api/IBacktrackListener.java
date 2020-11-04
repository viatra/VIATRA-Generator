package org.eclipse.viatra.dse.designspace.api;

public interface IBacktrackListener {
	void forwardWorked(long nanos);
	
	void backtrackWorked(long nanos);
}
