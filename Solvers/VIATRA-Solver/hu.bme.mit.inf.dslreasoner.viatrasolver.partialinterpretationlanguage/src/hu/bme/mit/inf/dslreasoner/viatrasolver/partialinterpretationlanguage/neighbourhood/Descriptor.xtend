package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood

import java.util.HashMap
import java.util.Map
import java.util.Set
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.xtend2.lib.StringConcatenationClient

@Data abstract class AbstractNodeDescriptor {
	long dataHash

	protected def StringConcatenationClient prettyPrint() {
		'''(«dataHash»)[«class.simpleName»]'''
	}

	override toString() {
		'''
			«prettyPrint»
		'''
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

	override equals(Object other) {
		other.class == LocalNodeDescriptor && (other as AbstractNodeDescriptor).hashCode == hashCode
	}

	override protected prettyPrint() {
		'''(«dataHash»)[«IF id !== null»id = "«id»"«IF types === null || !types.empty», «ENDIF»«ENDIF»«IF types === null»TYPES = null«ELSE»«FOR type : types SEPARATOR ", "»«type»«ENDFOR»«ENDIF»]'''
	}

	override toString() {
		'''
			«prettyPrint»
		'''
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

	override equals(Object other) {
		other.class == FurtherNodeDescriptor && (other as AbstractNodeDescriptor).hashCode == hashCode
	}

	override prettyPrint() {
		'''
		(«dataHash»)[
			PREV = «previousRepresentation?.prettyPrint»
			«IF incomingEdges === null»
				IN null
			«ELSE»
				«FOR edge : incomingEdges.entrySet»
					IN «edge.value» «edge.key.type» = «edge.key.from.prettyPrint»
				«ENDFOR»
			«ENDIF»
			«IF outgoingEdges === null»
				OUT null
			«ELSE»
				«FOR edge : outgoingEdges.entrySet»
					OUT «edge.value» «edge.key.type» = «edge.key.to.prettyPrint»
				«ENDFOR»
			«ENDIF»
		]'''
	}

	private def StringConcatenationClient prettyPrint(NodeRep rep) {
		if (rep instanceof AbstractNodeDescriptor) {
			rep.prettyPrint
		} else {
			'''«rep»'''
		}
	}

	override toString() {
		'''
			«prettyPrint»
		'''
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
