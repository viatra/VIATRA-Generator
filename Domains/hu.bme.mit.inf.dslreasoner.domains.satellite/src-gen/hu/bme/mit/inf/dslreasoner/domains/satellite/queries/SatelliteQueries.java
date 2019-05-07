/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.satellite/src/hu/bme/mit/inf/dslreasoner/domains/satellite/queries/SatelliteQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.satellite.queries;

import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.CommunicationLinkOfElement;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.CommunicationLoop;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.CubeSatWithKaAntenna;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.IncompatibleSourceAndTargetBand;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.IncompatibleSourceAndTargetGain;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.KaAntennaGainLow;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.MultipleCommunicationLinks;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.NoLinkToGroundStation;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.NoPotentialLinkToGroundStation;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.NotEnoughInterferometryPayloads;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.SmallSat;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.SpacecraftOfKind;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.ThreeUCubeSatWithNonUhfCrossLink;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.UhfAntennaGainNotLow;
import hu.bme.mit.inf.dslreasoner.domains.satellite.queries.XAntennaGainNotMedium;
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
 * <li>multipleCommunicationLinks</li>
 * <li>communicationLinkOfElement</li>
 * <li>notEnoughInterferometryPayloads</li>
 * <li>noLinkToGroundStation</li>
 * <li>noPotentialLinkToGroundStation</li>
 * <li>communicationLoop</li>
 * <li>incompatibleSourceAndTargetBand</li>
 * <li>incompatibleSourceAndTargetGain</li>
 * <li>uhfAntennaGainNotLow</li>
 * <li>xAntennaGainNotMedium</li>
 * <li>kaAntennaGainLow</li>
 * <li>threeUCubeSatWithNonUhfCrossLink</li>
 * <li>cubeSatWithKaAntenna</li>
 * <li>smallSat</li>
 * <li>spacecraftOfKind</li>
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
    querySpecifications.add(MultipleCommunicationLinks.instance());
    querySpecifications.add(CommunicationLinkOfElement.instance());
    querySpecifications.add(NotEnoughInterferometryPayloads.instance());
    querySpecifications.add(NoLinkToGroundStation.instance());
    querySpecifications.add(NoPotentialLinkToGroundStation.instance());
    querySpecifications.add(CommunicationLoop.instance());
    querySpecifications.add(IncompatibleSourceAndTargetBand.instance());
    querySpecifications.add(IncompatibleSourceAndTargetGain.instance());
    querySpecifications.add(UhfAntennaGainNotLow.instance());
    querySpecifications.add(XAntennaGainNotMedium.instance());
    querySpecifications.add(KaAntennaGainLow.instance());
    querySpecifications.add(ThreeUCubeSatWithNonUhfCrossLink.instance());
    querySpecifications.add(CubeSatWithKaAntenna.instance());
    querySpecifications.add(SmallSat.instance());
    querySpecifications.add(SpacecraftOfKind.instance());
  }
  
  public MultipleCommunicationLinks getMultipleCommunicationLinks() {
    return MultipleCommunicationLinks.instance();
  }
  
  public MultipleCommunicationLinks.Matcher getMultipleCommunicationLinks(final ViatraQueryEngine engine) {
    return MultipleCommunicationLinks.Matcher.on(engine);
  }
  
  public CommunicationLinkOfElement getCommunicationLinkOfElement() {
    return CommunicationLinkOfElement.instance();
  }
  
  public CommunicationLinkOfElement.Matcher getCommunicationLinkOfElement(final ViatraQueryEngine engine) {
    return CommunicationLinkOfElement.Matcher.on(engine);
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
  
  public IncompatibleSourceAndTargetGain getIncompatibleSourceAndTargetGain() {
    return IncompatibleSourceAndTargetGain.instance();
  }
  
  public IncompatibleSourceAndTargetGain.Matcher getIncompatibleSourceAndTargetGain(final ViatraQueryEngine engine) {
    return IncompatibleSourceAndTargetGain.Matcher.on(engine);
  }
  
  public UhfAntennaGainNotLow getUhfAntennaGainNotLow() {
    return UhfAntennaGainNotLow.instance();
  }
  
  public UhfAntennaGainNotLow.Matcher getUhfAntennaGainNotLow(final ViatraQueryEngine engine) {
    return UhfAntennaGainNotLow.Matcher.on(engine);
  }
  
  public XAntennaGainNotMedium getXAntennaGainNotMedium() {
    return XAntennaGainNotMedium.instance();
  }
  
  public XAntennaGainNotMedium.Matcher getXAntennaGainNotMedium(final ViatraQueryEngine engine) {
    return XAntennaGainNotMedium.Matcher.on(engine);
  }
  
  public KaAntennaGainLow getKaAntennaGainLow() {
    return KaAntennaGainLow.instance();
  }
  
  public KaAntennaGainLow.Matcher getKaAntennaGainLow(final ViatraQueryEngine engine) {
    return KaAntennaGainLow.Matcher.on(engine);
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
  
  public SpacecraftOfKind getSpacecraftOfKind() {
    return SpacecraftOfKind.instance();
  }
  
  public SpacecraftOfKind.Matcher getSpacecraftOfKind(final ViatraQueryEngine engine) {
    return SpacecraftOfKind.Matcher.on(engine);
  }
}
