/*
 * generated by Xtext 2.12.0
 */
package ca.mcgill.ecse.dslreasoner.tests

import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireModel
import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(VampireLanguageInjectorProvider)
class VampireLanguageParsingTest {
	@Inject
	ParseHelper<VampireModel> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
}