package hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft;

import com.google.common.collect.ImmutableMap;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.LookupDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.MappingDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.TransformationDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft.LookupHandler;
import java.util.Map;
import org.eclipse.viatra.query.patternlanguage.emf.specification.SpecificationBuilder;
import org.eclipse.viatra.query.runtime.api.GenericQueryGroup;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.MapExtensions;

@SuppressWarnings("all")
public class MappingQueries {
  private final Map<MappingDefinition, ViatraQueryMatcher<? extends IPatternMatch>> matchersMap;
  
  public MappingQueries(final TransformationDefinition transformationDefinition, final ViatraQueryEngine viatraQueryEngine) {
    final SpecificationBuilder specificationBuilder = new SpecificationBuilder();
    final Function1<MappingDefinition, MappingDefinition> _function = (MappingDefinition it) -> {
      return it;
    };
    final Function1<MappingDefinition, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> _function_1 = (MappingDefinition it) -> {
      return specificationBuilder.getOrCreateSpecification(it.getPattern());
    };
    final Map<MappingDefinition, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> querySpecificationsMap = IterableExtensions.<MappingDefinition, MappingDefinition, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>>toMap(transformationDefinition.getMappingDefinitions(), _function, _function_1);
    GenericQueryGroup.of(((IQuerySpecification<?>[])Conversions.unwrapArray(querySpecificationsMap.values(), IQuerySpecification.class))).prepare(viatraQueryEngine);
    final Function1<IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>, ViatraQueryMatcher<? extends IPatternMatch>> _function_2 = (IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> it) -> {
      return it.getMatcher(viatraQueryEngine);
    };
    this.matchersMap = ImmutableMap.<MappingDefinition, ViatraQueryMatcher<? extends IPatternMatch>>copyOf(MapExtensions.<MappingDefinition, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>, ViatraQueryMatcher<? extends IPatternMatch>>mapValues(querySpecificationsMap, _function_2));
  }
  
  public ViatraQueryMatcher<? extends IPatternMatch> getMatcher(final MappingDefinition mappingDefinition) {
    ViatraQueryMatcher<? extends IPatternMatch> _xblockexpression = null;
    {
      final ViatraQueryMatcher<? extends IPatternMatch> matcher = this.matchersMap.get(mappingDefinition);
      if ((matcher == null)) {
        throw new IllegalArgumentException(("Unknown mapping definition: " + mappingDefinition));
      }
      _xblockexpression = matcher;
    }
    return _xblockexpression;
  }
  
  public LookupHandler createLookupHandler(final MappingDefinition mappingDefinition, final LookupDefinition lookupDefinition) {
    LookupHandler _xblockexpression = null;
    {
      final ViatraQueryMatcher<? extends IPatternMatch> lookedUpMatcher = this.getMatcher(lookupDefinition.getMapping());
      _xblockexpression = new LookupHandler(mappingDefinition, lookupDefinition, lookedUpMatcher);
    }
    return _xblockexpression;
  }
}
