package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.util

import com.google.inject.Binder
import com.google.inject.Guice
import com.google.inject.Inject
import com.google.inject.Injector
import com.google.inject.multibindings.Multibinder
import com.google.inject.name.Names
import com.google.inject.util.Modules
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
import org.eclipse.emf.ecore.EValidator
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl
import org.eclipse.emf.ecore.impl.EValidatorRegistryImpl
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
import org.eclipse.xtext.resource.impl.ResourceServiceProviderRegistryImpl
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.impl.SimpleScope
import org.eclipse.xtext.service.AbstractGenericModule
import org.eclipse.xtext.service.SingletonBinding
import org.eclipse.xtext.workspace.IProjectConfigProvider

package class StandaloneParserWithFixedMetamodelProviderModule extends StandaloneParserWithSeparateModules {

	/**
	 * Overrided binder
	 * <code>Multibinder</code>IMetamodelProviderInstance.class);
	 *         metamodelProviderBinder.addBinding().to(MetamodelProviderService.class);
	 *         metamodelProviderBinder.addBinding().to(ResourceSetMetamodelProviderService.class);
	 * </code>
	 */
	override configureIScopeProviderDelegate(Binder binder) {
		binder.bind(IScopeProvider).annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)).to(
			EMFPatternLanguageImportNamespaceProvider);
		Multibinder::newSetBinder(binder, IMetamodelProviderInstance);
	}

}

package class StandaloneParserOverridesModule extends AbstractGenericModule {

	def Class<? extends IMetamodelProvider> bindIMetamodelProvider() {
		FixedMetamodelProvider
	}

	def Class<? extends IProjectConfigProvider> bindProjectConfigProvider() {
		NullProjectConfigProvider
	}

	@SingletonBinding
	def Class<? extends IResourceServiceProvider.Registry> bindIResourceServiceProvider$Registry() {
		VqlDeactivatedServiceProviderRegistry
	}

	def EValidator.Registry bindEValidator$Registry() {
		// org.eclipse.xtext.validation.EValidatorRegistrar modifies EValidators already in the registry,
		// so it is not safe to populate the registry from the EValidator.Registry.INSTANCE singleton.
		// There is no need to execute any EValiator other than EMFPatternLanguageValidator,
		// so we can start with a blank registry instead.
		new EValidatorRegistryImpl()
	}

	def EPackage.Registry bindEPackage$Registry() {
		new EPackageRegistryImpl(EPackage.Registry.INSTANCE)
	}

}

package class NullProjectConfigProvider implements IProjectConfigProvider {

	override getProjectConfig(ResourceSet context) {
		null
	}

}

package class VqlDeactivatedServiceProviderRegistry extends ResourceServiceProviderRegistryImpl {

	new() {
		val delegateRegistry = IResourceServiceProvider.Registry.INSTANCE
		contentTypeToFactoryMap.putAll(delegateRegistry.contentTypeToFactoryMap)
		extensionToFactoryMap.putAll(delegateRegistry.extensionToFactoryMap)
		protocolToFactoryMap.putAll(delegateRegistry.protocolToFactoryMap)
	}

	@Inject
	def void setResourceServiceProvider(IResourceServiceProvider vqlDeactivatedResourceServiceProvider) {
		extensionToFactoryMap.put(ParseUtil.SIMPLIFIED_PARSER_EXTENSION, vqlDeactivatedResourceServiceProvider)
	}
}

class ParseUtil {
	public static val PARSER_EXTENSION = "vql"
	public static val SIMPLIFIED_PARSER_EXTENSION = "vql_deactivated"

	val Injector injector
	val IResourceFactory resourceFactory

	new() {
		PartialinterpretationPackage.eINSTANCE.class;
		LogicproblemPackage.eINSTANCE.class;
		LogiclanguagePackage.eINSTANCE.class;
		injector = internalCreateInjector
		resourceFactory = injector.getInstance(IResourceFactory)
	}

	def protected Injector internalCreateInjector() {
		ensureViatraInitialized();
		val runtimeModulemodule = new StandaloneParserWithFixedMetamodelProviderModule
		val overridesModule = new StandaloneParserOverridesModule
		val module = Modules.override(runtimeModulemodule).with(overridesModule)
		val newInjector = Guice.createInjector(module)
		return newInjector
	}

	protected def ensureViatraInitialized() {
		val extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.extensionToFactoryMap
		if (!extensionToFactoryMap.containsKey(PARSER_EXTENSION)) {
			EMFPatternLanguageStandaloneSetup.doSetup
		}
	}

	protected def createResourceSet() {
		val XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet)
		resourceSet.resourceFactoryRegistry.extensionToFactoryMap.put(SIMPLIFIED_PARSER_EXTENSION, resourceFactory)
		resourceSet
	}

	val builder = new SpecificationBuilder

	def parse(CharSequence vqlFileContent) {
		val resourceSet = createResourceSet();
		val Resource resource = resourceSet.createResource(
			URI.createURI("dummy:/example." + SIMPLIFIED_PARSER_EXTENSION));
		val InputStream in = new ByteArrayInputStream(vqlFileContent.toString.getBytes());
		resource.load(in, resourceSet.getLoadOptions());
		val patternModel = resource.getContents().get(0) as PatternModel;

		EcoreUtil.resolveAll(resource)
		resource.validate
		val res = new LinkedHashMap<String, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>>
		val patterns = new LinkedList<IQuerySpecification<?>>
		for (pattern : patternModel.patterns) {
			val querySpecification = createSpecification(pattern, patterns)
			res.put(querySpecification.fullyQualifiedName, querySpecification)
			patterns += querySpecification
		}
		resource.validate

		return res
	}

	def IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> createSpecification(Pattern pattern,
		List<IQuerySpecification<?>> createdPatternList) {
		builder.getOrCreateSpecification(pattern, createdPatternList, true)
	}

	def private validate(Resource resource) {
		val errors = resource.errors
		if (!errors.isEmpty) {
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
		val metamodels = packages.map [
			EObjectDescription.create(it.nsURI, it, Collections.singletonMap("nsURI", "true"))
		]
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
