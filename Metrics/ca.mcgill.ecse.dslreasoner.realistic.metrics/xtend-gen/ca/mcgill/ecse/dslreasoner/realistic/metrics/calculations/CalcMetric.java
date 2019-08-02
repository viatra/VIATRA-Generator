package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations;

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public abstract class CalcMetric {
  public abstract double calcFromModel(final EObject model);
  
  public abstract double calcFromNHLattice(final PartialInterpretation partialModel);
  
  public abstract double calcFromNHLattice(final PartialInterpretation partialModel, final Integer depth);
}
