package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder;

import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapperTrace;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.VampireModelInterpretation_TypeInterpretation;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTerm;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;
import java.util.Collection;
import java.util.List;

@SuppressWarnings("all")
public interface Logic2VampireLanguageMapper_TypeMapper {
  public abstract void transformTypes(final Collection<Type> types, final Collection<DefinedElement> elements, final Logic2VampireLanguageMapper mapper, final Logic2VampireLanguageMapperTrace trace);
  
  public abstract List<VLSTerm> transformTypeReference(final Type referred, final Logic2VampireLanguageMapper mapper, final Logic2VampireLanguageMapperTrace trace);
  
  public abstract VLSTerm getUndefinedSupertype(final Logic2VampireLanguageMapperTrace trace);
  
  public abstract int getUndefinedSupertypeScope(final int undefinedScope, final Logic2VampireLanguageMapperTrace trace);
  
  public abstract VLSTerm transformReference(final DefinedElement referred, final Logic2VampireLanguageMapperTrace trace);
  
  public abstract VampireModelInterpretation_TypeInterpretation getTypeInterpreter();
}
