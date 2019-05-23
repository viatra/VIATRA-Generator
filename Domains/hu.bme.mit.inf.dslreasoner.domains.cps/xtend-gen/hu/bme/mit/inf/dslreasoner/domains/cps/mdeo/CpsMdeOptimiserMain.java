package hu.bme.mit.inf.dslreasoner.domains.cps.mdeo;

import com.google.inject.Injector;
import hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage;
import hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.dslreasoner.domains.cps.generator.CpsGenerator;
import hu.bme.mit.inf.dslreasoner.domains.cps.mdeo.ExcludedRun;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import uk.ac.kcl.inf.mdeoptimiser.languages.MoptStandaloneSetup;

@SuppressWarnings("all")
public class CpsMdeOptimiserMain {
  private static final String PROJECT_PATH = ".";
  
  private static final String PROBLEM_PATH = "model/problem.xmi";
  
  private static final String MOPT_PATH = "src/hu/bme/mit/inf/dslreasoner/domains/cps/mdeo/cps.mopt";
  
  private CpsMdeOptimiserMain() {
    new IllegalStateException("This is a static utility class and should not be instantiated directly.");
  }
  
  public static void main(final String[] args) {
    try {
      Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION, _xMIResourceFactoryImpl);
      EPackage.Registry.INSTANCE.put(CpsPackage.eNS_URI, CpsPackage.eINSTANCE);
      final CpsGenerator generator = new CpsGenerator(1, 4, 2);
      final CyberPhysicalSystem problem = generator.generateCpsProblem();
      Resource _eResource = problem.eResource();
      _eResource.setURI(URI.createFileURI(CpsMdeOptimiserMain.PROBLEM_PATH));
      problem.eResource().save(CollectionLiterals.<Object, Object>emptyMap());
      final Injector injector = new MoptStandaloneSetup().createInjectorAndDoEMFRegistration();
      injector.<ExcludedRun>getInstance(ExcludedRun.class).run(CpsMdeOptimiserMain.PROJECT_PATH, CpsMdeOptimiserMain.MOPT_PATH);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
