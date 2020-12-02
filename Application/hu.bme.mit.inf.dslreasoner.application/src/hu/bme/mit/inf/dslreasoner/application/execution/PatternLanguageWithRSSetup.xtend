package hu.bme.mit.inf.dslreasoner.application.execution

import com.google.inject.Guice
import com.google.inject.Injector
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup

class PatternLanguageWithRSSetup extends EMFPatternLanguageStandaloneSetup{
	override Injector createInjector() {
		return Guice::createInjector(new PatternLanguageWithRSModule());
	}
}
