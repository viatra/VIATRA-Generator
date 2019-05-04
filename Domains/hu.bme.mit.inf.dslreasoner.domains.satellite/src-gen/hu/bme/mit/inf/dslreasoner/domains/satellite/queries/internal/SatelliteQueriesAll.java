/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.satellite/src/hu/bme/mit/inf/dslreasoner/domains/satellite/queries/SatelliteQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal;

import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.CommunicationLinkDoesNotStartAtContainingElement;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.CommunicationLoop;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.CostMetric;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.CoverageMetric;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.CubeSatWithKaAntenna;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.IncompatibleSourceAndTargetBand;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.IncompatibleSourceAndTargetGain;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.KaAntennaGainLow;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.NoLinkToGroundStation;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.NotEnoughInterferometryPayloads;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.ThreeUCubeSatWithNonUhfCrossLink;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.TimeMetric;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.UhfAntennaGainNotLow;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.XAntennaGainNotMedium;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.AdditionalCommSubsystemCost;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.AtLeastTwoInterferometryPayloads;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.BasePrice;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.CommSubsystemBand;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.CommSubsystemBandUhf;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.CommSubsystemGain;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.CommSubsystemGainLow;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.CommSubsystemGainMedium;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.DirectCommunicationLink;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.GroundStationNetwork;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.IncomingData;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.IndirectCommunicationLink;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.InterferometryPayloadCost;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.MissionCost;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.MissionCoverage;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.MissionTime;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.ScienceData;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.SmallSat;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.SpacecraftCost;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.SpacecraftOfKind;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.SpacecraftUplink;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.SpacecraftWithInterferometryPayload;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.SpacecraftWithTwoCommSubsystems;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.TransmitRate;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.internal.TransmitTime;
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
 * <li>coverageMetric</li>
 * <li>missionCoverage</li>
 * <li>timeMetric</li>
 * <li>missionTime</li>
 * <li>transmitTime</li>
 * <li>incomingData</li>
 * <li>scienceData</li>
 * <li>transmitRate</li>
 * <li>spacecraftUplink</li>
 * <li>costMetric</li>
 * <li>missionCost</li>
 * <li>spacecraftCost</li>
 * <li>spacecraftOfKind</li>
 * <li>basePrice</li>
 * <li>interferometryPayloadCost</li>
 * <li>additionalCommSubsystemCost</li>
 * <li>spacecraftWithTwoCommSubsystems</li>
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
    querySpecifications.add(CoverageMetric.instance());
    querySpecifications.add(MissionCoverage.instance());
    querySpecifications.add(TimeMetric.instance());
    querySpecifications.add(MissionTime.instance());
    querySpecifications.add(TransmitTime.instance());
    querySpecifications.add(IncomingData.instance());
    querySpecifications.add(ScienceData.instance());
    querySpecifications.add(TransmitRate.instance());
    querySpecifications.add(SpacecraftUplink.instance());
    querySpecifications.add(CostMetric.instance());
    querySpecifications.add(MissionCost.instance());
    querySpecifications.add(SpacecraftCost.instance());
    querySpecifications.add(SpacecraftOfKind.instance());
    querySpecifications.add(BasePrice.instance());
    querySpecifications.add(InterferometryPayloadCost.instance());
    querySpecifications.add(AdditionalCommSubsystemCost.instance());
    querySpecifications.add(SpacecraftWithTwoCommSubsystems.instance());
  }
}
