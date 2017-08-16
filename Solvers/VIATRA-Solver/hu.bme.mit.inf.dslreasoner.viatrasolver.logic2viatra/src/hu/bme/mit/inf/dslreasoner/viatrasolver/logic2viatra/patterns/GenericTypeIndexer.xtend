package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import org.eclipse.emf.ecore.EClass
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.Modality
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeAnalysisResult

class GenericTypeIndexer extends TypeIndexer {
	val PatternGenerator base;
	
	new(PatternGenerator base) {
		this.base = base
	}
	override requiresTypeAnalysis() { false }
	
	public override getRequiredQueries() '''
	private pattern newELement(interpretation: PartialInterpretation, element: DefinedElement) {
		PartialInterpretation.newElements(interpretation,element);
	}
	
	private pattern typeInterpretation(problem:LogicProblem, interpetation:PartialInterpretation, type:TypeDeclaration, typeInterpretation:PartialTypeInterpratation) {
		find interpretation(problem,interpetation);
		LogicProblem.types(problem,type);
		PartialInterpretation.partialtypeinterpratation(interpetation,typeInterpretation);
		PartialTypeInterpratation.interpretationOf(typeInterpretation,type);
	}
	
	private pattern directInstanceOf(problem:LogicProblem, interpetation:PartialInterpretation, element:DefinedElement, type:Type) {
		find interpretation(problem,interpetation);
		find mustExist(problem,interpetation,element);
		LogicProblem.types(problem,type);
		TypeDefinition.elements(type,element);
	} or {
		find mustExist(problem,interpetation,element);
		find typeInterpretation(problem,interpetation,type,typeInterpretation);
		PartialTypeInterpratation.elements(typeInterpretation,element);
	}
	
	/**
	 * Direct supertypes of a type.
	 */
	private pattern supertypeDirect(subtype : Type, supertype : Type) {
		Type.supertypes(subtype, supertype);
	}
	
	/**
	 * All supertypes of a type.
	 */
	private pattern supertypeStar(subtype: Type, supertype: Type) {
		subtype == supertype;
	} or {
		find supertypeDirect+(subtype,supertype);
	}
	
	/// Complex type reasoning patterns ///
	//
	// In a valid type system, for each element e there is exactly one type T where
	// 1: T(e) - but we dont know this for type declaration
	// 2: For the dynamic type D and another type T, where D(e) && D-->T, T(e) is true.
	// 2e: A type hierarchy is invalid, if there is a supertype T for a dynamic type D which does no contains e:
	//     D(e) && D-->T && !T(e)
	// 3: There is no T' that T'->T and T'(e)
	// 3e: A type hierarcy is invalid, if there is a type T for a dynamic type D, which contains e, but not subtype of T:
	//    D(e) && ![T--->D] && T(e)
	// 4: T is not abstract
	// Such type T is called Dynamic type of e, while other types are called static types.
	// 
	// The following patterns checks the possible dynamic types for an element
	
	private pattern wellformedType(problem: LogicProblem, interpretation:PartialInterpretation, dynamic:Type, element:DefinedElement) {
		// 1: T(e)
		find directInstanceOf(problem,interpretation,element,dynamic);
		// 2e is not true: D(e) && D-->T && !T(e)
		neg find dynamicTypeNotSubtypeOfADefinition(problem,interpretation,element,dynamic);
		// 3e is not true: D(e) && ![T--->D] && T(e)
		neg find dynamicTypeIsSubtypeOfANonDefinition(problem,interpretation,element,dynamic);
		// 4: T is not abstract
		Type.isAbstract(dynamic,false);
	}
	
	private pattern possibleDynamicType(problem: LogicProblem, interpretation:PartialInterpretation, dynamic:Type, element:DefinedElement)
	// case 1: element is defined at least once
	{
		LogicProblem.types(problem,dynamic);
		// select a random definition 'randomType'
		find directInstanceOf(problem,interpretation,element,randomType);
		// dynamic is a subtype of 'randomType'
		find supertypeStar(dynamic,randomType);
		// 2e is not true: D(e) && D-->T && !T(e)
		neg find dynamicTypeNotSubtypeOfADefinition(problem,interpretation,element,dynamic);
		// 3e is not true: D(e) && ![T--->D] && T(e)
		neg find dynamicTypeIsSubtypeOfANonDefinition(problem,interpretation,element,dynamic);
		// 4: T is not abstract
		Type.isAbstract(dynamic,false);
	} or
	// case 2: element is not defined anywhere
	{
		find mayExist(problem,interpretation,element);
		// there is no definition
		neg find directInstanceOf(problem,interpretation,element,_);
		// 2e is not true: D(e) && D-->T && !T(e)
		// because non of the definition contains element, the type cannot have defined supertype
		LogicProblem.types(problem,dynamic);
		PartialInterpretation.problem(interpretation,problem);
		neg find typeWithDefinedSupertype(dynamic);
		// 3e is not true: D(e) && ![T--->D] && T(e)
		// because there is no definition, dynamic covers all definition
		// 4: T is not abstract
		Type.isAbstract(dynamic,false);
	}
	
	/**
	 * supertype -------> element <------- otherSupertype
	 *     A                                     A
	 *     |                                     |
	 * wrongDynamic -----------------------------X
	 */
	private pattern dynamicTypeNotSubtypeOfADefinition(problem:LogicProblem, interpretation:PartialInterpretation, element:DefinedElement, wrongDynamic : Type) {
		find directInstanceOf(problem,interpretation,element,supertype);
		find directInstanceOf(problem,interpretation,element,otherSupertype);
		find supertypeStar(wrongDynamic,supertype);
		neg find supertypeStar(wrongDynamic,otherSupertype);
	}
	
	/**
	 * supertype -------> element <---X--- otherSupertype
	 *     A                                     A
	 *     |                                     |
	 * wrongDynamic -----------------------------+
	 */
	private pattern dynamicTypeIsSubtypeOfANonDefinition(problem: LogicProblem, interpretation:PartialInterpretation, element:DefinedElement, wrongDynamic:Type) {
		find directInstanceOf(problem,interpretation,element,supertype);
		neg find elementInTypeDefinition(element,otherSupertype);
		TypeDefinition(otherSupertype);
		find supertypeStar(wrongDynamic, supertype);
		find supertypeStar(wrongDynamic, otherSupertype);
	}
	
	private pattern elementInTypeDefinition(element:DefinedElement, definition:TypeDefinition) {
		TypeDefinition.elements(definition,element);
	}
	
	private pattern typeWithDefinedSupertype(type:Type) {
		find supertypeStar(type,definedSupertype);
		TypeDefinition(definedSupertype);
	}
	'''
	
