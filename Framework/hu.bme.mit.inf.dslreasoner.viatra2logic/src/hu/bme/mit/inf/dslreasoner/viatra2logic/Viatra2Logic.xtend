package hu.bme.mit.inf.dslreasoner.viatra2logic

import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicProblemBuilder
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.PrimitiveTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransfomedViatraQuery
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsFactory
import java.util.ArrayList
import java.util.HashMap
import java.util.HashSet
import java.util.LinkedList
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.emf.EMFQueryMetaContext
import org.eclipse.viatra.query.runtime.emf.types.BaseEMFTypeKey
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey
import org.eclipse.viatra.query.runtime.matchers.context.IInputKey
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey
import org.eclipse.viatra.query.runtime.matchers.planning.helpers.TypeHelper
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery
import org.eclipse.viatra.query.runtime.matchers.psystem.rewriters.PBodyNormalizer
import org.eclipse.xtend.lib.annotations.Data

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PDisjunction
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.viatra.query.runtime.emf.types.EClassUnscopedTransitiveInstancesKey

@Data class ViatraQuerySetDescriptor {
	val List<? extends IQuerySpecification<?>> patterns
	val Set<? extends IQuerySpecification<?>> validationPatterns
	val Map<IQuerySpecification<?>,EStructuralFeature> derivedFeatures
}
class Viatra2LogicTrace {
	public val Map<PQuery, PDisjunction> query2Disjunction = new HashMap
	public val Map<PQuery, RelationDefinition> query2Relation = new HashMap
	public val Map<PQuery, TransfomedViatraQuery> query2Annotation = new HashMap
	public val Map<Pair<PQuery,PParameter>, Variable> parameter2Variable = new HashMap
	//public val Map<PVariable, Variable> variable2Variable = new HashMap
}
class Viatra2LogicConfiguration {
	public var normalize = true
	public var transitiveClosureDepth = 3
}

class  Viatra2Logic {
	val extension LogicProblemBuilder builder = new LogicProblemBuilder
	val extension Viatra2LogicAnnotationsFactory factory = Viatra2LogicAnnotationsFactory.eINSTANCE
	val normalizer = new PBodyNormalizer(EMFQueryMetaContext.DEFAULT)
	
	val Ecore2Logic ecore2Logic
	Constraint2Logic constraint2Logic
	
	new(Ecore2Logic ecore2Logic) {
		this.ecore2Logic = ecore2Logic
		constraint2Logic = new Constraint2Logic(ecore2Logic)
	}
	
	def TracedOutput<LogicProblem,Viatra2LogicTrace> transformQueries(
		ViatraQuerySetDescriptor queries,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicConfiguration config)
	{
		val viatra2LogicTrace = new Viatra2LogicTrace
		val typeAlanysis = new HashMap
		val pQueries = queries.patterns.map[it.internalQueryRepresentation]
		
		for(query: pQueries) {			
			val disjunction = normalizer.rewrite(query)
			viatra2LogicTrace.query2Disjunction.put(query,disjunction)
		}
		
		for(query: pQueries) {
			val types = query.lookup(viatra2LogicTrace.query2Disjunction).bodies.toInvertedMap[
				TypeHelper::inferUnaryTypesFor(it.uniqueVariables,it.constraints,EMFQueryMetaContext.DEFAULT)
			]
//			for(m : types.values) {
//				for(n: m.entrySet) {
//					val variable = n.key
//					println(''' - «variable.name»''')
//					for(type : n.value) {
//						println('''«variable.name» - «type»''')
//					}
//				}
//				
//			}
			
			typeAlanysis.put(query,types)
		}
		
		for(query: pQueries) {
			try {
				this.transformQueryHeader(query,query.lookup(typeAlanysis),ecore2LogicTrace,viatra2LogicTrace,config)
			} catch(IllegalArgumentException e) {
				throw new IllegalArgumentException('''
					Unable to translate query "«query.fullyQualifiedName»".
					Reason: «e.class.simpleName», «e.message»''',e)
			}
		}
		for(query: pQueries) {
			try {
				this.transformQuerySpecification(query,query.lookup(typeAlanysis),ecore2LogicTrace,viatra2LogicTrace,config)
			} catch (IllegalArgumentException e){
				throw new IllegalArgumentException('''
					Unable to translate query "«query.fullyQualifiedName»".
					Reason: «e.class.simpleName», «e.message»''',e)
			}
		}
		/*for(d : viatra2LogicTrace.query2Relation.values) {
			checkDefinition(d)
		}*/
		
		transformQueryConstraints(
			queries.validationPatterns.map[internalQueryRepresentation],
			queries.derivedFeatures,
			ecore2LogicTrace,viatra2LogicTrace)
		return new TracedOutput(ecore2LogicTrace.output,viatra2LogicTrace)
	}
	
