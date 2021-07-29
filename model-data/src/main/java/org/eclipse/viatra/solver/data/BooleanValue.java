package org.eclipse.viatra.solver.data;

public class BooleanValue implements TruthValue {
	private final boolean value;
	protected BooleanValue(final boolean value) {
		this.value = value;
	}
	public static final BooleanValue trueValue = new BooleanValue(true);
	public static final BooleanValue falseValue = new BooleanValue(false);
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return Boolean.toString(value);
	}
	
}
