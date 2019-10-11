package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder;

import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolverConfiguration;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapperTrace;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_Support;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSAnd;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSConstant;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSEquality;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFofFormula;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFunction;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSImplies;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTerm;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTffTerm;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSUniversalQuantifier;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSVariable;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguageFactory;
import com.google.common.base.Objects;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition;
import hu.bme.mit.inf.dslreasoner.util.CollectionsUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Logic2VampireLanguageMapper_ScopeMapper {
  @Extension
  private final VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE;
  
  private final Logic2VampireLanguageMapper_Support support = new Logic2VampireLanguageMapper_Support();
  
  private final Logic2VampireLanguageMapper base;
  
  private final VLSVariable variable = ObjectExtensions.<VLSVariable>operator_doubleArrow(this.factory.createVLSVariable(), ((Procedure1<VLSVariable>) (VLSVariable it) -> {
    it.setName("A");
  }));
  
  public Logic2VampireLanguageMapper_ScopeMapper(final Logic2VampireLanguageMapper base) {
    this.base = base;
  }
  
  public void _transformScope(final List<Type> types, final VampireSolverConfiguration config, final Logic2VampireLanguageMapperTrace trace) {
    int elemsInIM = trace.definedElement2String.size();
    final int ABSOLUTE_MIN = 0;
    final int ABSOLUTE_MAX = (Integer.MAX_VALUE - elemsInIM);
    final int GLOBAL_MIN = (config.typeScopes.minNewElements - elemsInIM);
    final int GLOBAL_MAX = (config.typeScopes.maxNewElements - elemsInIM);
    final ArrayList<VLSConstant> localInstances = CollectionLiterals.<VLSConstant>newArrayList();
    final boolean consistant = (GLOBAL_MAX > GLOBAL_MIN);
    if ((GLOBAL_MIN != ABSOLUTE_MIN)) {
      this.getInstanceConstants(GLOBAL_MIN, 0, localInstances, trace, true, consistant);
      if (consistant) {
        for (final VLSConstant i : trace.uniqueInstances) {
          localInstances.add(this.support.duplicate(i));
        }
        this.makeFofFormula(localInstances, trace, true, null);
      } else {
        this.makeFofFormula(((ArrayList) trace.uniqueInstances), trace, true, null);
      }
    }
    if ((GLOBAL_MAX != ABSOLUTE_MAX)) {
      this.getInstanceConstants(GLOBAL_MAX, 0, localInstances, trace, true, (!consistant));
      if (consistant) {
        this.makeFofFormula(((ArrayList) trace.uniqueInstances), trace, false, null);
      } else {
        this.makeFofFormula(localInstances, trace, false, null);
      }
    }
    int i_1 = 1;
    if ((((Boolean) trace.topLvlElementIsInInitialModel)).booleanValue()) {
      i_1 = 0;
    }
    int minNum = (-1);
    Map<Type, Integer> startPoints = new HashMap<Type, Integer>();
    final Function1<Type, Boolean> _function = (Type it) -> {
      boolean _equals = it.equals(trace.topLevelType);
      return Boolean.valueOf((!_equals));
    };
    Iterable<Type> _filter = IterableExtensions.<Type>filter(config.typeScopes.minNewElementsByType.keySet(), _function);
    for (final Type t : _filter) {
      {
        int numIniIntModel = 0;
        Set<DefinedElement> _keySet = trace.definedElement2String.keySet();
        for (final DefinedElement elem : _keySet) {
          EList<TypeDefinition> _definedInType = elem.getDefinedInType();
          for (final TypeDefinition tDefined : _definedInType) {
            boolean _dfsSubtypeCheck = this.support.dfsSubtypeCheck(t, tDefined);
            if (_dfsSubtypeCheck) {
              int _numIniIntModel = numIniIntModel;
              numIniIntModel = (_numIniIntModel + 1);
            }
          }
        }
        Integer _lookup = CollectionsUtil.<Type, Integer>lookup(t, config.typeScopes.minNewElementsByType);
        int _minus = ((_lookup).intValue() - numIniIntModel);
        minNum = _minus;
        if ((minNum != 0)) {
          this.getInstanceConstants((i_1 + minNum), i_1, localInstances, trace, true, false);
          startPoints.put(t, Integer.valueOf(i_1));
          int _i = i_1;
          i_1 = (_i + minNum);
          this.makeFofFormula(localInstances, trace, true, t);
        }
      }
    }
    final Function1<Type, Boolean> _function_1 = (Type it) -> {
      boolean _equals = it.equals(trace.topLevelType);
      return Boolean.valueOf((!_equals));
    };
    Iterable<Type> _filter_1 = IterableExtensions.<Type>filter(config.typeScopes.maxNewElementsByType.keySet(), _function_1);
    for (final Type t_1 : _filter_1) {
      {
        int numIniIntModel = 0;
        Set<DefinedElement> _keySet = trace.definedElement2String.keySet();
        for (final DefinedElement elem : _keySet) {
          EList<TypeDefinition> _definedInType = elem.getDefinedInType();
          boolean _equals = Objects.equal(_definedInType, t_1);
          if (_equals) {
            int _numIniIntModel = numIniIntModel;
            numIniIntModel = (_numIniIntModel + 1);
          }
        }
        Integer _lookup = CollectionsUtil.<Type, Integer>lookup(t_1, config.typeScopes.maxNewElementsByType);
        int maxNum = ((_lookup).intValue() - numIniIntModel);
        boolean _contains = config.typeScopes.minNewElementsByType.keySet().contains(t_1);
        if (_contains) {
          Integer _lookup_1 = CollectionsUtil.<Type, Integer>lookup(t_1, config.typeScopes.minNewElementsByType);
          int _minus = ((_lookup_1).intValue() - numIniIntModel);
          minNum = _minus;
        } else {
          minNum = 0;
        }
        if ((minNum != 0)) {
          Integer startpoint = CollectionsUtil.<Type, Integer>lookup(t_1, startPoints);
          this.getInstanceConstants(((startpoint).intValue() + minNum), (startpoint).intValue(), localInstances, trace, true, false);
        } else {
          localInstances.clear();
        }
        int instEndInd = Math.min(GLOBAL_MAX, ((i_1 + maxNum) - minNum));
        this.getInstanceConstants(instEndInd, i_1, localInstances, trace, false, false);
        this.makeFofFormula(localInstances, trace, false, t_1);
      }
    }
    final boolean DUPLICATES = config.uniquenessDuplicates;
    final int numInst = ((Object[])Conversions.unwrapArray(trace.uniqueInstances, Object.class)).length;
    int ind = 1;
    if ((numInst != 0)) {
      if (DUPLICATES) {
        for (final VLSConstant e : trace.uniqueInstances) {
          {
            final int x = ind;
            VLSFofFormula _createVLSFofFormula = this.factory.createVLSFofFormula();
            final Procedure1<VLSFofFormula> _function_2 = (VLSFofFormula it) -> {
              it.setName(this.support.toIDMultiple("t_uniqueness", e.getName()));
              it.setFofRole("axiom");
              it.setFofFormula(this.support.establishUniqueness(trace.uniqueInstances, e));
            };
            final VLSFofFormula uniqueness = ObjectExtensions.<VLSFofFormula>operator_doubleArrow(_createVLSFofFormula, _function_2);
            EList<VLSFofFormula> _formulas = trace.specification.getFormulas();
            _formulas.add(uniqueness);
            ind++;
          }
        }
      } else {
        List<VLSConstant> _subList = trace.uniqueInstances.subList(0, (numInst - 1));
        for (final VLSConstant e_1 : _subList) {
          {
            final int x = ind;
            VLSFofFormula _createVLSFofFormula = this.factory.createVLSFofFormula();
            final Procedure1<VLSFofFormula> _function_2 = (VLSFofFormula it) -> {
              it.setName(this.support.toIDMultiple("t_uniqueness", e_1.getName()));
              it.setFofRole("axiom");
              it.setFofFormula(this.support.establishUniqueness(trace.uniqueInstances.subList(x, numInst), e_1));
            };
            final VLSFofFormula uniqueness = ObjectExtensions.<VLSFofFormula>operator_doubleArrow(_createVLSFofFormula, _function_2);
            EList<VLSFofFormula> _formulas = trace.specification.getFormulas();
            _formulas.add(uniqueness);
            ind++;
          }
        }
      }
    }
  }
  
  protected void getInstanceConstants(final int endInd, final int startInd, final ArrayList list, final Logic2VampireLanguageMapperTrace trace, final boolean clear, final boolean addToTrace) {
    if (clear) {
      list.clear();
    }
    for (int i = startInd; (i < endInd); i++) {
      {
        final int num = (i + 1);
        VLSConstant _createVLSConstant = this.factory.createVLSConstant();
        final Procedure1<VLSConstant> _function = (VLSConstant it) -> {
          it.setName(("o" + Integer.valueOf(num)));
        };
        final VLSConstant cst = ObjectExtensions.<VLSConstant>operator_doubleArrow(_createVLSConstant, _function);
        if (addToTrace) {
          trace.uniqueInstances.add(cst);
        }
        list.add(cst);
      }
    }
  }
  
  protected void makeFofFormula(final ArrayList list, final Logic2VampireLanguageMapperTrace trace, final boolean minimum, final Type type) {
    String nm = "";
    VLSTerm tm = null;
    if ((type == null)) {
      nm = "object";
      tm = this.support.topLevelTypeFunc();
    } else {
      nm = CollectionsUtil.<Type, VLSFunction>lookup(type, trace.type2Predicate).getConstant().toString();
      VLSAnd _createVLSAnd = this.factory.createVLSAnd();
      final Procedure1<VLSAnd> _function = (VLSAnd it) -> {
        it.setLeft(this.support.duplicate(CollectionsUtil.<Type, VLSFunction>lookup(type, trace.type2Predicate)));
        it.setRight(this.support.topLevelTypeFunc());
      };
      VLSAnd _doubleArrow = ObjectExtensions.<VLSAnd>operator_doubleArrow(_createVLSAnd, _function);
      tm = _doubleArrow;
    }
    final String name = nm;
    final VLSTerm term = tm;
    VLSFofFormula _createVLSFofFormula = this.factory.createVLSFofFormula();
    final Procedure1<VLSFofFormula> _function_1 = (VLSFofFormula it) -> {
      String _xifexpression = null;
      if (minimum) {
        _xifexpression = "min";
      } else {
        _xifexpression = "max";
      }
      it.setName(this.support.toIDMultiple("typeScope", _xifexpression, name));
      it.setFofRole("axiom");
      VLSUniversalQuantifier _createVLSUniversalQuantifier = this.factory.createVLSUniversalQuantifier();
      final Procedure1<VLSUniversalQuantifier> _function_2 = (VLSUniversalQuantifier it_1) -> {
        EList<VLSTffTerm> _variables = it_1.getVariables();
        VLSVariable _duplicate = this.support.duplicate(this.variable);
        _variables.add(_duplicate);
        VLSImplies _createVLSImplies = this.factory.createVLSImplies();
        final Procedure1<VLSImplies> _function_3 = (VLSImplies it_2) -> {
          if (minimum) {
            final Function1<VLSTerm, VLSEquality> _function_4 = (VLSTerm i) -> {
              VLSEquality _createVLSEquality = this.factory.createVLSEquality();
              final Procedure1<VLSEquality> _function_5 = (VLSEquality it_3) -> {
                VLSVariable _createVLSVariable = this.factory.createVLSVariable();
                final Procedure1<VLSVariable> _function_6 = (VLSVariable it_4) -> {
                  it_4.setName(this.variable.getName());
                };
                VLSVariable _doubleArrow_1 = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function_6);
                it_3.setLeft(_doubleArrow_1);
                it_3.setRight(i);
              };
              return ObjectExtensions.<VLSEquality>operator_doubleArrow(_createVLSEquality, _function_5);
            };
            it_2.setLeft(this.support.unfoldOr(ListExtensions.<VLSTerm, VLSEquality>map(list, _function_4)));
            it_2.setRight(term);
          } else {
            it_2.setLeft(term);
            final Function1<VLSTerm, VLSEquality> _function_5 = (VLSTerm i) -> {
              VLSEquality _createVLSEquality = this.factory.createVLSEquality();
              final Procedure1<VLSEquality> _function_6 = (VLSEquality it_3) -> {
                VLSVariable _createVLSVariable = this.factory.createVLSVariable();
                final Procedure1<VLSVariable> _function_7 = (VLSVariable it_4) -> {
                  it_4.setName(this.variable.getName());
                };
                VLSVariable _doubleArrow_1 = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function_7);
                it_3.setLeft(_doubleArrow_1);
                it_3.setRight(i);
              };
              return ObjectExtensions.<VLSEquality>operator_doubleArrow(_createVLSEquality, _function_6);
            };
            it_2.setRight(this.support.unfoldOr(ListExtensions.<VLSTerm, VLSEquality>map(list, _function_5)));
          }
        };
        VLSImplies _doubleArrow_1 = ObjectExtensions.<VLSImplies>operator_doubleArrow(_createVLSImplies, _function_3);
        it_1.setOperand(_doubleArrow_1);
      };
      VLSUniversalQuantifier _doubleArrow_1 = ObjectExtensions.<VLSUniversalQuantifier>operator_doubleArrow(_createVLSUniversalQuantifier, _function_2);
      it.setFofFormula(_doubleArrow_1);
    };
    final VLSFofFormula cstDec = ObjectExtensions.<VLSFofFormula>operator_doubleArrow(_createVLSFofFormula, _function_1);
    EList<VLSFofFormula> _formulas = trace.specification.getFormulas();
    _formulas.add(cstDec);
  }
  
  public void transformScope(final List<Type> types, final VampireSolverConfiguration config, final Logic2VampireLanguageMapperTrace trace) {
    _transformScope(types, config, trace);
    return;
  }
}
