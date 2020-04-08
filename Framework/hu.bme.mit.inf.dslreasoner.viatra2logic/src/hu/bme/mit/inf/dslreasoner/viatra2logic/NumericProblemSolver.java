package hu.bme.mit.inf.dslreasoner.viatra2logic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XNumberLiteral;

import com.microsoft.z3.ArithExpr;
import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Expr;
import com.microsoft.z3.IntExpr;
import com.microsoft.z3.Solver;
import com.microsoft.z3.Status;

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.IntegerElement;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PrimitiveElement;


public class NumericProblemSolver {
	private static final String N_Base = "org.eclipse.xtext.xbase.lib.";
	private static final String N_PLUS = "operator_plus";
	private static final String N_MINUS = "operator_minus";
	private static final String N_POWER = "operator_power";
	private static final String N_MULTIPLY = "operator_multiply";
	private static final String N_DIVIDE = "operator_divide";
	private static final String N_MODULO = "operator_modulo";
	private static final String N_LESSTHAN = "operator_lessThan";
	private static final String N_LESSEQUALSTHAN = "operator_lessEqualsThan";
	private static final String N_GREATERTHAN = "operator_greaterThan";
	private static final String N_GREATEREQUALTHAN = "operator_greaterEqualsThan";
	private static final String N_EQUALS = "operator_equals";
	private static final String N_NOTEQUALS = "operator_notEquals";
	private static final String N_EQUALS3 = "operator_tripleEquals";
	private static final String N_NOTEQUALS3 = "operator_tripleNotEquals";

	private Context ctx;
	private Solver s;
	private Map<XExpression, Map<Object, Expr>> bindings;

	public NumericProblemSolver() {
		HashMap<String, String> cfg = new HashMap<String, String>();
		cfg.put("model", "true");
		ctx = new Context(cfg);	
		s = ctx.mkSolver();
		bindings = new HashMap<XExpression, Map<Object, Expr>>();
	}

	public Context getNumericProblemContext() {
		return ctx;
	}
	
	// TODO: Remove this after integration
	public void test(XExpression expression) throws Exception {
		Map<XExpression, Set<Map<JvmIdentifiableElement,PrimitiveElement>>> matches = new HashMap<XExpression, Set<Map<JvmIdentifiableElement,PrimitiveElement>>>();
		matches.put(expression, null);
		isSatisfiable(matches);
	}
	
	public boolean isSatisfiable(Map<XExpression, Set<Map<JvmIdentifiableElement,PrimitiveElement>>> matches) throws Exception {
		boolean sat = false;
		BoolExpr problemInstance = formNumericProblemInstance(matches);
		s.add(problemInstance);
		if (s.check() == Status.SATISFIABLE) {
			sat = true;
		} else {
			sat = false;
		}
		return sat;
	}
	
	public Map<Object,Integer> getOneSolution(List<Object> objs, Map<XExpression, Set<Map<JvmIdentifiableElement,PrimitiveElement>>> matches) throws Exception {
		Map<Object,Integer> sol = new HashMap<Object, Integer>();
		BoolExpr problemInstance = formNumericProblemInstance(matches);
		s.add(problemInstance);
		if (s.check() == Status.SATISFIABLE) {
			//TODO:  Form the solution here
		}
		return sol;
	}

	private BoolExpr formNumericConstraint(XExpression e, Map<JvmIdentifiableElement, PrimitiveElement> aMatch, Map<Object, Expr> varMap) throws Exception {
		if (!(e instanceof XBinaryOperation)) {
			throw new Exception ("error in check expression!!!");
		}

		String name = ((XBinaryOperation) e).getFeature().getQualifiedName();

		BoolExpr constraint = null;
				
		ArithExpr left_operand = formNumericConstraintHelper(((XBinaryOperation) e).getLeftOperand(), aMatch, varMap);
		ArithExpr right_operand = formNumericConstraintHelper(((XBinaryOperation) e).getRightOperand(), aMatch, varMap);

		if (nameEndsWith(name, N_LESSTHAN)) {
			constraint = ctx.mkLt(left_operand, right_operand);
		} else if (nameEndsWith(name, N_LESSEQUALSTHAN)) {
			constraint = ctx.mkLe(left_operand, right_operand);
		} else if (nameEndsWith(name, N_GREATERTHAN)) {
			constraint = ctx.mkGt(left_operand, right_operand);
		} else if (nameEndsWith(name, N_GREATEREQUALTHAN)) {
			constraint = ctx.mkGe(left_operand, right_operand);
		} else if (nameEndsWith(name, N_EQUALS)) {
			constraint = ctx.mkEq(left_operand, right_operand);
		} else if (nameEndsWith(name, N_NOTEQUALS)) {
			constraint = ctx.mkDistinct(left_operand, right_operand);
		} else if (nameEndsWith(name, N_EQUALS3)) {
			constraint = ctx.mkGe(left_operand, right_operand);	// ???
		} else if (nameEndsWith(name, N_NOTEQUALS3)) {
			constraint = ctx.mkGe(left_operand, right_operand);	// ???
		} else {
			throw new Exception ("Unsupported binary operation " + name);
		}
		
		return constraint;
	}

