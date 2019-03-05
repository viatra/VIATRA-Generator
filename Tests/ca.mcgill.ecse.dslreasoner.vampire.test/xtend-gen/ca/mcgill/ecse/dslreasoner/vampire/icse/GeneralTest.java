package ca.mcgill.ecse.dslreasoner.vampire.icse;

import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolver;
import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolverConfiguration;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace;
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasoner;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicResult;
import hu.bme.mit.inf.dslreasoner.logic2ecore.Logic2Ecore;
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2Logic;
import hu.bme.mit.inf.dslreasoner.viatra2logic.Viatra2LogicConfiguration;
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2Logic;
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace;
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.runtime.api.IQueryGroup;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class GeneralTest {
  public static String createAndSolveProblem(final EcoreMetamodelDescriptor metamodel, final List<EObject> partialModel, final ViatraQuerySetDescriptor queries, final FileSystemWorkspace workspace) {
    try {
      String _xblockexpression = null;
      {
        final Ecore2Logic ecore2Logic = new Ecore2Logic();
        final Logic2Ecore logic2Ecore = new Logic2Ecore(ecore2Logic);
        final Viatra2Logic viatra2Logic = new Viatra2Logic(ecore2Logic);
        final InstanceModel2Logic instanceModel2Logic = new InstanceModel2Logic();
        Ecore2LogicConfiguration _ecore2LogicConfiguration = new Ecore2LogicConfiguration();
        final TracedOutput<LogicProblem, Ecore2Logic_Trace> modelGenerationProblem = ecore2Logic.transformMetamodel(metamodel, _ecore2LogicConfiguration);
        LogicProblem problem = instanceModel2Logic.transform(modelGenerationProblem, partialModel).getOutput();
        Viatra2LogicConfiguration _viatra2LogicConfiguration = new Viatra2LogicConfiguration();
        problem = viatra2Logic.transformQueries(queries, modelGenerationProblem, _viatra2LogicConfiguration).getOutput();
        workspace.writeModel(problem, "Fam.logicproblem");
        InputOutput.<String>println("Problem created");
        LogicResult solution = null;
        LogicReasoner reasoner = null;
        VampireSolver _vampireSolver = new VampireSolver();
        reasoner = _vampireSolver;
        VampireSolverConfiguration _vampireSolverConfiguration = new VampireSolverConfiguration();
        final Procedure1<VampireSolverConfiguration> _function = (VampireSolverConfiguration it) -> {
          it.documentationLevel = DocumentationLevel.FULL;
          it.typeScopes.minNewElements = 5;
        };
        final VampireSolverConfiguration vampireConfig = ObjectExtensions.<VampireSolverConfiguration>operator_doubleArrow(_vampireSolverConfiguration, _function);
        solution = reasoner.solve(problem, vampireConfig, workspace);
        _xblockexpression = InputOutput.<String>println("Problem solved");
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static EcoreMetamodelDescriptor loadMetamodel(final EPackage pckg) {
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
  
  public static EList<EObject> loadPartialModel(final ReasonerWorkspace inputs, final String path) {
    EList<EObject> _xblockexpression = null;
    {
      Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("*", _xMIResourceFactoryImpl);
      _xblockexpression = inputs.<EObject>readModel(EObject.class, path).eResource().getContents();
    }
    return _xblockexpression;
  }
  
  public static ViatraQuerySetDescriptor loadQueries(final EcoreMetamodelDescriptor metamodel, final IQueryGroup i) {
    final List<IQuerySpecification<?>> patterns = IterableExtensions.<IQuerySpecification<?>>toList(i.getSpecifications());
    final Function1<IQuerySpecification<?>, Boolean> _function = (IQuerySpecification<?> it) -> {
      final Function1<PAnnotation, Boolean> _function_1 = (PAnnotation it_1) -> {
        String _name = it_1.getName();
        return Boolean.valueOf(Objects.equal(_name, "Constraint"));
      };
      return Boolean.valueOf(IterableExtensions.<PAnnotation>exists(it.getAllAnnotations(), _function_1));
    };
    final Set<IQuerySpecification<?>> wfPatterns = IterableExtensions.<IQuerySpecification<?>>toSet(IterableExtensions.<IQuerySpecification<?>>filter(patterns, _function));
    final Map<IQuerySpecification<?>, EStructuralFeature> derivedFeatures = CollectionLiterals.<IQuerySpecification<?>, EStructuralFeature>emptyMap();
    final ViatraQuerySetDescriptor res = new ViatraQuerySetDescriptor(patterns, wfPatterns, derivedFeatures);
    return res;
  }
}
