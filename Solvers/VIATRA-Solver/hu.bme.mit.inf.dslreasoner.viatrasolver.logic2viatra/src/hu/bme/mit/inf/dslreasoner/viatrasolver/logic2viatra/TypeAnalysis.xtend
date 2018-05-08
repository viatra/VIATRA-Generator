package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.queries.DontHaveDefinedSupertype
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.queries.NewElementMayTypeNegativeConstraint
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.queries.NewElementTypeConstructor
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.queries.NewElementTypeRefinementNegativeConstraint
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.queries.NewElementTypeRefinementTarget
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.ArrayList
import java.util.List
import java.util.Map
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope
import org.eclipse.xtend.lib.annotations.Data

@Data class TypeRefinementPrecondition {
	Type targetType
	List<? extends Type> inhibitorTypes
}

/**
 * Collection of all possible element creation and type refinement rules for defined and undefined elements.
 */
@Data class TypeAnalysisResult {
	/////////////////
	// New elements
	/////////////////
	/**
	 * New elements can be created using with the following types.
	 */
	List<? extends Type> possibleNewDynamicTypes
	/**
	 * <b>(A,B)</b> in <b>possibleNewTypeRefinements</b>: a new element <b>x</b> can be refined to A <=> <b>x</b> has all types listed in B.
	 */
	List<TypeRefinementPrecondition> possibleNewTypeRefinements
	/**
	 * A new element may have type A if it already has types 
	 */
	Map<? extends Type,TypeRefinementPrecondition> mayNewTypePreconditions
	
	/////////////////
	// Old elements
	/////////////////
	
	/**
	 * <b>(A,B)</b> in <b>possibleNewTypeRefinements</b>: a new element <b>x</b> can be refined to A <=> <b>x</b> has all types listed in B.
	 */
	Map<DefinedElement,TypeRefinementPrecondition> possibleOldTypeRefinements
	/**
	 * A new element may have type A if it already has types 
	 */
	Map<? extends Type,Map<DefinedElement,TypeRefinementPrecondition>> mayOldTypePreconditions
}

class TypeAnalysis {
	
	def TypeAnalysisResult performTypeAnalysis(LogicProblem problem, PartialInterpretation interpretation) {
		val viatraEngine = ViatraQueryEngine.on(new EMFScope(problem))
		val negativeMatcher = NewElementTypeRefinementNegativeConstraint.Matcher.on(viatraEngine)
		
		val possibleNewDynamicTypes =  NewElementTypeConstructor.Matcher.on(viatraEngine).allValuesOftype
		
		val possibleNewTypeRefinementTargets = NewElementTypeRefinementTarget.Matcher.on(viatraEngine).allValuesOfrefined
		val possibleNewTypeRefinements = new ArrayList
		for(possibleNewTypeRefinementTarget : possibleNewTypeRefinementTargets) {
			val inhibitorTypes = negativeMatcher.getAllValuesOfinhibitor(possibleNewTypeRefinementTarget)
			possibleNewTypeRefinements += new TypeRefinementPrecondition(
				possibleNewTypeRefinementTarget,
				inhibitorTypes.toList)
		}
		
		val possibleTypes = DontHaveDefinedSupertype.Matcher.on(viatraEngine).allValuesOftype
		val newElementMayTypeMatcher = NewElementMayTypeNegativeConstraint.Matcher.on(viatraEngine)
		
		val mayNewTypePreconditions = possibleTypes.toInvertedMap[type | 
			val inhibitorTypes = newElementMayTypeMatcher.getAllValuesOfinhibitor(type as TypeDeclaration)
			return new TypeRefinementPrecondition(type,inhibitorTypes.toList)
		]
		
		return new TypeAnalysisResult(
			possibleNewDynamicTypes.toList,
			possibleNewTypeRefinements,
			mayNewTypePreconditions,
			emptyMap,
			emptyMap
		)
	}
}