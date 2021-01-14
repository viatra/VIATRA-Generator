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
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XNumberLiteral;

import com.microsoft.z3.IntExpr;
import com.microsoft.z3.RealExpr;

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.IntegerElement;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PrimitiveElement;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RealElement;

public class NumericDrealProblemSolver extends NumericProblemSolver{

	private final String containerName;
	private final String smtFileName = "tmp/smt.smt2";
	private Map<Object, String> varMap;
	private Map<String, String> curVar2Decl;

	public NumericDrealProblemSolver() throws IOException, InterruptedException {		
		//setup docker
		//TODO ENSURE that container name is not already in use????
		//TODO if dreal/dreal4 image is not downloaded, download it.
		File tempDir = new File(System.getProperty("java.io.tmpdir"));
		containerName = UUID.randomUUID().toString().replace("-", "");
		List<String> startDocker = new ArrayList<String>(
				Arrays.asList("docker", "run", 
						"-id", "--rm", 
						"--name", containerName, 
//						"-p", "8080:80",
						"dreal/dreal4"));
		runProcess(startDocker);		
		
		//setup varmap		
		varMap = new HashMap<Object, String>();
	}
	
	private Process runProcess(List<String> cmd) throws IOException, InterruptedException {
		String s = String.join(" ", cmd);
		Process p = Runtime.getRuntime().exec(s);
//		p.waitFor();
		//TODO timeout if needed
		if (!p.waitFor(5, TimeUnit.SECONDS)) {
			p.destroy();
			System.err.println("TIMEOUT"); //DEBUG
		}
		return p;
	}
	
	private Process callDreal(List<String> numProbContents, boolean getModel) throws IOException, InterruptedException {
		String numProbContentStr = String.join("\\n", numProbContents);
		List<String> drealCmd = new ArrayList<String>(Arrays.asList(
						"docker", "exec", containerName,
						"bash", "-c",
						"\""+  "printf", 
						"\'" + numProbContentStr + "\'",
						">",
						smtFileName,
						"&&",
						"dreal"));
		if (getModel) {drealCmd.add("--model");}
		drealCmd.add(smtFileName + "\"");	
		
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
					expr = Double.toString(((RealElement) matchedObj).getValue());
//					expr = Double.toString(((RealElement) matchedObj).getValue().doubleValue());
				}
				varMap.put(matchedObj, expr);
			}
			//Add variable declarations
			if(! curVar2Decl.keySet().contains(expr)) {
				String varDecl = "(declare-fun " + expr + " () ";
				if (isInt) {varDecl += "Int)";}
				else {varDecl += "Real)";}
				curVar2Decl.put(expr, varDecl);
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
				String negAssert = "(assert (not " + constraint +  "))";
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
		Process outputProcess = callDreal(numProbContent, false);
		List<List<String>> outputs = getProcessOutput(outputProcess);
		boolean result = getDrealResult(outputProcess.exitValue(), outputs);
		endSolvingProblem = System.nanoTime()-startSolvingProblem;
		
		//DEBUG - Print things
//		printOutput(numProbContent);
//		printOutput(outputs.get(0));
//		System.out.println(result);
		//END DEBUG
		
		return result;
	}
	
	private Map<String, String> parseDrealOutput(List<String> output) {
		Map<String, String> res = new HashMap<String, String>();
		String re = "(\\w+) : \\[([0-9\\-+.e]+), ([0-9\\-+.e]+)\\]";
		Pattern p = Pattern.compile(re);
		for (String varVal : output) {
		    Matcher m = p.matcher(varVal);
		    if (m.matches()) {
		        String name = m.group(1);
		        String lowerB = m.group(2);
		        String upperB = m.group(2);
		        res.put(name, lowerB);
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
		Process outputProcess = callDreal(numProbContent, true);
		List<List<String>> outputs = getProcessOutput(outputProcess);
		boolean result = getDrealResult(outputProcess.exitValue(), outputs);
		endSolvingProblem = System.nanoTime()-startSolvingProblem;
		
		//DEBUG - Print things
//		printOutput(numProbContent);
//		printOutput(outputs.get(0));
//		System.out.println(result);
		//END DEBUG
				
		//GET SOLUTION		
		if (result) {
			long startFormingSolution = System.nanoTime();
			Map<String, String> solMap = parseDrealOutput(outputs.get(0));
			for (PrimitiveElement obj: objs) {
				if(varMap.containsKey(obj)) {
					if (obj instanceof IntegerElement) {
						String varName = varMap.get(obj);
						String value = solMap.get(varName);
						sol.put(obj, Integer.parseInt(value));
					} else {
						String varName = varMap.get(obj);
						String value = solMap.get(varName);
						sol.put(obj, Double.parseDouble(value));
					}

				} else {
//					System.out.println(("variable " + obj + " is not used from Dreal");
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
		runProcess(stopDocker);
		//TODO Check if above went well?
	}

}
