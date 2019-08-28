package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.distance;

import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class StateData {
  @Accessors(AccessorType.PUBLIC_GETTER)
  private double[] features;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private double value;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  private Object lastState;
  
  public StateData(final double[] features, final double value, final Object lastState) {
    this.features = features;
    this.value = value;
    this.lastState = lastState;
  }
  
  @Pure
  public double[] getFeatures() {
    return this.features;
  }
  
  @Pure
  public double getValue() {
    return this.value;
  }
  
  @Pure
  public Object getLastState() {
    return this.lastState;
  }
}
