package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.dse;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

import hu.bme.mit.inf.dslreasoner.logic.model.builder.TypeScopes;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Iff;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.Annotation;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.AssertionAnnotation;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.RelationAnnotation;
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.RelationAnnotationImpl;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation;

public class CardinalityCalculator {
	
	public boolean isViolated(PartialInterpretation partialInterpretation, TypeScopes typeScopes) {

		LogicProblem problem = partialInterpretation.getProblem();
		EList<Type> types = problem.getTypes();
		
		Map<Type, Integer> minNewElementsByType = typeScopes.minNewElementsByType;
		Map<Type, Integer> maxNewElementsByType = typeScopes.maxNewElementsByType;
		
		for (Type type : types) {
			if (type.isIsAbstract()) {
				int sumOfSubtypeMinimumScopes = 0;
				int sumOfSubtypeMaximumScopes = 0;
				EList<Type> subtypesOfAbstract = type.getSubtypes();
				for (Type subtype : subtypesOfAbstract) {
					sumOfSubtypeMinimumScopes += minNewElementsByType.get(subtype);
					sumOfSubtypeMaximumScopes += maxNewElementsByType.get(subtype);
				}
				Integer maxNewElementsOfAbstract = maxNewElementsByType.get(type);
				Integer minNewElementsOfAbstract = minNewElementsByType.get(type);
				if (sumOfSubtypeMinimumScopes > maxNewElementsOfAbstract 
				|| sumOfSubtypeMaximumScopes < minNewElementsOfAbstract) {
					return true;
				}
			}
		}
		return false;
	}
	
}
