package hu.bme.mit.inf.dslreasoner.logic2ecore

import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicModelInterpretation
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicStructureBuilder
import java.util.Collection
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EcorePackage
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TermDescription
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicProblemBuilder
import java.util.Map

class Logic2Ecore {
	val extension LogicStructureBuilder structureBuilder = new LogicStructureBuilder
	val Ecore2Logic ecore2Logic;
	
	new (Ecore2Logic ecore2Logic) {
		this.ecore2Logic = ecore2Logic
	}
	
	def transformInterpretation(LogicModelInterpretation interpretation, Ecore2Logic_Trace forwardTrace) {
		val allClasses = ecore2Logic.allClassesInScope(forwardTrace)
		val elements = new HashSet
		val element2Classes = new HashMap
		
		for(clazz: allClasses) {
			val type = ecore2Logic.TypeofEClass(forwardTrace,clazz);
			val elementsOfClass = getElements(interpretation,type)
			for(element : elementsOfClass) {
				elements += element
				element2Classes.putOrAddToSet(element,clazz)
			}
		}
		
		val element2Object = new HashMap
		for(element: elements) {
			val clazz = element.lookup(element2Classes).mostConcreteType
			val eobject = clazz.EPackage.EFactoryInstance.create(clazz)
			element2Object.put(element,eobject)
		}
		
		val allReferences = ecore2Logic.allReferencesInScope(forwardTrace)
		for(referenceType : allReferences) {
			if(referenceType.canSetFeature) {
				for(sourceElement : elements) {
					val sourceObject = sourceElement.lookup(element2Object)
					if(referenceType.EContainingClass.isSuperTypeOf(sourceObject.eClass)) {
						for(targetElement: elements) {
							val targetObject = targetElement.lookup(element2Object)
							if(referenceType.EReferenceType.isSuperTypeOf(targetObject.eClass)) {
								val expression = ecore2Logic.IsInReference(forwardTrace,sourceElement,targetElement,referenceType)
								val linkExist = interpretation.evalAsBool(expression)
								if(linkExist) {
									if(referenceType.isMany) {
										val list = sourceObject.eGet(referenceType) as List<? super EObject>
										list+= targetObject
									} else {
										sourceObject.eSet(referenceType,targetObject)
									}
								}
							}
						}
					}
				}
			}
		}
		
		val allAttributes = ecore2Logic.allAttributesInScope(forwardTrace)
		for(attributeType : allAttributes) {
			if(attributeType.canSetFeature) {
				for(sourceElement : elements) {
					val sourceObject = sourceElement.lookup(element2Object)
					if(attributeType.EContainingClass.isSuperTypeOf(sourceObject.eClass)) {
						val allElementsOfTargetDatatype = getAllElementsOfDatatype(attributeType.EAttributeType,forwardTrace,interpretation)
						for(l : allElementsOfTargetDatatype.entrySet) {
							val expression = ecore2Logic.IsAttributeValue(forwardTrace,sourceElement,l.value,attributeType)
							val linkExist = interpretation.evalAsBool(expression)
							if(linkExist) {
								if(attributeType.isMany) {
									val list = sourceObject.eGet(attributeType) as List<? super Object>
									list += l.key
								} else {
									try {
										sourceObject.eSet(attributeType,l.key)
									} catch(Exception e) {
										e.printStackTrace
									}
								}
							}
						}
					}
				}
			}
		}
		
		return element2Object.values.root
	}
	
	
//							if(attributeType.EAttributeType.isSuperTypeOf(targetObject.eClass)) {
//								val expression = ecore2Logic.IsAttributeValue(forwardTrace,sourceElement,targetElement,attributeType)
//								val linkExist = interpretation.evalAsBool(expression)
//								if(linkExist) {
//									if(attributeType.isMany) {
//											val list = sourceObject.eGet(attributeType) as List<? super EObject>
//											list+= targetObject
//										} else {
//											sourceObject.eSet(referenceType,targetObject)
//										}
//								}
//							}
	
	protected dispatch def Map<? extends Object, ? extends TermDescription> getAllElementsOfDatatype(EEnum type, Ecore2Logic_Trace forwardTrace, LogicModelInterpretation interpretation) {
		ecore2Logic.allLiteralsInScope(forwardTrace).toInvertedMap[ecore2Logic.Literal(forwardTrace,it)]
	}
	
	protected dispatch def Map<? extends Object, ? extends TermDescription> getAllElementsOfDatatype(EDataType primitive, Ecore2Logic_Trace forwardTrace, LogicModelInterpretation interpretation) {
		val extension LogicProblemBuilder b = new LogicProblemBuilder
		if(primitive === EcorePackage.eINSTANCE.EInt || primitive === EcorePackage.eINSTANCE.EShort || primitive === EcorePackage.eINSTANCE.ELong) {
			interpretation.allIntegersInStructure.toInvertedMap[it.asTerm]
		} else if(primitive === EcorePackage.eINSTANCE.EDouble || primitive === EcorePackage.eINSTANCE.EFloat) {
			interpretation.allRealsInStructure.toInvertedMap[it.asTerm]
		} else if(primitive === EcorePackage.eINSTANCE.EString) {
			interpretation.allStringsInStructure.toInvertedMap[it.asTerm]
		} else if(primitive === EcorePackage.eINSTANCE.EBoolean) {
			return #[false,true].toInvertedMap[it.asTerm]
		}
	}
	
	
	private def canSetFeature(EStructuralFeature feature) {
		feature.changeable && !feature.derived
	}
	
	def  mostConcreteType(Set<EClass> classes) {
		for(candidate : classes) {
			val subtypeOfAll = classes.forall[it.isSuperTypeOf(candidate)]
			if(subtypeOfAll) {
				if(candidate.abstract || candidate.isInterface) {
					throw new AssertionError('''Object has abstract concrete type! Types: [«FOR c:classes SEPARATOR ","»«c.name»«ENDFOR»]''')
				} else {
					return candidate
				}
			}
		}
		throw new AssertionError('''Object has no unique concrete type! Types: [«FOR c:classes SEPARATOR ","»«c.name»«ENDFOR»]''')
	}
	
	def getRoot(Collection<EObject> objects) {
		val rootCandidates = objects.filter[eContainer === null]
		if(rootCandidates.size == 1) {
			return rootCandidates.head
		} else {
			println('''No single root objects: «rootCandidates.size»''')
			return rootCandidates.head
		}
	}
}