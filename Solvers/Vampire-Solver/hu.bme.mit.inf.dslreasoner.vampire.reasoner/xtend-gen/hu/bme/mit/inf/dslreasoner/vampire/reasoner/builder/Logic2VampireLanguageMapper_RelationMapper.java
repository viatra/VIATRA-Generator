package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeReference;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable;
import hu.bme.mit.inf.dslreasoner.util.CollectionsUtil;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapperTrace;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_Support;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSEquivalent;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSFofFormula;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSFunction;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSImplies;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSTerm;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSUniversalQuantifier;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSVariable;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguageFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Logic2VampireLanguageMapper_RelationMapper {
  @Extension
  private final VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE;
  
  private final Logic2VampireLanguageMapper_Support support = new Logic2VampireLanguageMapper_Support();
  
  private final Logic2VampireLanguageMapper base;
  
  public Logic2VampireLanguageMapper_RelationMapper(final Logic2VampireLanguageMapper base) {
    this.base = base;
  }
  
  public void _transformRelation(final RelationDefinition r, final Logic2VampireLanguageMapperTrace trace) {
    final Map<Variable, VLSVariable> relationVar2VLS = new HashMap<Variable, VLSVariable>();
    final Map<Variable, VLSFunction> relationVar2TypeDecComply = new HashMap<Variable, VLSFunction>();
    final Map<Variable, VLSFunction> relationVar2TypeDecRes = new HashMap<Variable, VLSFunction>();
    final ArrayList<VLSTerm> typedefs = new ArrayList<VLSTerm>();
    EList<Variable> _variables = r.getVariables();
    for (final Variable variable : _variables) {
      {
        VLSVariable _createVLSVariable = this.factory.createVLSVariable();
        final Procedure1<VLSVariable> _function = (VLSVariable it) -> {
          it.setName(this.support.toIDMultiple("Var", variable.getName()));
        };
        final VLSVariable v = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function);
        relationVar2VLS.put(variable, v);
        VLSFunction _createVLSFunction = this.factory.createVLSFunction();
        final Procedure1<VLSFunction> _function_1 = (VLSFunction it) -> {
          TypeReference _range = variable.getRange();
          it.setConstant(this.support.toIDMultiple("type", ((ComplexTypeReference) _range).getReferred().getName()));
          EList<VLSTerm> _terms = it.getTerms();
          VLSVariable _createVLSVariable_1 = this.factory.createVLSVariable();
          final Procedure1<VLSVariable> _function_2 = (VLSVariable it_1) -> {
            it_1.setName(this.support.toIDMultiple("Var", variable.getName()));
          };
          VLSVariable _doubleArrow = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable_1, _function_2);
          _terms.add(_doubleArrow);
        };
        final VLSFunction varTypeComply = ObjectExtensions.<VLSFunction>operator_doubleArrow(_createVLSFunction, _function_1);
        relationVar2TypeDecComply.put(variable, varTypeComply);
        VLSFunction _createVLSFunction_1 = this.factory.createVLSFunction();
        final Procedure1<VLSFunction> _function_2 = (VLSFunction it) -> {
          TypeReference _range = variable.getRange();
          it.setConstant(this.support.toIDMultiple("type", ((ComplexTypeReference) _range).getReferred().getName()));
          EList<VLSTerm> _terms = it.getTerms();
          VLSVariable _createVLSVariable_1 = this.factory.createVLSVariable();
          final Procedure1<VLSVariable> _function_3 = (VLSVariable it_1) -> {
            it_1.setName(this.support.toIDMultiple("Var", variable.getName()));
          };
          VLSVariable _doubleArrow = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable_1, _function_3);
          _terms.add(_doubleArrow);
        };
        final VLSFunction varTypeRes = ObjectExtensions.<VLSFunction>operator_doubleArrow(_createVLSFunction_1, _function_2);
        relationVar2TypeDecRes.put(variable, varTypeRes);
      }
    }
    VLSFofFormula _createVLSFofFormula = this.factory.createVLSFofFormula();
    final Procedure1<VLSFofFormula> _function = (VLSFofFormula it) -> {
      it.setName(this.support.toIDMultiple("compliance", r.getName()));
      it.setFofRole("axiom");
      VLSUniversalQuantifier _createVLSUniversalQuantifier = this.factory.createVLSUniversalQuantifier();
      final Procedure1<VLSUniversalQuantifier> _function_1 = (VLSUniversalQuantifier it_1) -> {
        EList<Variable> _variables_1 = r.getVariables();
        for (final Variable variable_1 : _variables_1) {
          {
            VLSVariable _createVLSVariable = this.factory.createVLSVariable();
            final Procedure1<VLSVariable> _function_2 = (VLSVariable it_2) -> {
              it_2.setName(CollectionsUtil.<Variable, VLSVariable>lookup(variable_1, relationVar2VLS).getName());
            };
            final VLSVariable v = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function_2);
            EList<VLSVariable> _variables_2 = it_1.getVariables();
            _variables_2.add(v);
          }
        }
        VLSImplies _createVLSImplies = this.factory.createVLSImplies();
        final Procedure1<VLSImplies> _function_2 = (VLSImplies it_2) -> {
          VLSFunction _createVLSFunction = this.factory.createVLSFunction();
          final Procedure1<VLSFunction> _function_3 = (VLSFunction it_3) -> {
            it_3.setConstant(this.support.toIDMultiple("rel", r.getName()));
            EList<Variable> _variables_2 = r.getVariables();
            for (final Variable variable_2 : _variables_2) {
              {
                VLSVariable _createVLSVariable = this.factory.createVLSVariable();
                final Procedure1<VLSVariable> _function_4 = (VLSVariable it_4) -> {
                  it_4.setName(CollectionsUtil.<Variable, VLSVariable>lookup(variable_2, relationVar2VLS).getName());
                };
                final VLSVariable v = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function_4);
                EList<VLSTerm> _terms = it_3.getTerms();
                _terms.add(v);
              }
            }
          };
          VLSFunction _doubleArrow = ObjectExtensions.<VLSFunction>operator_doubleArrow(_createVLSFunction, _function_3);
          it_2.setLeft(_doubleArrow);
          Collection<VLSFunction> _values = relationVar2TypeDecComply.values();
          ArrayList<VLSTerm> _arrayList = new ArrayList<VLSTerm>(_values);
          it_2.setRight(this.support.unfoldAnd(_arrayList));
        };
        VLSImplies _doubleArrow = ObjectExtensions.<VLSImplies>operator_doubleArrow(_createVLSImplies, _function_2);
        it_1.setOperand(_doubleArrow);
      };
      VLSUniversalQuantifier _doubleArrow = ObjectExtensions.<VLSUniversalQuantifier>operator_doubleArrow(_createVLSUniversalQuantifier, _function_1);
      it.setFofFormula(_doubleArrow);
    };
    final VLSFofFormula comply = ObjectExtensions.<VLSFofFormula>operator_doubleArrow(_createVLSFofFormula, _function);
    VLSFofFormula _createVLSFofFormula_1 = this.factory.createVLSFofFormula();
    final Procedure1<VLSFofFormula> _function_1 = (VLSFofFormula it) -> {
      it.setName(this.support.toIDMultiple("relation", r.getName()));
      it.setFofRole("axiom");
      VLSUniversalQuantifier _createVLSUniversalQuantifier = this.factory.createVLSUniversalQuantifier();
      final Procedure1<VLSUniversalQuantifier> _function_2 = (VLSUniversalQuantifier it_1) -> {
        EList<Variable> _variables_1 = r.getVariables();
        for (final Variable variable_1 : _variables_1) {
          {
            VLSVariable _createVLSVariable = this.factory.createVLSVariable();
            final Procedure1<VLSVariable> _function_3 = (VLSVariable it_2) -> {
              it_2.setName(CollectionsUtil.<Variable, VLSVariable>lookup(variable_1, relationVar2VLS).getName());
            };
            final VLSVariable v = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function_3);
            EList<VLSVariable> _variables_2 = it_1.getVariables();
            _variables_2.add(v);
          }
        }
        VLSImplies _createVLSImplies = this.factory.createVLSImplies();
        final Procedure1<VLSImplies> _function_3 = (VLSImplies it_2) -> {
          Collection<VLSFunction> _values = relationVar2TypeDecRes.values();
          ArrayList<VLSTerm> _arrayList = new ArrayList<VLSTerm>(_values);
          it_2.setLeft(this.support.unfoldAnd(_arrayList));
          VLSEquivalent _createVLSEquivalent = this.factory.createVLSEquivalent();
          final Procedure1<VLSEquivalent> _function_4 = (VLSEquivalent it_3) -> {
            VLSFunction _createVLSFunction = this.factory.createVLSFunction();
            final Procedure1<VLSFunction> _function_5 = (VLSFunction it_4) -> {
              it_4.setConstant(this.support.toIDMultiple("rel", r.getName()));
              EList<Variable> _variables_2 = r.getVariables();
              for (final Variable variable_2 : _variables_2) {
                {
                  VLSVariable _createVLSVariable = this.factory.createVLSVariable();
                  final Procedure1<VLSVariable> _function_6 = (VLSVariable it_5) -> {
                    it_5.setName(CollectionsUtil.<Variable, VLSVariable>lookup(variable_2, relationVar2VLS).getName());
                  };
                  final VLSVariable v = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function_6);
                  EList<VLSTerm> _terms = it_4.getTerms();
                  _terms.add(v);
                }
              }
            };
            VLSFunction _doubleArrow = ObjectExtensions.<VLSFunction>operator_doubleArrow(_createVLSFunction, _function_5);
            it_3.setLeft(_doubleArrow);
            it_3.setRight(this.base.transformTerm(r.getValue(), trace, relationVar2VLS));
          };
          VLSEquivalent _doubleArrow = ObjectExtensions.<VLSEquivalent>operator_doubleArrow(_createVLSEquivalent, _function_4);
          it_2.setRight(_doubleArrow);
        };
        VLSImplies _doubleArrow = ObjectExtensions.<VLSImplies>operator_doubleArrow(_createVLSImplies, _function_3);
        it_1.setOperand(_doubleArrow);
      };
      VLSUniversalQuantifier _doubleArrow = ObjectExtensions.<VLSUniversalQuantifier>operator_doubleArrow(_createVLSUniversalQuantifier, _function_2);
      it.setFofFormula(_doubleArrow);
    };
    final VLSFofFormula res = ObjectExtensions.<VLSFofFormula>operator_doubleArrow(_createVLSFofFormula_1, _function_1);
    EList<VLSFofFormula> _formulas = trace.specification.getFormulas();
    _formulas.add(comply);
    EList<VLSFofFormula> _formulas_1 = trace.specification.getFormulas();
    _formulas_1.add(res);
  }
  
  public void _transformRelation(final RelationDeclaration r, final Logic2VampireLanguageMapperTrace trace) {
    final List<VLSVariable> relationVar2VLS = new ArrayList<VLSVariable>();
    final List<VLSFunction> relationVar2TypeDecComply = new ArrayList<VLSFunction>();
    final ArrayList<VLSTerm> typedefs = new ArrayList<VLSTerm>();
    int _length = ((Object[])Conversions.unwrapArray(r.getParameters(), Object.class)).length;
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        VLSVariable _createVLSVariable = this.factory.createVLSVariable();
        final Procedure1<VLSVariable> _function = (VLSVariable it) -> {
          it.setName(this.support.toIDMultiple("Var", i.toString()));
        };
        final VLSVariable v = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function);
        relationVar2VLS.add(v);
        VLSFunction _createVLSFunction = this.factory.createVLSFunction();
        final Procedure1<VLSFunction> _function_1 = (VLSFunction it) -> {
          TypeReference _get = r.getParameters().get((i).intValue());
          it.setConstant(this.support.toIDMultiple("type", ((ComplexTypeReference) _get).getReferred().getName()));
          EList<VLSTerm> _terms = it.getTerms();
          VLSVariable _createVLSVariable_1 = this.factory.createVLSVariable();
          final Procedure1<VLSVariable> _function_2 = (VLSVariable it_1) -> {
            it_1.setName(this.support.toIDMultiple("Var", i.toString()));
          };
          VLSVariable _doubleArrow = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable_1, _function_2);
          _terms.add(_doubleArrow);
        };
        final VLSFunction varTypeComply = ObjectExtensions.<VLSFunction>operator_doubleArrow(_createVLSFunction, _function_1);
        relationVar2TypeDecComply.add(varTypeComply);
      }
    }
    VLSFofFormula _createVLSFofFormula = this.factory.createVLSFofFormula();
    final Procedure1<VLSFofFormula> _function = (VLSFofFormula it) -> {
      it.setName(this.support.toIDMultiple("compliance", r.getName()));
      it.setFofRole("axiom");
      VLSUniversalQuantifier _createVLSUniversalQuantifier = this.factory.createVLSUniversalQuantifier();
      final Procedure1<VLSUniversalQuantifier> _function_1 = (VLSUniversalQuantifier it_1) -> {
        int _length_1 = ((Object[])Conversions.unwrapArray(r.getParameters(), Object.class)).length;
        ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _length_1, true);
        for (final Integer i_1 : _doubleDotLessThan_1) {
          {
            VLSVariable _createVLSVariable = this.factory.createVLSVariable();
            final Procedure1<VLSVariable> _function_2 = (VLSVariable it_2) -> {
              it_2.setName(relationVar2VLS.get((i_1).intValue()).getName());
            };
            final VLSVariable v = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function_2);
            EList<VLSVariable> _variables = it_1.getVariables();
            _variables.add(v);
          }
        }
        VLSImplies _createVLSImplies = this.factory.createVLSImplies();
        final Procedure1<VLSImplies> _function_2 = (VLSImplies it_2) -> {
          VLSFunction _createVLSFunction = this.factory.createVLSFunction();
          final Procedure1<VLSFunction> _function_3 = (VLSFunction it_3) -> {
            it_3.setConstant(this.support.toIDMultiple("rel", r.getName()));
            int _length_2 = ((Object[])Conversions.unwrapArray(r.getParameters(), Object.class)).length;
            ExclusiveRange _doubleDotLessThan_2 = new ExclusiveRange(0, _length_2, true);
            for (final Integer i_2 : _doubleDotLessThan_2) {
              {
                VLSVariable _createVLSVariable = this.factory.createVLSVariable();
                final Procedure1<VLSVariable> _function_4 = (VLSVariable it_4) -> {
                  it_4.setName(relationVar2VLS.get((i_2).intValue()).getName());
                };
                final VLSVariable v = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function_4);
                EList<VLSTerm> _terms = it_3.getTerms();
                _terms.add(v);
              }
            }
          };
          VLSFunction _doubleArrow = ObjectExtensions.<VLSFunction>operator_doubleArrow(_createVLSFunction, _function_3);
          it_2.setLeft(_doubleArrow);
          it_2.setRight(this.support.unfoldAnd(relationVar2TypeDecComply));
        };
        VLSImplies _doubleArrow = ObjectExtensions.<VLSImplies>operator_doubleArrow(_createVLSImplies, _function_2);
        it_1.setOperand(_doubleArrow);
      };
      VLSUniversalQuantifier _doubleArrow = ObjectExtensions.<VLSUniversalQuantifier>operator_doubleArrow(_createVLSUniversalQuantifier, _function_1);
      it.setFofFormula(_doubleArrow);
    };
    final VLSFofFormula comply = ObjectExtensions.<VLSFofFormula>operator_doubleArrow(_createVLSFofFormula, _function);
    EList<VLSFofFormula> _formulas = trace.specification.getFormulas();
    _formulas.add(comply);
  }
  
  public void transformRelation(final Relation r, final Logic2VampireLanguageMapperTrace trace) {
    if (r instanceof RelationDeclaration) {
      _transformRelation((RelationDeclaration)r, trace);
      return;
    } else if (r instanceof RelationDefinition) {
      _transformRelation((RelationDefinition)r, trace);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(r, trace).toString());
    }
  }
}
