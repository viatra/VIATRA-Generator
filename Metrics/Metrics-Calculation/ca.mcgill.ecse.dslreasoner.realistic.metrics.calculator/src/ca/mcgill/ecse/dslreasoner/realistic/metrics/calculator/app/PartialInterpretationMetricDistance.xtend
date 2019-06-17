package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance.JSDistance
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance.KSDistance
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance.StateData
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.PartialInterpretationGraph
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.Metric
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.MultiplexParticipationCoefficientMetric
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.NodeActivityMetric
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.OutDegreeMetric
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.ArrayList
import java.util.HashMap
import java.util.Map
import org.apache.commons.math3.stat.regression.SimpleRegression
import java.util.stream.DoubleStream.Builder

class PartialInterpretationMetricDistance {
	
	var KSDistance ks;
	var JSDistance js;
	var Map<Object, StateData> stateAndHistory;
	var SimpleRegression regression;
	
	
	new(){
		ks = new KSDistance(Domain.Yakinduum);
		js = new JSDistance(Domain.Yakinduum);
		regression = new SimpleRegression();
		stateAndHistory = new HashMap<Object, StateData>();
	}
	
	def MetricDistanceGroup calculateMetricDistanceKS(PartialInterpretation partial){
		val metrics = new ArrayList<Metric>();
		metrics.add(new OutDegreeMetric());
		metrics.add(new NodeActivityMetric());
		metrics.add(new MultiplexParticipationCoefficientMetric());
		
		val metricCalculator = new PartialInterpretationGraph(partial, metrics, null);		
		var metricSamples = metricCalculator.evaluateAllMetricsToSamples();
		
		var mpc = ks.mpcDistance(metricSamples.mpcSamples);
		var na = ks.naDistance(metricSamples.naSamples);
		var outDegree = ks.outDegreeDistance(metricSamples.outDegreeSamples);
		
		return new MetricDistanceGroup(mpc, na, outDegree);
	}
	
	def MetricDistanceGroup calculateMetricDistance(PartialInterpretation partial){
		val metrics = new ArrayList<Metric>();
		metrics.add(new OutDegreeMetric());
		metrics.add(new NodeActivityMetric());
		metrics.add(new MultiplexParticipationCoefficientMetric());
		
		val metricCalculator = new PartialInterpretationGraph(partial, metrics, null);		
		var metricSamples = metricCalculator.evaluateAllMetricsToSamples();
		
		var mpc = js.mpcDistance(metricSamples.mpcSamples);
		var na = js.naDistance(metricSamples.naSamples);
		var outDegree = js.outDegreeDistance(metricSamples.outDegreeSamples);
		
		return new MetricDistanceGroup(mpc, na, outDegree);
	}
	
	def resetRegression(Object state){
		regression = new SimpleRegression();
		
		if(stateAndHistory.containsKey(state)){
			var data = stateAndHistory.get(state);
			regression.addData(data.numOfNodeFeature, data.value);
			
			while(stateAndHistory.containsKey(data.lastState)){
				data = stateAndHistory.get(data.lastState);
				regression.addData(data.numOfNodeFeature, data.value);
			}
		}
	}
	
	def feedData(Object state, int numOfNodes, double value, Object lastState){
		var data = new StateData(numOfNodes, value, lastState);
		stateAndHistory.put(state, data);
		regression.addData(data.numOfNodeFeature, data.value);
	}
	
	def getPredictionForNextDataSample(int numOfNodes, double value, int numberOfNodesToPredict){
		var data = new StateData(numOfNodes, value, null);
		regression.addData(data.numOfNodeFeature, data.value);
		
		var prediction = predict(numberOfNodesToPredict);
		regression.removeData(data.numOfNodeFeature, data.value);
		return prediction;
	}
	
	def predict(int numOfNodes){
		var data = new StateData(numOfNodes, 0, null);
		return regression.predict(data.numOfNodeFeature);
	}
}

class MetricDistanceGroup{
	var double mpcDistance;
	var double naDistance;
	var double outDegreeDistance;
	
	new(double mpcDistance, double naDistance, double outDegreeDistance){
		this.mpcDistance = mpcDistance;
		this.naDistance = naDistance;
		this.outDegreeDistance = outDegreeDistance;
	}
	
	def double getMPCDistance(){
		return this.mpcDistance
	}
	
	def double getNADistance(){
		return this.naDistance
	}
	
	def double getOutDegreeDistance(){
		return this.outDegreeDistance
	}
}