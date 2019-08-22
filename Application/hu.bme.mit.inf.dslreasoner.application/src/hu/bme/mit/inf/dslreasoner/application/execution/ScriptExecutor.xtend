package hu.bme.mit.inf.dslreasoner.application.execution

import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ConfigReference
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ConfigSpecification
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ConfigurationScript
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.CustomEntry
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.DocumentLevelSpecification
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.DocumentationEntry
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.EPackageImport
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.FileReference
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.FileSpecification
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GraphPatternReference
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.MemoryEntry
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.MetamodelReference
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.MetamodelSpecification
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.PartialModelReference
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.PartialModelSpecification
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.PatternSpecification
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.RuntimeEntry
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ScopeReference
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ScopeSpecification
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.Task
import hu.bme.mit.inf.dslreasoner.application.execution.util.ApplicationConfigurationParser
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel
import java.util.LinkedHashMap
import java.util.Optional
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.emf.common.util.URI
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ObjectiveSpecification
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ObjectiveReference

@FinalFieldsConstructor
class ScriptExecutor {
	val parser = new ApplicationConfigurationParser
	
	val ScriptConsole.Factory scriptConsoleFactory
	
	/**
	 * Executes a script
	 */
	def executeScript(URI uri) {
		val job = new Job('''Model Generation: «uri.lastSegment»''') {
			override protected run(IProgressMonitor monitor) {
				try{
					monitor.subTask('''Loading script''')
					val script = parser.parse(uri)
					script.executeScript(monitor)
					return Status.OK_STATUS;
				} catch(Exception e) {
					return Status.OK_STATUS
				}
			}
		}
		job.setUser(true);
		job.schedule();
	}
	
	def executeScript(ConfigurationScript script, IProgressMonitor monitor) {
		script.activateAllEPackageReferences
		val tasks = script.commands.filter(Task)
		
		for(taskIndex : 0..<tasks.size) {
			val task = tasks.get(taskIndex)
			monitor.beginTask('''Executing task«IF tasks.size>1» «taskIndex+1»«ENDIF»: «task.name»''',task.totalWork)
			task.execute(monitor)
		}
	}
	
	private def activateAllEPackageReferences(ConfigurationScript script) {
		val ecoreImports = script.imports.filter(EPackageImport).toMap[it.importedPackage.nsURI]
		val packageRegistry = script.eResource.resourceSet.packageRegistry
		for(entry : ecoreImports.entrySet) {
			//println('''«entry.key» -> «entry.value.importedPackage.name»''')
			packageRegistry.put(entry.key,entry.value.importedPackage)
		}
		
//		val viatraImports = script.imports.filter(ViatraImport)
//		for(viatraImport : viatraImports) {
//			val PatternModel importedViatra = viatraImport.importedViatra as PatternModel
//			val packagesImportedByViatra = importedViatra.importPackages.packageImport
//			for(packageImport : packagesImportedByViatra) {
//				val originalPackage = packageImport.EPackage
//				if(originalPackage.eIsProxy) {
//					println('''Proxy: «originalPackage»''')
//				} else if(ecoreImports.containsKey(originalPackage.nsURI)) {
//					packageImport.EPackage = ecoreImports.get(originalPackage.nsURI).importedPackage
//					println('''Redirected: «originalPackage.nsURI» -> «packageImport.EPackage.name»''')
//				} else {
//					println('''Unreferred: «originalPackage.name»''')
//				}
//			}
//		}
	}
	
	def dispatch void execute(GenerationTask task, IProgressMonitor monitor) {
		val generationTaskExecutor = new GenerationTaskExecutor
		generationTaskExecutor.executeGenerationTask(task,this,scriptConsoleFactory,monitor)
	}
	
	def dispatch void execute(Task task, IProgressMonitor monitor) {
		throw new IllegalArgumentException('''Unsupported task type: «task.class.simpleName»!''')
	}
	
