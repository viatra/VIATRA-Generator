package hu.bme.mit.inf.dslreasoner.faulttree.transformation.solver;

import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SuppressWarnings("all")
public abstract class ReliabilityResult {
  @Data
  public static final class Solution extends ReliabilityResult {
    private final double lowerBound;
    
    private final double upperBound;
    
    public Solution(final double value) {
      this(value, value);
    }
    
    public Solution(final double lowerBound, final double upperBound) {
      if ((lowerBound > upperBound)) {
        throw new IllegalArgumentException("lowerBound must not be larger than upperBound");
      }
      this.lowerBound = lowerBound;
      this.upperBound = upperBound;
    }
    
    @Override
    public ReliabilityResult.Solution getOrThrow() {
      return this;
    }
    
    @Override
    @Pure
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + (int) (Double.doubleToLongBits(this.lowerBound) ^ (Double.doubleToLongBits(this.lowerBound) >>> 32));
      return prime * result + (int) (Double.doubleToLongBits(this.upperBound) ^ (Double.doubleToLongBits(this.upperBound) >>> 32));
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
      ReliabilityResult.Solution other = (ReliabilityResult.Solution) obj;
      if (Double.doubleToLongBits(other.lowerBound) != Double.doubleToLongBits(this.lowerBound))
        return false; 
      if (Double.doubleToLongBits(other.upperBound) != Double.doubleToLongBits(this.upperBound))
        return false; 
      return true;
    }
    
    @Override
    @Pure
    public String toString() {
      return new ToStringBuilder(this)
      	.addAllFields()
      	.toString();
    }
    
    @Pure
    public double getLowerBound() {
      return this.lowerBound;
    }
    
    @Pure
    public double getUpperBound() {
      return this.upperBound;
    }
  }
  
  @Data
  public static final class Unknown extends ReliabilityResult {
    private final String message;
    
    private final Throwable cause;
    
    @FinalFieldsConstructor
    public Unknown(final String message, final Throwable cause) {
      super();
      this.message = message;
      this.cause = cause;
    }
    
    public Unknown(final String message) {
      this(message, null);
    }
    
    @Override
    public ReliabilityResult.Solution getOrThrow() {
      throw new RuntimeException(this.message, this.cause);
    }
    
    @Override
    @Pure
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((this.message== null) ? 0 : this.message.hashCode());
      return prime * result + ((this.cause== null) ? 0 : this.cause.hashCode());
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
      ReliabilityResult.Unknown other = (ReliabilityResult.Unknown) obj;
      if (this.message == null) {
        if (other.message != null)
          return false;
      } else if (!this.message.equals(other.message))
        return false;
      if (this.cause == null) {
        if (other.cause != null)
          return false;
      } else if (!this.cause.equals(other.cause))
        return false;
      return true;
    }
    
    @Override
    @Pure
    public String toString() {
      return new ToStringBuilder(this)
      	.addAllFields()
      	.toString();
    }
    
    @Pure
    public String getMessage() {
      return this.message;
    }
    
    @Pure
    public Throwable getCause() {
      return this.cause;
    }
  }
  
  public static final ReliabilityResult.Unknown TIMEOUT = new ReliabilityResult.Unknown("Solver timed out");
  
  public static final ReliabilityResult.Unknown MEMOUT = new ReliabilityResult.Unknown("Solver out of memory");
  
  public abstract ReliabilityResult.Solution getOrThrow();
}
