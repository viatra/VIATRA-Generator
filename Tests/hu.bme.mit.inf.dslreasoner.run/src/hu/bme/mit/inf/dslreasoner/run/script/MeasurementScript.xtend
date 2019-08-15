package hu.bme.mit.inf.dslreasoner.run.script

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class MeasurementScript {
	String inputPath
	String outputPath
	int timeout
	boolean saveModels
	boolean saveTemporaryFiles
	int warmupIterations
	int iterations
	Domain domain
	Scope scope
	List<Integer> sizes
	Solver solver
	ScopePropagator scopePropagator
	ScopeConstraints propagatedConstraints
	PolyhedronSolver polyhedronSolver
	ScopeHeuristic scopeHeuristic

	def toCsvHeader() {
		'''«domain»,«scope»,«solver»,«scopePropagator ?: "NULL"»,«propagatedConstraints ?: "NULL"»,«polyhedronSolver ?: "NULL"»,«scopeHeuristic ?: "NULL"»'''
	}
}

enum Domain {
	fs,
	ecore,
	Yakindu,
	FAM,
	satellite
}

enum Scope {
	none,
	quantiles
}

enum Solver {
	ViatraSolver,
	AlloySolver
}

enum ScopePropagator {
	none,
	basic,
	polyhedral
}

enum ScopeConstraints {
	none,
	typeHierarchy,
	relations,
	hints
}

enum PolyhedronSolver {
	Z3Integer,
	Z3Real,
	Cbc,
	Clp
}

enum ScopeHeuristic {
	basic,
	polyhedral
}
