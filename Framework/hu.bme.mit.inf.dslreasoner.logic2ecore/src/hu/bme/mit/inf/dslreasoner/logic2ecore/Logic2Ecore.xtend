package hu.bme.mit.inf.dslreasoner.logic2ecore

import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicModelInterpretation
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicProblemBuilder
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicStructureBuilder
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TermDescription
import java.math.BigDecimal
import java.util.Collection
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EcorePackage

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

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
							val expression = ecore2Logic.IsAttributeValue(forwardTrace,sourceElement,l.key,attributeType)
							val linkExist = interpretation.evalAsBool(expression)
							if(linkExist) {
								if(attributeType.isMany) {
									val list = sourceObject.eGet(attributeType) as List<? super Object>
									list += l.value
								} else {
									try {
										sourceObject.eSet(attributeType,translateType(attributeType.EAttributeType,l.value))
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
	
	def translateType(EDataType type, Object value) {
		if(type == EcorePackage.eINSTANCE.EFloat) {
			val bd = value as BigDecimal
			return bd.floatValue
		} else if( type  == EcorePackage.eINSTANCE.EDouble ) {
			val bd = value as BigDecimal
			return bd.doubleValue
		} else return value
	}
	
	protected dispatch def Map<? extends TermDescription, ? extends Object> getAllElementsOfDatatype(EEnum type, Ecore2Logic_Trace forwardTrace, LogicModelInterpretation interpretation) {
		ecore2Logic.allLiteralsInScope(forwardTrace).toMap[ecore2Logic.Literal(forwardTrace,it)]
	}
	
	protected dispatch def Map<? extends TermDescription, ? extends Object> getAllElementsOfDatatype(EDataType primitive, Ecore2Logic_Trace forwardTrace, LogicModelInterpretation interpretation) {
		val extension LogicProblemBuilder b = new LogicProblemBuilder
		if(primitive === EcorePackage.eINSTANCE.EInt || primitive === EcorePackage.eINSTANCE.EShort || primitive === EcorePackage.eINSTANCE.ELong) {
			interpretation.allIntegersWithInterpretation
		} else if(primitive === EcorePackage.eINSTANCE.EDouble || primitive === EcorePackage.eINSTANCE.EFloat) {
			interpretation.allRealsWithInterpretation
		} else if(primitive === EcorePackage.eINSTANCE.EString) {
			interpretation.allStringsWithInterpretation
		} else if(primitive === EcorePackage.eINSTANCE.EBoolean) {
			interpretation.allBooleansWithInterpretation
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