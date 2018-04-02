package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapperTrace;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_Support;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguageFactory;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class Logic2VampireLanguageMapper_RelationMapper {
  @Extension
  private final VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE;
  
  private final Logic2VampireLanguageMapper_Support support = new Logic2VampireLanguageMapper_Support();
  
  private final Logic2VampireLanguageMapper base;
  
  public Logic2VampireLanguageMapper_RelationMapper(final Logic2VampireLanguageMapper base) {
    this.base = base;
  }
  
  public void _transformRelation(final RelationDeclaration r, final Logic2VampireLanguageMapperTrace trace) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method transformToHostedField(Logic2VampireLanguageMapperTrace) is undefined for the type RelationDeclaration"
      + "\nThe method transformRelationDeclarationToHostedField(RelationDeclaration, Logic2VampireLanguageMapperTrace) is undefined"
      + "\nThe method transformRelationDeclarationToGlobalField(RelationDeclaration, Logic2VampireLanguageMapperTrace) is undefined");
  }
  
  public void transformRelation(final RelationDeclaration r, final Logic2VampireLanguageMapperTrace trace) {
    _transformRelation(r, trace);
    return;
  }
}
