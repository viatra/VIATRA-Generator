package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.ralismcalculator

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.LogicProblemImpl
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RelationLink
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.BinaryElementRelationLinkImpl
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialInterpretationImpl
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialRelationInterpretationImpl
import java.util.HashMap
import org.eclipse.emf.common.util.BasicEList
import java.util.Map
import java.util.ArrayList

public class RealismCalculator {
		
	public static def calculateDegreeOfNode(DefinedElement definedElement){
		var int degree = 0
		for (reference : definedElement.referencesOfElement) {
			degree++
		}
		return degree;
	}
	
	/**
	 * Only works with the smartgrid-metamodel for now, with Concentrator and SmarMeter class Types...
	 */
	public static def calculateDegreeOfNodes(PartialInterpretation partialInterpretation){ 	 
		var degreeOfNodes = new HashMap<PartialTypeInterpratation, HashMap<DefinedElement, Integer>> 
		for(type : partialInterpretation.partialtypeinterpratation){
			var elementDegreeMap = new HashMap<DefinedElement, Integer>
			// TODO get the lowest subtype in the subclass hierarchy for element, and only map element to that subtype.
			// for now, the desired types are added manually...
			if(type.interpretationOf.name.equals("Concentrator class") || type.interpretationOf.name.equals("SmartMeter class")){ 
				for(element : type.elements){	
					var degreeOfNode = calculateDegreeOfNode(element);
					elementDegreeMap.put(element, degreeOfNode)					
				}			
			}
			if(!elementDegreeMap.empty){
				degreeOfNodes.put(type, elementDegreeMap);
			}
		}
		return degreeOfNodes;
	}
	
	/**
	 * 
	 */	
	public static def calculateNumberOfHopsForSmartGridElement(DefinedElement element){
		var numberOfHops = 0
		var currentElement = element
		while(currentElement.getParerntOfElement !== null){
				numberOfHops++
				currentElement = currentElement.getParerntOfElement
		}		
		return numberOfHops
	}

	static def getReferencesOfElement(DefinedElement element){
		var references = new BasicEList<RelationLink>
		var definedElementContainer = element.eContainer		
		if(definedElementContainer instanceof PartialInterpretationImpl){ // TODO put the similar parts in a separate method... this is ugly...
			var container = definedElementContainer as PartialInterpretationImpl
			var referenceTypes = container.partialrelationinterpretation
			for(referenceType : referenceTypes){
				for(link : referenceType.relationlinks){
					// TODO add support for all relation link types!!!
					if(link instanceof BinaryElementRelationLinkImpl){
						var binaryLink = link as BinaryElementRelationLinkImpl
						if(binaryLink.basicGetParam1.equals(element))
							references.add(link)
					}
				}				
			}
		}else if (definedElementContainer instanceof LogicProblemImpl){
			var container = definedElementContainer as LogicProblemImpl
			if (container.eContainer instanceof PartialInterpretationImpl){
				var partialInterpretation = container.eContainer as PartialInterpretationImpl
				var referenceTypes = partialInterpretation.partialrelationinterpretation
				for(referenceType : referenceTypes){
					for(link : referenceType.relationlinks){
						// TODO add support for all relation link types!!!
						if(link instanceof BinaryElementRelationLinkImpl){
							var binaryLink = link as BinaryElementRelationLinkImpl
							if(binaryLink.basicGetParam1.equals(element))
								references.add(link)
						}
					}				
				}				
			}
		}
		return references
	}
	/**
	 * Via SmartGrid-specific bidirectional communication relation between Entities 
	 */
	static def getParerntOfElement(DefinedElement element){
		var DefinedElement parent = null
		for (reference : element.referencesOfElement) {
			if (reference.eContainer instanceof PartialRelationInterpretationImpl) {
				var referenceContainer = reference.eContainer as PartialRelationInterpretationImpl
				if(referenceContainer.interpretationOf.name.equals("communicationParent reference Entity")){
					if(reference instanceof BinaryElementRelationLinkImpl)
						parent = (reference as BinaryElementRelationLinkImpl).basicGetParam2
				}
					
			}
		}
		return parent
	}
		
