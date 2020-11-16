package ca.mcgill.dslreasoner.runner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class ViatraRunner implements IGeneratorRunner {
	private final String filename = "1.xmi";
	
	String path;
	String outputPath;
	
	public ViatraRunner(String path, String outputPath) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi",new XMIResourceFactoryImpl());

		this.path = path;
		this.outputPath = outputPath;
	}
	
	public List<EObject> runGeneration(int run) throws Exception {
		System.out.println(System.getProperty("user.dir"));
		ResourceSet resourceSet = new ResourceSetImpl();
		
	    Process p = Runtime.getRuntime().exec("java -jar Viatra.jar " + path);
	    InputStream is = p.getInputStream();
	    BufferedReader br = new BufferedReader(new InputStreamReader(is));
	    String line = null;
	    while ((line = br.readLine()) != null) {
	      System.out.println(line);
	    }
	    int r = p.waitFor(); // Let the process finish.
		br.close();
	    p.destroy();
		
		List<EObject> results = new ArrayList<>();
		for (int i = 1; i <= run; i++) {
			Resource resource = resourceSet.getResource(URI.createFileURI(outputPath + "run" + i + "/" + i + "_" + filename), true);
			results.add(resource.getContents().get(0));
		}
		
		return results;
	}

}
