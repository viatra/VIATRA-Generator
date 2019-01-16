package ca.mcgill.ecse.dslreasoner.vampire.test;

import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolver;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolverConfiguration;
import com.google.common.collect.Iterables;
import functionalarchitecture.FunctionalarchitecturePackage;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace;
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasoner;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult;
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore;
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic;
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace;
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class DslTest {
  public static void main(final String[] args) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("initialModels/");
      final FileSystemWorkspace inputs = new FileSystemWorkspace(_builder.toString(), "");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("outputDslModels/");
      final FileSystemWorkspace workspace = new FileSystemWorkspace(_builder_1.toString(), "");
      workspace.initAndClear();
      InputOutput.<String>println("Input and output workspaces are created");
      final EcoreMetamodelDescriptor metamodel = DslTest.loadMetamodel();
      final List<EObject> partialModel = DslTest.loadPartialModel(inputs);
      InputOutput.<String>println("DSL loaded");
      final Ecore2Logic ecore2Logic = new Ecore2Logic();
      final Logic2Ecore logic2Ecore = new Logic2Ecore(ecore2Logic);
      final Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic);
      final InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic();
      Ecore2LogicConfiguration _ecore2LogicConfiguration = new Ecore2LogicConfiguration();
      final TracedOutput<LogicProblem, Ecore2Logic_Trace> modelGenerationProblem = ecore2Logic.transformMetamodel(metamodel, _ecore2LogicConfiguration);
      final LogicProblem logicProblem = modelGenerationProblem.getOutput();
      InputOutput.<String>println("Problem created");
      LogicResult solution = null;
      LogicReasoner reasoner = null;
      VampireSolver _vampireSolver = new VampireSolver();
      reasoner = _vampireSolver;
      VampireSolverConfiguration _vampireSolverConfiguration = new VampireSolverConfiguration();
      final Procedure1<VampireSolverConfiguration> _function = (VampireSolverConfiguration it) -> {
        it.writeToFile = false;
      };
      final VampireSolverConfiguration vampireConfig = ObjectExtensions.<VampireSolverConfiguration>operator_doubleArrow(_vampireSolverConfiguration, _function);
      solution = reasoner.solve(logicProblem, vampireConfig, workspace);
      InputOutput.<String>println("Problem solved");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private static EcoreMetamodelDescriptor loadMetamodel() {
    final FunctionalarchitecturePackage pckg = FunctionalarchitecturePackage.eINSTANCE;
    final List<EClass> classes = IterableExtensions.<EClass>toList(Iterables.<EClass>filter(pckg.getEClassifiers(), EClass.class));
    final List<EEnum> enums = IterableExtensions.<EEnum>toList(Iterables.<EEnum>filter(pckg.getEClassifiers(), EEnum.class));
    final Function1<EEnum, EList<EEnumLiteral>> _function = (EEnum it) -> {
      return it.getELiterals();
    };
    final List<EEnumLiteral> literals = IterableExtensions.<EEnumLiteral>toList(Iterables.<EEnumLiteral>concat(ListExtensions.<EEnum, EList<EEnumLiteral>>map(enums, _function)));
    final Function1<EClass, EList<EReference>> _function_1 = (EClass it) -> {
      return it.getEReferences();
    };
    final List<EReference> references = IterableExtensions.<EReference>toList(Iterables.<EReference>concat(ListExtensions.<EClass, EList<EReference>>map(classes, _function_1)));
    final Function1<EClass, EList<EAttribute>> _function_2 = (EClass it) -> {
      return it.getEAttributes();
    };
    final List<EAttribute> attributes = IterableExtensions.<EAttribute>toList(Iterables.<EAttribute>concat(ListExtensions.<EClass, EList<EAttribute>>map(classes, _function_2)));
    return new EcoreMetamodelDescriptor(classes, Collections.<EClass>unmodifiableSet(CollectionLiterals.<EClass>newHashSet()), false, enums, literals, references, attributes);
  }
  
  private static List<EObject> loadPartialModel(final ReasonerWorkspace inputs) {
    List<EObject> _xblockexpression = null;
    {
      Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("*", _xMIResourceFactoryImpl);
      _xblockexpression = IteratorExtensions.<EObject>toList(inputs.<EObject>readModel(EObject.class, "FunctionalArchitectureModel.xmi").eResource().getAllContents());
    }
    return _xblockexpression;
  }
}
