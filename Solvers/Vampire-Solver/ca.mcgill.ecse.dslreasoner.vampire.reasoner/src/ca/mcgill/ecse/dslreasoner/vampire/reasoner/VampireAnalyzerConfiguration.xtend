package ca.mcgill.ecse.dslreasoner.vampire.reasoner

import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration

class VampireSolverConfiguration extends LogicSolverConfiguration {
	
	public var int contCycleLevel = 0
	public var boolean uniquenessDuplicates = false
	//choose needed backend solver
//	public var VampireBackendSolver solver = VampireBackendSolver.SAT4J
}


enum VampireBackendSolver {
	//add needed things
}


enum TypeMappingTechnique {
	//default
	FilteredTypes
}