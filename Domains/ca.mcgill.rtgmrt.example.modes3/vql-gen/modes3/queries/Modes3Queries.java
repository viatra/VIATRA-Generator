/**
 * Generated from platform:/resource/ca.mcgill.rtgmrt.example.modes3/src/modes3/queries/Modes3Queries.vql
 */
package modes3.queries;

import modes3.queries.Adjacent;
import modes3.queries.CloseTrains_step_2;
import modes3.queries.CloseTrains_step_3;
import modes3.queries.CloseTrains_step_4;
import modes3.queries.CloseTrains_step_5;
import modes3.queries.CloseTrains_step_6;
import modes3.queries.CloseTrains_step_7;
import modes3.queries.ConnectedSegmentsDirected;
import modes3.queries.ConnectedTo;
import modes3.queries.ConnectedToNotSymmetric;
import modes3.queries.ConnectedToReflexive;
import modes3.queries.EndOfSiding_step_2;
import modes3.queries.EndOfSiding_step_3;
import modes3.queries.EndOfSiding_step_4;
import modes3.queries.EndOfSiding_step_5;
import modes3.queries.InputsOfTurnout;
import modes3.queries.MisalignedTurnout_step_2;
import modes3.queries.MisalignedTurnout_step_3;
import modes3.queries.MisalignedTurnout_step_4;
import modes3.queries.MisalignedTurnout_step_5;
import modes3.queries.MultipleConnectedTo;
import modes3.queries.Output;
import modes3.queries.OutputReflexive;
import modes3.queries.Reachable;
import modes3.queries.TooFewInputsOfTurnout;
import modes3.queries.TooManyInputsOfSegment;
import modes3.queries.TooManyInputsOfTurnout;
import modes3.queries.TrainLocations_step_2;
import modes3.queries.TrainLocations_step_3;
import modes3.queries.TurnoutConnectedToBothOutputs;
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
 * <li>connectedTo</li>
 * <li>connectedToNotSymmetric</li>
 * <li>connectedToReflexive</li>
 * <li>turnoutOutput</li>
 * <li>outputReflexive</li>
 * <li>turnoutOutputsAreSame</li>
 * <li>output</li>
 * <li>tooManyInputsOfSegment</li>
 * <li>turnoutConnectedToBothOutputs</li>
 * <li>adjacent</li>
 * <li>tooManyInputsOfTurnout</li>
 * <li>inputsOfTurnout</li>
 * <li>tooFewInputsOfTurnout</li>
 * <li>reachable</li>
 * <li>unreachable</li>
 * <li>closeTrains_step_2</li>
 * <li>closeTrains_step_3</li>
 * <li>closeTrains_step_4</li>
 * <li>closeTrains_step_5</li>
 * <li>closeTrains_step_6</li>
 * <li>closeTrains_step_7</li>
 * <li>trainLocations_step_2</li>
 * <li>trainLocations_step_3</li>
 * <li>misalignedTurnout_step_2</li>
 * <li>misalignedTurnout_step_3</li>
 * <li>misalignedTurnout_step_4</li>
 * <li>misalignedTurnout_step_5</li>
 * <li>connectedSegmentsDirected</li>
 * <li>endOfSiding_step_2</li>
 * <li>endOfSiding_step_3</li>
 * <li>endOfSiding_step_4</li>
 * <li>endOfSiding_step_5</li>
 * <li>multipleConnectedTo</li>
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
    querySpecifications.add(ConnectedTo.instance());
    querySpecifications.add(ConnectedToNotSymmetric.instance());
    querySpecifications.add(ConnectedToReflexive.instance());
    querySpecifications.add(TurnoutOutput.instance());
    querySpecifications.add(OutputReflexive.instance());
    querySpecifications.add(TurnoutOutputsAreSame.instance());
    querySpecifications.add(Output.instance());
    querySpecifications.add(TooManyInputsOfSegment.instance());
    querySpecifications.add(TurnoutConnectedToBothOutputs.instance());
    querySpecifications.add(Adjacent.instance());
    querySpecifications.add(TooManyInputsOfTurnout.instance());
    querySpecifications.add(InputsOfTurnout.instance());
    querySpecifications.add(TooFewInputsOfTurnout.instance());
    querySpecifications.add(Reachable.instance());
    querySpecifications.add(Unreachable.instance());
    querySpecifications.add(CloseTrains_step_2.instance());
    querySpecifications.add(CloseTrains_step_3.instance());
    querySpecifications.add(CloseTrains_step_4.instance());
    querySpecifications.add(CloseTrains_step_5.instance());
    querySpecifications.add(CloseTrains_step_6.instance());
    querySpecifications.add(CloseTrains_step_7.instance());
    querySpecifications.add(TrainLocations_step_2.instance());
    querySpecifications.add(TrainLocations_step_3.instance());
    querySpecifications.add(MisalignedTurnout_step_2.instance());
    querySpecifications.add(MisalignedTurnout_step_3.instance());
    querySpecifications.add(MisalignedTurnout_step_4.instance());
    querySpecifications.add(MisalignedTurnout_step_5.instance());
    querySpecifications.add(ConnectedSegmentsDirected.instance());
    querySpecifications.add(EndOfSiding_step_2.instance());
    querySpecifications.add(EndOfSiding_step_3.instance());
    querySpecifications.add(EndOfSiding_step_4.instance());
    querySpecifications.add(EndOfSiding_step_5.instance());
    querySpecifications.add(MultipleConnectedTo.instance());
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
  
  public Adjacent getAdjacent() {
    return Adjacent.instance();
  }
  
  public Adjacent.Matcher getAdjacent(final ViatraQueryEngine engine) {
    return Adjacent.Matcher.on(engine);
  }
  
  public TooManyInputsOfTurnout getTooManyInputsOfTurnout() {
    return TooManyInputsOfTurnout.instance();
  }
  
  public TooManyInputsOfTurnout.Matcher getTooManyInputsOfTurnout(final ViatraQueryEngine engine) {
    return TooManyInputsOfTurnout.Matcher.on(engine);
  }
  
  public InputsOfTurnout getInputsOfTurnout() {
    return InputsOfTurnout.instance();
  }
  
  public InputsOfTurnout.Matcher getInputsOfTurnout(final ViatraQueryEngine engine) {
    return InputsOfTurnout.Matcher.on(engine);
  }
  
  public TooFewInputsOfTurnout getTooFewInputsOfTurnout() {
    return TooFewInputsOfTurnout.instance();
  }
  
  public TooFewInputsOfTurnout.Matcher getTooFewInputsOfTurnout(final ViatraQueryEngine engine) {
    return TooFewInputsOfTurnout.Matcher.on(engine);
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
  
  public CloseTrains_step_2 getCloseTrains_step_2() {
    return CloseTrains_step_2.instance();
  }
  
  public CloseTrains_step_2.Matcher getCloseTrains_step_2(final ViatraQueryEngine engine) {
    return CloseTrains_step_2.Matcher.on(engine);
  }
  
  public CloseTrains_step_3 getCloseTrains_step_3() {
    return CloseTrains_step_3.instance();
  }
  
  public CloseTrains_step_3.Matcher getCloseTrains_step_3(final ViatraQueryEngine engine) {
    return CloseTrains_step_3.Matcher.on(engine);
  }
  
  public CloseTrains_step_4 getCloseTrains_step_4() {
    return CloseTrains_step_4.instance();
  }
  
  public CloseTrains_step_4.Matcher getCloseTrains_step_4(final ViatraQueryEngine engine) {
    return CloseTrains_step_4.Matcher.on(engine);
  }
  
  public CloseTrains_step_5 getCloseTrains_step_5() {
    return CloseTrains_step_5.instance();
  }
  
  public CloseTrains_step_5.Matcher getCloseTrains_step_5(final ViatraQueryEngine engine) {
    return CloseTrains_step_5.Matcher.on(engine);
  }
  
  public CloseTrains_step_6 getCloseTrains_step_6() {
    return CloseTrains_step_6.instance();
  }
  
  public CloseTrains_step_6.Matcher getCloseTrains_step_6(final ViatraQueryEngine engine) {
    return CloseTrains_step_6.Matcher.on(engine);
  }
  
  public CloseTrains_step_7 getCloseTrains_step_7() {
    return CloseTrains_step_7.instance();
  }
  
  public CloseTrains_step_7.Matcher getCloseTrains_step_7(final ViatraQueryEngine engine) {
    return CloseTrains_step_7.Matcher.on(engine);
  }
  
  public TrainLocations_step_2 getTrainLocations_step_2() {
    return TrainLocations_step_2.instance();
  }
  
  public TrainLocations_step_2.Matcher getTrainLocations_step_2(final ViatraQueryEngine engine) {
    return TrainLocations_step_2.Matcher.on(engine);
  }
  
  public TrainLocations_step_3 getTrainLocations_step_3() {
    return TrainLocations_step_3.instance();
  }
  
  public TrainLocations_step_3.Matcher getTrainLocations_step_3(final ViatraQueryEngine engine) {
    return TrainLocations_step_3.Matcher.on(engine);
  }
  
  public MisalignedTurnout_step_2 getMisalignedTurnout_step_2() {
    return MisalignedTurnout_step_2.instance();
  }
  
  public MisalignedTurnout_step_2.Matcher getMisalignedTurnout_step_2(final ViatraQueryEngine engine) {
    return MisalignedTurnout_step_2.Matcher.on(engine);
  }
  
  public MisalignedTurnout_step_3 getMisalignedTurnout_step_3() {
    return MisalignedTurnout_step_3.instance();
  }
  
  public MisalignedTurnout_step_3.Matcher getMisalignedTurnout_step_3(final ViatraQueryEngine engine) {
    return MisalignedTurnout_step_3.Matcher.on(engine);
  }
  
  public MisalignedTurnout_step_4 getMisalignedTurnout_step_4() {
    return MisalignedTurnout_step_4.instance();
  }
  
  public MisalignedTurnout_step_4.Matcher getMisalignedTurnout_step_4(final ViatraQueryEngine engine) {
    return MisalignedTurnout_step_4.Matcher.on(engine);
  }
  
  public MisalignedTurnout_step_5 getMisalignedTurnout_step_5() {
    return MisalignedTurnout_step_5.instance();
  }
  
  public MisalignedTurnout_step_5.Matcher getMisalignedTurnout_step_5(final ViatraQueryEngine engine) {
    return MisalignedTurnout_step_5.Matcher.on(engine);
  }
  
  public ConnectedSegmentsDirected getConnectedSegmentsDirected() {
    return ConnectedSegmentsDirected.instance();
  }
  
  public ConnectedSegmentsDirected.Matcher getConnectedSegmentsDirected(final ViatraQueryEngine engine) {
    return ConnectedSegmentsDirected.Matcher.on(engine);
  }
  
  public EndOfSiding_step_2 getEndOfSiding_step_2() {
    return EndOfSiding_step_2.instance();
  }
  
  public EndOfSiding_step_2.Matcher getEndOfSiding_step_2(final ViatraQueryEngine engine) {
    return EndOfSiding_step_2.Matcher.on(engine);
  }
  
  public EndOfSiding_step_3 getEndOfSiding_step_3() {
    return EndOfSiding_step_3.instance();
  }
  
  public EndOfSiding_step_3.Matcher getEndOfSiding_step_3(final ViatraQueryEngine engine) {
    return EndOfSiding_step_3.Matcher.on(engine);
  }
  
  public EndOfSiding_step_4 getEndOfSiding_step_4() {
    return EndOfSiding_step_4.instance();
  }
  
  public EndOfSiding_step_4.Matcher getEndOfSiding_step_4(final ViatraQueryEngine engine) {
    return EndOfSiding_step_4.Matcher.on(engine);
  }
  
  public EndOfSiding_step_5 getEndOfSiding_step_5() {
    return EndOfSiding_step_5.instance();
  }
  
  public EndOfSiding_step_5.Matcher getEndOfSiding_step_5(final ViatraQueryEngine engine) {
    return EndOfSiding_step_5.Matcher.on(engine);
  }
  
  public MultipleConnectedTo getMultipleConnectedTo() {
    return MultipleConnectedTo.instance();
  }
  
  public MultipleConnectedTo.Matcher getMultipleConnectedTo(final ViatraQueryEngine engine) {
    return MultipleConnectedTo.Matcher.on(engine);
  }
}
