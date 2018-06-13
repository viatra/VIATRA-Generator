package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage

import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TypeScopes
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.patterns.SupertypeStar
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.PartialModelRelation2Assertion
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialConstantInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialFunctionInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationFactory
import java.math.BigDecimal
import java.util.HashMap
import java.util.Map
import java.util.SortedSet
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope
import org.eclipse.xtend.lib.annotations.Data

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

@Data class Problem2PartialInterpretationTrace {
	Map<TypeDeclaration, PartialComplexTypeInterpretation> type2Interpretation = new HashMap
	Map<RelationDeclaration, PartialRelationInterpretation> relation2Interpretation = new HashMap
}

/**
 * Initializer class for an empty partial interpretation.
 */
class PartialInterpretationInitialiser {
	val extension PartialinterpretationFactory factory = PartialinterpretationFactory.eINSTANCE
	val extension LogiclanguageFactory factory2 = LogiclanguageFactory.eINSTANCE
	
	/**
	 * Initialises an empty partial interpretation from a logic problem and a scope.
	 */
	def TracedOutput<PartialInterpretation,Problem2PartialInterpretationTrace> initialisePartialInterpretation(
		LogicProblem problem,
		TypeScopes typeScopes) 
	{
		
		val trace = new Problem2PartialInterpretationTrace
		
		val res = createPartialInterpretation => [
			it.problem = problem
			
			// Initialise primitive elements
			initBooleans(it)
			initIntegers(it, typeScopes.knownIntegers, typeScopes.minNewIntegers, typeScopes.maxNewIntegers)
			initReals(it, typeScopes.knownReals, typeScopes.minNewReals, typeScopes.maxNewReals)
			initStrings(it,typeScopes.knownStrings, typeScopes.minNewStrings, typeScopes.maxNewStrings)
			// Initialise complex elements
			initElements(it,
				typeScopes.minNewElementsByType,
				typeScopes.maxNewElementsByType,
				typeScopes.minNewElements,
				typeScopes.maxNewElements,
				trace
			)
			
			// Initialise relations
			initRelations(it,trace)
		]
		
		return new TracedOutput(res,trace)
	}
	
	def protected boolean initBooleans(PartialInterpretation partialInterpretation) {
		val booleanInterpretation = createPartialBooleanInterpretation
		partialInterpretation.partialtypeinterpratation += booleanInterpretation
		
		val trueElement = createBooleanElement => [it.name = "true" it.value = true it.valueSet = true]
		booleanInterpretation.elements += trueElement
		partialInterpretation.newElements+=trueElement
		
		val falseElement = createBooleanElement => [it.name = "false" it.value = false it.valueSet = true]
		booleanInterpretation.elements += falseElement
		partialInterpretation.newElements+=falseElement
	}
	
	def protected initIntegers(PartialInterpretation partialInterpretation, SortedSet<Integer> knownIntegers, int minNewIntegers, int maxNewIntegers) {
		val integerInterpretation = createPartialIntegerInterpretation
		partialInterpretation.partialtypeinterpratation += integerInterpretation
		
		for(knownInteger : knownIntegers) {
			val integerElement = createIntegerElement => [it.name = knownInteger.toString it.value = knownInteger it.valueSet = true]
			integerInterpretation.elements += integerElement
			partialInterpretation.newElements += integerElement
		}
		if(maxNewIntegers>0) {
			throw new UnsupportedOperationException('''Unspecified Integers are currently not supported!''')
		}
	}
	
	def protected initReals(PartialInterpretation partialInterpretation, SortedSet<BigDecimal> knownReals, int minNewReals, int maxNewReals) {
		val realInterpretation = createPartialRealInterpretation
		partialInterpretation.partialtypeinterpratation += realInterpretation
		
		for(knownReal : knownReals) {
			val realElement = createRealElement => [it.name = knownReal.toString it.value = knownReal it.valueSet = true]
			realInterpretation.elements += realElement
			partialInterpretation.newElements += realElement
		}
		if(maxNewReals>0) {
			throw new UnsupportedOperationException('''Unspecified Real values are currently not supported!''')
		}
	}
	