	def protected transformQueryHeader(
		PQuery pquery,
		Map<PBody, Map<PVariable, Set<IInputKey>>> types,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,
		Viatra2LogicConfiguration config)
	{
		val relationName = '''pattern «pquery.fullyQualifiedName.replace('.',' ')»'''		
		val parameters = new ArrayList<Variable>(pquery.parameters.size)
		for(vParam: pquery.parameters) {
			val parameterName = '''parameter «vParam.name»'''
			val parameterType = getType(vParam,types,ecore2LogicTrace)
			if(parameterType === null) {
				throw new AssertionError('''null type for parameter «vParam.name» in pattern «pquery.fullyQualifiedName»''')
			}
			val lParam = createVar(parameterName,parameterType)
			viatra2LogicTrace.parameter2Variable.put(pquery->vParam,lParam)
			parameters+=lParam
		}
		val lRelation = RelationDefinition(relationName,parameters,null)
		
		viatra2LogicTrace.query2Relation.put(pquery,lRelation);
		ecore2LogicTrace.output.relations += lRelation
		
		val annotation = createTransfomedViatraQuery => [
			it.target = lRelation
			it.patternFullyQualifiedName = pquery.fullyQualifiedName
			it.patternPQuery = pquery
		]
		viatra2LogicTrace.query2Annotation.put(pquery,annotation)
		ecore2LogicTrace.output.annotations += annotation
		
		return lRelation
	}
	
	def protected transformQuerySpecification(
		PQuery pquery,
		Map<PBody, Map<PVariable, Set<IInputKey>>> types,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,
		Viatra2LogicConfiguration config)
	{
		val disjunction = pquery.lookup(viatra2LogicTrace.query2Disjunction)
	
		val translatedBodies = new ArrayList(disjunction.bodies.size)
		for(body : disjunction.bodies) {
			translatedBodies+=body.transformBody(types,ecore2LogicTrace,viatra2LogicTrace,config)
		}
		val relation = pquery.lookup(viatra2LogicTrace.query2Relation)
		relation.value = Or(translatedBodies)
	}
	
	def transformQueryConstraints(
		Iterable<PQuery> validationPatterns,
		Map<IQuerySpecification<?>,EStructuralFeature> derivedFeatures,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace)
	{
		for(pquery : validationPatterns) {
			val targetRelation = pquery.lookup(viatra2LogicTrace.query2Relation)
			val constraint = Assertion('''errorpattern «pquery.fullyQualifiedName.replace('.',' ')»''',
				Forall[
					for(param: targetRelation.parameters) {
						addVar('''p«targetRelation.parameters.indexOf(param)»''',
							EcoreUtil::copy(param))
					}
					Not(targetRelation.call(it.variables))
				]
			)
			val annotation = createTransformedViatraWellformednessConstraint => [
				it.query = pquery.lookup(viatra2LogicTrace.query2Annotation)
				it.target = constraint
			]
			ecore2LogicTrace.output.add(constraint)
			ecore2LogicTrace.output.annotations.add(annotation)
		}
		for(derivedFeature : derivedFeatures.entrySet) {
			val relationDefinition = derivedFeature.key.internalQueryRepresentation.lookup(viatra2LogicTrace.query2Relation)
			val feature = derivedFeature.value
			if(feature instanceof EAttribute) {
				val declaration = ecore2Logic.relationOfAttribute(ecore2LogicTrace.trace,feature)
				relationDefinition.defines = declaration
			} else if(feature instanceof EReference) {
				val declaration = ecore2Logic.relationOfReference(ecore2LogicTrace.trace,feature)
				relationDefinition.defines = declaration
			} else throw new IllegalArgumentException('''Unknown feature: «feature»''')
			val annotation = createDefinedByDerivedFeature => [
				it.target = relationDefinition.defines
				it.query = derivedFeature.key.internalQueryRepresentation.lookup(viatra2LogicTrace.query2Annotation)
			]
			ecore2LogicTrace.output.annotations+=annotation
		}
	}
	
