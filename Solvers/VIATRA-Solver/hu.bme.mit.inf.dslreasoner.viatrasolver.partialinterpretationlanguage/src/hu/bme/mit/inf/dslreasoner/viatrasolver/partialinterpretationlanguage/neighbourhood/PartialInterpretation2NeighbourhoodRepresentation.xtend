package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BinaryElementRelationLink
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialPrimitiveInterpretation
import java.util.ArrayList
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.collections.api.factory.Maps
import org.eclipse.collections.impl.factory.Sets

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

abstract class PartialInterpretation2NeighbourhoodRepresentation<ModelRepresentation, NodeRepresentation> {
	val boolean deepRepresentation
	val boolean mergeSimilarNeighbourhood

	protected new(boolean deeprepresentation, boolean mergeSimilarNeighbourhood) {
		this.deepRepresentation = deeprepresentation
		this.mergeSimilarNeighbourhood = mergeSimilarNeighbourhood
	}

	public static val FixPointRange = NeighbourhoodOptions.FixPointRange
	public static val GraphWidthRange = NeighbourhoodOptions.GraphWidthRange
	public static val FullParallels = NeighbourhoodOptions.FullParallels
	public static val MaxNumbers = NeighbourhoodOptions.MaxNumbers

	static val FOCUSED_ELEMENT_NAME = "<<THIS>>"

	/**
	 * Creates a neighbourhood representation with traces
	 * @param model The model to be represented.
	 * @param range The range of the neighbourhood.
	 * @param parallels The maximal number of parallel references to be differentiated.
	 * @param maxNumber The maximal number of elements in a equivalence class that chan be differentiated.
	 */
	def createRepresentation(PartialInterpretation model, int range, int parallels, int maxNumber) {
		return createRepresentation(model, range, parallels, maxNumber, null, null)
	}

	def createRepresentation(PartialInterpretation model, NeighbourhoodOptions options) {
		createRepresentation(model, options.range, options.parallels, options.maxNumber, options.relevantTypes,
			options.relevantRelations)
	}

	/**
	 * Creates a neighbourhood representation with traces
	 * @param model The model to be represented.
	 * @param range The range of the neighbourhood.
	 * @param parallels The maximal number of parallel references to be differentiated.
	 * @param maxNumber The maximal number of elements in a equivalence class that chan be differentiated.
	 */
	def createRepresentation(PartialInterpretation model, int range, int parallels, int maxNumber,
		Set<TypeDeclaration> relevantTypes, Set<RelationDeclaration> relevantRelations) {
		createRepresentationWithFocus(model, range, parallels, maxNumber, relevantTypes, relevantRelations, null)
	}

	def createRepresentationWithFocus(PartialInterpretation model, NeighbourhoodOptions options,
		DefinedElement focusedElement) {
		createRepresentationWithFocus(model, options.range, options.parallels, options.maxNumber, options.relevantTypes,
			options.relevantRelations, focusedElement)
	}

	def createRepresentationWithFocus(PartialInterpretation model, int range, int parallels, int maxNumber,
		Set<TypeDeclaration> relevantTypes, Set<RelationDeclaration> relevantRelations, DefinedElement focusedElement) {
		val initialSize = model.elements.size
		val Map<DefinedElement, Set<String>> types = Maps.mutable.ofInitialCapacity(initialSize)
		fillTypes(model, types, relevantTypes)
		val Map<DefinedElement, List<IncomingRelation<DefinedElement>>> IncomingRelations = Maps.mutable.ofInitialCapacity(initialSize);
		val Map<DefinedElement, List<OutgoingRelation<DefinedElement>>> OutgoingRelations = Maps.mutable.ofInitialCapacity(initialSize);
		fillReferences(model, IncomingRelations, OutgoingRelations, relevantRelations)

		val res = doRecursiveNeighbourCalculation(model, types, IncomingRelations, OutgoingRelations, range, parallels,
			maxNumber, focusedElement);

		return res;
	}

