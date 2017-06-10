package hu.bme.mit.inf.dlsreasoner.alloy.reasoner

import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration

class AlloySolverConfiguration extends LogicSolverConfiguration {
	/*public var boolean createCommonSupertype
	public var int intScope = 1 // 5 by default
	public def setIntScopeFor(int max) {
		intScope = 31 - Integer.numberOfLeadingZeros(max) + 1
	}*/
	public var int symmetry = 0 // by default
	public var AlloyBackendSolver solver = AlloyBackendSolver.SAT4J
	public var boolean writeToFile = false
}

enum AlloyBackendSolver {
	BerkMinPIPE,
	SpearPIPE,
	MiniSatJNI,
	MiniSatProverJNI,
	LingelingJNI,
	PLingelingJNI,
	GlucoseJNI,
	CryptoMiniSatJNI,
	SAT4J,
	CNF,
	KodKod
}

enum TypeMappingTechnique {
	FilteredTypes
}