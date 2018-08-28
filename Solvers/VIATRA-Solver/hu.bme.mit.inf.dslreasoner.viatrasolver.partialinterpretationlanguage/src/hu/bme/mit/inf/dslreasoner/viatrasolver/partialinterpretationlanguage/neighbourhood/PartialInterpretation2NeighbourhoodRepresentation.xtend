package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BinaryElementRelationLink
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialPrimitiveInterpretation
import java.util.HashMap
import java.util.HashSet
import java.util.LinkedList
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import java.util.ArrayList

abstract class PartialInterpretation2NeighbourhoodRepresentation<ModelRepresentation, NodeRepresentation> {
	/**
	 * Includes shape of a smaller range in the current shape
	 */
	private val boolean deepRepresentation
	/**
	 * Treats similar shapes as one (recommended)
	 */
	private val boolean mergeSimilarNeighbourhood

	protected new(boolean deeprepresentation, boolean mergeSimilarNeighbourhood) {
		this.deepRepresentation = deeprepresentation
		this.mergeSimilarNeighbourhood = mergeSimilarNeighbourhood
	}

	/**
	 * Constant to be used as the range parameter of the createRepresentation function for enforcing fix point semantics instead of a predefined range
	 */
	public static val FixPointRage = -1
	/**
	 * Constant to be used as the range parameter of the createRepresentation function for using the width of the graph as the range
	 */
	public static val GraphWidthRange = -2
	/**
	 * Constant to be used as the parallels parameter of the createRepresentation function for prohibiting cardinality abstractions
	 */
	public static val FullParallels = Integer.MAX_VALUE
	/**
	 * Constant to be used as the parallels parameter of the createRepresentation function for prohibiting multiplicity abstractions
	 */
	public static val MaxNumbers = Integer.MAX_VALUE

	/**
	 * Creates a neighbourhood representation with traces
	 * @param model The model to be represented.
	 * @param range The range of the neighbourhood.
	 * @param parallels The maximal number of parallel references to be differentiated.
	 * @param maxNumber The maximal number of elements in a equivalence class that can be differentiated.
	 */
	def public createRepresentation(PartialInterpretation model, int range, int parallels, int maxNumber) {
		return createRepresentation(model, range, parallels, maxNumber, null, null, null)
	}

	/**
	 * Creates a neighbourhood representation with traces
	 * @param model The model to be represented.
	 * @param range The range of the neighbourhood.
	 * @param parallels The maximal number of parallel references to be differentiated.
	 * @param maxNumber The maximal number of elements in a equivalence class that can be differentiated.
	 * @param relevantTypes The set of types to include in the diversity calculations (when value is null, all types are considered)
	 * @param relevantRelations The set of relations to include in the diversity calculations (when value is null, all relations are considered)
	 * @param relevantPatterns The set of patterns to include in the diversity calculations 
	 * 		  (NOT the well-formedness constraints) - when value is null, NO patterns are considered
	 */
	def public createRepresentation(PartialInterpretation model, int range, int parallels, int maxNumber,
		Set<TypeDeclaration> relevantTypes, Set<RelationDeclaration> relevantRelations,
		Set<ViatraQueryMatcher<? extends IPatternMatch>> relevantPatterns) {

		val Map<DefinedElement, Set<String>> types = new HashMap
		fillTypes(model, types, relevantTypes)
		val Map<DefinedElement, List<IncomingRelation<DefinedElement>>> IncomingRelations = new HashMap;
		val Map<DefinedElement, List<OutgoingRelation<DefinedElement>>> OutgoingRelations = new HashMap;
		fillReferences(model, IncomingRelations, OutgoingRelations, relevantRelations);
		val Map<DefinedElement, List<PatternRelation<DefinedElement>>> PatternRelations = createPatternRelations(model,
			relevantPatterns);
		
		
			
		val res = doRecursiveNeighbourCalculation(model, types, IncomingRelations, OutgoingRelations, PatternRelations,range, parallels,
			maxNumber);

		return res;
	}

