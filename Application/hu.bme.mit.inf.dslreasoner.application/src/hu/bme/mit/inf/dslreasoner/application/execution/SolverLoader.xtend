package hu.bme.mit.inf.dslreasoner.application.execution

import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.Solver
import java.util.Map
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.AlloySolver
import hu.bme.mit.inf.dslreasoner.smt.reasoner.SMTSolver
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasoner
import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.AlloySolverConfiguration
import hu.bme.mit.inf.dslreasoner.smt.reasoner.SmtSolverConfiguration
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration

class SolverLoader {
	def loadSolver(Solver solver, Map<String, String> config) {
		switch(solver) {
			case ALLOY_SOLVER: return new AlloySolver
			case SMT_SOLVER: return new SMTSolver
			case VIATRA_SOLVER: return new ViatraReasoner
		}
	}
	
	def loadSolverConfig(Solver solver, Map<String, String> config) {
		switch(solver) {
			case ALLOY_SOLVER: return new AlloySolverConfiguration
			case SMT_SOLVER: return new SmtSolverConfiguration
			case VIATRA_SOLVER: return new ViatraReasonerConfiguration
		}
	}
}