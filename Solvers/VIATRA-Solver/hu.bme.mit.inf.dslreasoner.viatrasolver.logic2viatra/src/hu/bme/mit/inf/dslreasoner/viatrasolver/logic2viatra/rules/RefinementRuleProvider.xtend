package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.rules

import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.InverseRelationAssertion
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.LowerMultiplicityAssertion
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IntTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.PrimitiveTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RealTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.StringTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.ModelGenerationStatistics
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.ScopePropagator
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns.GeneratedPatterns
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns.ObjectCreationPrecondition
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialBooleanInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialIntegerInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRealInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialStringInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationFactory
import java.util.HashMap
import java.util.LinkedHashMap
import java.util.LinkedList
import java.util.List
import java.util.Map
import org.eclipse.viatra.query.runtime.api.GenericPatternMatch
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.xtext.xbase.lib.Functions.Function0

class RefinementRuleProvider {
	val extension BatchTransformationRuleFactory factory = new BatchTransformationRuleFactory
	val extension PartialinterpretationFactory factory2 = PartialinterpretationFactory.eINSTANCE
	val extension LogiclanguageFactory factory3 = LogiclanguageFactory.eINSTANCE
	
	def canonizeName(String name) {
		return name.replace(' ','_')
	}
	
	def LinkedHashMap<ObjectCreationPrecondition, BatchTransformationRule<GenericPatternMatch, ViatraQueryMatcher<GenericPatternMatch>>> createObjectRefinementRules(
			LogicProblem p,
			PartialInterpretation i,
			GeneratedPatterns patterns,
			ScopePropagator scopePropagator,
			boolean nameNewElement,
			ModelGenerationStatistics statistics
		)
	{
		val res = new LinkedHashMap
		val recursiveObjectCreation = recursiveObjectCreation(p,i)
		for(LHSEntry: patterns.refineObjectQueries.entrySet) {
			val containmentRelation = LHSEntry.key.containmentRelation
			val inverseRelation = LHSEntry.key.inverseContainment
			val type = LHSEntry.key.newType
			val lhs = LHSEntry.value as IQuerySpecification<ViatraQueryMatcher<GenericPatternMatch>>
			val rule = createObjectCreationRule(p,containmentRelation,inverseRelation,type,recursiveObjectCreation.get(type),lhs,nameNewElement,scopePropagator,statistics)
			res.put(LHSEntry.key,rule)
		}
		return res
	}
	
	def private createObjectCreationRule(
		LogicProblem p,
		Relation containmentRelation,
		Relation inverseRelation,
		Type type,
		List<ObjectCreationInterpretationData> recursiceObjectCreations,
		IQuerySpecification<ViatraQueryMatcher<GenericPatternMatch>> lhs,
		boolean nameNewElement,
		ScopePropagator scopePropagator,
		ModelGenerationStatistics statistics)
	{
		val name = '''addObject_«type.name.canonizeName»«
					IF containmentRelation!==null»_by_«containmentRelation.name.canonizeName»«ENDIF»'''
		val ruleBuilder = factory.createRule(lhs)
				.name(name)
		if(containmentRelation !== null) {
			if(inverseRelation!== null) {
				ruleBuilder.action[match |
					statistics.incrementTransformationCount
//					println(name)
					val startTime = System.nanoTime
					//val problem = match.get(0) as LogicProblem
					val interpretation = match.get(1) as PartialInterpretation
					val relationInterpretation = match.get(2) as PartialRelationInterpretation
					val inverseRelationInterpretation = match.get(3) as PartialRelationInterpretation
					val typeInterpretation = match.get(4) as PartialComplexTypeInterpretation
					val container = match.get(5) as DefinedElement
					
					createObjectActionWithContainmentAndInverse(
						nameNewElement,
						interpretation,
						typeInterpretation,
						container,
						relationInterpretation,
						inverseRelationInterpretation,
						[createDefinedElement],
						recursiceObjectCreations,
						scopePropagator
					)
					
					val propagatorStartTime = System.nanoTime
					statistics.addExecutionTime(propagatorStartTime-startTime)
					
					// Scope propagation
					scopePropagator.propagateAllScopeConstraints()
					statistics.addScopePropagationTime(System.nanoTime-propagatorStartTime)
				]
			} else {
				ruleBuilder.action[match |
					statistics.incrementTransformationCount
//					println(name)
					val startTime = System.nanoTime
					//val problem = match.get(0) as LogicProblem
					val interpretation = match.get(1) as PartialInterpretation
					val relationInterpretation = match.get(2) as PartialRelationInterpretation
					val typeInterpretation = match.get(3) as PartialComplexTypeInterpretation
					val container = match.get(4) as DefinedElement
					
					createObjectActionWithContainment(
						nameNewElement,
						interpretation,
						typeInterpretation,
						container,
						relationInterpretation,
						[createDefinedElement],
						recursiceObjectCreations,
						scopePropagator
					)
					
					val propagatorStartTime = System.nanoTime
					statistics.addExecutionTime(propagatorStartTime-startTime)
					
					// Scope propagation
					scopePropagator.propagateAllScopeConstraints()
					statistics.addScopePropagationTime(System.nanoTime-propagatorStartTime)
				]
			}
		} else {
			ruleBuilder.action[match |
				statistics.incrementTransformationCount
//				println(name)
				val startTime = System.nanoTime
				//val problem = match.get(0) as LogicProblem
				val interpretation = match.get(1) as PartialInterpretation
				val typeInterpretation = match.get(2) as PartialComplexTypeInterpretation

				createObjectAction(
					nameNewElement,
					interpretation,
					typeInterpretation,
					[createDefinedElement],
					recursiceObjectCreations,
					scopePropagator
				)
				
				val propagatorStartTime = System.nanoTime
				statistics.addExecutionTime(propagatorStartTime-startTime)
				
				// Scope propagation
				scopePropagator.propagateAllScopeConstraints()
				statistics.addScopePropagationTime(System.nanoTime-propagatorStartTime)
			]
		}
		return ruleBuilder.build
	}
	
