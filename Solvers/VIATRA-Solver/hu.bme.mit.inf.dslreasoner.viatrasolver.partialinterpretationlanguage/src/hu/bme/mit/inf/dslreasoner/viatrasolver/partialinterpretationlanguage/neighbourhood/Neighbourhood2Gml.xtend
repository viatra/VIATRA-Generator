package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.concurrent.TimeUnit

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class Neighbourhood2Gml {
	static val nh2shape = new Neighbourhood2ShapeGraph

	val protected nodeNameSize = 14
	val protected nodeNameWidthMultiplier = 12
	val protected nodeHeight = 40
	val protected borderDistance = 0
	val protected ratio = 11.0 / 20.0
	
	var protected depth = 0

	def public transform2gml(NeighbourhoodWithTraces n, PartialInterpretation pm) {
		return transform2gml(nh2shape.createShapeGraph(n, pm))
	}

	def public transform2gml(GraphShape gs) {
		val List<CharSequence> text = newArrayList

		// Store node text
		for (node : gs.nodes) {
			text.add(transformNode(gs, node as GraphNodeDescriptorGND))
		}

		// edge transforming
		for (node : gs.nodes) {
			// we only use outgoing edges in case we eventually only 
			// implement GDs with outgoing edges
			for (outEdge : (node as GraphNodeDescriptorGND).outgoingEdges) {
				text.add(transformEdge(node as GraphNodeDescriptorGND, outEdge))
			}
		}

		'''
			graph
			[
				«FOR elementText : text»
					«elementText»
				«ENDFOR»
			]
		'''.toString

	}

	def protected transformNode(GraphShape gs, GraphNodeDescriptorGND node) {

		val nodeType = toLocalNode(node.correspondingAND)
		val nodeID = node.uniqueID

		'''
			node
				[
					id	«nodeID»
					graphics
					[
						w	«((nodeType.toString.length+4)*nodeNameWidthMultiplier + 2 * borderDistance)* ratio»
						h	«nodeHeight»
						type	"roundrectangle"
						fill	"#FFCC00"
						outline	"#000000"
					]
					LabelGraphics
					[
					]
					LabelGraphics
					[
						text	"«nodeType» («node.correspondingAND.lookup(gs.correspondingNH.modelRepresentation as HashMap)»)" 
						fontSize	«nodeNameSize»
						fontName	"Dialog"
					]
				]
		'''

	}

	def static toLocalNode(AbstractNodeDescriptor descriptor) {
		var AbstractNodeDescriptor d = descriptor
		while (!d.class.equals(LocalNodeDescriptor)) {
			d = (d as FurtherNodeDescriptor).previousRepresentation as AbstractNodeDescriptor
		}
		return (d as LocalNodeDescriptor).types
	}

	protected def transformEdge(GraphNodeDescriptorGND currentNode, OutgoingRelationGND relation) {

		val sourceID = currentNode.uniqueID
		val targetID = relation.to.uniqueID

		'''
			edge
				[
					source  «sourceID»
					target  «targetID»
					label	"«relation.type»"
					graphics
					[
						fill	"#000000"
						targetArrow	"standard"
						Line
						[
						]
					]
					LabelGraphics
					[
						text	"«relation.type»"
						fontSize	12
						fontName	"Dialog"
						configuration	"AutoFlippingLabel"
						model	"six_pos"
						position	"head"
					]
					LabelGraphics
					[
						text	"«relation.sourceDistrib»"
						fontSize	12
						fontName	"Dialog"
						configuration	"AutoFlippingLabel"
						model	"six_pos"
						position	"stail"
					]
					LabelGraphics
					[
						text	"«relation.targetDistrib»"
						fontSize	12
						fontName	"Dialog"
						configuration	"AutoFlippingLabel"
						model	"six_pos"
						position	"ttail"
					]
				]
		'''

	}
}
