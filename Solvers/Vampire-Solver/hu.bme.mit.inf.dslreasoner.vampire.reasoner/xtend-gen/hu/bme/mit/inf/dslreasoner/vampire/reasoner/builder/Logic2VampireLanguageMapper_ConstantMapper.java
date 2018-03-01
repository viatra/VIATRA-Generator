package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDefinition;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapperTrace;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_Support;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSTerm;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguageFactory;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Logic2VampireLanguageMapper_ConstantMapper {
  @Extension
  private final VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE;
  
  private final Logic2VampireLanguageMapper_Support support = new Logic2VampireLanguageMapper_Support();
  
  private final Logic2VampireLanguageMapper base;
  
  public Logic2VampireLanguageMapper_ConstantMapper(final Logic2VampireLanguageMapper base) {
    this.base = base;
  }
  
  protected void _transformConstant(final ConstantDefinition constant, final Logic2VampireLanguageMapperTrace trace) {
    VLSTerm _createVLSTerm = this.factory.createVLSTerm();
    final Procedure1<VLSTerm> _function = (VLSTerm it) -> {
    };
    final VLSTerm c = ObjectExtensions.<VLSTerm>operator_doubleArrow(_createVLSTerm, _function);
  }
  
  protected Object transformConstantDefinitionSpecification(final ConstantDefinition constant, final Logic2VampireLanguageMapperTrace trace) {
    return null;
  }
  
  protected void transformConstant(final ConstantDefinition constant, final Logic2VampireLanguageMapperTrace trace) {
    _transformConstant(constant, trace);
    return;
  }
}