	def private isRelevant(TypeDeclaration t, Set<TypeDeclaration> relevantTypes) {
		if (relevantTypes === null) {
			return true
		} else {
			return relevantTypes.contains(t)
		}
	}

	def private isRelevant(RelationDeclaration r, Set<RelationDeclaration> relevantRelations) {
		if (relevantRelations === null) {
			return true
		} else {
			return relevantRelations.contains(r)
		}
	}

	/**
	 * Gets the minimal neighbourhood size such that every reachable node appears in the shape of every other at least once.
	 */
	def private getWidth(Map<DefinedElement, Set<String>> types,
		Map<DefinedElement, List<IncomingRelation<DefinedElement>>> IncomingRelations,
		Map<DefinedElement, List<OutgoingRelation<DefinedElement>>> OutgoingRelations) {
		val elements = types.keySet
		var Map<DefinedElement, Set<DefinedElement>> reachable = Maps.mutable.ofInitialCapacity(elements.size)
		var Map<DefinedElement, Set<DefinedElement>> newReachable = Maps.mutable.ofInitialCapacity(elements.size)
		for (element : elements) {
			val set = Sets.mutable.of
			set.add(element)
			reachable.put(element, Sets.mutable.of)
			newReachable.put(element, set)
		}

		var int width = 0
		var boolean newAdded
		do {
			var tmp = reachable
			reachable = newReachable
			newReachable = tmp
			newAdded = false
			for (element : elements) {
				val elementNeigbours = element.lookup(reachable)
				val newElementNeigbours = element.lookup(newReachable)
				newElementNeigbours.addAll(elementNeigbours)
				for (incoming : element.lookup(IncomingRelations)) {
					newElementNeigbours.addAll(incoming.from.lookup(reachable))
				}
				for (outgoing : element.lookup(OutgoingRelations)) {
					newElementNeigbours.addAll(outgoing.to.lookup(reachable))
				}
				newAdded = newAdded || (newElementNeigbours.size > elementNeigbours.size)
			}
			width += 1
		} while (newAdded)
		return width
	}
	/**
	 * Creates a neighbourhood representation with traces
	 * @param model The model to be represented.
	 * @param IncomingRelations Requires the previously indexed incoming references.
	 * @param OutgoingRelations Requires the previously indexed outgoing references.
	 * @param range The range of the neighbourhood.
	 * @param parallels The maximal number of parallel references to be differentiated.
	 */
	def private NeighbourhoodWithTraces<ModelRepresentation, NodeRepresentation> doRecursiveNeighbourCalculation(
		PartialInterpretation model, Map<DefinedElement, Set<String>> types,
		Map<DefinedElement, List<IncomingRelation<DefinedElement>>> IncomingRelations,
		Map<DefinedElement, List<OutgoingRelation<DefinedElement>>> OutgoingRelations, int range, int parallels,
		int maxNumber, DefinedElement focusedElement) {
		if (range == 0) {
			val r = calculateLocalNodeDescriptors(model, types, maxNumber, focusedElement)
			val res = this.createLocalRepresentation(r.value, r.key)
			if (res.modelRepresentation === null) {
				throw new IllegalArgumentException('''Model representation is null''')
			} else if (res.nodeRepresentations === null || res.nodeRepresentations.empty) {
				throw new IllegalArgumentException('''No node representation''')
			} else if (res.previousRepresentation !== null) {
				throw new IllegalArgumentException('''The previous representation of the first neighbourhood have to be null''')
			} else
				return res
		} else if (range > 0) {
			val previous = doRecursiveNeighbourCalculation(model, types, IncomingRelations, OutgoingRelations,
				range - 1, parallels, maxNumber, focusedElement)
			val r = calculateFurtherNodeDescriptors(model, previous, IncomingRelations, OutgoingRelations, parallels,
				maxNumber)
			// println('''Level «range» finished.''')
			val res = createFurtherRepresentation(r.key, r.value, previous, deepRepresentation)
			if (res.modelRepresentation === null) {
				throw new IllegalArgumentException('''Model representation is null''')
			} else if (res.nodeRepresentations === null || res.nodeRepresentations.empty) {
				throw new IllegalArgumentException('''No node representation''')
			} else if (res.previousRepresentation === null && deepRepresentation) {
				throw new IllegalArgumentException('''Need previous representations''')
			} else
				return res
		} else if (range == FixPointRange) {
			return refineUntilFixpoint(model, types, IncomingRelations, OutgoingRelations, parallels, maxNumber,
				focusedElement)
		} else if (range == GraphWidthRange) {
			val width = this.getWidth(types, IncomingRelations, OutgoingRelations)
			// println(width)
			return doRecursiveNeighbourCalculation(model, types, IncomingRelations, OutgoingRelations, width, parallels,
				maxNumber, focusedElement)
		}
	}

