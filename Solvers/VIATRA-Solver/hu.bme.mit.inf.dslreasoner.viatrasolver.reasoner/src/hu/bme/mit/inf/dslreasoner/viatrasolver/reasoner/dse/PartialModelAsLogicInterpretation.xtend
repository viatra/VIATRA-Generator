package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse

import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicModelInterpretation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BinaryElementRelationLink
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BooleanElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.IntegerElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PrimitiveElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RealElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.StringElement
import java.math.BigDecimal
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.TreeSet
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.xbase.lib.Functions.Function1

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class PartialModelAsLogicInterpretation implements LogicModelInterpretation{
	@Accessors val PartialInterpretation partialInterpretation
	val Map<EObject, EObject> trace;
	val Map<TypeDeclaration,PartialComplexTypeInterpretation> type2Interpretation
	val Map<RelationDeclaration,PartialRelationInterpretation> relation2Interpretation
	
	val Map<DefinedElement,DefinedElement> elementBackwardTrace
	val Map<Boolean, BooleanElement> booleanForwardTrace
	val Map<Integer, IntegerElement> integerForwardTrace
	val Map<Double, RealElement> realForwardTrace
	val Map<String, StringElement> stringForwardTrace
	
	new(PartialInterpretation partialInterpretation, Map<EObject, EObject> forwardMap) {
		this.partialInterpretation = partialInterpretation
		this.trace = forwardMap
		this.type2Interpretation = initComplexTypes(partialInterpretation.partialtypeinterpratation.filter(PartialComplexTypeInterpretation))
		this.relation2Interpretation = initRelations(partialInterpretation.partialrelationinterpretation)
		
		this.elementBackwardTrace = initElementBackwardTrace(trace)
		this.booleanForwardTrace = initialisePrimitiveElementTrace(
			null,null,[null],partialInterpretation.newElements.filter(BooleanElement),[it.value])
		integerForwardTrace = initialisePrimitiveElementTrace(
			0,[it+1],[it],partialInterpretation.newElements.filter(IntegerElement),[it.value])
		realForwardTrace = initialisePrimitiveElementTrace(
			0.0,[it+1.0],[it],partialInterpretation.newElements.filter(RealElement),[it.value])
//		realForwardTrace = initialisePrimitiveElementTrace(
//			BigDecimal::ZERO,[it.add(BigDecimal.ONE)],[it],partialInterpretation.newElements.filter(RealElement),[it.value])
		stringForwardTrace = initialisePrimitiveElementTrace(
			0,[it+1],['''String«it»'''],partialInterpretation.newElements.filter(StringElement),[it.value])
	}
	
	private def <Seed,Type,ElementType extends PrimitiveElement> Map<Type,ElementType> initialisePrimitiveElementTrace(
		Seed initialSeed,
		Function1<Seed,Seed> nextSeed,
		Function1<Seed,Type> seed2Value,
		Iterable<ElementType> elements,
		Function1<ElementType,Type> element2Value)
	{
		val forwardMap = new HashMap
		
		val assignedElements = elements.filter[it.valueSet]
		for(assignedElement : assignedElements) {
			forwardMap.put(element2Value.apply(assignedElement),assignedElement)
		}
		
		val unsassignedElements = elements.filter[!it.valueSet]
		var seed = initialSeed
		var newValue = seed2Value.apply(seed) 
		for(unassignedElement : unsassignedElements) {
			while(forwardMap.keySet.contains(newValue)) {
				seed = nextSeed.apply(seed)
				newValue = seed2Value.apply(seed)
			}
			forwardMap.put(newValue,unassignedElement)
		}
		
		return forwardMap
	}
	
	def initComplexTypes(Iterable<PartialComplexTypeInterpretation> types) {
		types.toMap[it.interpretationOf]
	}
	def initRelations(List<PartialRelationInterpretation> relations) {
		relations.toMap[it.interpretationOf]
	}
	def initElementBackwardTrace(Map<EObject, EObject> trace) {
		val entryBackwardMap = new HashMap
		for(entry: trace.entrySet) {
			if(entry.key instanceof DefinedElement) {
				entryBackwardMap.put(entry.value as DefinedElement, entry.key as DefinedElement)
			}
		}
		return entryBackwardMap
	}
	
	override getElements(Type type) {
		val t1 = type.lookup(trace) as TypeDeclaration
		val t2 = t1.lookup(this.type2Interpretation)
		return t2.elements.map[it.elementLookupBackward]
	}
	
	def dispatch elementLookupForward(DefinedElement e) {
		if(this.trace.containsKey(e)) return e.lookup(trace) as DefinedElement
		else return e;
	}
	def dispatch elementLookupForward(Boolean e) {
		this.booleanForwardTrace.get(e)
	}
	def dispatch elementLookupForward(Integer e) {
		this.integerForwardTrace.get(e)
	}
	def dispatch elementLookupForward(Double e) {
		this.realForwardTrace.get(e)
	}
	def dispatch elementLookupForward(String e) {
		this.stringForwardTrace.get(e)
	}
	
	def elementLookupBackward(DefinedElement e) {
		if(this.elementBackwardTrace.containsKey(e)) return e.lookup(this.elementBackwardTrace)
		else return e;
	}
	
	override getInterpretation(FunctionDeclaration function, Object[] parameterSubstitution) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getInterpretation(RelationDeclaration relation, Object[] parameterSubstitution) {
		if(parameterSubstitution.size == 2) {
			val param1 = parameterSubstitution.get(0).elementLookupForward
			val param2 = parameterSubstitution.get(1).elementLookupForward
			if(param1 != null && param2 != null) {
				val r1 = relation.lookup(trace) as RelationDeclaration
				val r2 = r1.lookup(this.relation2Interpretation)
				val links = r2.relationlinks.filter(BinaryElementRelationLink)
				val existLink = links.exists[it.param1 == param1 && it.param2 == param2]
				//println(existLink)
				return existLink
			} else {
				return false
			}
		} else throw new UnsupportedOperationException
	}
	
	override getInterpretation(ConstantDeclaration constant) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getAllIntegersInStructure() {
		new TreeSet(allIntegersWithInterpretation.values)
	}
	
	override getAllIntegersWithInterpretation() {
		val builder = new HashMap
		for (entry : integerForwardTrace.entrySet) {
			builder.put(entry.value, entry.key)
		}
		for (element : partialInterpretation.newElements) {
			if (element instanceof IntegerElement) {
				builder.put(element, element.value)
			}
		}
		builder
	}
	
	override getAllRealsInStructure() {
		new TreeSet(allRealsWithInterpretation.values)
	}
	
	override getAllRealsWithInterpretation() {
		val builder = new HashMap
		for (entry : realForwardTrace.entrySet) {
			builder.put(entry.value, entry.key)
		}
		for (element : partialInterpretation.newElements) {
			if (element instanceof RealElement) {
				builder.put(element, element.value)
			}
		}
		builder
	}
	
	override getAllStringsInStructure() {
		new TreeSet(allStringsWithInterpretation.values)
	}
	
	override getAllStringsWithInterpretation() {
		val builder = new HashMap
		for (entry : stringForwardTrace.entrySet) {
			builder.put(entry.value, entry.key)
		}
		for (element : partialInterpretation.newElements) {
			if (element instanceof StringElement) {
				builder.put(element, element.value)
			}
		}
		builder
	}
	
	override getAllBooleansInStructure() {
		new TreeSet(allBooleansWithInterpretation.values)
	}
	
	override getAllBooleansWithInterpretation() {
		val builder = new HashMap
		for (entry : booleanForwardTrace.entrySet) {
			builder.put(entry.value, entry.key)
		}
		for (element : partialInterpretation.newElements) {
			if (element instanceof BooleanElement) {
				builder.put(element, element.value)
			}
		}
		builder
	}
}