	public override generateInstanceOfQueries(LogicProblem problem, PartialInterpretation emptySolution,TypeAnalysisResult typeAnalysisResult) {
		'''
		«FOR type:problem.types»
			«problem.generateMustInstenceOf(type)»
			«problem.generateMayInstanceOf(type)»
		«ENDFOR»
		'''
	}
	
	private def patternName(Type type, Modality modality)
		'''«modality.toString.toLowerCase»InstanceOf«base.canonizeName(type.name)»'''
	
	private def generateMustInstenceOf(LogicProblem problem, Type type) {
		'''
		/**
		 * An element must be an instance of type "«type.name»".
		 */
		private pattern «patternName(type,Modality.MUST)»(problem:LogicProblem, interpretation:PartialInterpretation, element:DefinedElement) {
			Type.name(type,"«type.name»");
			find directInstanceOf(problem,interpretation,element,type);
		}
		'''
	}
	
	private def generateMayInstanceOf(LogicProblem problem, Type type) {
		'''
		/**
		 * An element may be an instance of type "«type.name»".
		 */
		private pattern «patternName(type,Modality.MAY)»(problem:LogicProblem, interpretation:PartialInterpretation, element:DefinedElement) {
			Type.name(type,"«type.name»");
			find possibleDynamicType(problem,interpretation,dynamic,element);
			find supertypeStar(dynamic,type);
		}
		'''
	}
	
	public override referInstanceOf(Type type, Modality modality, String variableName) {
		'''find «patternName(type,modality)»(problem,interpretation,«variableName»);'''
	}
	public override referInstanceOf(EClass type, Modality modality, String variableName) {
		'''find «modality.toString.toLowerCase»InstanceOf«base.canonizeName('''«type.name» class''')»(problem,interpretation,«variableName»);'''
	}
}