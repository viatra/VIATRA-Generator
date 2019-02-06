package hu.bme.mit.inf.dslreasoner.faulttree.components.conversion;

import com.google.inject.Inject;
import hu.bme.mit.inf.dslreasoner.faulttree.components.conversion.OF_INTValueConverter;
import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

@SuppressWarnings("all")
public class CftLanguageValueConverterService extends DefaultTerminalConverters {
  @Inject
  private OF_INTValueConverter ofIntValueConverter;
  
  @ValueConverter(rule = "OF_INT")
  public IValueConverter<Integer> OF_INT() {
    return this.ofIntValueConverter;
  }
}