	/**
	 * Via SmartGrid-specific bidirectional communication relation between Entities 
	 */
	static def getChildrenOfElement(DefinedElement element){
		var children = new BasicEList<RelationLink>
		for (reference : element.referencesOfElement) {
			if (reference.eContainer instanceof PartialRelationInterpretationImpl) {
				var referenceContainer = reference.eContainer as PartialRelationInterpretationImpl
				if(referenceContainer.interpretationOf.name.equals("communicationChild reference Entity"))
					children.add(reference)
			}
		}
		return children
	}
	
	static def typesOfElement(DefinedElement e, PartialInterpretation i) {
		i.problem.types.filter(TypeDefinition).filter[it.elements.contains(e)] +
		i.partialtypeinterpratation.filter[it.elements.contains(e)].map[it.interpretationOf]
	}	
	
	static def elementIsSmartMeter(DefinedElement element, PartialInterpretation partialInterpretation){
		var types = element.typesOfElement(partialInterpretation).toList
		for(type : types){
			if(type.name.equals("SmartMeter class"))
				return true			
		}
		return false
	}
	
	public static def elementIsRepeater (DefinedElement element, PartialInterpretation partialInterpretation){
		if(elementIsSmartMeter(element, partialInterpretation)){
			if(!getChildrenOfElement(element).empty)
				return true
		}
		return false
	}
	
	public static def getNumberOfElements(PartialInterpretation partialInterpretation){
		// TODO our initial model now has only one element (the root concentrator),
		// but the number of initial elements should be added automatically on top of the partial elements. 
		var numberOfElements = 1
		for(element : partialInterpretation.newElements){
			numberOfElements++
		}	
		return numberOfElements
	}
	
	public static def getNumberOfRepeaters (PartialInterpretation partialInterpretation){
		var numberOfRepeaters = 0
		for(element : partialInterpretation.newElements){
			if(elementIsRepeater(element, partialInterpretation)){
				numberOfRepeaters++
			}
		}		
		return numberOfRepeaters
	}
	
	public static def calculateMaximumDegreeOfRepeaters(PartialInterpretation partialInterpretation){
		var degrees = calculateDegreeOfNodes(partialInterpretation)
		var maxDegree = 0
		var typeIterator = degrees.entrySet.iterator
		while(typeIterator.hasNext){
			var outerpair = typeIterator.next as Map.Entry<PartialTypeInterpratation, HashMap<DefinedElement, Integer>>;
			if(outerpair.key.interpretationOf.name.equals("SmartMeter class")){	
				var defElementIterator  = outerpair.value.entrySet.iterator				
				while (defElementIterator.hasNext){
					var innerpair = defElementIterator.next
					
					if(elementIsRepeater(innerpair.key, partialInterpretation) 
					&& (
					 (innerpair.value as Integer).intValue > maxDegree)){
						maxDegree = (innerpair.value as Integer).intValue	
					}									
					defElementIterator.remove
				} 	
			}
	        typeIterator.remove 
		}
		return maxDegree
	}
	
	public static def calculateMinimumDegreeOfRepeaters(PartialInterpretation partialInterpretation){
		var degrees = calculateDegreeOfNodes(partialInterpretation)
		var minDegree = -1
		var typeIterator = degrees.entrySet.iterator
		while(typeIterator.hasNext){
			var outerpair = typeIterator.next as Map.Entry<PartialTypeInterpratation, HashMap<DefinedElement, Integer>>;
			if(outerpair.key.interpretationOf.name.equals("SmartMeter class")){	
				var defElementIterator  = outerpair.value.entrySet.iterator				
				while (defElementIterator.hasNext){
					var innerpair = defElementIterator.next
					
					if(elementIsRepeater(innerpair.key, partialInterpretation) 
					&& (minDegree == -1 
					|| (innerpair.value as Integer).intValue < minDegree)){
						minDegree = (innerpair.value as Integer).intValue	
					}									
					defElementIterator.remove
				} 	
			}
	        typeIterator.remove 
		}
		return minDegree
	}
	
