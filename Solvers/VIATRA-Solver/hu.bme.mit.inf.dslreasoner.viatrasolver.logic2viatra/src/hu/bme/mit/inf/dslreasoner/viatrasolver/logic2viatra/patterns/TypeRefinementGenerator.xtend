package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns

import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.InverseRelationAssertion
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ContainmentHierarchy
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeAnalysisResult
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.HashMap
import java.util.LinkedHashMap
import java.util.Map
import org.eclipse.xtend.lib.annotations.Data

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

@Data
class ObjectCreationPrecondition {
	Relation containmentRelation
	Relation inverseContainment
	Type newType
}

abstract class TypeRefinementGenerator {
	val protected PatternGenerator base;
	public new(PatternGenerator base) {
		this.base = base
	}
	
	public def boolean requiresTypeAnalysis()
	public def CharSequence generateRefineObjectQueries(LogicProblem p, PartialInterpretation emptySolution, TypeAnalysisResult typeAnalysisResult)
	public def CharSequence generateRefineTypeQueries(LogicProblem p, PartialInterpretation emptySolution, TypeAnalysisResult typeAnalysisResult)
	public def Map<? extends Type, String> getRefineTypeQueryNames(LogicProblem p, PartialInterpretation emptySolution, TypeAnalysisResult typeAnalysisResult)
	
	public def getRefineObjectQueryNames(LogicProblem p, PartialInterpretation emptySolution, TypeAnalysisResult typeAnalysisResult) {
		val Map<ObjectCreationPrecondition,String> objectCreationQueries = new LinkedHashMap
		val containment = p.containmentHierarchies.head
		val inverseRelations = new HashMap
		p.annotations.filter(InverseRelationAssertion).forEach[
			inverseRelations.put(it.inverseA,it.inverseB)
			inverseRelations.put(it.inverseB,it.inverseA)
		]
		for(type: p.types.filter(TypeDeclaration).filter[!it.isAbstract]) {
			if(containment.typeInContainment(type)) {
				for(containmentRelation : containment.containmentRelations.filter[canBeContainedByRelation(it,type)]) {
					if(inverseRelations.containsKey(containmentRelation)) {
						objectCreationQueries.put(
							new ObjectCreationPrecondition(containmentRelation,inverseRelations.get(containmentRelation),type),
							this.patternName(containmentRelation,inverseRelations.get(containmentRelation),type))
					} else {
						objectCreationQueries.put(
							new ObjectCreationPrecondition(containmentRelation,null,type),
							patternName(containmentRelation,null,type))
					}
				}
				objectCreationQueries.put(
					new ObjectCreationPrecondition(null,null,type),
					patternName(null,null,type))
			} else {
				objectCreationQueries.put(
					new ObjectCreationPrecondition(null,null,type),
					this.patternName(null,null,type))
			}
		}
		return objectCreationQueries
	}
	
	protected def canBeContainedByRelation(Relation r, Type t) {
		if(r.parameters.size==2) {
			val param = r.parameters.get(1)
			if(param instanceof ComplexTypeReference) {
				val allSuperTypes = t.transitiveClosureStar[it.supertypes]
				for(superType : allSuperTypes) {
					if(param.referred == superType) return true
				}
			}
		}
		return false
	}
	
	private def typeInContainment(ContainmentHierarchy hierarchy, Type type) {
		val allSuperTypes = type.transitiveClosureStar[it.supertypes]
		return allSuperTypes.exists[hierarchy.typesOrderedInHierarchy.contains(it)]
	}
	
	protected def String patternName(Relation containmentRelation, Relation inverseContainment, Type newType) {
		if(containmentRelation !== null) {
			if(inverseContainment !== null) {
				'''createObject_«base.canonizeName(newType.name)»_by_«base.canonizeName(containmentRelation.name)»_with_«base.canonizeName(inverseContainment.name)»'''
			} else {
				'''createObject_«base.canonizeName(newType.name)»_by_«base.canonizeName(containmentRelation.name)»'''
			}
		} else {
			'''createObject_«base.canonizeName(newType.name)»'''
		}
	}
}