	def private recursiveObjectCreation(LogicProblem p, PartialInterpretation i) {
		val Map<Type,List<ObjectCreationInterpretationData>> recursiveObjectCreation = new HashMap
		for(type : p.types) {
			recursiveObjectCreation.put(type,new LinkedList)
		}
		
		val containmentReferences = p.containmentHierarchies.head.containmentRelations
		
		for(relationInterpretation : i.partialrelationinterpretation) {
			val relation = relationInterpretation.interpretationOf
			val lowermultiplicities = p.annotations.filter(LowerMultiplicityAssertion).filter[it.relation === relation]
			if((!lowermultiplicities.empty)) {
				val number = lowermultiplicities.head.lower
				if(number > 0) {
					val sourceTypeInterpretation = getTypeInterpretation(i, relation, 0) as PartialComplexTypeInterpretation
					val subtypeInterpretations = i.partialtypeinterpratation.filter(PartialComplexTypeInterpretation).filter[
						it === sourceTypeInterpretation ||
						it.supertypeInterpretation.contains(sourceTypeInterpretation)
					]
					
					if(containmentReferences.contains(relation)) {
						val targetTypeInterpretation = getTypeInterpretation(i, relation, 1)
						val targetType = (targetTypeInterpretation as PartialComplexTypeInterpretation).interpretationOf
						if((!targetType.isIsAbstract) && (targetType.supertypes.empty)) {
							val inverseAnnotation = p.annotations.filter(InverseRelationAssertion).filter[it.inverseA === relation || it.inverseB === relation]
							if(!inverseAnnotation.empty) {
								val onlyInverseAnnotation = if(inverseAnnotation.head.inverseA===relation) {
									inverseAnnotation.head.inverseB
								} else {
									inverseAnnotation.head.inverseA
								}
								val inverseRelationInterpretation = i.partialrelationinterpretation.filter[it.interpretationOf === onlyInverseAnnotation].head
								for(subTypeInterpretation : subtypeInterpretations) {
									for(var times=0; times<number; times++) {
										recursiveObjectCreation.get(subTypeInterpretation.interpretationOf) += 
											new ObjectCreationInterpretationData(
												i,
												targetTypeInterpretation,
												relationInterpretation,
												inverseRelationInterpretation,
												targetTypeInterpretation.getTypeConstructor
											)
									}
								}
							} else {
								for(subTypeInterpretation : subtypeInterpretations) {
									for(var times=0; times<number; times++) {
										recursiveObjectCreation.get(subTypeInterpretation.interpretationOf) += 
											new ObjectCreationInterpretationData(
												i,
												targetTypeInterpretation,
												relationInterpretation,
												null,
												targetTypeInterpretation.getTypeConstructor
											)
									}
								}
							}
						}
					} else if(relation.parameters.get(1) instanceof PrimitiveTypeReference) {
						val targetTypeInterpretation = getTypeInterpretation(i, relation, 1)
						for(subTypeInterpretation : subtypeInterpretations) {
							for(var times=0; times<number; times++) {
								recursiveObjectCreation.get(subTypeInterpretation.interpretationOf) += 
									new ObjectCreationInterpretationData(
										i,
										targetTypeInterpretation,
										relationInterpretation,
										null,
										targetTypeInterpretation.getTypeConstructor
									)
							}
						}
					}
				}
			}
		}
		
		// Doing the recursion
		var objectCreations = new LinkedList(recursiveObjectCreation.values.flatten.toList)
		for(objectCreation : objectCreations) {
			val newInterpretation = objectCreation.typeInterpretation
			if(newInterpretation instanceof PartialComplexTypeInterpretation) {
				val newlyCreatedType = newInterpretation.interpretationOf
				if(recursiveObjectCreation.containsKey(newlyCreatedType)) {
					val actionsWhenTypeCreated = recursiveObjectCreation.get(newlyCreatedType)
					objectCreation.recursiveConstructors+=actionsWhenTypeCreated
				}
			}
		}
		
		// checking acyclicity
		for(objectCreation : objectCreations) {
			var reachable = objectCreation.recursiveConstructors
			do {
				if(reachable.contains(objectCreation)) {
					throw new IllegalArgumentException('''Cicrle in the containment!''')
				} else {
					reachable = reachable.map[it.recursiveConstructors].flatten.toList
				}
			} while(!reachable.empty)
		}	
		
		return recursiveObjectCreation
	}
	
