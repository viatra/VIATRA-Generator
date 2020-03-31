package hu.bme.mit.inf.dslreasoner.viatra2logic;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XNumberLiteral;

import com.microsoft.z3.ArithExpr;
import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
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
	
	private static int counter = 0;
	
	private Context ctx;
	private ArithExpr[] vars = new ArithExpr[2];

	public NumericProblemSolver() {
		HashMap<String, String> cfg = new HashMap<String, String>();
		cfg.put("model", "true");
		ctx = new Context(cfg);
	}
	
	public Context getNumericProblemContext() {
		return ctx;
	}

	public BoolExpr formNumericProblemTemplate(XExpression e) throws Exception {
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
		
		// To check the constraint
		System.out.println(constraint.toString());
		
		int mage = 5;
		int page = 25;
		
		BoolExpr inst = ctx.mkTrue();
		for (ArithExpr var: vars) {
			inst = ctx.mkAnd(inst, ctx.mkEq(var, ctx.mkInt(mage)));
		}		
		System.out.println(inst.toString());
		
		Solver s = ctx.mkSolver();
		s.add(constraint);
		s.add(inst);
		
		if (s.check() == Status.SATISFIABLE) {
			System.out.println("satisfiable");
		} else {
			System.out.println("not satisfiable");
		}
		
		
		return constraint;

	}

	private ArithExpr formNumericProblemTemplateHelper(XExpression e) throws Exception {
		ArithExpr expr = null;
		// Variables
		// how to know the data type of this variable?????
		if (e instanceof XFeatureCall) {
			String var_name = ((XFeatureCall) e).getFeature().getQualifiedName();
			vars[counter] = (ArithExpr) ctx.mkConst(ctx.mkSymbol(var_name), ctx.getIntSort());
			expr = vars[counter];
			counter++;
		} 
		// Constants
		else if (e instanceof XNumberLiteral) {
			String value = ((XNumberLiteral) e).getValue();
			try{ int val = Integer.parseInt(value);  expr = (ArithExpr) ctx.mkInt(val);}  catch(NumberFormatException err){}
			// What to do with short / float / double???
			// e.g. For floats, need to use FPAdd instead of normal Add!! 
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

}
