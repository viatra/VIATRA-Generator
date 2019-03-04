package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder;

import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapperTrace;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSAnd;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSExistentialQuantifier;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFunction;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSImplies;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSInequality;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSOr;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTerm;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSUniversalQuantifier;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSVariable;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguageFactory;
import com.google.common.collect.Iterables;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.QuantifiedExpression;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Term;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeReference;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Logic2VampireLanguageMapper_Support {
  @Extension
  private final VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE;
  
  protected String toIDMultiple(final String... ids) {
    final Function1<String, String> _function = (String it) -> {
      return IterableExtensions.join(((Iterable<?>)Conversions.doWrapArray(it.split("\\s+"))), "_");
    };
    return IterableExtensions.join(ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(ids)), _function), "_");
  }
  
  protected String toID(final String ids) {
    return IterableExtensions.join(((Iterable<?>)Conversions.doWrapArray(ids.split("\\s+"))), "_");
  }
  
  protected VLSVariable duplicate(final VLSVariable vrbl) {
    VLSVariable _createVLSVariable = this.factory.createVLSVariable();
    final Procedure1<VLSVariable> _function = (VLSVariable it) -> {
      it.setName(vrbl.getName());
    };
    return ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function);
  }
  
  protected VLSFunction topLevelTypeFunc() {
    VLSFunction _createVLSFunction = this.factory.createVLSFunction();
    final Procedure1<VLSFunction> _function = (VLSFunction it) -> {
      it.setConstant("object");
      EList<VLSTerm> _terms = it.getTerms();
      VLSVariable _createVLSVariable = this.factory.createVLSVariable();
      final Procedure1<VLSVariable> _function_1 = (VLSVariable it_1) -> {
        it_1.setName("A");
      };
      VLSVariable _doubleArrow = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function_1);
      _terms.add(_doubleArrow);
    };
    return ObjectExtensions.<VLSFunction>operator_doubleArrow(_createVLSFunction, _function);
  }
  
  protected VLSTerm unfoldAnd(final List<? extends VLSTerm> operands) {
    int _size = operands.size();
    boolean _equals = (_size == 1);
    if (_equals) {
      return IterableExtensions.head(operands);
    } else {
      int _size_1 = operands.size();
      boolean _greaterThan = (_size_1 > 1);
      if (_greaterThan) {
        VLSAnd _createVLSAnd = this.factory.createVLSAnd();
        final Procedure1<VLSAnd> _function = (VLSAnd it) -> {
          it.setLeft(IterableExtensions.head(operands));
          it.setRight(this.unfoldAnd(operands.subList(1, operands.size())));
        };
        return ObjectExtensions.<VLSAnd>operator_doubleArrow(_createVLSAnd, _function);
      } else {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Logic operator with 0 operands!");
        throw new UnsupportedOperationException(_builder.toString());
      }
    }
  }
  
  protected VLSTerm unfoldOr(final List<? extends VLSTerm> operands) {
    int _size = operands.size();
    boolean _equals = (_size == 1);
    if (_equals) {
      return IterableExtensions.head(operands);
    } else {
      int _size_1 = operands.size();
      boolean _greaterThan = (_size_1 > 1);
      if (_greaterThan) {
        VLSOr _createVLSOr = this.factory.createVLSOr();
        final Procedure1<VLSOr> _function = (VLSOr it) -> {
          it.setLeft(IterableExtensions.head(operands));
          it.setRight(this.unfoldOr(operands.subList(1, operands.size())));
        };
        return ObjectExtensions.<VLSOr>operator_doubleArrow(_createVLSOr, _function);
      } else {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Logic operator with 0 operands!");
        throw new UnsupportedOperationException(_builder.toString());
      }
    }
  }
  
  protected VLSTerm unfoldDistinctTerms(final Logic2VampireLanguageMapper m, final EList<Term> operands, final Logic2VampireLanguageMapperTrace trace, final Map<Variable, VLSVariable> variables) {
    int _size = operands.size();
    boolean _equals = (_size == 1);
    if (_equals) {
      return m.transformTerm(IterableExtensions.<Term>head(operands), trace, variables);
    } else {
      int _size_1 = operands.size();
      boolean _greaterThan = (_size_1 > 1);
      if (_greaterThan) {
        int _size_2 = operands.size();
        int _size_3 = operands.size();
        int _multiply = (_size_2 * _size_3);
        int _divide = (_multiply / 2);
        final ArrayList<VLSTerm> notEquals = new ArrayList<VLSTerm>(_divide);
        int _size_4 = operands.size();
        ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size_4, true);
        for (final Integer i : _doubleDotLessThan) {
          int _size_5 = operands.size();
          ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(((i).intValue() + 1), _size_5, true);
          for (final Integer j : _doubleDotLessThan_1) {
            VLSInequality _createVLSInequality = this.factory.createVLSInequality();
            final Procedure1<VLSInequality> _function = (VLSInequality it) -> {
              it.setLeft(m.transformTerm(operands.get((i).intValue()), trace, variables));
              it.setRight(m.transformTerm(operands.get((j).intValue()), trace, variables));
            };
            VLSInequality _doubleArrow = ObjectExtensions.<VLSInequality>operator_doubleArrow(_createVLSInequality, _function);
            notEquals.add(_doubleArrow);
          }
        }
        return this.unfoldAnd(notEquals);
      } else {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Logic operator with 0 operands!");
        throw new UnsupportedOperationException(_builder.toString());
      }
    }
  }
  
  /**
   * def protected  String toID(List<String> ids) {
   * 	ids.map[it.split("\\s+").join("'")].join("'")
   * }
   */
  protected VLSTerm createUniversallyQuantifiedExpression(final Logic2VampireLanguageMapper mapper, final QuantifiedExpression expression, final Logic2VampireLanguageMapperTrace trace, final Map<Variable, VLSVariable> variables) {
    VLSUniversalQuantifier _xblockexpression = null;
    {
      final Function1<Variable, VLSVariable> _function = (Variable v) -> {
        VLSVariable _createVLSVariable = this.factory.createVLSVariable();
        final Procedure1<VLSVariable> _function_1 = (VLSVariable it) -> {
          it.setName(this.toIDMultiple("Var", v.getName()));
        };
        return ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function_1);
      };
      final Map<Variable, VLSVariable> variableMap = IterableExtensions.<Variable, VLSVariable>toInvertedMap(expression.getQuantifiedVariables(), _function);
      final ArrayList<VLSTerm> typedefs = new ArrayList<VLSTerm>();
      EList<Variable> _quantifiedVariables = expression.getQuantifiedVariables();
      for (final Variable variable : _quantifiedVariables) {
        {
          VLSFunction _createVLSFunction = this.factory.createVLSFunction();
          final Procedure1<VLSFunction> _function_1 = (VLSFunction it) -> {
            TypeReference _range = variable.getRange();
            it.setConstant(this.toIDMultiple("type", ((ComplexTypeReference) _range).getReferred().getName()));
            EList<VLSTerm> _terms = it.getTerms();
            VLSVariable _createVLSVariable = this.factory.createVLSVariable();
            final Procedure1<VLSVariable> _function_2 = (VLSVariable it_1) -> {
              it_1.setName(this.toIDMultiple("Var", variable.getName()));
            };
            VLSVariable _doubleArrow = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function_2);
            _terms.add(_doubleArrow);
          };
          final VLSFunction eq = ObjectExtensions.<VLSFunction>operator_doubleArrow(_createVLSFunction, _function_1);
          typedefs.add(eq);
        }
      }
      VLSUniversalQuantifier _createVLSUniversalQuantifier = this.factory.createVLSUniversalQuantifier();
      final Procedure1<VLSUniversalQuantifier> _function_1 = (VLSUniversalQuantifier it) -> {
        EList<VLSVariable> _variables = it.getVariables();
        Collection<VLSVariable> _values = variableMap.values();
        Iterables.<VLSVariable>addAll(_variables, _values);
        VLSImplies _createVLSImplies = this.factory.createVLSImplies();
        final Procedure1<VLSImplies> _function_2 = (VLSImplies it_1) -> {
          it_1.setLeft(this.unfoldAnd(typedefs));
          it_1.setRight(mapper.transformTerm(expression.getExpression(), trace, this.withAddition(variables, variableMap)));
        };
        VLSImplies _doubleArrow = ObjectExtensions.<VLSImplies>operator_doubleArrow(_createVLSImplies, _function_2);
        it.setOperand(_doubleArrow);
      };
      _xblockexpression = ObjectExtensions.<VLSUniversalQuantifier>operator_doubleArrow(_createVLSUniversalQuantifier, _function_1);
    }
    return _xblockexpression;
  }
  
  protected VLSTerm createExistentiallyQuantifiedExpression(final Logic2VampireLanguageMapper mapper, final QuantifiedExpression expression, final Logic2VampireLanguageMapperTrace trace, final Map<Variable, VLSVariable> variables) {
    VLSExistentialQuantifier _xblockexpression = null;
    {
      final Function1<Variable, VLSVariable> _function = (Variable v) -> {
        VLSVariable _createVLSVariable = this.factory.createVLSVariable();
        final Procedure1<VLSVariable> _function_1 = (VLSVariable it) -> {
          it.setName(this.toIDMultiple("Var", v.getName()));
        };
        return ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function_1);
      };
      final Map<Variable, VLSVariable> variableMap = IterableExtensions.<Variable, VLSVariable>toInvertedMap(expression.getQuantifiedVariables(), _function);
      final ArrayList<VLSTerm> typedefs = new ArrayList<VLSTerm>();
      EList<Variable> _quantifiedVariables = expression.getQuantifiedVariables();
      for (final Variable variable : _quantifiedVariables) {
        {
          VLSFunction _createVLSFunction = this.factory.createVLSFunction();
          final Procedure1<VLSFunction> _function_1 = (VLSFunction it) -> {
            TypeReference _range = variable.getRange();
            it.setConstant(this.toIDMultiple("type", ((ComplexTypeReference) _range).getReferred().getName()));
            EList<VLSTerm> _terms = it.getTerms();
            VLSVariable _createVLSVariable = this.factory.createVLSVariable();
            final Procedure1<VLSVariable> _function_2 = (VLSVariable it_1) -> {
              it_1.setName(this.toIDMultiple("Var", variable.getName()));
            };
            VLSVariable _doubleArrow = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function_2);
            _terms.add(_doubleArrow);
          };
          final VLSFunction eq = ObjectExtensions.<VLSFunction>operator_doubleArrow(_createVLSFunction, _function_1);
          typedefs.add(eq);
        }
      }
      typedefs.add(mapper.transformTerm(expression.getExpression(), trace, this.withAddition(variables, variableMap)));
      VLSExistentialQuantifier _createVLSExistentialQuantifier = this.factory.createVLSExistentialQuantifier();
      final Procedure1<VLSExistentialQuantifier> _function_1 = (VLSExistentialQuantifier it) -> {
        EList<VLSVariable> _variables = it.getVariables();
        Collection<VLSVariable> _values = variableMap.values();
        Iterables.<VLSVariable>addAll(_variables, _values);
        it.setOperand(this.unfoldAnd(typedefs));
      };
      _xblockexpression = ObjectExtensions.<VLSExistentialQuantifier>operator_doubleArrow(_createVLSExistentialQuantifier, _function_1);
    }
    return _xblockexpression;
  }
  
  protected HashMap<Variable, VLSVariable> withAddition(final Map<Variable, VLSVariable> map1, final Map<Variable, VLSVariable> map2) {
    HashMap<Variable, VLSVariable> _hashMap = new HashMap<Variable, VLSVariable>(map1);
    final Procedure1<HashMap<Variable, VLSVariable>> _function = (HashMap<Variable, VLSVariable> it) -> {
      it.putAll(map2);
    };
    return ObjectExtensions.<HashMap<Variable, VLSVariable>>operator_doubleArrow(_hashMap, _function);
  }
}
