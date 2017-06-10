package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.util

import com.google.inject.Guice
import com.google.inject.Injector
import com.google.inject.Module
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage
import java.io.ByteArrayInputStream
import java.io.InputStream
import java.util.LinkedHashMap
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
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

class MyModule extends EMFPatternLanguageRuntimeModule implements Module{
    def public Class<? extends IAnnotationValidatorLoader> bindAnnotationValidatorLoader() {
        return typeof(ExtensionBasedAnnotationValidatorLoader);
    }
    def public Class<? extends IGenmodelMappingLoader> bindGenmodelMappingLoader() {
        return typeof(GenmodelExtensionLoader);
    }
}

class ParseUtil {
	val Injector injector;
	new() {
		PatternLanguageStandaloneSetup.doSetup
		EMFPatternLanguageStandaloneSetup.doSetup;
		PartialinterpretationPackage.eINSTANCE.class;
		LogicproblemPackage.eINSTANCE.class;
		LogiclanguagePackage.eINSTANCE.class;
		
		injector = internalCreateInjector//(new EMFPatternLanguageStandaloneSetup()).createInjectorAndDoEMFRegistration();
	}
	
	def protected Injector internalCreateInjector() {
        var newInjector = new EMFPatternLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
        //XXX the following line enforce the tests to be run in an Eclipse environment
       val Module module = new MyModule
       newInjector = Guice.createInjector(module)
       //ViatraQueryLoggingUtil.setExternalLogger(newInjector.getInstance(Logger.class));
       //EMFPatternLanguagePlugin.getInstance().addCompoundInjector(newInjector,EMFPatternLanguagePlugin.TEST_INJECTOR_PRIORITY);
        return newInjector;
    }
	
//	@Inject
//   	var ParseHelper<PatternModel> parseHelper;
    val builder = new SpecificationBuilder
	
	public def parse(CharSequence vqlFileContent) {
		//val patternModel = this.parseHelper.parse(vqlFileContent)
		val XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet);
		val Resource resource = resourceSet.createResource(URI.createURI("dummy:/example.vql"));
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