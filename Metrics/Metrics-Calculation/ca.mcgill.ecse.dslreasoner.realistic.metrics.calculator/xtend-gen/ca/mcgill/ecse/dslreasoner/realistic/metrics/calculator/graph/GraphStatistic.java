package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class GraphStatistic {
  private final HashMap<String, Multimap<EObject, EObject>> incomingEdges = new HashMap<String, Multimap<EObject, EObject>>();
  
  private final HashMap<String, Multimap<EObject, EObject>> outgoingEdges = new HashMap<String, Multimap<EObject, EObject>>();
  
  private final HashSet<String> edgeTypes = new HashSet<String>();
  
  private final HashMap<EObject, Set<String>> nodeToType = new HashMap<EObject, Set<String>>();
  
  /**
   * Add an edge type to to the graph
   * @param type: type to add
   */
  public void addEdgeType(final String type) {
    boolean _contains = this.edgeTypes.contains(type);
    if (_contains) {
      return;
    }
    this.edgeTypes.add(type);
    this.incomingEdges.put(type, ArrayListMultimap.<EObject, EObject>create());
    this.outgoingEdges.put(type, ArrayListMultimap.<EObject, EObject>create());
  }
  
  /**
   * Add a node to the graph with one type in its type hierarchy
   * @param node: node to add
   */
  public void addNodeWithType(final EObject n, final String Type) {
    HashSet<String> _hashSet = new HashSet<String>();
    Set<String> types = this.nodeToType.getOrDefault(n, _hashSet);
    types.add(Type);
    this.nodeToType.put(n, types);
  }
  
  public boolean containsNode(final EObject o) {
    return this.nodeToType.containsKey(o);
  }
  
  public Set<String> getTypesForNode(final EObject o) {
    HashSet<String> _hashSet = new HashSet<String>();
    return this.nodeToType.getOrDefault(o, _hashSet);
  }
  
  public void overwriteCurrentType(final EObject o, final String type) {
    HashSet<String> _hashSet = new HashSet<String>();
    Set<String> typeSet = this.nodeToType.getOrDefault(o, _hashSet);
    typeSet.clear();
    typeSet.add(type);
    this.nodeToType.put(o, typeSet);
  }
  
  /**
   * Add a node to the graph with all types in its type hierarchy
   */
  public void addNodeWithAllTypes(final EObject n, final Set<String> types) {
    this.nodeToType.put(n, types);
  }
  
  /**
   * Add an edge to the graph
   * @param source: source node
   * @param target: target node
   * @param type: type of the reference
   */
  public void addEdge(final EObject source, final EObject target, final String type) {
    this.outgoingEdges.get(type).put(source, target);
    this.incomingEdges.get(type).put(target, source);
  }
  
  /**
   * check if this graph contains a specific edge type
   */
  public boolean containsEdgeType(final String typeName) {
    if ((this.outgoingEdges.containsKey(typeName) && this.incomingEdges.containsKey(typeName))) {
      return true;
    }
    return false;
  }
  
  /**
   * remove references from the statistics, potentially remove the nodes associated with it
   * @Param name: name of the reference
   * @Param isContainment: if true then the corresponding nodes on the incoming side will also be removed
   */
  public void removeReference(final String name, final boolean isContainment) {
    boolean _contains = this.edgeTypes.contains(name);
    boolean _not = (!_contains);
    if (_not) {
      return;
    }
    this.edgeTypes.remove(name);
    Multimap<EObject, EObject> incomingSet = this.incomingEdges.remove(name);
    this.outgoingEdges.remove(name);
    if ((!isContainment)) {
      return;
    }
    final Set<EObject> nodesToRemove = incomingSet.keySet();
    final Consumer<EObject> _function = (EObject it) -> {
      this.nodeToType.remove(it);
    };
    nodesToRemove.forEach(_function);
    final Procedure1<Multimap<EObject, EObject>> _function_1 = (Multimap<EObject, EObject> refMap) -> {
      final Consumer<EObject> _function_2 = (EObject it) -> {
        refMap.removeAll(it);
      };
      nodesToRemove.forEach(_function_2);
      Collection<EObject> values = refMap.values();
      values.removeAll(nodesToRemove);
      return;
    };
    final Procedure1<Multimap<EObject, EObject>> removeForMultimap = _function_1;
    IterableExtensions.<Multimap<EObject, EObject>>forEach(this.incomingEdges.values(), removeForMultimap);
    IterableExtensions.<Multimap<EObject, EObject>>forEach(this.outgoingEdges.values(), removeForMultimap);
  }
  
  /**
   * calculate the out degree for an object
   */
  public int outDegree(final EObject o) {
    int count = 0;
    for (final String type : this.edgeTypes) {
      int _count = count;
      int _size = this.outgoingEdges.get(type).get(o).size();
      count = (_count + _size);
    }
    return count;
  }
  
  /**
   * calculate the in degree of an object
   */
  public int inDegree(final EObject o) {
    int count = 0;
    for (final String type : this.edgeTypes) {
      int _count = count;
      int _size = this.incomingEdges.get(type).get(o).size();
      count = (_count + _size);
    }
    return count;
  }
  
  /**
   * calculate the dimentional degree of a node
   */
  public int dimentionalDegree(final EObject o, final String type) {
    int _size = this.incomingEdges.get(type).get(o).size();
    int _size_1 = this.outgoingEdges.get(type).get(o).size();
    return (_size + _size_1);
  }
  
  /**
   * calculate the number of edge types for a given node.
   */
  public int numOfEdgeTypes(final EObject o) {
    int count = 0;
    for (final String type : this.edgeTypes) {
      int _dimentionalDegree = this.dimentionalDegree(o, type);
      boolean _greaterThan = (_dimentionalDegree > 0);
      if (_greaterThan) {
        count++;
      }
    }
    return count;
  }
  
  public List<String> getAllTypes() {
    return IterableExtensions.<String>toList(this.edgeTypes);
  }
  
  public Map<EObject, Set<String>> getNodeToTypesMap() {
    return this.nodeToType;
  }
  
  public List<EObject> getAllNodes() {
    return IterableExtensions.<EObject>toList(this.nodeToType.keySet());
  }
  
  public HashMap<String, Multimap<EObject, EObject>> getOutgoingEdges() {
    return this.outgoingEdges;
  }
  
  public HashMap<String, Multimap<EObject, EObject>> incomingEdges() {
    return this.incomingEdges;
  }
}
