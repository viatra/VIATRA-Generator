package hu.bme.mit.inf.dslreasoner.viatra2logic;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.XUnaryOperation;

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.IntegerElement;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PrimitiveElement;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RealElement;

public class NumericDrealProblemSolver extends NumericProblemSolver{
	
	private final boolean useDocker;

	private String containerName = "<container-name-here>";
	private String drealLocalPath = "<path-to-dreal-here>";
	private final String smtFileName = "tmp/smt.smt2";
	private final File localTempFile = File.createTempFile("smt", ".smt2");
	private Map<Object, String> varMap;
	private Map<String, String> curVar2Decl;
	
	private final int TIMEOUT_DOCKER = 5;
	private final int TIMEOUT_LOCAL = 2;

	public NumericDrealProblemSolver(boolean useDocker, String drealLocalPath) throws IOException, InterruptedException {
		this.useDocker = useDocker;
		this.varMap = new HashMap<Object, String>();
		this.drealLocalPath = drealLocalPath;
		
		if (useDocker) setupDocker();
	}
	
	private void setupDocker() throws IOException, InterruptedException {
		//setup docker
		//TODO ENSURE that container name is not already in use????
		//TODO if dreal/dreal4 image is not downloaded, download it.
		this.containerName = UUID.randomUUID().toString().replace("-", "");
		List<String> startDocker = new ArrayList<String>(
				Arrays.asList("docker", "run", 
						"-id", "--rm", 
						"--name", containerName, 
//						"-p", "8080:80",
						"dreal/dreal4"));
		runProcess(startDocker, TIMEOUT_DOCKER);	
	}
	
	private Process runProcess(List<String> cmd, int timeout) throws IOException, InterruptedException {
		String s = String.join(" ", cmd);
		Process p = Runtime.getRuntime().exec(s);
//		p.waitFor();
		//TODO timeout if needed
		if (!p.waitFor(timeout, TimeUnit.SECONDS)) {
			p.destroy();
			return null;
		}
		return p;
	}
	
	private Process callDrealDocker(List<String> numProbContents, boolean getModel) throws IOException, InterruptedException {
		//TODO currently not working for Linux
		String numProbContentStr = String.join("\\n", numProbContents);
		List<String> drealCmd = new ArrayList<String>(Arrays.asList(
						"docker", "exec", containerName,
						"bash", "-c",
						"\"printf " +
						"\'" + numProbContentStr + "\'",
						">",
						smtFileName,
						"&&",
						"dreal"));
		if (getModel) {drealCmd.add("--model");}
		drealCmd.add(smtFileName + "\"");	
		
//		System.out.println(drealCmd);
//		
		return runProcess(drealCmd, TIMEOUT_DOCKER);
	}
	
	private Process callDrealLocal(List<String> numProbContents, boolean getModel) throws IOException, InterruptedException {
		//print numProbConents to temp file
		PrintWriter printer = new PrintWriter(localTempFile);
		for (String s : numProbContents) {
			printer.println(s);
		}
		printer.close();
		
		//call local dreal with path to temp file
		List<String> drealCmd = new ArrayList<String>();
		drealCmd.add(drealLocalPath);
		if (getModel) {drealCmd.add("--model");}
		drealCmd.add(localTempFile.getAbsolutePath());
		
//		System.out.println(drealCmd);
		
		return runProcess(drealCmd, TIMEOUT_LOCAL);
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
		
		String resultRaw = outputs.get(0).get(0);
		if (resultRaw.startsWith("unsat")) {return false;}
		if (resultRaw.startsWith("delta-sat")) {return true;}
		throw new IOException("Unknown dreal output first line");
		//TODO make the above better
	}	
	