	def transformBody(PBody body,
		Map<PBody, Map<PVariable, Set<IInputKey>>> types,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,
		Viatra2LogicConfiguration config)
	{
		val variable2Variable = new HashMap
		// Parameter variables
		for(parameter : body.symbolicParameters) {
			val param = parameter.patternParameter
			val variable = parameter.parameterVariable
			variable2Variable.put(variable,(body.pattern->param).lookup(viatra2LogicTrace.parameter2Variable))
		}
		// Inner Variables
		val innerPositiveVariables = new LinkedList
		val innerNegativeVariables = new LinkedList
		for(innerVariable : body.uniqueVariables) {
			
			if(!variable2Variable.containsKey(innerVariable)) {
				val name = '''variable «innerVariable.name.normalizeName»'''
				//println(body.pattern.fullyQualifiedName + "-")
				val logicType = getType(innerVariable,types,ecore2LogicTrace)
				val logicVariable = createVar(name,logicType)
				if(innerVariable.isPositiveVariable) {
					innerPositiveVariables += logicVariable
				} else {
					innerNegativeVariables += logicVariable
				}
				variable2Variable.put(innerVariable,logicVariable)
			}
		}
		
		val translatedConstraints = body.constraints.map[
			constraint2Logic.transformConstraint(it,
				ecore2LogicTrace,viatra2LogicTrace,variable2Variable,config)
		].filterNull
		val allConstraintIsSatisfied = And(translatedConstraints)
		val allNegativeVariablesAreSatisfied = if(innerNegativeVariables.empty) {
			allConstraintIsSatisfied
		} else {
			Forall(innerNegativeVariables,allConstraintIsSatisfied);
		}
		val allVariablesAreExisting = if(innerPositiveVariables.empty) {
			allNegativeVariablesAreSatisfied
		} else {
			Exists(innerPositiveVariables,allNegativeVariablesAreSatisfied);
		}
		
		return allVariablesAreExisting
	}
//	def toTypeJudgement(PVariable v, IInputKey key) {
//		new TypeJudgement(key,new Tuple1)
//	}
	
	def private normalizeName(String variableName) {
		return variableName.replaceAll("[\\W]|_", "")
	}
	
	/**
	 * Translates the type of a parameter variable in a pattern
	 */
	def TypeReference getType(PParameter v, Map<PBody, Map<PVariable, Set<IInputKey>>> types, TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace) {
		// If parameter type is specified then the specified type is used
		if(v.declaredUnaryType !== null) {
			return transformTypeReference(v.declaredUnaryType,ecore2LogicTrace)
		}
		// Otherwise, calculate the type based on the type of the variable in the bodies
		else {
			val bodies = types.keySet
			val typesFromBodies = new ArrayList(bodies.size)
			for(body : bodies) {
				// collect the variable in the body
				val exported = body.symbolicParameters.filter[it.patternParameter === v]
				if(exported.size !== 1) {
					throw new AssertionError('''Parameter «v.name» has no reference in body!''')
				}
				val variable = exported.head.parameterVariable
				typesFromBodies+=variable.getType(types,ecore2LogicTrace)
			}
			return typesFromBodies.calculateCommonSupertype
		}
	}
	
	/**
	 * Translates the type of a variable in a pattern body
	 */
	def TypeReference getType(PVariable v, Map<PBody, Map<PVariable, Set<IInputKey>>> types ,TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace) {
		if (v.isPositiveVariable) {
			val keys = getTypesFromCollection(v,types)
			val logicTypes = keys.map[transformTypeReference(it,ecore2LogicTrace)].filterNull
			return logicTypes.calculateCommonSubtype
		} else {
			val onlyConstraint = v.referringConstraints.head as NegativePatternCall
			val indexOfVariable = v.lookup(onlyConstraint.actualParametersTuple.invertIndex)
			val parameter = onlyConstraint.referredQuery.parameters.get(indexOfVariable)
			val declaredUnaryType = parameter.declaredUnaryType as BaseEMFTypeKey<? extends EClassifier>
			if (declaredUnaryType === null) {
				throw new UnsupportedOperationException(
				'''parameter «parameter.name» in pattern «onlyConstraint.referredQuery.fullyQualifiedName» does not have type!''')
			} else
				return declaredUnaryType.transformTypeReference(ecore2LogicTrace)
		}
	}
	
	def getTypesFromCollection(PVariable v, Map<PBody, Map<PVariable, Set<IInputKey>>> types) {
		for(entry : types.entrySet) {
			if(entry.key.uniqueVariables.contains(v)) {
				return v.lookup(entry.value)
			}
		}
		throw new IllegalArgumentException('''Variable «v.name» is not present in neither of the bodies!''')
	}
		

