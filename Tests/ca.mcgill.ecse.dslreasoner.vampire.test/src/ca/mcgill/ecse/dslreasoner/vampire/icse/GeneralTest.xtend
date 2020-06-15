package ca.mcgill.ecse.dslreasoner.vampire.icse

import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import java.util.HashMap
import java.util.List
import java.util.Map
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.Response
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.viatra.query.runtime.api.IQueryGroup

class GeneralTest {

	def static Map<Type, Integer> getTypeMap(Map<Class, Integer> classMap, EcoreMetamodelDescriptor metamodel,
		Ecore2Logic e2l, Ecore2Logic_Trace trace) {
		val typeMap = new HashMap<Type, Integer>
		val listMap = metamodel.classes.toMap[s|s.name]

		for (Class  elem : classMap.keySet) {
			typeMap.put(e2l.TypeofEClass(
				trace,
				listMap.get(elem.simpleName)
			), classMap.get(elem))
		}
		return typeMap
	}

	def static loadMetamodel(EPackage pckg) {
		val List<EClass> classes = pckg.getEClassifiers.filter(EClass).toList
		val List<EEnum> enums = pckg.getEClassifiers.filter(EEnum).toList
		val List<EEnumLiteral> literals = enums.map[getELiterals].flatten.toList
		val List<EReference> references = classes.map[getEReferences].flatten.toList
		val List<EAttribute> attributes = classes.map[getEAttributes].flatten.toList
		return new EcoreMetamodelDescriptor(classes, #{}, false, enums, literals, references, attributes)
	}

	def static loadPartialModel(ReasonerWorkspace inputs, String path) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl())
		inputs.readModel(EObject, path).eResource.contents
//		inputs.readModel(EObject,"FamInstance.xmi").eResource.allContents.toList
	}

	def static loadQueries(EcoreMetamodelDescriptor metamodel, IQueryGroup i) {
		val patterns = i.specifications.toList
		val wfPatterns = patterns.filter[it.allAnnotations.exists[it.name == "Constraint"]].toSet
		val derivedFeatures = emptyMap
		// NO DERIVED FEATURES
//		val derivedFeatures = new LinkedHashMap
//		derivedFeatures.put(i.type,metamodel.attributes.filter[it.name == "type"].head)
//		derivedFeatures.put(i.model,metamodel.references.filter[it.name == "model"].head)
		val res = new ViatraQuerySetDescriptor(
			patterns,
			wfPatterns,
			derivedFeatures
		)
		return res
	}
}
