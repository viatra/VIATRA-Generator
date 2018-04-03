package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage;
import hu.bme.mit.inf.dslreasoner.util.CollectionsUtil;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapperTrace;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_Support;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_TypeMapper;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_TypeMapperTrace_FilteredTypes;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.VampireModelInterpretation_TypeInterpretation;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSDoubleQuote;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSEquality;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSEquivalent;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSFofFormula;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSFunction;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSTerm;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSUnaryNegation;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSUniversalQuantifier;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSVariable;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguageFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Logic2VampireLanguageMapper_TypeMapper_FilteredTypes implements Logic2VampireLanguageMapper_TypeMapper {
  private final Logic2VampireLanguageMapper_Support support = new Logic2VampireLanguageMapper_Support();
  
  @Extension
  private final VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE;
  
  public Logic2VampireLanguageMapper_TypeMapper_FilteredTypes() {
    LogicproblemPackage.eINSTANCE.getClass();
  }
  
  @Override
  public void transformTypes(final Collection<Type> types, final Collection<DefinedElement> elements, final Logic2VampireLanguageMapper mapper, final Logic2VampireLanguageMapperTrace trace) {
    final Logic2VampireLanguageMapper_TypeMapperTrace_FilteredTypes typeTrace = new Logic2VampireLanguageMapper_TypeMapperTrace_FilteredTypes();
    trace.typeMapperTrace = typeTrace;
    VLSVariable _createVLSVariable = this.factory.createVLSVariable();
    final Procedure1<VLSVariable> _function = (VLSVariable it) -> {
      it.setName("A");
    };
    final VLSVariable variable = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function);
    for (final Type type : types) {
      {
        VLSFunction _createVLSFunction = this.factory.createVLSFunction();
        final Procedure1<VLSFunction> _function_1 = (VLSFunction it) -> {
          it.setConstant(this.support.toIDMultiple("type", type.getName()));
          EList<VLSTerm> _terms = it.getTerms();
          VLSVariable _createVLSVariable_1 = this.factory.createVLSVariable();
          final Procedure1<VLSVariable> _function_2 = (VLSVariable it_1) -> {
            it_1.setName(variable.getName());
          };
          VLSVariable _doubleArrow = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable_1, _function_2);
          _terms.add(_doubleArrow);
        };
        final VLSFunction typePred = ObjectExtensions.<VLSFunction>operator_doubleArrow(_createVLSFunction, _function_1);
        typeTrace.type2Predicate.put(type, typePred);
      }
    }
    Iterable<TypeDefinition> _filter = Iterables.<TypeDefinition>filter(types, TypeDefinition.class);
    for (final TypeDefinition type_1 : _filter) {
      {
        VLSFofFormula _createVLSFofFormula = this.factory.createVLSFofFormula();
        final Procedure1<VLSFofFormula> _function_1 = (VLSFofFormula it) -> {
          it.setName(this.support.toIDMultiple("typeDef", type_1.getName()));
          it.setFofRole("axiom");
          VLSUniversalQuantifier _createVLSUniversalQuantifier = this.factory.createVLSUniversalQuantifier();
          final Procedure1<VLSUniversalQuantifier> _function_2 = (VLSUniversalQuantifier it_1) -> {
            EList<VLSVariable> _variables = it_1.getVariables();
            VLSVariable _createVLSVariable_1 = this.factory.createVLSVariable();
            final Procedure1<VLSVariable> _function_3 = (VLSVariable it_2) -> {
              it_2.setName(variable.getName());
            };
            VLSVariable _doubleArrow = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable_1, _function_3);
            _variables.add(_doubleArrow);
            VLSEquivalent _createVLSEquivalent = this.factory.createVLSEquivalent();
            final Procedure1<VLSEquivalent> _function_4 = (VLSEquivalent it_2) -> {
              VLSFunction _createVLSFunction = this.factory.createVLSFunction();
              final Procedure1<VLSFunction> _function_5 = (VLSFunction it_3) -> {
                it_3.setConstant(CollectionsUtil.<TypeDefinition, VLSFunction>lookup(type_1, typeTrace.type2Predicate).getConstant());
                EList<VLSTerm> _terms = it_3.getTerms();
                VLSVariable _createVLSVariable_2 = this.factory.createVLSVariable();
                final Procedure1<VLSVariable> _function_6 = (VLSVariable it_4) -> {
                  it_4.setName("A");
                };
                VLSVariable _doubleArrow_1 = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable_2, _function_6);
                _terms.add(_doubleArrow_1);
              };
              VLSFunction _doubleArrow_1 = ObjectExtensions.<VLSFunction>operator_doubleArrow(_createVLSFunction, _function_5);
              it_2.setLeft(_doubleArrow_1);
              CollectionsUtil.<TypeDefinition, VLSFunction>lookup(type_1, typeTrace.type2Predicate);
              final Function1<DefinedElement, VLSEquality> _function_6 = (DefinedElement e) -> {
                VLSEquality _createVLSEquality = this.factory.createVLSEquality();
                final Procedure1<VLSEquality> _function_7 = (VLSEquality it_3) -> {
                  VLSVariable _createVLSVariable_2 = this.factory.createVLSVariable();
                  final Procedure1<VLSVariable> _function_8 = (VLSVariable it_4) -> {
                    it_4.setName(variable.getName());
                  };
                  VLSVariable _doubleArrow_2 = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable_2, _function_8);
                  it_3.setLeft(_doubleArrow_2);
                  VLSDoubleQuote _createVLSDoubleQuote = this.factory.createVLSDoubleQuote();
                  final Procedure1<VLSDoubleQuote> _function_9 = (VLSDoubleQuote it_4) -> {
                    String _name = e.getName();
                    String _plus = ("\"a" + _name);
                    String _plus_1 = (_plus + "\"");
                    it_4.setValue(_plus_1);
                  };
                  VLSDoubleQuote _doubleArrow_3 = ObjectExtensions.<VLSDoubleQuote>operator_doubleArrow(_createVLSDoubleQuote, _function_9);
                  it_3.setRight(_doubleArrow_3);
                };
                return ObjectExtensions.<VLSEquality>operator_doubleArrow(_createVLSEquality, _function_7);
              };
              it_2.setRight(this.support.unfoldOr(ListExtensions.<DefinedElement, VLSEquality>map(type_1.getElements(), _function_6)));
            };
            VLSEquivalent _doubleArrow_1 = ObjectExtensions.<VLSEquivalent>operator_doubleArrow(_createVLSEquivalent, _function_4);
            it_1.setOperand(_doubleArrow_1);
          };
          VLSUniversalQuantifier _doubleArrow = ObjectExtensions.<VLSUniversalQuantifier>operator_doubleArrow(_createVLSUniversalQuantifier, _function_2);
          it.setFofFormula(_doubleArrow);
        };
        final VLSFofFormula res = ObjectExtensions.<VLSFofFormula>operator_doubleArrow(_createVLSFofFormula, _function_1);
        EList<VLSFofFormula> _formulas = trace.specification.getFormulas();
        _formulas.add(res);
      }
    }
    final Function1<Type, Boolean> _function_1 = (Type it) -> {
      boolean _isIsAbstract = it.isIsAbstract();
      return Boolean.valueOf((!_isIsAbstract));
    };
    Iterable<Type> _filter_1 = IterableExtensions.<Type>filter(types, _function_1);
    for (final Type type_2 : _filter_1) {
      {
        for (final Type type2 : types) {
          if ((Objects.equal(type_2, type2) || this.dfsSupertypeCheck(type_2, type2))) {
            VLSFunction _createVLSFunction = this.factory.createVLSFunction();
            final Procedure1<VLSFunction> _function_2 = (VLSFunction it) -> {
              it.setConstant(CollectionsUtil.<Type, VLSFunction>lookup(type2, typeTrace.type2Predicate).getConstant());
              EList<VLSTerm> _terms = it.getTerms();
              VLSVariable _createVLSVariable_1 = this.factory.createVLSVariable();
              final Procedure1<VLSVariable> _function_3 = (VLSVariable it_1) -> {
                it_1.setName("A");
              };
              VLSVariable _doubleArrow = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable_1, _function_3);
              _terms.add(_doubleArrow);
            };
            VLSFunction _doubleArrow = ObjectExtensions.<VLSFunction>operator_doubleArrow(_createVLSFunction, _function_2);
            typeTrace.type2PossibleNot.put(type2, _doubleArrow);
          } else {
            VLSUnaryNegation _createVLSUnaryNegation = this.factory.createVLSUnaryNegation();
            final Procedure1<VLSUnaryNegation> _function_3 = (VLSUnaryNegation it) -> {
              VLSFunction _createVLSFunction_1 = this.factory.createVLSFunction();
              final Procedure1<VLSFunction> _function_4 = (VLSFunction it_1) -> {
                it_1.setConstant(CollectionsUtil.<Type, VLSFunction>lookup(type2, typeTrace.type2Predicate).getConstant());
                EList<VLSTerm> _terms = it_1.getTerms();
                VLSVariable _createVLSVariable_1 = this.factory.createVLSVariable();
                final Procedure1<VLSVariable> _function_5 = (VLSVariable it_2) -> {
                  it_2.setName("A");
                };
                VLSVariable _doubleArrow_1 = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable_1, _function_5);
                _terms.add(_doubleArrow_1);
              };
              VLSFunction _doubleArrow_1 = ObjectExtensions.<VLSFunction>operator_doubleArrow(_createVLSFunction_1, _function_4);
              it.setOperand(_doubleArrow_1);
            };
            VLSUnaryNegation _doubleArrow_1 = ObjectExtensions.<VLSUnaryNegation>operator_doubleArrow(_createVLSUnaryNegation, _function_3);
            typeTrace.type2PossibleNot.put(type2, _doubleArrow_1);
          }
        }
        Collection<VLSTerm> _values = typeTrace.type2PossibleNot.values();
        ArrayList<VLSTerm> _arrayList = new ArrayList<VLSTerm>(_values);
        typeTrace.type2And.put(type_2, this.support.unfoldAnd(_arrayList));
        typeTrace.type2PossibleNot.clear();
      }
    }
    VLSFofFormula _createVLSFofFormula = this.factory.createVLSFofFormula();
    final Procedure1<VLSFofFormula> _function_2 = (VLSFofFormula it) -> {
      it.setName("hierarchyHandler");
      it.setFofRole("axiom");
      VLSUniversalQuantifier _createVLSUniversalQuantifier = this.factory.createVLSUniversalQuantifier();
      final Procedure1<VLSUniversalQuantifier> _function_3 = (VLSUniversalQuantifier it_1) -> {
        EList<VLSVariable> _variables = it_1.getVariables();
        VLSVariable _createVLSVariable_1 = this.factory.createVLSVariable();
        final Procedure1<VLSVariable> _function_4 = (VLSVariable it_2) -> {
          it_2.setName("A");
        };
        VLSVariable _doubleArrow = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable_1, _function_4);
        _variables.add(_doubleArrow);
        VLSEquivalent _createVLSEquivalent = this.factory.createVLSEquivalent();
        final Procedure1<VLSEquivalent> _function_5 = (VLSEquivalent it_2) -> {
          VLSFunction _createVLSFunction = this.factory.createVLSFunction();
          final Procedure1<VLSFunction> _function_6 = (VLSFunction it_3) -> {
            it_3.setConstant("Object");
            EList<VLSTerm> _terms = it_3.getTerms();
            VLSVariable _createVLSVariable_2 = this.factory.createVLSVariable();
            final Procedure1<VLSVariable> _function_7 = (VLSVariable it_4) -> {
              it_4.setName("A");
            };
            VLSVariable _doubleArrow_1 = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable_2, _function_7);
            _terms.add(_doubleArrow_1);
          };
          VLSFunction _doubleArrow_1 = ObjectExtensions.<VLSFunction>operator_doubleArrow(_createVLSFunction, _function_6);
          it_2.setLeft(_doubleArrow_1);
          Collection<VLSTerm> _values = typeTrace.type2And.values();
          ArrayList<VLSTerm> _arrayList = new ArrayList<VLSTerm>(_values);
          it_2.setRight(this.support.unfoldOr(_arrayList));
        };
        VLSEquivalent _doubleArrow_1 = ObjectExtensions.<VLSEquivalent>operator_doubleArrow(_createVLSEquivalent, _function_5);
        it_1.setOperand(_doubleArrow_1);
      };
      VLSUniversalQuantifier _doubleArrow = ObjectExtensions.<VLSUniversalQuantifier>operator_doubleArrow(_createVLSUniversalQuantifier, _function_3);
      it.setFofFormula(_doubleArrow);
    };
    final VLSFofFormula hierarch = ObjectExtensions.<VLSFofFormula>operator_doubleArrow(_createVLSFofFormula, _function_2);
    EList<VLSFofFormula> _formulas = trace.specification.getFormulas();
    _formulas.add(hierarch);
  }
  
  public boolean dfsSupertypeCheck(final Type type, final Type type2) {
    boolean _xifexpression = false;
    boolean _isEmpty = type.getSupertypes().isEmpty();
    if (_isEmpty) {
      return false;
    } else {
      boolean _xifexpression_1 = false;
      boolean _contains = type.getSupertypes().contains(type2);
      if (_contains) {
        return true;
      } else {
        EList<Type> _supertypes = type.getSupertypes();
        for (final Type supertype : _supertypes) {
          boolean _dfsSupertypeCheck = this.dfsSupertypeCheck(supertype, type2);
          if (_dfsSupertypeCheck) {
            return true;
          }
        }
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  @Override
  public List<VLSTerm> transformTypeReference(final Type referred, final Logic2VampireLanguageMapper mapper, final Logic2VampireLanguageMapperTrace trace) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public VLSTerm getUndefinedSupertype(final Logic2VampireLanguageMapperTrace trace) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public int getUndefinedSupertypeScope(final int undefinedScope, final Logic2VampireLanguageMapperTrace trace) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public VLSTerm transformReference(final DefinedElement referred, final Logic2VampireLanguageMapperTrace trace) {
    VLSDoubleQuote _createVLSDoubleQuote = this.factory.createVLSDoubleQuote();
    final Procedure1<VLSDoubleQuote> _function = (VLSDoubleQuote it) -> {
      String _name = referred.getName();
      String _plus = ("\"a" + _name);
      String _plus_1 = (_plus + "\"");
      it.setValue(_plus_1);
    };
    return ObjectExtensions.<VLSDoubleQuote>operator_doubleArrow(_createVLSDoubleQuote, _function);
  }
  
  @Override
  public VampireModelInterpretation_TypeInterpretation getTypeInterpreter() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
