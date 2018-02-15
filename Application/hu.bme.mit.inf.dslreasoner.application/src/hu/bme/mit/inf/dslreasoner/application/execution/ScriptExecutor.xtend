package hu.bme.mit.inf.dslreasoner.application.execution

import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ConfigurationScript
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GenerationTask
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.GraphPatternReference
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.MetamodelReference
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.MetamodelSpecification
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.PartialModelReference
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.PartialModelSpecification
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.PatternSpecification
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.Task
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.FileSpecification
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.FileReference
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ScopeSpecification
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ScopeReference
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ConfigSpecification
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ConfigReference
import java.util.LinkedHashMap

class ScriptExecutor {
	
	def static void main(String[] args) {
		println("generator")
	}
	
	public def executeScript(ConfigurationScript script) {
		val tasks = script.commands.filter(Task)
		for(task : tasks.filterNull) {
			task.execute
		}
	}
	
	def public dispatch execute(GenerationTask task) {

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
			for(entry : config.entries) {
				map.put(entry.key,entry.value)
			}
		}
		
		return map
	}
}