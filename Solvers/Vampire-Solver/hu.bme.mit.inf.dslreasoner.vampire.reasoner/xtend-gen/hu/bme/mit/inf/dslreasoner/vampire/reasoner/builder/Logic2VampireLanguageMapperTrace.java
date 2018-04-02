package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDefinition;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_TypeMapperTrace;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSFofFormula;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSFunction;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSTerm;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSVariable;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireModel;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class Logic2VampireLanguageMapperTrace {
  public VampireModel specification;
  
  public VLSFofFormula logicLanguageBody;
  
  public VLSTerm formula;
  
  public Logic2VampireLanguageMapper_TypeMapperTrace typeMapperTrace;
  
  public Map<ConstantDeclaration, ConstantDefinition> constantDefinitions;
  
  public Map<RelationDeclaration, RelationDefinition> relationDefinitions;
  
  public Map<Variable, VLSVariable> relationVar2VLS = new HashMap<Variable, VLSVariable>();
  
  public Map<Variable, VLSFunction> relationVar2TypeDec = new HashMap<Variable, VLSFunction>();
}
