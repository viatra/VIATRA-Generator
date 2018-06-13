package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.util

import com.google.inject.Binder
import com.google.inject.Guice
import com.google.inject.Injector
import com.google.inject.Module
import com.google.inject.multibindings.Multibinder
import com.google.inject.name.Names
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage
import java.io.ByteArrayInputStream
import java.io.InputStream
import java.util.Collections
import java.util.LinkedHashMap
import java.util.LinkedList
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup.StandaloneParserWithSeparateModules
import org.eclipse.viatra.query.patternlanguage.emf.scoping.EMFPatternLanguageImportNamespaceProvider
import org.eclipse.viatra.query.patternlanguage.emf.scoping.IMetamodelProvider
import org.eclipse.viatra.query.patternlanguage.emf.scoping.IMetamodelProviderInstance
import org.eclipse.viatra.query.patternlanguage.emf.specification.SpecificationBuilder
import org.eclipse.viatra.query.patternlanguage.emf.vql.Pattern
import org.eclipse.viatra.query.patternlanguage.emf.vql.PatternModel
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IResourceFactory
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.impl.SimpleScope
import org.eclipse.viatra.query.patternlanguage.emf.scoping.MetamodelProviderService
import org.eclipse.viatra.query.patternlanguage.emf.scoping.ResourceSetMetamodelProviderService

class MyModule extends StandaloneParserWithSeparateModules implements Module{

	/**
	 * Overrided binder
	 * <code>Multibinder</code>IMetamodelProviderInstance.class);
        metamodelProviderBinder.addBinding().to(MetamodelProviderService.class);
        metamodelProviderBinder.addBinding().to(ResourceSetMetamodelProviderService.class);
	 * </code>
	 */
    override configureIScopeProviderDelegate(Binder binder) {
        binder.bind(IScopeProvider).annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
                .to(EMFPatternLanguageImportNamespaceProvider);
        Multibinder::newSetBinder(binder, IMetamodelProviderInstance);
    }

	override Class<? extends IMetamodelProvider> bindIMetamodelProvider() {
        FixedMetamodelProvider
    }
}

class ParseUtil {
	public static val SIMPLIFIED_PARSER_EXTENSION = "vql_deactivated"
	
	val Injector injector;
	new() {
		PartialinterpretationPackage.eINSTANCE.class;
		LogicproblemPackage.eINSTANCE.class;
		LogiclanguagePackage.eINSTANCE.class;
		
		injector = internalCreateInjector
		
		val IResourceFactory resourceFactory = injector.getInstance(IResourceFactory);
		val IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(SIMPLIFIED_PARSER_EXTENSION, resourceFactory);
		IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put(SIMPLIFIED_PARSER_EXTENSION, serviceProvider);
	}
	
	def protected Injector internalCreateInjector() {
        var newInjector = new EMFPatternLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
		val Module module = new MyModule
		newInjector = Guice.createInjector(module)
		return newInjector;
    }
	
	val builder = new SpecificationBuilder
	
	public def parse(CharSequence vqlFileContent) {
		val XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet);
		val Resource resource = resourceSet.createResource(URI.createURI("dummy:/example."+SIMPLIFIED_PARSER_EXTENSION));
		val InputStream in = new ByteArrayInputStream(vqlFileContent.toString.getBytes());
		resource.load(in, resourceSet.getLoadOptions());
		val patternModel = resource.getContents().get(0) as PatternModel;
		
		EcoreUtil.resolveAll(resource)
		resource.validate
		val res = new LinkedHashMap<String,IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>>
		val patterns = new LinkedList<IQuerySpecification<?>>
		for(pattern : patternModel.patterns) {
			val querySpecification = createSpecification(pattern,patterns)
			res.put(querySpecification.fullyQualifiedName,querySpecification)
			patterns += querySpecification
		}
		resource.validate
		
		return res
	}
	
	def IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> createSpecification(
		Pattern pattern,List<IQuerySpecification<?>> createdPatternList)
	{
		builder.getOrCreateSpecification(pattern,createdPatternList,true)
	}
	
	def private validate(Resource resource) {
		val errors = resource.errors
		if(!errors.isEmpty) {
			println('''-- Errors --''')
			errors.forEach[println('''> «it»''')]
			println('''------------''')	
		}
	}
}

class FixedMetamodelProvider implements IMetamodelProvider {
	
	protected val List<EPackage> packages = new LinkedList
	new() {
		packages += PartialinterpretationPackage.eINSTANCE
    	packages += LogicproblemPackage.eINSTANCE
    	packages += LogiclanguagePackage.eINSTANCE
	}
	
	override getAllMetamodelObjects(IScope delegateScope, EObject context) {
        val  metamodels = packages.map[EObjectDescription.create(it.nsURI, it, Collections.singletonMap("nsURI", "true"))]
        return new SimpleScope(delegateScope, metamodels);
    }
  
    override boolean isGeneratedCodeAvailable(EPackage ePackage, ResourceSet set) {
    	true
    }
    
    override String getModelPluginId(EPackage ePackage, ResourceSet set) {
        return "hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage"
    }
    
    override String getQualifiedClassName(EClassifier classifier, EObject context) {
        classifier.name
    }
				
	override loadEPackage(String uri, ResourceSet resourceSet) {
		return packages.filter[it.nsURI.equals(uri)].head
	}
}