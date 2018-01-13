package hu.bme.mit.inf.dslreasoner.application.execution.util

import com.google.inject.Guice
import com.google.inject.Injector
import com.google.inject.Module
import java.util.LinkedHashMap
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.viatra.query.patternlanguage.PatternLanguageStandaloneSetup
import org.eclipse.viatra.query.patternlanguage.annotations.ExtensionBasedAnnotationValidatorLoader
import org.eclipse.viatra.query.patternlanguage.annotations.IAnnotationValidatorLoader
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageRuntimeModule
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup
import org.eclipse.viatra.query.patternlanguage.emf.GenmodelExtensionLoader
import org.eclipse.viatra.query.patternlanguage.emf.IGenmodelMappingLoader
import org.eclipse.viatra.query.patternlanguage.emf.eMFPatternLanguage.PatternModel
import org.eclipse.viatra.query.patternlanguage.emf.specification.SpecificationBuilder
import org.eclipse.xtext.resource.XtextResourceSet
import hu.bme.mit.inf.dslreasoner.application.execution.Context
import java.util.List
import java.util.HashMap
import org.eclipse.viatra.query.runtime.api.IQuerySpecification

class MyModule extends EMFPatternLanguageRuntimeModule implements Module {
    def public Class<? extends IAnnotationValidatorLoader> bindAnnotationValidatorLoader() {
        return typeof(ExtensionBasedAnnotationValidatorLoader);
    }
    def public Class<? extends IGenmodelMappingLoader> bindGenmodelMappingLoader() {
        return typeof(GenmodelExtensionLoader);
    }
}

class VQLParser {
	val Injector injector;
	val SpecificationBuilder builder = new SpecificationBuilder
	
	new() {
		PatternLanguageStandaloneSetup.doSetup
		EMFPatternLanguageStandaloneSetup.doSetup;
		
		injector = internalCreateInjector
	}
	
	def protected Injector internalCreateInjector() {
       new EMFPatternLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
       val Module module = new MyModule
       val newInjector = Guice.createInjector(module)
       return newInjector;
    }
    
    public def createResourceSet() {
    	injector.getInstance(XtextResourceSet);
    }
	
	/**
	 * Load patterns in two steps: first, the pattern models are are loaded to a resource set, then
	 * the linked patterns are loaded validated and translated to a {@link IQuerySpecification} object.
	 * @returns uri -> (name -> pattern)
	 */
	public def parse(List<String> uris, ResourceSet resourceSet, Context context) {
		val res = new LinkedHashMap
		val uri2resource = new LinkedHashMap
		
		for(uri : uris) {
			var Resource resource
			var PatternModel patternModel
			try {
				resource = resourceSet.getResource(URI.createURI(uri),true);
				patternModel = resource.getContents().get(0) as PatternModel;
				uri2resource.put(uri,patternModel)
			} catch(RuntimeException e) {
				context.writeError('''Unable to load patterns from "«uri»"!''')
			}
		}
		
		for(entry : uri2resource.entrySet) {
			val uri = entry.key
			val model = entry.value
			EcoreUtil.resolveAll(model.eResource)
			model.eResource.validate(uri, context)
			
			val map = new LinkedHashMap
			for(pattern : model.patterns) {
				val IQuerySpecification<?> querySpecification = (this.builder as SpecificationBuilder).getOrCreateSpecification(pattern)
				map.put(querySpecification.fullyQualifiedName.split('.').last,querySpecification)
			}
			res.put(uri,map)
		}
		
		return res
	}
	
	def private validate(Resource resource, String URI, Context context) {
		val errors = resource.errors
		errors.forEach[context.writeError('''Error in loading pattern "«URI»": «it»''')]
	}
}