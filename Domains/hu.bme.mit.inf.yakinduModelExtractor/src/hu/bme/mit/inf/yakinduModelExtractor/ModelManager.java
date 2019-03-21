package hu.bme.mit.inf.yakinduModelExtractor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.yakindu.sct.model.sgraph.SGraphPackage;

public class ModelManager {
	ResourceSet resourceSet;
	
	public ModelManager() {
		init();
	}
	
	public void init() {
		SGraphPackage.eINSTANCE.eClass();
		NotationPackage.eINSTANCE.eClass();
		resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
	}
	
	public List<String> loadAllModelPathsInDirectory(String path) {
		File directory = new File(path);
		if(directory.exists() && directory.isDirectory()) {
			List<String> filePaths = new LinkedList<>();
			for(File f  : directory.listFiles()) {
				if(f.isFile()) {
					String filePath =  f.getPath();
					if(filePath.endsWith("sct")) {
						filePaths.add(filePath);
					}
				}
			}
			return filePaths;
		} else {
			throw new IllegalArgumentException("invalid path");
		}
	}
	
	public EObject loadModel(String path) {
		Resource resource = this.resourceSet.getResource(URI.createFileURI(path), true);
		return resource.getContents().get(0);
	}
	
	public boolean saveModel(EObject root, String path) {
		Resource resource = this.resourceSet.createResource(URI.createURI(path));
		resource.getContents().add(root);
		try {
			resource.save(null);
			return true;
		} catch (IOException e) {
			System.err.println("Unable to save file: "+path);
			return false;
		}
	}
	
	public boolean saveFile(String path, String content) {
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "utf-8"))) {
		   writer.write(content.toString());
		   return true;
		} catch (IOException ex) {
			System.err.println("Unable to save file: "+path);
			return false;
		}
	}
}