	private def getTypeInterpretation(PartialInterpretation i, RelationDeclaration relation, int index) {
		val typeReference = relation.parameters.get(index)
		return getTypeInterpretation(i,typeReference)
		
	}
	private dispatch def getTypeInterpretation(PartialInterpretation i, ComplexTypeReference reference) {
		return i.partialtypeinterpratation
				.filter(PartialComplexTypeInterpretation)
				.filter[it.getInterpretationOf == reference.referred]
				.head
	}
	private dispatch def getTypeInterpretation(PartialInterpretation i, BoolTypeReference reference) {
		return i.partialtypeinterpratation
				.filter(PartialBooleanInterpretation)
				.head
	}
	private dispatch def getTypeInterpretation(PartialInterpretation i, IntTypeReference reference) {
		return i.partialtypeinterpratation
				.filter(PartialIntegerInterpretation)
				.head
	}
	private dispatch def getTypeInterpretation(PartialInterpretation i, RealTypeReference reference) {
		return i.partialtypeinterpratation
				.filter(PartialRealInterpretation)
				.head
	}
	private dispatch def getTypeInterpretation(PartialInterpretation i, StringTypeReference reference) {
		return i.partialtypeinterpratation
				.filter(PartialStringInterpretation)
				.head
	}
	private dispatch def Function0<DefinedElement> getTypeConstructor(PartialComplexTypeInterpretation reference) { [createDefinedElement] }
	private dispatch def Function0<DefinedElement> getTypeConstructor(PartialBooleanInterpretation reference) { [createBooleanElement] }
	private dispatch def Function0<DefinedElement> getTypeConstructor(PartialIntegerInterpretation reference) { [createIntegerElement] }
	private dispatch def Function0<DefinedElement> getTypeConstructor(PartialRealInterpretation reference) { [createRealElement] }
	private dispatch def Function0<DefinedElement> getTypeConstructor(PartialStringInterpretation reference) { [createStringElement] }
	
	
	def createRelationRefinementRules(GeneratedPatterns patterns, ScopePropagator scopePropagator, ModelGenerationStatistics statistics) {
		val res = new LinkedHashMap
		for(LHSEntry: patterns.refinerelationQueries.entrySet) {
			val declaration = LHSEntry.key.key
			val inverseReference = LHSEntry.key.value
			val lhs = LHSEntry.value as IQuerySpecification<ViatraQueryMatcher<GenericPatternMatch>>
			val rule = createRelationRefinementRule(declaration,inverseReference,lhs,scopePropagator,statistics)
			res.put(LHSEntry.key,rule)
		}
		return res
	}
	
