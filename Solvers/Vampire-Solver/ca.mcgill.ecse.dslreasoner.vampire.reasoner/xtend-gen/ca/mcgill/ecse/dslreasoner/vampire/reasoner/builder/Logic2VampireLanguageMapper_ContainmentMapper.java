package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder;

import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolverConfiguration;
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
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTerm;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSUnaryNegation;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSUniversalQuantifier;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSVariable;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguageFactory;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeReference;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.TypeDefinitionImpl;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ContainmentHierarchy;
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
  
  public void transformContainment(final VampireSolverConfiguration config, final List<ContainmentHierarchy> hierarchies, final Logic2VampireLanguageMapperTrace trace) {
    final ContainmentHierarchy hierarchy = hierarchies.get(0);
    final EList<Type> containmentListCopy = hierarchy.getTypesOrderedInHierarchy();
    final EList<Relation> relationsList = hierarchy.getContainmentRelations();
    final ArrayList<Object> toRemove = CollectionLiterals.<Object>newArrayList();
    for (final Relation l : relationsList) {
      {
        TypeReference _get = l.getParameters().get(1);
        Type _referred = ((ComplexTypeReference) _get).getReferred();
        Type pointingTo = ((Type) _referred);
        containmentListCopy.remove(pointingTo);
        List<Type> allSubtypes = CollectionLiterals.<Type>newArrayList();
        this.support.listSubtypes(pointingTo, allSubtypes);
        for (final Type c : allSubtypes) {
          containmentListCopy.remove(c);
        }
      }
    }
    Type topTermVar = containmentListCopy.get(0);
    for (final Relation l_1 : relationsList) {
      {
        TypeReference _get = l_1.getParameters().get(0);
        Type _referred = ((ComplexTypeReference) _get).getReferred();
        Type pointingFrom = ((Type) _referred);
        boolean _contains = containmentListCopy.contains(pointingFrom);
        if (_contains) {
          topTermVar = pointingFrom;
        }
      }
    }
    final String topName = CollectionsUtil.<Type, VLSFunction>lookup(topTermVar, trace.type2Predicate).getConstant().toString();
    final VLSFunction topTerm = this.support.duplicate(CollectionsUtil.<Type, VLSFunction>lookup(topTermVar, trace.type2Predicate));
    boolean topLvlIsInInitModel = false;
    String topLvlString = "";
    ArrayList<Type> listToCheck = CollectionLiterals.<Type>newArrayList(topTermVar);
    listToCheck.addAll(topTermVar.getSubtypes());
    for (final Type c : listToCheck) {
      Class<? extends Type> _class = c.getClass();
      boolean _equals = Objects.equal(_class, TypeDefinitionImpl.class);
      if (_equals) {
        int _length = ((Object[])Conversions.unwrapArray(((TypeDefinition) c).getElements(), Object.class)).length;
        boolean _greaterThan = (_length > 1);
        if (_greaterThan) {
          throw new IllegalArgumentException("You cannot have multiple top-level elements in your initial model");
        }
        EList<DefinedElement> _elements = ((TypeDefinition) c).getElements();
        for (final DefinedElement d : _elements) {
          boolean _containsKey = trace.definedElement2String.containsKey(d);
          if (_containsKey) {
            topLvlIsInInitModel = true;
            topLvlString = CollectionsUtil.<DefinedElement, String>lookup(d, trace.definedElement2String);
          }
        }
      }
    }
    trace.topLvlElementIsInInitialModel = Boolean.valueOf(topLvlIsInInitModel);
    final boolean topInIM = topLvlIsInInitModel;
    final String topStr = topLvlString;
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
              String _xifexpression = null;
              if (topInIM) {
                _xifexpression = topStr;
              } else {
                _xifexpression = "o1";
              }
              it_4.setName(_xifexpression);
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
    VLSVariable _createVLSVariable_2 = this.factory.createVLSVariable();
    final Procedure1<VLSVariable> _function_3 = (VLSVariable it) -> {
      it.setName("C");
    };
    final VLSVariable varC = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable_2, _function_3);
    final ArrayList<VLSVariable> varList = CollectionLiterals.<VLSVariable>newArrayList(varB, varA);
    final Map<VLSFunction, List<VLSFunction>> type2cont = new HashMap<VLSFunction, List<VLSFunction>>();
    for (final Relation l_2 : relationsList) {
      {
        final VLSFunction rel = this.support.duplicate(CollectionsUtil.<RelationDeclaration, VLSFunction>lookup(((RelationDeclaration) l_2), trace.rel2Predicate), varList);
        TypeReference _get = l_2.getParameters().get(1);
        Type _referred = ((ComplexTypeReference) _get).getReferred();
        final Type toType = ((Type) _referred);
        final VLSFunction toFunc = CollectionsUtil.<Type, VLSFunction>lookup(toType, trace.type2Predicate);
        this.addToMap(type2cont, toFunc, rel);
        EList<Type> _subtypes = toType.getSubtypes();
        for (final Type c_1 : _subtypes) {
          this.addToMap(type2cont, toFunc, rel);
        }
        VLSFofFormula _createVLSFofFormula_1 = this.factory.createVLSFofFormula();
        final Procedure1<VLSFofFormula> _function_4 = (VLSFofFormula it) -> {
          it.setName(this.support.toIDMultiple("containment_noDup", rel.getConstant().toString()));
          it.setFofRole("axiom");
          VLSExistentialQuantifier _createVLSExistentialQuantifier = this.factory.createVLSExistentialQuantifier();
          final Procedure1<VLSExistentialQuantifier> _function_5 = (VLSExistentialQuantifier it_1) -> {
            EList<VLSVariable> _variables = it_1.getVariables();
            VLSVariable _duplicate = this.support.duplicate(varA);
            _variables.add(_duplicate);
            EList<VLSVariable> _variables_1 = it_1.getVariables();
            VLSVariable _duplicate_1 = this.support.duplicate(varB);
            _variables_1.add(_duplicate_1);
            VLSImplies _createVLSImplies = this.factory.createVLSImplies();
            final Procedure1<VLSImplies> _function_6 = (VLSImplies it_2) -> {
              it_2.setLeft(this.support.duplicate(rel, CollectionLiterals.<VLSVariable>newArrayList(varA, varB)));
              VLSUnaryNegation _createVLSUnaryNegation = this.factory.createVLSUnaryNegation();
              final Procedure1<VLSUnaryNegation> _function_7 = (VLSUnaryNegation it_3) -> {
                VLSExistentialQuantifier _createVLSExistentialQuantifier_1 = this.factory.createVLSExistentialQuantifier();
                final Procedure1<VLSExistentialQuantifier> _function_8 = (VLSExistentialQuantifier it_4) -> {
                  EList<VLSVariable> _variables_2 = it_4.getVariables();
                  VLSVariable _duplicate_2 = this.support.duplicate(varC);
                  _variables_2.add(_duplicate_2);
                  EList<VLSVariable> _variables_3 = it_4.getVariables();
                  VLSVariable _duplicate_3 = this.support.duplicate(varB);
                  _variables_3.add(_duplicate_3);
                  it_4.setOperand(this.support.duplicate(rel, CollectionLiterals.<VLSVariable>newArrayList(varC, varB)));
                };
                VLSExistentialQuantifier _doubleArrow = ObjectExtensions.<VLSExistentialQuantifier>operator_doubleArrow(_createVLSExistentialQuantifier_1, _function_8);
                it_3.setOperand(_doubleArrow);
              };
              VLSUnaryNegation _doubleArrow = ObjectExtensions.<VLSUnaryNegation>operator_doubleArrow(_createVLSUnaryNegation, _function_7);
              it_2.setRight(_doubleArrow);
            };
            VLSImplies _doubleArrow = ObjectExtensions.<VLSImplies>operator_doubleArrow(_createVLSImplies, _function_6);
            it_1.setOperand(_doubleArrow);
          };
          VLSExistentialQuantifier _doubleArrow = ObjectExtensions.<VLSExistentialQuantifier>operator_doubleArrow(_createVLSExistentialQuantifier, _function_5);
          it.setFofFormula(_doubleArrow);
        };
        final VLSFofFormula relFormula = ObjectExtensions.<VLSFofFormula>operator_doubleArrow(_createVLSFofFormula_1, _function_4);
        EList<VLSFofFormula> _formulas_1 = trace.specification.getFormulas();
        _formulas_1.add(relFormula);
      }
    }
    Set<Map.Entry<VLSFunction, List<VLSFunction>>> _entrySet = type2cont.entrySet();
    for (final Map.Entry<VLSFunction, List<VLSFunction>> e : _entrySet) {
      {
        VLSFofFormula _createVLSFofFormula_1 = this.factory.createVLSFofFormula();
        final Procedure1<VLSFofFormula> _function_4 = (VLSFofFormula it) -> {
          it.setName(this.support.toIDMultiple("containment_contained", e.getKey().getConstant().toString()));
          it.setFofRole("axiom");
          VLSUniversalQuantifier _createVLSUniversalQuantifier = this.factory.createVLSUniversalQuantifier();
          final Procedure1<VLSUniversalQuantifier> _function_5 = (VLSUniversalQuantifier it_1) -> {
            EList<VLSVariable> _variables = it_1.getVariables();
            VLSVariable _duplicate = this.support.duplicate(varA);
            _variables.add(_duplicate);
            VLSImplies _createVLSImplies = this.factory.createVLSImplies();
            final Procedure1<VLSImplies> _function_6 = (VLSImplies it_2) -> {
              it_2.setLeft(this.support.duplicate(e.getKey(), varA));
              VLSExistentialQuantifier _createVLSExistentialQuantifier = this.factory.createVLSExistentialQuantifier();
              final Procedure1<VLSExistentialQuantifier> _function_7 = (VLSExistentialQuantifier it_3) -> {
                EList<VLSVariable> _variables_1 = it_3.getVariables();
                VLSVariable _duplicate_1 = this.support.duplicate(varB);
                _variables_1.add(_duplicate_1);
                int _length_1 = ((Object[])Conversions.unwrapArray(e.getValue(), Object.class)).length;
                boolean _greaterThan_1 = (_length_1 > 1);
                if (_greaterThan_1) {
                  it_3.setOperand(this.makeUnique(e.getValue()));
                } else {
                  it_3.setOperand(e.getValue().get(0));
                }
              };
              VLSExistentialQuantifier _doubleArrow = ObjectExtensions.<VLSExistentialQuantifier>operator_doubleArrow(_createVLSExistentialQuantifier, _function_7);
              it_2.setRight(_doubleArrow);
            };
            VLSImplies _doubleArrow = ObjectExtensions.<VLSImplies>operator_doubleArrow(_createVLSImplies, _function_6);
            it_1.setOperand(_doubleArrow);
          };
          VLSUniversalQuantifier _doubleArrow = ObjectExtensions.<VLSUniversalQuantifier>operator_doubleArrow(_createVLSUniversalQuantifier, _function_5);
          it.setFofFormula(_doubleArrow);
        };
        final VLSFofFormula relFormula = ObjectExtensions.<VLSFofFormula>operator_doubleArrow(_createVLSFofFormula_1, _function_4);
        EList<VLSFofFormula> _formulas_1 = trace.specification.getFormulas();
        _formulas_1.add(relFormula);
      }
    }
    final ArrayList<VLSVariable> variables = CollectionLiterals.<VLSVariable>newArrayList();
    final ArrayList<VLSFunction> disjunctionList = CollectionLiterals.<VLSFunction>newArrayList();
    final ArrayList<VLSTerm> conjunctionList = CollectionLiterals.<VLSTerm>newArrayList();
    for (int i = 1; (i <= config.contCycleLevel); i++) {
      {
        final int ind = i;
        VLSVariable _createVLSVariable_3 = this.factory.createVLSVariable();
        final Procedure1<VLSVariable> _function_4 = (VLSVariable it) -> {
          String _string = Integer.toString(ind);
          String _plus = ("V" + _string);
          it.setName(_plus);
        };
        VLSVariable _doubleArrow = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable_3, _function_4);
        variables.add(_doubleArrow);
        for (int j = 0; (j < i); j++) {
          {
            for (final Relation l_3 : relationsList) {
              {
                final VLSFunction rel = this.support.duplicate(CollectionsUtil.<RelationDeclaration, VLSFunction>lookup(((RelationDeclaration) l_3), trace.rel2Predicate), 
                  CollectionLiterals.<VLSVariable>newArrayList(variables.get(j), variables.get(((j + 1) % i))));
                disjunctionList.add(rel);
              }
            }
            conjunctionList.add(this.support.unfoldOr(disjunctionList));
            disjunctionList.clear();
          }
        }
        VLSFofFormula _createVLSFofFormula_1 = this.factory.createVLSFofFormula();
        final Procedure1<VLSFofFormula> _function_5 = (VLSFofFormula it) -> {
          it.setName(this.support.toIDMultiple("containment_noCycle", Integer.toString(ind)));
          it.setFofRole("axiom");
          VLSUnaryNegation _createVLSUnaryNegation = this.factory.createVLSUnaryNegation();
          final Procedure1<VLSUnaryNegation> _function_6 = (VLSUnaryNegation it_1) -> {
            VLSExistentialQuantifier _createVLSExistentialQuantifier = this.factory.createVLSExistentialQuantifier();
            final Procedure1<VLSExistentialQuantifier> _function_7 = (VLSExistentialQuantifier it_2) -> {
              EList<VLSVariable> _variables = it_2.getVariables();
              List<VLSVariable> _duplicate = this.support.duplicate(variables);
              Iterables.<VLSVariable>addAll(_variables, _duplicate);
              it_2.setOperand(this.support.unfoldAnd(conjunctionList));
            };
            VLSExistentialQuantifier _doubleArrow_1 = ObjectExtensions.<VLSExistentialQuantifier>operator_doubleArrow(_createVLSExistentialQuantifier, _function_7);
            it_1.setOperand(_doubleArrow_1);
          };
          VLSUnaryNegation _doubleArrow_1 = ObjectExtensions.<VLSUnaryNegation>operator_doubleArrow(_createVLSUnaryNegation, _function_6);
          it.setFofFormula(_doubleArrow_1);
        };
        final VLSFofFormula contCycleForm = ObjectExtensions.<VLSFofFormula>operator_doubleArrow(_createVLSFofFormula_1, _function_5);
        EList<VLSFofFormula> _formulas_1 = trace.specification.getFormulas();
        _formulas_1.add(contCycleForm);
        conjunctionList.clear();
      }
    }
  }
  
  protected VLSTerm makeUnique(final List<VLSFunction> list) {
    final List<VLSTerm> possibleNots = CollectionLiterals.<VLSTerm>newArrayList();
    final List<VLSTerm> uniqueRels = CollectionLiterals.<VLSTerm>newArrayList();
    for (final VLSFunction t1 : list) {
      {
        for (final VLSFunction t2 : list) {
          boolean _equals = Objects.equal(t1, t2);
          if (_equals) {
            final VLSFunction fct = this.support.duplicate(t2);
            possibleNots.add(fct);
          } else {
            final VLSFunction op = this.support.duplicate(t2);
            VLSUnaryNegation _createVLSUnaryNegation = this.factory.createVLSUnaryNegation();
            final Procedure1<VLSUnaryNegation> _function = (VLSUnaryNegation it) -> {
              it.setOperand(op);
            };
            final VLSUnaryNegation negFct = ObjectExtensions.<VLSUnaryNegation>operator_doubleArrow(_createVLSUnaryNegation, _function);
            possibleNots.add(negFct);
          }
        }
        uniqueRels.add(this.support.unfoldAnd(possibleNots));
        possibleNots.clear();
      }
    }
    return this.support.unfoldOr(uniqueRels);
  }
  
  protected Object addToMap(final Map<VLSFunction, List<VLSFunction>> type2cont, final VLSFunction toFunc, final VLSFunction rel) {
    Object _xifexpression = null;
    boolean _containsKey = type2cont.containsKey(toFunc);
    boolean _not = (!_containsKey);
    if (_not) {
      _xifexpression = type2cont.put(toFunc, CollectionLiterals.<VLSFunction>newArrayList(rel));
    } else {
      boolean _xifexpression_1 = false;
      boolean _contains = type2cont.get(toFunc).contains(rel);
      boolean _not_1 = (!_contains);
      if (_not_1) {
        _xifexpression_1 = type2cont.get(toFunc).add(rel);
      }
      _xifexpression = Boolean.valueOf(_xifexpression_1);
    }
    return _xifexpression;
  }
}
