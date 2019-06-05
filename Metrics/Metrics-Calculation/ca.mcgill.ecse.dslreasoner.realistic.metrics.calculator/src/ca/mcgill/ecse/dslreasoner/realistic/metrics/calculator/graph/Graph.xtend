package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.Metric
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.MetricSampleGroup
import java.util.ArrayList
import java.util.List
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.MultiplexParticipationCoefficientMetric
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.NodeActivityMetric
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.OutDegreeMetric

abstract class Graph {
	
	protected static val String META_MODEL_HEADER = "Meta Mode"
	protected static val String NUM_NODE_HEADER = "Number Of Nodes";
	protected static val String NUM_EDGE_TYPE_HEADER = "Number of Edge types"; 
	protected static val String STATE_ID_HEADER = "State Id";
	
	protected val statistic = new GraphStatistic();
	protected var List<Metric> metrics;
	protected var String name = "";
	protected var String metaModel = "";
	
	/**
	 * evaluate all metrics for this model
	 * return the result as a two dimentional list
	 */
	def ArrayList<ArrayList<String>> evaluateAllMetrics(){
		val result = new ArrayList<ArrayList<String>>();
		setBasicInformation(result);
		
		for(metric : this.metrics){
			val datas = metric.evaluate(this.statistic);
			for(row : datas){
				result.add(new ArrayList<String>(row));
			}
		}
		return result;
	}	
	
	def MetricSampleGroup evaluateAllMetricsToSamples(){
		var sample = new MetricSampleGroup();
		
		for(metric : this.metrics){
			if(metric instanceof MultiplexParticipationCoefficientMetric){
				sample.mpcSamples = metric.evaluateSamples(this.statistic);				
			}else if(metric instanceof NodeActivityMetric){
				sample.naSamples = metric.evaluateSamples(this.statistic);
			}else if(metric instanceof OutDegreeMetric){
				sample.outDegreeSamples = metric.evaluateSamples(this.statistic);
			}
		}
		
		return sample;
	}
	
	def void setBasicInformation(ArrayList<ArrayList<String>> result);
	
	def GraphStatistic getStatistic();
	
	def String getName();
}