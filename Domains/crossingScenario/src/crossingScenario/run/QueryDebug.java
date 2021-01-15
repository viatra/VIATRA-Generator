package crossingScenario.run;

public class QueryDebug {

//	public static void main(String[] args) {
//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( ).put("*", new XMIResourceFactoryImpl());
//		EPackage.Registry.INSTANCE.put(CrossingScenarioPackage.eNS_URI, CrossingScenarioPackage.eINSTANCE);
//		ResourceSet rs = new ResourceSetImpl();
//		rs.getResource(URI.createFileURI("outputs/models/1.xmi"), true);
//		
//		ViatraQueryEngine engine = ViatraQueryEngine.on(new EMFScope(rs));		
//		// Access pattern matcher
//		
//		
//		
//		CrossingScenarioQueries.instance().prepare(engine);
//		Define_numWidth_medium.Matcher matcher = Define_numWidth_medium.Matcher.on(engine);
//		// Get and iterate over all matches
//		System.out.println("MATCHES:");
//		for (Define_numWidth_medium.Match match : matcher.getAllMatches()) {
//			// Print all the matches to the standard output
//			System.out.println(match.getL());
//		}
//	}
	
	
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
	
	
//	public static void main(String[] args) {
//		ArrayList<String> out = new ArrayList<String>();
//		out.add("delta-sat with delta = 0.001");
//		out.add("w1602659765 : [1.797693134862315708e+308, 1.797693134862315708e+308]");
//		String s = "1.797693134862315708e+308";
//		
//		System.out.println(parseDrealOutput(out));
//		
//	}
//	
//	private static Map<String, String> parseDrealOutput(List<String> output) {
//		Map<String, String> res = new HashMap<String, String>();
//		String re = "(\\w+) : \\[([0-9\\+-.e]+), ([0-9\\+-.e]+)\\]";
////		String re = "(\\w+) : \\[(.*), (.*)\\]";
//		Pattern p = Pattern.compile(re);
//		for (String varVal : output) {
//		    Matcher m = p.matcher(varVal);
//		    if (m.matches()) {
//		        String name = m.group(1);
//		        String lowerB = m.group(2);
//		        String upperB = m.group(2);
//		        res.put(name, lowerB);
//		    }
//		}
//		return res;
//	}
}
