package hu.bme.mit.inf.dlsreasoner.alloy.reasoner

import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration

class AlloySolverConfiguration extends LogicSolverConfiguration {
	public var int symmetry = 20 // by default
	public var AlloyBackendSolver solver = AlloyBackendSolver.SAT4J
	public var TypeMappingTechnique typeMapping = TypeMappingTechnique.InheritanceAndHorizontal
	public var randomise = 0
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
	FilteredTypes, InheritanceAndHorizontal
}