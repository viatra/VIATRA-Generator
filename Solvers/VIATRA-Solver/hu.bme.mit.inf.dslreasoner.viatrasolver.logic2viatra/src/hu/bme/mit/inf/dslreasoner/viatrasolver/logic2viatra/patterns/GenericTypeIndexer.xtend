package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.Modality
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeAnalysisResult

class GenericTypeIndexer extends TypeIndexer {
	new(PatternGenerator base) {
		super(base)
	}

	override requiresTypeAnalysis() { false }

	override getRequiredQueries() '''
		«super.requiredQueries»
		
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
			// 5. element is not primitive datatype
			neg find isPrimitive(element);
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
			// 5. element is not primitive datatype
			neg find isPrimitive(element);
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
		
		private pattern scopeDisallowsNewElementsFromType(typeInterpretation:PartialComplexTypeInterpretation) {
			Scope.targetTypeInterpretation(scope,typeInterpretation);
			Scope.maxNewElements(scope,0);
		}
	'''

	protected override generateMayInstanceOf(LogicProblem problem, Type type, TypeAnalysisResult typeAnalysisResult) {
		'''
			/**
			 * An element may be an instance of type "«type.name»".
			 */
			private pattern «patternName(type,Modality.MAY)»(problem:LogicProblem, interpretation:PartialInterpretation, element:DefinedElement) {
				Type.name(type,"«type.name»");
				find possibleDynamicType(problem,interpretation,dynamic,element);
				find supertypeStar(dynamic,type);
				neg find scopeDisallowsNewElementsFromType(dynamic);
			}
		'''
	}
}
