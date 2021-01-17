package crossingScenario.run;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import crossingScenario.Actor;
import crossingScenario.CrossingScenario;
import crossingScenario.CrossingScenarioPackage;
import crossingScenario.Lane;

public class QueryDebug {
	public static void main(String[] args) throws FileNotFoundException {
		checkPrevLanes("outputs/models/1.xmi", "outputs/simplePrevLane.tgf");
//		testOnInstance();
//		miniRETest("21/2");
	}
	
	public static void checkPrevLanes(String pathSrc, String pathTgt) throws FileNotFoundException {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( ).put("*", new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(CrossingScenarioPackage.eNS_URI, CrossingScenarioPackage.eINSTANCE);
		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.getResource(URI.createFileURI(pathSrc), true);
		
		PrintWriter printer = new PrintWriter(pathTgt);
		
		CrossingScenario cs = ((CrossingScenario) res.getContents().get(0));
		
		for (Actor o : cs.getActors()) {
			String nodeName = "(" + o.getXPos()+","+o.getYPos() + ")";
			printer.println(o.hashCode() + " " + nodeName);
		}
		
		for (Lane o : cs.getLanes()) {
			String prefix = "";
			if (cs.getHorizontal_head().equals(o) || cs.getVertical_head().equals(o)) {
				prefix = "HEAD";
			}
			String nodeName = prefix + "(" + o.getReferenceCoord() + ")" + 
					o.eClass().getName().substring(5, 9);
			printer.println(o.hashCode() + " " + nodeName);
		}
		printer.println("#");
		for (Lane o : cs.getLanes()) {
			if (o.getPrevLane() != null){
				int curName = o.hashCode();
				int curPrev = o.getPrevLane().hashCode();
				double edgeLabel = o.getPrevLane().getNumWidth();
				printer.println(curName + " " + curPrev + " " + edgeLabel);
			}
		}
		
		for (Actor o : cs.getActors()) {
			int actName = o.hashCode();
			int lanName = o.getPlacedOn().hashCode();
			printer.println(actName + " " + lanName );
		}
		
		printer.flush();
		printer.close();
		System.out.println("TGF CREATED");
		
	}

	public static void testOnInstance() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( ).put("*", new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(CrossingScenarioPackage.eNS_URI, CrossingScenarioPackage.eINSTANCE);
		ResourceSet rs = new ResourceSetImpl();
		rs.getResource(URI.createFileURI("outputs/models/1.xmi"), true);
		
//		ViatraQueryEngine engine = ViatraQueryEngine.on(new EMFScope(rs));		
//		// Access pattern matcher
//		CrossingScenarioQueries.instance().prepare(engine);
//		
//		Define_referenceCoord_laneWithPrevHasCorrectRefCoord.Matcher matcher = Define_referenceCoord_laneWithPrevHasCorrectRefCoord.Matcher.on(engine);
//		// Get and iterate over all matches
//		System.out.println("MATCHES:");
//		for (Define_referenceCoord_laneWithPrevHasCorrectRefCoord.Match match : matcher.getAllMatches()) {
//			// Print all the matches to the standard output
//			System.out.println(match.getL());
//		}
	}
	
	
//	public static void main(String[] args) {
//		//Add xmi resource
//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( ).put("*", new XMIResourceFactoryImpl());
//		//Add required EPackages
////		EPackage.Registry.INSTANCE.put(SimpleScenarioPackage.eNS_URI, SimpleScenarioPackage.eINSTANCE);
//		EPackage.Registry.INSTANCE.put(LogiclanguagePackage.eNS_URI, LogiclanguagePackage.eINSTANCE);
//		EPackage.Registry.INSTANCE.put(LogicproblemPackage.eNS_URI, LogicproblemPackage.eINSTANCE);
//		EPackage.Registry.INSTANCE.put(PartialinterpretationPackage.eNS_URI, PartialinterpretationPackage.eINSTANCE);
//		EPackage.Registry.INSTANCE.put(Ecore2logicannotationsPackage.eNS_URI, Ecore2logicannotationsPackage.eINSTANCE);
//		EPackage.Registry.INSTANCE.put(Partial2logicannotationsPackage.eNS_URI, Partial2logicannotationsPackage.eINSTANCE);
//		EPackage.Registry.INSTANCE.put(Viatra2LogicAnnotationsPackage.eNS_URI, Viatra2LogicAnnotationsPackage.eINSTANCE);
//		EPackage.Registry.INSTANCE.put(LogicresultPackage.eNS_URI, LogicresultPackage.eINSTANCE);
//		
//		//Get res
//		ResourceSet rs = new ResourceSetImpl();
//		rs.getResource(URI.createFileURI("inputs/Debug/state000000019.xmi"), true);
//		
//		ViatraQueryEngine engine = ViatraQueryEngine.on(new EMFScope(rs));		
//		// Access pattern matcher
//		
//		
//		
//		LogProb.instance().prepare(engine);
//		// Get and iterate over all matches
//		System.out.println("UPMUST:");
//		for (UPMUSTPropagateConstraint1_pattern_queries_define_numWidth_small1.Match match : 
//			UPMUSTPropagateConstraint1_pattern_queries_define_numWidth_small1.Matcher.on(engine).getAllMatches()) {
//			// Print all the matches to the standard output
//			System.out.println(match.getVar_l());
//		}
//		
//		System.out.println("mustIn1:");
//		for (MustInRelationwidth_attribute_Lane.Match match : 
//			MustInRelationwidth_attribute_Lane.Matcher.on(engine).getAllMatches()) {
//			// Print all the matches to the standard output
//			DefinedElement de = match.getTarget();			
//			System.out.println(de);
//			System.out.println("--name?:  " + de.getName());
////			System.out.println("--val?:  " + de.getName());
//		}
//		
//		System.out.println("mustIn2:");
//		for (MustInRelationnumWidth_attribute_Lane.Match match : 
//			MustInRelationnumWidth_attribute_Lane.Matcher.on(engine).getAllMatches()) {
//			// Print all the matches to the standard output
//			DefinedElement de = match.getTarget();			
//			System.out.println(de);
//			System.out.println("--set?:  " + ((PrimitiveElement) de).isValueSet());
//			System.out.println("--val?:  " + ((RealElement) de).getValue());
//		}
//		
//		System.out.println("interp:");
//		for (Interpretation.Match match : 
//			Interpretation.Matcher.on(engine).getAllMatches()) {
//			// Print all the matches to the standard output
//			System.out.println(match.getProblem());
//		}
//	}
	
	
	public static void testParsing() {
		ArrayList<String> out = new ArrayList<String>();
		out.add("delta-sat with delta = 0.001");
		out.add("rc1601644608 : [1.797693134862315708e+308, 1.797693134862315708e+308]");
		out.add("nw1149275723 : [12.49949999999999939, 12.50050000000000061]");
		out.add("nw157857530 : [7.499500000000000277, 7.500499999999999723]");
		out.add("nw1521058274 : [12.49949999999999939, 12.50050000000000061]");
		String s = "1.797693134862315708e+308";
		
		System.out.println(parseDrealOutput(out));
		
	}
	
	private static Map<String, String> parseDrealOutput(List<String> output) {
		Map<String, String> res = new HashMap<String, String>();
		String re = "(\\w+) : \\[([0-9\\+-.e]+), ([0-9\\+-.e]+)\\]";
//		String re = "(\\w+) : \\[(.*), (.*)\\]";
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
	
	public static void miniRETest(String in) {
		Double oSol = 0.0;
		String re = "([0-9]+)/([0-9]+)";
		Pattern p = Pattern.compile(re);
		Matcher ma = p.matcher(in);
		if (ma.matches()) {
			int numerator = Integer.parseInt(ma.group(1));
			int denominator = Integer.parseInt(ma.group(2));
			oSol = (double) numerator / denominator;
			System.out.println(oSol);
		} else {
			System.err.println("Problem converting string: " + in);
		}
	}

}
