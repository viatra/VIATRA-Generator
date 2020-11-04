package ca.mcgill.ecse.socialnetwork.runner;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class Persisitence<G extends EObject> {
	private String uri;
	
	public Persisitence (String suffix, String uri){		
		//prepare to save 
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(suffix, new XMIResourceFactoryImpl());
		this.uri = uri;
	}
	
	
	/**
	 * Save the model 
	 * @return whether the model has saved successfully
	 */
	public boolean save(G model) {
		//create resource
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createURI(uri));
		resource.getContents().add(model);
		try {
			resource.save(Collections.EMPTY_MAP);
			return true;
		}catch(IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * load the model from persistent
	 * @return: the model loaded
	 */
	@SuppressWarnings("unchecked")
	public G load() {
		G model = null;
//		try {
			ResourceSet resSet = new ResourceSetImpl();
			Resource resource = resSet.getResource(URI.createURI(uri), true);
			model = (G) resource.getContents().get(0);
//		}catch (org.eclipse.emf.common.util.WrappedException e) {
//			// if the file cannot be found then return null
//			if(e.getCause().getClass() == java.io.FileNotFoundException.class) {
//				return null;
//			}
//		}
		
		return model;
	}
}
