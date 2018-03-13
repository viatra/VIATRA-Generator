package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder;

import com.google.common.collect.Iterables;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.And;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Assertion;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolLiteral;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolTypeReference;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDefinition;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Exists;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Forall;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDefinition;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Iff;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Impl;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IntLiteral;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Not;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Or;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RealLiteral;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicValue;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Term;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.util.CollectionsUtil;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.VampireSolverConfiguration;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapperTrace;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_ConstantMapper;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_Support;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_TypeMapper;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSComment;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSConstant;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSEquivalent;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSFofFormula;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSImplies;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSInt;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSReal;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSTerm;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSUnaryNegation;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSVariable;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguageFactory;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireModel;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class Logic2VampireLanguageMapper {
  @Extension
  private final VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE;
  
  private final Logic2VampireLanguageMapper_Support support = new Logic2VampireLanguageMapper_Support();
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private final Logic2VampireLanguageMapper_ConstantMapper constantMapper = new Logic2VampireLanguageMapper_ConstantMapper(this);
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private final Logic2VampireLanguageMapper_TypeMapper typeMapper;
  
  public Logic2VampireLanguageMapper(final Logic2VampireLanguageMapper_TypeMapper typeMapper) {
    this.typeMapper = typeMapper;
  }
  
  public TracedOutput<VampireModel, Logic2VampireLanguageMapperTrace> transformProblem(final LogicProblem problem, final VampireSolverConfiguration configuration) {
    VLSComment _createVLSComment = this.factory.createVLSComment();
    final Procedure1<VLSComment> _function = (VLSComment it) -> {
      it.setComment("%This is an initial Test Comment \r");
    };
    final VLSComment initialComment = ObjectExtensions.<VLSComment>operator_doubleArrow(_createVLSComment, _function);
    VampireModel _createVampireModel = this.factory.createVampireModel();
    final Procedure1<VampireModel> _function_1 = (VampireModel it) -> {
      EList<VLSComment> _comments = it.getComments();
      _comments.add(initialComment);
    };
    final VampireModel specification = ObjectExtensions.<VampireModel>operator_doubleArrow(_createVampireModel, _function_1);
    Logic2VampireLanguageMapperTrace _logic2VampireLanguageMapperTrace = new Logic2VampireLanguageMapperTrace();
    final Procedure1<Logic2VampireLanguageMapperTrace> _function_2 = (Logic2VampireLanguageMapperTrace it) -> {
      it.specification = specification;
    };
    final Logic2VampireLanguageMapperTrace trace = ObjectExtensions.<Logic2VampireLanguageMapperTrace>operator_doubleArrow(_logic2VampireLanguageMapperTrace, _function_2);
    this.typeMapper.transformTypes(problem.getTypes(), problem.getElements(), this, trace);
    trace.constantDefinitions = this.collectConstantDefinitions(problem);
    final Consumer<ConstantDefinition> _function_3 = (ConstantDefinition it) -> {
      this.constantMapper.transformConstantDefinitionSpecification(it, trace);
    };
    Iterables.<ConstantDefinition>filter(problem.getConstants(), ConstantDefinition.class).forEach(_function_3);
    EList<Assertion> _assertions = problem.getAssertions();
    for (final Assertion assertion : _assertions) {
      this.transformAssertion(assertion, trace);
    }
    return new TracedOutput<VampireModel, Logic2VampireLanguageMapperTrace>(specification, trace);
  }
  
  protected VLSTerm _transformTypeReference(final BoolTypeReference boolTypeReference, final Logic2VampireLanguageMapperTrace trace) {
    return null;
  }
  
  private HashMap<ConstantDeclaration, ConstantDefinition> collectConstantDefinitions(final LogicProblem problem) {
    final HashMap<ConstantDeclaration, ConstantDefinition> res = new HashMap<ConstantDeclaration, ConstantDefinition>();
    final Function1<ConstantDefinition, Boolean> _function = (ConstantDefinition it) -> {
      ConstantDeclaration _defines = it.getDefines();
      return Boolean.valueOf((_defines != null));
    };
    final Consumer<ConstantDefinition> _function_1 = (ConstantDefinition it) -> {
      res.put(it.getDefines(), it);
    };
    IterableExtensions.<ConstantDefinition>filter(Iterables.<ConstantDefinition>filter(problem.getConstants(), ConstantDefinition.class), _function).forEach(_function_1);
    return res;
  }
  
  protected boolean transformAssertion(final Assertion assertion, final Logic2VampireLanguageMapperTrace trace) {
    boolean _xblockexpression = false;
    {
      VLSFofFormula _createVLSFofFormula = this.factory.createVLSFofFormula();
      final Procedure1<VLSFofFormula> _function = (VLSFofFormula it) -> {
        it.setName(this.support.toID(assertion.getName()));
        it.setFofRole("axiom");
        it.setFofFormula(this.transformTerm(assertion.getValue(), trace, Collections.EMPTY_MAP));
      };
      final VLSFofFormula res = ObjectExtensions.<VLSFofFormula>operator_doubleArrow(_createVLSFofFormula, _function);
      EList<VLSFofFormula> _formulas = trace.specification.getFormulas();
      _xblockexpression = _formulas.add(res);
    }
    return _xblockexpression;
  }
  
  protected VLSTerm _transformTerm(final BoolLiteral literal, final Logic2VampireLanguageMapperTrace trace, final Map<Variable, VLSVariable> variables) {
    VLSTerm _xifexpression = null;
    boolean _isValue = literal.isValue();
    boolean _equals = (_isValue == true);
    if (_equals) {
      _xifexpression = this.factory.createVLSTrue();
    } else {
      _xifexpression = this.factory.createVLSFalse();
    }
    return _xifexpression;
  }
  
  protected VLSTerm _transformTerm(final IntLiteral literal, final Logic2VampireLanguageMapperTrace trace, final Map<Variable, VLSVariable> variables) {
    VLSInt _createVLSInt = this.factory.createVLSInt();
    final Procedure1<VLSInt> _function = (VLSInt it) -> {
      it.setValue(Integer.valueOf(literal.getValue()).toString());
    };
    return ObjectExtensions.<VLSInt>operator_doubleArrow(_createVLSInt, _function);
  }
  
  protected VLSTerm _transformTerm(final RealLiteral literal, final Logic2VampireLanguageMapperTrace trace, final Map<Variable, VLSVariable> variables) {
    VLSReal _createVLSReal = this.factory.createVLSReal();
    final Procedure1<VLSReal> _function = (VLSReal it) -> {
      it.setValue(literal.getValue().toString());
    };
    return ObjectExtensions.<VLSReal>operator_doubleArrow(_createVLSReal, _function);
  }
  
  protected VLSTerm _transformTerm(final Not not, final Logic2VampireLanguageMapperTrace trace, final Map<Variable, VLSVariable> variables) {
    VLSUnaryNegation _createVLSUnaryNegation = this.factory.createVLSUnaryNegation();
    final Procedure1<VLSUnaryNegation> _function = (VLSUnaryNegation it) -> {
      it.setOperand(this.transformTerm(not.getOperand(), trace, variables));
    };
    return ObjectExtensions.<VLSUnaryNegation>operator_doubleArrow(_createVLSUnaryNegation, _function);
  }
  
  protected VLSTerm _transformTerm(final And and, final Logic2VampireLanguageMapperTrace trace, final Map<Variable, VLSVariable> variables) {
    final Function1<Term, VLSTerm> _function = (Term it) -> {
      return this.transformTerm(it, trace, variables);
    };
    return this.support.unfoldAnd(ListExtensions.<Term, VLSTerm>map(and.getOperands(), _function));
  }
  
  protected VLSTerm _transformTerm(final Or or, final Logic2VampireLanguageMapperTrace trace, final Map<Variable, VLSVariable> variables) {
    final Function1<Term, VLSTerm> _function = (Term it) -> {
      return this.transformTerm(it, trace, variables);
    };
    return this.support.unfoldOr(ListExtensions.<Term, VLSTerm>map(or.getOperands(), _function), trace);
  }
  
  protected VLSTerm _transformTerm(final Impl impl, final Logic2VampireLanguageMapperTrace trace, final Map<Variable, VLSVariable> variables) {
    VLSImplies _createVLSImplies = this.factory.createVLSImplies();
    final Procedure1<VLSImplies> _function = (VLSImplies it) -> {
      it.setLeft(this.transformTerm(impl.getLeftOperand(), trace, variables));
      it.setRight(this.transformTerm(impl.getRightOperand(), trace, variables));
    };
    return ObjectExtensions.<VLSImplies>operator_doubleArrow(_createVLSImplies, _function);
  }
  
  protected VLSTerm _transformTerm(final Iff iff, final Logic2VampireLanguageMapperTrace trace, final Map<Variable, VLSVariable> variables) {
    VLSEquivalent _createVLSEquivalent = this.factory.createVLSEquivalent();
    final Procedure1<VLSEquivalent> _function = (VLSEquivalent it) -> {
      it.setLeft(this.transformTerm(iff.getLeftOperand(), trace, variables));
      it.setRight(this.transformTerm(iff.getRightOperand(), trace, variables));
    };
    return ObjectExtensions.<VLSEquivalent>operator_doubleArrow(_createVLSEquivalent, _function);
  }
  
  protected VLSTerm _transformTerm(final Forall forall, final Logic2VampireLanguageMapperTrace trace, final Map<Variable, VLSVariable> variables) {
    return this.support.createUniversallQuantifiedExpression(this, forall, trace, variables);
  }
  
  protected VLSTerm _transformTerm(final Exists exists, final Logic2VampireLanguageMapperTrace trace, final Map<Variable, VLSVariable> variables) {
    return this.support.createExistentiallyQuantifiedExpression(this, exists, trace, variables);
  }
  
  protected VLSTerm _transformTerm(final SymbolicValue symbolicValue, final Logic2VampireLanguageMapperTrace trace, final Map<Variable, VLSVariable> variables) {
    return this.transformSymbolicReference(symbolicValue.getSymbolicReference(), symbolicValue.getParameterSubstitutions(), trace, variables);
  }
  
  protected VLSTerm _transformSymbolicReference(final DefinedElement referred, final List<Term> parameterSubstitutions, final Logic2VampireLanguageMapperTrace trace, final Map<Variable, VLSVariable> variables) {
    return null;
  }
  
  protected VLSTerm _transformSymbolicReference(final ConstantDeclaration constant, final List<Term> parameterSubstitutions, final Logic2VampireLanguageMapperTrace trace, final Map<Variable, VLSVariable> variables) {
    VLSConstant _createVLSConstant = this.factory.createVLSConstant();
    final Procedure1<VLSConstant> _function = (VLSConstant it) -> {
      it.setName(this.support.toID(constant.getName()));
    };
    final VLSConstant res = ObjectExtensions.<VLSConstant>operator_doubleArrow(_createVLSConstant, _function);
    return res;
  }
  
  protected VLSTerm _transformSymbolicReference(final ConstantDefinition constant, final List<Term> parameterSubstitutions, final Logic2VampireLanguageMapperTrace trace, final Map<Variable, VLSVariable> variables) {
    return null;
  }
  
  protected VLSTerm _transformSymbolicReference(final Variable variable, final List<Term> parameterSubstitutions, final Logic2VampireLanguageMapperTrace trace, final Map<Variable, VLSVariable> variables) {
    final VLSVariable res = CollectionsUtil.<Variable, VLSVariable>lookup(variable, variables);
    return res;
  }
  
  protected VLSTerm _transformSymbolicReference(final FunctionDeclaration function, final List<Term> parameterSubstitutions, final Logic2VampireLanguageMapperTrace trace, final Map<Variable, VLSVariable> variables) {
    return null;
  }
  
  protected VLSTerm _transformSymbolicReference(final FunctionDefinition function, final List<Term> parameterSubstitutions, final Logic2VampireLanguageMapperTrace trace, final Map<Variable, VLSVariable> variables) {
    return null;
  }
  
  protected VLSTerm transformTypeReference(final BoolTypeReference boolTypeReference, final Logic2VampireLanguageMapperTrace trace) {
    return _transformTypeReference(boolTypeReference, trace);
  }
  
  protected VLSTerm transformTerm(final Term and, final Logic2VampireLanguageMapperTrace trace, final Map<Variable, VLSVariable> variables) {
    if (and instanceof And) {
      return _transformTerm((And)and, trace, variables);
    } else if (and instanceof BoolLiteral) {
      return _transformTerm((BoolLiteral)and, trace, variables);
    } else if (and instanceof Exists) {
      return _transformTerm((Exists)and, trace, variables);
    } else if (and instanceof Forall) {
      return _transformTerm((Forall)and, trace, variables);
    } else if (and instanceof Iff) {
      return _transformTerm((Iff)and, trace, variables);
    } else if (and instanceof Impl) {
      return _transformTerm((Impl)and, trace, variables);
    } else if (and instanceof IntLiteral) {
      return _transformTerm((IntLiteral)and, trace, variables);
    } else if (and instanceof Not) {
      return _transformTerm((Not)and, trace, variables);
    } else if (and instanceof Or) {
      return _transformTerm((Or)and, trace, variables);
    } else if (and instanceof RealLiteral) {
      return _transformTerm((RealLiteral)and, trace, variables);
    } else if (and instanceof SymbolicValue) {
      return _transformTerm((SymbolicValue)and, trace, variables);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(and, trace, variables).toString());
    }
  }
  
  protected VLSTerm transformSymbolicReference(final SymbolicDeclaration constant, final List<Term> parameterSubstitutions, final Logic2VampireLanguageMapperTrace trace, final Map<Variable, VLSVariable> variables) {
    if (constant instanceof ConstantDeclaration) {
      return _transformSymbolicReference((ConstantDeclaration)constant, parameterSubstitutions, trace, variables);
    } else if (constant instanceof ConstantDefinition) {
      return _transformSymbolicReference((ConstantDefinition)constant, parameterSubstitutions, trace, variables);
    } else if (constant instanceof FunctionDeclaration) {
      return _transformSymbolicReference((FunctionDeclaration)constant, parameterSubstitutions, trace, variables);
    } else if (constant instanceof FunctionDefinition) {
      return _transformSymbolicReference((FunctionDefinition)constant, parameterSubstitutions, trace, variables);
    } else if (constant instanceof DefinedElement) {
      return _transformSymbolicReference((DefinedElement)constant, parameterSubstitutions, trace, variables);
    } else if (constant instanceof Variable) {
      return _transformSymbolicReference((Variable)constant, parameterSubstitutions, trace, variables);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(constant, parameterSubstitutions, trace, variables).toString());
    }
  }
  
  @Pure
  public Logic2VampireLanguageMapper_ConstantMapper getConstantMapper() {
    return this.constantMapper;
  }
  
  @Pure
  public Logic2VampireLanguageMapper_TypeMapper getTypeMapper() {
    return this.typeMapper;
  }
}
