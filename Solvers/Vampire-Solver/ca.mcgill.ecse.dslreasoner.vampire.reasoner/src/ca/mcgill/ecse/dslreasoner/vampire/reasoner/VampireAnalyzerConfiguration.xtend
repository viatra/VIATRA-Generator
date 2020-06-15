package ca.mcgill.ecse.dslreasoner.vampire.reasoner

import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration

class VampireSolverConfiguration
 extends LogicSolverConfiguration {
	
	public var int contCycleLevel = 0
	public var boolean uniquenessDuplicates = false
	public var int iteration = -1
	public var BackendSolver solver = BackendSolver::LOCVAMP
	public var genModel = true
	public var server = false
	//choose needed backend solver
//	public var VampireBackendSolver solver = VampireBackendSolver.SAT4J
}


enum BackendSolver {
	CVC4,
	DARWINFM,
	EDARWIN,
	GEOIII,
	IPROVER,
	PARADOX,
	VAMPIRE,
	Z3,
	LOCVAMP
	//add needed things
}


enum TypeMappingTechnique {
	//default
	FilteredTypes
}