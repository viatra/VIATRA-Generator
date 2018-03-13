package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapperTrace;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_Support;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_TypeMapper;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.VampireModelInterpretation_TypeInterpretation;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSTerm;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguageFactory;
import java.util.Collection;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class Logic2VampireLanguageMapper_TypeMapper_FilteredTypes implements Logic2VampireLanguageMapper_TypeMapper {
  private final Logic2VampireLanguageMapper_Support support = new Logic2VampireLanguageMapper_Support();
  
  @Extension
  private final VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE;
  
  public Logic2VampireLanguageMapper_TypeMapper_FilteredTypes() {
    LogicproblemPackage.eINSTANCE.getClass();
  }
  
  @Override
  public void transformTypes(final Collection<Type> types, final Collection<DefinedElement> elements, final Logic2VampireLanguageMapper mapper, final Logic2VampireLanguageMapperTrace trace) {
    throw new Error("Unresolved compilation problems:"
      + "\nno viable alternative at input \']\'"
      + "\nextraneous input \'}\' expecting \']\'"
      + "\nThe method or field res is undefined");
  }
  
  @Override
  public /* List<VLSSignatureDeclaration> */Object transformTypeReference(final Type referred, final Logic2VampireLanguageMapper mapper, final Logic2VampireLanguageMapperTrace trace) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public VLSSignatureDeclaration getUndefinedSupertype(final Logic2VampireLanguageMapperTrace trace) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public int getUndefinedSupertypeScope(final int undefinedScope, final Logic2VampireLanguageMapperTrace trace) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public VLSTerm transformReference(final DefinedElement referred, final Logic2VampireLanguageMapperTrace trace) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public VampireModelInterpretation_TypeInterpretation getTypeInterpreter() {
    throw new Error("Unresolved compilation problems:"
      + "\nVampireModel cannot be resolved.");
  }
}
