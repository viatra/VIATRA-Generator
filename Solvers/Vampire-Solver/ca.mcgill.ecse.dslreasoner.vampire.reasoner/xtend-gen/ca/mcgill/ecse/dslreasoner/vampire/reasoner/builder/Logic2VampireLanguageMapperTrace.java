package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder;

import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_TypeMapperTrace;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSConstant;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFofFormula;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFunction;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTerm;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSVariable;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireModel;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDefinition;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class Logic2VampireLanguageMapperTrace {
  public VampireModel specification;
  
  public VLSFofFormula logicLanguageBody;
  
  public VLSTerm formula;
  
  public Logic2VampireLanguageMapper_TypeMapperTrace typeMapperTrace;
  
  public Map<DefinedElement, String> definedElement2String = new HashMap<DefinedElement, String>();
  
  public Object topLvlElementIsInInitialModel = null;
  
  public Object topLevelType = null;
  
  public final Map<Type, VLSFunction> type2Predicate = new HashMap<Type, VLSFunction>();
  
  public final Map<VLSFunction, Type> predicate2Type = new HashMap<VLSFunction, Type>();
  
  public final Map<DefinedElement, VLSFunction> element2Predicate = new HashMap<DefinedElement, VLSFunction>();
  
  public final Map<Type, VLSTerm> type2PossibleNot = new HashMap<Type, VLSTerm>();
  
  public final Map<Type, VLSTerm> type2And = new HashMap<Type, VLSTerm>();
  
  public final List<VLSConstant> uniqueInstances = CollectionLiterals.<VLSConstant>newArrayList();
  
  public Map<ConstantDeclaration, ConstantDefinition> constantDefinitions;
  
  public Map<RelationDeclaration, RelationDefinition> relationDefinitions;
  
  public Map<RelationDeclaration, VLSFunction> rel2Predicate = new HashMap<RelationDeclaration, VLSFunction>();
  
  public final Map<Variable, VLSVariable> relationVar2VLS = new HashMap<Variable, VLSVariable>();
  
  public final Map<Variable, VLSFunction> relationVar2TypeDec = new HashMap<Variable, VLSFunction>();
}
