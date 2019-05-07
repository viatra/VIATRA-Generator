/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.satellite/src/hu/bme/mit/inf/dslreasoner/domains/satellite/queries/SatelliteQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal;

import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.CommunicationLinkDoesNotStartAtContainingElement;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.CommunicationLoop;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.CubeSatWithKaAntenna;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.IncompatibleSourceAndTargetBand;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.IncompatibleSourceAndTargetGain;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.KaAntennaGainLow;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.NoLinkToGroundStation;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.NoPotentialLinkToGroundStation;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.NotEnoughInterferometryPayloads;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.SmallSat;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.SpacecraftOfKind;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.ThreeUCubeSatWithNonUhfCrossLink;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.UhfAntennaGainNotLow;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.XAntennaGainNotMedium;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.AtLeastTwoInterferometryPayloads;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.CommSubsystemBand;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.CommSubsystemBandUhf;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.CommSubsystemGain;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.CommSubsystemGainLow;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.CommSubsystemGainMedium;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.CubeSat3U;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.DirectCommunicationLink;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.GroundStationNetwork;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.IndirectCommunicationLink;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.IndirectLinkAllowed;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.LinkAllowed;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.MatchingAntenna;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.SpacecraftWithInterferometryPayload;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all patterns defined in SatelliteQueries.vql.
 * 
 * <p>A private group that includes private patterns as well. Only intended use case is for pattern testing.
 * 
 * <p> From package hu.bme.mit.inf.dslreasoner.domains.satellite.queries, the group contains the definition of the following patterns: <ul>
 * <li>communicationLinkDoesNotStartAtContainingElement</li>
 * <li>notEnoughInterferometryPayloads</li>
 * <li>atLeastTwoInterferometryPayloads</li>
 * <li>spacecraftWithInterferometryPayload</li>
 * <li>noLinkToGroundStation</li>
 * <li>noPotentialLinkToGroundStation</li>
 * <li>indirectLinkAllowed</li>
 * <li>linkAllowed</li>
 * <li>matchingAntenna</li>
 * <li>cubeSat3U</li>
 * <li>communicationLoop</li>
 * <li>indirectCommunicationLink</li>
 * <li>directCommunicationLink</li>
 * <li>incompatibleSourceAndTargetBand</li>
 * <li>commSubsystemBand</li>
 * <li>incompatibleSourceAndTargetGain</li>
 * <li>commSubsystemGain</li>
 * <li>uhfAntennaGainNotLow</li>
 * <li>commSubsystemGainLow</li>
 * <li>xAntennaGainNotMedium</li>
 * <li>commSubsystemGainMedium</li>
 * <li>kaAntennaGainLow</li>
 * <li>threeUCubeSatWithNonUhfCrossLink</li>
 * <li>commSubsystemBandUhf</li>
 * <li>groundStationNetwork</li>
 * <li>cubeSatWithKaAntenna</li>
 * <li>smallSat</li>
 * <li>spacecraftOfKind</li>
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
    querySpecifications.add(NotEnoughInterferometryPayloads.instance());
    querySpecifications.add(AtLeastTwoInterferometryPayloads.instance());
    querySpecifications.add(SpacecraftWithInterferometryPayload.instance());
    querySpecifications.add(NoLinkToGroundStation.instance());
    querySpecifications.add(NoPotentialLinkToGroundStation.instance());
    querySpecifications.add(IndirectLinkAllowed.instance());
    querySpecifications.add(LinkAllowed.instance());
    querySpecifications.add(MatchingAntenna.instance());
    querySpecifications.add(CubeSat3U.instance());
    querySpecifications.add(CommunicationLoop.instance());
    querySpecifications.add(IndirectCommunicationLink.instance());
    querySpecifications.add(DirectCommunicationLink.instance());
    querySpecifications.add(IncompatibleSourceAndTargetBand.instance());
    querySpecifications.add(CommSubsystemBand.instance());
    querySpecifications.add(IncompatibleSourceAndTargetGain.instance());
    querySpecifications.add(CommSubsystemGain.instance());
    querySpecifications.add(UhfAntennaGainNotLow.instance());
    querySpecifications.add(CommSubsystemGainLow.instance());
    querySpecifications.add(XAntennaGainNotMedium.instance());
    querySpecifications.add(CommSubsystemGainMedium.instance());
    querySpecifications.add(KaAntennaGainLow.instance());
    querySpecifications.add(ThreeUCubeSatWithNonUhfCrossLink.instance());
    querySpecifications.add(CommSubsystemBandUhf.instance());
    querySpecifications.add(GroundStationNetwork.instance());
    querySpecifications.add(CubeSatWithKaAntenna.instance());
    querySpecifications.add(SmallSat.instance());
    querySpecifications.add(SpacecraftOfKind.instance());
  }
}
