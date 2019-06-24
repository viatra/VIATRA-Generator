package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.predictor

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance.StateData
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import weka.core.matrix.LinearRegression
import weka.core.matrix.Matrix

class LinearModel {
	var double ridge;
	var Map<Object, StateData> stateAndHistory;
	List<StateData> samples;
	
	new(double ridge){
		this.ridge = ridge;
		stateAndHistory = new HashMap<Object, StateData>();
		samples = new ArrayList<StateData>();
	}
	
	/**
	 * reset the current train data for regression to a new trajectory
	 * @param state: the last state of the trajectory
	 */
	def resetRegression(Object state){
		samples.clear();
		
		if(stateAndHistory.containsKey(state)){
			var data = stateAndHistory.get(state);
			var curState = state;
			
			samples.add(data);
			
			//loop through data until the oldest state in the record
			while(stateAndHistory.containsKey(data.lastState) && data.lastState != curState){
				curState = data.lastState;
				data = stateAndHistory.get(data.lastState);
				samples.add(data);
			}
		}
	}
	
	/**
	 * Add a new data point to the current training set
	 * @param state: the state on which the new data point is calculated
	 * @param features: the set of feature value(x)
	 * @param value: the value of the state (y)
	 * @param lastState: the state which transformed to current state, used to record the trajectory
	 */
	def feedData(Object state, double[] features, double value, Object lastState){
		var data = new StateData(features, value, lastState);
		stateAndHistory.put(state, data);
		samples.add(data);
	}
	
	/**
	 * get prediction for next state, without storing the data point into the training set
	 * @param features: the feature values of current state
	 * @param value: the value of the current state
	 * @param: featuresToPredict: the features of the state wanted to be predected
	 * @return the value of the state to be predicted
	 */
	def double getPredictionForNextDataSample(double[] features, double value, double[] featuresToPredict){		
		var data = new StateData(features, value, null);
		samples.add(data);
		
		// create training set from current data		
		val double[][] xSamples = samples.map[it.features];
		val double[] ySamples = samples.map[it.value];
		
		val x = new Matrix(xSamples);
		val y = new Matrix(ySamples, ySamples.size());  
		
		val regression = new LinearRegression(x, y, ridge);
		var prediction = predict(regression.coefficients, featuresToPredict);	
		
		//remove the last element just added
		samples.remove(samples.size - 1);
		return prediction;
	}
	
	def private predict(double[] parameters, double[] featuresToPredict){
		// the regression will add an initial column for 1's, the first parameter is constant term
		var result = parameters.get(0);
		for(var i = 0; i < featuresToPredict.length; i++){
			result += parameters.get(i) * featuresToPredict.get(i);
		}
		return result;
	}
}