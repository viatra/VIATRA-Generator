package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.statecoder

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage
import java.util.ArrayList
import java.util.LinkedList
import java.util.List
import java.util.Map
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.viatra.dse.statecode.IStateCoder
import org.eclipse.viatra.dse.statecode.IStateCoderFactory
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.base.api.FeatureListener
import org.eclipse.viatra.query.runtime.base.api.IndexingLevel
import org.eclipse.viatra.query.runtime.base.api.InstanceListener
import org.eclipse.viatra.query.runtime.emf.EMFBaseIndexWrapper
import org.eclipse.viatra.query.runtime.emf.EMFScope
import org.eclipse.xtend.lib.annotations.Accessors
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation
import java.util.Set
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2NeighbourhoodRepresentation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialPrimitiveInterpretation

class NeighbourhoodBasedStateCoderFactory implements IStateCoderFactory {
	val List<NeighbourhoodBasedPartialInterpretationStateCoder> statecoders = new LinkedList
	
	val int range
	val int parallels
	val int maxNumber
	val Set<TypeDeclaration> relevantTypes
	val Set<RelationDeclaration> relevantRelations
	
	public new() {
		this.range = PartialInterpretation2NeighbourhoodRepresentation::FixPointRage
		this.parallels = PartialInterpretation2NeighbourhoodRepresentation::FullParallels
		this.maxNumber = PartialInterpretation2NeighbourhoodRepresentation::MaxNumbers
		this.relevantTypes = null
		this.relevantRelations = null
	}
	
	public new(int range, int parallels, int maxNumber, Set<TypeDeclaration> relevantTypes, Set<RelationDeclaration> relevantRelations) {
		this.range = range
		this.parallels = parallels
		this.maxNumber = maxNumber
		this.relevantTypes = relevantTypes
		this.relevantRelations = relevantRelations
	}
	
    synchronized override createStateCoder() {
    	val res = new NeighbourhoodBasedPartialInterpretationStateCoder(statecoders.size,
    		range,parallels,maxNumber,relevantTypes,relevantRelations)
    	statecoders += res
        return res
    }
    def getSumStatecoderRuntime() {
    	statecoders.map[statecoderRuntime].reduce[p1, p2|p1+p2]
    }
}

class NeighbourhoodBasedPartialInterpretationStateCoder implements IStateCoder{
   	val int id;
   	val int range
	val int parallels
	val int maxNumber
	val Set<TypeDeclaration> relevantTypes
	val Set<RelationDeclaration> relevantRelations
	
	val calculator =
    	new PartialInterpretation2ImmutableTypeLattice
    var PartialInterpretation target
	
	private var Map<DefinedElement, ? extends AbstractNodeDescriptor> nodeRepresentations = null
	private var Map<? extends AbstractNodeDescriptor, Integer> modelRepresentation = null
	
	/*public new(int id) {
		this.id = id
		this.range = PartialInterpretation2NeighbourhoodRepresentation::FixPointRage
		this.parallels = PartialInterpretation2NeighbourhoodRepresentation::FullParallels
		this.maxNumber = maxNumber = PartialInterpretation2NeighbourhoodRepresentation::MaxNumbers
		this.relevantTypes = relevantTypes
		this.relevantRelations = relevantRelations
	}*/
	
	public new(int id, int range, int parallels, int maxNumber, Set<TypeDeclaration> relevantTypes, Set<RelationDeclaration> relevantRelations) {
		this.id = id
		this.range = range
		this.parallels = parallels
		this.maxNumber = maxNumber
		this.relevantTypes = relevantTypes
		this.relevantRelations = relevantRelations
	}
    
    @Accessors(PUBLIC_GETTER) var long statecoderRuntime = 0
         
//    val range = -1
//    val par = Integer.MAX_VALUE
    //val deeprepresentation = false

