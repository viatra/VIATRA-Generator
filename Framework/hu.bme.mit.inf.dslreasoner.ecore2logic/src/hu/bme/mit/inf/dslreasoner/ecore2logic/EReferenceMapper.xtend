package hu.bme.mit.inf.dslreasoner.ecore2logic

import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsFactory
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicProblemBuilder
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Assertion
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Term
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TermDescription
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EReference

interface EReferenceMapper{
	def void transformEReferences(Ecore2Logic_Trace trace, LogicProblem problem, Iterable<EReference> classes);
	def Iterable<EReference> allReferencesInScope(Ecore2Logic_Trace trace) 
	def Term IsInReference(Ecore2Logic_Trace trace, TermDescription source, TermDescription target, EReference type)
	def RelationDeclaration relationOfReference(Ecore2Logic_Trace trace, EReference reference)
}

class EReferenceMapper_RelationsOverTypes_Trace implements Trace<EReferenceMapper_RelationsOverTypes> {
	public var Map<EReference, RelationDeclaration> indicators;
	public var Map<EReference, Assertion> typeCompliance
	public var Map<EReference, Assertion> lowerMultiplicity
	public var Map<EReference, Assertion> upperMultiplicity
	public var Map<EReference, Assertion> inverseEdges
}

class EReferenceMapper_RelationsOverTypes implements EReferenceMapper{
	val extension LogicProblemBuilder builder = new LogicProblemBuilder
	val extension Ecore2logicannotationsFactory builder2 = Ecore2logicannotationsFactory.eINSTANCE
	val extension EClassMapper classMapper;
	
	public new(EClassMapper classMapper) {
		this.classMapper = classMapper
	}
	
	def asTrace(Trace<? extends EReferenceMapper> o) { o as EReferenceMapper_RelationsOverTypes_Trace }
	
	override transformEReferences(Ecore2Logic_Trace trace, LogicProblem problem, Iterable<EReference> references) {
		val newTrace = new EReferenceMapper_RelationsOverTypes_Trace
		trace.referenceMapperTrace = newTrace
		trace.createIndicatorDeclarations(problem,references)
		trace.createMultiplicityConstraints(problem,references)
		trace.createInverseReferenceConstraints(problem,references)
	}
	
	def protected void createIndicatorDeclarations(Ecore2Logic_Trace trace, LogicProblem problem, Iterable<EReference> references) {
		trace.referenceMapperTrace.asTrace.indicators = new HashMap
		for(reference : references) {
			val relation = problem.add(RelationDeclaration(
				'''inreference «reference.name» «reference.EContainingClass.name»''',
				TypeofEClass(trace,reference.EContainingClass),
				TypeofEClass(trace,reference.EType as EClass)))
			trace.referenceMapperTrace.asTrace.indicators.put(reference,relation as RelationDeclaration)
		}
	}
	
	def void createMultiplicityConstraints(Ecore2Logic_Trace trace, LogicProblem problem, Iterable<EReference> references) {
		trace.referenceMapperTrace.asTrace.lowerMultiplicity = new HashMap
		trace.referenceMapperTrace.asTrace.upperMultiplicity = new HashMap
		
		for(reference : references) {
			val sourceType = reference.EContainingClass
			val targetType = reference.EType as EClass
			val lower = reference.lowerBound
			val upper = reference.upperBound
			
			if (lower > 0) {
				val assertion = Assertion('''lowerMultiplicity «reference.name» «sourceType.name»''',
					Forall[
						val source = addVar('''src''', trace.TypeofEClass(sourceType))
						Exists[ context |
							val targets = (1 .. lower).map[
								context.addVar('''trg «it»''', trace.TypeofEClass(targetType))].toList
							val inReference = And(targets.map[IsInReference(trace, source, it, reference)])
							if(targets.size > 1) return Distinct(targets) && inReference
							else return inReference
						]
					]
				)
				val annotation = createLowerMultiplicityAssertion => [
					it.lower = lower
					it.relation = trace.referenceMapperTrace.asTrace.indicators.get(reference)
				]
				
				problem.add(assertion)
				problem.annotations += annotation
				assertion.annotations +=annotation
				trace.referenceMapperTrace.asTrace.lowerMultiplicity.put(reference,assertion)
			}
			else trace.referenceMapperTrace.asTrace.lowerMultiplicity.put(reference,null)
			
			if(upper != -1) {
				val assertion = Assertion('''upperMultiplicity «reference.name» «sourceType.name»''',
					Forall[ context |
						val source = context.addVar('''src''', trace.TypeofEClass(sourceType))
						val targets = (1 .. upper+1).map[
								context.addVar('''trg «it»''', trace.TypeofEClass(targetType))].toList
						And(targets.map[IsInReference(trace, source, it, reference)]) => ! Distinct(targets)
					])
				val annotation = createUpperMultiplicityAssertion => [
					it.upper = upper
					it.relation = trace.referenceMapperTrace.asTrace.indicators.get(reference)
				]
				
				problem.add(assertion)
				problem.annotations += annotation
				assertion.annotations += annotation
				trace.referenceMapperTrace.asTrace.lowerMultiplicity.put(reference,assertion)
			}
			else trace.referenceMapperTrace.asTrace.upperMultiplicity.put(reference,null)
		}
	}
	
	def createInverseReferenceConstraints(Ecore2Logic_Trace trace, LogicProblem problem, Iterable<EReference> references) {
		trace.referenceMapperTrace.asTrace.inverseEdges = new HashMap
		for(reference : references) {
			if(reference.EOpposite!=null) {
				val opposite = reference.EOpposite
				if(trace.referenceMapperTrace.asTrace.inverseEdges.containsKey(opposite)) {
					trace.referenceMapperTrace.asTrace.inverseEdges.put(reference,trace.referenceMapperTrace.asTrace.inverseEdges.get(opposite))
				} else {
					val sourceType = reference.EContainingClass
					val targetType = reference.EType as EClass
					val assertion = Assertion('''oppositeReference «reference.name» «sourceType.name»''',
						Forall[
							val src = addVar('''src''', trace.TypeofEClass(sourceType))
							val trg = addVar('''trg''', trace.TypeofEClass(targetType))
							IsInReference(trace,src,trg,reference) <=> IsInReference(trace,trg,src,opposite)
						]
					)
					problem.add(assertion)
					trace.referenceMapperTrace.asTrace.inverseEdges.put(reference,assertion)
					val annotation = createInverseRelationAssertion => [
						it.target = assertion
						it.inverseA = trace.referenceMapperTrace.asTrace.indicators.get(reference)
						it.inverseB = trace.referenceMapperTrace.asTrace.indicators.get(reference.EOpposite)
					]
					problem.annotations += annotation
				}
			}
			else trace.referenceMapperTrace.asTrace.inverseEdges.put(reference,null)
		}
	}
	
	override IsInReference(Ecore2Logic_Trace trace, TermDescription source, TermDescription target, EReference type) {
		trace.referenceMapperTrace.asTrace.indicators.get(type).call(source,target)
	}
	
	override relationOfReference(Ecore2Logic_Trace trace, EReference reference) {
		trace.referenceMapperTrace.asTrace.indicators.get(reference)
	}
	
	override allReferencesInScope(Ecore2Logic_Trace trace) {
		trace.referenceMapperTrace.asTrace.indicators.keySet
	}
	
}