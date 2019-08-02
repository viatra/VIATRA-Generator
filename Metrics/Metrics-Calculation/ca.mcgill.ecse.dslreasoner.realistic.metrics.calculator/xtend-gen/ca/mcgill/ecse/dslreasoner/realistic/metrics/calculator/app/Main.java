package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.EMFGraph;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io.CsvFileWriter;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io.GraphReader;
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.impl.YakindummPackageImpl;
import java.util.ArrayList;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class Main {
  public static class RWInformation {
    public String inputFolder;
    
    public String outputFolder;
    
    public int numRuns;
    
    public RWInformation(final String inputFolder, final String outputFolder, final int numRuns) {
      this.inputFolder = inputFolder;
      this.outputFolder = outputFolder;
      this.numRuns = numRuns;
    }
  }
  
  public static void main(final String[] args) {
    YakindummPackageImpl.eINSTANCE.eClass();
    EcorePackage.eINSTANCE.eClass();
    InputOutput.<String>println("Start Reading Models...");
    GraphReader reader = new GraphReader(EcorePackage.eINSTANCE, ".xmi");
    final Main.RWInformation human = new Main.RWInformation("Inputs/viatra75/", "outputs/", 50);
    Main.calculateAllModels(human.inputFolder, human.outputFolder, human.numRuns, reader);
    InputOutput.<String>println("finished");
  }
  
  public static ArrayList<Main.RWInformation> initData() {
    final ArrayList<Main.RWInformation> infos = new ArrayList<Main.RWInformation>();
    Main.RWInformation _rWInformation = new Main.RWInformation("inputs/alloyInput/models/", "../plot/statistics/alloyOutput/", 20);
    infos.add(_rWInformation);
    Main.RWInformation _rWInformation_1 = new Main.RWInformation("inputs/randomInput/models/", "../plot/statistics/randomOutput/", 20);
    infos.add(_rWInformation_1);
    Main.RWInformation _rWInformation_2 = new Main.RWInformation("inputs/viatraInput30/", "../plot/statistics/viatraOutput30/", 20);
    infos.add(_rWInformation_2);
    Main.RWInformation _rWInformation_3 = new Main.RWInformation("inputs/viatraInput100/", "../plot/statistics/viatraOutput100/", 10);
    infos.add(_rWInformation_3);
    return infos;
  }
  
  public static String calculateAllModels(final String inputFolder, final String outputFolder, final int numRuns, final GraphReader reader) {
    String _xblockexpression = null;
    {
      for (int i = 1; (i <= numRuns); i++) {
        {
          final ArrayList<EMFGraph> models = new ArrayList<EMFGraph>();
          models.addAll(reader.readModels(((inputFolder + "run") + Integer.valueOf(i))));
          for (final EMFGraph model : models) {
            String _name = model.getName();
            String _plus = (outputFolder + _name);
            String _plus_1 = (_plus + "_run_");
            String _plus_2 = (_plus_1 + Integer.valueOf(i));
            String _plus_3 = (_plus_2 + ".csv");
            Main.calculateAndOutputMetrics(model, YakindummPackageImpl.eNAME, _plus_3);
          }
        }
      }
      _xblockexpression = InputOutput.<String>println(("output results Ended for: " + outputFolder));
    }
    return _xblockexpression;
  }
  
  public static void calculateAndOutputMetrics(final EMFGraph model, final String metaModel, final String fileName) {
    model.setMetaModel(metaModel);
    CsvFileWriter.write(model.evaluateAllMetrics(), fileName);
  }
}
