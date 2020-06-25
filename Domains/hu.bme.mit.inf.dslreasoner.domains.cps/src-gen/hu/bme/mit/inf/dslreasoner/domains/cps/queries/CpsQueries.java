/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.cps/src/hu/bme/mit/inf/dslreasoner/domains/cps/queries/CpsQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.cps.queries;

import hu.bme.mit.inf.dslreasoner.domains.cps.queries.Allocate;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.AllocationWithoutResourceRequirement;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.AverageFreeHddMetric;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.AverageFreeMemoryMetric;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.CostMetric;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.CpsCost;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.CreateHostInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.GuidanceObjective;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.InstanceDoesNotSatisfyRequirement;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.NotEnoughAvailableHdd;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.NotEnoughAvailableMemory;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.RedundantInstancesOnSameHost;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.RemoveHostInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.RequirementNotSatisfied;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.ResourceRequirement;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.UnallocateAppInstance;
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
 * <li>resourceRequirement</li>
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
 * <li>allocate</li>
 * <li>unallocateAppInstance</li>
 * <li>createHostInstance</li>
 * <li>removeHostInstance</li>
 * <li>guidanceObjective</li>
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
    querySpecifications.add(ResourceRequirement.instance());
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
    querySpecifications.add(Allocate.instance());
    querySpecifications.add(UnallocateAppInstance.instance());
    querySpecifications.add(CreateHostInstance.instance());
    querySpecifications.add(RemoveHostInstance.instance());
    querySpecifications.add(GuidanceObjective.instance());
  }
  
  public ResourceRequirement getResourceRequirement() {
    return ResourceRequirement.instance();
  }
  
  public ResourceRequirement.Matcher getResourceRequirement(final ViatraQueryEngine engine) {
    return ResourceRequirement.Matcher.on(engine);
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
  
  public Allocate getAllocate() {
    return Allocate.instance();
  }
  
  public Allocate.Matcher getAllocate(final ViatraQueryEngine engine) {
    return Allocate.Matcher.on(engine);
  }
  
  public UnallocateAppInstance getUnallocateAppInstance() {
    return UnallocateAppInstance.instance();
  }
  
  public UnallocateAppInstance.Matcher getUnallocateAppInstance(final ViatraQueryEngine engine) {
    return UnallocateAppInstance.Matcher.on(engine);
  }
  
  public CreateHostInstance getCreateHostInstance() {
    return CreateHostInstance.instance();
  }
  
  public CreateHostInstance.Matcher getCreateHostInstance(final ViatraQueryEngine engine) {
    return CreateHostInstance.Matcher.on(engine);
  }
  
  public RemoveHostInstance getRemoveHostInstance() {
    return RemoveHostInstance.instance();
  }
  
  public RemoveHostInstance.Matcher getRemoveHostInstance(final ViatraQueryEngine engine) {
    return RemoveHostInstance.Matcher.on(engine);
  }
  
  public GuidanceObjective getGuidanceObjective() {
    return GuidanceObjective.instance();
  }
  
  public GuidanceObjective.Matcher getGuidanceObjective(final ViatraQueryEngine engine) {
    return GuidanceObjective.Matcher.on(engine);
  }
}