	def protected initStrings(PartialInterpretation partialInterpretation, SortedSet<String> knownStrings, int minNewStrings, int maxNewStrings) {
		val stringInterpretation = createPartialStringInterpretation
		partialInterpretation.partialtypeinterpratation += stringInterpretation
		
		for(knownString : knownStrings) {
			val stringElement = createStringElement => [it.name = '''"«knownString»"''' it.value = knownString it.valueSet = true]
			stringInterpretation.elements += stringElement
			partialInterpretation.newElements += stringElement
		}
		if(maxNewStrings>0) {
			throw new UnsupportedOperationException('''Unspecified String values are currently not supported!''')
		}
	}
	
	def protected initElements(PartialInterpretation interpretation,
		Map<Type, Integer> minNewElementsByType, Map<Type, Integer> maxNewElementsByType,
		int minNewElements, int maxNewElements,
		Problem2PartialInterpretationTrace trace)
	{
		val engine = ViatraQueryEngine.on(new EMFScope(interpretation.problem))
		// Elements
		interpretation.minNewElements = minNewElements
		interpretation.maxNewElements = maxNewElements
		// elements from problem are included
		if(maxNewElements>0) {
			val newElements = createDefinedElement => [it.name = "New Objects"]
			interpretation.openWorldElements += newElements 
		}
		
		for(typeDeclaration : interpretation.problem.types.filter(TypeDeclaration)) {
			val typeInterpretation = typeDeclaration.initialisePartialTypeInterpretation(engine,trace)
			interpretation.partialtypeinterpratation += typeInterpretation
		}
		interpretation.problem.connectSuperypes(trace)
	}
	
	def private connectSuperypes(LogicProblem problem, Problem2PartialInterpretationTrace trace) {
		for(typeDeclaration : problem.types.filter(TypeDeclaration)) {
			val supertypes = typeDeclaration.<Type>transitiveClosurePlus[it.supertypes]
			for(supertype : supertypes.filter(TypeDeclaration)) {
				typeDeclaration.lookup(trace.type2Interpretation).supertypeInterpretation += supertype.lookup(trace.type2Interpretation)
				//println('''«typeDeclaration.name» --> «supertype.name»''')
			}
		}
	}
	
	def private initRelations(PartialInterpretation interpretation, Problem2PartialInterpretationTrace trace) {
		interpretation.partialrelationinterpretation += interpretation.problem.relations.filter(RelationDeclaration)
			.map[initialisePartialRelationInterpretation(trace)]
		for(pMR2A : interpretation.problem.annotations.filter(PartialModelRelation2Assertion)) {
			val relation = pMR2A.targetRelation
			val r = relation.lookup(trace.relation2Interpretation)
			r.relationlinks+=pMR2A.links.map[EcoreUtil.copy(it)]
		}
//		interpretation.partialfunctioninterpretation += interpretation.problem.functions.filter(FunctionDeclaration)
//			.map[initialisePartialFunctionInterpretation(trace)]
//		interpretation.partialconstantinterpretation += interpretation.problem.constants.filter(ConstantDeclaration)
//			.map[initialisePartialConstantDeclaration(trace)]
	}
	
	def private initialisePartialTypeInterpretation(TypeDeclaration t, ViatraQueryEngine engine, Problem2PartialInterpretationTrace trace) {
		val supertypeMatcher = SupertypeStar.Matcher.on(engine)
		val res = createPartialComplexTypeInterpretation => [
			it.interpretationOf = t
			it.elements += supertypeMatcher.getAllValuesOfsubtype(t)
				.filter(TypeDefinition)
				.map[elements].flatten
		]
		trace.type2Interpretation.put(t,res)
		return res
	}
	
	def private initialisePartialRelationInterpretation(RelationDeclaration r, Problem2PartialInterpretationTrace trace) {
		val res = createPartialRelationInterpretation => [
			it.interpretationOf = r
			if(r.parameters.size==2) {
				it.param1 = r.parameters.get(0)
				it.param2 = r.parameters.get(1)
			} else throw new UnsupportedOperationException
		]
		trace.relation2Interpretation.put(r,res)
		return res
	}
	
	def private PartialConstantInterpretation initialisePartialConstantDeclaration(ConstantDeclaration c, Problem2PartialInterpretationTrace trace) {
		throw new UnsupportedOperationException
	}
	
	def private PartialFunctionInterpretation initialisePartialFunctionInterpretation(FunctionDeclaration f, Problem2PartialInterpretationTrace trace) {
		throw new UnsupportedOperationException
	}
}