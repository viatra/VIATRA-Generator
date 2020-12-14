package hu.bme.mit.inf.dslreasoner.viatra2logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.XExpression;

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PrimitiveElement;

public class NumericDrealProblemSolver {
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

	private File tempFile;
	private PrintWriter printer;
	private String containerName;
	private Map<Object, String> varMap;

	long endformingProblem=0;
	long endSolvingProblem=0;
	long endFormingSolution=0;

	public NumericDrealProblemSolver() throws IOException, InterruptedException {
		//setup smt2 input file
		tempFile = File.createTempFile("smt", ".smt2");
		printer = new PrintWriter(tempFile);
		printer.println(";Header comment");
		printer.println("(set-logic QF_NRA)");
		
		//setup docker
		File parentPath = tempFile.getParentFile();
		System.out.println(parentPath);
		System.out.println(tempFile);
		//TODO ENSURE that container name is not already in use
		containerName = UUID.randomUUID().toString().replace("-", "");
		List<String> startDocker = new ArrayList<String>(
				Arrays.asList("docker", "run", 
						"-id", "--rm", 
						"--name", containerName, 
						"-p", "8080:80", 
						"-v", parentPath + ":/mnt",
						"dreal/dreal4"));
		Process p = runProcess(startDocker);
		
		//setup varmap		
		varMap = new HashMap<Object, String>();
	}
	
