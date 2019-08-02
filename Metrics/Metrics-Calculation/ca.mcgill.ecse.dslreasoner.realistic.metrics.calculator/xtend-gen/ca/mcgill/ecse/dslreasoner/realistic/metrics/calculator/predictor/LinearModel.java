package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.predictor;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance.StateData;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("all")
public class LinearModel {
  private double ridge;
  
  private Map<Object, StateData> stateAndHistory;
  
  private List<StateData> samples;
  
  public LinearModel(final double ridge) {
    this.ridge = ridge;
    HashMap<Object, StateData> _hashMap = new HashMap<Object, StateData>();
    this.stateAndHistory = _hashMap;
    ArrayList<StateData> _arrayList = new ArrayList<StateData>();
    this.samples = _arrayList;
  }
  
  /**
   * reset the current train data for regression to a new trajectory
   * @param state: the last state of the trajectory
   */
  public void resetRegression(final Object state) {
    this.samples.clear();
    boolean _containsKey = this.stateAndHistory.containsKey(state);
    if (_containsKey) {
      StateData data = this.stateAndHistory.get(state);
      Object curState = state;
      this.samples.add(data);
      while ((this.stateAndHistory.containsKey(data.getLastState()) && (!Objects.equal(data.getLastState(), curState)))) {
        {
          curState = data.getLastState();
          data = this.stateAndHistory.get(data.getLastState());
          this.samples.add(data);
        }
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
  public boolean feedData(final Object state, final double[] features, final double value, final Object lastState) {
    boolean _xblockexpression = false;
    {
      StateData data = new StateData(features, value, lastState);
      this.stateAndHistory.put(state, data);
      _xblockexpression = this.samples.add(data);
    }
    return _xblockexpression;
  }
  
  /**
   * get prediction for next state, without storing the data point into the training set
   * @param features: the feature values of current state
   * @param value: the value of the current state
   * @param: featuresToPredict: the features of the state wanted to be predected
   * @return the value of the state to be predicted
   */
  public double getPredictionForNextDataSample(final double[] features, final double value, final double[] featuresToPredict) {
    throw new Error("Unresolved compilation problems:"
      + "\nMatrix cannot be resolved."
      + "\nMatrix cannot be resolved."
      + "\nLinearRegression cannot be resolved."
      + "\ncoefficients cannot be resolved");
  }
  
  private double predict(final double[] parameters, final double[] featuresToPredict) {
    double result = parameters[0];
    for (int i = 0; (i < featuresToPredict.length); i++) {
      double _result = result;
      double _get = parameters[i];
      double _get_1 = featuresToPredict[i];
      double _multiply = (_get * _get_1);
      result = (_result + _multiply);
    }
    return result;
  }
}
