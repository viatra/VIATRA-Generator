/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.cps/src/hu/bme/mit/inf/dslreasoner/domains/cps/queries/CpsQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.cps.queries;

import hu.bme.mit.inf.dslreasoner.domains.cps.queries.AllocationWithoutResourceRequirement;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.AvailableHdd;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.AvailableMemory;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.AverageFreeHddMetric;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.AverageFreeMemoryMetric;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.CostMetric;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.CpsApplications;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.CpsCost;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.CpsHosts;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.InstanceDoesNotSatisfyRequirement;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.NotEnoughAvailableHdd;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.NotEnoughAvailableMemory;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.RedundantInstancesOnSameHost;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.RequirementNotSatisfied;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.TotalHdd;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.TotalMemory;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in CpsQueries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file CpsQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.inf.dslreasoner.domains.cps.queries, the group contains the definition of the following patterns: <ul>
 * <li>cpsApplications</li>
 * <li>cpsHosts</li>
 * <li>totalMemory</li>
 * <li>totalHdd</li>
 * <li>availableMemory</li>
 * <li>availableHdd</li>
 * <li>allocationWithoutResourceRequirement</li>
 * <li>notEnoughAvailableMemory</li>
 * <li>notEnoughAvailableHdd</li>
 * <li>instanceDoesNotSatisfyRequirement</li>
 * <li>requirementNotSatisfied</li>
 * <li>redundantInstancesOnSameHost</li>
 * <li>averageFreeMemoryMetric</li>
 * <li>averageFreeHddMetric</li>
 * <li>costMetric</li>
 * <li>cpsCost</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class CpsQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static CpsQueries instance() {
    if (INSTANCE == null) {
        INSTANCE = new CpsQueries();
    }
    return INSTANCE;
  }
  
  private static CpsQueries INSTANCE;
  
  private CpsQueries() {
    querySpecifications.add(CpsApplications.instance());
    querySpecifications.add(CpsHosts.instance());
    querySpecifications.add(TotalMemory.instance());
    querySpecifications.add(TotalHdd.instance());
    querySpecifications.add(AvailableMemory.instance());
    querySpecifications.add(AvailableHdd.instance());
    querySpecifications.add(AllocationWithoutResourceRequirement.instance());
    querySpecifications.add(NotEnoughAvailableMemory.instance());
    querySpecifications.add(NotEnoughAvailableHdd.instance());
    querySpecifications.add(InstanceDoesNotSatisfyRequirement.instance());
    querySpecifications.add(RequirementNotSatisfied.instance());
    querySpecifications.add(RedundantInstancesOnSameHost.instance());
    querySpecifications.add(AverageFreeMemoryMetric.instance());
    querySpecifications.add(AverageFreeHddMetric.instance());
    querySpecifications.add(CostMetric.instance());
    querySpecifications.add(CpsCost.instance());
  }
  
  public CpsApplications getCpsApplications() {
    return CpsApplications.instance();
  }
  
  public CpsApplications.Matcher getCpsApplications(final ViatraQueryEngine engine) {
    return CpsApplications.Matcher.on(engine);
  }
  
  public CpsHosts getCpsHosts() {
    return CpsHosts.instance();
  }
  
  public CpsHosts.Matcher getCpsHosts(final ViatraQueryEngine engine) {
    return CpsHosts.Matcher.on(engine);
  }
  
  public TotalMemory getTotalMemory() {
    return TotalMemory.instance();
  }
  
  public TotalMemory.Matcher getTotalMemory(final ViatraQueryEngine engine) {
    return TotalMemory.Matcher.on(engine);
  }
  
  public TotalHdd getTotalHdd() {
    return TotalHdd.instance();
  }
  
  public TotalHdd.Matcher getTotalHdd(final ViatraQueryEngine engine) {
    return TotalHdd.Matcher.on(engine);
  }
  
  public AvailableMemory getAvailableMemory() {
    return AvailableMemory.instance();
  }
  
  public AvailableMemory.Matcher getAvailableMemory(final ViatraQueryEngine engine) {
    return AvailableMemory.Matcher.on(engine);
  }
  
  public AvailableHdd getAvailableHdd() {
    return AvailableHdd.instance();
  }
  
  public AvailableHdd.Matcher getAvailableHdd(final ViatraQueryEngine engine) {
    return AvailableHdd.Matcher.on(engine);
  }
  
  public AllocationWithoutResourceRequirement getAllocationWithoutResourceRequirement() {
    return AllocationWithoutResourceRequirement.instance();
  }
  
  public AllocationWithoutResourceRequirement.Matcher getAllocationWithoutResourceRequirement(final ViatraQueryEngine engine) {
    return AllocationWithoutResourceRequirement.Matcher.on(engine);
  }
  
  public NotEnoughAvailableMemory getNotEnoughAvailableMemory() {
    return NotEnoughAvailableMemory.instance();
  }
  
  public NotEnoughAvailableMemory.Matcher getNotEnoughAvailableMemory(final ViatraQueryEngine engine) {
    return NotEnoughAvailableMemory.Matcher.on(engine);
  }
  
  public NotEnoughAvailableHdd getNotEnoughAvailableHdd() {
    return NotEnoughAvailableHdd.instance();
  }
  
  public NotEnoughAvailableHdd.Matcher getNotEnoughAvailableHdd(final ViatraQueryEngine engine) {
    return NotEnoughAvailableHdd.Matcher.on(engine);
  }
  
  public InstanceDoesNotSatisfyRequirement getInstanceDoesNotSatisfyRequirement() {
    return InstanceDoesNotSatisfyRequirement.instance();
  }
  
  public InstanceDoesNotSatisfyRequirement.Matcher getInstanceDoesNotSatisfyRequirement(final ViatraQueryEngine engine) {
    return InstanceDoesNotSatisfyRequirement.Matcher.on(engine);
  }
  
  public RequirementNotSatisfied getRequirementNotSatisfied() {
    return RequirementNotSatisfied.instance();
  }
  
  public RequirementNotSatisfied.Matcher getRequirementNotSatisfied(final ViatraQueryEngine engine) {
    return RequirementNotSatisfied.Matcher.on(engine);
  }
  
  public RedundantInstancesOnSameHost getRedundantInstancesOnSameHost() {
    return RedundantInstancesOnSameHost.instance();
  }
  
  public RedundantInstancesOnSameHost.Matcher getRedundantInstancesOnSameHost(final ViatraQueryEngine engine) {
    return RedundantInstancesOnSameHost.Matcher.on(engine);
  }
  
  public AverageFreeMemoryMetric getAverageFreeMemoryMetric() {
    return AverageFreeMemoryMetric.instance();
  }
  
  public AverageFreeMemoryMetric.Matcher getAverageFreeMemoryMetric(final ViatraQueryEngine engine) {
    return AverageFreeMemoryMetric.Matcher.on(engine);
  }
  
  public AverageFreeHddMetric getAverageFreeHddMetric() {
    return AverageFreeHddMetric.instance();
  }
  
  public AverageFreeHddMetric.Matcher getAverageFreeHddMetric(final ViatraQueryEngine engine) {
    return AverageFreeHddMetric.Matcher.on(engine);
  }
  
  public CostMetric getCostMetric() {
    return CostMetric.instance();
  }
  
  public CostMetric.Matcher getCostMetric(final ViatraQueryEngine engine) {
    return CostMetric.Matcher.on(engine);
  }
  
  public CpsCost getCpsCost() {
    return CpsCost.instance();
  }
  
  public CpsCost.Matcher getCpsCost(final ViatraQueryEngine engine) {
    return CpsCost.Matcher.on(engine);
  }
}
