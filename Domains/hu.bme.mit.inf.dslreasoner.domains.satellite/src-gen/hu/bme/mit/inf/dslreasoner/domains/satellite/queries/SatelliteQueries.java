/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.satellite/src/hu/bme/mit/inf/dslreasoner/domains/satellite/queries/SatelliteQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.queries;

import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.CommunicationLinkDoesNotStartAtContainingElement;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.CommunicationLoop;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.CubeSatWithKaAntenna;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.IncompatibleSourceAndTargetBand;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.NoLinkToGroundStation;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.NoPotentialLinkToGroundStation;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.NotEnoughInterferometryPayloads;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.SmallSat;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.ThreeUCubeSatWithNonUhfCrossLink;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in SatelliteQueries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file SatelliteQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.inf.dslreasoner.domains.satellite.queries, the group contains the definition of the following patterns: <ul>
 * <li>communicationLinkDoesNotStartAtContainingElement</li>
 * <li>notEnoughInterferometryPayloads</li>
 * <li>noLinkToGroundStation</li>
 * <li>noPotentialLinkToGroundStation</li>
 * <li>communicationLoop</li>
 * <li>incompatibleSourceAndTargetBand</li>
 * <li>threeUCubeSatWithNonUhfCrossLink</li>
 * <li>cubeSatWithKaAntenna</li>
 * <li>smallSat</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class SatelliteQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static SatelliteQueries instance() {
    if (INSTANCE == null) {
        INSTANCE = new SatelliteQueries();
    }
    return INSTANCE;
  }
  
  private static SatelliteQueries INSTANCE;
  
  private SatelliteQueries() {
    querySpecifications.add(CommunicationLinkDoesNotStartAtContainingElement.instance());
    querySpecifications.add(NotEnoughInterferometryPayloads.instance());
    querySpecifications.add(NoLinkToGroundStation.instance());
    querySpecifications.add(NoPotentialLinkToGroundStation.instance());
    querySpecifications.add(CommunicationLoop.instance());
    querySpecifications.add(IncompatibleSourceAndTargetBand.instance());
    querySpecifications.add(ThreeUCubeSatWithNonUhfCrossLink.instance());
    querySpecifications.add(CubeSatWithKaAntenna.instance());
    querySpecifications.add(SmallSat.instance());
  }
  
  public CommunicationLinkDoesNotStartAtContainingElement getCommunicationLinkDoesNotStartAtContainingElement() {
    return CommunicationLinkDoesNotStartAtContainingElement.instance();
  }
  
  public CommunicationLinkDoesNotStartAtContainingElement.Matcher getCommunicationLinkDoesNotStartAtContainingElement(final ViatraQueryEngine engine) {
    return CommunicationLinkDoesNotStartAtContainingElement.Matcher.on(engine);
  }
  
  public NotEnoughInterferometryPayloads getNotEnoughInterferometryPayloads() {
    return NotEnoughInterferometryPayloads.instance();
  }
  
  public NotEnoughInterferometryPayloads.Matcher getNotEnoughInterferometryPayloads(final ViatraQueryEngine engine) {
    return NotEnoughInterferometryPayloads.Matcher.on(engine);
  }
  
  public NoLinkToGroundStation getNoLinkToGroundStation() {
    return NoLinkToGroundStation.instance();
  }
  
  public NoLinkToGroundStation.Matcher getNoLinkToGroundStation(final ViatraQueryEngine engine) {
    return NoLinkToGroundStation.Matcher.on(engine);
  }
  
  public NoPotentialLinkToGroundStation getNoPotentialLinkToGroundStation() {
    return NoPotentialLinkToGroundStation.instance();
  }
  
  public NoPotentialLinkToGroundStation.Matcher getNoPotentialLinkToGroundStation(final ViatraQueryEngine engine) {
    return NoPotentialLinkToGroundStation.Matcher.on(engine);
  }
  
  public CommunicationLoop getCommunicationLoop() {
    return CommunicationLoop.instance();
  }
  
  public CommunicationLoop.Matcher getCommunicationLoop(final ViatraQueryEngine engine) {
    return CommunicationLoop.Matcher.on(engine);
  }
  
  public IncompatibleSourceAndTargetBand getIncompatibleSourceAndTargetBand() {
    return IncompatibleSourceAndTargetBand.instance();
  }
  
  public IncompatibleSourceAndTargetBand.Matcher getIncompatibleSourceAndTargetBand(final ViatraQueryEngine engine) {
    return IncompatibleSourceAndTargetBand.Matcher.on(engine);
  }
  
  public ThreeUCubeSatWithNonUhfCrossLink getThreeUCubeSatWithNonUhfCrossLink() {
    return ThreeUCubeSatWithNonUhfCrossLink.instance();
  }
  
  public ThreeUCubeSatWithNonUhfCrossLink.Matcher getThreeUCubeSatWithNonUhfCrossLink(final ViatraQueryEngine engine) {
    return ThreeUCubeSatWithNonUhfCrossLink.Matcher.on(engine);
  }
  
  public CubeSatWithKaAntenna getCubeSatWithKaAntenna() {
    return CubeSatWithKaAntenna.instance();
  }
  
  public CubeSatWithKaAntenna.Matcher getCubeSatWithKaAntenna(final ViatraQueryEngine engine) {
    return CubeSatWithKaAntenna.Matcher.on(engine);
  }
  
  public SmallSat getSmallSat() {
    return SmallSat.instance();
  }
  
  public SmallSat.Matcher getSmallSat(final ViatraQueryEngine engine) {
    return SmallSat.Matcher.on(engine);
  }
}