	/**
	 * Mapping time = 100
	 * Solving = 1000 * runs
	 * Visualisation = 1000 * runs
	 */
	def protected dispatch getTotalWork(GenerationTask task) {
		val runs = if(task.runSpecified) { task.runs } else { 1	}
		val number = if(task.numberSpecified) { task.number } else { 1 }
		return 100 + runs*1000 +runs*1000
	}
	def protected dispatch getTotalWork(Task task) {
		throw new IllegalArgumentException('''Unsupported task type: «task.class.simpleName»!''')
	}
	
	def protected dispatch getName(GenerationTask task) {
		'''Model Generation'''
	}
	def protected dispatch getName(Task task) {
		throw new IllegalArgumentException('''Unsupported task type: «task.class.simpleName»!''')
	}
	
	def dispatch getMetamodelSpecification(MetamodelSpecification config) {
		config 
	}
	def dispatch getMetamodelSpecification(MetamodelReference config) {
		config.referred.specification
	}
	def dispatch getMetamodelSpecification(Void config) {
		null
	}
	
	def dispatch getPatternSpecification(PatternSpecification config) {
		config
	}
	def dispatch getPatternSpecification(GraphPatternReference config) {
		config.referred.specification
	}
	def dispatch getPatternSpecification(Void config) {
		null
	}
	
	def dispatch getPartialModelSpecification(PartialModelSpecification config) {
		config
	}
	def dispatch getPartialModelSpecification(PartialModelReference config) {
		config.referred.specification
	}
	def dispatch getPartialModelSpecification(Void config) {
		null
	}
	
	def dispatch getFileSpecification(FileSpecification config) {
		config
	}
	def dispatch getFileSpecification(FileReference config) {
		config.referred.specification
	}
	def dispatch getFileSpecification(Void config) {
		null
	}
	
	def dispatch getScopeSpecification(ScopeSpecification config) {
		config
	}
	def dispatch getScopeSpecification(ScopeReference config) {
		config.referred.specification
	}
	def dispatch getScopeSpecification(Void config) {
		null
	}
	
	def dispatch getObjectiveSpecification(ObjectiveSpecification config) {
		config
	}
	def dispatch getObjectiveSpecification(ObjectiveReference config) {
		config.referred.specification
	}
	def dispatch getObjectiveSpecification(Void config) {
		null
	}
	
	def dispatch getConfiguration(ConfigSpecification config) {
		config
	}
	def dispatch getConfiguration(ConfigReference config) {
		config.config.specification
	}
	def dispatch getConfiguration(Void config) {
		null
	}
	def transformToMap(ConfigSpecification config) {
		val map = new LinkedHashMap
		
		if(config != null) {
			for(entry : config.entries.filter(CustomEntry)) {
				map.put(entry.key,entry.value)
			}
		}
		
		return map
	}
	def getRuntimeLimit(ConfigSpecification config) {
		if(config === null) {
			return Optional::empty
		} else {
			val runtimeEntry = config.entries.filter(RuntimeEntry).head
			if(runtimeEntry!==null) {
				return Optional::of(runtimeEntry.millisecLimit)
			} else {
				return Optional::empty
			}
		}
	}
	def getMemoryLimit(ConfigSpecification config) {
		if(config === null) {
			return Optional::empty
		} else {
			val memoryEntry = config.entries.filter(MemoryEntry).head
			if(memoryEntry!==null) {
				return Optional::of(memoryEntry.megabyteLimit)
			} else {
				return Optional::empty
			}
		}
	}
	def getDocumentation(ConfigSpecification config) {
		if(config === null) {
			return Optional::empty
		} else {
			val documentationEntry = config.entries.filter(DocumentationEntry).head
			if(documentationEntry!==null) {
				val DocumentLevelSpecification value = documentationEntry.level
				val translatedValue = if(value===DocumentLevelSpecification::FULL) {
					DocumentationLevel::FULL
				} else if(value===DocumentLevelSpecification::NORMAL) {
					DocumentationLevel::NORMAL
				} else if(value===DocumentLevelSpecification::NONE) {
					DocumentationLevel::NONE
				} else {
					throw new UnsupportedOperationException('''Unable to translate documentation level "«value»"!''')
				}
				return Optional::of(translatedValue)
			}
		}
	}
}
