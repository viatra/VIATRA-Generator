package hu.bme.mit.inf.dslreasoner.viatra2logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
	private Map<XExpression, BoolExpr> templates;
	private Map<XExpression, Map<Object, Expr>> bindings;
	private BoolExpr test;

	public NumericProblemSolver() {
		HashMap<String, String> cfg = new HashMap<String, String>();
		cfg.put("model", "true");
		ctx = new Context(cfg);	
		s = ctx.mkSolver();
		templates = new HashMap<XExpression, BoolExpr>();
		bindings = new HashMap<XExpression, Map<Object, Expr>>();
	}

	public Context getNumericProblemContext() {
		return ctx;
	}

	public void formNumericProblemTemplate(XExpression e) throws Exception {
		if (!(e instanceof XBinaryOperation)) {
			throw new Exception ("error in check expression!!!");
		}

		String name = ((XBinaryOperation) e).getFeature().getQualifiedName();

		BoolExpr constraint = null;
				
		ArithExpr left_operand = formNumericProblemTemplateHelper(((XBinaryOperation) e).getLeftOperand());
		ArithExpr right_operand = formNumericProblemTemplateHelper(((XBinaryOperation) e).getRightOperand());

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
		
		templates.put(e, constraint);
		HashMap<XExpression, Set<List<Object>>> matches = new HashMap<XExpression, Set<List<Object>>>();
		Object o1 = new Object();
		Object o2 = new Object();
		List<Object> list = new ArrayList<Object>();
		list.add(o1);
		list.add(o2);
		Set<List<Object>> set = new HashSet<List<Object>>();
		set.add(list);
		matches.put(e, set);	
		System.out.println("************************");
		System.out.println(this.isSatisfiable(matches));
	}

	// TODO: add variable: state of the solver
	private ArithExpr formNumericProblemTemplateHelper(XExpression e) throws Exception {
		ArithExpr expr = null;
		// Variables
		if (e instanceof XFeatureCall) {
			String var_name = ((XFeatureCall) e).getFeature().getQualifiedName();
			expr = (ArithExpr) ctx.mkConst(ctx.mkSymbol(var_name), ctx.getIntSort());
		} 
		// Constants
		else if (e instanceof XNumberLiteral) {
			String value = ((XNumberLiteral) e).getValue();
			try{ int val = Integer.parseInt(value);  expr = (ArithExpr) ctx.mkInt(val);}  catch(NumberFormatException err){}
		} 
		// Expressions with operators
		else if (e instanceof XBinaryOperation) {
			String name = ((XBinaryOperation) e).getFeature().getQualifiedName();
			ArithExpr left_operand = formNumericProblemTemplateHelper(((XBinaryOperation) e).getLeftOperand());
			ArithExpr right_operand = formNumericProblemTemplateHelper(((XBinaryOperation) e).getRightOperand());

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

	public boolean isSatisfiable(Map<XExpression, Set<List<Object>>> matches) throws Exception {
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
	
//	public Map<Object,Integer> getOneSolution(List<Object>, Map<XExpression, Set<List<Object>>> matches) {
//		Map<Object,Integer> sol = new HashMap<Object, Integer>();
//		BoolExpr problemInstance = formNumericProblemInstance(matches);
//		s.add(problemInstance);
//		if (s.check() == Status.SATISFIABLE) {
//			//TODO:  Form the map here
//		}
//		return sol;
//	}
	
	private BoolExpr formNumericProblemInstance(Map<XExpression, Set<List<Object>>> matches) throws Exception {
		BoolExpr constraintInstances = ctx.mkTrue();
		for (XExpression e: matches.keySet()) {
			BoolExpr template = templates.get(e);
			Set<List<Object>> matchSets = matches.get(e);
			Map<Object, Expr> varMap = bindings.get(e);

			if (varMap == null) {
				varMap = new HashMap<Object, Expr>();
				bindings.put(e, varMap);
			}

			for (List<Object> aMatch: matchSets) {
				Expr[] expressions = template.getArgs().clone();
				formNumericProblemInstance(expressions, aMatch, varMap, 0);
				constraintInstances = ctx.mkAnd(constraintInstances, formConstraintInstance(template, expressions));
			}
		}
		return constraintInstances;
	}

	// TODO: Create a new exception class??
	private BoolExpr formConstraintInstance(BoolExpr template, Expr[] expressions) throws Exception {
		if (expressions.length != 2) {
			throw new Exception("Wrong format");
		}
		BoolExpr inst = ctx.mkTrue();
		ArithExpr leftOperand = (ArithExpr) expressions[0];
		ArithExpr rightOperand = (ArithExpr) expressions[1];
		if (template.isLE()) {
			inst = ctx.mkLe(leftOperand, rightOperand);
		} else if (template.isLT()) {
			inst = ctx.mkLt(leftOperand, rightOperand);
		} else if (template.isGE()) {
			inst = ctx.mkGe(leftOperand, rightOperand);
		} else if (template.isGT()) {
			inst = ctx.mkGt(leftOperand, rightOperand);
		} else if (template.isEq()) {
			inst = ctx.mkEq(leftOperand, rightOperand);
		} else if (template.isDistinct()) {
			inst = ctx.mkDistinct(leftOperand, rightOperand);
		} else {
			throw new Exception("Something went wrong");
		}
		return inst;
	}
	
	// TODO: This is not gonna work....How to plug in matched objects to the template???
	private void formNumericProblemInstance(Expr[] expr, List<Object> match, Map<Object, Expr> varMap, int ind) {
		for (int i = 0; i < expr.length; i++) {
			if (expr[i].isConst()) {
				expr[i] = ctx.mkConst(expr[i].toString(), ctx.getIntSort());
			} else if (expr[i].getArgs().length > 0) {
				formNumericProblemInstance(expr[i].getArgs(), match, varMap, ind);
			}
		}
	}
}
