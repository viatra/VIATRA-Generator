package hu.bme.mit.inf.dslreasoner.diversitycalculator

import TaxationWithRoot.TaxationWithRootPackage
import familytree.FamilytreePackage
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.io.File
import java.io.PrintWriter
import java.util.ArrayList
import java.util.Collections
import java.util.Comparator
import java.util.HashMap
import java.util.HashSet
import java.util.LinkedList
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngineOptions
import org.eclipse.viatra.query.runtime.localsearch.matcher.integration.LocalSearchEMFBackendFactory
import org.eclipse.viatra.query.runtime.rete.matcher.ReteBackendFactory
import org.eclipse.xtend.lib.annotations.Data
import satellite.SatellitePackage

class MeasureDiversity {
	static val partialInterpretation2Logic = new InstanceModel2PartialInterpretation
	static val neiguboirhoodComputer = new PartialInterpretation2ImmutableTypeLattice
	static val Ecore2Logic ecore2Logic = new Ecore2Logic
	
	static private def init() {
		LogiclanguagePackage.eINSTANCE.class
		LogicproblemPackage.eINSTANCE.class
		PartialinterpretationPackage.eINSTANCE.class
		Ecore2logicannotationsPackage.eINSTANCE.class
		Viatra2LogicAnnotationsPackage.eINSTANCE.class
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("*",new XMIResourceFactoryImpl)
		ViatraQueryEngineOptions.setSystemDefaultBackends(ReteBackendFactory.INSTANCE, ReteBackendFactory.INSTANCE, LocalSearchEMFBackendFactory.INSTANCE)
	}
	static class BenchmarkConfig {
	 	int range;
	 	int size
	 	PrintWriter writer
	 	String scenario
	 }
	 
	def static void main(String[] args) {
		init()
	
		val path = '''inputs'''
		val scenarios = #[

			'''FamilyTree''',
			'''Satellite''',
			'''Taxation''',
			'''FamilyTreeNoNum''',
			'''SatelliteNoNum''',
			'''TaxationNoNum'''
		]
		
