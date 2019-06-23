package ca.mcgill.ecse.dslreasoner.realistic.metrics.examples

import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.FurtherNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.LocalNodeDescriptor
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.util.Collection
import java.util.Collections
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EObject

class Util {
	static val partialInterpretation2Logic = new InstanceModel2PartialInterpretation
	static val Ecore2Logic ecore2Logic = new Ecore2Logic
	
	def static toLocalNode(AbstractNodeDescriptor descriptor) {
		var AbstractNodeDescriptor d = descriptor
		while (!d.class.equals(LocalNodeDescriptor)) {
			d = (d as FurtherNodeDescriptor).previousRepresentation as AbstractNodeDescriptor
		}
		return (d as LocalNodeDescriptor).types
	}

	def static getPartialModel(FileSystemWorkspace workspace, EObject model) {
		val pckg = model.eClass.EPackage
		val metamodel = new EcoreMetamodelDescriptor(
			pckg.EClassifiers.filter(EClass).toList,
			Collections::emptySet,
			false,
			pckg.EClassifiers.filter(EEnum).toList,
			pckg.EClassifiers.filter(EEnum).map[ELiterals].flatten.toList,
			pckg.EClassifiers.filter(EClass).map[EReferences].flatten.toList,
			pckg.EClassifiers.filter(EClass).map[EAttributes].flatten.toList
		)
		val metamodelTransformationOutput = ecore2Logic.transformMetamodel(metamodel, new Ecore2LogicConfiguration)

		return partialInterpretation2Logic.transform(metamodelTransformationOutput, model.eResource, false)
	}
	
		def static sum(Collection<Integer> integers) {
		var sum = 0
		for (integer : integers) {
			sum += integer
		}
		return sum
	}

	def static sum2(List<String> integers) {
		var sum = 0.0
		for (str : integers) {
			sum += Double.valueOf(str)
		}
		return sum
	}
}
