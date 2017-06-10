package hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder

import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.queries.TypeQueries
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMultiplicity
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureDeclaration
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTerm
import hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage
import java.util.ArrayList
import java.util.Collection
import java.util.HashMap
import java.util.List
import java.util.Map

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class Logic2AlloyLanguageMapper_TypeMapperTrace_FilteredTypes
	implements Logic2AlloyLanguageMapper_TypeMapperTrace
{
	public var ALSSignatureDeclaration objectSupperClass;
	public val Map<Type, ALSSignatureDeclaration> type2ALSType = new HashMap;
	public val Map<DefinedElement, ALSSignatureDeclaration> definedElement2Declaration = new HashMap
}
/**
 * Each object is an element of an Object set, and types are subsets of the objects.
 */
class Logic2AlloyLanguageMapper_TypeMapper_FilteredTypes implements Logic2AlloyLanguageMapper_TypeMapper{
	private val Logic2AlloyLanguageMapper_Support support = new Logic2AlloyLanguageMapper_Support;
	private val extension AlloyLanguageFactory factory = AlloyLanguageFactory.eINSTANCE
	
	new() {
		// Initialize package
		LogicproblemPackage.eINSTANCE.class
	}
	
	override transformTypes(Collection<Type> types, Collection<DefinedElement> elements, Logic2AlloyLanguageMapper mapper, Logic2AlloyLanguageMapperTrace trace) {
		val typeTrace = new Logic2AlloyLanguageMapper_TypeMapperTrace_FilteredTypes
		trace.typeMapperTrace = typeTrace
		
		// 1. A global type for Objects is created
		val objectSig = createALSSignatureDeclaration => [it.name = support.toID(#["util","Object"])]
		val objectBody = createALSSignatureBody => [
			it.declarations += objectSig
			it.abstract = true
		]
		typeTrace.objectSupperClass = objectSig
		trace.specification.signatureBodies += objectBody
		
		// 2. Each type is mapped to a unique sig
		for(type : types) {
			val sig = createALSSignatureDeclaration => [it.name = support.toIDMultiple("type",type.name)]
			val body = createALSSignatureBody => [it.declarations += sig]
			trace.specification.signatureBodies += body
			typeTrace.type2ALSType.put(type,sig)
		}
		
		// 3. The elements of a defined type is mapped to singleton signatures
		// 3.1 Collect the elements
		val elementMatcher = TypeQueries.instance.getLowestCommonSupertypeOfAllOccuranceOfElement(trace.incqueryEngine)
		val topmostType2Elements = new HashMap<ALSSignatureDeclaration,List<DefinedElement>>
		for(element : elements) {
			val topmostTypes = elementMatcher.getAllValuesOftype(element)
			var ALSSignatureDeclaration selectedTopmostType;
			if(topmostTypes.empty) {
				selectedTopmostType = objectSig
			} else{
				selectedTopmostType = topmostTypes.head.lookup(typeTrace.type2ALSType)
			}
			topmostType2Elements.putOrAddToList(selectedTopmostType,element)
		}
		
		// 4. For each topmost types several singleton classes are generated, which represents the elements.
		// For the sake of clarity, common bodies are used.
		for(topmostEntry : topmostType2Elements.entrySet) {
			
			for(element : topmostEntry.value) {
				val signature = createALSSignatureDeclaration => [it.name = support.toIDMultiple("element",element.name)]
				typeTrace.definedElement2Declaration.put(element,signature)
			}
			
			val body = createALSSignatureBody => [
				it.multiplicity = ALSMultiplicity.ONE
				it.declarations += topmostEntry.value.map[it.lookup(typeTrace.definedElement2Declaration)]
			]
			
			val containerLogicType = topmostEntry.key
			body.superset += containerLogicType
			
			trace.specification.signatureBodies+=body
		}
		
		// 5.1 Each Defined Type is specified as the union of its elements
		for(definedType : types.filter(TypeDefinition)) {
			trace.specification.factDeclarations += createALSFactDeclaration => [
				it.name = support.toIDMultiple("typedefinition",definedType.name)
				it.term = createALSEquals => [
					it.leftOperand = createALSReference => [ it.referred = definedType.lookup(typeTrace.type2ALSType) ]
					it.rightOperand = support.unfoldPlus(definedType.elements.map[e|
						createALSReference => [it.referred = e.lookup(typeTrace.definedElement2Declaration)]])
				]
			]
		}
		// 5.2 Each Defined Element is unique
		for(definedType : types.filter(TypeDefinition)) {
			val allElementsIncludingSubtypes = 
				definedType.<Type>transitiveClosureStar[it.subtypes].filter(TypeDefinition)
					.map[elements].flatten.toSet.toList
			if(allElementsIncludingSubtypes.size>=2) {
				trace.specification.factDeclarations += createALSFactDeclaration => [
					it.name = support.toIDMultiple("typeElementsUnique",definedType.name)
					it.term = unfoldDistinctElements(allElementsIncludingSubtypes,trace)
				]
			}
		}
		
		// 6. Each inheritance is modeled by subset operator 'in'
		for(type : types) {
			val sigBody = type.lookup(typeTrace.type2ALSType).eContainer as ALSSignatureBody
			if(type.supertypes.empty)  {
				sigBody.superset += typeTrace.objectSupperClass
			} else {
				sigBody.superset += type.supertypes.map[lookup(typeTrace.type2ALSType)]
			}
		}
		
		
		// 7. Each type is in the intersection of the supertypes
		for(type : types.filter[it.supertypes.size>=2]) {
			trace.specification.factDeclarations += createALSFactDeclaration => [
				it.name = support.toIDMultiple("abstract",type.name)
				it.term = createALSEquals => [
					it.leftOperand = createALSReference => [ it.referred = type.lookup(typeTrace.type2ALSType) ]
					it.rightOperand = support.unfoldIntersection(type.supertypes.map[e|
						createALSReference => [it.referred = e.lookup(typeTrace.type2ALSType)]])
				]
			]
		}
		
		// 8. Each abstract type is equal to the union of the subtypes
		for(type : types.filter[isIsAbstract]) {
			trace.specification.factDeclarations += createALSFactDeclaration => [
				it.name = support.toIDMultiple("abstract",type.name)
				it.term = createALSEquals => [
					it.leftOperand = createALSReference => [ it.referred = type.lookup(typeTrace.type2ALSType) ]
					it.rightOperand = support.unfoldPlus(type.subtypes.map[e|
						createALSReference => [it.referred = e.lookup(typeTrace.type2ALSType)]])
				]
			]
		}
		// 8.1 The object type is the union of the root types.
		val rootTypes = types.filter[it.supertypes.empty].toList
		trace.specification.factDeclarations += createALSFactDeclaration => [
			it.name = support.toIDMultiple(#["ObjectTypeDefinition"])
			it.term = createALSEquals => [
				it.leftOperand = createALSReference => [ it.referred = typeTrace.objectSupperClass ]
				it.rightOperand = support.unfoldPlus(rootTypes.map[e|
					createALSReference => [it.referred = e.lookup(typeTrace.type2ALSType)]])
			]
		]
		
		// 9. For each type X (including Object)
		//    only the common subtypes are in the intersection
		//    of the two subtype.
		// 9.1. for the object
		{
			val rootTypeList = types.filter[it.supertypes.empty].toList
			for(type1Index: 0..<rootTypeList.size) {
				for(type2Index: 0..<type1Index) {
					trace.specification.factDeclarations += 
						commonSubtypeOnlyInDiamonds(rootTypeList.get(type1Index),rootTypeList.get(type2Index),trace)
				}
			}
		}
		
		//9.3 for the subtypes of each objects
		{
			for(inScope : types) {
				val subtypeList = inScope.subtypes//.toList
				if(subtypeList.size>=2) {
					for(type1Index: 0..<subtypeList.size) {
						for(type2Index: 0..<type1Index) {
							trace.specification.factDeclarations += 
								commonSubtypeOnlyInDiamonds(subtypeList.get(type1Index),subtypeList.get(type2Index),trace)
						}
					}
				}
			}
		}
	}
	
	private def isEnumlikeType(Type type) {
		if(type instanceof TypeDefinition) {
			val elements = type.elements
			return elements.forall[it.definedInType.size === 1 && it.definedInType.head === type]
		}
		return false
	}
	
	private def isEnumlikeElement(DefinedElement d) {
		d.definedInType.size === 1 && d.definedInType.head.isEnumlikeType 
	}
	
	def getTypeTrace(Logic2AlloyLanguageMapperTrace trace) {
		val res = trace.typeMapperTrace
		if(res instanceof Logic2AlloyLanguageMapper_TypeMapperTrace_FilteredTypes) {
			return res
		} else {
			throw new IllegalArgumentException('''
			Expected type mapping trace: «Logic2AlloyLanguageMapper_TypeMapperTrace_FilteredTypes.name»,
			but found «res.class.name»''')
		}
	}
	
	def private commonSubtypeOnlyInDiamonds(Type t1, Type t2, Logic2AlloyLanguageMapperTrace trace) {
		val topmostCommonSubtypes = TypeQueries.instance.getTopmostCommonSubtypes(trace.incqueryEngine)
		val allTopmostCommon = topmostCommonSubtypes.getAllValuesOfcommon(t1,t2).toList
		return createALSFactDeclaration => [
				it.name = support.toIDMultiple("common","types",t1.name,t2.name)
				it.term = createALSEquals => [
					it.leftOperand = createALSIntersection => [
						it.leftOperand = createALSReference => [it.referred = t1.lookup(trace.typeTrace.type2ALSType)]
						it.rightOperand = createALSReference => [it.referred = t2.lookup(trace.typeTrace.type2ALSType)]
					]
					it.rightOperand = support.unfoldPlus(allTopmostCommon.map[t|createALSReference => [it.referred = t.lookup(trace.typeTrace.type2ALSType)]])
				]
			]
	}
	
	def private unfoldDistinctElements(
		List<DefinedElement> operands,
		Logic2AlloyLanguageMapperTrace trace
	) {
		if(operands.size == 1 || operands.size == 0) {support.unfoldTrueStatement(trace);}
		else {
			val notEquals = new ArrayList<ALSTerm>(operands.size*operands.size/2)
			for(i:0..<operands.size) {
				for(j: i+1..<operands.size) {
					notEquals+=createALSNotEquals=>[
						leftOperand = createALSReference => [it.referred = trace.typeTrace.definedElement2Declaration.get(operands.get(i)) ]
						rightOperand = createALSReference => [it.referred = trace.typeTrace.definedElement2Declaration.get(operands.get(j)) ]
					]
				}
			}
			return support.unfoldAnd(notEquals)
		}
	}
	
	override transformTypeReference(Type referred, Logic2AlloyLanguageMapper mapper, Logic2AlloyLanguageMapperTrace trace) {
		return #[trace.typeTrace.type2ALSType.get(referred)]
	}
	
	override getUndefinedSupertype(Logic2AlloyLanguageMapperTrace trace) {
		trace.typeTrace.objectSupperClass
	}
	
	override transformReference(DefinedElement referred, Logic2AlloyLanguageMapperTrace trace) {
		createALSReference => [it.referred = referred.lookup(trace.typeTrace.definedElement2Declaration)]
	}
	
	override getUndefinedSupertypeScope(int undefinedScope, Logic2AlloyLanguageMapperTrace trace) {
		return undefinedScope + trace.typeTrace.definedElement2Declaration.size
	}
	
}