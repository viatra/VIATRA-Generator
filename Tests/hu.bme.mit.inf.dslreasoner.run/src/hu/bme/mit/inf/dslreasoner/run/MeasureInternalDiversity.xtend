package hu.bme.mit.inf.dslreasoner.run

import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.io.File
import java.util.LinkedList
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class MeasureInternalDiversity {
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
	}
	
	
	def static void main(String[] args) {
		init()
		
	}
	
	def static run(String path, String scenario) {
		val range = 20
		
		measureDiversity(scenario,path,range)
	}
	
	def static void measureDiversity(String scenario, String path, int depth) {
		val file = new File(path)
		if(file.isDirectory) {
			val subfiles = file.list
			val xmiSubfiles = subfiles.filter[it.endsWith(".xmi")]
			if(!xmiSubfiles.empty) {
				measureDiversity(scenario,file,xmiSubfiles.map[new File(path+"/"+it)].toList,path,depth)
			} else {
				for(subfile : subfiles) {
					measureDiversity(scenario,path+"/"+subfile,depth)
				}
			}
		} else if(file.isFile) {
			// Do nothing
		}	
	}
	
	def static void measureDiversity(String scenario, File parent, List<File> files, String path, int depth) {
		val workspace = new FileSystemWorkspace(path,"")
		//val file2Neighbourhood = new HashMap<File,List<?>>
		for(file : files) {
			val MetamodelLoader loader = new YakinduLoader(workspace) => [it.useSynchronization = false it.useComplexStates = true]
			val metamodelTransformationOutput = ecore2Logic.transformMetamodel(loader.loadMetamodel,new Ecore2LogicConfiguration)
			
			val model = workspace.readModel(EObject,file.name)
			val partialModel = partialInterpretation2Logic.transform(metamodelTransformationOutput,model.eResource,false)
			val list = representationList(partialModel,depth)
			try {
				val runIndex = file.name.runIndex
				val modelIndex = file.name.modelIndex
				print('''«scenario»;«runIndex»;«modelIndex»''')
			} catch (Exception e) {
				print('''«scenario»;0;«file.name»''')
			}
			for(i : 0..<list.size) {
				print(''';«list.get(i).keySet.size»''')
			}
			print(";"+(list.last.keySet.size*1.0 /partialModel.newElements.size))
			println
		}
	}
	
	protected def static runIndex(String name) {
		name.split("\\.").head.split('_').get(1)
	}
	protected def static modelIndex(String name) {
		name.split("\\.").head.split('_').get(2)
	}
	
	protected def static  representationList(PartialInterpretation partialModel, int depth) {
		val list = new LinkedList
		for(i : 0..<depth) {
			val neighbourhood = neiguboirhoodComputer.createRepresentation(partialModel,i,0,0)
			//val m = neighbourhood.modelRepresentation
			//println(m)
			list.add(neighbourhood.modelRepresentation)
		}
		return list
	}
}