	/**
	 * Collects all pattern relations for shaping
	 */
	def Map<DefinedElement, List<PatternRelation<DefinedElement>>> createPatternRelations(
		PartialInterpretation model, Set<ViatraQueryMatcher<? extends IPatternMatch>> relevantPatterns) {
		val Map<DefinedElement, List<PatternRelation<DefinedElement>>> result=new HashMap;
		
		for (element : model.elements) {
			result.put(element,new LinkedList<PatternRelation<DefinedElement>>)
		}
		if (relevantPatterns===null) return result;
		for (pattern : relevantPatterns) {
			val name=pattern.patternName
			val arity=pattern.parameterNames.size
			
			val ignoredParams=new HashSet<String>();
			
			for (match : pattern.allMatches) {
				val sanitizedMatch=new ArrayList<DefinedElement>();
				for (var i=0; i<arity;i++) {
					val matchedElement=match.get(i)
					if (matchedElement instanceof DefinedElement) {
						sanitizedMatch.add(matchedElement)
					} else {
						ignoredParams.add(pattern.parameterNames.get(i))
					}
				}
				var id=0;
				for (DefinedElement e:sanitizedMatch) {
					if (e!==null) {
						result.get(e).add(new PatternRelation<DefinedElement>(name,id,sanitizedMatch))
					}
					id++	
				}
			}
			
			println('''Ignored params '''+ignoredParams+''' of pattern '''+ name)
		}
		
		return result;
		
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
	 * @returns the diameter (maximal size of shortest paths between nodes) of the partial model
	 */
	def private getWidth(Map<DefinedElement, Set<String>> types,
		Map<DefinedElement, List<IncomingRelation<DefinedElement>>> IncomingRelations,
		Map<DefinedElement, List<OutgoingRelation<DefinedElement>>> OutgoingRelations) {
		val elements = types.keySet
		val Map<DefinedElement, Set<DefinedElement>> reachable = new HashMap
		for (element : elements) {
			val set = new HashSet
			set.add(element)
			reachable.put(element, set)
		}

		var int width = 0
		var boolean newAdded
		do {
			newAdded = false
			for (element : elements) {
				val elementNeigbours = element.lookup(reachable)
				val size = elementNeigbours.size
				for (incoming : element.lookup(IncomingRelations)) {
					elementNeigbours.addAll(incoming.from.lookup(reachable))
				}
				for (outgoing : element.lookup(OutgoingRelations)) {
					elementNeigbours.addAll(outgoing.to.lookup(reachable))
				}
				newAdded = newAdded || (elementNeigbours.size > size)
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
		Map<DefinedElement, List<OutgoingRelation<DefinedElement>>> OutgoingRelations,
		Map<DefinedElement, List<PatternRelation<DefinedElement>>> PatternRelations, int range, int parallels,
		int maxNumber) {
			if (range == 0) {
				val r = calculateLocalNodeDescriptors(model, types, maxNumber)
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
				val previous = doRecursiveNeighbourCalculation(model, types, IncomingRelations, OutgoingRelations, PatternRelations,
					range - 1, parallels, maxNumber)
				val r = calculateFurtherNodeDescriptors(model, previous, IncomingRelations, OutgoingRelations,PatternRelations,
					parallels, maxNumber)
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
			} else if (range == FixPointRage) {
				return refineUntilFixpoint(model, types, IncomingRelations, OutgoingRelations, PatternRelations, parallels, maxNumber)
			} else if (range == GraphWidthRange) {
				val width = this.getWidth(types, IncomingRelations, OutgoingRelations)
				// println(width)
				return doRecursiveNeighbourCalculation(model, types, IncomingRelations, OutgoingRelations,PatternRelations, width,
					parallels, maxNumber)
			}
		}

		def private refineUntilFixpoint(PartialInterpretation model, Map<DefinedElement, Set<String>> types,
			Map<DefinedElement, List<IncomingRelation<DefinedElement>>> IncomingRelations,
			Map<DefinedElement, List<OutgoingRelation<DefinedElement>>> OutgoingRelations,
			Map<DefinedElement, List<PatternRelation<DefinedElement>>> PatternRelations,
			int parallels,
			int maxNumbers) {
				var lastRange = 0
				val last = calculateLocalNodeDescriptors(model, types, maxNumbers)
				var lastRepresentation = this.createLocalRepresentation(last.value, last.key)
				// println('''Level 0 finished.''')
				var boolean hasRefined
				do {
					val nextRange = lastRange + 1
					val next = calculateFurtherNodeDescriptors(model, lastRepresentation, IncomingRelations,
						OutgoingRelations, PatternRelations, parallels, maxNumbers)
					val nextRepresentation = createFurtherRepresentation(next.key, next.value, lastRepresentation,
						deepRepresentation)

					val previousNumberOfTypes = lastRepresentation.nodeRepresentations.values.toSet.size
					val nextNumberOfTypes = nextRepresentation.nodeRepresentations.values.toSet.size
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
					node2Type.put(element, new HashSet)
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
						IncomingRelations.put(object, new LinkedList)
						OutgoingRelations.put(object, new LinkedList)
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
				 * Creates the representation of the initial shape (aka zero range neighbourhood)
				 */
				def abstract protected NeighbourhoodWithTraces<ModelRepresentation, NodeRepresentation> createLocalRepresentation(
					Map<DefinedElement, LocalNodeDescriptor> node2Representation,
					Map<LocalNodeDescriptor, Integer> representation2Amount
				)

				/**
				 * Creates the representation of a shape (aka neighbourhood) with positive range
				 */
				def abstract protected NeighbourhoodWithTraces<ModelRepresentation, NodeRepresentation> createFurtherRepresentation(
					Map<FurtherNodeDescriptor<NodeRepresentation>, Integer> nodeDescriptors,
					Map<DefinedElement, FurtherNodeDescriptor<NodeRepresentation>> node2Representation,
					NeighbourhoodWithTraces<ModelRepresentation, NodeRepresentation> previous,
					boolean deepRepresentation
				)

				def private addOne(int original, int max) {
					if(original == Integer.MAX_VALUE) return Integer.MAX_VALUE
					if(original + 1 > max) return Integer.MAX_VALUE else return original + 1
				}

				private def calculateIncomingEdges(
					Map<DefinedElement, List<IncomingRelation<DefinedElement>>> IncomingRelations,
					DefinedElement object,
					Map<DefinedElement, ? extends NodeRepresentation> previousNodeRepresentations, int parallel) {
					val Map<IncomingRelation<NodeRepresentation>, Integer> res = new HashMap
					for (incomingConcreteEdge : IncomingRelations.get(object)) {
						val IncomingRelation<NodeRepresentation> e = new IncomingRelation(
							previousNodeRepresentations.get(incomingConcreteEdge.from), incomingConcreteEdge.type)
						if (res.containsKey(e)) {
							res.put(e, addOne(res.get(e), parallel))
						} else {
							res.put(e, 1)
						}
					}
					return res
				}

				private def calcuateOutgoingEdges(
					Map<DefinedElement, List<OutgoingRelation<DefinedElement>>> OutgoingRelations,
					DefinedElement object,
					Map<DefinedElement, ? extends NodeRepresentation> previousNodeRepresentations, int parallel) {
					val Map<OutgoingRelation<NodeRepresentation>, Integer> res = new HashMap
					for (outgoingConcreteEdge : OutgoingRelations.get(object)) {
						val OutgoingRelation<NodeRepresentation> e = new OutgoingRelation(
							previousNodeRepresentations.get(outgoingConcreteEdge.to), outgoingConcreteEdge.type)
						if (res.containsKey(e)) {
							res.put(e, addOne(res.get(e), parallel))
						} else {
							res.put(e, 1)
						}
					}
					return res;
				}
				
				private def calculatePatterns(Map<DefinedElement, List<PatternRelation<DefinedElement>>> PatternRelations,
						DefinedElement object,
						Map<DefinedElement, ? extends NodeRepresentation> previousNodeRepresentations) {
						val res = new HashSet<PatternRelation<NodeRepresentation>>()
						
						for (patternRelation : PatternRelations.get(object)) {
							val matchshape=patternRelation.parameters.map[previousNodeRepresentations.getOrDefault(it,null)]
							res.add(new PatternRelation<NodeRepresentation>(patternRelation.patternName,patternRelation.param,matchshape))
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
					Map<DefinedElement, List<OutgoingRelation<DefinedElement>>> OutgoingRelations,
					Map<DefinedElement, List<PatternRelation<DefinedElement>>> PatternRelations,
					int parallels,
					int maxNumber) {
						val previousNodeRepresentations = previous.nodeRepresentations
						val node2Representation = new HashMap<DefinedElement, FurtherNodeDescriptor<NodeRepresentation>>
						val Map<FurtherNodeDescriptor<NodeRepresentation>, Integer> descriptor2Number = if (this.
								mergeSimilarNeighbourhood) {
								new HashMap
							} else {
								null
							}
						val Map<FurtherNodeDescriptor<NodeRepresentation>, FurtherNodeDescriptor<NodeRepresentation>> uniqueDescription = if (this.
								mergeSimilarNeighbourhood) {
								new HashMap
							} else {
								null
							}

						for (object : model.elements) {
							val incomingEdges = this.calculateIncomingEdges(IncomingRelations, object,
								previousNodeRepresentations, parallels)
							val outgoingEdges = this.calcuateOutgoingEdges(OutgoingRelations, object,
								previousNodeRepresentations, parallels)
							val patterns = this.calculatePatterns(PatternRelations, object, previousNodeRepresentations)
							
							val previousType = previousNodeRepresentations.get(object)

							if (previousType === null) {
								println("Error in state coder")
							}

							val nodeDescriptor = new FurtherNodeDescriptor(previousType, incomingEdges, outgoingEdges, patterns)

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

					private def calculateLocalNodeDescriptors(PartialInterpretation model,
						Map<DefinedElement, Set<String>> types, int maxNumber) {
						val Map<DefinedElement, LocalNodeDescriptor> node2Representation = new HashMap
						val Map<LocalNodeDescriptor, Integer> representation2Amount = if (mergeSimilarNeighbourhood) {
								new HashMap
							} else {
								null
							}
						val Map<LocalNodeDescriptor, LocalNodeDescriptor> uniqueRepresentation = if (this.
								mergeSimilarNeighbourhood) {
								new HashMap
							} else {
								null
							}

						for (element : model.elements) {
							var newDescriptor = new LocalNodeDescriptor(element.name, element.lookup(types))
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
				