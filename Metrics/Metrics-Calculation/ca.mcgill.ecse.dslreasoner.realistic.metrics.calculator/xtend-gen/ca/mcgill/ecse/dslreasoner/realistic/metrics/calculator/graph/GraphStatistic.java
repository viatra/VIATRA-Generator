package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class GraphStatistic {
  private final HashMap<String, Multimap<EObject, EObject>> incomingEdges = new HashMap<String, Multimap<EObject, EObject>>();
  
  private final HashMap<String, Multimap<EObject, EObject>> outcomingEdges = new HashMap<String, Multimap<EObject, EObject>>();
  
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
    this.outcomingEdges.put(type, ArrayListMultimap.<EObject, EObject>create());
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
    this.outcomingEdges.get(type).put(source, target);
    this.incomingEdges.get(type).put(target, source);
  }
  
  /**
   * calculate the out degree for an object
   */
  public int outDegree(final EObject o) {
    int count = 0;
    for (final String type : this.edgeTypes) {
      int _count = count;
      int _size = this.outcomingEdges.get(type).get(o).size();
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
    int _size_1 = this.outcomingEdges.get(type).get(o).size();
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
    return this.outcomingEdges;
  }
}
