/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.satellite/src/hu/bme/mit/inf/dslreasoner/domains/satellite/queries/SatelliteQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal;

import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.CommunicationLinkDoesNotStartAtContainingElement;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.CommunicationLoop;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.CubeSatWithKaAntenna;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.IncompatibleSourceAndTargetBand;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.NoLinkToGroundStation;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.NoPotentialLinkToGroundStation;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.NotEnoughInterferometryPayloads;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.SmallSat;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.ThreeUCubeSatWithNonUhfCrossLink;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.AtLeastTwoInterferometryPayloads;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.CommSubsystemBandUhf;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.CubeSat3U;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.CubeSat6U;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.DirectCommunicationLink;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.GroundStationNetwork;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.IndirectCommunicationLink;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.IndirectLinkAllowed;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.LinkAllowed;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.MatchingAntenna;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.MatchingCommSubsystem;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.SpacecraftWithInterferometryPayload;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.TransmittingCommSubsystem;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all patterns defined in SatelliteQueries.vql.
 * 
 * <p>A private group that includes private patterns as well. Only intended use case is for pattern testing.
 * 
 * <p> From package hu.bme.mit.inf.dslreasoner.domains.satellite.queries, the group contains the definition of the following patterns: <ul>
 * <li>communicationLinkDoesNotStartAtContainingElement</li>
 * <li>transmittingCommSubsystem</li>
 * <li>notEnoughInterferometryPayloads</li>
 * <li>atLeastTwoInterferometryPayloads</li>
 * <li>spacecraftWithInterferometryPayload</li>
 * <li>noLinkToGroundStation</li>
 * <li>noPotentialLinkToGroundStation</li>
 * <li>indirectLinkAllowed</li>
 * <li>linkAllowed</li>
 * <li>matchingAntenna</li>
 * <li>matchingCommSubsystem</li>
 * <li>cubeSat3U</li>
 * <li>cubeSat6U</li>
 * <li>communicationLoop</li>
 * <li>indirectCommunicationLink</li>
 * <li>directCommunicationLink</li>
 * <li>incompatibleSourceAndTargetBand</li>
 * <li>threeUCubeSatWithNonUhfCrossLink</li>
 * <li>commSubsystemBandUhf</li>
 * <li>groundStationNetwork</li>
 * <li>cubeSatWithKaAntenna</li>
 * <li>smallSat</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class SatelliteQueriesAll extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static SatelliteQueriesAll instance() {
    if (INSTANCE == null) {
        INSTANCE = new SatelliteQueriesAll();
    }
    return INSTANCE;
  }
  
  private static SatelliteQueriesAll INSTANCE;
  
  private SatelliteQueriesAll() {
    querySpecifications.add(CommunicationLinkDoesNotStartAtContainingElement.instance());
    querySpecifications.add(TransmittingCommSubsystem.instance());
    querySpecifications.add(NotEnoughInterferometryPayloads.instance());
    querySpecifications.add(AtLeastTwoInterferometryPayloads.instance());
    querySpecifications.add(SpacecraftWithInterferometryPayload.instance());
    querySpecifications.add(NoLinkToGroundStation.instance());
    querySpecifications.add(NoPotentialLinkToGroundStation.instance());
    querySpecifications.add(IndirectLinkAllowed.instance());
    querySpecifications.add(LinkAllowed.instance());
    querySpecifications.add(MatchingAntenna.instance());
    querySpecifications.add(MatchingCommSubsystem.instance());
    querySpecifications.add(CubeSat3U.instance());
    querySpecifications.add(CubeSat6U.instance());
    querySpecifications.add(CommunicationLoop.instance());
    querySpecifications.add(IndirectCommunicationLink.instance());
    querySpecifications.add(DirectCommunicationLink.instance());
    querySpecifications.add(IncompatibleSourceAndTargetBand.instance());
    querySpecifications.add(ThreeUCubeSatWithNonUhfCrossLink.instance());
    querySpecifications.add(CommSubsystemBandUhf.instance());
    querySpecifications.add(GroundStationNetwork.instance());
    querySpecifications.add(CubeSatWithKaAntenna.instance());
    querySpecifications.add(SmallSat.instance());
  }
}