	def private refineUntilFixpoint(PartialInterpretation model, Map<DefinedElement, Set<String>> types,
		Map<DefinedElement, List<IncomingRelation<DefinedElement>>> IncomingRelations,
		Map<DefinedElement, List<OutgoingRelation<DefinedElement>>> OutgoingRelations, int parallels, int maxNumbers,
		DefinedElement focusedElement) {
		var lastRange = 0
		val last = calculateLocalNodeDescriptors(model, types, maxNumbers, focusedElement)
		var lastRepresentation = this.createLocalRepresentation(last.value, last.key)
		// println('''Level 0 finished.''')
		var boolean hasRefined
		do {
			val nextRange = lastRange + 1
			val next = calculateFurtherNodeDescriptors(model, lastRepresentation, IncomingRelations, OutgoingRelations,
				parallels, maxNumbers)
			val nextRepresentation = createFurtherRepresentation(next.key, next.value, lastRepresentation,
				deepRepresentation)

			val previousNumberOfTypes = Sets.immutable.withAll(lastRepresentation.nodeRepresentations.values).size
			val nextNumberOfTypes = Sets.immutable.withAll(nextRepresentation.nodeRepresentations.values).size
			hasRefined = nextNumberOfTypes > previousNumberOfTypes

			lastRange = nextRange
			lastRepresentation = nextRepresentation

//			if(hasRefined) {
//				println('''Level «nextRange» is calculated, number of types is refined: «previousNumberOfTypes» -> «nextNumberOfTypes»''')
//			} else {
//				println('''Level «nextRange» is calculated, but the number of types is not refined: «previousNumberOfTypes» = «nextNumberOfTypes»''')
//			}
		} while (hasRefined)
		return lastRepresentation
	}

	def private getElements(PartialInterpretation model) {
		return model.problem.elements + model.newElements + model.openWorldElements
	}

	def private fillTypes(PartialInterpretation model, Map<DefinedElement, Set<String>> node2Type,
		Set<TypeDeclaration> relevantTypes) {
		for (element : model.elements) {
			node2Type.put(element, Sets.mutable.of)
		}

//		for(typeDefinition : model.problem.types.filter(TypeDefinition)) {
//			// Dont need
//		}
		for (typeInterpretation : model.partialtypeinterpratation) {
			if (typeInterpretation instanceof PartialPrimitiveInterpretation) {
			} else if (typeInterpretation instanceof PartialComplexTypeInterpretation) {
				val type = typeInterpretation.interpretationOf
				if (type.isRelevant(relevantTypes)) {
					for (element : typeInterpretation.elements) {
						element.lookup(node2Type).add(type.name)
					}
				}
			}
		}
	}

