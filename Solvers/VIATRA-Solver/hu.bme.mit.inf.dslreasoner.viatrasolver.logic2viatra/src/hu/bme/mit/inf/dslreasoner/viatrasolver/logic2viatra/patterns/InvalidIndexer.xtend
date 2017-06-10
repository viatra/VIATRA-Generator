package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransformedViatraWellformednessConstraint
import java.util.Map
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.lookup
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
import java.util.LinkedHashMap
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.Modality

class InvalidIndexer {
	val PatternGenerator patternGenerator
	
	public new(PatternGenerator patternGenerator) {
		this.patternGenerator = patternGenerator
	}
	
	public def getWFQueryName(RelationDefinition query) '''invalidWFQuery_«patternGenerator.canonizeName(query.name)»'''
	
	public def generateInvalidatedByWfQueries(LogicProblem problem, Map<String,PQuery> fqn2PQuery) {
		val wfQueries = problem.assertions.map[it.annotations]
			.flatten
			.filter(TransformedViatraWellformednessConstraint)
			.map[it.query]
		'''
		«FOR wfQuery: wfQueries»
			pattern invalidatedBy_«patternGenerator.canonizeName(wfQuery.target.name)»(problem:LogicProblem, interpretation:PartialInterpretation,
				«FOR param : wfQuery.patternFullyQualifiedName.lookup(fqn2PQuery).parameters SEPARATOR ', '»var_«param.name»«ENDFOR»)
			{
				«patternGenerator.relationDefinitionIndexer.referPattern(
					wfQuery.patternFullyQualifiedName.lookup(fqn2PQuery),
					wfQuery.patternFullyQualifiedName.lookup(fqn2PQuery).parameters.map['''var_«it.name»'''],
					Modality.MUST,
					true,false)»
			}
		«ENDFOR»
		'''
	}
	
	public def getInvalidateByWfQueryNames(LogicProblem problem) {
		val wfQueries = problem.assertions.map[it.annotations]
			.flatten
			.filter(TransformedViatraWellformednessConstraint)
			.map[it.query]
		val map = new LinkedHashMap
		for(wfQuery : wfQueries) {
			map.put(wfQuery.target, '''invalidatedBy_«patternGenerator.canonizeName(wfQuery.target.name)»''')
		}
		return map
	}
}
