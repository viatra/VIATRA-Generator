package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransfomedViatraQuery
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.Modality
import java.util.Map
import org.eclipse.emf.common.util.Enumerator
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EReference
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey
import org.eclipse.viatra.query.runtime.matchers.psystem.PConstraint
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Inequality
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.BinaryTransitiveClosure
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class RelationDefinitionIndexer {
	val PatternGenerator base;
	
	new(PatternGenerator base) {
		this.base = base
	}
	
	def generateRelationDefinitions(
		LogicProblem problem,
		Iterable<RelationDefinition> relations,
		Map<String,PQuery> fqn2PQuery) {
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
	
	private def canonizeName(PVariable v) {
		return '''«IF v.referringConstraints.size == 1»_«ENDIF»var_«v.name.replaceAll("\\W","")»'''
	}
	
	private def transformPattern(RelationDefinition relation, PQuery p, Modality modality) {
		try {
		return '''
			private pattern «relationDefinitionName(relation,modality)»(
				problem:LogicProblem, interpretation:PartialInterpretation,
				«FOR param : p.parameters SEPARATOR ', '»var_«param.name»«ENDFOR»)
			«FOR body : p.disjunctBodies.bodies SEPARATOR "or"»{
				find interpretation(problem,interpretation);
				«FOR constraint : body.constraints»
					«constraint.transformConstraint(modality)»
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
	
	private def toMustMay(Modality modality) {
		if(modality == Modality::MAY) return Modality::MAY
		else return Modality::MUST
	} 
	
	def referPattern(PQuery p, String[] variables, Modality modality, boolean positive, boolean transitive) '''
		«IF !positive»neg «ENDIF»find «IF transitive»twoParam_«ENDIF»«modality.name.toLowerCase»InRelation_pattern_«p.fullyQualifiedName.replace('.','_')»«IF transitive»+«ENDIF»(«IF !transitive»problem,interpretation,«ENDIF»«variables.join(',')»);
	'''
	
	private dispatch def transformConstraint(TypeConstraint constraint, Modality modality) {
		val touple = constraint.variablesTuple
		if(touple.size == 1) {
			val inputKey = constraint.equivalentJudgement.inputKey
			if(inputKey instanceof EClassTransitiveInstancesKey) {
				return base.typeIndexer.referInstanceOf(inputKey.emfKey,modality.toMustMay,
					constraint.getVariableInTuple(0).canonizeName)
			} else if(inputKey instanceof EDataTypeInSlotsKey){
				return '''// type constraint is enforced by construction'''
			}
			
		} else if(touple.size == 2){
			val key = (constraint.equivalentJudgement.inputKey as EStructuralFeatureInstancesKey).emfKey
			if(key instanceof EReference) {
				return base.referRelationByName(
					key,
					constraint.getVariableInTuple(0).canonizeName,
					constraint.getVariableInTuple(1).canonizeName,
					modality.toMustMay)
			} else if (key instanceof EAttribute) {
				return base.referAttributeByName(key,
					constraint.getVariableInTuple(0).canonizeName,
					constraint.getVariableInTuple(1).canonizeName,
					modality.toMustMay)
			} else throw new UnsupportedOperationException('''unknown key: «key.class»''')
		} else {
			throw new UnsupportedOperationException('''Unsupported touple size: «touple.size»''')
		}
	}
	private dispatch def transformConstraint(TypeFilterConstraint constraint, Modality modality) {
		val touple = constraint.variablesTuple
		if(touple.size == 1) {
			val inputKey = constraint.equivalentJudgement.inputKey
			if(inputKey instanceof EClassTransitiveInstancesKey) {
				return base.typeIndexer.referInstanceOf(inputKey.emfKey,modality.toMustMay,
					(constraint.getVariablesTuple.get(0) as PVariable).canonizeName)
			} else if(inputKey instanceof EDataTypeInSlotsKey){
				return '''// type constraint is enforced by construction'''
			}
			
		} else if(touple.size == 2){
			val key = (constraint.equivalentJudgement.inputKey as EStructuralFeatureInstancesKey).emfKey
			if(key instanceof EReference) {
				return base.referRelationByName(
					key,
					(constraint.getVariablesTuple.get(0) as PVariable).canonizeName,
					(constraint.getVariablesTuple.get(1) as PVariable).canonizeName,
					modality.toMustMay)
			} else if (key instanceof EAttribute) {
				return base.referAttributeByName(key,
					(constraint.getVariablesTuple.get(0) as PVariable).canonizeName,
					(constraint.getVariablesTuple.get(1) as PVariable).canonizeName,
					modality.toMustMay)
			} else throw new UnsupportedOperationException('''unknown key: «key.class»''')
		} else {
			throw new UnsupportedOperationException('''Unsupported touple size: «touple.size»''')
		}
	}
	
	private dispatch def transformConstraint(Equality equality, Modality modality) {
		val a = equality.who
		val b = equality.withWhom
		transformEquality(modality.toMustMay, a, b)
	}
	
	private def CharSequence transformEquality(Modality modality, PVariable a, PVariable b) {
		if(modality.isMustOrCurrent) '''find mustEquivalent(problem, interpretation, «a.canonizeName», «b.canonizeName»);'''
		else '''find mayEquivalent(problem, interpretation, «a.canonizeName», «b.canonizeName»);'''
	}	
	
	private dispatch def transformConstraint(Inequality inequality, Modality modality) {
		val a = inequality.who
		val b = inequality.withWhom
		if(modality.isCurrent) {
			return '''neg find mustEquivalent(problem, interpretation, «a.canonizeName», «b.canonizeName»);'''
		} else if(modality.isMust) {
			return '''neg find mayEquivalent(problem, interpretation, «a.canonizeName», «b.canonizeName»);'''
		} else { // modality.isMay
			return '''neg find mustEquivalent(problem, interpretation, «a.canonizeName», «b.canonizeName»);'''
		}
	}
	
	private dispatch def transformConstraint(NegativePatternCall pcall, Modality modality) {
		val params = (0..<pcall.actualParametersTuple.size).map[index | 
			val variable = pcall.actualParametersTuple.get(index) as PVariable
			return variable.canonizeName
		]
		return referPattern(pcall.referredQuery,params,modality.dual,false,false)
	}
	
	private dispatch def transformConstraint(PositivePatternCall pcall, Modality modality) {
		val params = (0..<pcall.variablesTuple.size).map[index | 
			val variable = pcall.variablesTuple.get(index) as PVariable
			return variable.canonizeName
		]
		return referPattern(pcall.referredQuery,params,modality,true,false)
	}
	private dispatch def transformConstraint(BinaryTransitiveClosure pcall, Modality modality) {
		val params = (0..1).map[index | 
			val variable = pcall.getVariableInTuple(index) as PVariable
			return variable.canonizeName
		]
		return referPattern(pcall.referredQuery,params,modality,true,true)
	}
	private dispatch def transformConstraint(ExportedParameter e, Modality modality) {
		return '''// «e.parameterName» is exported'''
	}
	private dispatch def transformConstraint(ConstantValue c, Modality modality) {
		val target = c.supplierKey
		
		var String targetString;
		var String additionalDefinition;
		if(target instanceof EEnumLiteral) {
			targetString = '''const_«target.name»_«target.EEnum.name»'''
			additionalDefinition = '''DefinedElement.name(«targetString»,"«target.name» literal «target.EEnum.name»");  //LogicProblem.elements(problem,«targetString»);'''
		} else if(target instanceof Enumerator) {
			// XXX We should get the corresponding EEnum name instead of the java class name.
			targetString = '''const_«target.name»_«target.class.simpleName»'''
			additionalDefinition = '''DefinedElement.name(«targetString»,"«target.name» literal «target.class.simpleName»");  //LogicProblem.elements(problem,«targetString»);'''
		} else if(target instanceof Integer) {
			targetString = '''const_«target»_Integer'''
			additionalDefinition = '''IntegerElement.value(«targetString»,«target»);'''
		} else if(target instanceof Boolean) {
			targetString = '''const_«target»_Boolean'''
			additionalDefinition = '''BooleanElement.value(«targetString»,«target»);'''
		} else if(target instanceof String) {
			targetString = '''const_«target»_String'''
			additionalDefinition = '''StringElement.value(«targetString»,"«target»");'''
		} else if(target instanceof Double) {
			targetString = '''const_«target»_Number'''
			additionalDefinition = '''RealElement.value(«targetString»,"«target»");'''
		} else if(target instanceof Float) {
			targetString = '''const_«target»_Number'''
			additionalDefinition = '''RealElement.value(«targetString»,"«target»");'''
		} else {
			throw new UnsupportedOperationException('''Unknown constant type: «target.class»''')
		}
		
		val source = c.variablesTuple
		var String sourceName
		if(source.size == 1)
			sourceName = (source.get(0) as PVariable).canonizeName
		else throw new UnsupportedOperationException("unknown source")
		return '''«sourceName» == «targetString»;«additionalDefinition»''';
	}
	
	private dispatch def transformConstraint(PConstraint c, Modality modality) {
		throw new UnsupportedOperationException('''Unknown constraint type: "«c.class.name»"!''')
	}
}