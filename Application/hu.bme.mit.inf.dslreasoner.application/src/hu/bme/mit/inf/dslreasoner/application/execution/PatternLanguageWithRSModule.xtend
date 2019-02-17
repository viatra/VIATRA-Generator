package hu.bme.mit.inf.dslreasoner.application.execution

import com.google.inject.Binder
import com.google.inject.multibindings.Multibinder
import com.google.inject.name.Names
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup.StandaloneParserWithSeparateModules
import org.eclipse.viatra.query.patternlanguage.emf.scoping.EMFPatternLanguageImportNamespaceProvider
import org.eclipse.viatra.query.patternlanguage.emf.scoping.IMetamodelProvider
import org.eclipse.viatra.query.patternlanguage.emf.scoping.IMetamodelProviderInstance
import org.eclipse.xtext.scoping.IScopeProvider
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.viatra.query.patternlanguage.emf.scoping.CompoundMetamodelProviderService
import org.eclipse.viatra.query.patternlanguage.emf.scoping.MetamodelProviderService
import org.eclipse.viatra.query.patternlanguage.emf.scoping.ResourceSetMetamodelProviderService
import org.eclipse.viatra.query.patternlanguage.emf.types.EMFTypeInferrer
import org.eclipse.viatra.query.patternlanguage.emf.types.EMFTypeSystem
import org.eclipse.viatra.query.patternlanguage.emf.types.ITypeInferrer
import org.eclipse.viatra.query.patternlanguage.emf.types.ITypeSystem
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageRuntimeModule

class PatternLanguageWithRSModule extends EMFPatternLanguageRuntimeModule{

    override configureIScopeProviderDelegate(Binder binder) {
        binder.bind(IScopeProvider).annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
                .to(EMFPatternLanguageImportNamespaceProvider);
        Multibinder::newSetBinder(binder, IMetamodelProviderInstance);
    }

	override Class<? extends IMetamodelProvider> bindIMetamodelProvider() {
        CompoundMetamodelProviderService
    }

    def configureMetamodelProviderInstance(Binder binder) {
        val metamodelProviderBinder = Multibinder.newSetBinder(binder, IMetamodelProviderInstance)
        metamodelProviderBinder.addBinding.to(MetamodelProviderService)
        metamodelProviderBinder.addBinding.to(ResourceSetMetamodelProviderService)
    }
    
     override Class<? extends ITypeSystem> bindITypeSystem() {
        return EMFTypeSystem;
    }
    
    override Class<? extends ITypeInferrer> bindITypeInferrer() {
        return EMFTypeInferrer;
    }
}