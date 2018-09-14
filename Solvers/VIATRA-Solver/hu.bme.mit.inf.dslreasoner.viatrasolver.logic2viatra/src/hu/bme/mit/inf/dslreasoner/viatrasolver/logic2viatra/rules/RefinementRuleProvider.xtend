package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.rules

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.ModelGenerationStatistics
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.ScopePropagator
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns.GeneratedPatterns
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns.ObjectCreationPrecondition
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationFactory
import java.util.LinkedHashMap
import org.eclipse.viatra.query.runtime.api.GenericPatternMatch
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory

class RefinementRuleProvider {
	private extension BatchTransformationRuleFactory factory = new BatchTransformationRuleFactory
	private extension PartialinterpretationFactory factory2 = PartialinterpretationFactory.eINSTANCE
	private extension LogiclanguageFactory factory3 = LogiclanguageFactory.eINSTANCE
	
	def canonizeName(String name) {
		return name.replace(' ','_')
	}
	
	def LinkedHashMap<ObjectCreationPrecondition, BatchTransformationRule<GenericPatternMatch, ViatraQueryMatcher<GenericPatternMatch>>> 
		createObjectRefinementRules(
			GeneratedPatterns patterns,
			ScopePropagator scopePropagator,
			boolean nameNewElement,
			ModelGenerationStatistics statistics
		)
	{		
		val res = new LinkedHashMap
		for(LHSEntry: patterns.refineObjectQueries.entrySet) {
			val containmentRelation = LHSEntry.key.containmentRelation
			val inverseRelation = LHSEntry.key.inverseContainment
			val type = LHSEntry.key.newType
			val lhs = LHSEntry.value as IQuerySpecification<ViatraQueryMatcher<GenericPatternMatch>>
			val rule = createObjectCreationRule(containmentRelation,inverseRelation,type,lhs,nameNewElement,scopePropagator,statistics)
			res.put(LHSEntry.key,rule)
		}
		return res
	}
	
	def private createObjectCreationRule(
		Relation containmentRelation,
		Relation inverseRelation,
		Type type,
		IQuerySpecification<ViatraQueryMatcher<GenericPatternMatch>> lhs,
		boolean nameNewElement,
		ScopePropagator scopePropagator,
		ModelGenerationStatistics statistics)
	{
		val name = '''addObject_«type.name.canonizeName»«
					IF containmentRelation!=null»_by_«containmentRelation.name.canonizeName»«ENDIF»'''
		//println("Rule created: " + name + "> " + lhs.fullyQualifiedName)
		val ruleBuilder = factory.createRule
				.name(name)
				.precondition(lhs)
		if(containmentRelation != null) {
			if(inverseRelation!= null) {
				ruleBuilder.action[match |
					//println(name)
					val startTime = System.nanoTime
					//val problem = match.get(0) as LogicProblem
					val interpretation = match.get(1) as PartialInterpretation
					val relationInterpretation = match.get(2) as PartialRelationInterpretation
					val inverseRelationInterpretation = match.get(3) as PartialRelationInterpretation
					val typeInterpretation = match.get(4) as PartialComplexTypeInterpretation
					val container = match.get(5) as DefinedElement
					
					val newElement = createDefinedElement
					if(nameNewElement) {
						newElement.name = '''new «interpretation.newElements.size»'''
					}
					
					// Existence
					interpretation.newElements+=newElement
					/*interpretation.maxNewElements=interpretation.maxNewElements-1
					if(interpretation.minNewElements > 0) {
						interpretation.minNewElements=interpretation.minNewElements-1
					}*/
					
					// Types
					typeInterpretation.elements += newElement
					typeInterpretation.supertypeInterpretation.forEach[it.elements += newElement]
					// ContainmentRelation
					val newLink1 = factory2.createBinaryElementRelationLink => [it.param1 = container it.param2 = newElement]
					relationInterpretation.relationlinks+=newLink1
					// Inverse Containment
					val newLink2 = factory2.createBinaryElementRelationLink => [it.param1 = newElement it.param2 = container]
					inverseRelationInterpretation.relationlinks+=newLink2
					
					// Scope propagation
					scopePropagator.propagateAdditionToType(typeInterpretation)
					
					statistics.addExecutionTime(System.nanoTime-startTime)
				]
			} else {
				ruleBuilder.action[match |
					//println(name)
					val startTime = System.nanoTime
					//val problem = match.get(0) as LogicProblem
					val interpretation = match.get(1) as PartialInterpretation
					val relationInterpretation = match.get(2) as PartialRelationInterpretation
					val typeInterpretation = match.get(3) as PartialComplexTypeInterpretation
					val container = match.get(4) as DefinedElement
					
					val newElement = createDefinedElement
					if(nameNewElement) {
						newElement.name = '''new «interpretation.newElements.size»'''
					}
					
					// Existence
					interpretation.newElements+=newElement
					/*interpretation.maxNewElements=interpretation.maxNewElements-1
					if(interpretation.minNewElements > 0) {
						interpretation.minNewElements=interpretation.minNewElements-1
					}*/
					
					// Types
					typeInterpretation.elements += newElement
					typeInterpretation.supertypeInterpretation.forEach[it.elements += newElement]
					// ContainmentRelation
					val newLink = factory2.createBinaryElementRelationLink => [it.param1 = container it.param2 = newElement]
					relationInterpretation.relationlinks+=newLink
					
					// Scope propagation
					scopePropagator.propagateAdditionToType(typeInterpretation)
					
					statistics.addExecutionTime(System.nanoTime-startTime)
				]
			}
		} else {
			ruleBuilder.action[match |
				val startTime = System.nanoTime
				//val problem = match.get(0) as LogicProblem
				val interpretation = match.get(1) as PartialInterpretation
				val typeInterpretation = match.get(2) as PartialComplexTypeInterpretation
				
				val newElement = createDefinedElement
				if(nameNewElement) {
					newElement.name = '''new «interpretation.newElements.size»'''
				}
				
				// Existence
				interpretation.newElements+=newElement
				/*
				interpretation.maxNewElements=interpretation.maxNewElements-1
				if(interpretation.minNewElements > 0) {
					interpretation.minNewElements=interpretation.minNewElements-1
				}*/
				
				// Types
				typeInterpretation.elements += newElement
				typeInterpretation.supertypeInterpretation.forEach[it.elements += newElement]
				
				// Scope propagation
				scopePropagator.propagateAdditionToType(typeInterpretation)
				
				statistics.addExecutionTime(System.nanoTime-startTime)
			]
		}
		return ruleBuilder.build
	}
	
