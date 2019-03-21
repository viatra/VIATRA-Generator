package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder;

import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapperTrace;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_Support;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSConstant;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSEquality;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSEquivalent;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSExistentialQuantifier;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFofFormula;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFunction;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSImplies;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSUniversalQuantifier;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSVariable;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguageFactory;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeReference;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ContainmentHierarchy;
import hu.bme.mit.inf.dslreasoner.util.CollectionsUtil;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Logic2VampireLanguageMapper_ContainmentMapper {
  @Extension
  private final VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE;
  
  private final Logic2VampireLanguageMapper_Support support = new Logic2VampireLanguageMapper_Support();
  
  private final Logic2VampireLanguageMapper base;
  
  private final VLSVariable variable = ObjectExtensions.<VLSVariable>operator_doubleArrow(this.factory.createVLSVariable(), ((Procedure1<VLSVariable>) (VLSVariable it) -> {
    it.setName("A");
  }));
  
  public Logic2VampireLanguageMapper_ContainmentMapper(final Logic2VampireLanguageMapper base) {
    this.base = base;
  }
  
  public void transformContainment(final List<ContainmentHierarchy> hierarchies, final Logic2VampireLanguageMapperTrace trace) {
    final ContainmentHierarchy hierarchy = hierarchies.get(0);
    final EList<Type> containmentListCopy = hierarchy.getTypesOrderedInHierarchy();
    final EList<Relation> relationsList = hierarchy.getContainmentRelations();
    for (final Relation l : relationsList) {
      {
        TypeReference _get = l.getParameters().get(1);
        Type _referred = ((ComplexTypeReference) _get).getReferred();
        Type pointingTo = ((Type) _referred);
        containmentListCopy.remove(pointingTo);
        EList<Type> _subtypes = pointingTo.getSubtypes();
        for (final Type c : _subtypes) {
          containmentListCopy.remove(c);
        }
      }
    }
    final String topName = CollectionsUtil.<Type, VLSFunction>lookup(containmentListCopy.get(0), trace.type2Predicate).getConstant().toString();
    final VLSFunction topTerm = this.support.duplicate(CollectionsUtil.<Type, VLSFunction>lookup(containmentListCopy.get(0), trace.type2Predicate));
    VLSFofFormula _createVLSFofFormula = this.factory.createVLSFofFormula();
    final Procedure1<VLSFofFormula> _function = (VLSFofFormula it) -> {
      it.setName(this.support.toIDMultiple("containment_topLevel", topName));
      it.setFofRole("axiom");
      VLSUniversalQuantifier _createVLSUniversalQuantifier = this.factory.createVLSUniversalQuantifier();
      final Procedure1<VLSUniversalQuantifier> _function_1 = (VLSUniversalQuantifier it_1) -> {
        EList<VLSVariable> _variables = it_1.getVariables();
        VLSVariable _duplicate = this.support.duplicate(this.variable);
        _variables.add(_duplicate);
        VLSEquivalent _createVLSEquivalent = this.factory.createVLSEquivalent();
        final Procedure1<VLSEquivalent> _function_2 = (VLSEquivalent it_2) -> {
          it_2.setLeft(topTerm);
          VLSEquality _createVLSEquality = this.factory.createVLSEquality();
          final Procedure1<VLSEquality> _function_3 = (VLSEquality it_3) -> {
            it_3.setLeft(this.support.duplicate(this.variable));
            VLSConstant _createVLSConstant = this.factory.createVLSConstant();
            final Procedure1<VLSConstant> _function_4 = (VLSConstant it_4) -> {
              it_4.setName("o1");
            };
            VLSConstant _doubleArrow = ObjectExtensions.<VLSConstant>operator_doubleArrow(_createVLSConstant, _function_4);
            it_3.setRight(_doubleArrow);
          };
          VLSEquality _doubleArrow = ObjectExtensions.<VLSEquality>operator_doubleArrow(_createVLSEquality, _function_3);
          it_2.setRight(_doubleArrow);
        };
        VLSEquivalent _doubleArrow = ObjectExtensions.<VLSEquivalent>operator_doubleArrow(_createVLSEquivalent, _function_2);
        it_1.setOperand(_doubleArrow);
      };
      VLSUniversalQuantifier _doubleArrow = ObjectExtensions.<VLSUniversalQuantifier>operator_doubleArrow(_createVLSUniversalQuantifier, _function_1);
      it.setFofFormula(_doubleArrow);
    };
    final VLSFofFormula contTop = ObjectExtensions.<VLSFofFormula>operator_doubleArrow(_createVLSFofFormula, _function);
    EList<VLSFofFormula> _formulas = trace.specification.getFormulas();
    _formulas.add(contTop);
    VLSVariable _createVLSVariable = this.factory.createVLSVariable();
    final Procedure1<VLSVariable> _function_1 = (VLSVariable it) -> {
      it.setName("A");
    };
    final VLSVariable varA = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function_1);
    VLSVariable _createVLSVariable_1 = this.factory.createVLSVariable();
    final Procedure1<VLSVariable> _function_2 = (VLSVariable it) -> {
      it.setName("B");
    };
    final VLSVariable varB = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable_1, _function_2);
    final ArrayList<VLSVariable> varList = CollectionLiterals.<VLSVariable>newArrayList(varB, varA);
    for (final Relation l_1 : relationsList) {
      {
        final String relName = CollectionsUtil.<RelationDeclaration, VLSFunction>lookup(((RelationDeclaration) l_1), trace.rel2Predicate).getConstant().toString();
        TypeReference _get = l_1.getParameters().get(0);
        Type _referred = ((ComplexTypeReference) _get).getReferred();
        final Type fromType = ((Type) _referred);
        TypeReference _get_1 = l_1.getParameters().get(1);
        Type _referred_1 = ((ComplexTypeReference) _get_1).getReferred();
        final Type toType = ((Type) _referred_1);
        final ArrayList<VLSFunction> listForAnd = CollectionLiterals.<VLSFunction>newArrayList();
        listForAnd.add(this.support.duplicate(CollectionsUtil.<RelationDeclaration, VLSFunction>lookup(((RelationDeclaration) l_1), trace.rel2Predicate), varList));
        VLSFofFormula _createVLSFofFormula_1 = this.factory.createVLSFofFormula();
        final Procedure1<VLSFofFormula> _function_3 = (VLSFofFormula it) -> {
          it.setName(this.support.toIDMultiple("containment", relName));
          it.setFofRole("axiom");
          VLSUniversalQuantifier _createVLSUniversalQuantifier = this.factory.createVLSUniversalQuantifier();
          final Procedure1<VLSUniversalQuantifier> _function_4 = (VLSUniversalQuantifier it_1) -> {
            EList<VLSVariable> _variables = it_1.getVariables();
            VLSVariable _duplicate = this.support.duplicate(varA);
            _variables.add(_duplicate);
            VLSImplies _createVLSImplies = this.factory.createVLSImplies();
            final Procedure1<VLSImplies> _function_5 = (VLSImplies it_2) -> {
              it_2.setLeft(this.support.duplicate(CollectionsUtil.<Type, VLSFunction>lookup(toType, trace.type2Predicate), varA));
              VLSExistentialQuantifier _createVLSExistentialQuantifier = this.factory.createVLSExistentialQuantifier();
              final Procedure1<VLSExistentialQuantifier> _function_6 = (VLSExistentialQuantifier it_3) -> {
                EList<VLSVariable> _variables_1 = it_3.getVariables();
                VLSVariable _duplicate_1 = this.support.duplicate(varB);
                _variables_1.add(_duplicate_1);
                it_3.setOperand(this.support.unfoldAnd(listForAnd));
              };
              VLSExistentialQuantifier _doubleArrow = ObjectExtensions.<VLSExistentialQuantifier>operator_doubleArrow(_createVLSExistentialQuantifier, _function_6);
              it_2.setRight(_doubleArrow);
              VLSEquality _createVLSEquality = this.factory.createVLSEquality();
              final Procedure1<VLSEquality> _function_7 = (VLSEquality it_3) -> {
                it_3.setLeft(this.support.duplicate(this.variable));
                VLSConstant _createVLSConstant = this.factory.createVLSConstant();
                final Procedure1<VLSConstant> _function_8 = (VLSConstant it_4) -> {
                  it_4.setName("o1");
                };
                VLSConstant _doubleArrow_1 = ObjectExtensions.<VLSConstant>operator_doubleArrow(_createVLSConstant, _function_8);
                it_3.setRight(_doubleArrow_1);
              };
              ObjectExtensions.<VLSEquality>operator_doubleArrow(_createVLSEquality, _function_7);
            };
            VLSImplies _doubleArrow = ObjectExtensions.<VLSImplies>operator_doubleArrow(_createVLSImplies, _function_5);
            it_1.setOperand(_doubleArrow);
          };
          VLSUniversalQuantifier _doubleArrow = ObjectExtensions.<VLSUniversalQuantifier>operator_doubleArrow(_createVLSUniversalQuantifier, _function_4);
          it.setFofFormula(_doubleArrow);
        };
        final VLSFofFormula relFormula = ObjectExtensions.<VLSFofFormula>operator_doubleArrow(_createVLSFofFormula_1, _function_3);
        EList<VLSFofFormula> _formulas_1 = trace.specification.getFormulas();
        _formulas_1.add(relFormula);
        TypeReference _get_2 = l_1.getParameters().get(1);
        Type _referred_2 = ((ComplexTypeReference) _get_2).getReferred();
        Type pointingTo = ((Type) _referred_2);
        containmentListCopy.remove(pointingTo);
        EList<Type> _subtypes = pointingTo.getSubtypes();
        for (final Type c : _subtypes) {
          containmentListCopy.remove(c);
        }
      }
    }
  }
}
