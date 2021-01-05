package hu.bme.mit.inf.dslreasoner.diversitycalculator;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@Data
@SuppressWarnings("all")
public class PatternWithMatches {
  private final String name;
  
  private final List<List<DefinedElement>> matches;
  
  public PatternWithMatches(final String name, final List<List<DefinedElement>> matches) {
    super();
    this.name = name;
    this.matches = matches;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.name== null) ? 0 : this.name.hashCode());
    return prime * result + ((this.matches== null) ? 0 : this.matches.hashCode());
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
    PatternWithMatches other = (PatternWithMatches) obj;
    if (this.name == null) {
      if (other.name != null)
        return false;
    } else if (!this.name.equals(other.name))
      return false;
    if (this.matches == null) {
      if (other.matches != null)
        return false;
    } else if (!this.matches.equals(other.matches))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("name", this.name);
    b.add("matches", this.matches);
    return b.toString();
  }
  
  @Pure
  public String getName() {
    return this.name;
  }
  
  @Pure
  public List<List<DefinedElement>> getMatches() {
    return this.matches;
  }
}
