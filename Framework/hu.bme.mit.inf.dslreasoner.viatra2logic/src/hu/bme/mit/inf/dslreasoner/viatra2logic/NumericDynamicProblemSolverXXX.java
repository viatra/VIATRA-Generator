package hu.bme.mit.inf.dslreasoner.viatra2logic;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.XExpression;

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PrimitiveElement;

public class NumericDynamicProblemSolverXXX extends NumericProblemSolver{
	
//	private NumericZ3ProblemSolver z3Solver;
	private NumericDrealProblemSolver drealSolver;
	private int timeout;
	
	public NumericDynamicProblemSolverXXX(String drealLocalPath, int drealTimeout) throws IOException, InterruptedException {
//		this.z3Solver = new NumericZ3ProblemSolver();
		this.drealSolver = new NumericDrealProblemSolver(false, drealLocalPath, drealTimeout);
		this.timeout = drealTimeout;
	}
	
	public NumericProblemSolver selectSolver(String selection) {
		switch (selection) {
		case "z3":
			return new NumericZ3ProblemSolver(timeout);
		case "dreal":
			return this.drealSolver;
		default:
		throw new IllegalArgumentException("Unknown numeric solver selection: " + selection);
		}
	}

	public boolean isSatisfiable(Map<XExpression, Iterable<Map<JvmIdentifiableElement, PrimitiveElement>>> matches)
			throws Exception {
		throw new Exception("Should not reach here - isSatisfiable");
	}

	public Map<PrimitiveElement, Number> getOneSolution(List<PrimitiveElement> objs,
			Map<XExpression, Iterable<Map<JvmIdentifiableElement, PrimitiveElement>>> matches) throws Exception {
		throw new Exception("Should not reach here - getOneSolution");
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean internalIsSatisfiable(
			Map<XExpression, Iterable<Map<JvmIdentifiableElement, PrimitiveElement>>> matches) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected Map<PrimitiveElement, Number> internalGetOneSolution(List<PrimitiveElement> objs,
			Map<XExpression, Iterable<Map<JvmIdentifiableElement, PrimitiveElement>>> matches) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}}
