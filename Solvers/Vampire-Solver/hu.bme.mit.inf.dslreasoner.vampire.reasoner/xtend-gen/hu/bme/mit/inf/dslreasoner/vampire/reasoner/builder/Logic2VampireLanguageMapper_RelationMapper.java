package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition;
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
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
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
    EList<Variable> _variables = r.getVariables();
    for (final Variable variable : _variables) {
      {
        VLSVariable _createVLSVariable = this.factory.createVLSVariable();
        final Procedure1<VLSVariable> _function = (VLSVariable it) -> {
          it.setName(this.support.toIDMultiple("Var", variable.getName()));
        };
        final VLSVariable v = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function);
        trace.relationVar2VLS.put(variable, v);
        VLSFunction _createVLSFunction = this.factory.createVLSFunction();
        final Procedure1<VLSFunction> _function_1 = (VLSFunction it) -> {
          it.setConstant(this.support.toIDMultiple("type"));
          EList<VLSTerm> _terms = it.getTerms();
          VLSVariable _createVLSVariable_1 = this.factory.createVLSVariable();
          final Procedure1<VLSVariable> _function_2 = (VLSVariable it_1) -> {
            it_1.setName(this.support.toIDMultiple("Var", variable.getName()));
          };
          VLSVariable _doubleArrow = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable_1, _function_2);
          _terms.add(_doubleArrow);
        };
        final VLSFunction varType = ObjectExtensions.<VLSFunction>operator_doubleArrow(_createVLSFunction, _function_1);
        trace.relationVar2TypeDec.put(variable, varType);
      }
    }
    VLSFofFormula _createVLSFofFormula = this.factory.createVLSFofFormula();
    final Procedure1<VLSFofFormula> _function = (VLSFofFormula it) -> {
      it.setName(this.support.toIDMultiple("relation", r.getName()));
      it.setFofRole("axiom");
      VLSUniversalQuantifier _createVLSUniversalQuantifier = this.factory.createVLSUniversalQuantifier();
      final Procedure1<VLSUniversalQuantifier> _function_1 = (VLSUniversalQuantifier it_1) -> {
        EList<Variable> _variables_1 = r.getVariables();
        for (final Variable variable_1 : _variables_1) {
          {
            VLSVariable _createVLSVariable = this.factory.createVLSVariable();
            final Procedure1<VLSVariable> _function_2 = (VLSVariable it_2) -> {
              it_2.setName(CollectionsUtil.<Variable, VLSVariable>lookup(variable_1, trace.relationVar2VLS).getName());
            };
            final VLSVariable v = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function_2);
            EList<VLSVariable> _variables_2 = it_1.getVariables();
            _variables_2.add(v);
          }
        }
        VLSImplies _createVLSImplies = this.factory.createVLSImplies();
        final Procedure1<VLSImplies> _function_2 = (VLSImplies it_2) -> {
          Collection<VLSFunction> _values = trace.relationVar2TypeDec.values();
          ArrayList<VLSTerm> _arrayList = new ArrayList<VLSTerm>(_values);
          it_2.setLeft(this.support.unfoldAnd(_arrayList));
          VLSEquivalent _createVLSEquivalent = this.factory.createVLSEquivalent();
          final Procedure1<VLSEquivalent> _function_3 = (VLSEquivalent it_3) -> {
            VLSFunction _createVLSFunction = this.factory.createVLSFunction();
            final Procedure1<VLSFunction> _function_4 = (VLSFunction it_4) -> {
              it_4.setConstant(this.support.toIDMultiple("rel", r.getName()));
              EList<Variable> _variables_2 = r.getVariables();
              for (final Variable variable_2 : _variables_2) {
                {
                  VLSVariable _createVLSVariable = this.factory.createVLSVariable();
                  final Procedure1<VLSVariable> _function_5 = (VLSVariable it_5) -> {
                    it_5.setName(CollectionsUtil.<Variable, VLSVariable>lookup(variable_2, trace.relationVar2VLS).getName());
                  };
                  final VLSVariable v = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function_5);
                  EList<VLSTerm> _terms = it_4.getTerms();
                  _terms.add(v);
                }
              }
            };
            VLSFunction _doubleArrow = ObjectExtensions.<VLSFunction>operator_doubleArrow(_createVLSFunction, _function_4);
            it_3.setLeft(_doubleArrow);
            it_3.setRight(this.base.transformTerm(r.getValue(), trace, trace.relationVar2VLS));
          };
          VLSEquivalent _doubleArrow = ObjectExtensions.<VLSEquivalent>operator_doubleArrow(_createVLSEquivalent, _function_3);
          it_2.setRight(_doubleArrow);
        };
        VLSImplies _doubleArrow = ObjectExtensions.<VLSImplies>operator_doubleArrow(_createVLSImplies, _function_2);
        it_1.setOperand(_doubleArrow);
      };
      VLSUniversalQuantifier _doubleArrow = ObjectExtensions.<VLSUniversalQuantifier>operator_doubleArrow(_createVLSUniversalQuantifier, _function_1);
      it.setFofFormula(_doubleArrow);
    };
    final VLSFofFormula res = ObjectExtensions.<VLSFofFormula>operator_doubleArrow(_createVLSFofFormula, _function);
    EList<VLSFofFormula> _formulas = trace.specification.getFormulas();
    _formulas.add(res);
  }
  
  public void transformRelation(final RelationDefinition r, final Logic2VampireLanguageMapperTrace trace) {
    _transformRelation(r, trace);
    return;
  }
}
