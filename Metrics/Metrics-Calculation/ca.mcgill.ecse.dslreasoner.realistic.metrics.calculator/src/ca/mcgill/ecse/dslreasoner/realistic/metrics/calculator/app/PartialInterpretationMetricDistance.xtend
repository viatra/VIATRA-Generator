package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance.EuclideanDistance
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance.JSDistance
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance.KSDistance
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance.StateData
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.PartialInterpretationGraph
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.Metric
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.MultiplexParticipationCoefficientMetric
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.NodeActivityMetric
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.OutDegreeMetric
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.TypedOutDegree
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.predictor.LinearModel
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.apache.commons.math3.stat.regression.OLSMultipleLinearRegression
import org.eclipse.xtend.lib.annotations.Accessors

class PartialInterpretationMetricDistance {
	
	var KSDistance ks;
	var JSDistance js;
	var EuclideanDistance ed;
	var Map<Object, StateData> stateAndHistory;
	var OLSMultipleLinearRegression regression;
	List<StateData> samples;
	
	@Accessors(PUBLIC_GETTER)
	var LinearModel linearModel;
	
	
	new(){
		ks = new KSDistance(Domain.Yakinduum);
		js = new JSDistance(Domain.Yakinduum);
		ed = new EuclideanDistance(Domain.Yakinduum);
		regression = new OLSMultipleLinearRegression();
		regression.noIntercept = false;
		stateAndHistory = new HashMap<Object, StateData>();
		samples = new ArrayList<StateData>();
		linearModel = new LinearModel(0.01);
	}
	
	def MetricDistanceGroup calculateMetricDistanceKS(PartialInterpretation partial){
		val metrics = new ArrayList<Metric>();
		metrics.add(new OutDegreeMetric());
		metrics.add(new NodeActivityMetric());
		metrics.add(new MultiplexParticipationCoefficientMetric());
		metrics.add(new TypedOutDegree());
		
		val metricCalculator = new PartialInterpretationGraph(partial, metrics, null);		
		var metricSamples = metricCalculator.evaluateAllMetricsToSamples();
		
		var mpc = ks.mpcDistance(metricSamples.mpcSamples);
		var na = ks.naDistance(metricSamples.naSamples);
		var outDegree = ks.outDegreeDistance(metricSamples.outDegreeSamples);
		var typedOutDegree = ks.typedOutDegreeDistance(metricSamples.typedOutDegreeSamples);
		
		return new MetricDistanceGroup(mpc, na, outDegree, typedOutDegree);
	}
	
	def MetricDistanceGroup calculateMetricEuclidean(PartialInterpretation partial){
		val metrics = new ArrayList<Metric>();
		metrics.add(new OutDegreeMetric());
		metrics.add(new NodeActivityMetric());
		metrics.add(new MultiplexParticipationCoefficientMetric());
		metrics.add(new TypedOutDegree());
		
		val metricCalculator = new PartialInterpretationGraph(partial, metrics, null);		
		var metricSamples = metricCalculator.evaluateAllMetricsToSamples();
		
		var mpc = ed.mpcDistance(metricSamples.mpcSamples);
		var na = ed.naDistance(metricSamples.naSamples);
		var outDegree = ed.outDegreeDistance(metricSamples.outDegreeSamples);
		
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
		samples.clear();
		
		if(stateAndHistory.containsKey(state)){
			var data = stateAndHistory.get(state);
			
			var curState = state;
			
			samples.add(data);
			
			while(stateAndHistory.containsKey(data.lastState) && data.lastState != curState){
				curState = data.lastState;
				data = stateAndHistory.get(data.lastState);
				samples.add(data);
			}
					
			if(samples.size == 0){
				println('state: ' + state);
				println('last state: ' + data.lastState);
			}
		}
		println("trajectory sample size:" + samples.size)
	}
	
	def feedData(Object state, double[] features, double value, Object lastState){
		var data = new StateData(features, value, lastState);
		stateAndHistory.put(state, data);
		samples.add(data);
	}
	
	def getPredictionForNextDataSample(double[] features, double value, double[] featuresToPredict){	
		if(samples.size <= 4){
			println('OK');
		}	
		var data = new StateData(features, value, null);
		samples.add(data);
		
		// create training set from current data		
		var double[][] xSamples = samples.map[it.features];
		var double[] ySamples = samples.map[it.value];
		
		
		regression.newSampleData(ySamples, xSamples);
		var prediction = predict(featuresToPredict);	
		
		//remove the last element just added
		samples.remove(samples.size - 1);
		return prediction;
	}
	
	def private predict(double[] featuresToPredict){
		var parameters = regression.estimateRegressionParameters();
		// the regression will add an initial column for 1's, the first parameter is constant term
		var result = parameters.get(0);
		for(var i = 0; i < featuresToPredict.length; i++){
			result += parameters.get(i+1) * featuresToPredict.get(i);
		}
		return result;
	}
	
	def double[] calculateFeature(int step, int violations){
		var features = newDoubleArrayOfSize(2);
		//constant term
		features.set(0, 1);
		
		features.set(1, 1.0 / step);
//		features.set(2, violations);
//		features.set(3, Math.pow(violations, 2));
		
		return features;
	}
}

class MetricDistanceGroup{
	var double mpcDistance;
	var double naDistance;
	var double outDegreeDistance;
	var double typedOutDegreeDistance;
	
	new(double mpcDistance, double naDistance, double outDegreeDistance, double typedOutDegreeDistance){
		this.mpcDistance = mpcDistance;
		this.naDistance = naDistance;
		this.outDegreeDistance = outDegreeDistance;
		this.typedOutDegreeDistance = typedOutDegreeDistance;
	}
	
	new(double mpcDistance, double naDistance, double outDegreeDistance){
		this.mpcDistance = mpcDistance;
		this.naDistance = naDistance;
		this.outDegreeDistance = outDegreeDistance;
	}
	
	def double getTypedOutDegreeDistance(){
		return this.typedOutDegreeDistance;
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