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
import org.eclipse.viatra.query.patternlanguage.emf.scoping.BaseMetamodelProviderService
import org.eclipse.viatra.query.patternlanguage.emf.scoping.EMFPatternLanguageImportNamespaceProvider
import org.eclipse.viatra.query.patternlanguage.emf.scoping.IMetamodelProvider
import org.eclipse.viatra.query.patternlanguage.emf.scoping.IMetamodelProviderInstance
import org.eclipse.viatra.query.patternlanguage.emf.specification.SpecificationBuilder
import org.eclipse.viatra.query.patternlanguage.emf.vql.PatternModel
import org.eclipse.xtext.resource.IResourceFactory
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

class MyModule extends StandaloneParserWithSeparateModules implements Module{
//    def public Class<? extends IAnnotationValidatorLoader> bindAnnotationValidatorLoader() {
//        return typeof(ExtensionBasedAnnotationValidatorLoader);
//    }
//    def public Class<? extends IGenmodelMappingLoader> bindGenmodelMappingLoader() {
//        return typeof(GenmodelExtensionLoader);
//    }

    override configureIScopeProviderDelegate(Binder binder) {
        binder.bind(IScopeProvider).annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
                .to(EMFPatternLanguageImportNamespaceProvider);
        // .to(XImportSectionNamespaceScopeProvider.class);
        //val Multibinder<IMetamodelProviderInstance> metamodelProviderBinder = 
        Multibinder::newSetBinder(binder, IMetamodelProviderInstance);
//        metamodelProviderBinder.addBinding().to(MetamodelProviderService.class);
//        metamodelProviderBinder.addBinding().to(ResourceSetMetamodelProviderService.class);
    }

	override Class<? extends IMetamodelProvider> bindIMetamodelProvider() {
        MetamodelProviderForModelGeneration
    }
//    def configureFixedMetamodelProviderService(FixedMetamodelProviderService s) {
//    	println('''Configured «s.class.simpleName» with «s.packages.toList»''')
//    	s.packages += PartialinterpretationPackage.eINSTANCE
//    	s.packages += LogicproblemPackage.eINSTANCE
//    	s.packages += LogiclanguagePackage.eINSTANCE
//    	println('''Configured «s.class.simpleName» with «s.packages.toList»''')
//    }
}

class ParseUtil {
	val Injector injector;
	new() {
		//EMFPatternLanguageStandaloneSetup.doSetup;
		PartialinterpretationPackage.eINSTANCE.class;
		LogicproblemPackage.eINSTANCE.class;
		LogiclanguagePackage.eINSTANCE.class;
		
		injector = internalCreateInjector//(new EMFPatternLanguageStandaloneSetup()).createInjectorAndDoEMFRegistration();
		
		val IResourceFactory resourceFactory = injector.getInstance(IResourceFactory);
		val IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("vql_deactivated", resourceFactory);
		IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("vql_deactivated", serviceProvider);
	}
	
	def protected Injector internalCreateInjector() {
        var newInjector = new EMFPatternLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
		val Module module = new MyModule
		newInjector = Guice.createInjector(module)
		return newInjector;
    }
	
//	@Inject
//  var ParseHelper<PatternModel> parseHelper;
    val builder = new SpecificationBuilder
	
	public def parse(CharSequence vqlFileContent) {
		//val patternModel = this.parseHelper.parse(vqlFileContent)
		val XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet);
		val Resource resource = resourceSet.createResource(URI.createURI("dummy:/example.vql_deactivated"));
		val InputStream in = new ByteArrayInputStream(vqlFileContent.toString.getBytes());
		resource.load(in, resourceSet.getLoadOptions());
		val patternModel = resource.getContents().get(0) as PatternModel;
		
		EcoreUtil.resolveAll(resource)
		resource.validate
		val res = new LinkedHashMap
		for(pattern : patternModel.patterns) {
			val querySpecification = builder.getOrCreateSpecification(pattern)
			res.put(querySpecification.fullyQualifiedName,querySpecification)
			//println('''«querySpecification.fullyQualifiedName» -> «querySpecification»''')
		}
		resource.validate
		return res
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

abstract class FixedMetamodelProviderService extends BaseMetamodelProviderService {
	
	protected val List<EPackage> packages = new LinkedList
	
	override protected doGetQualifiedClassName(EClassifier classifier, EObject context) {
		classifier.name
	}
	
	override protected getProvidedMetamodels() {
		return packages.map[it.nsURI]
	}
	
	override loadEPackage(String uri, ResourceSet resourceSet) {
		packages.filter[it.nsURI.equals(uri)].head
	}
}
class MetamodelProviderForModelGeneration extends FixedMetamodelProviderService {
	new() {
		packages += PartialinterpretationPackage.eINSTANCE
    	packages += LogicproblemPackage.eINSTANCE
    	packages += LogiclanguagePackage.eINSTANCE
	}
}