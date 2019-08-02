package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.GraphStatistic;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.Metric;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class NodeTypeMetric extends Metric {
  @Override
  public String[][] evaluate(final GraphStatistic g) {
    Object _evaluateSamples = this.evaluateSamples(g);
    HashMap<String, Double> map = ((HashMap<String, Double>) _evaluateSamples);
    ArrayList<String[]> output = new ArrayList<String[]>();
    output.add(((String[])Conversions.unwrapArray(CollectionLiterals.<String>newArrayList("Node Type"), String.class)));
    Set<String> keys = map.keySet();
    ArrayList<String> values = CollectionLiterals.<String>newArrayList();
    for (final String key : keys) {
      Double _get = map.get(key);
      String _plus = (_get + "");
      values.add(_plus);
    }
    final Set<String> _converted_keys = (Set<String>)keys;
    output.add(((String[])Conversions.unwrapArray(_converted_keys, String.class)));
    final ArrayList<String> _converted_values = (ArrayList<String>)values;
    output.add(((String[])Conversions.unwrapArray(_converted_values, String.class)));
    return ((String[][])Conversions.unwrapArray(output, String[].class));
  }
  
  @Override
  public Object evaluateSamples(final GraphStatistic g) {
    HashMap<String, Double> map = new HashMap<String, Double>();
    List<EObject> nodes = g.getAllNodes();
    int _size = nodes.size();
    double single = (1.0 / _size);
    Map<EObject, Set<String>> nodeToType = g.getNodeToTypesMap();
    for (final EObject node : nodes) {
      Set<String> _get = nodeToType.get(node);
      for (final String cl : _get) {
        {
          Double value = map.getOrDefault(cl, Double.valueOf(0.0));
          map.put(cl, Double.valueOf(((value).doubleValue() + single)));
        }
      }
    }
    return map;
  }
}
