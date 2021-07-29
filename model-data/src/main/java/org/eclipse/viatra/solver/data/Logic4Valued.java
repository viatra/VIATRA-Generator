package org.eclipse.viatra.solver.data;

public class Logic4Valued extends Logic2Valued {
	protected static final String unknownName = "unknown";
	protected static final String errorName = "error";
	
	public static final TruthValue unknownValue = new NamedTruthValue(unknownName);
	public static final TruthValue errorValue = new NamedTruthValue(errorName);
	
//	public TruthValue getImplMin(TruthValue a, TruthValue b) {
//		
//	}
//	public TruthValue getImplMax(TruthValue a, TruthValue b) {
//		
//	}
//	public TruthValue getInfoMin(TruthValue a, TruthValue b) {
//		
//	}
//	public TruthValue getInfoMax(TruthValue a, TruthValue b) {
//		
//	}
}
