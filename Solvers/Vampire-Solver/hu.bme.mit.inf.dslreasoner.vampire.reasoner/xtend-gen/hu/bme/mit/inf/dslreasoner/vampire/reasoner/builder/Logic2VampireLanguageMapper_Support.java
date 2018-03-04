package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.QuantifiedExpression;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapperTrace;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSAnd;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSOr;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSTerm;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguageFactory;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    return IterableExtensions.join(ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(ids)), _function), "\'");
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
  
  protected VLSTerm unfoldOr(final List<? extends VLSTerm> operands, final Logic2VampireLanguageMapperTrace trace) {
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
          it.setRight(this.unfoldOr(operands.subList(1, operands.size()), trace));
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
  protected VLSTerm createUniversallQuantifiedExpression(final Logic2VampireLanguageMapper mapper, final QuantifiedExpression expression, final Logic2VampireLanguageMapperTrace trace, final /* Map<Variable, VLSVariable> */Object variables) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field createVLSVariable is undefined"
      + "\nThe method name(String) is undefined for the type Object"
      + "\nThe method transformTerm(Term, Logic2VampireLanguageMapperTrace, Map<Variable, VLSVariable>) from the type Logic2VampireLanguageMapper refers to the missing type VLSVariable"
      + "\nThe method withAddition(Map<Variable, VLSVariable>, Map<Variable, VLSVariable>) from the type Logic2VampireLanguageMapper_Support refers to the missing type VLSVariable"
      + "\n=> cannot be resolved");
  }
  
  protected VLSTerm createExistentiallyQuantifiedExpression(final Logic2VampireLanguageMapper mapper, final QuantifiedExpression expression, final Logic2VampireLanguageMapperTrace trace, final /* Map<Variable, VLSVariable> */Object variables) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field createVLSVariable is undefined"
      + "\nThe method name(String) is undefined for the type Object"
      + "\nThe method transformTerm(Term, Logic2VampireLanguageMapperTrace, Map<Variable, VLSVariable>) from the type Logic2VampireLanguageMapper refers to the missing type VLSVariable"
      + "\nThe method withAddition(Map<Variable, VLSVariable>, Map<Variable, VLSVariable>) from the type Logic2VampireLanguageMapper_Support refers to the missing type VLSVariable"
      + "\n=> cannot be resolved");
  }
  
  protected /* HashMap<Variable, VLSVariable> */Object withAddition(final /* Map<Variable, VLSVariable> */Object map1, final /* Map<Variable, VLSVariable> */Object map2) {
    HashMap<Variable, VLSVariable> _hashMap = new HashMap<Variable, VLSVariable>(map1);
    final Procedure1<HashMap<Variable, VLSVariable>> _function = (HashMap<Variable, VLSVariable> it) -> {
      it.putAll(map2);
    };
    return ObjectExtensions.<HashMap<Variable, VLSVariable>>operator_doubleArrow(_hashMap, _function);
  }
}
