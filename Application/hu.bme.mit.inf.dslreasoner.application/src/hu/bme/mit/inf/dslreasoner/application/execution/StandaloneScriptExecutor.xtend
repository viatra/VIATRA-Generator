package hu.bme.mit.inf.dslreasoner.application.execution

import com.google.inject.Guice
import com.google.inject.Injector
import hu.bme.mit.inf.dslreasoner.application.ApplicationConfigurationStandaloneSetup
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ConfigurationScript
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup
import org.eclipse.viatra.query.runtime.rete.matcher.ReteEngine
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngineOptions
import org.eclipse.viatra.query.runtime.rete.matcher.ReteBackendFactory

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
	
	static def protected Injector internalCreateInjector() {
        var newInjector = new EMFPatternLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
		val PatternLanguageWithRSModule module = new PatternLanguageWithRSModule
		newInjector = Guice.createInjector(module)
		//val XtextInjectorProvider x = null
		return newInjector;
    }
	
	
	def static loadScript(String path) {
		//Initialise extensions
		val i = (new PatternLanguageWithRSSetup).createInjectorAndDoEMFRegistration
		//PatternLanguageWithRSSetup.createInjectorAndDoEMFRegistration
		ApplicationConfigurationStandaloneSetup.doSetup
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi",new XMIResourceFactoryImpl)
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("logicproblem",new XMIResourceFactoryImpl)
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("partialmodel",new XMIResourceFactoryImpl)
		//ReteEngine.getClass
		
		ViatraQueryEngineOptions.setSystemDefaultBackends(ReteBackendFactory.INSTANCE, ReteBackendFactory.INSTANCE,
			ReteBackendFactory.INSTANCE)
		
		val ext = path.split("\\.").last
		if(ext.equals("vsconfig")) {
			
			val resourceSet = //new ResourceSetImpl
				i.getInstance(XtextResourceSet);
			var Resource resource 
			
			try{
				resource = resourceSet.getResource(URI.createURI(path),true)
			} catch(Exception e) {
				val message = '''Unable to load Configuration Script! «e.message»'''
				throw new IllegalArgumentException(message)
			}
			
			EcoreUtil::resolveAll(resource)
			val errors = resource.errors
			if(errors.empty) {
				val content = resource.contents.head
				if(content instanceof ConfigurationScript) {
					return content
				} else {
					val message = '''Content is not a Configuration Script! (Found : «content.class.simpleName»)'''
					throw new IllegalArgumentException(message)
				}
			} else {
				val message =  '''
					The Configuration Script contains «errors.size» error«IF errors.size>1»s«ENDIF»:
						«FOR error : errors»
							«"\t"»«error.message»
						«ENDFOR»
				'''
				throw new IllegalArgumentException(message)
			}
		} else {
			throw new IllegalArgumentException('''Unsupported file extension: «ext»''')
		}
	}
	
	def static executeScript(String path) {
		executeScript(path, StandardOutputBasedScriptConsole.FACTORY)
	}
	
	def static executeScript(String path, ScriptConsole.Factory scriptConsoleFactory){
		val executor = new ScriptExecutor(scriptConsoleFactory)
		try{
			val content = loadScript(path)
			executor.executeScript(content,new NullProgressMonitor)
			return null
		} catch(Exception e) {
			return e.message
		}
	}
}
