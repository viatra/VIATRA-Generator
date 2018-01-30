package hu.bme.mit.inf.dslreasoner.application.valueconverter;

import hu.bme.mit.inf.dslreasoner.application.valueconverter.QualifiedNameValueConverter;
import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

@SuppressWarnings("all")
public class ApplicationConfigurationValueConverterService extends DefaultTerminalConverters {
  private final QualifiedNameValueConverter converter2 = new QualifiedNameValueConverter();
  
  @ValueConverter(rule = "QualifiedName")
  public IValueConverter<String> QualifiedName() {
    return this.converter2;
  }
}
