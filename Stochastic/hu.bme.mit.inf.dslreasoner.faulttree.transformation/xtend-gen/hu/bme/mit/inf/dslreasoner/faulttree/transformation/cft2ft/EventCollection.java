package hu.bme.mit.inf.dslreasoner.faulttree.transformation.cft2ft;

import com.google.common.collect.ImmutableSet;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ConstantEvent;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Event;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.RandomEvent;
import java.util.Set;
import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@Data
@SuppressWarnings("all")
public class EventCollection {
  public static class Builder {
    private int falseEventCount = 0;
    
    private int trueEventCount = 0;
    
    private final ImmutableSet.Builder<RandomEvent> randomEventsBuilder = ImmutableSet.<RandomEvent>builder();
    
    private Builder() {
    }
    
    public EventCollection.Builder add(final Event event) {
      EventCollection.Builder _xblockexpression = null;
      {
        boolean _matched = false;
        if (event instanceof ConstantEvent) {
          _matched=true;
          boolean _isFailed = ((ConstantEvent)event).isFailed();
          if (_isFailed) {
            this.trueEventCount++;
          } else {
            this.falseEventCount++;
          }
        }
        if (!_matched) {
          if (event instanceof RandomEvent) {
            _matched=true;
            this.randomEventsBuilder.add(((RandomEvent)event));
          }
        }
        if (!_matched) {
          throw new IllegalArgumentException(("Unknown event: " + event));
        }
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
    
    public EventCollection.Builder addAll(final EventCollection materializedEvens) {
      EventCollection.Builder _xblockexpression = null;
      {
        int _falseEventCount = this.falseEventCount;
        this.falseEventCount = (_falseEventCount + materializedEvens.falseEventCount);
        int _trueEventCount = this.trueEventCount;
        this.trueEventCount = (_trueEventCount + materializedEvens.trueEventCount);
        this.randomEventsBuilder.addAll(materializedEvens.randomEvents);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
    
    public EventCollection build() {
      ImmutableSet<RandomEvent> _build = this.randomEventsBuilder.build();
      return new EventCollection(this.falseEventCount, this.trueEventCount, _build);
    }
  }
  
  private final int falseEventCount;
  
  private final int trueEventCount;
  
  private final Set<RandomEvent> randomEvents;
  
  public boolean containsFalseEvent() {
    return (this.falseEventCount >= 1);
  }
  
  public boolean containsTrueEvent() {
    return (this.trueEventCount >= 1);
  }
  
  public int getVariableEventCount() {
    return this.randomEvents.size();
  }
  
  public boolean containsRandomEvent() {
    int _variableEventCount = this.getVariableEventCount();
    return (_variableEventCount >= 1);
  }
  
  public int getCount() {
    int _variableEventCount = this.getVariableEventCount();
    return ((this.falseEventCount + this.trueEventCount) + _variableEventCount);
  }
  
  public boolean isEmpty() {
    return (((!this.containsFalseEvent()) && (!this.containsTrueEvent())) && (!this.containsRandomEvent()));
  }
  
  public boolean containsExactlyOneRandomEvent() {
    return (((!this.containsFalseEvent()) && (!this.containsTrueEvent())) && (this.getVariableEventCount() == 1));
  }
  
  public RandomEvent toSingleRandomEvent() {
    RandomEvent _xblockexpression = null;
    {
      boolean _containsExactlyOneRandomEvent = this.containsExactlyOneRandomEvent();
      boolean _not = (!_containsExactlyOneRandomEvent);
      if (_not) {
        throw new IllegalStateException("Input collection is not a single random event");
      }
      _xblockexpression = IterableExtensions.<RandomEvent>head(this.randomEvents);
    }
    return _xblockexpression;
  }
  
  public static EventCollection.Builder builder() {
    return new EventCollection.Builder();
  }
  
  public EventCollection(final int falseEventCount, final int trueEventCount, final Set<RandomEvent> randomEvents) {
    super();
    this.falseEventCount = falseEventCount;
    this.trueEventCount = trueEventCount;
    this.randomEvents = randomEvents;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + this.falseEventCount;
    result = prime * result + this.trueEventCount;
    return prime * result + ((this.randomEvents== null) ? 0 : this.randomEvents.hashCode());
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    EventCollection other = (EventCollection) obj;
    if (other.falseEventCount != this.falseEventCount)
      return false;
    if (other.trueEventCount != this.trueEventCount)
      return false;
    if (this.randomEvents == null) {
      if (other.randomEvents != null)
        return false;
    } else if (!this.randomEvents.equals(other.randomEvents))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("falseEventCount", this.falseEventCount);
    b.add("trueEventCount", this.trueEventCount);
    b.add("randomEvents", this.randomEvents);
    return b.toString();
  }
  
  @Pure
  public int getFalseEventCount() {
    return this.falseEventCount;
  }
  
  @Pure
  public int getTrueEventCount() {
    return this.trueEventCount;
  }
  
  @Pure
  public Set<RandomEvent> getRandomEvents() {
    return this.randomEvents;
  }
}
