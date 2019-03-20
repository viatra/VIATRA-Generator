/*
 * generated by Xtext 2.16.0
 */
package hu.bme.mit.inf.dslreasoner.application;

import com.google.inject.Guice;
import com.google.inject.Injector;
import hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.common.TerminalsStandaloneSetup;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;

@SuppressWarnings("all")
public class ApplicationConfigurationStandaloneSetupGenerated implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		TerminalsStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new ApplicationConfigurationRuntimeModule());
	}
	
	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.bme.hu/mit/inf/dslreasoner/application/ApplicationConfiguration")) {
			EPackage.Registry.INSTANCE.put("http://www.bme.hu/mit/inf/dslreasoner/application/ApplicationConfiguration", ApplicationConfigurationPackage.eINSTANCE);
		}
		IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
		IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("vsconfig", resourceFactory);
		IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("vsconfig", serviceProvider);
	}
}
