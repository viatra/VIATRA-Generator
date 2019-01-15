package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder;

import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_TypeMapperTrace;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFofFormula;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFunction;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTerm;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSVariable;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireModel;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDefinition;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable;
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
  
  public final Map<Variable, VLSVariable> relationVar2VLS = new HashMap<Variable, VLSVariable>();
  
  public final Map<Variable, VLSFunction> relationVar2TypeDec = new HashMap<Variable, VLSFunction>();
}
