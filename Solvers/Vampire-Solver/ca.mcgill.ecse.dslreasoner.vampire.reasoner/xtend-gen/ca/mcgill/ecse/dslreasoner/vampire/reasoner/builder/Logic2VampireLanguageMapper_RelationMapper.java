package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder;

import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapperTrace;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_Support;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFofFormula;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFunction;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSImplies;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTerm;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTffTerm;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSUniversalQuantifier;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSVariable;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguageFactory;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeReference;
import hu.bme.mit.inf.dslreasoner.util.CollectionsUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
  
  public void _transformRelation(final RelationDeclaration r, final Logic2VampireLanguageMapperTrace trace) {
    final List<VLSVariable> relVar2VLS = new ArrayList<VLSVariable>();
    final List<VLSFunction> relVar2TypeDecComply = new ArrayList<VLSFunction>();
    int _length = ((Object[])Conversions.unwrapArray(r.getParameters(), Object.class)).length;
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        VLSVariable _createVLSVariable = this.factory.createVLSVariable();
        final Procedure1<VLSVariable> _function = (VLSVariable it) -> {
          it.setName(this.support.toIDMultiple("V", i.toString()));
        };
        final VLSVariable v = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function);
        relVar2VLS.add(v);
        TypeReference _get = r.getParameters().get((i).intValue());
        final Type relType = ((ComplexTypeReference) _get).getReferred();
        final VLSFunction varTypeComply = this.support.duplicate(CollectionsUtil.<Type, VLSFunction>lookup(relType, trace.type2Predicate), v);
        relVar2TypeDecComply.add(varTypeComply);
      }
    }
    final String[] nameArray = r.getName().split(" ");
    String relNameVar = "";
    int _length_1 = nameArray.length;
    boolean _equals = (_length_1 == 3);
    if (_equals) {
      relNameVar = this.support.toIDMultiple(nameArray[0], nameArray[2]);
    } else {
      relNameVar = r.getName();
    }
    final String relName = relNameVar;
    VLSFofFormula _createVLSFofFormula = this.factory.createVLSFofFormula();
    final Procedure1<VLSFofFormula> _function = (VLSFofFormula it) -> {
      it.setName(this.support.toIDMultiple("compliance", relName));
      it.setFofRole("axiom");
      VLSUniversalQuantifier _createVLSUniversalQuantifier = this.factory.createVLSUniversalQuantifier();
      final Procedure1<VLSUniversalQuantifier> _function_1 = (VLSUniversalQuantifier it_1) -> {
        for (final VLSVariable v : relVar2VLS) {
          EList<VLSTffTerm> _variables = it_1.getVariables();
          VLSVariable _duplicate = this.support.duplicate(v);
          _variables.add(_duplicate);
        }
        VLSImplies _createVLSImplies = this.factory.createVLSImplies();
        final Procedure1<VLSImplies> _function_2 = (VLSImplies it_2) -> {
          VLSFunction _createVLSFunction = this.factory.createVLSFunction();
          final Procedure1<VLSFunction> _function_3 = (VLSFunction it_3) -> {
            it_3.setConstant(this.support.toIDMultiple("r", relName));
            for (final VLSVariable v_1 : relVar2VLS) {
              EList<VLSTerm> _terms = it_3.getTerms();
              VLSVariable _duplicate_1 = this.support.duplicate(v_1);
              _terms.add(_duplicate_1);
            }
          };
          final VLSFunction rel = ObjectExtensions.<VLSFunction>operator_doubleArrow(_createVLSFunction, _function_3);
          trace.rel2Predicate.put(r, rel);
          it_2.setLeft(this.support.duplicate(rel));
          it_2.setRight(this.support.unfoldAnd(relVar2TypeDecComply));
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
  
  public void _transformRelation(final RelationDefinition reldef, final Logic2VampireLanguageMapperTrace trace) {
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