	def TypeReference calculateCommonSubtype(Iterable<TypeReference> types) {
		val primitiveTypeReferences = types.filter(PrimitiveTypeReference)
		val complexTypeReferences = types.filter(ComplexTypeReference)
		if(complexTypeReferences.isEmpty) {
			val head = primitiveTypeReferences.head
			if(primitiveTypeReferences.exists[it.eClass !== head.eClass]) {
				throw new IllegalArgumentException('''Inconsistent types: «primitiveTypeReferences.map[eClass.name].toSet.toList»''')
			}
			return head
		} else if(primitiveTypeReferences.isEmpty) {
			val complexTypes = complexTypeReferences.map[it.referred].toSet
			if(complexTypes.size === 1) {
				return builder.toTypeReference(complexTypes.head)
			}
			// Collect possible subtypes
			val subtypeSets = complexTypes.map[it.transitiveClosureStar[it.subtypes].toSet]
			val commonTypeSet = new HashSet(subtypeSets.head)
			val otherSets = subtypeSets.tail
			for(otherSet : otherSets) {
				commonTypeSet.retainAll(otherSet)
			}
			if(commonTypeSet.empty) {
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
		if(complexTypeReferences.isEmpty) {
			val head = primitiveTypeReferences.head
			if(primitiveTypeReferences.exists[it.eClass !== head.eClass]) {
				throw new IllegalArgumentException('''Inconsistent types: «primitiveTypeReferences.map[eClass.name].toSet.toList»''')
			}
			return head
		} else if(primitiveTypeReferences.isEmpty) {
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
		if(complexTypes.size === 1) {
			return builder.toTypeReference(complexTypes.head)
		}
		// Collect possible supertypes
		val supertypeSets = complexTypes.map[it.transitiveClosureStar[it.supertypes].toSet]
		val commonTypeSet = new HashSet(supertypeSets.head)
		val otherSets = supertypeSets.tail
		for(otherSet : otherSets) {
			commonTypeSet.retainAll(otherSet)
		}
		if(commonTypeSet.empty) {
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
	def dispatch TypeReference transformTypeReference(EDataTypeInSlotsKey k,TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace) {
		val w = k.wrappedKey 
		if(w == EcorePackage.Literals.EINT || w == EcorePackage.Literals.ESHORT || w == EcorePackage.Literals.ELONG) {
			return builder.LogicInt
		} else if(w == EcorePackage.Literals.EDOUBLE || w == EcorePackage.Literals.EFLOAT) {
			return builder.LogicReal
		} else if(w == EcorePackage.Literals.EBOOLEAN) {
			return builder.LogicBool
		} else if(w == EcorePackage.Literals.ESTRING) {
			return builder.LogicString
		} else if(w instanceof EEnum) {
			val c = this.ecore2Logic.TypeofEEnum(ecore2LogicTrace.trace,w)
			return builder.toTypeReference(c);
		} else throw new UnsupportedOperationException('''Unknown reference type «w.class.name»''')
	}
	def dispatch TypeReference transformTypeReference(JavaTransitiveInstancesKey k,TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace) {
		val c = k.wrapperInstanceClass
		if(c == Integer || c == Long || c == Short) {
			return LogicInt
		} else if(c == Float || c == Double) {
			return LogicReal
		} else if(c == Boolean) {
			return LogicBool
		} else if(c == String) {
			return LogicString
		} else if(c.superclass == java.lang.Enum){
			val enums = ecore2Logic.allEnumsInScope(ecore2LogicTrace.trace)
			for(enum : enums) {
				if(c == enum.instanceClass) {
					return builder.toTypeReference(ecore2Logic.TypeofEEnum(ecore2LogicTrace.trace,enum))
				}
			}
			throw new IllegalArgumentException('''Enum type «c.simpleName» is not mapped to logic!''')
		}
		return null
	}
	def dispatch TypeReference transformTypeReference(EClassTransitiveInstancesKey k,TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace) {
		val c = k.wrappedKey
		
		if(this.ecore2Logic.allClassesInScope(ecore2LogicTrace.trace).toList.contains(c)) {
			return builder.toTypeReference(this.ecore2Logic.TypeofEClass(ecore2LogicTrace.trace,k.wrappedKey))
		} else {
			return null
		}
	}
	def dispatch TypeReference transformTypeReference(EClassUnscopedTransitiveInstancesKey k, TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace) {
		val c = k.wrappedKey
		
		if(this.ecore2Logic.allClassesInScope(ecore2LogicTrace.trace).toList.contains(c)) {
			return builder.toTypeReference(this.ecore2Logic.TypeofEClass(ecore2LogicTrace.trace,k.wrappedKey))
		} else {
			return null
		}
	}
	
	def dispatch TypeReference transformTypeReference(IInputKey k,TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace) {
		println(k)
		throw new IllegalArgumentException('''Unsupported type: «k.class.simpleName»''')
	}
	
	def boolean isPositiveVariable(PVariable v) {
		val constraints = v.referringConstraints
		if(constraints.size == 1) {
			val onlyConstraint = constraints.head
			if(onlyConstraint instanceof NegativePatternCall) {
				return false
			}
		}
		return true
	}
}