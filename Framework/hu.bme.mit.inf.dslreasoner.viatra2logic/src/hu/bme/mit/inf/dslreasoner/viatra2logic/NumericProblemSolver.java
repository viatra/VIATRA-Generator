package hu.bme.mit.inf.dslreasoner.viatra2logic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

import org.eclipse.viatra.query.runtime.matchers.psystem.PConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
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
import com.microsoft.z3.Model;
import com.microsoft.z3.RealExpr;
import com.microsoft.z3.Solver;
import com.microsoft.z3.Status;
import com.microsoft.z3.enumerations.Z3_ast_print_mode;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Term;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.IntegerElement;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RealElement;
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
	private Map<Object, Expr> varMap;

	long endformingProblem=0;
	long endSolvingProblem=0;
	long endFormingSolution=0;

	public NumericProblemSolver() {
		HashMap<String, String> cfg = new HashMap<String, String>();
		cfg.put("model", "true");
		ctx = new Context(cfg);	
		ctx.setPrintMode(Z3_ast_print_mode.Z3_PRINT_SMTLIB_FULL);
		s = ctx.mkSolver();
		varMap = new HashMap<Object, Expr>();
	}

	public Context getNumericProblemContext() {
		return ctx;
	}

	public long getEndformingProblem() {
		return endformingProblem;
	}

	public long getEndSolvingProblem() {
		return endSolvingProblem;
	}

	public long getEndFormingSolution() {
		return endFormingSolution;
	}

	private ArrayList<JvmIdentifiableElement> getJvmIdentifiableElements(XExpression expression) {
		ArrayList<JvmIdentifiableElement> allElem = new ArrayList<JvmIdentifiableElement>();
		XExpression left = ((XBinaryOperation) expression).getLeftOperand();
		XExpression right = ((XBinaryOperation) expression).getRightOperand();

		getJvmIdentifiableElementsHelper(left, allElem);
		getJvmIdentifiableElementsHelper(right, allElem);
		return allElem;
	}

	private void getJvmIdentifiableElementsHelper(XExpression e, List<JvmIdentifiableElement> allElem) {
		if (e instanceof XFeatureCall) {
			allElem.add(((XFeatureCall) e).getFeature());
		} else if (e instanceof XBinaryOperation) {
			getJvmIdentifiableElementsHelper(((XBinaryOperation) e).getLeftOperand(), allElem);
			getJvmIdentifiableElementsHelper(((XBinaryOperation) e).getRightOperand(), allElem);
		}
	}

	public boolean isSatisfiable(Map<XExpression, Iterable<Map<JvmIdentifiableElement,PrimitiveElement>>> matches) throws Exception {
		long startformingProblem = System.nanoTime();
		BoolExpr problemInstance = formNumericProblemInstance(matches);
		s.add(problemInstance);
		endformingProblem = System.nanoTime()-startformingProblem;
		long startSolvingProblem = System.nanoTime();
		boolean result = (s.check() == Status.SATISFIABLE);
		endSolvingProblem = System.nanoTime()-startSolvingProblem;
		this.ctx.close();
		return result;
	}

	public Map<PrimitiveElement,Number> getOneSolution(List<PrimitiveElement> objs, Map<XExpression, Iterable<Map<JvmIdentifiableElement,PrimitiveElement>>> matches) throws Exception {		
		Map<PrimitiveElement,Number> sol = new HashMap<PrimitiveElement, Number>();
		long startformingProblem = System.nanoTime();
		BoolExpr problemInstance = formNumericProblemInstance(matches);
		endformingProblem = System.nanoTime()-startformingProblem;
		//System.out.println("Forming problem: " + (endformingProblem - startformingProblem));
		s.add(problemInstance);
		long startSolvingProblem = System.nanoTime();
		if (s.check() == Status.SATISFIABLE) {
			Model m = s.getModel();
			endSolvingProblem = System.nanoTime()-startSolvingProblem;
			//System.out.println("Solving problem: " + (endSolvingProblem - startSolvingProblem));
			long startFormingSolution = System.nanoTime();
			for (PrimitiveElement o: objs) {
				if(varMap.containsKey(o)) {
					if (o instanceof IntegerElement) {
						IntExpr val =(IntExpr) m.evaluate(varMap.get(o), false);
						Integer oSol = Integer.parseInt(val.toString());
						sol.put(o, oSol);
					} else {
						RealExpr val = (RealExpr) m.evaluate(varMap.get(o), false);
						Double oSol = Double.parseDouble(val.toString());
						sol.put(o, oSol);
					}
					//System.out.println("Solution:" + o + "->" + oSol);

				} else {
					//System.out.println("not used var:" + o);
				}
			}
			endFormingSolution = System.nanoTime()-startFormingSolution;
			//System.out.println("Forming solution: " + (endFormingSolution - startFormingSolution));
		} else {
			System.out.println("Unsatisfiable numerical problem");
		}
		this.ctx.close();
		return sol;
	}

	private BoolExpr formNumericConstraint(XExpression e, Map<JvmIdentifiableElement, PrimitiveElement> aMatch) throws Exception {
		if (!(e instanceof XBinaryOperation)) {
			throw new Exception ("error in check expression!!!");
		}

		String name = ((XBinaryOperation) e).getFeature().getQualifiedName();

		BoolExpr constraint = null;

		ArithExpr left_operand = formNumericConstraintHelper(((XBinaryOperation) e).getLeftOperand(), aMatch);
		ArithExpr right_operand = formNumericConstraintHelper(((XBinaryOperation) e).getRightOperand(), aMatch);

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

	private ArithExpr formNumericConstraintHelper(XExpression e, Map<JvmIdentifiableElement, PrimitiveElement> aMatch) throws Exception {
		ArithExpr expr = null;
		// Variables
		if (e instanceof XFeatureCall) {
			PrimitiveElement matchedObj = aMatch.get(((XFeatureCall) e).getFeature());
			boolean isInt = matchedObj instanceof IntegerElement;
			if (!matchedObj.isValueSet()) {
				if (varMap.get(matchedObj) == null) {
					String var_name = ((XFeatureCall) e).getFeature().getQualifiedName() + matchedObj.toString();
					if (isInt) {
						expr = (ArithExpr) ctx.mkConst(ctx.mkSymbol(var_name), ctx.getIntSort());
					} else {
						expr = (ArithExpr) ctx.mkConst(ctx.mkSymbol(var_name), ctx.getRealSort());
					}
					varMap.put(matchedObj, expr);
				} else {
					expr = (ArithExpr) varMap.get(matchedObj);
				}
			} else {
				if (isInt) {
					int value = ((IntegerElement) matchedObj).getValue();
					expr = (ArithExpr) ctx.mkInt(value);
				} else {
					double value = ((RealElement) matchedObj).getValue().doubleValue();
					expr = (ArithExpr) ctx.mkReal(String.valueOf(value));
				}
				varMap.put(matchedObj, expr);
			}
		} 
		// Constants
		else if (e instanceof XNumberLiteral) {
			String value = ((XNumberLiteral) e).getValue();
			try{ 
				int val = Integer.parseInt(value);  
				expr = (ArithExpr) ctx.mkInt(val);
			}  catch(NumberFormatException err){
				try{ 
					expr = (ArithExpr) ctx.mkReal(value);
				}  catch(NumberFormatException err2){}
			}	
		} 
		// Expressions with operators
		else if (e instanceof XBinaryOperation) {
			String name = ((XBinaryOperation) e).getFeature().getQualifiedName();
			ArithExpr left_operand = formNumericConstraintHelper(((XBinaryOperation) e).getLeftOperand(), aMatch);
			ArithExpr right_operand = formNumericConstraintHelper(((XBinaryOperation) e).getRightOperand(), aMatch);

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

	private BoolExpr formNumericProblemInstance(Map<XExpression, Iterable<Map<JvmIdentifiableElement,PrimitiveElement>>> matches) throws Exception {
		BoolExpr constraintInstances = ctx.mkTrue();
		for (XExpression e: matches.keySet()) {
			Iterable<Map<JvmIdentifiableElement, PrimitiveElement>> matchSets = matches.get(e);
			for (Map<JvmIdentifiableElement, PrimitiveElement> aMatch: matchSets) {
				BoolExpr constraintInstance = ctx.mkNot(formNumericConstraint(e, aMatch));
				constraintInstances = ctx.mkAnd(constraintInstances, constraintInstance);
			}
		}
		return constraintInstances;
	}


	/*
	public void testIsSat(XExpression expression, Term t) throws Exception {
		int count = 10000;
		Map<XExpression, Set<Map<JvmIdentifiableElement,PrimitiveElement>>> matches = new HashMap<XExpression, Set<Map<JvmIdentifiableElement,PrimitiveElement>>>();
		Set<Map<JvmIdentifiableElement,PrimitiveElement>> matchSet = new HashSet<Map<JvmIdentifiableElement,PrimitiveElement>>();
		ArrayList<JvmIdentifiableElement> allElem = getJvmIdentifiableElements(expression);

		for (int i = 0; i < count; i++) {
			Map<JvmIdentifiableElement,PrimitiveElement> match = new HashMap<JvmIdentifiableElement,PrimitiveElement>();
			for (JvmIdentifiableElement e: allElem) {
				FakeIntegerElement intE = new FakeIntegerElement();
				match.put(e, intE);
			}
			matchSet.add(match);
		}

		matches.put(expression, matchSet);
		long start = System.currentTimeMillis();
		boolean sat = isSatisfiable(matches);
		long end = System.currentTimeMillis();
		System.out.println(sat);
		System.out.println("Number of matches: " + count);
		System.out.println("Running time:" + (end - start));
	}

	public void testIsNotSat(XExpression expression, Term t) throws Exception {
		Map<XExpression, Set<Map<JvmIdentifiableElement,PrimitiveElement>>> matches = new HashMap<XExpression, Set<Map<JvmIdentifiableElement,PrimitiveElement>>>();
		Set<Map<JvmIdentifiableElement,PrimitiveElement>> matchSet = new HashSet<Map<JvmIdentifiableElement,PrimitiveElement>>();
		Map<JvmIdentifiableElement,PrimitiveElement> match = new HashMap<JvmIdentifiableElement,PrimitiveElement>();
		ArrayList<JvmIdentifiableElement> allElem = getJvmIdentifiableElements(expression);
		FakeIntegerElement int1 = null;
		FakeIntegerElement int2 = null;
		boolean first = true;
		for (JvmIdentifiableElement e: allElem) {
			FakeIntegerElement intE = new FakeIntegerElement();
			if (first) {
				int1 = intE;
				first = false;
			} else {
				int2 = intE;
			}

			match.put(e, intE);
		}
		matchSet.add(match);

		Map<JvmIdentifiableElement,PrimitiveElement> match2 = new HashMap<JvmIdentifiableElement,PrimitiveElement>();
		boolean first2 = true;
		for (JvmIdentifiableElement e: allElem) {
			if (first2) {
				match2.put(e, int2);
				first2 = false;
			} else {
				match2.put(e, int1);
			}
		}
		matchSet.add(match2);

		matches.put(expression, matchSet);
		long start = System.currentTimeMillis();
		boolean sat = isSatisfiable(matches);
		long end = System.currentTimeMillis();
		System.out.println(sat);
		System.out.println("Number of matches: ");
		System.out.println("Running time:" + (end - start));
	}
	 */

	/*	public void testGetOneSol(XExpression expression, Term t) throws Exception {
		int count = 10;
		Map<XExpression, Iterable<Map<JvmIdentifiableElement,PrimitiveElement>>> matches = new HashMap<XExpression, Iterable<Map<JvmIdentifiableElement,PrimitiveElement>>>();
		Iterable<Map<JvmIdentifiableElement,PrimitiveElement>> matchSet = new ArrayList<Map<JvmIdentifiableElement,PrimitiveElement>>();

		ArrayList<JvmIdentifiableElement> allElem = getJvmIdentifiableElements(expression);
		List<PrimitiveElement> obj = new ArrayList<PrimitiveElement>();

		for (int i = 0; i < count; i++) {
			Map<JvmIdentifiableElement,PrimitiveElement> match = new HashMap<JvmIdentifiableElement,PrimitiveElement>();
			for (JvmIdentifiableElement e: allElem) {
				FakeIntegerElement intE = new FakeIntegerElement();
				obj.add(intE);
				match.put(e, intE);
			}
			((ArrayList) matchSet).add(match);
			matches.put(expression, matchSet);
		}

		long start = System.currentTimeMillis();
		Map<PrimitiveElement,Integer> sol = getOneSolution(obj, matches);
		long end = System.currentTimeMillis();


		// Print sol
		for (Object o: sol.keySet()) {
			System.out.println(o + " :" + sol.get(o));
		}


		System.out.println("Number of matches: " + count);
		System.out.println("Running time:" + (end - start));
	}*/
	/*
	public void testGetOneSol2(XExpression expression, Term t) throws Exception {
		int count = 250;
		Map<XExpression, Set<Map<JvmIdentifiableElement,PrimitiveElement>>> matches = new HashMap<XExpression, Set<Map<JvmIdentifiableElement,PrimitiveElement>>>();
		Set<Map<JvmIdentifiableElement,PrimitiveElement>> matchSet = new HashSet<Map<JvmIdentifiableElement,PrimitiveElement>>();
		ArrayList<JvmIdentifiableElement> allElem = getJvmIdentifiableElements(expression);
		List<Object> obj = new ArrayList<Object>();
		for (int i = 0; i < count; i++) {
			Map<JvmIdentifiableElement,PrimitiveElement> match = new HashMap<JvmIdentifiableElement,PrimitiveElement>();
			FakeIntegerElement int2 = null;
			boolean first = false;
			for (JvmIdentifiableElement e: allElem) {
				FakeIntegerElement intE = new FakeIntegerElement();
				if (first) {
					first = false;
				} else {
					int2 = intE;
				}
				obj.add(intE);
				match.put(e, intE);
			}

			Map<JvmIdentifiableElement,PrimitiveElement> match2 = new HashMap<JvmIdentifiableElement,PrimitiveElement>();
			boolean first2 = true;
			for (JvmIdentifiableElement e: allElem) {
				FakeIntegerElement intE = null;
				if (first2) {
					intE = int2;
					first2 = false;
				} else {
					intE = new FakeIntegerElement();
				}
				obj.add(intE);
				match2.put(e, intE);
			}


			matchSet.add(match);
			matchSet.add(match2);
		}
		matches.put(expression, matchSet);

		System.out.println("Number of matches: " + matchSet.size());
		for (int i = 0; i < 10; i++) {
			Map<Object,Integer> sol = getOneSolution(obj, matches);
			System.out.println("**********************");
			Thread.sleep(3000);
		}	
	}

	public void testGetOneSol3(XExpression expression, Term t) throws Exception {
		int count = 15000;
		Random rand = new Random();
		Map<XExpression, Set<Map<JvmIdentifiableElement,PrimitiveElement>>> matches = new HashMap<XExpression, Set<Map<JvmIdentifiableElement,PrimitiveElement>>>();
		Set<Map<JvmIdentifiableElement,PrimitiveElement>> matchSet = new HashSet<Map<JvmIdentifiableElement,PrimitiveElement>>();
		ArrayList<JvmIdentifiableElement> allElem = getJvmIdentifiableElements(expression);
		List<Object> obj = new ArrayList<Object>();
		for (int i = 0; i < count; i++) {
			Map<JvmIdentifiableElement,PrimitiveElement> match = new HashMap<JvmIdentifiableElement,PrimitiveElement>();
			if (obj.size() > 1) {
				for (JvmIdentifiableElement e: allElem) {
					FakeIntegerElement intE = null;
					int useOld = rand.nextInt(10);
					if (useOld == 1) {
						System.out.println("here ");
						int index = rand.nextInt(obj.size());
						intE = (FakeIntegerElement) obj.get(index);
					} else {
						intE = new FakeIntegerElement();
					}
					obj.add(intE);
					match.put(e, intE);
				}
			} else {
				for (JvmIdentifiableElement e: allElem) {
					FakeIntegerElement intE = new FakeIntegerElement();
					obj.add(intE);
					match.put(e, intE);
				}
			}
			matchSet.add(match);
		}
		matches.put(expression, matchSet);

		System.out.println("Number of matches: " + matchSet.size());
		for (int i = 0; i < 10; i++) {
			Map<Object,Integer> sol = getOneSolution(obj, matches);
			System.out.println("**********************");
			Thread.sleep(3000);
		}	
	}
	 */
}
