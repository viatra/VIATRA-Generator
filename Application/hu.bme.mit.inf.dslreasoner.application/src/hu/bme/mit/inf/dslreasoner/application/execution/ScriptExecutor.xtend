package hu.bme.mit.inf.dslreasoner.application.execution

import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ConfigReference
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ConfigSpecification
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ConfigurationScript
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.CustomEntry
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
import org.eclipse.emf.common.util.URI
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.DocumentLevelSpecification

class ScriptExecutor {
	val parser = new ApplicationConfigurationParser
	def static void main(String[] args) {
		println("generator")
	}
	
	/**
	 * Executes a script
	 */
	public def executeScript(URI uri) {
		val script = parser.parse(uri)
		script.executeScript
	}
	
	public def executeScript(ConfigurationScript script) {
		script.activateAllEPackageReferences
		val tasks = script.commands.filter(Task)
		for(task : tasks.filterNull) {
			task.execute
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
	
	def public dispatch execute(GenerationTask task) {
		val generationTaskExecutor = new GenerationTaskExecutor
		generationTaskExecutor.executeGenerationTask(task,this)
	}
	
	def public dispatch execute(Task task) {
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