	public Process runProcess(List<String> cmd) throws IOException, InterruptedException {
//		println(cmd)
		ProcessBuilder pb = new ProcessBuilder(cmd);
		pb.redirectOutput();
		pb.redirectError();
		Process p = pb.start();
		p.waitFor();
		//TODO timeout if needed
//		if (!p.waitFor(TIMEOUT, TimeUnit.SECONDS)) {
//			p.destroy();
//		}
		return p;
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
//
//	private ArrayList<JvmIdentifiableElement> getJvmIdentifiableElements(XExpression expression) {
//		ArrayList<JvmIdentifiableElement> allElem = new ArrayList<JvmIdentifiableElement>();
//		XExpression left = ((XBinaryOperation) expression).getLeftOperand();
//		XExpression right = ((XBinaryOperation) expression).getRightOperand();
//
//		getJvmIdentifiableElementsHelper(left, allElem);
//		getJvmIdentifiableElementsHelper(right, allElem);
//		return allElem;
//	}
//
//	private void getJvmIdentifiableElementsHelper(XExpression e, List<JvmIdentifiableElement> allElem) {
//		if (e instanceof XFeatureCall) {
//			allElem.add(((XFeatureCall) e).getFeature());
//		} else if (e instanceof XBinaryOperation) {
//			getJvmIdentifiableElementsHelper(((XBinaryOperation) e).getLeftOperand(), allElem);
//			getJvmIdentifiableElementsHelper(((XBinaryOperation) e).getRightOperand(), allElem);
//		}
//	}
	
	public Process callDreal() throws IOException, InterruptedException {
		List<String> drealCmd = new ArrayList<String>(
				Arrays.asList("docker", "exec", 
						containerName,
						"dreal",
						"--model",
						"mnt/" + tempFile.getName()));
		return runProcess(drealCmd);
	}
	
	public boolean getDrealResult(Process p) throws IOException {
		if (p.exitValue() == 1) {return false;}
		
		BufferedReader output = new BufferedReader(new InputStreamReader(p.getInputStream()));
		
		String resultRaw = output.readLine();
		if (resultRaw.startsWith("unsat")) {return false;}
		if (resultRaw.startsWith("delta-sat")) {return true;}
		throw new IOException("Unknown dreal output first line");
		//TODO make the above better
	}
	
	public boolean isSatisfiable(Map<XExpression, Iterable<Map<JvmIdentifiableElement,PrimitiveElement>>> matches) throws Exception {
		long startformingProblem = System.nanoTime();
		//CREATE DREAL STM2 FILE
		//TODO
		
		printer.close();
		endformingProblem = System.nanoTime()-startformingProblem;
		long startSolvingProblem = System.nanoTime();
		//CALL DREAL
		Process outputProcess = callDreal();
		boolean result = getDrealResult(outputProcess);
		endSolvingProblem = System.nanoTime()-startSolvingProblem;
		//CLOSE
		return result;
	}

	public Map<PrimitiveElement,Number> getOneSolution(List<PrimitiveElement> objs, Map<XExpression, Iterable<Map<JvmIdentifiableElement,PrimitiveElement>>> matches) throws Exception {		
//		Map<PrimitiveElement,Number> sol = new HashMap<PrimitiveElement, Number>();
//		long startformingProblem = System.nanoTime();
//		BoolExpr problemInstance = formNumericProblemInstance(matches);
//		endformingProblem = System.nanoTime()-startformingProblem;
//		//System.out.println("Forming problem: " + (endformingProblem - startformingProblem));
//		s.add(problemInstance);
//		long startSolvingProblem = System.nanoTime();
//		if (s.check() == Status.SATISFIABLE) {
//			Model m = s.getModel();
//			endSolvingProblem = System.nanoTime()-startSolvingProblem;
//			//System.out.println("Solving problem: " + (endSolvingProblem - startSolvingProblem));
//			long startFormingSolution = System.nanoTime();
//			for (PrimitiveElement o: objs) {
//				if(varMap.containsKey(o)) {
//					if (o instanceof IntegerElement) {
//						IntExpr val =(IntExpr) m.evaluate(varMap.get(o), false);
//						Integer oSol = Integer.parseInt(val.toString());
//						sol.put(o, oSol);
//					} else {
//						RealExpr val = (RealExpr) m.evaluate(varMap.get(o), false);
//						Double oSol = Double.parseDouble(val.toString());
//						sol.put(o, oSol);
//					}
//					//System.out.println("Solution:" + o + "->" + oSol);
//
//				} else {
//					//System.out.println("not used var:" + o);
//				}
//			}
//			endFormingSolution = System.nanoTime()-startFormingSolution;
//			//System.out.println("Forming solution: " + (endFormingSolution - startFormingSolution));
//		} else {
//			System.out.println("Unsatisfiable numerical problem");
//		}
//		this.ctx.close();
//		return sol;
		return null;
	}
//
//	private BoolExpr formNumericConstraint(XExpression e, Map<JvmIdentifiableElement, PrimitiveElement> aMatch) throws Exception {
//		if (!(e instanceof XBinaryOperation)) {
//			throw new Exception ("error in check expression!!!");
//		}
//
//		String name = ((XBinaryOperation) e).getFeature().getQualifiedName();
//
//		BoolExpr constraint = null;
//
//		ArithExpr left_operand = formNumericConstraintHelper(((XBinaryOperation) e).getLeftOperand(), aMatch);
//		ArithExpr right_operand = formNumericConstraintHelper(((XBinaryOperation) e).getRightOperand(), aMatch);
//
//		if (nameEndsWith(name, N_LESSTHAN)) {
//			constraint = ctx.mkLt(left_operand, right_operand);
//		} else if (nameEndsWith(name, N_LESSEQUALSTHAN)) {
//			constraint = ctx.mkLe(left_operand, right_operand);
//		} else if (nameEndsWith(name, N_GREATERTHAN)) {
//			constraint = ctx.mkGt(left_operand, right_operand);
//		} else if (nameEndsWith(name, N_GREATEREQUALTHAN)) {
//			constraint = ctx.mkGe(left_operand, right_operand);
//		} else if (nameEndsWith(name, N_EQUALS)) {
//			constraint = ctx.mkEq(left_operand, right_operand);
//		} else if (nameEndsWith(name, N_NOTEQUALS)) {
//			constraint = ctx.mkDistinct(left_operand, right_operand);
//		} else if (nameEndsWith(name, N_EQUALS3)) {
//			constraint = ctx.mkGe(left_operand, right_operand);	// ???
//		} else if (nameEndsWith(name, N_NOTEQUALS3)) {
//			constraint = ctx.mkGe(left_operand, right_operand);	// ???
//		} else {
//			throw new Exception ("Unsupported binary operation " + name);
//		}
//
//		return constraint;
//	}
//
//	private ArithExpr formNumericConstraintHelper(XExpression e, Map<JvmIdentifiableElement, PrimitiveElement> aMatch) throws Exception {
//		ArithExpr expr = null;
//		// Variables
//		if (e instanceof XFeatureCall) {
//			PrimitiveElement matchedObj = aMatch.get(((XFeatureCall) e).getFeature());
//			boolean isInt = matchedObj instanceof IntegerElement;
//			if (!matchedObj.isValueSet()) {
//				if (varMap.get(matchedObj) == null) {
//					String var_name = ((XFeatureCall) e).getFeature().getQualifiedName() + matchedObj.toString();
//					if (isInt) {
//						expr = (ArithExpr) ctx.mkConst(ctx.mkSymbol(var_name), ctx.getIntSort());
//					} else {
//						expr = (ArithExpr) ctx.mkConst(ctx.mkSymbol(var_name), ctx.getRealSort());
//					}
//					varMap.put(matchedObj, expr);
//				} else {
//					expr = (ArithExpr) varMap.get(matchedObj);
//				}
//			} else {
//				if (isInt) {
//					int value = ((IntegerElement) matchedObj).getValue();
//					expr = (ArithExpr) ctx.mkInt(value);
//				} else {
//					double value = ((RealElement) matchedObj).getValue().doubleValue();
//					expr = (ArithExpr) ctx.mkReal(String.valueOf(value));
//				}
//				varMap.put(matchedObj, expr);
//			}
//		} 
//		// Constants
//		else if (e instanceof XNumberLiteral) {
//			String value = ((XNumberLiteral) e).getValue();
//			try{ 
//				int val = Integer.parseInt(value);  
//				expr = (ArithExpr) ctx.mkInt(val);
//			}  catch(NumberFormatException err){
//				try{ 
//					expr = (ArithExpr) ctx.mkReal(value);
//				}  catch(NumberFormatException err2){}
//			}	
//		} 
//		// Expressions with operators
//		else if (e instanceof XBinaryOperation) {
//			String name = ((XBinaryOperation) e).getFeature().getQualifiedName();
//			ArithExpr left_operand = formNumericConstraintHelper(((XBinaryOperation) e).getLeftOperand(), aMatch);
//			ArithExpr right_operand = formNumericConstraintHelper(((XBinaryOperation) e).getRightOperand(), aMatch);
//
//			if (nameEndsWith(name, N_PLUS)) {
//				expr = ctx.mkAdd(left_operand, right_operand);
//			} else if (nameEndsWith(name, N_MINUS)) {
//				expr = ctx.mkAdd(left_operand, ctx.mkUnaryMinus(right_operand));
//			} else if (nameEndsWith(name, N_POWER)) {
//				expr = ctx.mkPower(left_operand, right_operand);
//			} else if (nameEndsWith(name, N_MULTIPLY)) {
//				expr = ctx.mkMul(left_operand, right_operand);
//			} else if (nameEndsWith(name, N_DIVIDE)) {
//				expr = ctx.mkDiv(left_operand, right_operand);
//			} else if (nameEndsWith(name, N_MODULO)) {
//				expr = ctx.mkMod((IntExpr)left_operand, (IntExpr)right_operand);
//			} else {
//				throw new Exception ("Unsupported binary operation " + name);
//			}
//		} else {
//			throw new Exception ("Unsupported expression " + e.getClass().getSimpleName());
//		}
//		return expr;
//
//	}
//
//	private boolean nameEndsWith(String name, String end) {
//		return name.startsWith(N_Base) && name.endsWith(end);
//	}
//
//	private BoolExpr formNumericProblemInstance(Map<XExpression, Iterable<Map<JvmIdentifiableElement,PrimitiveElement>>> matches) throws Exception {
//		BoolExpr constraintInstances = ctx.mkTrue();
//		for (XExpression e: matches.keySet()) {
//			Iterable<Map<JvmIdentifiableElement, PrimitiveElement>> matchSets = matches.get(e);
//			for (Map<JvmIdentifiableElement, PrimitiveElement> aMatch: matchSets) {
//				BoolExpr constraintInstance = ctx.mkNot(formNumericConstraint(e, aMatch));
//				constraintInstances = ctx.mkAnd(constraintInstances, constraintInstance);
//			}
//		}
//		return constraintInstances;
//	}
}
