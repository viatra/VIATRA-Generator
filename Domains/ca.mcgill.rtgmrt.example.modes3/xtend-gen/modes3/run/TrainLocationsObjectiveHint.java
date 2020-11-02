package modes3.run;

import com.google.common.collect.ImmutableList;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.Dimension;
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.ExtendedLinearExpressionBuilder;
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.ExtendedLinearExpressionBuilderFactory;
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.PolyhedronExtensionOperator;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.CostElementMatch;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.CostElementMatchers;
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.CostObjectiveHint;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import modes3.Modes3Package;
import modes3.queries.TrainLocations_step_2;
import modes3.queries.TrainLocations_step_3;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class TrainLocationsObjectiveHint extends CostObjectiveHint {
  private final Type segmentType;
  
  private final Type trainType;
  
  public TrainLocationsObjectiveHint(@Extension final Ecore2Logic ecore2Logic, final Ecore2Logic_Trace ecore2LogicTrace) {
    @Extension
    final Modes3Package Modes3Package = modes3.Modes3Package.eINSTANCE;
    this.segmentType = ecore2Logic.TypeofEClass(ecore2LogicTrace, Modes3Package.getSegment());
    this.trainType = ecore2Logic.TypeofEClass(ecore2LogicTrace, Modes3Package.getTrain());
  }
  
  @Override
  public boolean isExact() {
    return true;
  }
  
  @Override
  public PolyhedronExtensionOperator createPolyhedronExtensionOperator(final Map<String, CostElementMatchers> costElementMatchers) {
    PolyhedronExtensionOperator _xblockexpression = null;
    {
      final CostElementMatchers step2 = costElementMatchers.get(TrainLocations_step_2.instance().getFullyQualifiedName());
      final CostElementMatchers step3 = costElementMatchers.get(TrainLocations_step_3.instance().getFullyQualifiedName());
      final PolyhedronExtensionOperator _function = (ExtendedLinearExpressionBuilderFactory it) -> {
        final ExtendedLinearExpressionBuilder objectiveBuilder = it.createBuilder();
        ImmutableList<CostElementMatch> _matches = step2.getMatches();
        for (final CostElementMatch m : _matches) {
          {
            final Dimension dimension = it.getDimension(m.getMatch());
            objectiveBuilder.add(step2.getWeight(), dimension);
            dimension.tightenLowerBound(Integer.valueOf(0));
            boolean _isMulti = m.isMulti();
            if (_isMulti) {
              it.createBuilder().add(1, dimension).add((-1), this.trainType).build().assertEqualsTo(0);
            } else {
              dimension.tightenUpperBound(Integer.valueOf(1));
              boolean _isMust = m.isMust();
              if (_isMust) {
                dimension.tightenLowerBound(Integer.valueOf(1));
              }
            }
          }
        }
        final ImmutableList<CostElementMatch> step3Matches = step3.getMatches();
        for (final CostElementMatch m_1 : step3Matches) {
          {
            final Dimension dimension = it.getDimension(m_1.getMatch());
            objectiveBuilder.add(step3.getWeight(), dimension);
            dimension.tightenLowerBound(Integer.valueOf(0));
            boolean _isMulti = m_1.isMulti();
            boolean _not = (!_isMulti);
            if (_not) {
              dimension.tightenUpperBound(Integer.valueOf(1));
              boolean _isMust = m_1.isMust();
              if (_isMust) {
                dimension.tightenLowerBound(Integer.valueOf(1));
              }
            }
          }
        }
        TrainLocationsObjectiveHint.boundLimit(it, step3Matches, 2, this.trainType, 1);
        TrainLocationsObjectiveHint.boundLimit(it, step3Matches, 3, this.segmentType, 1);
        this.buildWithBounds(objectiveBuilder);
      };
      _xblockexpression = _function;
    }
    return _xblockexpression;
  }
  
  private static void boundLimit(@Extension final ExtendedLinearExpressionBuilderFactory factory, final Collection<CostElementMatch> matches, final int index, final Type type, final int count) {
    final Function1<CostElementMatch, Object> _function = (CostElementMatch it) -> {
      return it.getMatch().get(index);
    };
    Set<Map.Entry<Object, List<CostElementMatch>>> _entrySet = IterableExtensions.<Object, CostElementMatch>groupBy(matches, _function).entrySet();
    for (final Map.Entry<Object, List<CostElementMatch>> pair : _entrySet) {
      {
        final ExtendedLinearExpressionBuilder multiplicityBuilder = factory.createBuilder();
        List<CostElementMatch> _value = pair.getValue();
        for (final CostElementMatch m : _value) {
          multiplicityBuilder.add(1, m.getMatch());
        }
        boolean _isMulti = CostElementMatchers.isMulti(pair.getKey());
        if (_isMulti) {
          multiplicityBuilder.add((-count), type);
          multiplicityBuilder.build().tightenUpperBound(Integer.valueOf(0));
        } else {
          multiplicityBuilder.build().tightenUpperBound(Integer.valueOf(count));
        }
      }
    }
  }
}
