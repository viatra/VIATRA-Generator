package modes3.run;

import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic;
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.Modality;
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.LinearBoundedExpression;
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.LinearTypeConstraintHint;
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.LinearTypeExpressionBuilderFactory;
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.RelationConstraintUpdater;
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns.PatternGenerator;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import java.util.Iterator;
import java.util.Map;
import modes3.Modes3Package;
import modes3.queries.Adjacent;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class Modes3TypeScopeHint implements LinearTypeConstraintHint {
  private static final String TURNOUT_NEIGHBOR_COUNT = "turnoutNeighborCount";
  
  private final Type segmentType;
  
  private final Type turnoutType;
  
  public Modes3TypeScopeHint(@Extension final Ecore2Logic ecore2Logic, final Ecore2Logic_Trace ecore2LogicTrace) {
    @Extension
    final Modes3Package Modes3Package = modes3.Modes3Package.eINSTANCE;
    this.segmentType = ecore2Logic.TypeofEClass(ecore2LogicTrace, Modes3Package.getSegment());
    this.turnoutType = ecore2Logic.TypeofEClass(ecore2LogicTrace, Modes3Package.getTurnout());
  }
  
  @Override
  public CharSequence getAdditionalPatterns(@Extension final PatternGenerator patternGenerator, final Map<String, PQuery> fqnToPQuery) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("pattern ");
    _builder.append(Modes3TypeScopeHint.TURNOUT_NEIGHBOR_COUNT, "\t");
    _builder.append("_helper(problem: LogicProblem, interpretation: PartialInterpretation, source: DefinedElement, target: DefinedElement) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("find interpretation(problem, interpretation);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("find mustExist(problem, interpretation, source);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("find mustExist(problem, interpretation, target);");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _referInstanceOf = patternGenerator.getTypeIndexer().referInstanceOf(this.turnoutType, Modality.MUST, "source");
    _builder.append(_referInstanceOf, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    CharSequence _referInstanceOf_1 = patternGenerator.getTypeIndexer().referInstanceOf(this.segmentType, Modality.MUST, "target");
    _builder.append(_referInstanceOf_1, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    CharSequence _referPattern = patternGenerator.getRelationDefinitionIndexer().referPattern(fqnToPQuery.get(Adjacent.instance().getFullyQualifiedName()), new String[] { "source", "target" }, Modality.MUST, true, false);
    _builder.append(_referPattern, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("pattern ");
    _builder.append(Modes3TypeScopeHint.TURNOUT_NEIGHBOR_COUNT, "\t");
    _builder.append("(problem: LogicProblem, interpretation: PartialInterpretation, element: DefinedElement, N) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("find interpretation(problem, interpretation);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("find mustExist(problem, interpretation, element);");
    _builder.newLine();
    _builder.append("\t\t");
    CharSequence _referInstanceOf_2 = patternGenerator.getTypeIndexer().referInstanceOf(this.turnoutType, Modality.MUST, "element");
    _builder.append(_referInstanceOf_2, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("N == count find ");
    _builder.append(Modes3TypeScopeHint.TURNOUT_NEIGHBOR_COUNT, "\t\t");
    _builder.append("_helper(problem, interpretation, element, _);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  public RelationConstraintUpdater createConstraintUpdater(final LinearTypeExpressionBuilderFactory builderFactory) {
    final ViatraQueryMatcher<? extends IPatternMatch> turnoutNeighborCountMatcher = builderFactory.createMatcher(Modes3TypeScopeHint.TURNOUT_NEIGHBOR_COUNT);
    final LinearBoundedExpression newNeighbors = builderFactory.createBuilder().add(1, this.segmentType).build();
    final RelationConstraintUpdater _function = (PartialInterpretation partialInterpretation) -> {
      final int requiredNeighbbors = Modes3TypeScopeHint.getRemainingCount(turnoutNeighborCountMatcher, partialInterpretation, 3);
      newNeighbors.tightenLowerBound(Integer.valueOf(requiredNeighbbors));
    };
    return _function;
  }
  
  private static <T extends IPatternMatch> int getRemainingCount(final ViatraQueryMatcher<T> matcher, final PartialInterpretation partialInterpretation, final int capacity) {
    int _xblockexpression = (int) 0;
    {
      final T partialMatch = matcher.newEmptyMatch();
      partialMatch.set(0, partialInterpretation.getProblem());
      partialMatch.set(1, partialInterpretation);
      final Iterator<T> iterator = matcher.streamAllMatches(partialMatch).iterator();
      int max = 0;
      while (iterator.hasNext()) {
        {
          final T match = iterator.next();
          Object _get = match.get(3);
          final int n = ((Integer) _get).intValue();
          if ((n < capacity)) {
            final int required = (capacity - n);
            if ((max < required)) {
              max = required;
            }
          }
        }
      }
      _xblockexpression = max;
    }
    return _xblockexpression;
  }
}
