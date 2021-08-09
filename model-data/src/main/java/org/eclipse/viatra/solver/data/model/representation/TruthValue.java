package org.eclipse.viatra.solver.data.model.representation;

public class TruthValue {
	public static final TruthValue True = new TruthValue("true");
	public static final TruthValue False = new TruthValue("false");
	public static final TruthValue Unknown = new TruthValue("unknown");
	public static final TruthValue Error = new TruthValue("error");
	
	private final String name;
	protected TruthValue(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public static TruthValue toTruthValue(boolean value) {
		if(value) return True;
		else return False;
	}
	public boolean isConsistent() {
		return this != Error;
	}
	public boolean isComplete() {
		return this != Unknown;
	}
	public boolean must() {
		return this == True || this == Error;
	}
	public boolean may() {
		return this == True || this == Unknown;
	}
	
	public TruthValue not() {
		if(this == True) {
			return False;
		} else if(this == False) {
			return True;
		} else {
			return this;
		}
	}
}
