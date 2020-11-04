package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.validation

import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.common.notify.Notifier
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.viatra.addon.validation.core.api.IConstraintSpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup
import org.eclipse.viatra.query.runtime.emf.EMFScope

class ConstraintCollection{
	val constraints = new ArrayList<IConstraintSpecification>();
	var BaseGeneratedPatternGroup patterns;
	var List<Notifier> resources = new ArrayList<Notifier>(); 
	
	
	new(List<IConstraintSpecification> constraints, List<String> uris, BaseGeneratedPatternGroup patterns){
		this.constraints.addAll(constraints);
		this.patterns = patterns;
		setURIs(uris);
	}
	
	new(List<IConstraintSpecification> constraints, BaseGeneratedPatternGroup patterns){
		this.constraints.addAll(constraints);
		this.patterns = patterns;
	}
	
	def addModel(Notifier n ){
		resources.add(n);
	}
	
	def setURIs(List<String> uris){
		val resSet = new ResourceSetImpl();
		
		for(uri : uris){
			var resource = resSet.getResource(URI.createURI(uri), true);
			resources.add(resource);
		}
	
		println('reading model finished')
	}
	
	def List<Integer> calculateViolations(){
		var results = new ArrayList<Integer>();
		
		for(resource : resources){
			val engine = initEngine(resource);
			var matches = constraints.stream.mapToInt([ele| ele.querySpecification.getMatcher(engine).countMatches]).sum();
			results.add(matches);
		}
		
		return results;
	}
	
	def ArrayList<Map<String, Integer>> calculateViolationMaps(){
		val result = new ArrayList<Map<String, Integer>>()
		
		for(resource : resources){
			val map = new HashMap<String, Integer>();
			val engine = initEngine(resource);
			constraints.forEach[
				var count = it.querySpecification.getMatcher(engine).countMatches;
				map.put(it.querySpecification.simpleName, count);
			];
			result.add(map);
		}
		return result;
	}
	
	private def initEngine(Notifier r){
		var engine = ViatraQueryEngine.on(new EMFScope(r));
		//init patterns with the new engine
		patterns.prepare(engine);
		return engine;
	}
}
