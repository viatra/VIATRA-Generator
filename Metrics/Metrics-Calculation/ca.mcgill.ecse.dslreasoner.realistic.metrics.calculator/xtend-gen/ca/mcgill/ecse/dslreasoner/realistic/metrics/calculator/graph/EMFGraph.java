package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.Graph;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.GraphStatistic;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.Metric;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class EMFGraph extends Graph {
  @Accessors(AccessorType.PUBLIC_GETTER)
  private EObject root;
  
  public void init(final EObject root, final List<Metric> metrics, final String name, final List<EReference> referenceTypes) {
    final List<EObject> otherContents = IteratorExtensions.<EObject>toList(root.eAllContents());
    this.root = root;
    otherContents.add(root);
    this.init(otherContents, metrics, name, referenceTypes);
  }
  
  /**
   * init the graph with all nodes and reference types in the meta model
   * @param objects: objects in the instance model (exclude root)
   * @param metrics: metrics to be evaluated
   * @param name: name of the instance model
   * @param ReferenceTypes: reference types defined in the meta model
   */
  public void init(final List<EObject> objects, final List<Metric> metrics, final String name, final List<EReference> referenceTypes) {
    final Consumer<EObject> _function = (EObject it) -> {
      HashSet<String> types = new HashSet<String>();
      types.add(it.eClass().getName());
      this.statistic.addNodeWithAllTypes(it, types);
    };
    objects.forEach(_function);
    final Consumer<EReference> _function_1 = (EReference it) -> {
      boolean _isDerived = it.isDerived();
      boolean _not = (!_isDerived);
      if (_not) {
        this.statistic.addEdgeType(it.getName());
      }
    };
    referenceTypes.forEach(_function_1);
    final Consumer<EObject> _function_2 = (EObject source) -> {
      final Consumer<EReference> _function_3 = (EReference r) -> {
        boolean _isMany = r.isMany();
        if (_isMany) {
          final Consumer<EObject> _function_4 = (EObject target) -> {
            this.addEdge(source, target, r);
          };
          this.getNeighbours(source, r).forEach(_function_4);
        } else {
          Object _eGet = source.eGet(r);
          final EObject target = ((EObject) _eGet);
          this.addEdge(source, target, r);
        }
      };
      source.eClass().getEAllReferences().forEach(_function_3);
    };
    objects.forEach(_function_2);
    this.metrics = metrics;
    this.name = name;
  }
  
  public void removeReference(final EReference r) {
    boolean _containsEdgeType = this.statistic.containsEdgeType(r.getName());
    if (_containsEdgeType) {
      this.statistic.removeReference(r.getName(), r.isContainment());
    }
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
  
  public EList<EObject> getNeighbours(final EObject o, final EReference r) {
    Object _eGet = o.eGet(r, true);
    return ((EList<EObject>) _eGet);
  }
  
  public void addEdge(final EObject source, final EObject target, final EReference r) {
    if ((((target != null) && (r != null)) && (!r.isDerived()))) {
      this.statistic.addEdge(source, target, r.getName());
    }
  }
  
  @Override
  public GraphStatistic getStatistic() {
    return this.statistic;
  }
  
  @Override
  public String getName() {
    return this.name;
  }
  
  public void setMetaModel(final String model) {
    this.metaModel = model;
  }
  
  public String getMetaModel() {
    return this.metaModel;
  }
  
  @Pure
  public EObject getRoot() {
    return this.root;
  }
}
