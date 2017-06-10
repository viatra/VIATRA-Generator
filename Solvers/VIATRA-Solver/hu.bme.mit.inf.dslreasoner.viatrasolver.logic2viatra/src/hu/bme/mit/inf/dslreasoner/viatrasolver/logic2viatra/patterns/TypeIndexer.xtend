package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import org.eclipse.emf.ecore.EClass
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.Modality
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeAnalysisResult

interface TypeIndexer {
	public def CharSequence getRequiredQueries()
	public def boolean requiresTypeAnalysis()
	public def CharSequence generateInstanceOfQueries(LogicProblem problem,PartialInterpretation emptySolution,TypeAnalysisResult typeAnalysisResult)
	public def CharSequence referInstanceOf(Type type, Modality modality, String variableName)
	public def CharSequence referInstanceOf(EClass type, Modality modality, String variableName)
}