package ca.mcgill.ecse.dslreasoner.realistic.metrics.examples;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.examples.Util;
import com.google.common.base.Objects;
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage;
import hu.bme.mit.inf.dslreasoner.util.CollectionsUtil;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml;
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace;
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace;
import java.io.File;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import linkedList.LinkedListPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EReferenceImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.runtime.rete.matcher.ReteEngine;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public abstract class MetricsCalculationUsingShapes {
  private final static PartialInterpretation2Gml partialVisualizer = new PartialInterpretation2Gml();
  
  private static DecimalFormat df = new DecimalFormat("0.00000");
  
  private final static int PROGRESSPERCENTAGEJUMP = 10;
  
  public static void main(final String[] args) {
    try {
      MetricsCalculationUsingShapes.df.setRoundingMode(RoundingMode.UP);
      final String outputFolder = "outputs//calculatedMetrics//";
      Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("*", _xMIResourceFactoryImpl);
      YakindummPackage.eINSTANCE.eClass();
      LinkedListPackage.eINSTANCE.eClass();
      ReteEngine.class.getClass();
      final boolean testing = true;
      final boolean bounded = false;
      final int lowEnd = 0;
      final int highEnd = 20;
      final String calcTesting = "max";
      String fileDir = "";
      ArrayList<String> files = CollectionLiterals.<String>newArrayList(
        "A0", "V1", "H");
      if (testing) {
        files = CollectionLiterals.<String>newArrayList("test");
      }
      final ArrayList<String> metrics = CollectionLiterals.<String>newArrayList("SQRTOT");
      ArrayList<String> calcMethods = CollectionLiterals.<String>newArrayList();
      if (calcTesting != null) {
        switch (calcTesting) {
          case "max":
            calcMethods = CollectionLiterals.<String>newArrayList("Model", "NHLattice 0", "NHLattice 1", "NHLattice 2", "NHLattice 3");
            break;
          case "true":
            calcMethods = CollectionLiterals.<String>newArrayList("Model", "NHLattice 0", "NHLattice 1");
            break;
          case "false":
            calcMethods = CollectionLiterals.<String>newArrayList("Model", "NHLattice");
            break;
          case "min":
            calcMethods = CollectionLiterals.<String>newArrayList("Model");
            break;
          default:
            calcMethods = CollectionLiterals.<String>newArrayList("ERROR");
            break;
        }
      } else {
        calcMethods = CollectionLiterals.<String>newArrayList("ERROR");
      }
      for (final String fileSelector : files) {
        {
          if (fileSelector != null) {
            switch (fileSelector) {
              case "A0":
                fileDir = "A0//models//";
                break;
              case "A20":
                fileDir = "A20//models//";
                break;
              case "R1":
                fileDir = "RandomEMF-WF+7//models//";
                break;
              case "R2":
                fileDir = "RandomEMF30//models//";
                break;
              case "V1":
                fileDir = "VS-i//models//";
                break;
              case "V2":
                fileDir = "VS-WF+All5//models//";
                break;
              case "V3":
                fileDir = "VS-WF+All6//models//";
                break;
              case "V4":
                fileDir = "VS-WF+All7//models//";
                break;
              case "V5":
                fileDir = "VS+i//models//";
                break;
              case "H":
                fileDir = "Human//";
                break;
              default:
                fileDir = "_Test//";
                break;
            }
          } else {
            fileDir = "_Test//";
          }
          String inputs = "";
          if (testing) {
            inputs = "resources//";
          } else {
            inputs = ("inputs//" + fileDir);
          }
          final FileSystemWorkspace workspace = new FileSystemWorkspace(inputs, "");
          String _get = fileDir.split("//")[0];
          String directoryPath = (outputFolder + _get);
          new File(directoryPath).mkdirs();
          double calcVal = 0.0;
          double realVal = 0.0;
          int progressTracker = 0;
          List<String> listToLookThrough = CollectionLiterals.<String>newArrayList();
          List<String> subDirList = CollectionLiterals.<String>newArrayList();
          if (testing) {
            listToLookThrough = CollectionLiterals.<String>newArrayList("sampleList.xmi");
          } else {
            if (bounded) {
              int index = 0;
              List<String> _allFiles = workspace.allFiles();
              for (final String run : _allFiles) {
                String _fileString = URI.createFileURI(((inputs + "/") + run)).toFileString();
                boolean _isDirectory = new File(_fileString).isDirectory();
                if (_isDirectory) {
                  final ReasonerWorkspace subWS = workspace.subWorkspace(run, "");
                  String _fileString_1 = subWS.getWorkspaceURI().toFileString();
                  boolean _isDirectory_1 = new File(_fileString_1).isDirectory();
                  if (_isDirectory_1) {
                    List<String> _allFiles_1 = subWS.allFiles();
                    for (final String file : _allFiles_1) {
                      {
                        if (((index >= lowEnd) && (index <= highEnd))) {
                          listToLookThrough.add(((run + "/") + file));
                        }
                        index++;
                      }
                    }
                  }
                } else {
                  listToLookThrough.add(run);
                  index++;
                }
              }
              listToLookThrough = workspace.allFiles().subList(lowEnd, highEnd);
            } else {
              List<String> _allFiles_2 = workspace.allFiles();
              for (final String run_1 : _allFiles_2) {
                String _fileString_2 = URI.createFileURI(((inputs + "/") + run_1)).toFileString();
                boolean _isDirectory_2 = new File(_fileString_2).isDirectory();
                if (_isDirectory_2) {
                  final ReasonerWorkspace subWS_1 = workspace.subWorkspace(run_1, "");
                  String _fileString_3 = subWS_1.getWorkspaceURI().toFileString();
                  boolean _isDirectory_3 = new File(_fileString_3).isDirectory();
                  if (_isDirectory_3) {
                    List<String> _allFiles_3 = subWS_1.allFiles();
                    for (final String file_1 : _allFiles_3) {
                      listToLookThrough.add(((run_1 + "/") + file_1));
                    }
                  }
                } else {
                  listToLookThrough.add(run_1);
                }
              }
            }
          }
          Method method = MetricsCalculationUsingShapes.class.getMethods()[0];
          for (final String metric : metrics) {
            {
              String _get_1 = fileDir.split("//")[0];
              String _plus = ("(" + _get_1);
              String _plus_1 = (_plus + ") Metric: ");
              String _plus_2 = (_plus_1 + metric);
              InputOutput.<String>println(_plus_2);
              PrintWriter writer = new PrintWriter((((directoryPath + "//") + metric) + ".csv"));
              final String className = ("ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations.Calc" + metric);
              final Class<?> classObj = Class.forName(className);
              final List<String> baseVals = CollectionLiterals.<String>newArrayList();
              final List<String> expVals = CollectionLiterals.<String>newArrayList();
              for (final String calcMethod : calcMethods) {
                {
                  InputOutput.<String>print((((metric + " ") + calcMethod) + " : "));
                  boolean _equals = Objects.equal(calcMethod, "Model");
                  if (_equals) {
                    InputOutput.<String>print("    ");
                  }
                  writer.append((metric + ","));
                  writer.append(calcMethod);
                  expVals.clear();
                  int fileIndex = 0;
                  final List<String> _converted_listToLookThrough = (List<String>)listToLookThrough;
                  final int numFiles = ((Object[])Conversions.unwrapArray(_converted_listToLookThrough, Object.class)).length;
                  int currentProgress = 0;
                  for (final String fileName : listToLookThrough) {
                    {
                      final String nameWOExt = fileName.substring(0, fileName.indexOf("."));
                      final EObject model = workspace.<EObject>readModel(EObject.class, fileName);
                      final PartialInterpretation partialModel = Util.getPartialModel(workspace, model);
                      String methodName = ((("get" + metric) + "from") + calcMethod);
                      double value = 0.0;
                      boolean _equals_1 = Objects.equal(calcMethod, "Model");
                      if (_equals_1) {
                        method = classObj.getMethod(methodName, EObject.class);
                        Object _invoke = method.invoke(null, model);
                        value = (((Double) _invoke)).doubleValue();
                        baseVals.add(MetricsCalculationUsingShapes.df.format(value));
                      } else {
                        if ((Objects.equal(calcTesting, "false") || Objects.equal(calcTesting, "min"))) {
                          method = classObj.getMethod(methodName, PartialInterpretation.class);
                          Object _invoke_1 = method.invoke(null, partialModel);
                          value = (((Double) _invoke_1)).doubleValue();
                        } else {
                          String _get_2 = calcMethod.split(" ")[0];
                          String _plus_3 = ((("get" + metric) + "from") + _get_2);
                          methodName = _plus_3;
                          final Integer depth = Integer.valueOf(calcMethod.split(" ")[1]);
                          method = classObj.getMethod(methodName, PartialInterpretation.class, Integer.class);
                          Object _invoke_2 = method.invoke(null, partialModel, depth);
                          value = (((Double) _invoke_2)).doubleValue();
                          expVals.add(MetricsCalculationUsingShapes.df.format(value));
                        }
                      }
                      String valAsStr = MetricsCalculationUsingShapes.df.format(value);
                      writer.append(("," + valAsStr));
                      int ratioAchieved = ((fileIndex * 100) / numFiles);
                      if ((ratioAchieved >= currentProgress)) {
                        String _plus_4 = (Integer.valueOf(currentProgress) + "%-");
                        InputOutput.<String>print(_plus_4);
                        int _currentProgress = currentProgress;
                        currentProgress = (_currentProgress + MetricsCalculationUsingShapes.PROGRESSPERCENTAGEJUMP);
                      }
                      if ((fileIndex == (numFiles - 1))) {
                        InputOutput.<String>print("100%");
                      }
                      int _fileIndex = fileIndex;
                      fileIndex = (_fileIndex + 1);
                    }
                  }
                  if ((((!Objects.equal(calcMethod, "Model")) && (!Objects.equal(calcTesting, "false"))) && (!Objects.equal(calcTesting, "min")))) {
                    double _difference = Util.difference(baseVals, expVals);
                    String _plus_3 = ("  AVG Dif% : " + Double.valueOf(_difference));
                    InputOutput.<String>print(_plus_3);
                  }
                  InputOutput.println();
                  writer.append("\n");
                }
              }
              writer.close();
              InputOutput.println();
            }
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void printer(final Map<EObject, Integer> map) {
    Set<EObject> _keySet = map.keySet();
    for (final EObject key : _keySet) {
      String _name = ((EReferenceImpl) key).getName();
      String _plus = (_name + "=");
      Integer _lookup = CollectionsUtil.<EObject, Integer>lookup(key, map);
      String _plus_1 = (_plus + _lookup);
      String _plus_2 = (_plus_1 + ", ");
      InputOutput.<String>print(_plus_2);
    }
  }
  
  public static void printStrMap(final Map<String, Integer> map) {
    Set<String> _keySet = map.keySet();
    for (final String key : _keySet) {
      Integer _lookup = CollectionsUtil.<String, Integer>lookup(key, map);
      String _plus = ((key + "=") + _lookup);
      String _plus_1 = (_plus + ", ");
      InputOutput.<String>print(_plus_1);
    }
  }
  
  public static void printMap(final Map<String, Set<String>> map) {
    Set<String> _keySet = map.keySet();
    for (final String key : _keySet) {
      Set<String> _lookup = CollectionsUtil.<String, Set<String>>lookup(key, map);
      String _plus = ((key + " -> ") + _lookup);
      InputOutput.<String>println(_plus);
    }
  }
}
