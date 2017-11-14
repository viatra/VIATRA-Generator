package hu.bme.mit.inf.dslreasoner.vampire.reasoner

import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration

//DONE
class VampireSolverConfiguration extends LogicSolverConfiguration {
	public var int symmetry = 0 // by default
	public var VampireBackendSolver solver = VampireBackendSolver.SAT4J
	public var boolean writeToFile = false
}

//NO IDEA WHAT THIS IS. ASK
enum VampireBackendSolver {
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

//NO IDEA WHAT THIS IS
enum TypeMappingTechnique {
	FilteredTypes
}