package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder;

import com.google.common.collect.Iterables;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Assertion;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolLiteral;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolTypeReference;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDefinition;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.VampireSolverConfiguration;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapperTrace;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_ConstantMapper;
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder.Logic2VampireLanguageMapper_Support;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSComment;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSTerm;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguageFactory;
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireModel;
import java.util.HashMap;
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
      it.setComment("%This is an initial Test Comment");
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
      + "\nType mismatch: cannot convert from Term to BoolLiteral");
  }
  
  protected VLSTerm _transformTerm(final BoolLiteral literal, final Logic2VampireLanguageMapperTrace trace, final Map variables) {
    return null;
  }
  
  protected VLSTerm _transformTypeReference(final BoolTypeReference boolTypeReference, final Logic2VampireLanguageMapperTrace trace) {
    return null;
  }
  
  protected VLSTerm transformTerm(final BoolLiteral literal, final Logic2VampireLanguageMapperTrace trace, final Map variables) {
    return _transformTerm(literal, trace, variables);
  }
  
  protected VLSTerm transformTypeReference(final BoolTypeReference boolTypeReference, final Logic2VampireLanguageMapperTrace trace) {
    return _transformTypeReference(boolTypeReference, trace);
  }
  
  @Pure
  public Logic2VampireLanguageMapper_ConstantMapper getConstantMapper() {
    return this.constantMapper;
  }
}
