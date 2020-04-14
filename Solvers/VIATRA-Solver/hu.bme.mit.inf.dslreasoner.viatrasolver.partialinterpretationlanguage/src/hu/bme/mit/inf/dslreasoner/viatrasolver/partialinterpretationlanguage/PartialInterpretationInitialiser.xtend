package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage

import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TypeScopes
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.patterns.SupertypeStar
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.PartialModelRelation2Assertion
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BinaryElementRelationLink
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BooleanElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.IntegerElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.NaryRelationLink
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialBooleanInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialIntegerInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRealInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialStringInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationFactory
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RealElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.StringElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.UnaryElementRelationLink
import java.math.BigDecimal
import java.util.HashMap
import java.util.Map
import java.util.SortedSet
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope
import org.eclipse.xtend.lib.annotations.Data

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicValue
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.And
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolLiteral
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IntLiteral
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RealLiteral
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.StringLiteral
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition

@Data class Problem2PartialInterpretationTrace {
	Map<TypeDeclaration, PartialComplexTypeInterpretation> type2Interpretation
	PrimitiveValueTrace primitiveValues
	Map<RelationDeclaration, PartialRelationInterpretation> relation2Interpretation
}
@Data class PrimitiveValueTrace {
	PartialBooleanInterpretation booleanInterpretation
	Map<Boolean,BooleanElement> booleanMap
	PartialIntegerInterpretation integerInterpretation
	Map<Integer,IntegerElement> integerMap
	PartialRealInterpretation realInterpretation
	Map<BigDecimal,RealElement> realMap
	PartialStringInterpretation stringInterpretation
	Map<String,StringElement> stringMap
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
		val res = createPartialInterpretation
		res.problem = problem
			
		// Initialise primitive elements
		val booleanType = initBooleans(res)
		val integerType = initIntegers(res, typeScopes.knownIntegers, typeScopes.minNewIntegers, typeScopes.maxNewIntegers)
		val realType = initReals(res, typeScopes.knownReals, typeScopes.minNewReals, typeScopes.maxNewReals)
		val stringType= initStrings(res,typeScopes.knownStrings, typeScopes.minNewStrings, typeScopes.maxNewStrings)
		val primitiveTrace = createPrimitiveTrace(booleanType, integerType, realType, stringType)
		// Initialise complex elements
		
		val type2Interpretation = initElements(res,
			typeScopes.minNewElementsByType,
			typeScopes.maxNewElementsByType,
			typeScopes.minNewElements,
			typeScopes.maxNewElements)
			
		// Initialise relations
		val relation2Interpretation = initRelations(res,primitiveTrace)
		