	def private BatchTransformationRule<GenericPatternMatch, ViatraQueryMatcher<GenericPatternMatch>>
		createRelationRefinementRule(RelationDeclaration declaration, Relation inverseRelation, IQuerySpecification<ViatraQueryMatcher<GenericPatternMatch>> lhs, ScopePropagator scopePropagator, ModelGenerationStatistics statistics)
	{
		val name = '''addRelation_«declaration.name.canonizeName»«IF inverseRelation !== null»_and_«inverseRelation.name.canonizeName»«ENDIF»'''
		val ruleBuilder = factory.createRule(lhs)
			.name(name)
		if (inverseRelation === null) {
			ruleBuilder.action [ match |
				statistics.incrementTransformationCount
			    val startTime = System.nanoTime
//				println(name)
				// val problem = match.get(0) as LogicProblem
				// val interpretation = match.get(1) as PartialInterpretation
				val relationInterpretation = match.get(2) as PartialRelationInterpretation
				val src = match.get(3) as DefinedElement
				val trg = match.get(4) as DefinedElement
				
				createRelationLinkAction(src, trg, relationInterpretation)
				
				val propagatorStartTime = System.nanoTime
				statistics.addExecutionTime(propagatorStartTime-startTime)
				
				// Scope propagation
				scopePropagator.propagateAdditionToRelation(declaration)
				statistics.addScopePropagationTime(System.nanoTime-propagatorStartTime)
			]
		} else {
			ruleBuilder.action [ match |
				statistics.incrementTransformationCount
			    val startTime = System.nanoTime
//				println(name)
				// val problem = match.get(0) as LogicProblem
				// val interpretation = match.get(1) as PartialInterpretation
				val relationInterpretation = match.get(2) as PartialRelationInterpretation
				val inverseInterpretation = match.get(3) as PartialRelationInterpretation
				val src = match.get(4) as DefinedElement
				val trg = match.get(5) as DefinedElement

				createRelationLinkWithInverse(src, trg, relationInterpretation, inverseInterpretation)
				
				val propagatorStartTime = System.nanoTime
				statistics.addExecutionTime(propagatorStartTime-startTime)
				
				// Scope propagation
				scopePropagator.propagateAdditionToRelation(declaration)
				statistics.addScopePropagationTime(System.nanoTime-propagatorStartTime)
			]
		}

		return ruleBuilder.build
	}
	
	/////////////////////////
	// Actions
	/////////////////////////
	
	protected def void createObjectAction(boolean nameNewElement, ObjectCreationInterpretationData data, DefinedElement container, ScopePropagator scopePropagator) {
		if(data.containerInterpretation !== null) {
			if(data.containerInverseInterpretation !== null) {
				createObjectActionWithContainmentAndInverse(
					nameNewElement,
					data.interpretation,
					data.typeInterpretation,
					container,
					data.containerInterpretation,
					data.containerInverseInterpretation,
					data.constructor,
					data.recursiveConstructors,
					scopePropagator
				)
			} else {
				createObjectActionWithContainment(
					nameNewElement,
					data.interpretation,
					data.typeInterpretation,
					container,
					data.containerInterpretation,
					data.constructor,
					data.recursiveConstructors,
					scopePropagator
				)
			}
		} else {
			createObjectAction(
				nameNewElement,
				data.interpretation,
				data.typeInterpretation,
				data.constructor,
				data.recursiveConstructors,
				scopePropagator
			)
		}
		
	}
	
