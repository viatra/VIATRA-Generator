package ca.mcgill.ecse.dslreasoner.realistic.metrics.examples;

import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage;
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace;
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace;
import java.io.File;
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
      final String location = "inputs/VS+i/models/";
      final FileSystemWorkspace workspace = new FileSystemWorkspace(location, "");
      YakindummPackage.eINSTANCE.eClass();
      Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("*", _xMIResourceFactoryImpl);
      final ResourceSetImpl rs = new ResourceSetImpl();
      List<String> _allFiles = workspace.allFiles();
      for (final String run : _allFiles) {
        String _fileString = URI.createFileURI((location + run)).toFileString();
        boolean _isDirectory = new File(_fileString).isDirectory();
        if (_isDirectory) {
          final ReasonerWorkspace subWS = workspace.subWorkspace(run, "");
          String _fileString_1 = subWS.getWorkspaceURI().toFileString();
          boolean _isDirectory_1 = new File(_fileString_1).isDirectory();
          if (_isDirectory_1) {
            List<String> _allFiles_1 = subWS.allFiles();
            for (final String file : _allFiles_1) {
              {
                final String path = (((location + run) + "/") + file);
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
          final String path = (location + run);
          byte[] _readAllBytes = Files.readAllBytes(Paths.get(path));
          final String txt = new String(_readAllBytes, StandardCharsets.UTF_8);
          final String newTxt = txt.replace("\"viatrasolver.domain.sgraph\"", "\"hu.bme.mit.inf.yakindumm\"");
          InputOutput.<String>println(path);
          final PrintWriter writer = new PrintWriter(path);
          writer.append(newTxt);
          writer.close();
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
