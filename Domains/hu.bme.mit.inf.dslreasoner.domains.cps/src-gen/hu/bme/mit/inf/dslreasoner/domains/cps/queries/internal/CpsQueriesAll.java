/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.cps/src/hu/bme/mit/inf/dslreasoner/domains/cps/queries/CpsQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal;

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
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.AvailableHdd;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.AvailableMemory;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.CpsApplications;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.CpsHosts;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.FreeHddPercentage;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.FreeMemoryPercentage;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.HddRequirement;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.HostInstanceCost;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.MemoryRequirement;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.NoHostToAllocateTo;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.RequiredAppInstances;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.SatisfyingInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.TotalHdd;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.TotalMemory;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.UnallocatedAppInstance;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all patterns defined in CpsQueries.vql.
 * 
 * <p>A private group that includes private patterns as well. Only intended use case is for pattern testing.
 * 
 * <p> From package hu.bme.mit.inf.dslreasoner.domains.cps.queries, the group contains the definition of the following patterns: <ul>
 * <li>cpsApplications</li>
 * <li>cpsHosts</li>
 * <li>totalMemory</li>
 * <li>totalHdd</li>
 * <li>availableMemory</li>
 * <li>memoryRequirement</li>
 * <li>availableHdd</li>
 * <li>hddRequirement</li>
 * <li>resourceRequirement</li>
 * <li>allocationWithoutResourceRequirement</li>
 * <li>notEnoughAvailableMemory</li>
 * <li>notEnoughAvailableHdd</li>
 * <li>instanceDoesNotSatisfyRequirement</li>
 * <li>satisfyingInstance</li>
 * <li>requirementNotSatisfied</li>
 * <li>redundantInstancesOnSameHost</li>
 * <li>averageFreeMemoryMetric</li>
 * <li>freeMemoryPercentage</li>
 * <li>averageFreeHddMetric</li>
 * <li>freeHddPercentage</li>
 * <li>costMetric</li>
 * <li>cpsCost</li>
 * <li>hostInstanceCost</li>
 * <li>allocate</li>
 * <li>unallocateAppInstance</li>
 * <li>createHostInstance</li>
 * <li>removeHostInstance</li>
 * <li>unallocatedAppInstance</li>
 * <li>requiredAppInstances</li>
 * <li>noHostToAllocateTo</li>
 * <li>guidanceObjective</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class CpsQueriesAll extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static CpsQueriesAll instance() {
    if (INSTANCE == null) {
        INSTANCE = new CpsQueriesAll();
    }
    return INSTANCE;
  }
  
  private static CpsQueriesAll INSTANCE;
  
  private CpsQueriesAll() {
    querySpecifications.add(CpsApplications.instance());
    querySpecifications.add(CpsHosts.instance());
    querySpecifications.add(TotalMemory.instance());
    querySpecifications.add(TotalHdd.instance());
    querySpecifications.add(AvailableMemory.instance());
    querySpecifications.add(MemoryRequirement.instance());
    querySpecifications.add(AvailableHdd.instance());
    querySpecifications.add(HddRequirement.instance());
    querySpecifications.add(ResourceRequirement.instance());
    querySpecifications.add(AllocationWithoutResourceRequirement.instance());
    querySpecifications.add(NotEnoughAvailableMemory.instance());
    querySpecifications.add(NotEnoughAvailableHdd.instance());
    querySpecifications.add(InstanceDoesNotSatisfyRequirement.instance());
    querySpecifications.add(SatisfyingInstance.instance());
    querySpecifications.add(RequirementNotSatisfied.instance());
    querySpecifications.add(RedundantInstancesOnSameHost.instance());
    querySpecifications.add(AverageFreeMemoryMetric.instance());
    querySpecifications.add(FreeMemoryPercentage.instance());
    querySpecifications.add(AverageFreeHddMetric.instance());
    querySpecifications.add(FreeHddPercentage.instance());
    querySpecifications.add(CostMetric.instance());
    querySpecifications.add(CpsCost.instance());
    querySpecifications.add(HostInstanceCost.instance());
    querySpecifications.add(Allocate.instance());
    querySpecifications.add(UnallocateAppInstance.instance());
    querySpecifications.add(CreateHostInstance.instance());
    querySpecifications.add(RemoveHostInstance.instance());
    querySpecifications.add(UnallocatedAppInstance.instance());
    querySpecifications.add(RequiredAppInstances.instance());
    querySpecifications.add(NoHostToAllocateTo.instance());
    querySpecifications.add(GuidanceObjective.instance());
  }
}
