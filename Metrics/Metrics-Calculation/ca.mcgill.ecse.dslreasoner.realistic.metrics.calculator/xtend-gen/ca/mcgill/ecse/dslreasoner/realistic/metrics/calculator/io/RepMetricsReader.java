package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app.Domain;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.EMFGraph;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io.DataName;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io.GraphReader;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.MetricSampleGroup;
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.impl.YakindummPackageImpl;
import java.util.HashMap;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Read the sample of the distribution of a metric provided the csv file of the metric
 */
@SuppressWarnings("all")
public class RepMetricsReader {
  public static MetricSampleGroup read(final Domain d) {
    GraphReader reader = new GraphReader(YakindummPackageImpl.eINSTANCE, ".xmi");
    String _name = d.name();
    String _plus = (DataName.REP_PATH + _name);
    String domainRepPath = (_plus + "/");
    MetricSampleGroup rep = new MetricSampleGroup();
    MetricSampleGroup out_d = RepMetricsReader.readMetrics(reader, (domainRepPath + DataName.OUT_D_REP));
    rep.mpcSamples = RepMetricsReader.readMetrics(reader, (domainRepPath + DataName.MPC_REP)).mpcSamples;
    rep.outDegreeSamples = out_d.outDegreeSamples;
    rep.naSamples = RepMetricsReader.readMetrics(reader, (domainRepPath + DataName.NA_REP)).naSamples;
    rep.typedOutDegreeSamples = out_d.typedOutDegreeSamples;
    rep.edgeTypeSamples = out_d.edgeTypeSamples;
    HashMap<String, Double> nodeTypeSamples = new HashMap<String, Double>();
    nodeTypeSamples.put("Entry", Double.valueOf(0.04257802080554814));
    nodeTypeSamples.put("Choice", Double.valueOf(0.1267671379034409));
    nodeTypeSamples.put("State", Double.valueOf(0.1596092291277674));
    nodeTypeSamples.put("Transition", Double.valueOf(0.6138636969858629));
    nodeTypeSamples.put("Statechart", Double.valueOf(0.010136036276340358));
    nodeTypeSamples.put("Region", Double.valueOf(0.04467858095492131));
    nodeTypeSamples.put("Exit", Double.valueOf(0.0018338223526273673));
    nodeTypeSamples.put("FinalState", Double.valueOf(0.0005334755934915977));
    rep.nodeTypeSamples = nodeTypeSamples;
    return rep;
  }
  
  /**
   * Read representative model
   */
  private static MetricSampleGroup readMetrics(final GraphReader r, final String path) {
    EMFGraph model = IterableExtensions.<EMFGraph>head(r.readModels(path));
    return model.evaluateAllMetricsToSamples();
  }
}
