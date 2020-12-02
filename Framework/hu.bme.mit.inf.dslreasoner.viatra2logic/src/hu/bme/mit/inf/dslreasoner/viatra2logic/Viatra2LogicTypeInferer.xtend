package hu.bme.mit.inf.dslreasoner.viatra2logic

import com.google.inject.Injector
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicProblemBuilder
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IntTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.PrimitiveTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RealTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup
import org.eclipse.viatra.query.runtime.emf.EMFQueryMetaContext
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey
import org.eclipse.viatra.query.runtime.emf.types.EClassUnscopedTransitiveInstancesKey
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey
import org.eclipse.viatra.query.runtime.matchers.context.IInputKey
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey
import org.eclipse.viatra.query.runtime.matchers.planning.helpers.TypeHelper
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.AggregatorConstraint
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.PatternCallBasedDeferred
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.PatternMatchCounter
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.typesystem.IBatchTypeResolver
import org.eclipse.xtext.xbase.typesystem.references.UnknownTypeReference

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class Viatra2LogicTypeInferer {
	val Ecore2Logic ecore2Logic
	val extension LogicProblemBuilder builder = new LogicProblemBuilder
	/**Typeresolver uses the same resolver as EMFPatternLanguageStandaloneSetup.*/
	val IBatchTypeResolver typeResolver
	val expressionExtractor = new XExpressionExtractor

	new(Ecore2Logic ecore2Logic, Injector injector) {
		this.ecore2Logic = ecore2Logic
		val selectedInjector = injector ?:
			new EMFPatternLanguageStandaloneSetup().createStandaloneInjectorWithSeparateModules
		this.typeResolver = selectedInjector.getInstance(IBatchTypeResolver)
	}

	new(Ecore2Logic ecore2Logic) {
		this(ecore2Logic, null)
	}

	def Viatra2LogicTypeResult inferTypes(List<PQuery> pQueries,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace, Viatra2LogicTrace viatra2LogicTrace) {
		val Viatra2LogicTypeResult result = new Viatra2LogicTypeResult(new HashMap, new HashMap);
		for (query : pQueries) {
			for (body : query.lookup(viatra2LogicTrace.query2Disjunction).bodies) {
				for (variable : body.uniqueVariables) {
					getOrMakeTypeDecision(result, variable, body, ecore2LogicTrace, viatra2LogicTrace, emptySet)
				}
			}
			for (parameter : query.parameters) {
				getOrMakeTypeDecision(result, query, parameter, ecore2LogicTrace, viatra2LogicTrace, emptySet)
			}
		}
		return result
	}

	private def TypeReference getOrMakeTypeDecision(Viatra2LogicTypeResult result, PVariable variable, PBody body,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace, Viatra2LogicTrace viatra2LogicTrace,
		Set<? extends PParameter> checkedInDecisionMaking) {
		if (result.containsSolution(body, variable)) {
			return result.getType(body, variable)
		} else {
			val inferredTypesByViatra = TypeHelper::inferUnaryTypesFor(body.uniqueVariables, body.constraints,
				EMFQueryMetaContext.DEFAULT)
			val constraintsForVariable = variable.lookup(inferredTypesByViatra)

			val typeConstraintsDerivedByTypeHelper = constraintsForVariable.map [
				transformTypeReference(ecore2LogicTrace)
			]
			val typesFromEval = variable.getTypesFromEval(typeResolver)
			val typesFromAggregatorResult = variable.
				getTypeFromPassivePatternCallConstraintResult(result, ecore2LogicTrace, viatra2LogicTrace,
					checkedInDecisionMaking)

			val typesFromPositiveReasoning = (typeConstraintsDerivedByTypeHelper + typesFromEval +
				typesFromAggregatorResult).filterNull

			val types = if (!typesFromPositiveReasoning.empty) {
					typesFromPositiveReasoning
				} else {
					variable.getTypeFromPassivePatternCallConstraints(result, ecore2LogicTrace, viatra2LogicTrace,
						checkedInDecisionMaking)
				}

			val commonSubtype = this.calculateCommonSubtype(types)

			result.addType(body, variable, commonSubtype)
			return commonSubtype
		}
	}

	private def TypeReference getOrMakeTypeDecision(Viatra2LogicTypeResult result, PQuery query, PParameter parameter,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace, Viatra2LogicTrace viatra2LogicTrace,
		Set<? extends PParameter> checkedInDecisionMaking) {
		if (checkedInDecisionMaking.contains(parameter)) {
			return null
		}
		if (result.containsSolution(parameter)) {
			return result.getType(query, parameter)
		}

		var TypeReference typeReference;

		if (parameter.declaredUnaryType !== null) {
			val key = parameter.declaredUnaryType
			typeReference = key.transformTypeReference(ecore2LogicTrace)
		} else {
			val bodies = query.lookup(viatra2LogicTrace.query2Disjunction).bodies
			val newChecked = new HashSet(checkedInDecisionMaking) => [add(parameter)]
			val Iterable<TypeReference> variableTypes = bodies.map [ body |
				val symbolicParameter = body.symbolicParameters.filter[patternParameter === parameter].head
				val variable = symbolicParameter.parameterVariable
				getOrMakeTypeDecision(result, variable, body, ecore2LogicTrace, viatra2LogicTrace, newChecked)
			]
			typeReference = calculateCommonSupertype(variableTypes)
		}
		result.addType(query, parameter, typeReference)
		return typeReference
	}

	private def Iterable<? extends TypeReference> getTypesFromEval(PVariable v, IBatchTypeResolver typeResolver) {
		val constraints = v.getReferringConstraintsOfType(
			typeof(ExpressionEvaluation)
		).filter [
			it.outputVariable === v
		]
		val res = constraints.map[getTypeFromEval]
		return res
	}

	def TypeReference getTypeFromEval(ExpressionEvaluation evaluation) {
		val XExpression expression = expressionExtractor.extractExpression(evaluation.evaluator)
		val returnType = typeResolver.resolveTypes(expression).getReturnType(expression);
		if (returnType === null || returnType instanceof UnknownTypeReference) {
			return null
		} else {
			val javaIdentifier = returnType.wrapperTypeIfPrimitive.javaIdentifier
			if (javaIdentifier == Boolean.name) {
				return LogicBool
			} else if (javaIdentifier == Integer.name || javaIdentifier == Short.name) {
				return LogicInt
			} else if (javaIdentifier == Double.name || javaIdentifier == Float.name) {
				return LogicReal
			} else if (javaIdentifier == String.name) {
				return LogicString
			} else {
				throw new UnsupportedOperationException('''Unsupported eval type: "«javaIdentifier»"!''')
			}
		}
	}

	private def getTypeFromPassivePatternCallConstraintResult(
		PVariable v,
		Viatra2LogicTypeResult result,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,
		Set<? extends PParameter> checkedInDecisionMaking
	) {
		val referringConstraints = v.referringConstraints

		val referringCountMatcherTargeting = referringConstraints.filter(PatternMatchCounter).filter [
			it.resultVariable === v
		].map[builder.LogicInt]
		val referringAggregatorConstraintsTargeting = referringConstraints.filter(AggregatorConstraint).filter [
			it.resultVariable === v
		].map [ // get the type of the referred column
			getOrMakeTypeDecision(result, it.referredQuery, it.referredQuery.parameters.get(aggregatedColumn),
				ecore2LogicTrace, viatra2LogicTrace, checkedInDecisionMaking)
		]

		return referringCountMatcherTargeting + referringAggregatorConstraintsTargeting
	}

	private def getTypeFromPassivePatternCallConstraints(
		PVariable v,
		Viatra2LogicTypeResult result,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,
		Set<? extends PParameter> checkedInDecisionMaking
	) {
		val referringConstraints = v.referringConstraints
		if (referringConstraints.size === 1) {
			val onlyConstraint = referringConstraints.head

			if (onlyConstraint instanceof PatternCallBasedDeferred) {
				val indexOfVariable = v.lookup(onlyConstraint.actualParametersTuple.invertIndex)
				val parameter = onlyConstraint.referredQuery.parameters.get(indexOfVariable)
				val res = getOrMakeTypeDecision(result, onlyConstraint.referredQuery, parameter, ecore2LogicTrace,
					viatra2LogicTrace, checkedInDecisionMaking)
				return #[res]
			} else {
				throw new IllegalArgumentException('''A non-PatternCallBasedDeferred type constraint is referring to the variable "«v.name»"!''')
			}
		} else {
			throw new IllegalArgumentException('''Multiple («referringConstraints.size», «FOR c : referringConstraints SEPARATOR ", "»«c»«ENDFOR») constraints are referring to variable "«v.name»", but no type is inferred!''')
		}
	}

	def TypeReference calculateCommonSubtype(Iterable<TypeReference> types) {
		val primitiveTypeReferences = types.filter(PrimitiveTypeReference)
		val complexTypeReferences = types.filter(ComplexTypeReference)
		if (complexTypeReferences.isEmpty) {
			// If there is an int type, ...
			if (primitiveTypeReferences.exists[it instanceof IntTypeReference]) {
				// ... and all types are either real or int, then return int!
				if (primitiveTypeReferences.forall[it instanceof RealTypeReference || it instanceof IntTypeReference]) {
					return primitiveTypeReferences.filter(IntTypeReference).head
				} // Otherwise, the types are inconsistent, because they mixing numeric and non-numeric types.
				else
					throw new IllegalArgumentException('''Inconsistent types: «primitiveTypeReferences.map[eClass.name].toSet.toList»''')
			}
			// If there is no Real, then the types should be homogenious
			val head = primitiveTypeReferences.head
			if (primitiveTypeReferences.exists[it.eClass !== head.eClass]) {
				throw new IllegalArgumentException('''Inconsistent types: «primitiveTypeReferences.map[eClass.name].toSet.toList»''')
			}
			return head
		} else if (primitiveTypeReferences.isEmpty) {
			val complexTypes = complexTypeReferences.map[it.referred].toSet
			if (complexTypes.size === 1) {
				return builder.toTypeReference(complexTypes.head)
			}
			// Collect possible subtypes
			val subtypeSets = complexTypes.map[it.transitiveClosureStar[it.subtypes].toSet]
			val commonTypeSet = new HashSet(subtypeSets.head)
			val otherSets = subtypeSets.tail
			for (otherSet : otherSets) {
				commonTypeSet.retainAll(otherSet)
			}
			if (commonTypeSet.empty) {
				throw new IllegalArgumentException('''Inconsistent types: «complexTypes.map[name].toList»''')
			}

			return calculateCommonComplexSupertype(commonTypeSet)

		} else {
			throw new IllegalArgumentException('''
			Inconsistent types, mixing primitive and complex types:
				«primitiveTypeReferences.map[eClass.name].toSet.toList»
					and
				«complexTypeReferences.map[it.referred].toSet.map[name].toList»''')

		}
	}

	def TypeReference calculateCommonSupertype(Iterable<TypeReference> types) {
		val primitiveTypeReferences = types.filter(PrimitiveTypeReference)
		val complexTypeReferences = types.filter(ComplexTypeReference)
		if (complexTypeReferences.isEmpty) {
			// If there is a real type, ...
			if (primitiveTypeReferences.exists[it instanceof RealTypeReference]) {
				// ... and all types are either real or int, then return real!
				if (primitiveTypeReferences.forall[it instanceof RealTypeReference || it instanceof IntTypeReference]) {
					return primitiveTypeReferences.filter(RealTypeReference).head
				} // Otherwise, the types are inconsistent, because they mixing numeric and non-numeric types.
				else
					throw new IllegalArgumentException('''Inconsistent types: «primitiveTypeReferences.map[eClass.name].toSet.toList»''')
			}
			// If there is no Real, then the types should be homogenious
			val head = primitiveTypeReferences.head
			if (primitiveTypeReferences.exists[it.eClass !== head.eClass]) {
				throw new IllegalArgumentException('''Inconsistent types: «primitiveTypeReferences.map[eClass.name].toSet.toList»''')
			}
			return head
		} else if (primitiveTypeReferences.isEmpty) {
			val complexTypes = complexTypeReferences.map[it.referred].toSet
			return calculateCommonComplexSupertype(complexTypes)

		} else {
			throw new IllegalArgumentException('''
			Inconsistent types, mixing primitive and complex types:
				«primitiveTypeReferences.map[eClass.name].toSet.toList»
					and
				«complexTypeReferences.map[it.referred].toSet.map[name].toList»''')

		}
	}

	def TypeReference calculateCommonComplexSupertype(Set<Type> complexTypes) {
		if (complexTypes.size === 1) {
			return builder.toTypeReference(complexTypes.head)
		}
		// Collect possible supertypes
		val supertypeSets = complexTypes.map[it.transitiveClosureStar[it.supertypes].toSet]
		val commonTypeSet = new HashSet(supertypeSets.head)
		val otherSets = supertypeSets.tail
		for (otherSet : otherSets) {
			commonTypeSet.retainAll(otherSet)
		}
		if (commonTypeSet.empty) {
			throw new IllegalArgumentException('''Inconsistent types: «complexTypes.map[name].toList»''')
		}
		// Remove type that already have covered
		val coveredTypes = commonTypeSet.map[it.supertypes].flatten
		commonTypeSet.removeAll(coveredTypes)
		return builder.toTypeReference(commonTypeSet.head)
	}

	/**
	 * Transforms a Viatra type reference to a logic type.
	 */
	def dispatch TypeReference transformTypeReference(EDataTypeInSlotsKey k,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace) {
		val w = k.wrappedKey
		if (w == EcorePackage.Literals.EINT || w == EcorePackage.Literals.ESHORT || w == EcorePackage.Literals.ELONG) {
			return builder.LogicInt
		} else if (w == EcorePackage.Literals.EDOUBLE || w == EcorePackage.Literals.EFLOAT) {
			return builder.LogicReal
		} else if (w == EcorePackage.Literals.EBOOLEAN) {
			return builder.LogicBool
		} else if (w == EcorePackage.Literals.ESTRING) {
			return builder.LogicString
		} else if (w instanceof EEnum) {
			val c = this.ecore2Logic.TypeofEEnum(ecore2LogicTrace.trace, w)
			return builder.toTypeReference(c);
		} else
			throw new UnsupportedOperationException('''Unknown reference type «w.class.name»''')
	}

	def dispatch TypeReference transformTypeReference(JavaTransitiveInstancesKey k,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace) {
		val c = k.wrapperInstanceClass
		if (c == Integer || c == Long || c == Short) {
			return LogicInt
		} else if (c == Float || c == Double) {
			return LogicReal
		} else if (c == Boolean) {
			return LogicBool
		} else if (c == String) {
			return LogicString
		} else if (c.superclass == Enum) {
			val enums = ecore2Logic.allEnumsInScope(ecore2LogicTrace.trace)
			for (enum : enums) {
				if (c == enum.instanceClass) {
					return builder.toTypeReference(ecore2Logic.TypeofEEnum(ecore2LogicTrace.trace, enum))
				}
			}
			throw new IllegalArgumentException('''Enum type «c.simpleName» is not mapped to logic!''')
		} else {
			return null
		}
	}

	def dispatch TypeReference transformTypeReference(EClassTransitiveInstancesKey k,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace) {
		val c = k.wrappedKey

		if (this.ecore2Logic.allClassesInScope(ecore2LogicTrace.trace).toList.contains(c)) {
			return builder.toTypeReference(this.ecore2Logic.TypeofEClass(ecore2LogicTrace.trace, k.wrappedKey))
		} else {
			return null
		}
	}

	def dispatch TypeReference transformTypeReference(EClassUnscopedTransitiveInstancesKey k,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace) {
		val c = k.wrappedKey

		if (this.ecore2Logic.allClassesInScope(ecore2LogicTrace.trace).toList.contains(c)) {
			return builder.toTypeReference(this.ecore2Logic.TypeofEClass(ecore2LogicTrace.trace, k.wrappedKey))
		} else {
			return null
		}
	}

	def dispatch TypeReference transformTypeReference(IInputKey k,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace) {
		throw new IllegalArgumentException('''Unsupported type: «k.class.simpleName»''')
	}
}