	/**
	 * Indexes the references
	 */
	def private fillReferences(PartialInterpretation model,
		Map<DefinedElement, List<IncomingRelation<DefinedElement>>> IncomingRelations,
		Map<DefinedElement, List<OutgoingRelation<DefinedElement>>> OutgoingRelations,
		Set<RelationDeclaration> relevantRelations) {
		for (object : model.elements) {
			IncomingRelations.put(object, new ArrayList)
			OutgoingRelations.put(object, new ArrayList)
		}
		for (relationInterpretation : model.partialrelationinterpretation) {
			val type = relationInterpretation.interpretationOf
			if (type.isRelevant(relevantRelations)) {
				for (link : relationInterpretation.relationlinks) {
					if (link instanceof BinaryElementRelationLink) {
						OutgoingRelations.get(link.param1) += new OutgoingRelation(link.param2, type.name)
						IncomingRelations.get(link.param2) += new IncomingRelation(link.param1, type.name)
					} else
						throw new UnsupportedOperationException
				}
			}
		}
	}

	/**
	 * Creates a local representation of the objects (aka zero range neighbourhood)
	 */
	def abstract protected NeighbourhoodWithTraces<ModelRepresentation, NodeRepresentation> createLocalRepresentation(
		Map<DefinedElement, LocalNodeDescriptor> node2Representation,
		Map<LocalNodeDescriptor, Integer> representation2Amount
	)

	/**
	 * Creates a 
	 */
	def abstract protected NeighbourhoodWithTraces<ModelRepresentation, NodeRepresentation> createFurtherRepresentation(
		Map<FurtherNodeDescriptor<NodeRepresentation>, Integer> nodeDescriptors,
		Map<DefinedElement, FurtherNodeDescriptor<NodeRepresentation>> node2Representation,
		NeighbourhoodWithTraces<ModelRepresentation, NodeRepresentation> previous,
		boolean deepRepresentation
	)

	def private addOne(Integer originalObj, int max) {
		if (originalObj === null) {
			return 1
		}
		val original = originalObj.intValue
		if(original == Integer.MAX_VALUE) return Integer.MAX_VALUE
		if(original + 1 > max) return Integer.MAX_VALUE else return original + 1
	}

	private def calculateIncomingEdges(Map<DefinedElement, List<IncomingRelation<DefinedElement>>> IncomingRelations,
		DefinedElement object, Map<DefinedElement, ? extends NodeRepresentation> previousNodeRepresentations,
		int parallel) {
		val Map<IncomingRelation<NodeRepresentation>, Integer> res = Maps.mutable.of
		for (incomingConcreteEdge : IncomingRelations.get(object)) {
			val IncomingRelation<NodeRepresentation> e = new IncomingRelation(
				previousNodeRepresentations.get(incomingConcreteEdge.from), incomingConcreteEdge.type)
			res.compute(e, [key, value | addOne(value, parallel)])
		}
		return res
	}

	private def calcuateOutgoingEdges(Map<DefinedElement, List<OutgoingRelation<DefinedElement>>> OutgoingRelations,
		DefinedElement object, Map<DefinedElement, ? extends NodeRepresentation> previousNodeRepresentations,
		int parallel) {
		val Map<OutgoingRelation<NodeRepresentation>, Integer> res = Maps.mutable.of
		for (outgoingConcreteEdge : OutgoingRelations.get(object)) {
			val OutgoingRelation<NodeRepresentation> e = new OutgoingRelation(
				previousNodeRepresentations.get(outgoingConcreteEdge.to), outgoingConcreteEdge.type)
			res.compute(e, [key, value | addOne(value, parallel)])
		}
		return res
	}

