package hu.bme.mit.inf.dslreasoner.domains.satellite.mdeo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pair;
import satellite.SatellitePackage;
import uk.ac.kcl.inf.mdeoptimiser.interfaces.cli.Run;

@SuppressWarnings("all")
public class SatelliteMdeOptimiserMain {
  private static final String PROJECT_PATH = ".";
  
  private static final String MOPT_PATH = "src/hu/bme/mit/inf/dslreasoner/domains/satellite/mdeo/satellite.mopt";
  
  private SatelliteMdeOptimiserMain() {
    new IllegalStateException("This is a static utility class and should not be instantiated directly.");
  }
  
  public static void main(final String[] args) {
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION, _xMIResourceFactoryImpl);
    EPackage.Registry.INSTANCE.put(SatellitePackage.eNS_URI, SatellitePackage.eINSTANCE);
    Pair<String, String> _mappedTo = Pair.<String, String>of("satellite.ecore", SatellitePackage.eNS_URI);
    SatelliteMdeOptimiserMain.fixupHenshinModel("model/satellite.henshin", "model/satellite_fixup.henshin", 
      Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo)));
    Run.main(new String[] { "-p", SatelliteMdeOptimiserMain.PROJECT_PATH, "-m", SatelliteMdeOptimiserMain.MOPT_PATH });
  }
  
  private static void fixupHenshinModel(final String originalPath, final String outputPath, final Map<String, String> remapMap) {
    try {
      FileReader _fileReader = new FileReader(originalPath);
      final BufferedReader reader = new BufferedReader(_fileReader);
      try {
        FileWriter _fileWriter = new FileWriter(outputPath);
        final BufferedWriter writer = new BufferedWriter(_fileWriter);
        try {
          String line = null;
          while (((line = reader.readLine()) != null)) {
            {
              Set<Map.Entry<String, String>> _entrySet = remapMap.entrySet();
              for (final Map.Entry<String, String> entry : _entrySet) {
                line = line.replace(entry.getKey(), entry.getValue());
              }
              writer.write(line);
              writer.write("\n");
            }
          }
        } finally {
          writer.close();
        }
      } finally {
        reader.close();
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