	protected def createObjectActionWithContainmentAndInverse(
		boolean nameNewElement,
		PartialInterpretation interpretation,
		PartialTypeInterpratation typeInterpretation,
		DefinedElement container,
		PartialRelationInterpretation relationInterpretation,
		PartialRelationInterpretation inverseRelationInterpretation,
		Function0<DefinedElement> constructor,
		List<ObjectCreationInterpretationData> recursiceObjectCreations,
		ScopePropagator scopePropagator
	) {
		val newElement = constructor.apply
		if(nameNewElement) {
			newElement.name = '''new «interpretation.newElements.size»'''
		}
		
		// Types
		typeInterpretation.elements += newElement
		if(typeInterpretation instanceof PartialComplexTypeInterpretation) {
			typeInterpretation.supertypeInterpretation.forEach[it.elements += newElement]
		}
		// ContainmentRelation
		val newLink1 = factory2.createBinaryElementRelationLink => [it.param1 = container it.param2 = newElement]
		relationInterpretation.relationlinks+=newLink1
		// Inverse Containment
		val newLink2 = factory2.createBinaryElementRelationLink => [it.param1 = newElement it.param2 = container]
		inverseRelationInterpretation.relationlinks+=newLink2
		
		// Scope propagation
		scopePropagator.decrementTypeScope(typeInterpretation)
		
		// Existence
		interpretation.newElements+=newElement
		
		// Do recursive object creation
		for(newConstructor : recursiceObjectCreations) {
			createObjectAction(nameNewElement,newConstructor,newElement,scopePropagator)
		}
		
		return newElement
	}
	
	protected def createObjectActionWithContainment(
		boolean nameNewElement,
		PartialInterpretation interpretation,
		PartialTypeInterpratation typeInterpretation,
		DefinedElement container,
		PartialRelationInterpretation relationInterpretation,
		Function0<DefinedElement> constructor,
		List<ObjectCreationInterpretationData> recursiceObjectCreations,
		ScopePropagator scopePropagator
	) {
		val newElement = constructor.apply
		if(nameNewElement) {
			newElement.name = '''new «interpretation.newElements.size»'''
		}
		
		// Types
		typeInterpretation.elements += newElement
		if(typeInterpretation instanceof PartialComplexTypeInterpretation) {
			typeInterpretation.supertypeInterpretation.forEach[it.elements += newElement]
		}
		// ContainmentRelation
		val newLink = factory2.createBinaryElementRelationLink => [it.param1 = container it.param2 = newElement]
		relationInterpretation.relationlinks+=newLink
		
		// Scope propagation
		scopePropagator.decrementTypeScope(typeInterpretation)
		
		// Existence
		interpretation.newElements+=newElement
		
		// Do recursive object creation
		for(newConstructor : recursiceObjectCreations) {
			createObjectAction(nameNewElement,newConstructor,newElement,scopePropagator)
		}
		
		return newElement
	}
	
	protected def createObjectAction(
		boolean nameNewElement,
		PartialInterpretation interpretation,
		PartialTypeInterpratation typeInterpretation,
		Function0<DefinedElement> constructor,
		List<ObjectCreationInterpretationData> recursiceObjectCreations,
		ScopePropagator scopePropagator)
	{
		val newElement = constructor.apply
		if(nameNewElement) {
			newElement.name = '''new «interpretation.newElements.size»'''
		}
		
		// Types
		typeInterpretation.elements += newElement
		if(typeInterpretation instanceof PartialComplexTypeInterpretation) {
			typeInterpretation.supertypeInterpretation.forEach[it.elements += newElement]
		}
		
		// Scope propagation
		scopePropagator.decrementTypeScope(typeInterpretation)
		
		// Existence
		interpretation.newElements+=newElement
		
		// Do recursive object creation
		for(newConstructor : recursiceObjectCreations) {
			createObjectAction(nameNewElement,newConstructor,newElement,scopePropagator)
		}
		
		return newElement
	}
	
	protected def boolean createRelationLinkAction(DefinedElement src, DefinedElement trg, PartialRelationInterpretation relationInterpretation) {
		val link = createBinaryElementRelationLink => [it.param1 = src it.param2 = trg]
		relationInterpretation.relationlinks += link
	}
	
	protected def boolean createRelationLinkWithInverse(DefinedElement src, DefinedElement trg, PartialRelationInterpretation relationInterpretation, PartialRelationInterpretation inverseInterpretation) {
		val link = createBinaryElementRelationLink => [it.param1 = src it.param2 = trg]
		relationInterpretation.relationlinks += link
		val inverseLink = createBinaryElementRelationLink => [it.param1 = trg it.param2 = src]
		inverseInterpretation.relationlinks += inverseLink
	}
}

@Data
class ObjectCreationInterpretationData {
	PartialInterpretation interpretation
	PartialTypeInterpratation typeInterpretation
	PartialRelationInterpretation containerInterpretation
	PartialRelationInterpretation containerInverseInterpretation
	Function0<DefinedElement> constructor
	List<ObjectCreationInterpretationData> recursiveConstructors = new LinkedList
}
