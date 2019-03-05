package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder;

import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapperTrace;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_Support;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSConstant;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSEquality;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSEquivalent;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFofFormula;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSUniversalQuantifier;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSVariable;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguageFactory;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Logic2VampireLanguageMapper_ScopeMapper {
  @Extension
  private final VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE;
  
  private final Logic2VampireLanguageMapper_Support support = new Logic2VampireLanguageMapper_Support();
  
  private final Logic2VampireLanguageMapper base;
  
  public Logic2VampireLanguageMapper_ScopeMapper(final Logic2VampireLanguageMapper base) {
    this.base = base;
  }
  
  public void _transformScope(final LogicSolverConfiguration config, final Logic2VampireLanguageMapperTrace trace) {
    VLSVariable _createVLSVariable = this.factory.createVLSVariable();
    final Procedure1<VLSVariable> _function = (VLSVariable it) -> {
      it.setName("A");
    };
    final VLSVariable variable = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function);
    final List<VLSConstant> instances = CollectionLiterals.<VLSConstant>newArrayList();
    for (int i = 0; (i < config.typeScopes.minNewElements); i++) {
      {
        final int num = (i + 1);
        VLSConstant _createVLSConstant = this.factory.createVLSConstant();
        final Procedure1<VLSConstant> _function_1 = (VLSConstant it) -> {
          it.setName(("o" + Integer.valueOf(num)));
        };
        final VLSConstant cst = ObjectExtensions.<VLSConstant>operator_doubleArrow(_createVLSConstant, _function_1);
        instances.add(cst);
      }
    }
    if ((config.typeScopes.minNewElements != 0)) {
      VLSFofFormula _createVLSFofFormula = this.factory.createVLSFofFormula();
      final Procedure1<VLSFofFormula> _function_1 = (VLSFofFormula it) -> {
        it.setName("typeScope");
        it.setFofRole("axiom");
        VLSUniversalQuantifier _createVLSUniversalQuantifier = this.factory.createVLSUniversalQuantifier();
        final Procedure1<VLSUniversalQuantifier> _function_2 = (VLSUniversalQuantifier it_1) -> {
          EList<VLSVariable> _variables = it_1.getVariables();
          VLSVariable _duplicate = this.support.duplicate(variable);
          _variables.add(_duplicate);
          VLSEquivalent _createVLSEquivalent = this.factory.createVLSEquivalent();
          final Procedure1<VLSEquivalent> _function_3 = (VLSEquivalent it_2) -> {
            it_2.setLeft(this.support.topLevelTypeFunc());
            final Function1<VLSConstant, VLSEquality> _function_4 = (VLSConstant i) -> {
              VLSEquality _createVLSEquality = this.factory.createVLSEquality();
              final Procedure1<VLSEquality> _function_5 = (VLSEquality it_3) -> {
                VLSVariable _createVLSVariable_1 = this.factory.createVLSVariable();
                final Procedure1<VLSVariable> _function_6 = (VLSVariable it_4) -> {
                  it_4.setName(variable.getName());
                };
                VLSVariable _doubleArrow = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable_1, _function_6);
                it_3.setLeft(_doubleArrow);
                it_3.setRight(i);
              };
              return ObjectExtensions.<VLSEquality>operator_doubleArrow(_createVLSEquality, _function_5);
            };
            it_2.setRight(this.support.unfoldOr(ListExtensions.<VLSConstant, VLSEquality>map(instances, _function_4)));
          };
          VLSEquivalent _doubleArrow = ObjectExtensions.<VLSEquivalent>operator_doubleArrow(_createVLSEquivalent, _function_3);
          it_1.setOperand(_doubleArrow);
        };
        VLSUniversalQuantifier _doubleArrow = ObjectExtensions.<VLSUniversalQuantifier>operator_doubleArrow(_createVLSUniversalQuantifier, _function_2);
        it.setFofFormula(_doubleArrow);
      };
      final VLSFofFormula cstDec = ObjectExtensions.<VLSFofFormula>operator_doubleArrow(_createVLSFofFormula, _function_1);
      EList<VLSFofFormula> _formulas = trace.specification.getFormulas();
      _formulas.add(cstDec);
      VLSFofFormula _createVLSFofFormula_1 = this.factory.createVLSFofFormula();
      final Procedure1<VLSFofFormula> _function_2 = (VLSFofFormula it) -> {
        it.setName("typeUniqueness");
        it.setFofRole("axiom");
        it.setFofFormula(this.support.establishUniqueness(instances));
      };
      final VLSFofFormula uniqueness = ObjectExtensions.<VLSFofFormula>operator_doubleArrow(_createVLSFofFormula_1, _function_2);
      EList<VLSFofFormula> _formulas_1 = trace.specification.getFormulas();
      _formulas_1.add(uniqueness);
    }
  }
  
  public void transformScope(final LogicSolverConfiguration config, final Logic2VampireLanguageMapperTrace trace) {
    _transformScope(config, trace);
    return;
  }
}
