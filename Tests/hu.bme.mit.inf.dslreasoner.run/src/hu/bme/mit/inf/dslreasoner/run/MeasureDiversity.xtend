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
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import java.util.HashSet
import java.util.ArrayList
import java.util.Comparator

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
	}
	
	
	def static void main(String[] args) {
		init()
		val range = 20
		val path = '''D:/FASE18Meas/'''
		val scenarios = #[
			"MetamodelOnly_Alloy_Symmetry0",
			"MetamodelOnly_Alloy_Symmetry10",
			//"MetamodelOnly_Alloy_Symmetry30",
			"MetamodelOnly_Alloy_SymmetryDefault",
			//"MetamodelOnly_VS_Fix_No",
			"MetamodelOnly_VS_Fix_R1",
			"MetamodelOnly_VS_Fix_R2",
			"MetamodelOnly_VS_Fix_R3"
			//,"RemoHF"
		]
		
		println('''Scenario;Run;Model1;Model2;«FOR i: 0..<range SEPARATOR ';'»r«i»«ENDFOR»''')
		for(scenario : scenarios) {
			measureDiversity(scenario,path+"/"+scenario,range)
		}
		//println()println()
		
//		println('''Scenario;Run;Model;«FOR i: 0..<range SEPARATOR ';'»r«i»«ENDFOR»;sn/gn''')
//		for(scenario : scenarios) {
//			MeasureInternalDiversity::run(path+"/"+scenario,scenario)
//		}		
	}
	
	def static void measureDiversity(String scenario, String path, int depth) {
		val file = new File(path)
		if(file.isDirectory) {
			val subfiles = file.list
			val xmiSubfiles = subfiles.filter[it.endsWith(".xmi")]
			if(!xmiSubfiles.empty) {
				measureDiversity(scenario, file,xmiSubfiles.map[new File(path+"/"+it)].toList,path,depth)
			} else {
				for(subfile : subfiles) {
					measureDiversity(scenario, path+"/"+subfile,depth)
				}
			}
		} else if(file.isFile) {
			// Do nothing
		}	
	}
	
	def static void measureDiversity(String scenario, File parent, List<File> files, String path, int depth) {
		val workspace = new FileSystemWorkspace(path, "")
		//val file2Neighbourhood = new HashMap
		
		files.sort(new FileComparator)
		
		val neighbours = new ArrayList
		for(i:0..<depth){
			neighbours.add(new HashSet)
		}
		
		for (file : files.filter[Integer.parseInt(it.name.runIndex) <= 20]) {
			val MetamodelLoader loader = new YakinduLoader(workspace) => [
				it.useSynchronization = false
				it.useComplexStates = true
			]
			val metamodelTransformationOutput = ecore2Logic.transformMetamodel(loader.loadMetamodel,
				new Ecore2LogicConfiguration)

			val model = workspace.readModel(EObject, file.name)
			val partialModel = partialInterpretation2Logic.transform(metamodelTransformationOutput, model.eResource,
				false)
			val list = representationList(partialModel, depth)

			//file2Neighbourhood.put(file, list)
			
			print('''«scenario»;«file.name.runIndex»;«file.name.modelIndex»''')
			for (i : 0 ..< list.size) {
				val s1 = list.get(i)
				neighbours.get(i).addAll(s1)
				print(";" + neighbours.get(i).size)
			}
			println()
		}
	}
	
	
//	def static void measureDiversity(String scenario, File parent, List<File> files, String path, int depth) {
//		val workspace = new FileSystemWorkspace(path,"")
//		val file2Neighbourhood = new HashMap
//		for(file : files) {
//			val MetamodelLoader loader = new YakinduLoader(workspace) => [it.useSynchronization = false it.useComplexStates = true]
//			val metamodelTransformationOutput = ecore2Logic.transformMetamodel(loader.loadMetamodel,new Ecore2LogicConfiguration)
//			
//			val model = workspace.readModel(EObject,file.name)
//			val partialModel = partialInterpretation2Logic.transform(metamodelTransformationOutput,model.eResource,false)
//			val list = representationList(partialModel,depth)
//			
//			file2Neighbourhood.put(file,list)
//		}
//		for(file1Index : 0..<files.size) {
//			val file1 = files.get(file1Index)
//			if(Integer.parseInt(file1.name.runIndex)<=20) {
//				for(file2Index : 0..<file1Index) {
//					val file2 = files.get(file2Index)
//					val file1Representation = file2Neighbourhood.get(file1)
//					val file2Representation = file2Neighbourhood.get(file2)
//					print('''«scenario»;«file1.name.runIndex»;«file1.name.modelIndex»;«file2.name.modelIndex»''')
//					if(file1Representation.size == file1Representation.size) {
//						for(i : 0..<file1Representation.size) {
//							val s1 = file1Representation.get(i)
//							val s2 = file2Representation.get(i)
//							
//							val commonSet = new HashSet(s1)
//							commonSet.addAll(s2)
//							
//							val diff = (commonSet.size-s1.size) +  (commonSet.size-s2.size)
//							print(";"+diff)
//						}
//					} else {
//						throw new AssertionError('''length of representations is !=''')
//					}
//					println()
//				}
//			}
//		}
//	}
	
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
			list.add(neighbourhood.modelRepresentation.keySet.map[it.hashCode].toSet)
		}
		return list
	}
}

class FileComparator implements Comparator<File> {
	
	override compare(File arg0, File arg1) {
		val a = Integer.parseInt(MeasureDiversity::modelIndex(arg0.name))
		val b = Integer.parseInt(MeasureDiversity::modelIndex(arg1.name))
		Integer.compare(a,b)
	}
	
}