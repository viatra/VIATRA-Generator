package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder;

import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguageFactory;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class Logic2VampireLanguageMapper_Support {
  @Extension
  private final VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE;
}
