package hu.bme.mit.inf.dslreasoner.application.valueconverter

import org.eclipse.xtext.common.services.DefaultTerminalConverters
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverter

class ApplicationConfigurationValueConverterService extends DefaultTerminalConverters {
	//val org.eclipse.xtext.conversion.impl.QualifiedNameValueConverter converter = new org.eclipse.xtext.conversion.impl.QualifiedNameValueConverter
	val QualifiedNameValueConverter converter2 = new QualifiedNameValueConverter
	@ValueConverter(rule="QualifiedName")
	def IValueConverter<String> QualifiedName() {
		converter2
	}
}