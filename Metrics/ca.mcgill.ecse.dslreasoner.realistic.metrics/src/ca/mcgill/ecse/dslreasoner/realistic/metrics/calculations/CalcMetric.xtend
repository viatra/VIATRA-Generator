package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculations

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.List
import org.eclipse.emf.ecore.EObject

abstract class CalcMetric {
	abstract def double calcFromModel(EObject model)
	abstract def double calcFromNHLattice(PartialInterpretation partialModel)
	abstract def double calcFromNHLattice(PartialInterpretation partialModel, Integer depth)
}