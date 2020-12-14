package hu.bme.mit.inf.dslreasoner.viatra2logic;

import java.util.List;
import java.util.Map;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.XExpression;

import com.microsoft.z3.Expr;

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PrimitiveElement;

public abstract class NumericProblemSolver {
	protected static final String N_Base = "org.eclipse.xtext.xbase.lib.";
	protected static final String N_PLUS = "operator_plus";
	protected static final String N_MINUS = "operator_minus";
	protected static final String N_POWER = "operator_power";
	protected static final String N_MULTIPLY = "operator_multiply";
	protected static final String N_DIVIDE = "operator_divide";
	protected static final String N_MODULO = "operator_modulo";
	protected static final String N_LESSTHAN = "operator_lessThan";
	protected static final String N_LESSEQUALSTHAN = "operator_lessEqualsThan";
	protected static final String N_GREATERTHAN = "operator_greaterThan";
	protected static final String N_GREATEREQUALTHAN = "operator_greaterEqualsThan";
	protected static final String N_EQUALS = "operator_equals";
	protected static final String N_NOTEQUALS = "operator_notEquals";
	protected static final String N_EQUALS3 = "operator_tripleEquals";
	protected static final String N_NOTEQUALS3 = "operator_tripleNotEquals";
	
	protected long endformingProblem=0;
	protected long endSolvingProblem=0;
	protected long endFormingSolution=0;

	public long getEndformingProblem() {return endformingProblem;}
	public long getEndSolvingProblem() {return endSolvingProblem;}
	public long getEndFormingSolution() {return endFormingSolution;}
	
	public abstract  boolean isSatisfiable(Map<XExpression, Iterable<Map<JvmIdentifiableElement,PrimitiveElement>>> matches) throws Exception;
	public abstract Map<PrimitiveElement,Number> getOneSolution(List<PrimitiveElement> objs, Map<XExpression, Iterable<Map<JvmIdentifiableElement,PrimitiveElement>>> matches) throws Exception;
}