	// TODO: add variable: state of the solver
	private ArithExpr formNumericConstraintHelper(XExpression e, Map<JvmIdentifiableElement, PrimitiveElement> aMatch, Map<Object, Expr> varMap) throws Exception {
		ArithExpr expr = null;
		// Variables
		if (e instanceof XFeatureCall) {
			PrimitiveElement matchedObj = aMatch.get(((XFeatureCall) e).getFeature());
			if (!matchedObj.isValueSet()) {
				if (varMap.get(matchedObj) == null) {
					String var_name = ((XFeatureCall) e).getFeature().getQualifiedName() + matchedObj.toString();
					expr = (ArithExpr) ctx.mkConst(ctx.mkSymbol(var_name), ctx.getIntSort());
					varMap.put(matchedObj, expr);
				} else {
					expr = (ArithExpr) varMap.get(matchedObj);
				}
			} else {
				int value = ((IntegerElement) matchedObj).getValue();
				expr = (ArithExpr) ctx.mkInt(value);
				varMap.put(matchedObj, expr);
			}
		} 
		// Constants
		else if (e instanceof XNumberLiteral) {
			String value = ((XNumberLiteral) e).getValue();
			try{ int val = Integer.parseInt(value);  expr = (ArithExpr) ctx.mkInt(val);}  catch(NumberFormatException err){}
		} 
		// Expressions with operators
		else if (e instanceof XBinaryOperation) {
			String name = ((XBinaryOperation) e).getFeature().getQualifiedName();
			ArithExpr left_operand = formNumericConstraintHelper(((XBinaryOperation) e).getLeftOperand(), aMatch, varMap);
			ArithExpr right_operand = formNumericConstraintHelper(((XBinaryOperation) e).getRightOperand(), aMatch, varMap);

			if (nameEndsWith(name, N_PLUS)) {
				expr = ctx.mkAdd(left_operand, right_operand);
			} else if (nameEndsWith(name, N_MINUS)) {
				expr = ctx.mkAdd(left_operand, ctx.mkUnaryMinus(right_operand));
			} else if (nameEndsWith(name, N_POWER)) {
				expr = ctx.mkPower(left_operand, right_operand);
			} else if (nameEndsWith(name, N_MULTIPLY)) {
				expr = ctx.mkMul(left_operand, right_operand);
			} else if (nameEndsWith(name, N_DIVIDE)) {
				expr = ctx.mkDiv(left_operand, right_operand);
			} else if (nameEndsWith(name, N_MODULO)) {
				expr = ctx.mkMod((IntExpr)left_operand, (IntExpr)right_operand);
			} else {
				throw new Exception ("Unsupported binary operation " + name);
			}
		} else {
			throw new Exception ("Unsupported expression " + e.getClass().getSimpleName());
		}
		return expr;

	}

	private boolean nameEndsWith(String name, String end) {
		return name.startsWith(N_Base) && name.endsWith(end);
	}
	
	private BoolExpr formNumericProblemInstance(Map<XExpression, Set<Map<JvmIdentifiableElement,PrimitiveElement>>> matches) throws Exception {
		BoolExpr constraintInstances = ctx.mkTrue();
		for (XExpression e: matches.keySet()) {
			Set<Map<JvmIdentifiableElement, PrimitiveElement>> matchSets = matches.get(e);
			Map<Object, Expr> varMap = bindings.get(e);

			if (varMap == null) {
				varMap = new HashMap<Object, Expr>();
				bindings.put(e, varMap);
			}

			for (Map<JvmIdentifiableElement, PrimitiveElement> aMatch: matchSets) {
				BoolExpr constraintInstance = formNumericConstraint(e, aMatch, varMap);
				constraintInstances = ctx.mkAnd(constraintInstances, constraintInstance);
			}
		}
		return constraintInstances;
	}
}
