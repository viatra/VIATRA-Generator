package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDefinition;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapperTrace;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_Support;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguageFactory;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class Logic2VampireLanguageMapper_ConstantMapper {
  @Extension
  private final VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE;
  
  private final Logic2VampireLanguageMapper_Support support = new Logic2VampireLanguageMapper_Support();
  
  private final Logic2VampireLanguageMapper base;
  
  public Logic2VampireLanguageMapper_ConstantMapper(final Logic2VampireLanguageMapper base) {
    this.base = base;
  }
  
  protected Object _transformConstant(final ConstantDefinition constant, final Logic2VampireLanguageMapperTrace trace) {
    return null;
  }
  
  protected Object transformConstantDefinitionSpecification(final ConstantDefinition constant, final Logic2VampireLanguageMapperTrace trace) {
    return null;
  }
  
  protected Object transformConstant(final ConstantDefinition constant, final Logic2VampireLanguageMapperTrace trace) {
    return _transformConstant(constant, trace);
  }
}
