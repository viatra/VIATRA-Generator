package hu.bme.mit.inf.dslreasoner.faulttree.components.conversion

import com.google.inject.Inject
import org.eclipse.xtext.common.services.DefaultTerminalConverters
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverter

class CftLanguageValueConverterService extends DefaultTerminalConverters {
	@Inject OF_INTValueConverter ofIntValueConverter

	@ValueConverter(rule="OF_INT")
	def IValueConverter<Integer> OF_INT() {
		ofIntValueConverter
	}
}
