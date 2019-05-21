package hu.bme.mit.inf.dslreasoner.domains.cps.dse;

import hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage;
import hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.dslreasoner.domains.cps.dse.RuleBasedCpsSolver;
import hu.bme.mit.inf.dslreasoner.domains.cps.generator.CpsGenerator;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.CpsQueries;
import java.util.Map;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.addon.querybasedfeatures.runtime.QueryBasedFeatureSettingDelegateFactory;
import org.eclipse.viatra.addon.querybasedfeatures.runtime.handler.QueryBasedFeatures;
import org.eclipse.viatra.dse.api.DesignSpaceExplorer;
import org.eclipse.viatra.query.runtime.extensibility.SingletonQueryGroupProvider;
import org.eclipse.viatra.query.runtime.registry.IQuerySpecificationRegistry;
import org.eclipse.viatra.query.runtime.registry.QuerySpecificationRegistry;
import org.eclipse.viatra.query.runtime.registry.connector.QueryGroupProviderSourceConnector;

@SuppressWarnings("all")
public class RuleBasedCpsMain {
  private RuleBasedCpsMain() {
    new IllegalStateException("This is a static utility class and should not be instantiated directly.");
  }
  
  public static void main(final String[] args) {
    DesignSpaceExplorer.turnOnLogging(DesignSpaceExplorer.DseLoggingLevel.VERBOSE_FULL);
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION, _xMIResourceFactoryImpl);
    QueryBasedFeatureSettingDelegateFactory _queryBasedFeatureSettingDelegateFactory = new QueryBasedFeatureSettingDelegateFactory();
    EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(QueryBasedFeatures.ANNOTATION_SOURCE, _queryBasedFeatureSettingDelegateFactory);
    EPackage.Registry.INSTANCE.put(CpsPackage.eNS_URI, CpsPackage.eINSTANCE);
    IQuerySpecificationRegistry _instance = QuerySpecificationRegistry.getInstance();
    CpsQueries _instance_1 = CpsQueries.instance();
    SingletonQueryGroupProvider _singletonQueryGroupProvider = new SingletonQueryGroupProvider(_instance_1);
    QueryGroupProviderSourceConnector _queryGroupProviderSourceConnector = new QueryGroupProviderSourceConnector("CpsQueries", _singletonQueryGroupProvider, 
      true);
    _instance.addSource(_queryGroupProviderSourceConnector);
    final CpsGenerator generator = new CpsGenerator(1, 4, 1);
    final CyberPhysicalSystem problem = generator.generateCpsProblem();
    final RuleBasedCpsSolver solver = new RuleBasedCpsSolver();
    solver.solve(problem);
  }
}
