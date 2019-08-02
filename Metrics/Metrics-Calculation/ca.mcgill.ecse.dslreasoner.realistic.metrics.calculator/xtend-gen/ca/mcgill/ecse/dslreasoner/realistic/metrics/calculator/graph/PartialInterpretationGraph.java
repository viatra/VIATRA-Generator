package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.Graph;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.GraphStatistic;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.Metric;
import com.google.common.collect.Iterables;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BinaryElementRelationLink;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialComplexTypeInterpretationImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

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
      if (((!n.equals("target")) && (!n.equals("source")))) {
        this.statistic.addEdgeType(n);
      }
    };
    Iterables.<RelationDeclaration>filter(partial.getProblem().getRelations(), RelationDeclaration.class).forEach(_function);
    final Iterable<PartialComplexTypeInterpretationImpl> typeInterpretations = this.getTypes(partial);
    for (final PartialComplexTypeInterpretationImpl type : typeInterpretations) {
      int _size = type.getInterpretationOf().getSubtypes().size();
      boolean _equals = (_size == 0);
      if (_equals) {
        String typeName = type.getInterpretationOf().getName().replace(this.classSuffix, "");
        EList<DefinedElement> _elements = type.getElements();
        for (final DefinedElement node : _elements) {
          this.statistic.addNodeWithType(node, typeName);
        }
      }
    }
    EList<PartialRelationInterpretation> _partialrelationinterpretation = partial.getPartialrelationinterpretation();
    for (final PartialRelationInterpretation relationInterpretation : _partialrelationinterpretation) {
      {
        final String type_1 = relationInterpretation.getInterpretationOf().getName().split(" ")[0];
        if (((!type_1.equals("target")) && (!type_1.equals("source")))) {
          Iterable<BinaryElementRelationLink> _filter = Iterables.<BinaryElementRelationLink>filter(relationInterpretation.getRelationlinks(), BinaryElementRelationLink.class);
          for (final BinaryElementRelationLink edge : _filter) {
            this.statistic.addEdge(edge.getParam1(), edge.getParam2(), type_1);
          }
        }
      }
    }
    this.name = name;
    this.metrics = metrics;
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
