package hu.bme.mit.inf.dslreasoner.ilp.cbc;

public class CbcSolver {
	private static int CBC_SOLUTION_BOUNDED = 0;
	private static int CBC_SOLUTION_UNBOUNDED = 1;
	private static int CBC_UNSAT = 2;
	private static int CBC_ABANDONED = 3;
	private static int CBC_TIMEOUT = 4;
	private static int CBC_ERROR = 5;

	private static boolean nativesLoaded = false;

	private CbcSolver() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly.");
	}

	public static CbcResult solve(double[] columnLowerBounds, double[] columnUpperBounds, int[] rowStarts,
			int[] columnIndices, double[] entries, double[] rowLowerBounds, double[] rowUpperBounds, double[] objective,
			boolean lpRelaxation, double timeoutSeconds, boolean silent) {
		loadNatives();
		validate(columnLowerBounds, columnUpperBounds, rowStarts, columnIndices, entries, rowLowerBounds,
				rowUpperBounds, objective);
		double[] output = new double[1];
		int result = solveIlpProblem(columnLowerBounds, columnUpperBounds, rowStarts, columnIndices, entries,
				rowLowerBounds, rowUpperBounds, objective, output, lpRelaxation, timeoutSeconds, silent);
		if (result == CBC_SOLUTION_BOUNDED) {
			return new CbcResult.SolutionBounded(output[0]);
		} else if (result == CBC_SOLUTION_UNBOUNDED) {
			return CbcResult.SOLUTION_UNBOUNDED;
		} else if (result == CBC_UNSAT) {
			return CbcResult.UNSAT;
		} else if (result == CBC_ABANDONED) {
			return CbcResult.ABANDONED;
		} else if (result == CBC_TIMEOUT) {
			return CbcResult.TIMEOUT;
		} else if (result == CBC_ERROR) {
			throw new CbcException("Solver signalled error, but no exception was thrown");
		} else {
			throw new CbcException("Unknown return value: " + result);
		}
	}

	private static void loadNatives() {
		if (!nativesLoaded) {
			synchronized (CbcSolver.class) {
				System.loadLibrary("viatracbc");
				nativesLoaded = true;
			}
		}
	}

	private static void validate(double[] columnLowerBounds, double[] columnUpperBounds, int[] rowStarts,
			int[] columnIndices, double[] entries, double[] rowLowerBounds, double[] rowUpperBounds,
			double[] objective) {
		int numColumns = columnLowerBounds.length;
		if (columnUpperBounds.length != numColumns) {
			throw new CbcException("Lengths of columnLowerBounds and columnUpperBounds must match");
		}
		if (objective.length != numColumns) {
			throw new CbcException("Lengths of columnLowerBounds and objective must match");
		}
		int numRows = rowLowerBounds.length;
		if (rowUpperBounds.length != numRows) {
			throw new CbcException("Lengths of rowLowerBounds and rowUpperBounds must match");
		}
	}

	private static native int solveIlpProblem(double[] columnLowerBounds, double[] columnUpperBounds, int[] rowStarts,
			int[] columnIndices, double[] entries, double[] rowLowerBounds, double[] rowUpperBounds, double[] objective,
			double[] output, boolean lpRelaxation, double timeoutSeconds, boolean silent);
}
