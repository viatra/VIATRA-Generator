package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.EMFGraph
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.Metric
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.MultiplexParticipationCoefficientMetric
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.NodeActivityMetric
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.OutDegreeMetric
import java.io.File
import java.io.FileNotFoundException
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.NodeTypeMetric
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.EdgeTypeMetric
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.TypedOutDegree
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage

class GraphReader{
	val ResourceSet resSet = new ResourceSetImpl();
	val referenceTypes = new ArrayList<EReference>();
	
	def static void main(String[] args){
		var g = new GraphReader(YakindummPackage.eINSTANCE);
	}
	
	new(EPackage metaModel) {
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("*",new XMIResourceFactoryImpl)
		
		//find all reference types in the meta model
		metaModel.eAllContents.forEach[
			if(it instanceof EReference){
				referenceTypes.add(it);
			}
		]
	}
	
	def List<EMFGraph> readModels(String path){
		val dir = new File(path);
		if(!dir.isDirectory){
			throw new Exception("expecting a directory");
		}
		
		val graphs = new ArrayList<EMFGraph>();
		
		val metrics = new ArrayList<Metric>();
		metrics.add(new OutDegreeMetric());
		metrics.add(new NodeActivityMetric());
		metrics.add(new MultiplexParticipationCoefficientMetric());
		metrics.add(new TypedOutDegree());		
		metrics.add(new NodeTypeMetric());
		metrics.add(new EdgeTypeMetric());
		
		//check all files in the directory with xmi
		for(String name : dir.list.filter[it| it.endsWith(".xmi")]){
			val file = new File(name);
			val roots = readModel(EObject, path,  file.name);			
			//add a list of metrics
			val g = new EMFGraph();
			for(root : roots){
				g.init(root, metrics, name.replaceFirst(".xmi", ""), referenceTypes);
			}
			
			graphs.add(g);
		}
		
		return graphs;
	}
	
	def <RootType extends EObject> List<RootType> readModel(Class<RootType> type, String path, String name) {
		try {
			val resource = resSet.getResource(getURI(path, name),true);
			if(resource === null) throw new FileNotFoundException(getURI(path, name).toString)
			else {		
				return resource.contents as List<RootType>
			}
		} catch(Exception e) {
			e.printStackTrace();
			throw new Exception(getURI(path, name).toString());
		}
	}
	
	def static getURI(String path, String name) {
		URI.createFileURI(path + "/"  + name)
	}
}