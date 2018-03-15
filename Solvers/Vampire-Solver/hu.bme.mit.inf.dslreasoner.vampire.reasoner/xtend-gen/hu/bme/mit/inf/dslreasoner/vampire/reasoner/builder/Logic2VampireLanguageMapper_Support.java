package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder;

import com.google.common.collect.Iterables;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.QuantifiedExpression;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapperTrace;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSAnd;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSExistentialQuantifier;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSOr;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSTerm;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSUniversalQuantifier;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSVariable;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguageFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
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
      return IterableExtensions.join(((Iterable<?>)Conversions.doWrapArray(it.split("\\s+"))), "\'");
    };
    return IterableExtensions.join(ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(ids)), _function), "_");
  }
  
  protected String toID(final String ids) {
    return IterableExtensions.join(((Iterable<?>)Conversions.doWrapArray(ids.split("\\s+"))), "\'");
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
  
  /**
   * def protected  String toID(List<String> ids) {
   * ids.map[it.split("\\s+").join("'")].join("'")
   * }
   */
  protected VLSTerm createUniversallQuantifiedExpression(final Logic2VampireLanguageMapper mapper, final QuantifiedExpression expression, final Logic2VampireLanguageMapperTrace trace, final Map<Variable, VLSVariable> variables) {
    VLSUniversalQuantifier _xblockexpression = null;
    {
      final Function1<Variable, VLSVariable> _function = (Variable v) -> {
        VLSVariable _createVLSVariable = this.factory.createVLSVariable();
        final Procedure1<VLSVariable> _function_1 = (VLSVariable it) -> {
          it.setName(this.toID(v.getName()));
        };
        return ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function_1);
      };
      final Map<Variable, VLSVariable> variableMap = IterableExtensions.<Variable, VLSVariable>toInvertedMap(expression.getQuantifiedVariables(), _function);
      VLSUniversalQuantifier _createVLSUniversalQuantifier = this.factory.createVLSUniversalQuantifier();
      final Procedure1<VLSUniversalQuantifier> _function_1 = (VLSUniversalQuantifier it) -> {
        EList<VLSVariable> _variables = it.getVariables();
        Collection<VLSVariable> _values = variableMap.values();
        Iterables.<VLSVariable>addAll(_variables, _values);
        it.setOperand(mapper.transformTerm(expression.getExpression(), trace, this.withAddition(variables, variableMap)));
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
          it.setName(this.toID(v.getName()));
        };
        return ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function_1);
      };
      final Map<Variable, VLSVariable> variableMap = IterableExtensions.<Variable, VLSVariable>toInvertedMap(expression.getQuantifiedVariables(), _function);
      VLSExistentialQuantifier _createVLSExistentialQuantifier = this.factory.createVLSExistentialQuantifier();
      final Procedure1<VLSExistentialQuantifier> _function_1 = (VLSExistentialQuantifier it) -> {
        EList<VLSVariable> _variables = it.getVariables();
        Collection<VLSVariable> _values = variableMap.values();
        Iterables.<VLSVariable>addAll(_variables, _values);
        it.setOperand(mapper.transformTerm(expression.getExpression(), trace, this.withAddition(variables, variableMap)));
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
