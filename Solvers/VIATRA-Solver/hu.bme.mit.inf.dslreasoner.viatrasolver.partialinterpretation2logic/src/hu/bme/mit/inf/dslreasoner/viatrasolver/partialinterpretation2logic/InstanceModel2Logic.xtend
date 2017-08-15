package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic

import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import java.util.List
import org.eclipse.emf.ecore.EObject
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TypeScopes

class InstanceModel2Logic {
	val InstanceModel2PartialInterpretation instanceModel2PartialInterpretation = new InstanceModel2PartialInterpretation
	val PartialInterpretation2Logic partialInterpretation2Logic = new PartialInterpretation2Logic
	
	public def transform(
		TracedOutput<LogicProblem, Ecore2Logic_Trace> metamodelTranslationResult,
		List<EObject> objects,
		TypeScopes typeScopes) 
	{
		val res1 = this.instanceModel2PartialInterpretation.transform(metamodelTranslationResult,objects,true,typeScopes)
		this.partialInterpretation2Logic.transformPartialIntepretation2Logic(metamodelTranslationResult.output,res1)
		return metamodelTranslationResult//.output
	}
}