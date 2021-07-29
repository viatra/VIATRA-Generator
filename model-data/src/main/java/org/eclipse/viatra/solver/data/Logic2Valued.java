package org.eclipse.viatra.solver.data;

public class Logic2Valued {
	protected static final String trueName = "true";
	protected static final String falseName = "false";
	
	public static final TruthValue trueValue = new NamedTruthValue(trueName);
	public static final TruthValue falseValue = new NamedTruthValue(falseName);
}
