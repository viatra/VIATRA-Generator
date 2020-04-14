package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns

import hu.bme.mit.inf.dslreasoner.viatra2logic.XExpressionExtractor
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.Modality
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Inequality
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.BinaryTransitiveClosure
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint

class PConstraintTransformer {
	val extension RelationDefinitionIndexer relationDefinitionIndexer;
	val expressionExtractor = new XExpressionExtractor
	
	new(RelationDefinitionIndexer relationDefinitionIndexer) {
		this.relationDefinitionIndexer = relationDefinitionIndexer
	}
	
	dispatch def transformConstraint(TypeConstraint constraint, Modality modality) {
		val touple = constraint.variablesTuple
		if(touple.size == 1) {
			val inputKey = constraint.equivalentJudgement.inputKey
			if(inputKey instanceof EClassTransitiveInstancesKey) {
				return relationDefinitionIndexer.base.typeIndexer.referInstanceOf(inputKey.emfKey,modality.toMustMay,
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
	dispatch def transformConstraint(TypeFilterConstraint constraint, Modality modality) {
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
	
	dispatch def transformConstraint(Equality equality, Modality modality) {
		val a = equality.who
		val b = equality.withWhom
		transformEquality(modality.toMustMay, a, b)
	}
	
	private def CharSequence transformEquality(Modality modality, PVariable a, PVariable b) {
		if(modality.isMustOrCurrent) '''find mustEquivalent(problem, interpretation, «a.canonizeName», «b.canonizeName»);'''
		else '''find mayEquivalent(problem, interpretation, «a.canonizeName», «b.canonizeName»);'''
	}	
	
	dispatch def transformConstraint(Inequality inequality, Modality modality) {
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
	
	dispatch def transformConstraint(NegativePatternCall pcall, Modality modality) {
		val params = (0..<pcall.actualParametersTuple.size).map[index | 
			val variable = pcall.actualParametersTuple.get(index) as PVariable
			return variable.canonizeName
		]
		return referPattern(pcall.referredQuery,params,modality.dual,false,false)
	}
	
	dispatch def transformConstraint(PositivePatternCall pcall, Modality modality) {
		val params = (0..<pcall.variablesTuple.size).map[index | 
			val variable = pcall.variablesTuple.get(index) as PVariable
			return variable.canonizeName
		]
		return referPattern(pcall.referredQuery,params,modality,true,false)
	}
	dispatch def transformConstraint(BinaryTransitiveClosure pcall, Modality modality) {
		val params = (0..1).map[index | 
			val variable = pcall.getVariableInTuple(index) as PVariable
			return variable.canonizeName
		]
		return referPattern(pcall.referredQuery,params,modality,true,true)
	}
	dispatch def transformConstraint(ExportedParameter e, Modality modality) {
		return '''// «e.parameterName» is exported'''
	}
	dispatch def transformConstraint(ConstantValue c, Modality modality) {
		val target = c.supplierKey
		
		var String targetString;
		var String additionalDefinition;
		if(target instanceof EEnumLiteral) {
			targetString = '''const_«target.name»_«target.EEnum.name»'''
			additionalDefinition = '''DefinedElement.name(«targetString»,"«target.name» «target.EEnum.name»");  //LogicProblem.elements(problem,«targetString»);'''
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
	
	
	
	dispatch def transformConstrait(ExpressionEvaluation e, Modality modality) {
		if(e.outputVariable!==null) {
			throw new UnsupportedOperationException('''Only check expressions are supported "«e.class.name»"!''')
		} else {
			val expression = expressionExtractor.extractExpression(e.evaluator)
			if(modality.isMust) {
				return ''''''
			} else if(modality.isMay) {
				return ''''''
			}
		}
	}
	
	dispatch def transformConstraint(PConstraint c, Modality modality) {
		throw new UnsupportedOperationException('''Unknown constraint type: "«c.class.name»"!''')
	}
}