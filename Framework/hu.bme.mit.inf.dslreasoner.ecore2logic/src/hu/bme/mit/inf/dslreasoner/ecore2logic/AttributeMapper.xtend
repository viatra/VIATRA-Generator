package hu.bme.mit.inf.dslreasoner.ecore2logic

import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsFactory
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicProblemBuilder
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Assertion
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Term
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TermDescription
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDescriptor
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EEnum

interface EAttributeMapper {
	def void transformEAttributes(Ecore2Logic_Trace trace, LogicProblem logicProblem, Iterable<EAttribute> attributes)
	def Term IsAttributeValue(Ecore2Logic_Trace trace, TermDescription object, TermDescription value, EAttribute attribute)
	def RelationDeclaration relationOfAttribute(Ecore2Logic_Trace trace, EAttribute attribute)
	def TypeDescriptor TypeOfRange(Ecore2Logic_Trace trace, EAttribute attribute)
	def Iterable<EAttribute> allAttributesInScope(Ecore2Logic_Trace trace) 
}

class EAttributeMapper_RelationsOverTypes_Trace implements Trace<EAttributeMapper_RelationsOverTypes>{
	public var Map<EAttribute, RelationDeclaration> indicators = new HashMap
	public var Map<EAttribute, Assertion> typeCompliance = new HashMap
	public var Map<EAttribute, Assertion> lowerMultiplicity = new HashMap
	public var Map<EAttribute, Assertion> upperMultiplicity = new HashMap
}

class EAttributeMapper_RelationsOverTypes implements EAttributeMapper {
	protected val extension LogicProblemBuilder builder = new LogicProblemBuilder
	val extension Ecore2logicannotationsFactory builder2 = Ecore2logicannotationsFactory.eINSTANCE
	protected val extension EClassMapper classMapper
	protected val extension EEnumMapper enumMapper;
	
	public new(EClassMapper classMapper, EEnumMapper enumMapper) {
		this.enumMapper = enumMapper
		this.classMapper = classMapper
	}
	
	public override transformEAttributes(Ecore2Logic_Trace trace, LogicProblem logicProblem, Iterable<EAttribute> attributes) {
		val attributeMapperTrace = new EAttributeMapper_RelationsOverTypes_Trace
		trace.attributeMapperTrace = attributeMapperTrace

		for(attribute : attributes) {
			val sourceType = trace.TypeofEClass(attribute.EContainingClass)
			val rangeType = trace.TypeOfRange(attribute)
			
			// relations
			val indicator = '''«attribute.name» attribute «attribute.EContainingClass.name»'''.RelationDeclaration(sourceType,rangeType)

			logicProblem.add(indicator)
			attributeMapperTrace.indicators.put(attribute,indicator)
			
			// lower multiplicity
			var Assertion lowerMultiplicity = null
			if(attribute.lowerBound != 0) {
				lowerMultiplicity  = '''lowerMultiplicity «attribute.name» «attribute.EContainingClass.name»'''.Assertion(
					Forall[
						val source = addVar('''src''', sourceType)
						Exists[ context |
							val targets = (1 .. attribute.lowerBound).map[context.addVar('''trg «it»''', rangeType)].toList
							val attributeValue = And(targets.map[IsAttributeValue(trace, source, it, attribute)])
							if(targets.size > 1) return Distinct(targets) && attributeValue
							else return attributeValue
						]
					]
				)
				val annotation = createLowerMultiplicityAssertion => [
					it.lower = attribute.lowerBound
					it.relation = indicator
				]
				logicProblem.add(lowerMultiplicity)
				logicProblem.annotations += annotation
				lowerMultiplicity.annotations +=annotation
			}
			attributeMapperTrace.lowerMultiplicity.put(attribute,lowerMultiplicity)
			
			var Assertion upperMultiplicity = null
			if(attribute.upperBound > 0) {
				upperMultiplicity = '''upperMultiplicity «attribute.name» «attribute.EContainingClass.name»'''.Assertion(
					Forall[ context |
						val source = context.addVar('''src''', sourceType)
						val targets = (1 .. attribute.upperBound+1).map[context.addVar('''trg «it»''', rangeType)].toList
						And(targets.map[IsAttributeValue(trace, source, it, attribute)]) => ! Distinct(targets)
					])
				
				val annotation = createUpperMultiplicityAssertion => [
					it.upper = attribute.upperBound
					it.relation = indicator
				]
				
				logicProblem.add(upperMultiplicity)
				logicProblem.annotations += annotation
				upperMultiplicity.annotations += annotation
			}
			attributeMapperTrace.upperMultiplicity.put(attribute,upperMultiplicity)
		}
	}
	
	def asTrace(Trace<? extends EAttributeMapper> trace) { return trace as EAttributeMapper_RelationsOverTypes_Trace}
	
	override IsAttributeValue(Ecore2Logic_Trace trace, TermDescription object, TermDescription value, EAttribute attribute) {
		trace.attributeMapperTrace.asTrace.indicators.get(attribute).call(object,value)
	}
	
	override TypeDescriptor TypeOfRange(Ecore2Logic_Trace trace, EAttribute attribute) {
		if(attribute.EType instanceof EEnum) return enumMapper.TypeofEEnum(trace,attribute.EType as EEnum)
		else if(attribute.EType.name.equals("EInt")) return LogicInt
		else if(attribute.EType.name.equals("EBoolean")) return LogicBool
		else if(attribute.EType.name.equals("EDouble") ||
			    attribute.EType.name.equals("EFloat")) return LogicReal
		else if(attribute.EType.name.equals("EDouble")) return LogicString
		else throw new UnsupportedOperationException('''Unsupported attribute type: «attribute.EType.name»''')
	}
	
	override relationOfAttribute(Ecore2Logic_Trace trace, EAttribute attribute) {
		trace.attributeMapperTrace.asTrace.indicators.get(attribute)
	}
	
	override allAttributesInScope(Ecore2Logic_Trace trace) {
		trace.attributeMapperTrace.asTrace.indicators.keySet
	}
	
}