package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder;

import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_TypeMapperTrace;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSEquality;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFunction;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTerm;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class Logic2VampireLanguageMapper_TypeMapperTrace_FilteredTypes implements Logic2VampireLanguageMapper_TypeMapperTrace {
  public final Map<Type, VLSFunction> type2Predicate = new HashMap<Type, VLSFunction>();
  
  public final Map<DefinedElement, VLSEquality> definedElement2Declaration = new HashMap<DefinedElement, VLSEquality>();
  
  public final Map<Type, VLSTerm> type2PossibleNot = new HashMap<Type, VLSTerm>();
  
  public final Map<Type, VLSTerm> type2And = new HashMap<Type, VLSTerm>();
}
