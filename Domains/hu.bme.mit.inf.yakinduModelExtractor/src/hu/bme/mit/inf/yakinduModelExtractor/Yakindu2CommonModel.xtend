package hu.bme.mit.inf.yakinduModelExtractor

import org.yakindu.sct.model.sgraph.Statechart
import org.yakindu.sct.model.sgraph.SGraphPackage
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummFactory
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EClass
import java.util.HashMap
import org.eclipse.emf.ecore.EReference
import java.util.List

class Yakindu2CommonModel {
	val yakinduSGraphPackage = org.yakindu.sct.model.sgraph.SGraphPackage.eINSTANCE
	val commonSGraphPackage = YakindummPackage.eINSTANCE
	val extension YakindummFactory factory = YakindummFactory.eINSTANCE
	
	def transform(Statechart s) {
		val o2o = new HashMap
		o2o.put(s,s.copyObject)
		for(content: s.eAllContents.toIterable) {
			val copied = content.copyObject
			if(copied !== null) {
				o2o.put(content,copied)
			}
		}
		
		for(sourceObjectEntry : o2o.entrySet) {
			val originalSource = sourceObjectEntry.key
			val copiedSource = sourceObjectEntry.value
			for(originalReference : originalSource.eClass.EAllReferences) {
				if(originalReference.isMany) {
					val originalTargets = originalSource.eGet(originalReference) as List<? extends EObject>
					for(originalTarget : originalTargets) {
						if(o2o.containsKey(originalTarget)) {
							copyReference(originalReference,copiedSource,o2o.get(originalTarget))
						}
					}
				} else {
					val originalTarget = originalSource.eGet(originalReference) as EObject
					if(o2o.containsKey(originalTarget)) {
						copyReference(originalReference,copiedSource,o2o.get(originalTarget))
					}
				}
			}
		}
		return o2o.get(s)
	}
	
	def private copyObject(EObject o) {
		if(o.createCopy) {
			val className = o.eClass.name
			//if(className =="Exit") println("Exit")
			val correspondingClass = commonSGraphPackage.EClassifiers.filter(EClass).filter[it.name == className].head
			if(correspondingClass != null) {
				return factory.create(correspondingClass)
			} else {
				println(className)
				return null
			}
		}
		else return null
	}
	
	def private copyReference(EReference reference, EObject source, EObject target) {
		val correspondingSourceClass = commonSGraphPackage.EClassifiers.filter(EClass).filter[it.name == reference.EContainingClass.name].head
		if(correspondingSourceClass !== null) {
			val correspondingReference = correspondingSourceClass.EReferences.filter[it.name === reference.name].head
			if(correspondingReference !== null) {
				if(correspondingReference.isMany) {
					(source.eGet(correspondingReference) as List<? super EObject>).add(target)
				} else {
					source.eSet(correspondingReference,target);
				}
			}
		}
	}
	
	def private createCopy(EObject o) {
		o.eClass.EPackage === yakinduSGraphPackage
	}
}