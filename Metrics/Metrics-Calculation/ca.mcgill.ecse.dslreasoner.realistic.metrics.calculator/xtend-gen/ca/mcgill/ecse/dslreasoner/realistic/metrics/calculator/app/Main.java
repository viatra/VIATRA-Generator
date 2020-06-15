package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app.Domain;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.EMFGraph;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io.CsvFileWriter;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io.GraphReader;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.validation.ViolationCheck;
import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.impl.YakindummPackageImpl;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EcorePackageImpl;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

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
  
  private static Domain d = Domain.Yakindumm;
  
  private final static String suffix = ".xmi";
  
  private final static String OUTPUT_FOLDER = "Inputs/measurement2/yakindu/Alloy/";
  
  private final static String INPUT_FOLDER = "outputs/measurement2/yakindu/Alloy/";
  
  private final static int NUM_RUNS = 1;
  
  public static void main(final String[] args) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field ReteEngine is undefined"
      + "\ngetClass cannot be resolved");
  }
  
  public static String calculateAllModels(final String inputFolder, final String outputFolder, final int numRuns, final GraphReader reader) {
    String _xblockexpression = null;
    {
      new File(outputFolder).mkdir();
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
    boolean _equals = Objects.equal(Main.d, Domain.Ecore);
    if (_equals) {
      final Function1<EReference, Boolean> _function = (EReference it) -> {
        return Boolean.valueOf((((((it.getName().equals("eGenericType") || it.getName().equals("eGenericSuperTypes")) || it.getName().equals("eFactoryInstance")) || 
          it.getName().equals("eGenericExceptions")) || it.getName().equals("references")) || it.getName().equals("contents")));
      };
      Iterator<EReference> refsToRemove = IteratorExtensions.<EReference>filter(Iterators.<EReference>filter(EcorePackageImpl.eINSTANCE.eAllContents(), EReference.class), _function);
      final Procedure1<EReference> _function_1 = (EReference it) -> {
        model.removeReference(it);
      };
      IteratorExtensions.<EReference>forEach(refsToRemove, _function_1);
    }
    ArrayList<ArrayList<String>> outputs = model.evaluateAllMetrics();
    int violations = ViolationCheck.calculateViolationCounts(model.getRoot(), Main.d);
    InputOutput.<Integer>println(Integer.valueOf(violations));
    String _plus = (Integer.valueOf(violations) + "");
    ArrayList<String> violationsOutput = CollectionLiterals.<String>newArrayList("violations", _plus);
    outputs.add(violationsOutput);
    CsvFileWriter.write(outputs, fileName);
  }
}
