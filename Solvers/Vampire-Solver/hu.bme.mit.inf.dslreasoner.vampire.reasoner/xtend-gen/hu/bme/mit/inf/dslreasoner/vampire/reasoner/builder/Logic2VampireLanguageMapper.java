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
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSComment;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSConstant;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSInt;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSReal;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSTerm;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguageFactory;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireModel;
import java.util.Arrays;
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
  
  public Logic2VampireLanguageMapper() {
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
    trace.constantDefinitions = this.collectConstantDefinitions(problem);
    final Consumer<ConstantDefinition> _function_3 = (ConstantDefinition it) -> {
      this.constantMapper.transformConstant(it, trace);
    };
    Iterables.<ConstantDefinition>filter(problem.getConstants(), ConstantDefinition.class).forEach(_function_3);
    final Consumer<ConstantDefinition> _function_4 = (ConstantDefinition it) -> {
      this.constantMapper.transformConstantDefinitionSpecification(it, trace);
    };
    Iterables.<ConstantDefinition>filter(problem.getConstants(), ConstantDefinition.class).forEach(_function_4);
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
    throw new Error("Unresolved compilation problems:"
      + "\nThe method transformTerm(Term, Logic2VampireLanguageMapperTrace, Map<Variable, VLSVariable>) from the type Logic2VampireLanguageMapper refers to the missing type VLSVariable");
  }
  
  protected VLSTerm _transformTerm(final BoolLiteral literal, final Logic2VampireLanguageMapperTrace trace, final /* Map<Variable, VLSVariable> */Object variables) {
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
  
  protected VLSTerm _transformTerm(final IntLiteral literal, final Logic2VampireLanguageMapperTrace trace, final /* Map<Variable, VLSVariable> */Object variables) {
    VLSInt _createVLSInt = this.factory.createVLSInt();
    final Procedure1<VLSInt> _function = (VLSInt it) -> {
      it.setValue(Integer.valueOf(literal.getValue()).toString());
    };
    return ObjectExtensions.<VLSInt>operator_doubleArrow(_createVLSInt, _function);
  }
  
  protected VLSTerm _transformTerm(final RealLiteral literal, final Logic2VampireLanguageMapperTrace trace, final /* Map<Variable, VLSVariable> */Object variables) {
    VLSReal _createVLSReal = this.factory.createVLSReal();
    final Procedure1<VLSReal> _function = (VLSReal it) -> {
      it.setValue(literal.getValue().toString());
    };
    return ObjectExtensions.<VLSReal>operator_doubleArrow(_createVLSReal, _function);
  }
  
  protected VLSTerm _transformTerm(final Not not, final Logic2VampireLanguageMapperTrace trace, final /* Map<Variable, VLSVariable> */Object variables) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method transformTerm(Term, Logic2VampireLanguageMapperTrace, Map<Variable, VLSVariable>) from the type Logic2VampireLanguageMapper refers to the missing type VLSVariable");
  }
  
  protected VLSTerm _transformTerm(final And and, final Logic2VampireLanguageMapperTrace trace, final /* Map<Variable, VLSVariable> */Object variables) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method transformTerm(Term, Logic2VampireLanguageMapperTrace, Map<Variable, VLSVariable>) from the type Logic2VampireLanguageMapper refers to the missing type VLSVariable");
  }
  
  protected VLSTerm _transformTerm(final Or or, final Logic2VampireLanguageMapperTrace trace, final /* Map<Variable, VLSVariable> */Object variables) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method transformTerm(Term, Logic2VampireLanguageMapperTrace, Map<Variable, VLSVariable>) from the type Logic2VampireLanguageMapper refers to the missing type VLSVariable");
  }
  
  protected VLSTerm _transformTerm(final Impl impl, final Logic2VampireLanguageMapperTrace trace, final /* Map<Variable, VLSVariable> */Object variables) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method transformTerm(Term, Logic2VampireLanguageMapperTrace, Map<Variable, VLSVariable>) from the type Logic2VampireLanguageMapper refers to the missing type VLSVariable"
      + "\nThe method transformTerm(Term, Logic2VampireLanguageMapperTrace, Map<Variable, VLSVariable>) from the type Logic2VampireLanguageMapper refers to the missing type VLSVariable");
  }
  
  protected VLSTerm _transformTerm(final Iff iff, final Logic2VampireLanguageMapperTrace trace, final /* Map<Variable, VLSVariable> */Object variables) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method transformTerm(Term, Logic2VampireLanguageMapperTrace, Map<Variable, VLSVariable>) from the type Logic2VampireLanguageMapper refers to the missing type VLSVariable"
      + "\nThe method transformTerm(Term, Logic2VampireLanguageMapperTrace, Map<Variable, VLSVariable>) from the type Logic2VampireLanguageMapper refers to the missing type VLSVariable");
  }
  
  protected VLSTerm _transformTerm(final Forall forall, final Logic2VampireLanguageMapperTrace trace, final /* Map<Variable, VLSVariable> */Object variables) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createUniversallQuantifiedExpression(Logic2VampireLanguageMapper, QuantifiedExpression, Logic2VampireLanguageMapperTrace, Map<Variable, VLSVariable>) from the type Logic2VampireLanguageMapper_Support refers to the missing type VLSVariable");
  }
  
  protected VLSTerm _transformTerm(final Exists exists, final Logic2VampireLanguageMapperTrace trace, final /* Map<Variable, VLSVariable> */Object variables) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createExistentiallyQuantifiedExpression(Logic2VampireLanguageMapper, QuantifiedExpression, Logic2VampireLanguageMapperTrace, Map<Variable, VLSVariable>) from the type Logic2VampireLanguageMapper_Support refers to the missing type VLSVariable");
  }
  
  protected VLSTerm _transformTerm(final SymbolicValue symbolicValue, final Logic2VampireLanguageMapperTrace trace, final /* Map<Variable, VLSVariable> */Object variables) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method transformSymbolicReference(SymbolicDeclaration, List<Term>, Logic2VampireLanguageMapperTrace, Map<Variable, VLSVariable>) from the type Logic2VampireLanguageMapper refers to the missing type VLSVariable");
  }
  
  protected VLSTerm _transformSymbolicReference(final DefinedElement referred, final List<Term> parameterSubstitutions, final Logic2VampireLanguageMapperTrace trace, final /* Map<Variable, VLSVariable> */Object variables) {
    return null;
  }
  
  protected VLSTerm _transformSymbolicReference(final ConstantDeclaration constant, final List<Term> parameterSubstitutions, final Logic2VampireLanguageMapperTrace trace, final /* Map<Variable, VLSVariable> */Object variables) {
    VLSConstant _createVLSConstant = this.factory.createVLSConstant();
    final Procedure1<VLSConstant> _function = (VLSConstant it) -> {
      it.setName(this.support.toID(constant.getName()));
    };
    final VLSConstant res = ObjectExtensions.<VLSConstant>operator_doubleArrow(_createVLSConstant, _function);
    return res;
  }
  
  protected VLSTerm _transformSymbolicReference(final ConstantDefinition constant, final List<Term> parameterSubstitutions, final Logic2VampireLanguageMapperTrace trace, final /* Map<Variable, VLSVariable> */Object variables) {
    return null;
  }
  
  protected VLSTerm _transformSymbolicReference(final Variable variable, final List<Term> parameterSubstitutions, final Logic2VampireLanguageMapperTrace trace, final /* Map<Variable, VLSVariable> */Object variables) {
    final VLSVariable res = CollectionsUtil.<Variable, VLSVariable>lookup(variable, variables);
    return res;
  }
  
  protected VLSTerm _transformSymbolicReference(final FunctionDeclaration function, final List<Term> parameterSubstitutions, final Logic2VampireLanguageMapperTrace trace, final /* Map<Variable, VLSVariable> */Object variables) {
    return null;
  }
  
  protected VLSTerm _transformSymbolicReference(final FunctionDefinition function, final List<Term> parameterSubstitutions, final Logic2VampireLanguageMapperTrace trace, final /* Map<Variable, VLSVariable> */Object variables) {
    return null;
  }
  
  protected VLSTerm transformTypeReference(final BoolTypeReference boolTypeReference, final Logic2VampireLanguageMapperTrace trace) {
    return _transformTypeReference(boolTypeReference, trace);
  }
  
  protected VLSTerm transformTerm(final Term and, final Logic2VampireLanguageMapperTrace trace, final /* Map<Variable, VLSVariable> */Object variables) {
    if (and instanceof And
         && variables != null) {
      return _transformTerm((And)and, trace, variables);
    } else if (and instanceof BoolLiteral
         && variables != null) {
      return _transformTerm((BoolLiteral)and, trace, variables);
    } else if (and instanceof Exists
         && variables != null) {
      return _transformTerm((Exists)and, trace, variables);
    } else if (and instanceof Forall
         && variables != null) {
      return _transformTerm((Forall)and, trace, variables);
    } else if (and instanceof Iff
         && variables != null) {
      return _transformTerm((Iff)and, trace, variables);
    } else if (and instanceof Impl
         && variables != null) {
      return _transformTerm((Impl)and, trace, variables);
    } else if (and instanceof IntLiteral
         && variables != null) {
      return _transformTerm((IntLiteral)and, trace, variables);
    } else if (and instanceof Not
         && variables != null) {
      return _transformTerm((Not)and, trace, variables);
    } else if (and instanceof Or
         && variables != null) {
      return _transformTerm((Or)and, trace, variables);
    } else if (and instanceof RealLiteral
         && variables != null) {
      return _transformTerm((RealLiteral)and, trace, variables);
    } else if (and instanceof SymbolicValue
         && variables != null) {
      return _transformTerm((SymbolicValue)and, trace, variables);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(and, trace, variables).toString());
    }
  }
  
  protected VLSTerm transformSymbolicReference(final SymbolicDeclaration constant, final List<Term> parameterSubstitutions, final Logic2VampireLanguageMapperTrace trace, final /* Map<Variable, VLSVariable> */Object variables) {
    if (constant instanceof ConstantDeclaration
         && variables != null) {
      return _transformSymbolicReference((ConstantDeclaration)constant, parameterSubstitutions, trace, variables);
    } else if (constant instanceof ConstantDefinition
         && variables != null) {
      return _transformSymbolicReference((ConstantDefinition)constant, parameterSubstitutions, trace, variables);
    } else if (constant instanceof FunctionDeclaration
         && variables != null) {
      return _transformSymbolicReference((FunctionDeclaration)constant, parameterSubstitutions, trace, variables);
    } else if (constant instanceof FunctionDefinition
         && variables != null) {
      return _transformSymbolicReference((FunctionDefinition)constant, parameterSubstitutions, trace, variables);
    } else if (constant instanceof DefinedElement
         && variables != null) {
      return _transformSymbolicReference((DefinedElement)constant, parameterSubstitutions, trace, variables);
    } else if (constant instanceof Variable
         && variables != null) {
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
}
