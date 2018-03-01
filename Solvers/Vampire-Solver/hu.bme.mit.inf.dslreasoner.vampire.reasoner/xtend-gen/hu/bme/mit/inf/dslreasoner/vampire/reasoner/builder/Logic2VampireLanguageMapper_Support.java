package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder;

import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguageFactory;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class Logic2VampireLanguageMapper_Support {
  @Extension
  private final VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE;
  
  protected String toIDMultiple(final String... ids) {
    final Function1<String, String> _function = (String it) -> {
      return IterableExtensions.join(((Iterable<?>)Conversions.doWrapArray(it.split("\\s+"))), "\'");
    };
    return IterableExtensions.join(ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(ids)), _function), "\'");
  }
  
  protected String toID(final String ids) {
    return IterableExtensions.join(((Iterable<?>)Conversions.doWrapArray(ids.split("\\s+"))), "\'");
  }
}