	private String formNumericConstraint(XExpression e, Map<JvmIdentifiableElement, PrimitiveElement> aMatch) throws Exception {
		//The check equation MUST be a binary operation of the listed types (comparisons)
		if (!(e instanceof XBinaryOperation)) {
			throw new Exception ("error in check expression!!!");
		}

		String name = ((XBinaryOperation) e).getFeature().getQualifiedName();

		String operator = "";

		String left_operand = formNumericConstraintHelper(((XBinaryOperation) e).getLeftOperand(), aMatch);
		String right_operand = formNumericConstraintHelper(((XBinaryOperation) e).getRightOperand(), aMatch);

		//NOTE that everything  is inverted, due to how the MG handles vql constraints
		if (nameEndsWith(name, N_LESSTHAN)) {
			operator = ">";
		} else if (nameEndsWith(name, N_LESSEQUALSTHAN)) {
			operator = ">=";
		} else if (nameEndsWith(name, N_GREATERTHAN)) {
			operator = "<";
		} else if (nameEndsWith(name, N_GREATEREQUALTHAN)) {
			operator = "<=";
		} else if (nameEndsWith(name, N_EQUALS)) {
			//Exceptional case
			return "(not (="  + " " + left_operand + " " + right_operand + "))";
		} else if (nameEndsWith(name, N_NOTEQUALS)) {
			operator = "=";
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
				//e is UNDEFINED term
				if (varMap.get(matchedObj) == null) {
					//define and store the name of the matchedObj
					expr = ((XFeatureCall) e).getFeature().getQualifiedName() + matchedObj.hashCode(); //TODO ISSUE
					varMap.put(matchedObj, expr);
				} else {
					//get name if already seen
					expr = varMap.get(matchedObj);
				}
				//Add variable declarations, only for UNDEFINED
				if(! curVar2Decl.keySet().contains(expr)) {
					String varDecl = "(declare-fun " + expr + " () ";
					if (isInt) {varDecl += "Int)";}
					else {varDecl += "Real)";}
					curVar2Decl.put(expr, varDecl);
				}
			} else {
				//e is DEFINED term (has a value)
				if (isInt) {
					expr = Integer.toString(((IntegerElement) matchedObj).getValue());
				} else {
					expr = Double.toString(((RealElement) matchedObj).getValue());
//					expr = Double.toString(((RealElement) matchedObj).getValue().doubleValue());
				}
				varMap.put(matchedObj, expr);
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
			} else if (nameEndsWith(name, N_LESSTHAN)) {
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
//			} else if (nameEndsWith(name, N_MODULO)) {
//				expr = ctx.mkMod((IntExpr)left_operand, (IntExpr)right_operand);
			} else {
				throw new Exception ("Unsupported binary operation " + name);
			}

			expr = "(" + operator + " " + left_operand + " " + right_operand + ")";			
		} 
		else if (e instanceof XUnaryOperation){
			//TODO
			//This is, for example, "-1000"
			throw new Exception ("Unsupported expression " + e.getClass().getSimpleName());
		}
		else if (e instanceof XIfExpression) {
			
			String if_operand = formNumericConstraintHelper(((XIfExpression) e).getIf(), aMatch);
			String then_operand = formNumericConstraintHelper(((XIfExpression) e).getThen(), aMatch);
			String else_operand = formNumericConstraintHelper(((XIfExpression) e).getElse(), aMatch);
			
			expr = "(ite " + if_operand + " " + then_operand + " " + else_operand + ")";
		}
		else if (e instanceof XBlockExpression) {
			XBlockExpression ebl = (XBlockExpression) e;
			
			if (ebl.getExpressions().size() > 1)
				throw new Exception("Unsupported: blocks with more than 1 statement are not currently supportes: " + ebl);
			if (ebl.getExpressions().isEmpty())
				throw new Exception("Unsupported: blocks is empty:" + ebl);
			
			//TODO make this more general
			expr = formNumericConstraintHelper(ebl.getExpressions().get(0), aMatch);
		}
		else {
			throw new Exception ("Unsupported expression " + e.getClass().getSimpleName());
		}
		return expr;

	}

	private boolean nameEndsWith(String name, String end) {
		return name.startsWith(N_Base) && name.endsWith(end);
	}

	private List<String> formNumericProblemInstance(Map<XExpression, Iterable<Map<JvmIdentifiableElement,PrimitiveElement>>> matches) throws Exception {
		
		//STM2 FILE CONTENT CREATION
		curVar2Decl = new HashMap<String, String>();
		List<String> curConstraints = new ArrayList<String>();
		
		List<String> contents = new ArrayList<String>();
		contents.add(";Header comment");
		contents.add("(set-logic QF_NRA)");
		//For loop below also populates carVar2Decl
		for (XExpression e: matches.keySet()) {
			Iterable<Map<JvmIdentifiableElement, PrimitiveElement>> matchSets = matches.get(e);
			for (Map<JvmIdentifiableElement, PrimitiveElement> aMatch: matchSets) {
				String constraint = formNumericConstraint(e, aMatch);
				String negAssert = "(assert " + constraint +  ")";
				curConstraints.add(negAssert);
			}
		}
		//Add content to file
		contents.addAll(curVar2Decl.values());
		contents.addAll(curConstraints);
		contents.add("(check-sat)");
		return contents;
	}
	
	@SuppressWarnings("unused")
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
	
	@SuppressWarnings("unused")
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
		//CREATE DREAL STM2 FILE CONTENTS
		long startformingProblem = System.nanoTime();
		List<String> numProbContent = formNumericProblemInstance(matches);
		endformingProblem = System.nanoTime()-startformingProblem;
				
		//CALL DREAL
		long startSolvingProblem = System.nanoTime();
		
		Process outputProcess;
		if (this.useDocker) outputProcess = callDrealDocker(numProbContent, false);
		else outputProcess = callDrealLocal(numProbContent, false);
		
		boolean result = false;
		List<List<String>> outputs = null;
		if (outputProcess != null) { 
			outputs = getProcessOutput(outputProcess);
			result = getDrealResult(outputProcess.exitValue(), outputs);
		}
		endSolvingProblem = System.nanoTime()-startSolvingProblem;
		
		//DEBUG - Print things
		if (outputProcess == null) {
			System.err.println("TIMEOUT");
			printOutput(numProbContent);
		}
		
