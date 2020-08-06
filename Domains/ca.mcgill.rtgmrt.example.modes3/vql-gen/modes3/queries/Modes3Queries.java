/**
 * Generated from platform:/resource/ca.mcgill.rtgmrt.example.modes3/src/modes3/queries/Modes3Queries.vql
 */
package modes3.queries;

import modes3.queries.Adjacent;
import modes3.queries.ConnectedTo;
import modes3.queries.ConnectedToNotSymmetric;
import modes3.queries.ConnectedToReflexive;
import modes3.queries.ExtraInputOfTurnout;
import modes3.queries.NoExtraInputOfTurnout;
import modes3.queries.Output;
import modes3.queries.OutputReflexive;
import modes3.queries.Reachable;
import modes3.queries.TooManyExtraInputsOfTurnout;
import modes3.queries.TooManyInputsOfSegment;
import modes3.queries.Turnout;
import modes3.queries.TurnoutConnectedToBothOutputs;
import modes3.queries.TurnoutInSegments;
import modes3.queries.TurnoutOutput;
import modes3.queries.TurnoutOutputsAreSame;
import modes3.queries.Unreachable;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in Modes3Queries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file Modes3Queries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package modes3.queries, the group contains the definition of the following patterns: <ul>
 * <li>turnoutInSegments</li>
 * <li>connectedTo</li>
 * <li>connectedToNotSymmetric</li>
 * <li>connectedToReflexive</li>
 * <li>turnoutOutput</li>
 * <li>outputReflexive</li>
 * <li>turnoutOutputsAreSame</li>
 * <li>turnout</li>
 * <li>output</li>
 * <li>tooManyInputsOfSegment</li>
 * <li>turnoutConnectedToBothOutputs</li>
 * <li>extraInputOfTurnout</li>
 * <li>noExtraInputOfTurnout</li>
 * <li>tooManyExtraInputsOfTurnout</li>
 * <li>adjacent</li>
 * <li>reachable</li>
 * <li>unreachable</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class Modes3Queries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Modes3Queries instance() {
    if (INSTANCE == null) {
        INSTANCE = new Modes3Queries();
    }
    return INSTANCE;
  }
  
  private static Modes3Queries INSTANCE;
  
  private Modes3Queries() {
    querySpecifications.add(TurnoutInSegments.instance());
    querySpecifications.add(ConnectedTo.instance());
    querySpecifications.add(ConnectedToNotSymmetric.instance());
    querySpecifications.add(ConnectedToReflexive.instance());
    querySpecifications.add(TurnoutOutput.instance());
    querySpecifications.add(OutputReflexive.instance());
    querySpecifications.add(TurnoutOutputsAreSame.instance());
    querySpecifications.add(Turnout.instance());
    querySpecifications.add(Output.instance());
    querySpecifications.add(TooManyInputsOfSegment.instance());
    querySpecifications.add(TurnoutConnectedToBothOutputs.instance());
    querySpecifications.add(ExtraInputOfTurnout.instance());
    querySpecifications.add(NoExtraInputOfTurnout.instance());
    querySpecifications.add(TooManyExtraInputsOfTurnout.instance());
    querySpecifications.add(Adjacent.instance());
    querySpecifications.add(Reachable.instance());
    querySpecifications.add(Unreachable.instance());
  }
  
  public TurnoutInSegments getTurnoutInSegments() {
    return TurnoutInSegments.instance();
  }
  
  public TurnoutInSegments.Matcher getTurnoutInSegments(final ViatraQueryEngine engine) {
    return TurnoutInSegments.Matcher.on(engine);
  }
  
  public ConnectedTo getConnectedTo() {
    return ConnectedTo.instance();
  }
  
  public ConnectedTo.Matcher getConnectedTo(final ViatraQueryEngine engine) {
    return ConnectedTo.Matcher.on(engine);
  }
  
  public ConnectedToNotSymmetric getConnectedToNotSymmetric() {
    return ConnectedToNotSymmetric.instance();
  }
  
  public ConnectedToNotSymmetric.Matcher getConnectedToNotSymmetric(final ViatraQueryEngine engine) {
    return ConnectedToNotSymmetric.Matcher.on(engine);
  }
  
  public ConnectedToReflexive getConnectedToReflexive() {
    return ConnectedToReflexive.instance();
  }
  
  public ConnectedToReflexive.Matcher getConnectedToReflexive(final ViatraQueryEngine engine) {
    return ConnectedToReflexive.Matcher.on(engine);
  }
  
  public TurnoutOutput getTurnoutOutput() {
    return TurnoutOutput.instance();
  }
  
  public TurnoutOutput.Matcher getTurnoutOutput(final ViatraQueryEngine engine) {
    return TurnoutOutput.Matcher.on(engine);
  }
  
  public OutputReflexive getOutputReflexive() {
    return OutputReflexive.instance();
  }
  
  public OutputReflexive.Matcher getOutputReflexive(final ViatraQueryEngine engine) {
    return OutputReflexive.Matcher.on(engine);
  }
  
  public TurnoutOutputsAreSame getTurnoutOutputsAreSame() {
    return TurnoutOutputsAreSame.instance();
  }
  
  public TurnoutOutputsAreSame.Matcher getTurnoutOutputsAreSame(final ViatraQueryEngine engine) {
    return TurnoutOutputsAreSame.Matcher.on(engine);
  }
  
  public Turnout getTurnout() {
    return Turnout.instance();
  }
  
  public Turnout.Matcher getTurnout(final ViatraQueryEngine engine) {
    return Turnout.Matcher.on(engine);
  }
  
  public Output getOutput() {
    return Output.instance();
  }
  
  public Output.Matcher getOutput(final ViatraQueryEngine engine) {
    return Output.Matcher.on(engine);
  }
  
  public TooManyInputsOfSegment getTooManyInputsOfSegment() {
    return TooManyInputsOfSegment.instance();
  }
  
  public TooManyInputsOfSegment.Matcher getTooManyInputsOfSegment(final ViatraQueryEngine engine) {
    return TooManyInputsOfSegment.Matcher.on(engine);
  }
  
  public TurnoutConnectedToBothOutputs getTurnoutConnectedToBothOutputs() {
    return TurnoutConnectedToBothOutputs.instance();
  }
  
  public TurnoutConnectedToBothOutputs.Matcher getTurnoutConnectedToBothOutputs(final ViatraQueryEngine engine) {
    return TurnoutConnectedToBothOutputs.Matcher.on(engine);
  }
  
  public ExtraInputOfTurnout getExtraInputOfTurnout() {
    return ExtraInputOfTurnout.instance();
  }
  
  public ExtraInputOfTurnout.Matcher getExtraInputOfTurnout(final ViatraQueryEngine engine) {
    return ExtraInputOfTurnout.Matcher.on(engine);
  }
  
  public NoExtraInputOfTurnout getNoExtraInputOfTurnout() {
    return NoExtraInputOfTurnout.instance();
  }
  
  public NoExtraInputOfTurnout.Matcher getNoExtraInputOfTurnout(final ViatraQueryEngine engine) {
    return NoExtraInputOfTurnout.Matcher.on(engine);
  }
  
  public TooManyExtraInputsOfTurnout getTooManyExtraInputsOfTurnout() {
    return TooManyExtraInputsOfTurnout.instance();
  }
  
  public TooManyExtraInputsOfTurnout.Matcher getTooManyExtraInputsOfTurnout(final ViatraQueryEngine engine) {
    return TooManyExtraInputsOfTurnout.Matcher.on(engine);
  }
  
  public Adjacent getAdjacent() {
    return Adjacent.instance();
  }
  
  public Adjacent.Matcher getAdjacent(final ViatraQueryEngine engine) {
    return Adjacent.Matcher.on(engine);
  }
  
  public Reachable getReachable() {
    return Reachable.instance();
  }
  
  public Reachable.Matcher getReachable(final ViatraQueryEngine engine) {
    return Reachable.Matcher.on(engine);
  }
  
  public Unreachable getUnreachable() {
    return Unreachable.instance();
  }
  
  public Unreachable.Matcher getUnreachable(final ViatraQueryEngine engine) {
    return Unreachable.Matcher.on(engine);
  }
}
