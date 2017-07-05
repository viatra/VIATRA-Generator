package hu.bme.mit.inf.yakinduModelExtractor;

import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.yakindu.sct.model.sgraph.State;
import org.yakindu.sct.model.sgraph.Statechart;

public class Main {

	public static void main(String[] args) {
		ModelManager manager = new ModelManager();
		Yakindu2CommonModel converter = new Yakindu2CommonModel();
		
		int models = 0;
		int objects = 0;
		
		String years[] = {"2015","2016","2017"};
		for(String year : years) {
			String folderPath = "D:\\Eclipse\\GIT\\RemoHF\\"+year;
			// Loading folder
			List<String> paths = manager.loadAllModelPathsInDirectory(folderPath);
			
			int index = 1;
			for(String path : paths) {
				Statechart s = null; 
				try{
					EObject root = manager.loadModel(path);
					s = (Statechart) root;
				} catch (Exception e) {
					System.out.println("unable to load: "+ path);
				}
				
				if(s!=null) {
					EObject s2 = converter.transform(s);
					//manager.saveModel(s2, "output/R"+year+index+".xmi");
					int countObjects = countObjects(s2);
					System.out.println(countObjects);
					objects += countObjects;
					models++;
				}
				//System.out.println(year + " Progress: " + 100.0*index/paths.size() + "%");
				index++;
			}
			
			System.out.println(year + " done.");
		}
		System.out.println("All done.");
		System.out.println(objects);
		System.out.println(models);
		System.out.println(1.0*objects/models);
	}
	
	private static int countObjects(EObject root) {
		int objects = 1;
		TreeIterator<EObject> i = root.eAllContents();
		while(i.hasNext()) {
			i.next();
			objects++;
		}
		return objects;
	}
}