//		printOutput(numProbContent);
//		if (outputs != null) printOutput(outputs.get(0));
//		System.out.println(result);
//		END DEBUG
		
		return result;
	}
	
	private Map<String, String> parseDrealOutput(List<String> output) {
		Map<String, String> res = new HashMap<String, String>();
		String re1 = "(\\w+) : \\[([0-9\\-+.e]+), ([0-9\\-+.e]+)\\]";
		Pattern p1 = Pattern.compile(re1);
		String re2 = "(\\w+) : <([0-9\\-+.e]+), ([0-9\\-+.e]+)>";
		Pattern p2 = Pattern.compile(re2);
		for (String varVal : output) {
		    Matcher m1 = p1.matcher(varVal);
		    Matcher m2 = p2.matcher(varVal);		    
		    if (m1.matches()) {
		        String name = m1.group(1);
		        String lowerB = m1.group(2);
		        String upperB = m1.group(3);
		        res.put(name, lowerB);
		    } else {
			    if (m2.matches()) {
			        String name = m2.group(1);
			        String lowerB = m2.group(2);
			        String upperB = m2.group(3);
			        res.put(name, lowerB);
			    }
		    }
		}
		return res;
	}
	

	public Map<PrimitiveElement,Number> getOneSolution(List<PrimitiveElement> objs, Map<XExpression, Iterable<Map<JvmIdentifiableElement,PrimitiveElement>>> matches) throws Exception {		

		Map<PrimitiveElement,Number> sol = new HashMap<PrimitiveElement, Number>();
		//CREATE DREAL STM2 FILE at this.tempfile location
		long startformingProblem = System.nanoTime();
		List<String> numProbContent = formNumericProblemInstance(matches);
		endformingProblem = System.nanoTime()-startformingProblem;
		
		
		//CALL DREAL
		long startSolvingProblem = System.nanoTime();
		
		Process outputProcess;
		if (this.useDocker) outputProcess = callDrealDocker(numProbContent, true);
		else outputProcess = callDrealLocal(numProbContent, true);
			
		List<List<String>> outputs = getProcessOutput(outputProcess);
		boolean result = getDrealResult(outputProcess.exitValue(), outputs);
		endSolvingProblem = System.nanoTime()-startSolvingProblem;
		
		//DEBUG - Print things
		System.out.println("Getting Solution!");
		printOutput(numProbContent);
		printOutput(outputs.get(0));
//		System.out.println(result);
		//END DEBUG
				
		//GET SOLUTION		
		if (result) {
			long startFormingSolution = System.nanoTime();
			Map<String, String> solMap = parseDrealOutput(outputs.get(0));
			
//			//DEBUG
//			System.out.println("RESULT");
//			solMap.entrySet().forEach(System.out::println);
//			System.out.println("SOLMAP");
//			varMap.forEach((k, v) -> System.out.println(v + "=" + k));
//			//END DEBUG
			
			for (PrimitiveElement obj: objs) {
				if(varMap.containsKey(obj)) {
					String varName = varMap.get(obj);
					String value = solMap.get(varName);
					if (value != null) {
						//this means that dreal actually worked on this and found a value for it
						if (obj instanceof IntegerElement) {
							sol.put(obj, Integer.parseInt(value));
						} else {
							sol.put(obj, Double.parseDouble(value));
						}
					}
				} else {
//					System.err.println("variable " + obj + " is not used from Dreal");
				}
			}
			endFormingSolution = System.nanoTime() - startFormingSolution;
		}
		else {
			System.out.println("Unsatisfiable numerical problem");
		}		
		return sol;
	}
	
	public void teardown() throws IOException, InterruptedException {
		List<String> stopDocker = new ArrayList<String>(
				Arrays.asList("docker", "stop", containerName));
		runProcess(stopDocker, TIMEOUT_DOCKER);
		//TODO Check if above went well?
	}

}