		val writer = new PrintWriter(path+"/diversity.csv", "UTF-8");
		for(scenario : scenarios) {
			val config=new BenchmarkConfig();
			config.writer=writer
			config.range = 3
			config.scenario = scenario
			//config.size = 5
			//for (var i=1; i<=21;i++) {
				measureDiversity(scenario,path+"/"+scenario,config)	
			//}
			println(scenario+" finished")
		}
		writer.close();	
	}
	
	def static void measureDiversity(String scenario, String path, BenchmarkConfig config) {
		val file = new File(path)
		if(file.isDirectory) {
			val subfiles = file.list
			val xmiSubfiles = subfiles.filter[it.endsWith(".xmi")]
			if(!xmiSubfiles.empty) {
				measureDiversity(scenario, file,xmiSubfiles.map[new File(path+"/"+it)].toList,path,config)
			} else {
				for(subfile : subfiles) {
					measureDiversity(scenario, path+"/"+subfile,config)
				}
			}
		} else if(file.isFile) {
			// Do nothing
		}
	}
	
	def static void measureDiversity(String scenario, File parent, List<File> files, String path, BenchmarkConfig config) {
		val depth=config.range
		
		//collect and order models
		val workspace = new FileSystemWorkspace(path, "")
		EcorePackage.eINSTANCE.eClass
		TaxationWithRootPackage.eINSTANCE.eClass
		SatellitePackage.eINSTANCE.eClass
		FamilytreePackage.eINSTANCE.eClass
		files.sort(new FileComparator)
		
		//calculate shapes
		val modelShapeLists=new HashMap<File,List<Map<? extends AbstractNodeDescriptor, Integer>>>();
		val modelShapes=new HashMap<File,Map<? extends AbstractNodeDescriptor, Integer>>();
		for (file : files) {
			
			val model = workspace.readModel(EObject, file.name)
			
			val pckg = model.eClass.EPackage
			val metamodel = new EcoreMetamodelDescriptor(
				pckg.EClassifiers.filter(EClass).toList,
				Collections::emptySet,
				false,
				pckg.EClassifiers.filter(EEnum).toList,
				pckg.EClassifiers.filter(EEnum).map[ELiterals].flatten.toList,
				pckg.EClassifiers.filter(EClass).map[EReferences].flatten.toList,
				pckg.EClassifiers.filter(EClass).map[EAttributes].flatten.toList
			)
			val metamodelTransformationOutput = ecore2Logic.transformMetamodel(metamodel,new Ecore2LogicConfiguration)

			
			val partialModelOutput = partialInterpretation2Logic.transform(metamodelTransformationOutput, model.eResource,
				false)
			
				
			
			val list = shapeList(partialModelOutput, depth/*,matchesList*/)
			//	modelShapeLists.put(file,list)
			modelShapes.put(file,list.get(depth-1))
		}
		//println('''shapes done.''')
		val writer=config.writer
		println("Printing internal diversity of models")
		//writer.println("Scenario;File;Diversity")
		//val size= config.size as double
		for (model:files) {
			val modelshape=modelShapes.get(model)
			val amounts = modelshape.values.reduce[a,b|a+b]
			val shapes=modelshape.size() as double
			writer.println(config.scenario+","+model+","+shapes/amounts)
		}
	 }
	
	def static getRandomOrders(List<File> files, int number) {
		val sequences=new ArrayList<List<File>>();
		for (var i=0;i<number;i++) {
			val seq=new ArrayList<File>(files);
			Collections.shuffle(seq);
			sequences.add(seq);
		}
		return sequences
	}
	
	def static printShapeNumbersOnRandomOrders(List<File> files, HashMap<File, Map<? extends AbstractNodeDescriptor, Integer>> shapes, int number) {
		val sequences=new ArrayList<List<File>>();
		println("Printing generated random orders (models apper in original order)")
		for (var i=0;i<number;i++) {
			val seq=new ArrayList<File>(files);
			Collections.shuffle(seq);
			sequences.add(seq);
			println("Model;NewIndex")
			for (model:files) {
				println(model+","+seq.indexOf(model));
			}
		}
		
		println("Printing generated random orders (models apper in original order)")
		println("SeqNo;Index;Model;NewShapes;AllShapes")
		
		var seqindx=0;
		for (seq:sequences) {
			val currshapes=new HashSet<AbstractNodeDescriptor>()
			var indx=0
			for (model:seq){
				val beforesize=currshapes.size
				currshapes.addAll(shapes.get(model).keySet)
				val aftersize=currshapes.size
				val diff=aftersize-beforesize
				println(seqindx+","+indx+","+model+","+diff+","+currshapes.size)	
				indx++;
			}
			seqindx++;
		}
	}
	
	 def static void printShapeNumbers(List<File> order, Map<File,Map<? extends AbstractNodeDescriptor, Integer>> shapes) {
	 	println("Model;InternalDiversity;NewShapes;AllCurrentShapes")
		val currshapes=new HashSet<AbstractNodeDescriptor>()
		
		for (file:order) {
			val beforesize=currshapes.size
			currshapes.addAll(shapes.get(file).keySet)
			val aftersize=currshapes.size
			val diff=aftersize-beforesize
			println(file+","+shapes.get(file).size+","+diff+","+currshapes.size)
		}
	 }
	
	
	protected def static runIndex(String name) {
		val res = name.split("\\.").head.split('_').get(0)
		if(res.startsWith("result")) {
			return res.substring(6)
		} else {
			return res
		}
	}
	protected def static modelIndex(String name) {
		name.split("\\.").head.split('_').get(1)
	}
	
	protected def static  representationList(PartialInterpretation partialModel, int depth) {
		val list = new LinkedList
		for(i : 0..<depth) {
			val neighbourhood = neiguboirhoodComputer.createRepresentation(partialModel,i,0,0)
			//val m = neighbourhood.modelRepresentation
			//println(m)
			list.add(neighbourhood.modelRepresentation.keySet.map[it.hashCode].toSet)
		}
		return list
	}
	
	protected def static List<Map<? extends AbstractNodeDescriptor, Integer>>  shapeList(PartialInterpretation partialModel, int depth/*, List<PatternWithMatches> matches*/) {

		val list = new LinkedList
		for(i : 0..<depth) {
			
			val neighbourhood = neiguboirhoodComputer.createRepresentation(partialModel,i,Integer.MAX_VALUE,Integer.MAX_VALUE/*, matchmap*/)

			val openWorldElements = partialModel.openWorldElements //+ partialModel.newElements.filter(PrimitiveElement) + partialModel.problem.elements.filter(PrimitiveElement)
			val representationsOfOpenElements = openWorldElements.map[neighbourhood.nodeRepresentations.get(it)].toSet 
			val allElementRepresentation = new HashMap(neighbourhood.modelRepresentation)
			representationsOfOpenElements.forEach[allElementRepresentation.remove(it)]
			
			val Map<Integer, Integer> hashedRepresentation = new HashMap()
			for(entry : allElementRepresentation.entrySet) {
				hashedRepresentation.put(entry.key.dataHash,entry.value)
			}
			list.add(allElementRepresentation)
		}
		return list
	}
}

@Data
class PatternWithMatches {
	String name;
	List<List<DefinedElement>> matches
}

class FileComparator implements Comparator<File> {
	
	override compare(File arg0, File arg1) {
		val r1 = Integer.parseInt(MeasureDiversity::runIndex(arg0.name))
		val r2 = Integer.parseInt(MeasureDiversity::runIndex(arg1.name))
		val runRes = Integer.compare(r1, r2)
		if(runRes === 0) {
			val a = Integer.parseInt(MeasureDiversity::modelIndex(arg0.name))
			val b = Integer.parseInt(MeasureDiversity::modelIndex(arg1.name))
			Integer.compare(a,b)
		} else {
			return runRes
		}
		arg0.name.compareTo(arg1.name)
	}
}