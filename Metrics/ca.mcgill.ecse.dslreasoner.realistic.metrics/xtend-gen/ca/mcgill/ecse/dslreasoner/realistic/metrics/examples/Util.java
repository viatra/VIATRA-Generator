package ca.mcgill.ecse.dslreasoner.realistic.metrics.examples;

import com.google.common.collect.Iterables;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace;
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor;
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.util.CollectionsUtil;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.AbstractNodeDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.FurtherNodeDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.GraphNodeDescriptorGND;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.GraphShape;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.LocalNodeDescriptor;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.OutgoingRelationGND;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
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
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.DoubleExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class Util {
  private final static InstanceModel2PartialInterpretation partialInterpretation2Logic = new InstanceModel2PartialInterpretation();
  
  private final static Ecore2Logic ecore2Logic = new Ecore2Logic();
  
  public static double difference(final List<String> base, final List<String> exp) {
    final int numElems = ((Object[])Conversions.unwrapArray(base, Object.class)).length;
    double totDif = 0.0;
    double totBase = 0.0;
    boolean underApproxExists = false;
    for (int i = 0; (i < numElems); i++) {
      {
        Double baseD = Double.valueOf(base.get(i));
        double _tBase = totBase;
        totBase = (_tBase + (baseD).doubleValue());
        Double expD = Double.valueOf(exp.get(i));
        double _tDif = totDif;
        double _minus = DoubleExtensions.operator_minus(baseD, expD);
        double _abs = Math.abs(_minus);
        totDif = (_tDif + _abs);
        boolean _greaterThan = (baseD.compareTo(expD) > 0);
        if (_greaterThan) {
          underApproxExists = true;
        }
      }
    }
    final double avgDif = (totDif / numElems);
    final double avgBase = (totBase / numElems);
    double avgDifPerc = (avgDif / avgBase);
    if (underApproxExists) {
      double _avgDifPerc = avgDifPerc;
      avgDifPerc = (_avgDifPerc * (-1));
    }
    return avgDifPerc;
  }
  
  public static LocalNodeDescriptor toLocalNode(final AbstractNodeDescriptor descriptor) {
    AbstractNodeDescriptor d = descriptor;
    while ((!d.getClass().equals(LocalNodeDescriptor.class))) {
      Object _previousRepresentation = ((FurtherNodeDescriptor) d).getPreviousRepresentation();
      d = ((AbstractNodeDescriptor) _previousRepresentation);
    }
    return ((LocalNodeDescriptor) d);
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
  
  public static double sumDbl(final Collection<Double> integers) {
    double sum = 0.0;
    for (final Double integer : integers) {
      double _sum = sum;
      sum = (_sum + (integer).doubleValue());
    }
    return sum;
  }
  
  public static int sumInt(final Collection<Integer> integers) {
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
  
  public static Integer putInside(final EObject object, final String string, final int i, final Map<EObject, Map<String, Integer>> map) {
    Integer _xblockexpression = null;
    {
      final Map<String, Integer> correspondingMap = CollectionsUtil.<EObject, Map<String, Integer>>lookup(object, map);
      Integer _xifexpression = null;
      boolean _contains = correspondingMap.keySet().contains(string);
      if (_contains) {
        Integer _lookup = CollectionsUtil.<String, Integer>lookup(string, correspondingMap);
        int _plus = ((_lookup).intValue() + i);
        _xifexpression = correspondingMap.put(string, Integer.valueOf(_plus));
      } else {
        _xifexpression = correspondingMap.put(string, Integer.valueOf(i));
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public static Map<EObject, Set<EObject>> dim2NumActNodesFromModel(final EObject model) {
    final List<EObject> nodes = IteratorExtensions.<EObject>toList(model.eResource().getAllContents());
    final Map<EObject, Set<EObject>> dim2NumActNodes = new HashMap<EObject, Set<EObject>>();
    for (final EObject node : nodes) {
      EList<EReference> _eAllReferences = node.eClass().getEAllReferences();
      for (final EReference dim : _eAllReferences) {
        {
          final EObject srcNode = node;
          final Object trgNode = node.eGet(dim);
          if ((!(trgNode instanceof List))) {
            if ((trgNode != null)) {
              boolean _contains = dim2NumActNodes.keySet().contains(dim);
              if (_contains) {
                CollectionsUtil.<EReference, Set<EObject>>lookup(dim, dim2NumActNodes).add(srcNode);
              } else {
                dim2NumActNodes.put(dim, CollectionLiterals.<EObject>newHashSet(srcNode));
              }
              CollectionExtensions.<EObject>addAll(CollectionsUtil.<EReference, Set<EObject>>lookup(dim, dim2NumActNodes), ((EObject) trgNode));
            }
          } else {
            final List trgSet = ((List) trgNode);
            boolean _isEmpty = trgSet.isEmpty();
            boolean _not = (!_isEmpty);
            if (_not) {
              boolean _contains_1 = dim2NumActNodes.keySet().contains(dim);
              if (_contains_1) {
                CollectionExtensions.<EObject>addAll(CollectionsUtil.<EReference, Set<EObject>>lookup(dim, dim2NumActNodes), srcNode);
              } else {
                dim2NumActNodes.put(dim, CollectionLiterals.<EObject>newHashSet(srcNode));
              }
              for (final Object target : trgSet) {
                CollectionsUtil.<EReference, Set<EObject>>lookup(dim, dim2NumActNodes).add(((EObject) target));
              }
            }
          }
        }
      }
    }
    return dim2NumActNodes;
  }
  
  public static Map<String, Set<AbstractNodeDescriptor>> dim2NumActNodesFromNHShape(final GraphShape gs) {
    List _nodes = gs.getNodes();
    final List<GraphNodeDescriptorGND> nodes = ((List<GraphNodeDescriptorGND>) _nodes);
    final Map<String, Set<AbstractNodeDescriptor>> dim2NumActNodes = new HashMap<String, Set<AbstractNodeDescriptor>>();
    for (final GraphNodeDescriptorGND node : nodes) {
      List<OutgoingRelationGND> _outgoingEdges = node.getOutgoingEdges();
      for (final OutgoingRelationGND dim : _outgoingEdges) {
        {
          final String dimName = dim.getType();
          final AbstractNodeDescriptor srcName = node.getCorrespondingAND();
          final AbstractNodeDescriptor trgName = dim.getTo().getCorrespondingAND();
          boolean _contains = dim2NumActNodes.keySet().contains(dimName);
          if (_contains) {
            CollectionsUtil.<String, Set<AbstractNodeDescriptor>>lookup(dimName, dim2NumActNodes).add(srcName);
          } else {
            dim2NumActNodes.put(dimName, CollectionLiterals.<AbstractNodeDescriptor>newHashSet(srcName));
          }
          CollectionExtensions.<AbstractNodeDescriptor>addAll(CollectionsUtil.<String, Set<AbstractNodeDescriptor>>lookup(dimName, dim2NumActNodes), trgName);
        }
      }
    }
    return dim2NumActNodes;
  }
  
  public static Map<String, Set<AbstractNodeDescriptor>> dim2NumActNodes(final GraphShape gs) {
    List _nodes = gs.getNodes();
    final List<GraphNodeDescriptorGND> nodes = ((List<GraphNodeDescriptorGND>) _nodes);
    final Map<String, Set<AbstractNodeDescriptor>> dim2NumActNodes = new HashMap<String, Set<AbstractNodeDescriptor>>();
    for (final GraphNodeDescriptorGND node : nodes) {
      List<OutgoingRelationGND> _outgoingEdges = node.getOutgoingEdges();
      for (final OutgoingRelationGND dim : _outgoingEdges) {
        {
          final String dimName = dim.getType();
          final AbstractNodeDescriptor srcName = node.getCorrespondingAND();
          final AbstractNodeDescriptor trgName = dim.getTo().getCorrespondingAND();
          boolean _contains = dim2NumActNodes.keySet().contains(dimName);
          if (_contains) {
            CollectionsUtil.<String, Set<AbstractNodeDescriptor>>lookup(dimName, dim2NumActNodes).add(srcName);
          } else {
            dim2NumActNodes.put(dimName, CollectionLiterals.<AbstractNodeDescriptor>newHashSet(srcName));
          }
          CollectionExtensions.<AbstractNodeDescriptor>addAll(CollectionsUtil.<String, Set<AbstractNodeDescriptor>>lookup(dimName, dim2NumActNodes), trgName);
        }
      }
    }
    return dim2NumActNodes;
  }
  
  public static Map<EObject, Integer> dim2NumOccurencesFromModel(final EObject model) {
    final List<EObject> nodes = IteratorExtensions.<EObject>toList(model.eResource().getAllContents());
    final Map<EObject, Integer> dim2Occurences = new HashMap<EObject, Integer>();
    int newVal = 0;
    for (final EObject node : nodes) {
      EList<EReference> _eAllReferences = node.eClass().getEAllReferences();
      for (final EReference dim : _eAllReferences) {
        {
          final Object target = node.eGet(dim);
          if ((!(target instanceof List))) {
            if ((target != null)) {
              boolean _contains = dim2Occurences.keySet().contains(dim);
              if (_contains) {
                Integer _lookup = CollectionsUtil.<EReference, Integer>lookup(dim, dim2Occurences);
                int _plus = ((_lookup).intValue() + 1);
                newVal = _plus;
              } else {
                newVal = 1;
              }
              dim2Occurences.put(dim, Integer.valueOf(newVal));
            }
          } else {
            final List trgSet = ((List) target);
            boolean _isEmpty = trgSet.isEmpty();
            boolean _not = (!_isEmpty);
            if (_not) {
              boolean _contains_1 = dim2Occurences.keySet().contains(dim);
              if (_contains_1) {
                Integer _lookup_1 = CollectionsUtil.<EReference, Integer>lookup(dim, dim2Occurences);
                int _length = ((Object[])Conversions.unwrapArray(trgSet, Object.class)).length;
                int _plus_1 = ((_lookup_1).intValue() + _length);
                newVal = _plus_1;
              } else {
                newVal = ((Object[])Conversions.unwrapArray(trgSet, Object.class)).length;
              }
              dim2Occurences.put(dim, Integer.valueOf(newVal));
            }
          }
        }
      }
    }
    return dim2Occurences;
  }
  
  public static void getNeighboursList(final List<EObject> nodes, final Map<EObject, Set<EObject>> node2Neighbours) {
    for (final EObject node : nodes) {
      EList<EReference> _eAllReferences = node.eClass().getEAllReferences();
      for (final EReference reference : _eAllReferences) {
        {
          final Object pointingTo = node.eGet(reference);
          if ((!(pointingTo instanceof List))) {
            if ((pointingTo != null)) {
              CollectionsUtil.<EObject, Set<EObject>>lookup(node, node2Neighbours).add(((EObject) pointingTo));
              CollectionsUtil.<EObject, Set<EObject>>lookup(((EObject) pointingTo), node2Neighbours).add(node);
            }
          } else {
            final List pointingToSet = ((List) pointingTo);
            boolean _isEmpty = pointingToSet.isEmpty();
            boolean _not = (!_isEmpty);
            if (_not) {
              for (final Object target : pointingToSet) {
                {
                  CollectionsUtil.<EObject, Set<EObject>>lookup(node, node2Neighbours).add(((EObject) target));
                  CollectionsUtil.<EObject, Set<EObject>>lookup(((EObject) target), node2Neighbours).add(node);
                }
              }
            }
          }
        }
      }
    }
  }
  
  public static void fillWithNodes(final List<EObject> nodes, final Map<EObject, Set<EObject>> node2Neighbours) {
    for (final EObject node : nodes) {
      HashSet<EObject> _hashSet = new HashSet<EObject>();
      node2Neighbours.put(node, _hashSet);
    }
  }
  
  public static Integer factorial(final Integer n) {
    if (((n).intValue() < 2)) {
      return n;
    }
    Integer _factorial = Util.factorial(Integer.valueOf(((n).intValue() - 1)));
    return Integer.valueOf(((n).intValue() * (_factorial).intValue()));
  }
}