		val trace = new Problem2PartialInterpretationTrace(type2Interpretation,primitiveTrace,relation2Interpretation)
		return new TracedOutput(res,trace)
	}
	
	def createPrimitiveTrace(
		PartialBooleanInterpretation booleanType,
		PartialIntegerInterpretation integerType,
		PartialRealInterpretation realType,
		PartialStringInterpretation stringType)
	{
		return new PrimitiveValueTrace(
			booleanType,
			booleanType.elements.filter(BooleanElement).filter[it.isValueSet].toMap[value],
			integerType,
			integerType.elements.filter(IntegerElement).filter[it.isValueSet].toMap[value],
			realType,
			realType.elements.filter(RealElement).filter[it.isValueSet].toMap[value],
			stringType,
			stringType.elements.filter(StringElement).filter[it.isValueSet].toMap[value]
		)
	}
	
	def protected initBooleans(PartialInterpretation partialInterpretation) {
		val booleanInterpretation = createPartialBooleanInterpretation
		partialInterpretation.partialtypeinterpratation += booleanInterpretation
		
		val trueElement = createBooleanElement => [it.name = "true" it.value = true it.valueSet = true]
		booleanInterpretation.elements += trueElement
		partialInterpretation.newElements+=trueElement
		
		val falseElement = createBooleanElement => [it.name = "false" it.value = false it.valueSet = true]
		booleanInterpretation.elements += falseElement
		partialInterpretation.newElements+=falseElement
		
		return booleanInterpretation
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
			val newElements = createIntegerElement => [it.name = "New Integers" it.valueSet = false]
			partialInterpretation.openWorldElements += newElements
			integerInterpretation.elements += newElements
		}
		
		return integerInterpretation
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
			val newElements = createRealElement => [it.name = "New Reals" it.valueSet = false]
			partialInterpretation.openWorldElements += newElements
			realInterpretation.elements += newElements
		}
		return realInterpretation
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
			val newElements = createStringElement => [it.name = "New Strings" it.valueSet = false]
			partialInterpretation.openWorldElements += newElements
			stringInterpretation.elements += newElements
		}
		
		return stringInterpretation
	}
	
	def protected initElements(PartialInterpretation interpretation,
		Map<Type, Integer> minNewElementsByType, Map<Type, Integer> maxNewElementsByType,
		int minNewElements, int maxNewElements)
	{
		val Map<TypeDeclaration, PartialComplexTypeInterpretation> type2Interpretation = new HashMap
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
			val typeInterpretation = typeDeclaration.initialisePartialTypeInterpretation(engine)
			interpretation.partialtypeinterpratation += typeInterpretation
			type2Interpretation.put(typeDeclaration,typeInterpretation)
			interpretation.scopes += initialiseTypeScope(typeInterpretation, minNewElementsByType.get(typeDeclaration),maxNewElementsByType.get(typeDeclaration))
			
		}
		interpretation.problem.connectSuperypes(type2Interpretation)
		return type2Interpretation
	}
	
	def private initialiseTypeScope(PartialTypeInterpratation interpretation, Integer min, Integer max) {
		val res = createScope
		res.targetTypeInterpretation = interpretation
		if(min !== null) {
			res.minNewElements = min
		}
		if(max !== null) {
			res.maxNewElements = max
		}
		return res
	}
	
	def private connectSuperypes(LogicProblem problem, Map<TypeDeclaration, PartialComplexTypeInterpretation> trace) {
		for(typeDeclaration : problem.types.filter(TypeDeclaration)) {
			val supertypes = typeDeclaration.<Type>transitiveClosurePlus[it.supertypes]
			for(supertype : supertypes.filter(TypeDeclaration)) {
				typeDeclaration.lookup(trace).supertypeInterpretation += supertype.lookup(trace)
				//println('''«typeDeclaration.name» --> «supertype.name»''')
			}
		}
	}
	
	def private Map<RelationDeclaration, PartialRelationInterpretation> initRelations(PartialInterpretation interpretation, PrimitiveValueTrace trace) {
		val Map<RelationDeclaration, PartialRelationInterpretation> relation2Interpretation = new HashMap
		val definedRelationDeclarations = interpretation.problem.relations.filter(RelationDefinition).map[defines]
		val undefinedRelationDeclarations = interpretation.problem.relations.filter(RelationDeclaration).filter[
			declared | !definedRelationDeclarations.exists[defined | defined === declared]
		]
		for(relation : undefinedRelationDeclarations) {
			val partialInterpretation = relation.initialisePartialRelationInterpretation
			interpretation.partialrelationinterpretation += partialInterpretation
			relation2Interpretation.put(relation,partialInterpretation)
		}
		for(pMR2A : interpretation.problem.annotations.filter(PartialModelRelation2Assertion)) {
			val relation = pMR2A.targetRelation
			val r = relation.lookup(relation2Interpretation)
			val assertion = pMR2A.target.value
			val links = if(assertion instanceof SymbolicValue) {
				#[assertion]
			} else if(assertion instanceof And){
				val res = assertion.operands.filter(SymbolicValue)
				if(res.size != assertion.operands.size) {
					throw new UnsupportedOperationException('''Assertion describing partial model of "«r.interpretationOf.name»" contains unsupported constructs''')
				} else {
					res
				}
			} else {
				throw new UnsupportedOperationException('''Assertion describing partial model of "«r.interpretationOf.name»" contains unsupported constructs''')
			}
			for(link:links) {
				r.relationlinks += createLink(link,trace)
			}
		}
		
//		interpretation.partialfunctioninterpretation += interpretation.problem.functions.filter(FunctionDeclaration)
//			.map[initialisePartialFunctionInterpretation(trace)]
//		interpretation.partialconstantinterpretation += interpretation.problem.constants.filter(ConstantDeclaration)
//			.map[initialisePartialConstantDeclaration(trace)]

		return relation2Interpretation
	}
	def private createLink(SymbolicValue v, PrimitiveValueTrace trace) {
		val translatedValues = v.parameterSubstitutions.map[getElement(trace)].toList
		if(translatedValues.size == 1) {
			return createUnaryElementRelationLink => [it.param1 = translatedValues.get(0)]
		} else if(translatedValues.size == 2) {
			return createBinaryElementRelationLink => [it.param1 = translatedValues.get(0) it.param2 = translatedValues.get(1)]
		} else {
			val res = createNaryRelationLink
			for(i : 0..<translatedValues.size) {
				res.elements += createNaryRelationLinkElement => [
					it.index = i
					it.param = translatedValues.get(i)
				]
			}
			return res
		}
	}

	def private dispatch getElement(SymbolicValue element, PrimitiveValueTrace trace) {
		return element.symbolicReference as DefinedElement
	}
	def private dispatch getElement(BoolLiteral element, PrimitiveValueTrace trace) {
		element.value.lookup(trace.booleanMap)
	}
	def private dispatch getElement(IntLiteral element, PrimitiveValueTrace trace) {
		element.value.lookup(trace.integerMap)
	}
	def private dispatch getElement(RealLiteral element, PrimitiveValueTrace trace) {
		element.value.lookup(trace.realMap)
	}
	def private dispatch getElement(StringLiteral element, PrimitiveValueTrace trace) {
		element.value.lookup(trace.stringMap)
	}
	
	def private initialisePartialTypeInterpretation(TypeDeclaration t, ViatraQueryEngine engine) {
		val supertypeMatcher = SupertypeStar.Matcher.on(engine)
		val res = createPartialComplexTypeInterpretation => [
			it.interpretationOf = t
			it.elements += supertypeMatcher.getAllValuesOfsubtype(t)
				.filter(TypeDefinition)
				.map[elements].flatten
		]
		return res
	}
	
	def private initialisePartialRelationInterpretation(RelationDeclaration r) {
		val res = createPartialRelationInterpretation => [
			it.interpretationOf = r
			if(r.parameters.size==2) {
				it.param1 = r.parameters.get(0)
				it.param2 = r.parameters.get(1)
			} else throw new UnsupportedOperationException
		]
		return res
	}
}