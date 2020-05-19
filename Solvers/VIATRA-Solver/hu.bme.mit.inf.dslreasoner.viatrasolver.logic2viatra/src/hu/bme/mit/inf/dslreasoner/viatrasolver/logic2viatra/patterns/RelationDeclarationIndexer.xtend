package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns

import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.UpperMultiplicityAssertion
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.Modality
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class RelationDeclarationIndexer {
	val PatternGenerator base;
	
	new(PatternGenerator base) {
		this.base = base
	}
	
	public def generateRelationIndexers(LogicProblem problem, Iterable<RelationDeclaration> relations, Map<String,PQuery> fqn2PQuery) {
		val upperMultiplicities = new HashMap
		problem.annotations.filter(UpperMultiplicityAssertion).forEach[
			upperMultiplicities.put(it.relation,it.upper)
		]
		
		return '''
		«FOR relation : relations»
			«IF base.isDerived(relation)»
				«generateDerivedMustRelation(problem,relation,base.getDerivedDefinition(relation).patternFullyQualifiedName.lookup(fqn2PQuery))»
				«generateDerivedMayRelation(problem,relation,base.getDerivedDefinition(relation).patternFullyQualifiedName.lookup(fqn2PQuery))»
			«ELSE»
				«generateMustRelation(problem,relation)»
				«generateMayRelation(problem,relation,upperMultiplicities,base.getContainments(problem),base.getInverseRelations(problem),fqn2PQuery)»
			«ENDIF»
		«ENDFOR»
		'''
	}
	
	def private patternName(RelationDeclaration r, Modality modality) {
		'''«modality.name.toLowerCase»InRelation«base.canonizeName(r.name)»'''
	}
	
	public def referRelation(
		RelationDeclaration referred,
		String sourceVariable,
		String targetVariable,
		Modality modality)
	'''find «referred.patternName(modality)»(problem,interpretation,«sourceVariable»,«targetVariable»);'''
	
	def generateMustRelation(LogicProblem problem, RelationDeclaration relation) '''
		/**
		 * Matcher for detecting tuples t where []«relation.name»(source,target)
		 */
		private pattern «relation.patternName(Modality.MUST)»(
			problem:LogicProblem, interpretation:PartialInterpretation,
			source: DefinedElement, target:DefinedElement)
		{
			find interpretation(problem,interpretation);
			PartialInterpretation.partialrelationinterpretation(interpretation,relationIterpretation);
			PartialRelationInterpretation.interpretationOf.name(relationIterpretation,"«relation.name»");
			PartialRelationInterpretation.relationlinks(relationIterpretation,link);
			BinaryElementRelationLink.param1(link,source);
			BinaryElementRelationLink.param2(link,target);
		}
	'''
	def generateMayRelation(LogicProblem problem, RelationDeclaration relation,
		Map<Relation, Integer> upperMultiplicities,
		List<Relation> containments,
		HashMap<Relation, Relation> inverseRelations,
		Map<String,PQuery> fqn2PQuery)
	{
		return '''
		/**
		 * Matcher for detecting tuples t where <>«relation.name»(source,target)
		 */
		private pattern «relation.patternName(Modality.MAY)»(
			problem:LogicProblem, interpretation:PartialInterpretation,
			source: DefinedElement, target:DefinedElement)
		{
			find interpretation(problem,interpretation);
			// The two endpoint of the link have to exist
			find mayExist(problem, interpretation, source);
			find mayExist(problem, interpretation, target);
			// Type consistency
			«base.typeIndexer.referInstanceOfByReference(relation.parameters.get(0),Modality.MAY,"source")»
			«base.typeIndexer.referInstanceOfByReference(relation.parameters.get(1),Modality.MAY,"target")»
			«IF upperMultiplicities.containsKey(relation)»
				// There are "numberOfExistingReferences" currently existing instances of the reference from the source,
				// the upper bound of the multiplicity should be considered.
				numberOfExistingReferences == count «referRelation(relation,"source","_",Modality.MUST)»
				numberOfExistingReferences != «upperMultiplicities.get(relation)»;
			«ENDIF»
			«IF inverseRelations.containsKey(relation) && upperMultiplicities.containsKey(inverseRelations.get(relation))»
				// There are "numberOfExistingReferences" currently existing instances of the reference to the target,
				// the upper bound of the opposite reference multiplicity should be considered.
				numberOfExistingOppositeReferences == count «base.referRelation(inverseRelations.get(relation),"target","_",Modality.MUST,fqn2PQuery)»
				numberOfExistingOppositeReferences != «upperMultiplicities.get(inverseRelations.get(relation))»;
			«ENDIF»
			«IF containments.contains(relation)»
				// The reference is containment, then a new reference cannot be create if:
				// 1. Multiple parents
				neg «base.containmentIndexer.referMustContaint("_","target")»
				// 2. Circle in the containment hierarchy
				neg «base.containmentIndexer.referTransitiveMustContains("target","source")»
			«ENDIF»
			«IF inverseRelations.containsKey(relation) && containments.contains(inverseRelations.get(relation))»
				// The eOpposite of the reference is containment, then a referene cannot be created if
				// 1. Multiple parents
				neg «base.containmentIndexer.referMustContaint("source","_")»
				// 2. Circle in the containment hierarchy
				neg «base.containmentIndexer.referTransitiveMustContains("source","target")»
			«ENDIF»
		} or {
			«relation.referRelation("source","target",Modality.MUST)»
		}
	'''
	}
	
	def generateDerivedMustRelation(LogicProblem problem, RelationDeclaration relation, PQuery definition) '''
		/**
		 * Matcher for detecting tuples t where []«relation.name»(source,target)
		 */
		 private pattern «relation.patternName(Modality.MUST)»(
		 	problem:LogicProblem, interpretation:PartialInterpretation,
		 	source: DefinedElement, target:DefinedElement)
		 {
		 	«base.relationDefinitionIndexer.referPattern(definition,#["source","target"],Modality::MUST,true,false)»
		 }
	'''
	def generateDerivedMayRelation(LogicProblem problem, RelationDeclaration relation, PQuery definition) '''
		/**
		 * Matcher for detecting tuples t where []«relation.name»(source,target)
		 */
		 private pattern «relation.patternName(Modality.MAY)»(
		 	problem:LogicProblem, interpretation:PartialInterpretation,
		 	source: DefinedElement, target:DefinedElement)
		 {
		 	«base.relationDefinitionIndexer.referPattern(definition,#["source","target"],Modality::MAY,true,false)»
		 }
	'''
}