package hu.bme.mit.inf.dslreasoner.application.execution

import hu.bme.mit.inf.dslreasoner.application.ApplicationConfigurationStandaloneSetup
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ConfigurationScript
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup
import org.eclipse.emf.ecore.util.EcoreUtil
import java.io.FileNotFoundException
import org.eclipse.emf.ecore.resource.Resource
import java.io.IOException
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.viatra.query.runtime.matchers.backend.IQueryBackendFactoryProvider
import org.eclipse.viatra.query.runtime.rete.matcher.ReteBackendFactoryProvider
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngineOptions
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint
import org.eclipse.viatra.query.runtime.rete.util.ReteHintOptions
import org.eclipse.viatra.query.runtime.rete.matcher.ReteEngine

class StandaloneScriptExecutor {
	def static void main(String[] args) {
		if(args.size == 1) {
			val message = executeScript(args.head)
			if(message !== null) {
				println(message)
			}	
		} else if(args.size == 0){
			println('''Run generator with script file path as parameter!''')
		} else { // args.size > 1
			println('''Multiple arguments are not supported! Run generator with script file path as parameter!''')
		}
	}
	
	def static executeScript(String path){
		//Initialise extensions
		EMFPatternLanguageStandaloneSetup.doSetup
		ApplicationConfigurationStandaloneSetup.doSetup
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi",new XMIResourceFactoryImpl)
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("logicproblem",new XMIResourceFactoryImpl)
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("partialmodel",new XMIResourceFactoryImpl)
		ReteEngine.getClass
		
		val ext = path.split("\\.").last
		if(ext.equals("vsconfig")) {
			val resourceSet = new ResourceSetImpl
			var Resource resource 
			
			try{
				resource = resourceSet.getResource(URI.createURI(path),true)
			} catch(Exception e) {
				val message = '''Unable to load Configuration Script!'''
				return message
			}
			
			EcoreUtil::resolveAll(resource)
			val errors = resource.errors
			if(errors.empty) {
				val content = resource.contents.head
				if(content instanceof ConfigurationScript) {
					val executor = new ScriptExecutor
					executor.executeScript(content,new NullProgressMonitor)
				} else {
					val message = '''Content is not a Configuration Script! (Found : «content.class.simpleName»)'''
					return message
				}
			} else {
				val message =  '''
				The Configuration Script contains «errors.size» error«IF errors.size>1»s«ENDIF»:
					«FOR error : errors»
					«"\t"»«error.message»
					«ENDFOR»
				'''
				return message
			}
		} else {
			val message =  '''Unsupported file extension: «ext»'''
			return message
		}
	}
}