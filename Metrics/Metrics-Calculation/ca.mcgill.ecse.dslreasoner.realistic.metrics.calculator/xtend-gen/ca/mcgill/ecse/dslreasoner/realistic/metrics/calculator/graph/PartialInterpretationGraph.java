package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.Graph;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.GraphStatistic;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.Metric;
import com.google.common.collect.Iterables;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BinaryElementRelationLink;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialComplexTypeInterpretationImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class PartialInterpretationGraph extends Graph {
  private final String typeToExclude = "undefinedpart";
  
  private final String classSuffix = " class";
  
  /**
   * Define a new PartialInterpretationGraph by parse every element from a PartialInterpretation
   */
  public PartialInterpretationGraph(final PartialInterpretation partial, final List<Metric> metrics, final String name) {
    final Consumer<RelationDeclaration> _function = (RelationDeclaration it) -> {
      String n = it.getName().split(" ")[0];
      this.statistic.addEdgeType(n);
    };
    Iterables.<RelationDeclaration>filter(partial.getProblem().getRelations(), RelationDeclaration.class).forEach(_function);
    final Iterable<PartialComplexTypeInterpretationImpl> typeInterpretations = this.getTypes(partial);
    for (final PartialComplexTypeInterpretationImpl type : typeInterpretations) {
      boolean _isConcreteType = this.isConcreteType(type.getInterpretationOf());
      if (_isConcreteType) {
        String typeName = type.getInterpretationOf().getName().replace(this.classSuffix, "");
        EList<DefinedElement> _elements = type.getElements();
        for (final DefinedElement node : _elements) {
          boolean _containsNode = this.statistic.containsNode(node);
          boolean _not = (!_containsNode);
          if (_not) {
            this.statistic.addNodeWithType(node, typeName);
          } else {
            String currentType = ((String[])Conversions.unwrapArray(this.statistic.getTypesForNode(node), String.class))[0];
            boolean _isSuperType = this.isSuperType(currentType, type.getInterpretationOf());
            if (_isSuperType) {
              this.statistic.overwriteCurrentType(node, typeName);
            }
          }
        }
      }
    }
    EList<PartialRelationInterpretation> _partialrelationinterpretation = partial.getPartialrelationinterpretation();
    for (final PartialRelationInterpretation relationInterpretation : _partialrelationinterpretation) {
      {
        final String type_1 = relationInterpretation.getInterpretationOf().getName().split(" ")[0];
        Iterable<BinaryElementRelationLink> _filter = Iterables.<BinaryElementRelationLink>filter(relationInterpretation.getRelationlinks(), BinaryElementRelationLink.class);
        for (final BinaryElementRelationLink edge : _filter) {
          this.statistic.addEdge(edge.getParam1(), edge.getParam2(), type_1);
        }
      }
    }
    this.name = name;
    this.metrics = metrics;
  }
  
  /**
   * recursively check if a type is the super type of another
   */
  public boolean isSuperType(final String typeName, final Type subtypeToCheck) {
    EList<Type> superTypes = subtypeToCheck.getSupertypes();
    int _size = superTypes.size();
    boolean _equals = (_size == 0);
    if (_equals) {
      return false;
    } else {
      final Function1<Type, String> _function = (Type it) -> {
        return it.getName().replace(this.classSuffix, "");
      };
      boolean _contains = ListExtensions.<Type, String>map(subtypeToCheck.getSupertypes(), _function).contains(typeName);
      if (_contains) {
        return true;
      } else {
        for (final Type superType : superTypes) {
          boolean _isSuperType = this.isSuperType(typeName, superType);
          if (_isSuperType) {
            return true;
          }
        }
        return false;
      }
    }
  }
  
  /**
   * Check if a Type object is the class that we want to consider
   * 	A type object is to be considered if it satisfy one of the following:
   * 	1. if it is not abstract
   * 	2. if it is abstract but has a subclass of type TypeDefinition (This means the generation is
   * 	   started with nodes in this type)
   */
  public boolean isConcreteType(final Type t) {
    if (((!t.isIsAbstract()) || (IterableExtensions.<Type>findFirst(t.getSubtypes(), ((Function1<Type, Boolean>) (Type it) -> {
      return Boolean.valueOf((it instanceof TypeDefinition));
    })) != null))) {
      return true;
    }
    return false;
  }
  
  /**
   * Set basic information for the output
   */
  @Override
  public void setBasicInformation(final ArrayList<ArrayList<String>> output) {
    final ArrayList<String> metaInfo = new ArrayList<String>();
    metaInfo.add(Graph.META_MODEL_HEADER);
    metaInfo.add(this.metaModel);
    final ArrayList<String> edgeInfo = new ArrayList<String>();
    edgeInfo.add(Graph.NUM_EDGE_TYPE_HEADER);
    int _size = this.statistic.getAllTypes().size();
    String _plus = (Integer.valueOf(_size) + "");
    edgeInfo.add(_plus);
    final ArrayList<String> nodeInfo = new ArrayList<String>();
    nodeInfo.add(Graph.NUM_NODE_HEADER);
    int _size_1 = this.statistic.getAllNodes().size();
    String _plus_1 = (Integer.valueOf(_size_1) + "");
    nodeInfo.add(_plus_1);
    final ArrayList<String> stateInfo = new ArrayList<String>();
    stateInfo.add(Graph.STATE_ID_HEADER);
    stateInfo.add(this.name);
    output.add(metaInfo);
    output.add(edgeInfo);
    output.add(nodeInfo);
    output.add(stateInfo);
  }
  
  private Iterable<PartialComplexTypeInterpretationImpl> getTypes(final PartialInterpretation partial) {
    final Function1<PartialComplexTypeInterpretationImpl, Boolean> _function = (PartialComplexTypeInterpretationImpl it) -> {
      boolean _contains = it.getInterpretationOf().getName().toLowerCase().contains(this.typeToExclude);
      return Boolean.valueOf((!_contains));
    };
    return IterableExtensions.<PartialComplexTypeInterpretationImpl>filter(Iterables.<PartialComplexTypeInterpretationImpl>filter(partial.getPartialtypeinterpratation(), PartialComplexTypeInterpretationImpl.class), _function);
  }
  
  @Override
  public GraphStatistic getStatistic() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  @Override
  public String getName() {
    return this.name;
  }
}
