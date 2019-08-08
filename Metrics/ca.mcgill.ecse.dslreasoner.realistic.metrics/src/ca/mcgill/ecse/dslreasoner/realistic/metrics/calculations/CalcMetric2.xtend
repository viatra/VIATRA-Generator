package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.List
import org.eclipse.emf.ecore.EObject

abstract class CalcMetric2 {
	abstract def List<Double> calcFromModel(EObject model)
	abstract def List<Double> calcFromNHLattice(PartialInterpretation partialModel)
	abstract def List<Double> calcFromNHLattice(PartialInterpretation partialModel, Integer depth)
}