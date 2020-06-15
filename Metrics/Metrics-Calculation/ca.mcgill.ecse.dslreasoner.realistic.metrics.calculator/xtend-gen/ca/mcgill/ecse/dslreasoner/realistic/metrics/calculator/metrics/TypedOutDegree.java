package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.GraphStatistic;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.Metric;
import com.google.common.collect.Multimap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class TypedOutDegree extends Metric {
  private HashMap<String, List<Integer>> calculateMetric(final GraphStatistic g) {
    HashMap<String, Multimap<EObject, EObject>> outgoingEdges = g.getOutgoingEdges();
    HashMap<String, List<Integer>> metric = new HashMap<String, List<Integer>>();
    Map<EObject, Set<String>> nodeToTypes = g.getNodeToTypesMap();
    Set<String> _keySet = outgoingEdges.keySet();
    for (final String edgeType : _keySet) {
      Set<EObject> _keySet_1 = outgoingEdges.get(edgeType).keySet();
      for (final EObject node : _keySet_1) {
        {
          Set<String> classes = nodeToTypes.get(node);
          for (final String cl : classes) {
            {
              String key = ((cl + " ") + edgeType);
              List<Integer> typeCount = metric.get(key);
              if ((typeCount == null)) {
                ArrayList<Integer> _arrayList = new ArrayList<Integer>();
                typeCount = _arrayList;
                metric.put(key, typeCount);
              }
              typeCount.add(Integer.valueOf(outgoingEdges.get(edgeType).get(node).size()));
            }
          }
        }
      }
    }
    return metric;
  }
  
  @Override
  public String[][] evaluate(final GraphStatistic g) {
    HashMap<String, List<Integer>> metric = this.calculateMetric(g);
    ArrayList<String[]> output = new ArrayList<String[]>();
    output.add(((String[])Conversions.unwrapArray(CollectionLiterals.<String>newArrayList("Typed Out Degree"), String.class)));
    Set<String> _keySet = metric.keySet();
    for (final String key : _keySet) {
      {
        List<Integer> samples = metric.get(key);
        int _size = samples.size();
        int _plus = (_size + 1);
        String[] outputForOnePair = new String[_plus];
        outputForOnePair[0] = key;
        for (int i = 0; (i < samples.size()); i++) {
          Integer _get = samples.get(i);
          String _plus_1 = (_get + "");
          outputForOnePair[(i + 1)] = _plus_1;
        }
        output.add(outputForOnePair);
      }
    }
    return ((String[][])Conversions.unwrapArray(output, String[].class));
  }
  
  @Override
  public Object evaluateSamples(final GraphStatistic g) {
    return this.calculateMetric(g);
  }
}
