package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.statecoder

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BinaryElementRelationLink
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation
import java.util.ArrayList
import java.util.Comparator
import java.util.LinkedList
import java.util.List
import java.util.SortedSet
import java.util.TreeSet
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.viatra.dse.statecode.IStateCoder
import org.eclipse.viatra.dse.statecode.IStateCoderFactory
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.Data
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialPrimitiveInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation

class IdentifierBasedStateCoderFactory implements IStateCoderFactory{
	
	val List<IdentifierBasedStateCoder> statecoders = new LinkedList
    synchronized override createStateCoder() {
        val res = new IdentifierBasedStateCoder
        statecoders += res
        return res
    }
    def getSumStatecoderRuntime() {
        statecoders.map[statecoderRuntime].reduce[p1, p2|p1+p2]
    }
}

@Data
class RelationStatecoder {
	String relationName
	SortedSet<Pair<Integer,Integer>> links;
	
	static val comparator= new Comparator<Pair<Integer,Integer>>() {
		override compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
			if(o1.key > o2.key) {
				return 1
			} else if(o1.key < o2.key) {
				return -1
			} else {
				return Integer.compare(o1.value,o2.value)
			}
		}
	}
	
	new(String relationName) {
		this.relationName = relationName
		links = new TreeSet(comparator)
	}
}

@Data
class IdentifierBasedStateCode {
	int numberOfNewElement
	SortedSet<RelationStatecoder> relationStatecoders
	
	static val comparator = new Comparator<RelationStatecoder>() {
		override compare(RelationStatecoder o1, RelationStatecoder o2) {
			o1.relationName.compareTo(o2.relationName)
		}
	}
	
	new(int numberOfNewElements) {
		this.numberOfNewElement = numberOfNewElements
		this.relationStatecoders = new TreeSet(comparator)
	}
}

class IdentifierBasedStateCoder implements IStateCoder{
	var PartialInterpretation model = null
	
	@Accessors(PUBLIC_GETTER) var long statecoderRuntime = 0
	
	override createActivationCode(IPatternMatch match) {
	    val startTime = System.nanoTime
		val res = new ArrayList(match.parameterNames.size)
		var index = 0
		while(index < match.parameterNames.size) {
        	res.add(getID(match.get(index)))
        	index++
        }
        statecoderRuntime += (System.nanoTime - startTime)
		return match.specification.fullyQualifiedName -> res
	}
	
	override createStateCode() {
	    val startTime = System.nanoTime
		val res = new IdentifierBasedStateCode(model.newElements.size)
		for(relation : model.partialrelationinterpretation) {
			val relationCoder = new RelationStatecoder(relation.interpretationOf.name)
			for(link: relation.relationlinks.filter(BinaryElementRelationLink)) {
				relationCoder.links+=link.param1.ID -> link.param2.ID
			}
			res.relationStatecoders+=relationCoder
		}
		statecoderRuntime += (System.nanoTime - startTime)
		return res
	}
	
	def getID(Object element) {
		if(element instanceof DefinedElement) {
			val container = element.eContainer
			if(container instanceof LogicProblem) {
				return -container.elements.indexOf(element)-1
			} else if(container instanceof PartialInterpretation){
				return container.newElements.indexOf(element)+1
			}
		} else if(element instanceof PartialInterpretation || element instanceof LogicProblem) {
			return 0
		} else if(element instanceof PartialRelationInterpretation) {
			return element.interpretationOf.name.hashCode
		} else if(element instanceof PartialTypeInterpratation) {
			if(element instanceof PartialPrimitiveInterpretation) {
				element.class.simpleName.hashCode
			} else if (element instanceof PartialComplexTypeInterpretation){
				return element.interpretationOf.name.hashCode
			} else {
				throw new UnsupportedOperationException('''Unsupported type: «element.class.simpleName»''')
			}
		} else {
			println(element)
			throw new UnsupportedOperationException('''Unsupported type: «element.class.simpleName»''')
		}
	}
	
	override init(Notifier notifier) {
		model = notifier as PartialInterpretation
	}
}