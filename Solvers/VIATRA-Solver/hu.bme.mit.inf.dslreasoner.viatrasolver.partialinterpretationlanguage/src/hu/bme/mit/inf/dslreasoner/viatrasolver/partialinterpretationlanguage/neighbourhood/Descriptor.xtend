package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood

import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.xtend.lib.annotations.Data

@Data abstract class AbstractNodeDescriptor {
	long dataHash

//	@Pure
//	@Override
//	override public boolean equals(Object obj) {
//		if (this === obj)
//			return true;
//		if (obj === null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		val AbstractNodeDescriptor other = obj as AbstractNodeDescriptor;
//		if (other.dataHash != this.dataHash)
//			return false;
//		return true;
//	}
}

@Data class LocalNodeDescriptor extends AbstractNodeDescriptor {
	Set<String> types
	String id;

	new(String id, Set<String> types) {
		super(calcualteDataHash(id, types))
		this.types = types
		this.id = id
	}

	def private static calcualteDataHash(String id, Set<String> types) {
		val int prime = 31;
		var result = 0
		if (id !== null)
			result = id.hashCode();
		if (types !== null) {
			result = prime * result + types.hashCode
		}
		return result
	}

	override hashCode() {
		return this.dataHash.hashCode
	}

	override toString() {
		return class.name + this.dataHash
	}

//	@Pure
//	@Override
//	override public boolean equals(Object obj) {
//		if (this === obj)
//			return true;
//		if (obj === null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		val AbstractNodeDescriptor other = obj as AbstractNodeDescriptor;
//		if (other.dataHash != this.dataHash)
//			return false;
//		return true;
//	}
//	@Pure
//	override public boolean equals(Object obj) {
//		if (this === obj)
//			return true;
//		if (obj === null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		if (!super.equals(obj))
//			return false;
//		val LocalNodeDescriptor other = obj as LocalNodeDescriptor;
//		if (this.clazz === null) {
//			if (other.clazz != null)
//				return false;
//		} else if (!this.clazz.equals(other.clazz))
//			return false;
//		return true;
//	}
}

@Data class XXXGraphNodeDescriptorXXX extends AbstractNodeDescriptor {
	LocalNodeDescriptor correspondingNode
	// String id
	Map<IncomingRelation<GraphNodeDescriptor>, List<Integer>> incomingEdges
	Map<OutgoingRelation<GraphNodeDescriptor>, List<Integer>> outgoingEdges

//	new(String id, Set<String> types) {
//		this.types = types
//		this.id = id
//		this.incomingEdges = new HashMap
//		this.outgoingEdges = new HashMap
//	}
	new(LocalNodeDescriptor correspondingNode) {
		super(calcualteDataHash(correspondingNode))
		this.correspondingNode = correspondingNode
		this.incomingEdges = new HashMap
		this.outgoingEdges = new HashMap
	}

	def private static calcualteDataHash(LocalNodeDescriptor correspondingNode) {
		val int prime = 31;
		var result = 0
		if (correspondingNode !== null)
			result = correspondingNode.hashCode();
		return result
	}

}

@Data class IncomingRelation<FROM> {
	FROM from
	String type
}

@Data class OutgoingRelation<TO> {
	TO to
	String type
}

@Data class FurtherNodeDescriptor<NodeRep> extends AbstractNodeDescriptor {

	NodeRep previousRepresentation
	Map<IncomingRelation<NodeRep>, Integer> incomingEdges
	Map<OutgoingRelation<NodeRep>, Integer> outgoingEdges

	new(NodeRep previousRepresentation, Map<IncomingRelation<NodeRep>, Integer> incomingEdges,
		Map<OutgoingRelation<NodeRep>, Integer> outgoingEdges) {
		super(calculateDataHash(previousRepresentation, incomingEdges, outgoingEdges))
		this.previousRepresentation = previousRepresentation
		this.incomingEdges = new HashMap(incomingEdges)
		this.outgoingEdges = new HashMap(outgoingEdges)
	}

	static def private <NodeRep> int calculateDataHash(NodeRep previousRepresentation,
		Map<IncomingRelation<NodeRep>, Integer> incomingEdges, Map<OutgoingRelation<NodeRep>, Integer> outgoingEdges) {
		val int prime = 31;
		var int result = previousRepresentation.hashCode;
		if (incomingEdges !== null)
			result = prime * result + incomingEdges.hashCode();
		if (outgoingEdges !== null)
			result = prime * result + outgoingEdges.hashCode();
		return result;
	}

	override hashCode() {
		return this.dataHash.hashCode
	}

	override toString() {
		return class.name + dataHash
//		return '''[«previousRepresentation»,(«FOR
//			in: incomingEdges.entrySet»(«in.key.type.name»=«in.key.from»,«in.value»)«ENDFOR»),(«FOR
//			out: outgoingEdges.entrySet»(«out.key.type.name»=«out.key.to»,«out.value»)«ENDFOR»),«FOR
//			att: attributeValues»(«att.type.name»=«att.value»)«ENDFOR»]'''
	}

//	@Pure
//	@Override
//	override public boolean equals(Object obj) {
//		if (this === obj)
//			return true;
//		if (obj === null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		val AbstractNodeDescriptor other = obj as AbstractNodeDescriptor;
//		if (other.dataHash != this.dataHash)
//			return false;
//		return true;
//	}
//	@Pure
//	override public boolean equals(Object obj) {
//		if (this === obj)
//			return true;
//		if (obj === null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		if (!super.equals(obj))
//			return false;
//		val FurtherNodeDescriptor<?> other = obj as FurtherNodeDescriptor<?>;
//		if (this.previousRepresentation === null) {
//			if (other.previousRepresentation != null)
//				return false;
//			
//		}
////		} else if (!this.previousRepresentation.equals(other.previousRepresentation))
////			return false;
//		if (this.incomingEdges === null) {
//			if (other.incomingEdges != null)
//				return false;
//		} else if (!this.incomingEdges.equals(other.incomingEdges))
//			return false;
//		if (this.outgoingEdges === null) {
//			if (other.outgoingEdges != null)
//				return false;
//		} else if (!this.outgoingEdges.equals(other.outgoingEdges))
//			return false;
//		if (this.attributeValues === null) {
//			if (other.attributeValues != null)
//				return false;
//		} else if (!this.attributeValues.equals(other.attributeValues))
//			return false;
//		return true;
//	}
}
/*
 * @Data
 * class ModelDescriptor {
 * 	int dataHash
 * 	int unknownElements
 * 	Map<? extends AbstractNodeDescriptor,Integer> knownElements
 * 	
 * 	public new(Map<? extends AbstractNodeDescriptor,Integer> knownElements, int unknownElements) {
 * 		this.dataHash = calculateDataHash(knownElements,unknownElements)
 * 		this.unknownElements = unknownElements
 * 		this.knownElements = knownElements
 * 	}
 * 	
 * 	def private static calculateDataHash(Map<? extends AbstractNodeDescriptor,Integer> knownElements, int unknownElements)
 * 	{
 * 		val int prime = 31;
 * 		return knownElements.hashCode * prime + unknownElements.hashCode 
 * 	}
 * }
 */
