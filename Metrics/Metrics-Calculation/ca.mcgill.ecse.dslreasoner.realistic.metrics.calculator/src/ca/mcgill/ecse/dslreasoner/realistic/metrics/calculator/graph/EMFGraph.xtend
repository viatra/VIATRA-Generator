package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.Metric
import java.util.ArrayList
import java.util.HashSet
import java.util.List
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtend.lib.annotations.Accessors

class EMFGraph extends Graph{	
	@Accessors(PUBLIC_GETTER)
	var EObject root;
	
	def void init (EObject root, List<Metric> metrics, String name){
		val otherContents = root.eAllContents.toList();
		val metaModel = root.eClass.EPackage;
		val referenceTypes = new ArrayList<EReference>;
		this.root = root;
		otherContents.add(root);
		
		metaModel.eAllContents.forEach[
			if(it instanceof EReference){
				referenceTypes.add(it);
			}
		]
		
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
			// TODO: Maybe want to consider all the super types as well
			var types = new HashSet();
			types.add(it.eClass.name);
			statistic.addNodeWithAllTypes(it, types);
		]
		
		referenceTypes.forEach[it|		
			// Only consider the edges that are not derived to preserve the statistical property
			if(!it.derived){
				statistic.addEdgeType(it.name);
			}
		];
		
		objects.forEach[source|
			source.eClass.EAllReferences.forEach[r|
				//many references
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
	
	def void removeReference(EReference r){
		if (statistic.containsEdgeType(r.name)){
			statistic.removeReference(r.name, r.containment);
		}
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
		//Only add the edge if the reference is not derived to preserve the statistical property
		if(target !== null && r !== null && !r.derived){
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