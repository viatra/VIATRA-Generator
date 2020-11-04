package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood

import com.google.common.collect.Maps
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.HashMap
import java.util.Map
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@Data
class PairwiseNeighbourhoodRepresentation<BasicNodeRepresentation> {
	val Map<?, Integer> modelRepresentation
	val Map<DefinedElement, BasicNodeRepresentation> basicNodeRepresentations
	val Map<DefinedElement, ? extends Map<DefinedElement, ? extends BasicNodeRepresentation>> pairwiseNodeRepresentations

	def getBasicRepresentation(DefinedElement a) {
		basicNodeRepresentations.get(a)
	}

	def getPairwiseRepresentation(DefinedElement a, DefinedElement b) {
		pairwiseNodeRepresentations.get(a).get(b)
	}
}

@FinalFieldsConstructor
class PartialInterpretation2PairwiseNeighbourhoodRepresentation<BasicNodeRepresentation> {
	val PartialInterpretation2NeighbourhoodRepresentation<? extends Map<? extends BasicNodeRepresentation, Integer>, BasicNodeRepresentation> basicNeighbourhoodRepresenter

	def createRepresentation(PartialInterpretation model, NeighbourhoodOptions options) {
		val basicRepresentation = basicNeighbourhoodRepresenter.createRepresentation(model, options)
		val basicModelRepresentation = basicRepresentation.modelRepresentation
		val basicNodeRepresentations = basicRepresentation.nodeRepresentations
		val pairwiseNodeRepresentations = Maps.newHashMapWithExpectedSize(basicNodeRepresentations.size)
		val modelRepresentation = new HashMap<Object, Integer>
		for (nodeWithBasicRepresentation : basicNodeRepresentations.entrySet) {
			val node = nodeWithBasicRepresentation.key
			val basicNodeRepresentation = nodeWithBasicRepresentation.value
			val count = basicModelRepresentation.get(basicNodeRepresentation)
			if (count == 1) {
				pairwiseNodeRepresentations.put(node, basicNodeRepresentations)
				modelRepresentation.put(basicNodeRepresentation, count)
			} else {
				val neighbourhoodRepresentation = basicNeighbourhoodRepresenter.
					createRepresentationWithFocus(model, options, node)
				pairwiseNodeRepresentations.put(node, neighbourhoodRepresentation.nodeRepresentations)
				modelRepresentation.compute(neighbourhoodRepresentation.modelRepresentation) [ key, value |
					if (value === null) {
						if (1 > options.maxNumber) {
							Integer.MAX_VALUE
						} else {
							1
						}
					} else {
						addOne(value, options.maxNumber)
					}
				]
			}
		}
		new PairwiseNeighbourhoodRepresentation(modelRepresentation, basicNodeRepresentations,
			pairwiseNodeRepresentations)
	}

	def private addOne(int original, int max) {
		if(original == Integer.MAX_VALUE) return Integer.MAX_VALUE
		if(original + 1 > max) return Integer.MAX_VALUE else return original + 1
	}
}
