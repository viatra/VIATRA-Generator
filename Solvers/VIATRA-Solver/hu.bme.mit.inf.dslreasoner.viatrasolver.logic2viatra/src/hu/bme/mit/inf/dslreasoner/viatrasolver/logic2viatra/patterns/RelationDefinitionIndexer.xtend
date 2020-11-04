package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransfomedViatraQuery
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.Modality
import java.util.Map
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.BinaryTransitiveClosure
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PDisjunction
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class RelationDefinitionIndexer {
	public val PatternGenerator base;
	val PConstraintTransformer constraintTransformer;
	
	new(PatternGenerator base) {
		this.base = base
		this.constraintTransformer = new PConstraintTransformer(this);
	}
	
	def generateRelationDefinitions(
		LogicProblem problem,
		Iterable<RelationDefinition> relations,
		Map<String,PQuery> fqn2PQuery)
	{
		val relation2PQuery = relations.toInvertedMap[
			annotations.filter(TransfomedViatraQuery).head.patternFullyQualifiedName.lookup(fqn2PQuery)
		]
		
		return '''
		«FOR relation : relations»
			// Must, May and Current queries for «relation.name»
			«relation.transformPattern(relation.lookup(relation2PQuery), Modality.MUST)»
			«relation.transformPattern(relation.lookup(relation2PQuery), Modality.MAY)»
			«relation.transformPattern(relation.lookup(relation2PQuery), Modality.CURRENT)»
			«IF fqn2PQuery.values.relationDefinitionIsUsedInTransitiveClosure(relation.lookup(relation2PQuery))»
				«relation.transformPatternWithTwoParameters(relation.lookup(relation2PQuery), Modality.MUST)»
				«relation.transformPatternWithTwoParameters(relation.lookup(relation2PQuery), Modality.MAY)»
				«relation.transformPatternWithTwoParameters(relation.lookup(relation2PQuery), Modality.CURRENT)»
			«ENDIF»
		«ENDFOR»
		'''
	}
	
	private def relationDefinitionIsUsedInTransitiveClosure(Iterable<PQuery> all, PQuery r) {
		all.exists[
			it.disjunctBodies.bodies.exists[
				it.constraints.exists[
					val constraint = it
					if(constraint instanceof BinaryTransitiveClosure) {
						return constraint.referredQuery === r
					} else {
						return false
					}
				]
			]
		]
	}
	
	def String relationDefinitionName(RelationDefinition relation, Modality modality)
		'''«modality.name.toLowerCase»InRelation_«base.canonizeName(relation.name)»'''
	
	def canonizeName(PVariable v) {
		return '''«IF v.referringConstraints.size == 1»_«ENDIF»var_«v.name.replaceAll("\\W","")»'''
	}
	
	private def transformPattern(RelationDefinition relation, PQuery p, Modality modality) {
		try {
		val bodies = (relation.annotations.filter(TransfomedViatraQuery).head.optimizedDisjunction as PDisjunction).bodies
		return '''
			private pattern «relationDefinitionName(relation,modality)»(
				problem:LogicProblem, interpretation:PartialInterpretation,
				«FOR param : p.parameters SEPARATOR ', '»var_«param.name»«ENDFOR»)
			«FOR body : bodies SEPARATOR "or"»{
				find interpretation(problem,interpretation);
				«FOR constraint : body.constraints»
					«this.constraintTransformer.transformConstraint(constraint,modality,relation.annotations.filter(TransfomedViatraQuery).head.variableTrace)»
				«ENDFOR»
			}«ENDFOR»
		'''
		} catch(UnsupportedOperationException e) {
			e.printStackTrace
			throw new UnsupportedOperationException('''Can not transform pattern "«p.fullyQualifiedName»"! Reason: «e.message»''',e)
		}
	}
	private def transformPatternWithTwoParameters(RelationDefinition relation, PQuery p, Modality modality) {
		return '''
			private pattern twoParam_«relationDefinitionName(relation,modality)»(«FOR param : p.parameters SEPARATOR ', '»var_«param.name»«ENDFOR») {
				find «relationDefinitionName(relation,modality)»(_,_,«FOR param : p.parameters SEPARATOR ', '»var_«param.name»«ENDFOR»);
			}
		'''
	}
	
	def toMustMay(Modality modality) {
		if(modality == Modality::MAY) return Modality::MAY
		else return Modality::MUST
	} 
	
	def referPattern(PQuery p, String[] variables, Modality modality, boolean positive, boolean transitive) '''
		«IF !positive»neg «ENDIF»find «IF transitive»twoParam_«ENDIF»«modality.name.toLowerCase»InRelation_pattern_«p.fullyQualifiedName.replace('.','_')»«IF transitive»+«ENDIF»(«IF !transitive»problem,interpretation,«ENDIF»«variables.join(',')»);
	'''
}