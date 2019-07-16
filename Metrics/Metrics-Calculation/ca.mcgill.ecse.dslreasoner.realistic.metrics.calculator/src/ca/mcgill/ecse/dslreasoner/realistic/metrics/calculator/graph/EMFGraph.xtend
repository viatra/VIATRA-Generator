package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.Metric
import java.util.ArrayList
import java.util.HashSet
import java.util.List
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference

class EMFGraph extends Graph{	
	def void init (EObject root, List<Metric> metrics, String name, List<EReference> referenceTypes){
		val otherContents = root.eAllContents.toList();
		otherContents.add(root);
		init(otherContents, metrics, name, referenceTypes);
	}
	
	/**
	 * init the graph with all nodes and reference types in the meta model
	 * @param objects: objects in the instance model (exclude root)
	 * @param metrics: metrics to be evaluated
	 * @param name: name of the instance model
	 * @param ReferenceTypes: reference types defined in the meta model
	 */
	def void init(List<EObject> objects, List<Metric> metrics, String name, List<EReference> referenceTypes){
		objects.forEach[it|
			var types = new HashSet(it.eClass.EAllSuperTypes.map[it|it.name]);
			types.add(it.eClass.name);
			statistic.addNodeWithAllTypes(it, types);
		]
		
		referenceTypes.forEach[it|
			var typeToAdd = it;
		
			// TODO: Here is to only consider one part of opposite edges
//		  	if(it.upperBound != -1 && it.EOpposite !== null && 
//		  		(it.EOpposite.upperBound == -1 || it.EOpposite.upperBound > it.upperBound
//		  	)){
//				typeToAdd = it.EOpposite;
//			}
			//if(!typeToAdd.name.equals('incomingTransitions')){
				statistic.addEdgeType(typeToAdd.name);
			//}
		];
		
		objects.forEach[source|
			source.eClass.EAllReferences.forEach[r|
				//add the type first (if it is not added already)
				//many references
//				if(r.name.equals('incomingTransitions')){
//					return;
//				}
				if(r.isMany){
					source.getNeighbours(r).forEach[target|
						addEdge(source, target, r);
					]
				}else{
					//single references
					val target = source.eGet(r) as EObject;
					addEdge(source, target, r);
				}
			]
		]
		
		this.metrics = metrics;
		this.name = name;
	}
	
	/**
	 * Set basic information for the output
	 */
   override setBasicInformation(ArrayList<ArrayList<String>> output){
		val metaInfo = new ArrayList<String>();
		metaInfo.add(META_MODEL_HEADER);
		metaInfo.add(this.metaModel);
		
		val edgeInfo = new ArrayList<String>();
		edgeInfo.add(NUM_EDGE_TYPE_HEADER);
		edgeInfo.add(this.statistic.allTypes.size()+"");
		
		val nodeInfo = new ArrayList<String>();
		nodeInfo.add(NUM_NODE_HEADER);
		nodeInfo.add(this.statistic.allNodes.size()+"");
		
		val stateInfo = new ArrayList<String>();
		stateInfo.add(STATE_ID_HEADER);
		stateInfo.add(this.name);
		
		
		output.add(metaInfo);
		output.add(edgeInfo);
		output.add(nodeInfo);
		output.add(stateInfo);
	}
	
	def EList<EObject> getNeighbours(EObject o, EReference r){
		return (o.eGet(r, true) as EList<EObject>);
	}
	
	def addEdge(EObject source, EObject target, EReference r){
		// TODO: Here is to only consider one part of opposite edges
		//check for the opposite reference and do not add if its opposite will be added
//		if(r.upperBound != -1 && r.EOpposite !== null && 
//		  		(r.EOpposite.upperBound == -1 || r.EOpposite.upperBound > r.upperBound
//		 )){
//			return;
//		}
		
		if(target !== null && r !== null){
			statistic.addEdge(source, target, r.name);
		}
	}
	
	override GraphStatistic getStatistic(){
		return this.statistic;
	}
	
	override String getName(){
		return this.name;
	}
	
	def void setMetaModel(String model){
		this.metaModel = model;
	}
	
	def String getMetaModel(){
		return this.metaModel;
	}
	
}