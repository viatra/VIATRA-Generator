package hu.bme.mit.inf.dslreasoner.run

import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage
import java.io.File
import java.util.LinkedList
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope

class MeasurePatternCoverage {
	
	static def void init() {
		YakindummPackage.eINSTANCE.eClass
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
	}
	
	static def List<String> loadAllModelPathsInDirectory(String path) {
		val File directory = new File(path);
		if(directory.exists() && directory.isDirectory()) {
			val filePaths = new LinkedList
			for(File f  : directory.listFiles()) {
				if(f.isFile()) {
					val filePath =  f.getPath();
					if(filePath.endsWith("xmi")) {
						filePaths.add(filePath);
					}
				}
			}
			return filePaths;
		} else {
			throw new IllegalArgumentException("invalid path");
		}
	}
	
	static def EObject loadModel(String path) {
		val rs = new ResourceSetImpl
		val resource = rs.getResource(URI.createFileURI(path), true);
		return resource.getContents().get(0);
	}
	
	
	def static void main(String[] args) {
		init()
		val allModelPaths = loadAllModelPathsInDirectory("D:\\Eclipse\\GIT\\fmhe-analysis\\models-renamed")
		val wfPatternsWOSynch = hu.bme.mit.inf.dslreasoner.partialsnapshot_mavo.yakindu.Patterns.instance.specifications
		.filter[spec |
			!YakinduLoader::patternsWithSynchronization.exists[spec.fullyQualifiedName.endsWith(it)]
		].filter[
			it.allAnnotations.exists[it.name== "Constraint"]
		].toList
		
		println('''type;id;«FOR pattern : wfPatternsWOSynch SEPARATOR ";"»«pattern.fullyQualifiedName»«ENDFOR»''')
		for(modelPath : allModelPaths) {
			//println(modelPath)
			val model = loadModel(modelPath)
			val engine = ViatraQueryEngine.on(new EMFScope(model))
			val fileName = modelPath.split("\\\\")
			val fileNameWOExtension = fileName.last.split("\\.").head
			val fileNameSegments = fileNameWOExtension.split("_")
			print('''«fileNameSegments.get(0)»;«fileNameSegments.get(1)»''')
			for(pattern : wfPatternsWOSynch) {
				val matcher = pattern.getMatcher(engine)
				print(''';«matcher.countMatches»''')
			}
			println()
		}
	}
}