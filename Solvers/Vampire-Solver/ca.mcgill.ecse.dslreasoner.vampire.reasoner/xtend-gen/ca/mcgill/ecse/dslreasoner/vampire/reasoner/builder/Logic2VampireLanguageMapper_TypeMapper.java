package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder;

import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapperTrace;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_Support;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSConstant;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSDoubleQuote;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSEquivalent;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFofFormula;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFunction;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFunctionAsTerm;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTerm;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSUnaryNegation;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSUniversalQuantifier;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSVariable;
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguageFactory;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage;
import hu.bme.mit.inf.dslreasoner.util.CollectionsUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Logic2VampireLanguageMapper_TypeMapper {
  @Extension
  private final VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE;
  
  private final Logic2VampireLanguageMapper_Support support = new Logic2VampireLanguageMapper_Support();
  
  private final Logic2VampireLanguageMapper base;
  
  public Logic2VampireLanguageMapper_TypeMapper(final Logic2VampireLanguageMapper base) {
    LogicproblemPackage.eINSTANCE.getClass();
    this.base = base;
  }
  
  protected boolean transformTypes(final Collection<Type> types, final Collection<DefinedElement> elements, final Logic2VampireLanguageMapper mapper, final Logic2VampireLanguageMapperTrace trace) {
    boolean _xblockexpression = false;
    {
      VLSVariable _createVLSVariable = this.factory.createVLSVariable();
      final Procedure1<VLSVariable> _function = (VLSVariable it) -> {
        it.setName("A");
      };
      final VLSVariable variable = ObjectExtensions.<VLSVariable>operator_doubleArrow(_createVLSVariable, _function);
      for (final Type type : types) {
        {
          VLSFunction _createVLSFunction = this.factory.createVLSFunction();
          final Procedure1<VLSFunction> _function_1 = (VLSFunction it) -> {
            it.setConstant(this.support.toIDMultiple("t", type.getName().split(" ")[0]));
            EList<VLSTerm> _terms = it.getTerms();
            VLSVariable _duplicate = this.support.duplicate(variable);
            _terms.add(_duplicate);
          };
          final VLSFunction typePred = ObjectExtensions.<VLSFunction>operator_doubleArrow(_createVLSFunction, _function_1);
          trace.type2Predicate.put(type, typePred);
        }
      }
      Iterable<TypeDefinition> _filter = Iterables.<TypeDefinition>filter(types, TypeDefinition.class);
      for (final TypeDefinition type_1 : _filter) {
        {
          final List<VLSFunction> orElems = CollectionLiterals.<VLSFunction>newArrayList();
          EList<DefinedElement> _elements = type_1.getElements();
          for (final DefinedElement e : _elements) {
            {
              VLSFunction _createVLSFunction = this.factory.createVLSFunction();
              final Procedure1<VLSFunction> _function_1 = (VLSFunction it) -> {
                it.setConstant(this.support.toIDMultiple("e", e.getName().split(" ")[0], e.getName().split(" ")[2]));
                EList<VLSTerm> _terms = it.getTerms();
                VLSVariable _duplicate = this.support.duplicate(variable);
                _terms.add(_duplicate);
              };
              final VLSFunction enumElemPred = ObjectExtensions.<VLSFunction>operator_doubleArrow(_createVLSFunction, _function_1);
              trace.element2Predicate.put(e, enumElemPred);
              orElems.add(enumElemPred);
            }
          }
          VLSFofFormula _createVLSFofFormula = this.factory.createVLSFofFormula();
          final Procedure1<VLSFofFormula> _function_1 = (VLSFofFormula it) -> {
            it.setName(this.support.toIDMultiple("typeDef", type_1.getName().split(" ")[0]));
            it.setFofRole("axiom");
            VLSUniversalQuantifier _createVLSUniversalQuantifier = this.factory.createVLSUniversalQuantifier();
            final Procedure1<VLSUniversalQuantifier> _function_2 = (VLSUniversalQuantifier it_1) -> {
              EList<VLSVariable> _variables = it_1.getVariables();
              VLSVariable _duplicate = this.support.duplicate(variable);
              _variables.add(_duplicate);
              VLSEquivalent _createVLSEquivalent = this.factory.createVLSEquivalent();
              final Procedure1<VLSEquivalent> _function_3 = (VLSEquivalent it_2) -> {
                it_2.setLeft(CollectionsUtil.<TypeDefinition, VLSFunction>lookup(type_1, trace.type2Predicate));
                it_2.setRight(this.support.unfoldOr(orElems));
              };
              VLSEquivalent _doubleArrow = ObjectExtensions.<VLSEquivalent>operator_doubleArrow(_createVLSEquivalent, _function_3);
              it_1.setOperand(_doubleArrow);
            };
            VLSUniversalQuantifier _doubleArrow = ObjectExtensions.<VLSUniversalQuantifier>operator_doubleArrow(_createVLSUniversalQuantifier, _function_2);
            it.setFofFormula(_doubleArrow);
          };
          final VLSFofFormula res = ObjectExtensions.<VLSFofFormula>operator_doubleArrow(_createVLSFofFormula, _function_1);
          EList<VLSFofFormula> _formulas = trace.specification.getFormulas();
          _formulas.add(res);
          final List<VLSFunction> enumScopeElems = CollectionLiterals.<VLSFunction>newArrayList();
          for (int i = 0; (i < ((Object[])Conversions.unwrapArray(type_1.getElements(), Object.class)).length); i++) {
            {
              final int num = (i + 1);
              VLSFunctionAsTerm _createVLSFunctionAsTerm = this.factory.createVLSFunctionAsTerm();
              final Procedure1<VLSFunctionAsTerm> _function_2 = (VLSFunctionAsTerm it) -> {
                it.setFunctor(("eo" + Integer.valueOf(num)));
              };
              final VLSFunctionAsTerm cstTerm = ObjectExtensions.<VLSFunctionAsTerm>operator_doubleArrow(_createVLSFunctionAsTerm, _function_2);
              final VLSConstant cst = this.support.toConstant(cstTerm);
              trace.uniqueInstances.add(cst);
              final VLSFunction fct = this.support.duplicate(CollectionsUtil.<DefinedElement, VLSFunction>lookup(type_1.getElements().get(i), trace.element2Predicate), cstTerm);
              enumScopeElems.add(fct);
            }
          }
          VLSFofFormula _createVLSFofFormula_1 = this.factory.createVLSFofFormula();
          final Procedure1<VLSFofFormula> _function_2 = (VLSFofFormula it) -> {
            it.setName(this.support.toIDMultiple("enumScope", type_1.getName().split(" ")[0]));
            it.setFofRole("axiom");
            it.setFofFormula(this.support.unfoldAnd(enumScopeElems));
          };
          final VLSFofFormula enumScope = ObjectExtensions.<VLSFofFormula>operator_doubleArrow(_createVLSFofFormula_1, _function_2);
          EList<VLSFofFormula> _formulas_1 = trace.specification.getFormulas();
          _formulas_1.add(enumScope);
        }
      }
      final Function1<Type, Boolean> _function_1 = (Type it) -> {
        boolean _isIsAbstract = it.isIsAbstract();
        return Boolean.valueOf((!_isIsAbstract));
      };
      Iterable<TypeDeclaration> _filter_1 = Iterables.<TypeDeclaration>filter(IterableExtensions.<Type>filter(types, _function_1), TypeDeclaration.class);
      for (final TypeDeclaration t1 : _filter_1) {
        {
          for (final Type t2 : types) {
            if ((Objects.equal(t1, t2) || this.support.dfsSupertypeCheck(t1, t2))) {
              trace.type2PossibleNot.put(t2, this.support.duplicate(CollectionsUtil.<Type, VLSFunction>lookup(t2, trace.type2Predicate)));
            } else {
              VLSUnaryNegation _createVLSUnaryNegation = this.factory.createVLSUnaryNegation();
              final Procedure1<VLSUnaryNegation> _function_2 = (VLSUnaryNegation it) -> {
                it.setOperand(this.support.duplicate(CollectionsUtil.<Type, VLSFunction>lookup(t2, trace.type2Predicate)));
              };
              VLSUnaryNegation _doubleArrow = ObjectExtensions.<VLSUnaryNegation>operator_doubleArrow(_createVLSUnaryNegation, _function_2);
              trace.type2PossibleNot.put(t2, _doubleArrow);
            }
          }
          Collection<VLSTerm> _values = trace.type2PossibleNot.values();
          ArrayList<VLSTerm> _arrayList = new ArrayList<VLSTerm>(_values);
          trace.type2And.put(t1, this.support.unfoldAnd(_arrayList));
          trace.type2PossibleNot.clear();
        }
      }
      VLSFofFormula _createVLSFofFormula = this.factory.createVLSFofFormula();
      final Procedure1<VLSFofFormula> _function_2 = (VLSFofFormula it) -> {
        it.setName("hierarchyHandler");
        it.setFofRole("axiom");
        VLSUniversalQuantifier _createVLSUniversalQuantifier = this.factory.createVLSUniversalQuantifier();
        final Procedure1<VLSUniversalQuantifier> _function_3 = (VLSUniversalQuantifier it_1) -> {
          EList<VLSVariable> _variables = it_1.getVariables();
          VLSVariable _duplicate = this.support.duplicate(variable);
          _variables.add(_duplicate);
          VLSEquivalent _createVLSEquivalent = this.factory.createVLSEquivalent();
          final Procedure1<VLSEquivalent> _function_4 = (VLSEquivalent it_2) -> {
            it_2.setLeft(this.support.topLevelTypeFunc());
            Collection<VLSTerm> _values = trace.type2And.values();
            final ArrayList<VLSTerm> reversedList = new ArrayList<VLSTerm>(_values);
            it_2.setRight(this.support.unfoldOr(reversedList));
          };
          VLSEquivalent _doubleArrow = ObjectExtensions.<VLSEquivalent>operator_doubleArrow(_createVLSEquivalent, _function_4);
          it_1.setOperand(_doubleArrow);
        };
        VLSUniversalQuantifier _doubleArrow = ObjectExtensions.<VLSUniversalQuantifier>operator_doubleArrow(_createVLSUniversalQuantifier, _function_3);
        it.setFofFormula(_doubleArrow);
      };
      final VLSFofFormula hierarch = ObjectExtensions.<VLSFofFormula>operator_doubleArrow(_createVLSFofFormula, _function_2);
      EList<VLSFofFormula> _formulas = trace.specification.getFormulas();
      _xblockexpression = _formulas.add(hierarch);
    }
    return _xblockexpression;
  }
  
  protected void transformTypeReference(final Type referred, final Logic2VampireLanguageMapper mapper, final Logic2VampireLanguageMapperTrace trace) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  protected void getUndefinedSupertype(final Logic2VampireLanguageMapperTrace trace) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  protected void getUndefinedSupertypeScope(final int undefinedScope, final Logic2VampireLanguageMapperTrace trace) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  protected VLSDoubleQuote transformReference(final DefinedElement referred, final Logic2VampireLanguageMapperTrace trace) {
    VLSDoubleQuote _createVLSDoubleQuote = this.factory.createVLSDoubleQuote();
    final Procedure1<VLSDoubleQuote> _function = (VLSDoubleQuote it) -> {
      String _name = referred.getName();
      String _plus = ("\"a" + _name);
      String _plus_1 = (_plus + "\"");
      it.setValue(_plus_1);
    };
    return ObjectExtensions.<VLSDoubleQuote>operator_doubleArrow(_createVLSDoubleQuote, _function);
  }
  
  protected void getTypeInterpreter() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
