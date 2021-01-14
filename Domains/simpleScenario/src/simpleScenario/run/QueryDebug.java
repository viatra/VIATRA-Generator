package simpleScenario.run;

public class QueryDebug {
//	public static void main(String[] args) {
//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap( ).put("*", new XMIResourceFactoryImpl());
//		EPackage.Registry.INSTANCE.put(SimpleScenarioPackage.eNS_URI, SimpleScenarioPackage.eINSTANCE);
//		ResourceSet rs = new ResourceSetImpl();
//		rs.getResource(URI.createFileURI("inputs/sample.xmi"), true);
//		
//		ViatraQueryEngine engine = ViatraQueryEngine.on(new EMFScope(rs));		
//		// Access pattern matcher
//		
//		
//		
//		SimpleScenarioQueries.instance().prepare(engine);
//		RefSpec.Matcher matcher = RefSpec.Matcher.on(engine);
//		// Get and iterate over all matches
//		for (RefSpec.Match match : matcher.getAllMatches()) {
//			// Print all the matches to the standard output
//			System.out.println(match.getL());
//		}
//	}
	
	public static void main(String[] args) {
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
//		rs.getResource(URI.createFileURI("inputs/partial-int.xmi"), true);
//		
//		ViatraQueryEngine engine = ViatraQueryEngine.on(new EMFScope(rs));		
//		// Access pattern matcher
//		
//		
//		
//		LogProb.instance().prepare(engine);
//		// Get and iterate over all matches
//		System.out.println("UPMUST:");
//		for (UPMUSTPropagateConstraint0_pattern_queries_refSpec.Match match : 
//			UPMUSTPropagateConstraint0_pattern_queries_refSpec.Matcher.on(engine).getAllMatches()) {
//			// Print all the matches to the standard output
//			System.out.println(match.getVar_l());
//		}
//		
//		System.out.println("mustIn:");
//		for (MustInRelationreferenceCoord_attribute_Lane.Match match : 
//			MustInRelationreferenceCoord_attribute_Lane.Matcher.on(engine).getAllMatches()) {
//			// Print all the matches to the standard output
//			DefinedElement de = match.getTarget();			
//			System.out.println(de);
//			System.out.println("--set?:  " + ((PrimitiveElement) de).isValueSet());
//			System.out.println("--val?:  " + ((IntegerElement) de).getValue());
//			
//		}
//		
//		System.out.println("interp:");
//		for (Interpretation.Match match : 
//			Interpretation.Matcher.on(engine).getAllMatches()) {
//			// Print all the matches to the standard output
//			System.out.println(match.getProblem());
//		}
	}
}
