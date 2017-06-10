package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import java.util.Collection
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery
import java.util.Map
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.Modality

class ContainmentIndexer {
	val PatternGenerator base;
	
	new(PatternGenerator base) {
		this.base = base
	}
	
	def isContainmentRelation(Relation relation, LogicProblem problem) {
		problem.containmentHierarchies.exists[it.containmentRelations.contains(relation)]
	}
	
	def transformContainment(LogicProblem problem, Collection<Relation> relations,Map<String,PQuery> fqn2PQuery)
	'''
	private pattern mustContains2(source: DefinedElement, target: DefinedElement) {
		find mustContains4(_,_,source,target);
	}
		
	private pattern mustContains4(problem:LogicProblem, interpretation:PartialInterpretation,
		source: DefinedElement, target: DefinedElement)
		«FOR reference : relations.filter[isContainmentRelation(problem)] SEPARATOR 'or\n'»
		{ «base.referRelation(reference,"source","target",Modality.MUST,fqn2PQuery)» }
		«ENDFOR»
	
	private pattern mustTransitiveContains(source,target) {
		find mustContains2+(source,target);
	}
	'''
	def referMustContaint(String source, String target)  
		'''find mustContains4(problem,interpretation,«source»,«target»);'''
	def referTransitiveMustContains(String source, String target)
		'''find mustTransitiveContains(source,target);'''
}
