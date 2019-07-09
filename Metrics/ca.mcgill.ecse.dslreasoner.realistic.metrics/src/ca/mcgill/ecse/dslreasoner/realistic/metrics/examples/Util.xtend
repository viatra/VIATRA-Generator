package ca.mcgill.ecse.dslreasoner.realistic.metrics.examples

import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.FurtherNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.GraphNodeDescriptorGND
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.GraphShape
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.LocalNodeDescriptor
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.util.Collection
import java.util.Collections
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EObject

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class Util {
	static val partialInterpretation2Logic = new InstanceModel2PartialInterpretation
	static val Ecore2Logic ecore2Logic = new Ecore2Logic

	def static toLocalNode(AbstractNodeDescriptor descriptor) {
		var AbstractNodeDescriptor d = descriptor
		while (!d.class.equals(LocalNodeDescriptor)) {
			d = (d as FurtherNodeDescriptor).previousRepresentation as AbstractNodeDescriptor
		}
		return d as LocalNodeDescriptor
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

	def static sum2(Collection<Double> integers) {
		var sum = 0.0
		for (integer : integers) {
			sum += integer
		}
		return sum
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

	def static putInside(EObject object, String string, int i, Map<EObject, Map<String, Integer>> map) {
		val Map<String, Integer> correspondingMap = object.lookup(map)
		if (correspondingMap.keySet.contains(string)) {
			correspondingMap.put(string, string.lookup(correspondingMap) + i)
		} else {
			correspondingMap.put(string, i)
		}
	}

	def static dim2NumActNodesFromModel(EObject model) {
		val nodes = model.eResource.allContents.toList

		val Map<EObject, Set<EObject>> dim2NumActNodes = new HashMap

		for (node : nodes) {
			for (dim : node.eClass.EAllReferences) {
				val srcNode = node
				val trgNode = node.eGet(dim)

				if (!(trgNode instanceof List)) {
					if (trgNode !== null) {
						if (dim2NumActNodes.keySet.contains(dim)) {
							dim.lookup(dim2NumActNodes).add(srcNode)
						} else {
							dim2NumActNodes.put(dim, newHashSet(srcNode))
						}
						dim.lookup(dim2NumActNodes).addAll(trgNode as EObject)
					}
				} else {
					val trgSet = trgNode as List
					if (!trgSet.empty) {
						if (dim2NumActNodes.keySet.contains(dim)) {
							dim.lookup(dim2NumActNodes).addAll(srcNode)
						} else {
							dim2NumActNodes.put(dim, newHashSet(srcNode))
						}
						for (target : trgSet) {
							dim.lookup(dim2NumActNodes).add(target as EObject)
						}
					}
				}
			}
		}

		return dim2NumActNodes
	}

	def static dim2NumActNodesFromNHShape(GraphShape gs) {
		val nodes = gs.nodes as List<GraphNodeDescriptorGND>

		val Map<String, Set<AbstractNodeDescriptor>> dim2NumActNodes = new HashMap

		for (node : nodes) {
			for (dim : node.outgoingEdges) {
				val dimName = dim.type

				val srcName = node.correspondingAND
				val trgName = dim.to.correspondingAND

				if (dim2NumActNodes.keySet.contains(dimName)) {
					dimName.lookup(dim2NumActNodes).add(srcName)
				} else {
					dim2NumActNodes.put(dimName, newHashSet(srcName))
				}
				dimName.lookup(dim2NumActNodes).addAll(trgName)
			}
		}

		return dim2NumActNodes
	}
	
		def static dim2NumActNodes(GraphShape gs) {
		val nodes = gs.nodes as List<GraphNodeDescriptorGND>

		val Map<String, Set<AbstractNodeDescriptor>> dim2NumActNodes = new HashMap

		for (node : nodes) {
			for (dim : node.outgoingEdges) {
				val dimName = dim.type

				val srcName = node.correspondingAND
				val trgName = dim.to.correspondingAND

				if (dim2NumActNodes.keySet.contains(dimName)) {
					dimName.lookup(dim2NumActNodes).add(srcName)
				} else {
					dim2NumActNodes.put(dimName, newHashSet(srcName))
				}
				dimName.lookup(dim2NumActNodes).addAll(trgName)
			}
		}

		return dim2NumActNodes
	}

	def static dim2NumOccurencesFromModel(EObject model) {
		val nodes = model.eResource.allContents.toList

		val Map<EObject, Integer> dim2Occurences = new HashMap
		var newVal = 0
		for (node : nodes) {
			for (dim : node.eClass.EAllReferences) {
				val target = node.eGet(dim)

				if (!(target instanceof List)) {
					if (target !== null) {
						if (dim2Occurences.keySet.contains(dim)) {
							newVal = dim.lookup(dim2Occurences) + 1
						} else {
							newVal = 1
						}
						dim2Occurences.put(dim, newVal)
					}
				} else {
					val trgSet = target as List
					if (!trgSet.empty) {
						if (dim2Occurences.keySet.contains(dim)) {
							newVal = dim.lookup(dim2Occurences) + trgSet.length
						} else {
							newVal = trgSet.length
						}
						dim2Occurences.put(dim, newVal)
					}
				}
			}
		}

		return dim2Occurences
	}

}
