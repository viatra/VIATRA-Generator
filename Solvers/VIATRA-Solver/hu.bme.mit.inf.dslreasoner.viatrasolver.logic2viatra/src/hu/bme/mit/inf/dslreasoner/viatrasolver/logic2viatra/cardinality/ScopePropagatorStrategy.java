package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality;

public enum ScopePropagatorStrategy {
	BasicTypeHierarchy,

	PolyhedralTypeHierarchy,

	PolyhedralRelations {
		@Override
		public boolean requiresUpperBoundIndexing() {
			return true;
		}
	};

	public boolean requiresUpperBoundIndexing() {
		return false;
	}
}
