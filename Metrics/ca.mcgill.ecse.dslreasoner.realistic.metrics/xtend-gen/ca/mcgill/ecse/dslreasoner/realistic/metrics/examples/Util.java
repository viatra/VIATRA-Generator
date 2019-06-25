package ca.mcgill.ecse.dslreasoner.realistic.metrics.examples;

import com.google.common.collect.Iterables;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace;
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.FurtherNodeDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.LocalNodeDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class Util {
  private final static InstanceModel2PartialInterpretation partialInterpretation2Logic = new InstanceModel2PartialInterpretation();
  
  private final static Ecore2Logic ecore2Logic = new Ecore2Logic();
  
  public static Set<String> toLocalNode(final AbstractNodeDescriptor descriptor) {
    AbstractNodeDescriptor d = descriptor;
    while ((!d.getClass().equals(LocalNodeDescriptor.class))) {
      Object _previousRepresentation = ((FurtherNodeDescriptor) d).getPreviousRepresentation();
      d = ((AbstractNodeDescriptor) _previousRepresentation);
    }
    return ((LocalNodeDescriptor) d).getTypes();
  }
  
  public static PartialInterpretation getPartialModel(final FileSystemWorkspace workspace, final EObject model) {
    final EPackage pckg = model.eClass().getEPackage();
    List<EClass> _list = IterableExtensions.<EClass>toList(Iterables.<EClass>filter(pckg.getEClassifiers(), EClass.class));
    Set<EClass> _emptySet = Collections.<EClass>emptySet();
    List<EEnum> _list_1 = IterableExtensions.<EEnum>toList(Iterables.<EEnum>filter(pckg.getEClassifiers(), EEnum.class));
    final Function1<EEnum, EList<EEnumLiteral>> _function = (EEnum it) -> {
      return it.getELiterals();
    };
    List<EEnumLiteral> _list_2 = IterableExtensions.<EEnumLiteral>toList(Iterables.<EEnumLiteral>concat(IterableExtensions.<EEnum, EList<EEnumLiteral>>map(Iterables.<EEnum>filter(pckg.getEClassifiers(), EEnum.class), _function)));
    final Function1<EClass, EList<EReference>> _function_1 = (EClass it) -> {
      return it.getEReferences();
    };
    List<EReference> _list_3 = IterableExtensions.<EReference>toList(Iterables.<EReference>concat(IterableExtensions.<EClass, EList<EReference>>map(Iterables.<EClass>filter(pckg.getEClassifiers(), EClass.class), _function_1)));
    final Function1<EClass, EList<EAttribute>> _function_2 = (EClass it) -> {
      return it.getEAttributes();
    };
    List<EAttribute> _list_4 = IterableExtensions.<EAttribute>toList(Iterables.<EAttribute>concat(IterableExtensions.<EClass, EList<EAttribute>>map(Iterables.<EClass>filter(pckg.getEClassifiers(), EClass.class), _function_2)));
    final EcoreMetamodelDescriptor metamodel = new EcoreMetamodelDescriptor(_list, _emptySet, 
      false, _list_1, _list_2, _list_3, _list_4);
    Ecore2LogicConfiguration _ecore2LogicConfiguration = new Ecore2LogicConfiguration();
    final TracedOutput<LogicProblem, Ecore2Logic_Trace> metamodelTransformationOutput = Util.ecore2Logic.transformMetamodel(metamodel, _ecore2LogicConfiguration);
    return Util.partialInterpretation2Logic.transform(metamodelTransformationOutput, model.eResource(), false);
  }
  
  public static double sum2(final Collection<Double> integers) {
    double sum = 0.0;
    for (final Double integer : integers) {
      double _sum = sum;
      sum = (_sum + (integer).doubleValue());
    }
    return sum;
  }
  
  public static int sum(final Collection<Integer> integers) {
    int sum = 0;
    for (final Integer integer : integers) {
      int _sum = sum;
      sum = (_sum + (integer).intValue());
    }
    return sum;
  }
  
  public static double sum2(final List<String> integers) {
    double sum = 0.0;
    for (final String str : integers) {
      double _sum = sum;
      Double _valueOf = Double.valueOf(str);
      sum = (_sum + (_valueOf).doubleValue());
    }
    return sum;
  }
}
