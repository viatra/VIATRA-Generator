package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolTypeReference;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapperTrace;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_Support;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSTerm;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguageFactory;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class Logic2VampireLanguageMapper {
  @Extension
  private final VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE;
  
  private final Logic2VampireLanguageMapper_Support support = new Logic2VampireLanguageMapper_Support();
  
  protected VLSTerm _transformTypeReference(final BoolTypeReference boolTypeReference, final Logic2VampireLanguageMapperTrace trace) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe function must return a result of type VLSTerm.");
  }
  
  protected VLSTerm transformTypeReference(final BoolTypeReference boolTypeReference, final Logic2VampireLanguageMapperTrace trace) {
    return _transformTypeReference(boolTypeReference, trace);
  }
}