    /////////
    // Caching version
    /////////
    synchronized private def refreshStateCodes() {
    	if(this.nodeRepresentations === null || this.modelRepresentation === null) {
    		val startTime = System.nanoTime
    		//relevantObjects.forEach[println(it)]
    		val code = calculator.createRepresentation(target,range,parallels,maxNumber,relevantTypes,relevantRelations)
    		this.modelRepresentation = code.modelRepresentation
    		this.nodeRepresentations = code.nodeRepresentations
    		statecoderRuntime += (System.nanoTime - startTime)
    	}
    }
    synchronized override createActivationCode(IPatternMatch match) {
    	refreshStateCodes
        
        val startTime = System.nanoTime
        val size = match.specification.parameters.size
        val res = new ArrayList(size)
        var int index = 0
        var int equivalenceHash = 0
        val prime = 31
	   	
        while(index < size) {
        	res.add(getCode(match.get(index)))
        	index++
        	for(var i = 0; i<index; i++) {
        		val number = if(match.get(index) === match.get(i)){1}else{0}
        		equivalenceHash = prime * equivalenceHash + number
        	}
        }
        
        statecoderRuntime += (System.nanoTime - startTime)
        return match.specification.fullyQualifiedName->(res->equivalenceHash).hashCode
    }
    
    
    def private getCode(Object o) {
    	if(o instanceof DefinedElement) {
    		this.nodeRepresentations.get(o)
    	} else if(o instanceof PartialInterpretation || o instanceof LogicProblem) {
			return null
		} else if(o instanceof PartialRelationInterpretation) {
			return o.interpretationOf.name
		} else if(o instanceof PartialTypeInterpratation) {
			if(o instanceof PartialPrimitiveInterpretation) {
				o.class.simpleName.hashCode
			} else if (o instanceof PartialComplexTypeInterpretation){
				return o.interpretationOf.name.hashCode
			} else {
				throw new UnsupportedOperationException('''Unsupported type: «o.class.simpleName»''')
			}
		} else {
			throw new UnsupportedOperationException('''Unsupported type: «o.class.simpleName»''')
		}
    }
    
    synchronized override createStateCode() {
    	refreshStateCodes
    	return this.modelRepresentation.hashCode
    }
	/////////
    // Caching version
    /////////

    /////////
    // Recalculating version
    /////////
//    synchronized override createActivationCode(IPatternMatch match) {
//    	val nodes = calculator.createRepresentation(getRelevantObjects().toList,range,par).nodeRepresentations
//        val res = match.toArray.map[objectInMatch |
//        	nodes.get(objectInMatch)
//        ]
//        return res
//    }
//    
//    override createStateCode() {
//    	return this.calculator.createRepresentation(getRelevantObjects().toList,range,par).modelRepresentation
//    }
    /////////
    // Recalculating version
    /////////
    
    override init(Notifier notifier) {
    	this.target = notifier as PartialInterpretation
        val queryEngine = ViatraQueryEngine.on(new EMFScope(notifier))
        val baseIndex = queryEngine.getBaseIndex() as EMFBaseIndexWrapper
        val navigationHelper = baseIndex.getNavigationHelper();
       	
       	val classes = PartialinterpretationPackage.eINSTANCE.EClassifiers.filter(EClass).toSet
       	val features = classes.map[it.EAllStructuralFeatures].flatten.toSet
        navigationHelper.registerObservedTypes(
        	classes,
        	null,
        	features,
        	IndexingLevel.FULL);


        navigationHelper.addFeatureListener(features, new FeatureListener() {
            override public void featureInserted(EObject host, EStructuralFeature feature, Object value) { invalidate }
            override public void featureDeleted(EObject host, EStructuralFeature feature, Object value) { invalidate }
        });
        navigationHelper.addInstanceListener(classes, new InstanceListener() {
            override public void instanceInserted(EClass clazz, EObject instance) { invalidate }
            override public void instanceDeleted(EClass clazz, EObject instance) { invalidate }
        });
    }
	
	synchronized def public invalidate() {
		this.nodeRepresentations = null
    	this.modelRepresentation = null
	}
}
