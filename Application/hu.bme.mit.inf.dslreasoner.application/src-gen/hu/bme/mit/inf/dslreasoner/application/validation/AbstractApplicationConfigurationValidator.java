/*
 * generated by Xtext 2.16.0
 */
package hu.bme.mit.inf.dslreasoner.application.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractApplicationConfigurationValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(hu.bme.mit.inf.dslreasoner.application.applicationConfiguration.ApplicationConfigurationPackage.eINSTANCE);
		return result;
	}
}
