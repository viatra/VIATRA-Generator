package ca.mcgill.ecse.dslreasoner.realistic.metrics.examples;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.examples.Util;
import com.google.common.base.Objects;
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage;
import hu.bme.mit.inf.dslreasoner.util.CollectionsUtil;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2ShapeGraph;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
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
  private final static PartialInterpretation2ImmutableTypeLattice neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice();
  
  private final static Neighbourhood2ShapeGraph neighbouhood2ShapeGraph = new Neighbourhood2ShapeGraph();
  
  private static DecimalFormat df = new DecimalFormat("0.000");
  
  private final static Integer NUMMEASUREMENTS = Integer.valueOf(15);
  
  private final static Integer NUMNA = Integer.valueOf(2);
  
  private final static Integer NUMMPC = Integer.valueOf(4);
  
  private final static Integer NUMNDA = Integer.valueOf(6);
  
  public static void main(final String[] args) {
    try {
      MetricsCalculationUsingShapes.df.setRoundingMode(RoundingMode.UP);
      final String outputFolder = "outputs//calculatedMetrics//stats//";
      Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("*", _xMIResourceFactoryImpl);
      YakindummPackage.eINSTANCE.eClass();
      LinkedListPackage.eINSTANCE.eClass();
      ReteEngine.class.getClass();
      final boolean testing = true;
      final String fileSelector = "A0";
      final boolean bounded = false;
      final int lowEnd = 0;
      final int highEnd = 1;
      String fileDir = "";
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
          default:
            fileDir = "Human//";
            break;
        }
      } else {
        fileDir = "Human//";
      }
      String inputs = "";
      if (testing) {
        inputs = "resources//";
      } else {
        inputs = ("inputs//" + fileDir);
      }
      final FileSystemWorkspace workspace = new FileSystemWorkspace(inputs, "");
      final ArrayList<String> metrics = CollectionLiterals.<String>newArrayList("NA", "MPC", "NDA", "NDC", "EDA", "C");
      final ArrayList<String> calcMethods = CollectionLiterals.<String>newArrayList("Model", "NHLattice");
      double calcVal = 0.0;
      double realVal = 0.0;
      int progressTracker = 0;
      List<String> listToLookThrough = CollectionLiterals.<String>newArrayList();
      List<String> subDirList = CollectionLiterals.<String>newArrayList();
      if (testing) {
        listToLookThrough = CollectionLiterals.<String>newArrayList("sampleList.xmi");
      } else {
        if (bounded) {
          listToLookThrough = workspace.allFiles().subList(lowEnd, highEnd);
        } else {
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
                  listToLookThrough.add(((run + "/") + file));
                }
              }
            } else {
              listToLookThrough.add(run);
            }
          }
        }
      }
      Method method = MetricsCalculationUsingShapes.class.getMethods()[0];
      for (final String metric : metrics) {
        {
          InputOutput.<String>println(("Metric: " + metric));
          PrintWriter writer = new PrintWriter((((outputFolder + "stats") + metric) + ".csv"));
          final String className = ("ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations.Calc" + metric);
          final Class<?> classObj = Class.forName(className);
          for (final String calcMethod : calcMethods) {
            {
              InputOutput.<String>print((((metric + " ") + calcMethod) + " : "));
              boolean _equals = Objects.equal(calcMethod, "Model");
              if (_equals) {
                InputOutput.<String>print("    ");
              }
              writer.append(metric);
              writer.append(calcMethod);
              long startTime = System.currentTimeMillis();
              for (final String fileName : listToLookThrough) {
                {
                  final String nameWOExt = fileName.substring(0, fileName.indexOf("."));
                  final EObject model = workspace.<EObject>readModel(EObject.class, fileName);
                  final PartialInterpretation partialModel = Util.getPartialModel(workspace, model);
                  final String methodName = ((("get" + metric) + "from") + calcMethod);
                  double value = 0.0;
                  boolean _equals_1 = Objects.equal(calcMethod, "Model");
                  if (_equals_1) {
                    method = classObj.getMethod(methodName, EObject.class);
                    Object _invoke = method.invoke(null, model);
                    value = (((Double) _invoke)).doubleValue();
                  } else {
                    method = classObj.getMethod(methodName, PartialInterpretation.class);
                    Object _invoke_1 = method.invoke(null, partialModel);
                    value = (((Double) _invoke_1)).doubleValue();
                  }
                  String valAsStr = MetricsCalculationUsingShapes.df.format(value);
                  InputOutput.<String>print((valAsStr + " "));
                  writer.append(valAsStr);
                  writer.close();
                }
              }
              long _currentTimeMillis = System.currentTimeMillis();
              long duration = (_currentTimeMillis - startTime);
              InputOutput.println();
              InputOutput.<String>println(("    time: " + Long.valueOf(duration)));
              writer.append("\n");
            }
          }
          InputOutput.println();
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static String printResults(final List<List<String>> metricValues, final List<Double> totalDeltas, final List<List<String>> deltas) {
    String _xblockexpression = null;
    {
      final int numModels = ((Object[])Conversions.unwrapArray(metricValues.get(0), Object.class)).length;
      InputOutput.println();
      InputOutput.<String>println("Node Activity:");
      List<String> _get = metricValues.get(0);
      String _plus = ("from Partial Model: " + _get);
      InputOutput.<String>println(_plus);
      List<String> _get_1 = metricValues.get(1);
      String _plus_1 = ("from NH Shape     : " + _get_1);
      InputOutput.<String>println(_plus_1);
      Double _get_2 = totalDeltas.get(0);
      double _divide = ((_get_2).doubleValue() / numModels);
      String _format = MetricsCalculationUsingShapes.df.format(_divide);
      String _plus_2 = ("       Avg % delta: " + _format);
      InputOutput.<String>println(_plus_2);
      InputOutput.<String>println("MPC:");
      List<String> _get_3 = metricValues.get(2);
      String _plus_3 = ("from Partial Model: " + _get_3);
      InputOutput.<String>println(_plus_3);
      List<String> _get_4 = metricValues.get(3);
      String _plus_4 = ("from NH Shape     : " + _get_4);
      InputOutput.<String>println(_plus_4);
      Double _get_5 = totalDeltas.get(1);
      double _divide_1 = ((_get_5).doubleValue() / numModels);
      String _format_1 = MetricsCalculationUsingShapes.df.format(_divide_1);
      String _plus_5 = ("       Avg % delta: " + _format_1);
      InputOutput.<String>println(_plus_5);
      InputOutput.<String>println("NDA:");
      List<String> _get_6 = metricValues.get(4);
      String _plus_6 = ("from Partial Model: " + _get_6);
      InputOutput.<String>println(_plus_6);
      List<String> _get_7 = metricValues.get(5);
      String _plus_7 = ("from NH Shape     : " + _get_7);
      InputOutput.<String>println(_plus_7);
      Double _get_8 = totalDeltas.get(2);
      double _divide_2 = ((_get_8).doubleValue() / numModels);
      String _format_2 = MetricsCalculationUsingShapes.df.format(_divide_2);
      String _plus_8 = ("       Avg % delta: " + _format_2);
      InputOutput.<String>println(_plus_8);
      InputOutput.<String>println("NDC:");
      List<String> _get_9 = metricValues.get(6);
      String _plus_9 = ("from Partial Model: " + _get_9);
      InputOutput.<String>println(_plus_9);
      List<String> _get_10 = metricValues.get(7);
      String _plus_10 = ("from NH Shape     : " + _get_10);
      InputOutput.<String>println(_plus_10);
      Double _get_11 = totalDeltas.get(3);
      double _divide_3 = ((_get_11).doubleValue() / numModels);
      String _format_3 = MetricsCalculationUsingShapes.df.format(_divide_3);
      String _plus_11 = ("       Avg % delta: " + _format_3);
      InputOutput.<String>println(_plus_11);
      InputOutput.<String>println("EDA:");
      List<String> _get_12 = metricValues.get(8);
      String _plus_12 = ("from Partial Model: " + _get_12);
      InputOutput.<String>println(_plus_12);
      List<String> _get_13 = metricValues.get(9);
      String _plus_13 = ("from NH Shape In  : " + _get_13);
      InputOutput.<String>println(_plus_13);
      List<String> _get_14 = deltas.get(0);
      String _plus_14 = ("           deltas : " + _get_14);
      InputOutput.<String>println(_plus_14);
      Double _get_15 = totalDeltas.get(4);
      double _divide_4 = ((_get_15).doubleValue() / numModels);
      String _format_4 = MetricsCalculationUsingShapes.df.format(_divide_4);
      String _plus_15 = ("       Avg % delta: " + _format_4);
      InputOutput.<String>println(_plus_15);
      List<String> _get_16 = metricValues.get(10);
      String _plus_16 = ("from NH Shape Out : " + _get_16);
      InputOutput.<String>println(_plus_16);
      List<String> _get_17 = deltas.get(1);
      String _plus_17 = ("           deltas : " + _get_17);
      InputOutput.<String>println(_plus_17);
      Double _get_18 = totalDeltas.get(5);
      double _divide_5 = ((_get_18).doubleValue() / numModels);
      String _format_5 = MetricsCalculationUsingShapes.df.format(_divide_5);
      String _plus_18 = ("       Avg % delta: " + _format_5);
      InputOutput.<String>println(_plus_18);
      List<String> _get_19 = metricValues.get(11);
      String _plus_19 = ("from NH Shape Avg : " + _get_19);
      InputOutput.<String>println(_plus_19);
      List<String> _get_20 = deltas.get(2);
      String _plus_20 = ("           deltas : " + _get_20);
      InputOutput.<String>println(_plus_20);
      Double _get_21 = totalDeltas.get(6);
      double _divide_6 = ((_get_21).doubleValue() / numModels);
      String _format_6 = MetricsCalculationUsingShapes.df.format(_divide_6);
      String _plus_21 = ("       Avg % delta: " + _format_6);
      _xblockexpression = InputOutput.<String>println(_plus_21);
    }
    return _xblockexpression;
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
