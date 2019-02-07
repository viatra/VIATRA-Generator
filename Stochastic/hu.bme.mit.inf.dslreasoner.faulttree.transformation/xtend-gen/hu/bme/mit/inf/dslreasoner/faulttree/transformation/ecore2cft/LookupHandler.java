package hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft;

import com.google.common.base.Objects;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.LookupDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.MappingDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.MappingParameter;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft.ComponentFaultTreeTrace;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft.ComponentInstanceTrace;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.query.patternlanguage.emf.vql.Pattern;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class LookupHandler {
  private final int[] argumentIndices;
  
  private final ViatraQueryMatcher<? extends IPatternMatch> lookedUpMatcher;
  
  public LookupHandler(final MappingDefinition mappingDefinition, final LookupDefinition lookupDefinition, final ViatraQueryMatcher<? extends IPatternMatch> lookedUpMatcher) {
    EObject _eContainer = lookupDefinition.eContainer();
    boolean _notEquals = (!Objects.equal(_eContainer, mappingDefinition));
    if (_notEquals) {
      throw new IllegalArgumentException("lookupDefinition must be contained in mappingDefinition");
    }
    final int argumentCount = lookupDefinition.getArguments().size();
    int _length = ((Object[])Conversions.unwrapArray(lookedUpMatcher.getParameterNames(), Object.class)).length;
    boolean _notEquals_1 = (argumentCount != _length);
    if (_notEquals_1) {
      MappingDefinition _mapping = lookupDefinition.getMapping();
      Pattern _pattern = null;
      if (_mapping!=null) {
        _pattern=_mapping.getPattern();
      }
      String _name = null;
      if (_pattern!=null) {
        _name=_pattern.getName();
      }
      String _plus = ("lookupDefinition (name: " + _name);
      String _plus_1 = (_plus + 
        ") must have as many arguments as lookedUpMatcher (name: ");
      String _patternName = lookedUpMatcher.getPatternName();
      String _plus_2 = (_plus_1 + _patternName);
      String _plus_3 = (_plus_2 + ")");
      throw new IllegalArgumentException(_plus_3);
    }
    this.argumentIndices = new int[argumentCount];
    for (int i = 0; (i < argumentCount); i++) {
      {
        final MappingParameter argument = lookupDefinition.getArguments().get(i);
        final int argumentIndex = mappingDefinition.getParameters().indexOf(argument);
        this.argumentIndices[i] = argumentIndex;
      }
    }
    this.lookedUpMatcher = lookedUpMatcher;
  }
  
  public ComponentInstanceTrace lookupForMatch(final ComponentFaultTreeTrace faultTreeTrace, final IPatternMatch match) {
    ComponentInstanceTrace _xblockexpression = null;
    {
      final IPatternMatch lookedUpMatch = this.createLookedUpMatch(match);
      _xblockexpression = faultTreeTrace.lookup(lookedUpMatch);
    }
    return _xblockexpression;
  }
  
  private IPatternMatch createLookedUpMatch(final IPatternMatch match) {
    IPatternMatch _xblockexpression = null;
    {
      final IPatternMatch lookedUpMatch = this.lookedUpMatcher.newEmptyMatch();
      final int argumentCount = this.argumentIndices.length;
      for (int i = 0; (i < argumentCount); i++) {
        {
          final int argumentIndex = this.argumentIndices[i];
          Object argumentValue = match.get(argumentIndex);
          lookedUpMatch.set(i, argumentValue);
        }
      }
      _xblockexpression = lookedUpMatch;
    }
    return _xblockexpression;
  }
}
