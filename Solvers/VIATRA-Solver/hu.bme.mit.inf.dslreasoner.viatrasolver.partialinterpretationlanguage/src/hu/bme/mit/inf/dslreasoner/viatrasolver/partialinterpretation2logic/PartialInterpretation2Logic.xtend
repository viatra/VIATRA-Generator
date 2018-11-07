package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic

import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicProblemBuilder
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.Partial2logicannotationsFactory
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BinaryElementRelationLink
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RelationLink
import java.util.ArrayList
import java.util.HashMap
import java.util.HashSet
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtend.lib.annotations.Data

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PrimitiveElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BooleanElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.IntegerElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RealElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.StringElement

@Data class PartialInterpretation2Logic_Trace {
	Map<DefinedElement,DefinedElement> new2Old = new HashMap
	
	Map<TypeDeclaration, TypeDefinition> definedPart = new HashMap
	Map<TypeDeclaration, TypeDeclaration> undefinedPart = new HashMap
	Set<Type> originalTypes = new HashSet
	Set<TypeDeclaration> splittedTypes = new HashSet
}

class PartialInterpretation2Logic {
	val extension LogiclanguageFactory factory = LogiclanguageFactory.eINSTANCE
	val extension LogicProblemBuilder builder = new LogicProblemBuilder
	
	def transformPartialIntepretation2Logic(LogicProblem p, PartialInterpretation i) {
		val trace = new PartialInterpretation2Logic_Trace()
		trace.originalTypes.addAll(p.types)
		if(! i.newElements.empty) {
			
			// Elements adding
			addExistingElementToProblem(p,i,trace)
			
			// Types
			for(partialTypeDeclaration : i.partialtypeinterpratation.filter(PartialComplexTypeInterpretation)) {
				splitTypeIntoTwo(p,partialTypeDeclaration,trace)
			}
			connectSplittings(p,trace)
			
			// Relations
			for(partialRelationInterpretation : i.partialrelationinterpretation) {
				//println(partialRelationInterpretation.interpretationOf.name)
				relationLinksToAssertion(p,partialRelationInterpretation,trace)
			}
		}
	}
	
	private def addExistingElementToProblem(LogicProblem p, PartialInterpretation i,PartialInterpretation2Logic_Trace trace) {
//		val newElements = new ArrayList(i.newElements)
//		var newElementIndex = 1
//		for(newElement : newElements) {
//			newElement.name = '''o «newElementIndex++»'''
//			p.elements += newElement
//		}
		p.elements += i.newElements.filter[!it instanceof PrimitiveElement]
	}
	
	private def splitTypeIntoTwo(LogicProblem p, PartialComplexTypeInterpretation partialTypeDeclaration,PartialInterpretation2Logic_Trace trace) {
		if(!partialTypeDeclaration.elements.empty) {
			val declaration = partialTypeDeclaration.interpretationOf
			
			val definedPart = createTypeDefinition => [
				it.name = '''«declaration.name» DefinedPart'''
				it.elements += partialTypeDeclaration.elements
				it.isAbstract = declaration.isIsAbstract
			]
			val undefinedPart = createTypeDeclaration => [
				it.name = '''«declaration.name» UndefinedPart'''
				it.isAbstract = declaration.isIsAbstract
			]
			declaration.isAbstract = true
			
			trace.definedPart.put(declaration,definedPart)
			trace.undefinedPart.put(declaration,undefinedPart)
			trace.splittedTypes.add(declaration)
			p.add(definedPart)
			p.add(undefinedPart)
			Supertype(definedPart,declaration)
			Supertype(undefinedPart,declaration)
			
			for(containment : p.containmentHierarchies) {
				if(containment.typesOrderedInHierarchy.contains(declaration)) {
					containment.typesOrderedInHierarchy += definedPart
					containment.typesOrderedInHierarchy += undefinedPart
				}
			}
		}
	}
	
	private def connectSplittings(LogicProblem p,PartialInterpretation2Logic_Trace trace)  {
		val originalTypes = p.types.filter[originalType(trace)].toList
		for(type : originalTypes) {
			val superTypes = new ArrayList(type.supertypes.filter[originalType(trace)].toList)
			for(supertype : superTypes) {
				if(type.isSplitted(trace)) {
					if(supertype.isSplitted(trace)) {
						Supertype((type as TypeDeclaration).lookup(trace.definedPart), (supertype as TypeDeclaration).lookup(trace.definedPart))
						Supertype((type as TypeDeclaration).lookup(trace.undefinedPart), (supertype as TypeDeclaration).lookup(trace.undefinedPart))
					} else {
						// Do nothing
					}
				} else {
					if(supertype.isSplitted(trace)) {
						Supertype(type, (supertype as TypeDeclaration).lookup(trace.undefinedPart))
					} else if(supertype instanceof TypeDefinition) {
						// Do nothing
					}
				}
			}
		}
	}
	
	private def originalType(Type type,PartialInterpretation2Logic_Trace trace) {
		return trace.originalTypes.contains(type)
	}
	private def isSplitted(Type t, PartialInterpretation2Logic_Trace trace) {
		trace.splittedTypes.contains(t)
	}
	
	private def relationLinksToAssertion(LogicProblem p, PartialRelationInterpretation r,PartialInterpretation2Logic_Trace trace) {
		val relation = r.interpretationOf
		val links = r.relationlinks
		if(links.size == 0) {
			// No assertion for empty relations
			return
		} else {
			val term = if(links.size == 1) {
				createLink(links.head,relation)
			} else {
				links.map[link|createLink(link,relation)].And
			}
			val assertion = Assertion('''PartialInterpretation «r.interpretationOf.name»''',term)
			val ^annotation= Partial2logicannotationsFactory.eINSTANCE.createPartialModelRelation2Assertion
			^annotation.target = assertion
			^annotation.targetRelation = relation
			//^annotation.links += links.map[EcoreUtil.copy(it)]
			//val error= assertion.eAllContents.toIterable.filter(SymbolicValue).filter[it.symbolicReference === null] 
			//error.forEach[println("error")]
			p.add(assertion)
			p.annotations+= ^annotation
		}
	}
	
	def private createLink(RelationLink link, SymbolicDeclaration relationDeclaration) {
		if(link instanceof BinaryElementRelationLink) {
			if((link.param1 !== null) && (link.param2 !== null)) {
				return createSymbolicValue=>[
					it.symbolicReference=relationDeclaration
					it.parameterSubstitutions += createValueInLink(link.param1)
					it.parameterSubstitutions += createValueInLink(link.param2)
				]
			} else {
				throw new IllegalArgumentException
			}
		} else throw new UnsupportedOperationException
	}
	
	def private dispatch createValueInLink(BooleanElement element) {
		return element.value.asTerm
	}
	def private dispatch createValueInLink(IntegerElement element) {
		return element.value.asTerm
	}
	def private dispatch createValueInLink(RealElement element) {
		return element.value.asTerm
	}
	def private dispatch createValueInLink(StringElement element) {
		return element.value.asTerm
	}
	def private dispatch createValueInLink(DefinedElement element) {
		return createSymbolicValue => [it.symbolicReference = element]
	}
}