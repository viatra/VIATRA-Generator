package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance.KSDistance
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.EMFGraph
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io.RepMetricsReader
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.Metric
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.MetricSampleGroup
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.MultiplexParticipationCoefficientMetric
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.NodeActivityMetric
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.NodeTypeMetric
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.OutDegreeMetric
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject

class EcoreMetricDistance {
	var KSDistance ks;
	var MetricSampleGroup g;
	
	
	new(Domain d){
		var metrics = RepMetricsReader.read(d);
		this.g = metrics;
		ks = new KSDistance(g);
	}
	
	def MetricDistanceGroup calculateMetricDistanceKS(EObject root){
		val metrics = new ArrayList<Metric>();
		metrics.add(new OutDegreeMetric());
		metrics.add(new NodeActivityMetric());
		metrics.add(new MultiplexParticipationCoefficientMetric());
		metrics.add(new NodeTypeMetric());
		val metricCalculator = new EMFGraph();		
		metricCalculator.init(root, metrics, null);
		var metricSamples = metricCalculator.evaluateAllMetricsToSamples();
		
		var mpc = ks.mpcDistance(metricSamples.mpcSamples);
		var na = ks.naDistance(metricSamples.naSamples);
		var outDegree = ks.outDegreeDistance(metricSamples.outDegreeSamples);
		var nodeType = ks.nodeTypeDistance(metricSamples.nodeTypeSamples);
		var distance = new MetricDistanceGroup(mpc, na, outDegree, nodeType);
		distance.nodeTypeInfo = metricSamples.nodeTypeSamples;
		return distance;
	}
}