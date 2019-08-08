package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations;

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import java.util.List;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public abstract class CalcMetric2 {
  public abstract List<Double> calcFromModel(final EObject model);
  
  public abstract List<Double> calcFromNHLattice(final PartialInterpretation partialModel);
  
  public abstract List<Double> calcFromNHLattice(final PartialInterpretation partialModel, final Integer depth);
}
