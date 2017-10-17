package hu.bme.mit.inf.dslreasoner.run

import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage
import hu.bme.mit.inf.dslreasoner.partialsnapshot_mavo.yakindu.mutated.Mutated
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.io.File
import java.util.ArrayList
import java.util.Collection
import java.util.Comparator
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.TreeSet
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope

class QueryComparator implements  Comparator<IQuerySpecification<?>>{
	
	override compare(IQuerySpecification<?> arg0, IQuerySpecification<?> arg1) {
		arg0.fullyQualifiedName.compareTo(arg1.fullyQualifiedName)
	}	
}

class CountMatches {
	var static List<IQuerySpecification<?>> wfPatterns;
	var static Map<IQuerySpecification<?>,IQuerySpecification<?>> query2Reference
	
	def static void main(String[] args) {
		YakindummPackage.eINSTANCE.eClass
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("*",new XMIResourceFactoryImpl)
		
		wfPatterns = Mutated.instance.specifications.toList;
		//wfPatterns = wfPatterns.filter[it.allAnnotations.exists[it.name == "Constraint"]].toList
		wfPatterns.sort(new QueryComparator)
		
		val groupName2Representant = new HashMap
		query2Reference = new HashMap
		for(wfPattern : wfPatterns) {
			val groupName = wfPattern.groupName
			if(groupName2Representant.containsKey(groupName)) {
				val representant = groupName2Representant.get(groupName)
				query2Reference.put(wfPattern,representant)
			} else {
				groupName2Representant.put(groupName,wfPattern)
			}
		}
		
		
		println('''modelpath;run;model;«
			FOR wfPattern:wfPatterns SEPARATOR ";"»#(«
				wfPattern.fullyQualifiedName.split("\\.").last»);hash(«
				wfPattern.fullyQualifiedName.split("\\.").last»)«ENDFOR»;«
			FOR mutant : wfPatterns.filter[query2Reference.keySet.contains(it)] SEPARATOR ';'»diff(«
				mutant.fullyQualifiedName.split("\\.").last»)«ENDFOR»'''
		)
		countMatches('''D:/FASE18Meas/MetamodelOnly_Alloy_Symmetry30''')
	}
	
	def private static simpleName(IQuerySpecification<?> wfPattern) {
		wfPattern.fullyQualifiedName.split("\\.").last
	}
	def private static groupName(IQuerySpecification<?> wfPattern) {
		wfPattern.simpleName.split('_').head
	}
	
	def static void countMatches(String path) {
		val file = new File(path)
		if(file.isDirectory) {
			for(subFileName : file.list) {
				(path + "/" + subFileName).countMatches
			}
		} else if(file.isFile) {
			if(path.endsWith("xmi")) {
				countMatches(file,path)
			}
		}	
	}
	
	def static void countMatches(File file, String path) {
		val parent = file.parent
		
		val pathSegments = path.split("/")
		val groupName = pathSegments.get(pathSegments.size-2).split("\\.").last.split("_").get(0)
		print(groupName +";")
		val nameExtension = pathSegments.get(pathSegments.size-1).split("\\.").get(0).split("_")
		val runNumber = nameExtension.get(1)
		val modelNumber = nameExtension.get(2)
		print('''«runNumber»;«modelNumber»''')
		val workspace = new FileSystemWorkspace(parent,"")
		val model = workspace.readModel(EObject,file.name)
		
		val engine = ViatraQueryEngine.on(new EMFScope(model))
		val objectCode = model.eResource.calculateObjectCode
		
		val pattern2Hash = new HashMap
		for(pattern : wfPatterns) {
			val matcher = pattern.getMatcher(engine)
			val matches = matcher.allMatches
			val hash = matches.getMatchSetDescriptor(objectCode)
			pattern2Hash.put(pattern,hash)
			print(''';«matcher.countMatches»;«hash»''')
		}
		var mutantsKilled = 0
		for(mutant : wfPatterns.filter[query2Reference.keySet.contains(it)]) {
			val equals = pattern2Hash.get(mutant) == pattern2Hash.get(query2Reference.get(mutant))
			print(''';''')
			if(equals) {
				print('0')
			} else {
				print('1')
				mutantsKilled++
			}
		}
		//print(''';«mutantsKilled»''')
		println()
	}
	
	def static Map<EObject,Integer> calculateObjectCode(Resource resource) {
		val res = new HashMap
		val iterator = resource.allContents
		var index = 1
		while(iterator.hasNext) {
			res.put(iterator.next,index++)
		}
		return res
	}
	
	def static getMatchSetDescriptor(Collection<? extends IPatternMatch> matchSet, Map<EObject,Integer> objectCode) {
		val set = new TreeSet(new ArrayComparator)
		for(match: matchSet) {
			val size = match.parameterNames.size
			val idArray = new ArrayList<Integer>(size)
			for(i:0..<size) {
				val objectInMatch = match.get(i)
				if(objectInMatch instanceof EObject) {
					val id = objectCode.get(objectInMatch)
					if(id!== null) {
						idArray+= id
					} else {
						throw new IllegalArgumentException('''Unindexed object in match: «objectInMatch»''')
					}
				} else {
					throw new IllegalArgumentException('''Unknown type object in match: "«objectInMatch.class.simpleName»"''')
				}
			}
			set += idArray
		}
		return '''«FOR match : set SEPARATOR ','»[«FOR index : match SEPARATOR ','»«index»«ENDFOR»]«ENDFOR»'''.toString.hashCode
	}
}

class ArrayComparator implements Comparator<List<Integer>> {
	
	override compare(List<Integer> arg0, List<Integer> arg1) {
		if(arg0.size === arg1.size) {
			for(i : 0..<arg0.size) {
				val comparison = arg0.get(i).compareTo(arg1.get(i))
				if(comparison !== 0) return comparison
			}
			return 0
		} else {
			throw new IllegalArgumentException('''the arrays need to be in the same size''')
		}
	}
}