package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDefinition;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_TypeMapperTrace;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSFofFormula;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSTerm;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireModel;
import java.util.Map;

@SuppressWarnings("all")
public class Logic2VampireLanguageMapperTrace {
  public VampireModel specification;
  
  public VLSFofFormula logicLanguageBody;
  
  public VLSTerm formula;
  
  public Logic2VampireLanguageMapper_TypeMapperTrace typeMapperTrace;
  
  public Map<ConstantDeclaration, ConstantDefinition> constantDefinitions;
  
  public Map<RelationDeclaration, RelationDefinition> relationDefinitions;
}