	def createRelationRefinementRules(GeneratedPatterns patterns, ModelGenerationStatistics statistics) {
		val res = new LinkedHashMap
		for(LHSEntry: patterns.refinerelationQueries.entrySet) {
			val declaration = LHSEntry.key.key
			val inverseReference = LHSEntry.key.value
			val lhs = LHSEntry.value as IQuerySpecification<ViatraQueryMatcher<GenericPatternMatch>>
			val rule = createRelationRefinementRule(declaration,inverseReference,lhs,statistics)
			res.put(LHSEntry.key,rule)
		}
		return res
	}
	
	def private BatchTransformationRule<GenericPatternMatch, ViatraQueryMatcher<GenericPatternMatch>>
		createRelationRefinementRule(RelationDeclaration declaration, Relation inverseRelation, IQuerySpecification<ViatraQueryMatcher<GenericPatternMatch>> lhs, ModelGenerationStatistics statistics)
	{
		val name = '''addRelation_«declaration.name.canonizeName»«IF inverseRelation != null»_and_«inverseRelation.name.canonizeName»«ENDIF»'''
		val ruleBuilder = factory.createRule
			.name(name)
			.precondition(lhs)
		if (inverseRelation == null) {
			ruleBuilder.action [ match |
			    val startTime = System.nanoTime
				//println(name)
				// val problem = match.get(0) as LogicProblem
				// val interpretation = match.get(1) as PartialInterpretation
				val relationInterpretation = match.get(2) as PartialRelationInterpretation
				val src = match.get(3) as DefinedElement
				val trg = match.get(4) as DefinedElement
				val link = createBinaryElementRelationLink => [it.param1 = src it.param2 = trg]
				relationInterpretation.relationlinks += link
                statistics.addExecutionTime(System.nanoTime-startTime)
			]
		} else {
			ruleBuilder.action [ match |
			    val startTime = System.nanoTime
				//println(name)
				// val problem = match.get(0) as LogicProblem
				// val interpretation = match.get(1) as PartialInterpretation
				val relationInterpretation = match.get(2) as PartialRelationInterpretation
				val inverseInterpretation = match.get(3) as PartialRelationInterpretation
				val src = match.get(4) as DefinedElement
				val trg = match.get(5) as DefinedElement
				val link = createBinaryElementRelationLink => [it.param1 = src it.param2 = trg]
				relationInterpretation.relationlinks += link
				val inverseLink = createBinaryElementRelationLink => [it.param1 = trg it.param2 = src]
				inverseInterpretation.relationlinks += inverseLink
				statistics.addExecutionTime(System.nanoTime-startTime)
			]
		}

		return ruleBuilder.build
	}
}