	/*def private <KEY,VALUE> void addOrCreate_Set(Map<KEY,Set<VALUE>> map, KEY key, VALUE value) {
	 * 	var Set<VALUE> s;
	 * 	if(map.containsKey(key)) {
	 * 		s = map.get(key);
	 * 	} else {
	 * 		s = new HashSet
	 * 		map.put(key,s)
	 * 	}
	 * 	s.add(value)
	 }*/
	private def calculateFurtherNodeDescriptors(PartialInterpretation model,
		NeighbourhoodWithTraces<ModelRepresentation, NodeRepresentation> previous,
		Map<DefinedElement, List<IncomingRelation<DefinedElement>>> IncomingRelations,
		Map<DefinedElement, List<OutgoingRelation<DefinedElement>>> OutgoingRelations, int parallels, int maxNumber) {
		val previousNodeRepresentations = previous.nodeRepresentations
		val size = previousNodeRepresentations.size
		val node2Representation = Maps.mutable.<DefinedElement, FurtherNodeDescriptor<NodeRepresentation>>ofInitialCapacity(size)
		val Map<FurtherNodeDescriptor<NodeRepresentation>, Integer> descriptor2Number = if (this.
				mergeSimilarNeighbourhood) {
				Maps.mutable.ofInitialCapacity(size)
			} else {
				null
			}
		val Map<FurtherNodeDescriptor<NodeRepresentation>, FurtherNodeDescriptor<NodeRepresentation>> uniqueDescription = if (this.
				mergeSimilarNeighbourhood) {
				Maps.mutable.ofInitialCapacity(size)
			} else {
				null
			}

		for (object : model.elements) {
			val incomingEdges = this.calculateIncomingEdges(IncomingRelations, object, previousNodeRepresentations,
				parallels)
			val outgoingEdges = this.calcuateOutgoingEdges(OutgoingRelations, object, previousNodeRepresentations,
				parallels)

			val previousType = previousNodeRepresentations.get(object)

			if (previousType === null) {
				println("Error in state coder")
			}

			val nodeDescriptor = new FurtherNodeDescriptor(previousType, incomingEdges, outgoingEdges)

			if (this.mergeSimilarNeighbourhood) {
				if (descriptor2Number.containsKey(nodeDescriptor)) {
					descriptor2Number.put(
						nodeDescriptor,
						addOne(descriptor2Number.get(nodeDescriptor), maxNumber)
					)
					node2Representation.put(object, uniqueDescription.get(nodeDescriptor))
				} else {
					descriptor2Number.put(nodeDescriptor, if (1 > maxNumber) {
						Integer.MAX_VALUE
					} else {
						1
					})
					uniqueDescription.put(nodeDescriptor, nodeDescriptor)
					node2Representation.put(object, nodeDescriptor)
				}
			} else {
				node2Representation.put(object, nodeDescriptor)
			}
		}

		return descriptor2Number -> node2Representation
	}

	private def calculateLocalNodeDescriptors(PartialInterpretation model, Map<DefinedElement, Set<String>> types,
		int maxNumber, DefinedElement focusedElement) {
		val size = types.size
		val Map<DefinedElement, LocalNodeDescriptor> node2Representation = Maps.mutable.ofInitialCapacity(size)
		val Map<LocalNodeDescriptor, Integer> representation2Amount = if (mergeSimilarNeighbourhood) {
				Maps.mutable.ofInitialCapacity(size)
			} else {
				null
			}
		val Map<LocalNodeDescriptor, LocalNodeDescriptor> uniqueRepresentation = if (this.mergeSimilarNeighbourhood) {
				Maps.mutable.ofInitialCapacity(size)
			} else {
				null
			}

		for (element : model.elements) {
			val name = if(element == focusedElement) FOCUSED_ELEMENT_NAME else element.name
			var newDescriptor = new LocalNodeDescriptor(name, element.lookup(types))
			if (this.mergeSimilarNeighbourhood) {
				if (uniqueRepresentation.containsKey(newDescriptor)) {
					newDescriptor = newDescriptor.lookup(uniqueRepresentation)
					node2Representation.put(element, newDescriptor)
					representation2Amount.put(
						newDescriptor,
						addOne(newDescriptor.lookup(representation2Amount), maxNumber)
					)
				} else {
					uniqueRepresentation.put(newDescriptor, newDescriptor)
					node2Representation.put(element, newDescriptor)
					representation2Amount.put(newDescriptor, if (1 > maxNumber) {
						Integer.MAX_VALUE
					} else {
						1
					})
				}
			} else {
				node2Representation.put(element, newDescriptor)
			}
		}

		return representation2Amount -> node2Representation
	}
}
