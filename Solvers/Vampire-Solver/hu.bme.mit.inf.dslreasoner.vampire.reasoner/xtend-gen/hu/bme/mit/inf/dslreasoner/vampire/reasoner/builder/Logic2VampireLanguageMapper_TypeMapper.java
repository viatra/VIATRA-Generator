package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapperTrace;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSTerm;
import java.util.Collection;
import java.util.List;

@SuppressWarnings("all")
public interface Logic2VampireLanguageMapper_TypeMapper {
  public abstract void transformTypes(final Collection<Type> types, final Collection<DefinedElement> elements, final Logic2VampireLanguageMapper mapper, final Logic2VampireLanguageMapperTrace trace);
  
  public abstract /* List<VLSSignatureDeclaration> */Object transformTypeReference(final Type referred, final Logic2VampireLanguageMapper mapper, final Logic2VampireLanguageMapperTrace trace);
  
  public abstract /* VLSSignatureDeclaration */Object getUndefinedSupertype(final Logic2VampireLanguageMapperTrace trace);
  
  public abstract int getUndefinedSupertypeScope(final int undefinedScope, final Logic2VampireLanguageMapperTrace trace);
  
  public abstract VLSTerm transformReference(final DefinedElement referred, final Logic2VampireLanguageMapperTrace trace);
  
  public abstract /* VampireModelInterpretation_TypeInterpretation */Object getTypeInterpreter();
}
