package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app.Domain;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.EMFGraph;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io.GraphReader;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.MetricSampleGroup;
import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EcorePackageImpl;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Read the sample of the distribution of a metric provided the csv file of the metric
 */
@SuppressWarnings("all")
public class RepMetricsReader {
  private static Domain domain;
  
  public static MetricSampleGroup read(final Domain d) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field GithubPackageImpl is undefined"
      + "\neINSTANCE cannot be resolved");
  }
  
  /**
   * Read representative model
   */
  private static MetricSampleGroup readMetrics(final GraphReader r, final String path) {
    final EMFGraph model = IterableExtensions.<EMFGraph>head(r.readModels(path));
    boolean _equals = Objects.equal(RepMetricsReader.domain, Domain.Ecore);
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
    return model.evaluateAllMetricsToSamples();
  }
}
