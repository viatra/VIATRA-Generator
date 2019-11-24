package ca.mcgill.ecse.dslreasoner.vampire.test;

import ca.mcgill.ecse.dslreasoner.VampireLanguageStandaloneSetup;
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicProblemBuilder;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasoner;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.VariableContext;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.And;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Assertion;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Distinct;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Exists;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Iff;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Not;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Or;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicValue;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TermDescription;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult;
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasoner;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.ViatraReasonerConfiguration;
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class VampireTest {
  @Extension
  private final static LogicProblemBuilder builder = new LogicProblemBuilder();
  
  public static void main(final String[] args) {
    try {
      LogicproblemPackage.eINSTANCE.eClass();
      Ecore2logicannotationsPackage.eINSTANCE.eClass();
      Viatra2LogicAnnotationsPackage.eINSTANCE.eClass();
      final Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
      final Map<String, Object> map = reg.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      map.put("logicproblem", _xMIResourceFactoryImpl);
      VampireLanguageStandaloneSetup.doSetup();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("output/VampireTest");
      final FileSystemWorkspace workspace = new FileSystemWorkspace(_builder.toString(), "");
      workspace.initAndClear();
      final String filename = "problem.logicproblem";
      LogicProblem problem = VampireTest.builder.createProblem();
      VampireTest.rockPaperScisors(problem);
      workspace.writeModel(problem, filename);
      InputOutput.<String>println("Problem Created");
      LogicResult solution = null;
      LogicReasoner reasoner = null;
      ViatraReasoner _viatraReasoner = new ViatraReasoner();
      reasoner = _viatraReasoner;
      ViatraReasonerConfiguration _viatraReasonerConfiguration = new ViatraReasonerConfiguration();
      final Procedure1<ViatraReasonerConfiguration> _function = (ViatraReasonerConfiguration it) -> {
        it.documentationLevel = DocumentationLevel.FULL;
        it.typeScopes.minNewElements = 4;
      };
      final ViatraReasonerConfiguration vampireConfig = ObjectExtensions.<ViatraReasonerConfiguration>operator_doubleArrow(_viatraReasonerConfiguration, _function);
      solution = reasoner.solve(problem, vampireConfig, workspace);
      InputOutput.<String>println("Problem Solved");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String name() {
    return this.getClass().getSimpleName();
  }
  
  public static Assertion deMorgan(final LogicProblem problem) {
    Assertion _xblockexpression = null;
    {
      ConstantDeclaration X = VampireTest.builder.ConstantDeclaration(VampireTest.builder.LogicBool());
      ConstantDeclaration Y = VampireTest.builder.ConstantDeclaration(VampireTest.builder.LogicBool());
      VampireTest.builder.add(problem, X);
      VampireTest.builder.add(problem, Y);
      And _and = VampireTest.builder.operator_and(X, Y);
      Not _not = VampireTest.builder.operator_not(_and);
      Not _not_1 = VampireTest.builder.operator_not(X);
      Not _not_2 = VampireTest.builder.operator_not(Y);
      Or _or = VampireTest.builder.operator_or(_not_1, _not_2);
      Iff _spaceship = VampireTest.builder.operator_spaceship(_not, _or);
      _xblockexpression = VampireTest.builder.add(problem, VampireTest.builder.Assertion(_spaceship));
    }
    return _xblockexpression;
  }
  
  public static Assertion rockPaperScisors(final LogicProblem problem) {
    Assertion _xblockexpression = null;
    {
      final DefinedElement rock = VampireTest.builder.Element("Rock");
      final DefinedElement paper = VampireTest.builder.Element("Paper");
      final DefinedElement scissor = VampireTest.builder.Element("Scissor");
      EList<DefinedElement> _elements = problem.getElements();
      _elements.add(rock);
      EList<DefinedElement> _elements_1 = problem.getElements();
      _elements_1.add(paper);
      EList<DefinedElement> _elements_2 = problem.getElements();
      _elements_2.add(scissor);
      final Type oldRPS = VampireTest.builder.add(problem, VampireTest.builder.TypeDefinition("oldRPS", false, rock, paper, scissor));
      final Relation beats2 = VampireTest.builder.add(problem, VampireTest.builder.RelationDeclaration("beats2", oldRPS, oldRPS));
      final Function1<VariableContext, TermDescription> _function = (VariableContext it) -> {
        Exists _xblockexpression_1 = null;
        {
          final Variable x = it.addVar("x", oldRPS);
          final Function1<VariableContext, TermDescription> _function_1 = (VariableContext it_1) -> {
            And _xblockexpression_2 = null;
            {
              final Variable y = it_1.addVar("y", oldRPS);
              SymbolicValue _call = VampireTest.builder.call(beats2, x, y);
              Distinct _notEquals = VampireTest.builder.operator_notEquals(x, y);
              _xblockexpression_2 = VampireTest.builder.And(_call, _notEquals, 
                VampireTest.builder.Not(VampireTest.builder.call(beats2, y, x)));
            }
            return _xblockexpression_2;
          };
          _xblockexpression_1 = VampireTest.builder.Exists(_function_1);
        }
        return _xblockexpression_1;
      };
      _xblockexpression = VampireTest.builder.add(problem, 
        VampireTest.builder.Assertion(
          VampireTest.builder.Forall(_function)));
    }
    return _xblockexpression;
  }
}
