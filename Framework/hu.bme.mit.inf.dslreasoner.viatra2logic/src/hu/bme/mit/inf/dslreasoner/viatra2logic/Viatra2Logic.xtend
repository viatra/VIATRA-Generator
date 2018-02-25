package hu.bme.mit.inf.dslreasoner.viatra2logic

import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicProblemBuilder
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDescriptor
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransfomedViatraQuery
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsFactory
import java.util.ArrayList
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
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
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery
import org.eclipse.viatra.query.runtime.matchers.psystem.rewriters.PBodyNormalizer
import org.eclipse.xtend.lib.annotations.Data

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

@Data class ViatraQuerySetDescriptor {
	val List<? extends IQuerySpecification<?>> patterns
	val Set<? extends IQuerySpecification<?>> validationPatterns
	val Map<IQuerySpecification<?>,EStructuralFeature> derivedFeatures
}
class Viatra2LogicTrace {
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
		for(query: queries.patterns) {
			try {
				this.transformQueryHeader(query,ecore2LogicTrace,viatra2LogicTrace,config)
			} catch(IllegalArgumentException e) {
				throw new IllegalArgumentException('''Unable to translate query "«query.fullyQualifiedName»".''',e)
			}
		}
		for(query: queries.patterns) {
			try {
				this.transformQuerySpecification(query,ecore2LogicTrace,viatra2LogicTrace,config)
			} catch (IllegalArgumentException e){
				throw new IllegalArgumentException('''Unable to translate query: "«query.fullyQualifiedName»".''',e)
			}
		}
		/*for(d : viatra2LogicTrace.query2Relation.values) {
			checkDefinition(d)
		}*/
		
