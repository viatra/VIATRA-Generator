package hu.bme.mit.inf.dslreasoner.viatra2logic;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import java.util.concurrent.TimeUnit;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XNumberLiteral;

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.IntegerElement;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PrimitiveElement;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RealElement;

public class NumericDrealProblemSolver extends NumericProblemSolver{

	private final String containerName;
	private Map<Object, String> varMap;
	private List<String> curVars;

	public NumericDrealProblemSolver() throws IOException, InterruptedException {		
		//setup docker
		//TODO ENSURE that container name is not already in use????
		File tempDir = new File(System.getProperty("java.io.tmpdir"));
		containerName = UUID.randomUUID().toString().replace("-", "");
		List<String> startDocker = new ArrayList<String>(
				Arrays.asList("docker", "run", 
						"-id", "--rm", 
						"--name", containerName, 
//						"-p", "8080:80", 
						"-v", tempDir + ":/mnt",
						"dreal/dreal4"));
		Process p = runProcess(startDocker);		
		
		//setup varmap		
		varMap = new HashMap<Object, String>();
	}
	
	private Process runProcess(List<String> cmd) throws IOException, InterruptedException {
//		println(cmd)
		ProcessBuilder pb = new ProcessBuilder(cmd);
		Process p = pb.start();
//		p.waitFor();
		//TODO timeout if needed
		if (!p.waitFor(5, TimeUnit.SECONDS)) {
			p.destroy();
		}
		return p;
	}
	
	private Process callDreal(String tempFileName) throws IOException, InterruptedException {
		List<String> drealCmd = new ArrayList<String>(
				Arrays.asList("docker", "exec", 
						containerName,
						"dreal",
						"--model",
						"mnt/" + tempFileName));
		return runProcess(drealCmd);
	}
	
	private List<String> getDrealStream(InputStream stream) throws IOException {
		List<String> output = new ArrayList<String>();
		BufferedReader r = new BufferedReader(new InputStreamReader(stream));
		
		String rl = "";
		while ((rl = r.readLine()) != null) {output.add(rl);}
		return output;
	}
	
	private List<List<String>> getProcessOutput(Process p) throws IOException {
		List<List<String>> outputs = new ArrayList<List<String>>();
		outputs.add(getDrealStream(p.getInputStream()));
		outputs.add(getDrealStream(p.getErrorStream()));
		return outputs;
	}
	
	private boolean getDrealResult(int exitVal, List<List<String>> outputs) throws IOException {
		//error at process-level
		if (exitVal == 1) {printError(outputs.get(1)); return false;}
		
		//error at dreal-level
		if (! outputs.get(1).isEmpty()) {printError(outputs.get(1)); return false;}
		
		//print output
//		printOutput(outputs.get(0));
		
		String resultRaw = outputs.get(0).get(0);
		if (resultRaw.startsWith("unsat")) {return false;}
		if (resultRaw.startsWith("delta-sat")) {return true;}
		throw new IOException("Unknown dreal output first line");
		//TODO make the above better
	}	
	
	private String formNumericConstraint(XExpression e, Map<JvmIdentifiableElement, PrimitiveElement> aMatch) throws Exception {
		//The check equation MUST be a binary operation
		if (!(e instanceof XBinaryOperation)) {
			throw new Exception ("error in check expression!!!");
		}

		String name = ((XBinaryOperation) e).getFeature().getQualifiedName();

		String operator = "";

		String left_operand = formNumericConstraintHelper(((XBinaryOperation) e).getLeftOperand(), aMatch);
		String right_operand = formNumericConstraintHelper(((XBinaryOperation) e).getRightOperand(), aMatch);

		if (nameEndsWith(name, N_LESSTHAN)) {
			operator = "<";
		} else if (nameEndsWith(name, N_LESSEQUALSTHAN)) {
			operator = "<=";
		} else if (nameEndsWith(name, N_GREATERTHAN)) {
			operator = ">";
		} else if (nameEndsWith(name, N_GREATEREQUALTHAN)) {
			operator = ">=";
		} else if (nameEndsWith(name, N_EQUALS)) {
			operator = "<";
		} else if (nameEndsWith(name, N_NOTEQUALS)) {
			//Exceptional case
			return "(not (="  + " " + left_operand + " " + right_operand + "))";
//		} else if (nameEndsWith(name, N_EQUALS3)) {
//			operator = "<";
//		} else if (nameEndsWith(name, N_NOTEQUALS3)) {
//			operator = "<";
		} else {
			throw new Exception ("Unsupported binary operation " + name);
		}

		return "(" + operator + " " + left_operand + " " + right_operand + ")";
	}

