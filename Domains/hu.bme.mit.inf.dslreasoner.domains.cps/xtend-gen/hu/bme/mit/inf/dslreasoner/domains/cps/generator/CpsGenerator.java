package hu.bme.mit.inf.dslreasoner.domains.cps.generator;

import hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationType;
import hu.bme.mit.inf.dslreasoner.domains.cps.CpsFactory;
import hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.dslreasoner.domains.cps.HostType;
import hu.bme.mit.inf.dslreasoner.domains.cps.Request;
import hu.bme.mit.inf.dslreasoner.domains.cps.Requirement;
import hu.bme.mit.inf.dslreasoner.domains.cps.ResourceRequirement;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class CpsGenerator {
  @Extension
  private final CpsFactory _cpsFactory = CpsFactory.eINSTANCE;
  
  private static final int MIN_MEMORY = 1;
  
  private static final int MAX_MEMORY = 6;
  
  private static final int MIN_HDD = 1;
  
  private static final int MAX_HDD = 30;
  
  private static final int HIGH_CPU_FRACTION = 4;
  
  private static final int MIN_REPLICAS = 1;
  
  private static final int MAX_REPLICAS = 4;
  
  private final Random random;
  
  private final int applicationTypeCount;
  
  private final int demandFactor;
  
  private final boolean populateAppInstances;
  
  public CpsGenerator(final long randomSeed, final int applicationTypeCount, final int demandFactor) {
    this(randomSeed, applicationTypeCount, demandFactor, false);
  }
  
  public CpsGenerator(final long randomSeed, final int applicationTypeCount, final int demandFactor, final boolean populateAppInstances) {
    Random _random = new Random(randomSeed);
    this.random = _random;
    this.applicationTypeCount = applicationTypeCount;
    this.demandFactor = demandFactor;
    this.populateAppInstances = populateAppInstances;
  }
  
  public CyberPhysicalSystem generateCpsProblem() {
    CyberPhysicalSystem _xblockexpression = null;
    {
      final ResourceSetImpl resourceSet = new ResourceSetImpl();
      final Resource resource = resourceSet.createResource(URI.createFileURI("dummy.dummyext"));
      CyberPhysicalSystem _createCyberPhysicalSystem = this._cpsFactory.createCyberPhysicalSystem();
      final Procedure1<CyberPhysicalSystem> _function = (CyberPhysicalSystem it) -> {
        final CyberPhysicalSystem cps = it;
        EList<EObject> _contents = resource.getContents();
        _contents.add(cps);
        this.createLowCpuHostTypes(it);
        final List<HostType> highCpuHostTypes = this.createHighCpuHostTypes(it);
        for (int i = 0; (i < this.applicationTypeCount); i++) {
          if (((i % CpsGenerator.HIGH_CPU_FRACTION) == 0)) {
            this.createRandomApplicationType(it, highCpuHostTypes);
          } else {
            this.createRandomApplicationType(it, it.getHostTypes());
          }
        }
        for (int i = 0; (i < this.demandFactor); i++) {
          EList<Request> _requests = it.getRequests();
          Request _createRequest = this._cpsFactory.createRequest();
          final Procedure1<Request> _function_1 = (Request it_1) -> {
            EList<ApplicationType> _applicationTypes = cps.getApplicationTypes();
            for (final ApplicationType appType : _applicationTypes) {
              EList<Requirement> _requirements = it_1.getRequirements();
              Requirement _createRequirement = this._cpsFactory.createRequirement();
              final Procedure1<Requirement> _function_2 = (Requirement it_2) -> {
                it_2.setCount(this.nextInt(CpsGenerator.MIN_REPLICAS, CpsGenerator.MAX_REPLICAS));
                it_2.setType(appType);
                if (this.populateAppInstances) {
                  int _count = it_2.getCount();
                  ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _count, true);
                  for (final Integer j : _doubleDotLessThan) {
                    {
                      final ApplicationInstance app = this._cpsFactory.createApplicationInstance();
                      app.setType(appType);
                      EList<ApplicationInstance> _instances = appType.getInstances();
                      _instances.add(app);
                      EList<ApplicationInstance> _instances_1 = it_2.getInstances();
                      _instances_1.add(app);
                    }
                  }
                }
              };
              Requirement _doubleArrow = ObjectExtensions.<Requirement>operator_doubleArrow(_createRequirement, _function_2);
              _requirements.add(_doubleArrow);
            }
          };
          Request _doubleArrow = ObjectExtensions.<Request>operator_doubleArrow(_createRequest, _function_1);
          _requests.add(_doubleArrow);
        }
      };
      _xblockexpression = ObjectExtensions.<CyberPhysicalSystem>operator_doubleArrow(_createCyberPhysicalSystem, _function);
    }
    return _xblockexpression;
  }
  
  private void createRandomApplicationType(final CyberPhysicalSystem it, final Collection<HostType> allowedHostTypes) {
    final ApplicationType appType = this._cpsFactory.createApplicationType();
    final int memory = this.nextInt(CpsGenerator.MIN_MEMORY, CpsGenerator.MAX_MEMORY);
    final int hdd = this.nextInt(CpsGenerator.MIN_HDD, CpsGenerator.MAX_HDD);
    for (final HostType hostType : allowedHostTypes) {
      EList<ResourceRequirement> _requirements = appType.getRequirements();
      ResourceRequirement _createResourceRequirement = this._cpsFactory.createResourceRequirement();
      final Procedure1<ResourceRequirement> _function = (ResourceRequirement it_1) -> {
        it_1.setHostType(hostType);
        it_1.setRequiredMemory(memory);
        it_1.setRequiredHdd(hdd);
      };
      ResourceRequirement _doubleArrow = ObjectExtensions.<ResourceRequirement>operator_doubleArrow(_createResourceRequirement, _function);
      _requirements.add(_doubleArrow);
    }
    EList<ApplicationType> _applicationTypes = it.getApplicationTypes();
    _applicationTypes.add(appType);
  }
  
  private List<HostType> createLowCpuHostTypes(final CyberPhysicalSystem it) {
    HostType _createHostType = this.createHostType(it, 2, 8, 75);
    HostType _createHostType_1 = this.createHostType(it, 4, 16, 150);
    HostType _createHostType_2 = this.createHostType(it, 3, 16, 75);
    HostType _createHostType_3 = this.createHostType(it, 6, 32, 150);
    return Collections.<HostType>unmodifiableList(CollectionLiterals.<HostType>newArrayList(_createHostType, _createHostType_1, _createHostType_2, _createHostType_3));
  }
  
  private List<HostType> createHighCpuHostTypes(final CyberPhysicalSystem it) {
    HostType _createHostType = this.createHostType(it, 2, 4, 50);
    HostType _createHostType_1 = this.createHostType(it, 4, 8, 100);
    return Collections.<HostType>unmodifiableList(CollectionLiterals.<HostType>newArrayList(_createHostType, _createHostType_1));
  }
  
  private HostType createHostType(final CyberPhysicalSystem it, final int cost, final int memory, final int hdd) {
    HostType _xblockexpression = null;
    {
      HostType _createHostType = this._cpsFactory.createHostType();
      final Procedure1<HostType> _function = (HostType it_1) -> {
        it_1.setCost(cost);
        it_1.setDefaultMemory(memory);
        it_1.setDefaultHdd(hdd);
      };
      final HostType hostType = ObjectExtensions.<HostType>operator_doubleArrow(_createHostType, _function);
      EList<HostType> _hostTypes = it.getHostTypes();
      _hostTypes.add(hostType);
      _xblockexpression = hostType;
    }
    return _xblockexpression;
  }
  
  private int nextInt(final int lower, final int upper) {
    int _nextInt = this.random.nextInt(((upper - lower) + 1));
    return (lower + _nextInt);
  }
}
