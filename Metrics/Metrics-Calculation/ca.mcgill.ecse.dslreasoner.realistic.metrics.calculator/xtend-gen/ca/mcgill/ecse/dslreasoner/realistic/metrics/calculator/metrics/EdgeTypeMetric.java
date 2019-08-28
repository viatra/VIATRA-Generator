package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.GraphStatistic;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.Metric;
import com.google.common.collect.Multimap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.function.BiConsumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class EdgeTypeMetric extends Metric {
  @Override
  public String[][] evaluate(final GraphStatistic g) {
    Object _evaluateSamples = this.evaluateSamples(g);
    HashMap<String, Double> map = ((HashMap<String, Double>) _evaluateSamples);
    ArrayList<String[]> output = new ArrayList<String[]>();
    output.add(((String[])Conversions.unwrapArray(CollectionLiterals.<String>newArrayList("Edge Type"), String.class)));
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
    final HashMap<String, Double> map = new HashMap<String, Double>();
    HashMap<String, Multimap<EObject, EObject>> outgoingEdges = g.getOutgoingEdges();
    final Function2<Integer, Multimap<EObject, EObject>, Integer> _function = (Integer r, Multimap<EObject, EObject> t) -> {
      final Function2<Integer, Collection<EObject>, Integer> _function_1 = (Integer r1, Collection<EObject> t1) -> {
        int _size = t1.size();
        return Integer.valueOf(((r1).intValue() + _size));
      };
      Integer _fold = IterableExtensions.<Collection<EObject>, Integer>fold(t.asMap().values(), Integer.valueOf(0), _function_1);
      return Integer.valueOf(((r).intValue() + (_fold).intValue()));
    };
    Integer _fold = IterableExtensions.<Multimap<EObject, EObject>, Integer>fold(outgoingEdges.values(), Integer.valueOf(0), _function);
    final double edgeCount = ((double) (int) _fold);
    final BiConsumer<String, Multimap<EObject, EObject>> _function_1 = (String k, Multimap<EObject, EObject> v) -> {
      final Function2<Integer, Collection<EObject>, Integer> _function_2 = (Integer r, Collection<EObject> t) -> {
        int _size = t.size();
        return Integer.valueOf(((r).intValue() + _size));
      };
      Integer _fold_1 = IterableExtensions.<Collection<EObject>, Integer>fold(v.asMap().values(), Integer.valueOf(0), _function_2);
      double value = ((_fold_1).intValue() / edgeCount);
      map.put(k, Double.valueOf(value));
    };
    outgoingEdges.forEach(_function_1);
    return map;
  }
}