	private String formNumericConstraintHelper(XExpression e, Map<JvmIdentifiableElement, PrimitiveElement> aMatch) throws Exception {
		String expr = "";
		// Variables
		if (e instanceof XFeatureCall) {
			PrimitiveElement matchedObj = aMatch.get(((XFeatureCall) e).getFeature());
			boolean isInt = matchedObj instanceof IntegerElement;
			if (!matchedObj.isValueSet()) {
				if (varMap.get(matchedObj) == null) {
					expr = ((XFeatureCall) e).getFeature().getQualifiedName() + matchedObj.hashCode(); //TODO ISSUE
					varMap.put(matchedObj, expr);
				} else {
					expr = varMap.get(matchedObj);
				}
			} else {
				//TODO unsure what it means if something gets in here
				if (isInt) {
					expr = Integer.toString(((IntegerElement) matchedObj).getValue());
				} else {
					expr = Double.toString(((RealElement) matchedObj).getValue().doubleValue());
				}
				varMap.put(matchedObj, expr);
			}
			//Add variable declarations
			if(! curVars.contains(expr)) {
				String varDecl = "(declare-fun " + expr + " () ";
				if (isInt) {varDecl += "Int)";}
				else {varDecl += "Real)";}
				curVars.add(varDecl);
			}
		} 
		// Constants
		else if (e instanceof XNumberLiteral) {
			//we do not care if it is an int or a real.
			//We actually do not even check f the value parses into a number
			expr = ((XNumberLiteral) e).getValue();
			//TODO ensure that the value is a valid number
			// expr = Integer.parseInt(value)
		} 
		// Expressions with operators
		else if (e instanceof XBinaryOperation) {
			String name = ((XBinaryOperation) e).getFeature().getQualifiedName();
			String left_operand = formNumericConstraintHelper(((XBinaryOperation) e).getLeftOperand(), aMatch);
			String right_operand = formNumericConstraintHelper(((XBinaryOperation) e).getRightOperand(), aMatch);

			String operator = "";
			if (nameEndsWith(name, N_PLUS)) {
				operator = "+";
			} else if (nameEndsWith(name, N_MINUS)) {
				operator = "-";
			} else if (nameEndsWith(name, N_POWER)) {
				operator = "^";
			} else if (nameEndsWith(name, N_MULTIPLY)) {
				operator = "*";
			} else if (nameEndsWith(name, N_DIVIDE)) {
				operator = "/";
//			} else if (nameEndsWith(name, N_MODULO)) {
//				expr = ctx.mkMod((IntExpr)left_operand, (IntExpr)right_operand);
			} else {
				throw new Exception ("Unsupported binary operation " + name);
			}

			expr = "(" + operator + " " + left_operand + " " + right_operand + ")";			
		} else {
			throw new Exception ("Unsupported expression " + e.getClass().getSimpleName());
		}
		return expr;

	}

	private boolean nameEndsWith(String name, String end) {
		return name.startsWith(N_Base) && name.endsWith(end);
	}

	private String formNumericProblemInstance(Map<XExpression, Iterable<Map<JvmIdentifiableElement,PrimitiveElement>>> matches) throws Exception {
		//CREATE SMT2 TEMP FILE
		File tempFile = File.createTempFile("smt", ".smt2");
		String tempFileName = tempFile.getName();
		
		//STM2 FILE CONTENT CREATION
		curVars = new ArrayList<String>();
		List<String> curConstraints = new ArrayList<String>();
		
		PrintWriter printer = new PrintWriter(tempFile);
		printer.println(";Header comment");
		printer.println("(set-logic QF_NRA)");
		for (XExpression e: matches.keySet()) {
			Iterable<Map<JvmIdentifiableElement, PrimitiveElement>> matchSets = matches.get(e);
			for (Map<JvmIdentifiableElement, PrimitiveElement> aMatch: matchSets) {
				String constraint = formNumericConstraint(e, aMatch);
				String negAssert = "(assert (not " + constraint +  "))";
				curConstraints.add(negAssert);
			}
		}
		//Add Content to SMT2 file
		for (String varDecl : curVars) {printer.println(varDecl);}
		for (String negAssert : curConstraints) {printer.println(negAssert);}
		printer.println("(check-sat)");
		printer.close();
		return tempFileName;
	}
	
	private void printFileContent(String path) throws IOException {
		InputStream input = new BufferedInputStream(new FileInputStream(path));
		byte[] buffer = new byte[8192];

		try {
		    for (int length = 0; (length = input.read(buffer)) != -1;) {
		        System.out.write(buffer, 0, length);
		    }
		} finally {
		    input.close();
		}
	}
	
	private void printOutput(List<String> list) {
		for (String line : list) {
			System.out.println(line);
		}
	}
	
	private void printError(List<String> list) {
		for (String line : list) {
			System.err.println(line);
		}
	}
	
	public boolean isSatisfiable(Map<XExpression, Iterable<Map<JvmIdentifiableElement,PrimitiveElement>>> matches) throws Exception {
		//CREATE DREAL STM2 FILE at this.tempfile location
		long startformingProblem = System.nanoTime();
		String tempFileName = formNumericProblemInstance(matches);
		endformingProblem = System.nanoTime()-startformingProblem;
		
//		printFileContent(System.getProperty("java.io.tmpdir") + tempFileName);
				
		//CALL DREAL		
		long startSolvingProblem = System.nanoTime();
		Process outputProcess = callDreal(tempFileName);
		List<List<String>> outputs = getProcessOutput(outputProcess);
		boolean result = getDrealResult(outputProcess.exitValue(), outputs);
		System.out.println(result);
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
	
	public void teardown() throws IOException, InterruptedException {
		List<String> stopDocker = new ArrayList<String>(
				Arrays.asList("docker", "stop", containerName));
		runProcess(stopDocker);
		//TODO Check if above went well?
	}

}