		transformQueryConstraints(
			queries.validationPatterns,
			queries.derivedFeatures,
			ecore2LogicTrace,viatra2LogicTrace)
		return new TracedOutput(ecore2LogicTrace.output,viatra2LogicTrace)
	}
	
	def protected transformQueryHeader(IQuerySpecification<?> squery,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,
		Viatra2LogicConfiguration config)
	{
		val pquery = squery.internalQueryRepresentation
		val relationName = '''pattern «pquery.fullyQualifiedName.replace('.',' ')»'''
		val parameters = new ArrayList<Variable>(pquery.parameters.size)
		for(vParam: pquery.parameters) {
			val parameterType = transformTypeReference(
				vParam.declaredUnaryType as BaseEMFTypeKey<? extends EClassifier>,
				ecore2LogicTrace
			)
			if(parameterType == null) {
				println(parameterType)
			}
			val parameterName = '''parameter «vParam.name»'''
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
		IQuerySpecification<?> squery,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace,
		Viatra2LogicConfiguration config)
	{
		val pquery = squery.internalQueryRepresentation
		val disjunction = if(config.normalize) {
			val normalizer = new PBodyNormalizer(EMFQueryMetaContext.INSTANCE,true)
			normalizer.rewrite(pquery)
		} else {
			pquery.disjunctBodies
		}
		val translatedBodies = new ArrayList(disjunction.bodies.size)
		for(body : disjunction.bodies) {
			translatedBodies+=body.transformBody(ecore2LogicTrace,viatra2LogicTrace,config)
		}
		val relation = pquery.lookup(viatra2LogicTrace.query2Relation)
		relation.value = Or(translatedBodies)
	}
	
	def transformQueryConstraints(
		Set<? extends IQuerySpecification<?>> validationPatterns,
		Map<IQuerySpecification<?>,EStructuralFeature> derivedFeatures,
		TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace,
		Viatra2LogicTrace viatra2LogicTrace)
	{
		for(validationPattern : validationPatterns) {
			val pquery = validationPattern.internalQueryRepresentation
			val constraint = Assertion('''errorpattern «pquery.fullyQualifiedName.replace('.',' ')»''',
				Forall[
					for(param: pquery.parameters) {
						addVar(param.name,transformTypeReference(
							param.declaredUnaryType as BaseEMFTypeKey<? extends EClassifier>,
							ecore2LogicTrace))
					}
					Not(pquery.lookup(viatra2LogicTrace.query2Relation).call(it.variables))
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
				val logicType = getType(innerVariable,body,ecore2LogicTrace)
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
	
	def private normalizeName(String variableName) {
		return variableName.replaceAll("[\\W]|_", "")
	}
	
	def TypeDescriptor getType(PVariable v, PBody body, TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace) {
		if(v.isPositiveVariable) {
			val types = v.lookup(
				body.getAllUnaryTypeRestrictions(EMFQueryMetaContext.INSTANCE))
			if(types.size == 0) {
				throw new AssertionError('''No type for «v.name»''')
			} else if(types.size == 1){
				return (types.head.inputKey as BaseEMFTypeKey<? extends EClassifier>).transformTypeReference(ecore2LogicTrace)
			} else {
				return this.ecore2Logic.TypeofEClass(ecore2LogicTrace.trace,
					calculateCommonSubtype(types.map[
						(it.inputKey as BaseEMFTypeKey<EClass>).emfKey as EClass
					],ecore2LogicTrace))
			}
		} else {
			val onlyConstraint = v.referringConstraints.head as NegativePatternCall
			val indexOfVariable = v.lookup(onlyConstraint.actualParametersTuple.invertIndex)
			val parameter = onlyConstraint.referredQuery.parameters.get(indexOfVariable)
			val declaredUnaryType = parameter.declaredUnaryType as BaseEMFTypeKey<? extends EClassifier>
			if(declaredUnaryType == null) {
				throw new UnsupportedOperationException(
				'''parameter «parameter.name» in pattern «
				onlyConstraint.referredQuery.fullyQualifiedName» does not have type!''')
			} else return declaredUnaryType.transformTypeReference(ecore2LogicTrace)
		}
	}
	
	def calculateCommonSubtype(Iterable<EClass> allsuperClasses,TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace) {
		val superClasses = allsuperClasses.filter[it!=EcorePackage.eINSTANCE.EObject]
		val head = superClasses.head
		if(superClasses.forall[it.isSuperTypeOf(head)]) return head
		else {
			val allClasses = this.ecore2Logic.allClassesInScope(ecore2LogicTrace.trace)
			//println(allClasses.toList)
			val commonSubclasses = allClasses.filter[sub | superClasses.forall[sup | sup.isSuperTypeOf(sub)]]
			//println(commonSubclasses.toList)
			val mostGenericSubclasses = commonSubclasses.filter[generic | ! commonSubclasses.exists[moreGeneric | moreGeneric!=generic && moreGeneric.isSuperTypeOf(generic)]]
			//println(mostGenericSubclasses.toList)
			if(mostGenericSubclasses.isEmpty) throw new AssertionError('''No common supertype:
			«FOR s : superClasses SEPARATOR ", "»«s.name»«ENDFOR»''')
			else return mostGenericSubclasses.head
			
		}
	}
	
	def dispatch transformTypeReference(EDataTypeInSlotsKey k,TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace) {
		val w = k.wrappedKey 
		if(w == EcorePackage.Literals.EINT) {
			return builder.LogicInt
		} else if(w == EcorePackage.Literals.EDOUBLE || w == EcorePackage.Literals.EFLOAT) {
			return builder.LogicReal
		} else if(w == EcorePackage.Literals.EBOOLEAN) {
			return builder.LogicBool
		} else if(w instanceof EEnum) {
			this.ecore2Logic.TypeofEEnum(ecore2LogicTrace.trace,w);
		} else throw new UnsupportedOperationException('''Unknown reference type «w.class.name»''')
	}
	
	def dispatch transformTypeReference(EClassTransitiveInstancesKey k,TracedOutput<LogicProblem, Ecore2Logic_Trace> ecore2LogicTrace) {
		this.ecore2Logic.TypeofEClass(ecore2LogicTrace.trace,k.wrappedKey)
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