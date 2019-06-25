package ca.mcgill.ecse.dslreasoner.realistic.metrics.examples;

import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage;
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class FixModelURIs {
  public static void main(final String[] args) {
    try {
      final String location = "inputs/RandomEMF-WF+7/models/";
      final FileSystemWorkspace workspace = new FileSystemWorkspace(location, "");
      YakindummPackage.eINSTANCE.eClass();
      Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("*", _xMIResourceFactoryImpl);
      final ResourceSetImpl rs = new ResourceSetImpl();
      final boolean isParentDir = true;
      if (isParentDir) {
        for (int i = 1; (i < 21); i++) {
          for (int j = 1; (j < 31); j++) {
            {
              final String path = (((((((location + "run") + Integer.valueOf(i)) + "/") + Integer.valueOf(i)) + "_") + Integer.valueOf(j)) + ".xmi");
              final URI uri = URI.createFileURI(path);
              byte[] _readAllBytes = Files.readAllBytes(Paths.get(path));
              final String txt = new String(_readAllBytes, StandardCharsets.UTF_8);
              final String newTxt = txt.replace("\"viatrasolver.domain.sgraph\"", "\"hu.bme.mit.inf.yakindumm\"");
              InputOutput.<String>println(path);
              final PrintWriter writer = new PrintWriter(path);
              writer.append(newTxt);
              writer.close();
            }
          }
        }
      } else {
        List<String> _allFiles = workspace.allFiles();
        for (final String f : _allFiles) {
          {
            final String path = ((location + "/") + f);
            byte[] _readAllBytes = Files.readAllBytes(Paths.get(path));
            final String txt = new String(_readAllBytes, StandardCharsets.UTF_8);
            final String newTxt = txt.replace("\"viatrasolver.domain.sgraph\"", "\"hu.bme.mit.inf.yakindumm\"");
            InputOutput.<String>println(path);
            final PrintWriter writer = new PrintWriter(path);
            writer.append(newTxt);
            writer.close();
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
