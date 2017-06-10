package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra

import org.eclipse.xtend.lib.annotations.Data
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import java.util.List
import java.util.Map
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.queries.NewElementTypeConstructorMatcher
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.queries.NewElementTypeRefinementTargetMatcher
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.queries.NewElementTypeRefinementNegativeConstraintMatcher
import java.util.ArrayList
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.queries.DontHaveDefinedSupertypeMatcher
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.queries.NewElementMayTypeNegativeConstraintMatcher

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
		val negativeMatcher = NewElementTypeRefinementNegativeConstraintMatcher.on(viatraEngine)
		
		val possibleNewDynamicTypes =  NewElementTypeConstructorMatcher.on(viatraEngine).allValuesOftype
		
		val possibleNewTypeRefinementTargets = NewElementTypeRefinementTargetMatcher.on(viatraEngine).allValuesOfrefined
		val possibleNewTypeRefinements = new ArrayList
		for(possibleNewTypeRefinementTarget : possibleNewTypeRefinementTargets) {
			val inhibitorTypes = negativeMatcher.getAllValuesOfinhibitor(possibleNewTypeRefinementTarget)
			possibleNewTypeRefinements += new TypeRefinementPrecondition(
				possibleNewTypeRefinementTarget,
				inhibitorTypes.toList)
		}
		
		val possibleTypes = DontHaveDefinedSupertypeMatcher.on(viatraEngine).allValuesOftype
		val newElementMayTypeMatcher = NewElementMayTypeNegativeConstraintMatcher.on(viatraEngine)
		
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