	public static def calculateMinimumDegreeOfConcentrators(PartialInterpretation partialInterpretation){
		var degrees = calculateDegreeOfNodes(partialInterpretation)
		var minDegree = -1
		var typeIterator = degrees.entrySet.iterator
		while(typeIterator.hasNext){
			var outerpair = typeIterator.next as Map.Entry<PartialTypeInterpratation, HashMap<DefinedElement, Integer>>;
			if(outerpair.key.interpretationOf.name.equals("Concentrator class")){	
				var defElementIterator  = outerpair.value.entrySet.iterator				
				while (defElementIterator.hasNext){
					var innerpair = defElementIterator.next
					
					if((minDegree == -1 || (innerpair.value as Integer).intValue < minDegree)){
						minDegree = (innerpair.value as Integer).intValue	
					}		
												
					defElementIterator.remove
				} 	
			}
	        typeIterator.remove 
		}
		return minDegree
	}
	
	public static def calculateMaximumDegreeOfConcentrators(PartialInterpretation partialInterpretation){
		var degrees = calculateDegreeOfNodes(partialInterpretation)
		var maxDegree = 0
		var typeIterator = degrees.entrySet.iterator
		while(typeIterator.hasNext){
			var outerpair = typeIterator.next as Map.Entry<PartialTypeInterpratation, HashMap<DefinedElement, Integer>>;
			if(outerpair.key.interpretationOf.name.equals("Concentrator class")){	
				var defElementIterator  = outerpair.value.entrySet.iterator				
				while (defElementIterator.hasNext){
					var innerpair = defElementIterator.next
					
					if((innerpair.value as Integer).intValue > maxDegree){
						maxDegree = (innerpair.value as Integer).intValue	
					}	
													
					defElementIterator.remove
				} 	
			}
	        typeIterator.remove 
		}
		return maxDegree
	}

	public static def calculateAverageNumberOfHops(PartialInterpretation partialInterpretation){
		val hops = new ArrayList<Integer>
		var sum = 0
		for (element : partialInterpretation.newElements) {
			val hop = calculateNumberOfHopsForSmartGridElement(element)
			hops.add(hop)
		}
		for(hop : hops){
			sum += hop.intValue
		}
		return (sum as double)/hops.size
	}

	public static def calculateMinimumNumberOfHops(PartialInterpretation partialInterpretation){
		var minHop = -1 	
		for (element : partialInterpretation.newElements) {
			val hop = calculateNumberOfHopsForSmartGridElement(element)
			if(hop < minHop || minHop == -1){
				minHop = hop
			}
		}
		return minHop
	}
	
	public static def calculateMaximumNumberOfHops(PartialInterpretation partialInterpretation){
		var maxHop = 0
		for (element : partialInterpretation.newElements) {
			val hop = calculateNumberOfHopsForSmartGridElement(element)
			if(hop > maxHop)
				maxHop = hop.intValue
		}
		return maxHop
	}
	
	public static def calculateAverageRepeaterDegree(PartialInterpretation partialInterpretation){
		var degrees = calculateDegreeOfNodes(partialInterpretation)
		var numberOfRepeaters = 0
		var sum = 0
		var typeIterator = degrees.entrySet.iterator
		while(typeIterator.hasNext){
			var outerpair = typeIterator.next as Map.Entry<PartialTypeInterpratation, HashMap<DefinedElement, Integer>>;
			if(outerpair.key.interpretationOf.name.equals("SmartMeter class")){	
				var defElementIterator  = outerpair.value.entrySet.iterator				
				while (defElementIterator.hasNext){
					var innerpair = defElementIterator.next
					
					if(elementIsRepeater(innerpair.key, partialInterpretation)){
						numberOfRepeaters++
						sum += (innerpair.value as Integer).intValue	
					}									
					defElementIterator.remove
				} 	
			}
	        typeIterator.remove 
		}
		return (sum as double)/numberOfRepeaters
	}
	
	public static def calculateAverageConcentratorDegree(PartialInterpretation partialInterpretation){
		// TODO metamodell now only contains 1 concentrator, so the average is going to be it's degree
		// Implement this function to calculate average for multiple concentrators... 
		return calculateMaximumDegreeOfConcentrators(partialInterpretation)
	}
	
	public static def calculatePercentageOfRepeatersInSmartGrid(PartialInterpretation partialInterpretation){
		var numberOfElements = getNumberOfElements(partialInterpretation)
		var numberOfRepeaters = getNumberOfRepeaters(partialInterpretation)
		var double percentage =  (numberOfRepeaters as double)*100/numberOfElements
		return percentage
	}
}
