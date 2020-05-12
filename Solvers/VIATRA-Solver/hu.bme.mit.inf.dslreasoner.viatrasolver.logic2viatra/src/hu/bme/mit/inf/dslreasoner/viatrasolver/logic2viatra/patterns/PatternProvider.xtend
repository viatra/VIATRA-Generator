package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.ModelGenerationStatistics
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeAnalysis
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeAnalysisResult
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeInferenceMethod
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.util.ParseUtil
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import java.util.Map
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery
import org.eclipse.xtend.lib.annotations.Data

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import java.util.Collection
import java.util.Set
import org.eclipse.viatra.query.runtime.matchers.psystem.PConstraint
import java.util.HashMap

@Data class GeneratedPatterns {
	public Map<Relation,  IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> invalidWFQueries
	public Map<Relation,  IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> unfinishedWFQueries
	public Map<Relation,  IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> unfinishedContainmentMulticiplicityQueries
	public Map<Relation,  IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> unfinishedNonContainmentMulticiplicityQueries
	public Map<ObjectCreationPrecondition,  IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> refineObjectQueries
	public Map<? extends Type,  IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> refineTypeQueries
	public Map<Pair<RelationDeclaration, Relation>,  IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> refinerelationQueries
	public Map<PConstraint, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>>  mustUnitPropagationPreconditionPatterns
	public Map<PConstraint, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>>  currentUnitPropagationPreconditionPatterns
	public Collection<IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> allQueries
}

class PatternProvider {
	
	val TypeAnalysis typeAnalysis = new TypeAnalysis
	
	public def generateQueries(
		LogicProblem problem,
		PartialInterpretation emptySolution,
		ModelGenerationStatistics statistics,
		Set<PQuery> existingQueries,
		ReasonerWorkspace workspace,
		TypeInferenceMethod typeInferenceMethod,
		boolean writeToFile)
	{
		val fqn2Query = existingQueries.toMap[it.fullyQualifiedName]
		val PatternGenerator patternGenerator = new PatternGenerator(typeInferenceMethod)
		val typeAnalysisResult = if(patternGenerator.requiresTypeAnalysis) {
			val startTime = System.nanoTime
			val result = typeAnalysis.performTypeAnalysis(problem,emptySolution)
			val typeAnalysisTime = System.nanoTime - startTime
			statistics.PreliminaryTypeAnalisisTime = typeAnalysisTime
			result
		} else {
			null
		}
		val patternGeneratorResult = patternGenerator.transformBaseProperties(problem,emptySolution,fqn2Query,typeAnalysisResult)
		val baseIndexerFile = patternGeneratorResult.patternText
		val mustUnitPropagationTrace = patternGeneratorResult.constraint2MustPreconditionName
		val currentUnitPropagationTrace = patternGeneratorResult.constraint2CurrentPreconditionName
		if(writeToFile) {
			workspace.writeText('''generated3valued.vql_deactivated''',baseIndexerFile)
		}
		val ParseUtil parseUtil = new ParseUtil
		val generatedQueries = parseUtil.parse(baseIndexerFile)
		val runtimeQueries = calclulateRuntimeQueries(patternGenerator,problem,emptySolution,typeAnalysisResult,mustUnitPropagationTrace,currentUnitPropagationTrace,generatedQueries);
		return runtimeQueries
	}
	
	private def GeneratedPatterns calclulateRuntimeQueries(
		PatternGenerator patternGenerator,
		LogicProblem problem,
		PartialInterpretation emptySolution,
		TypeAnalysisResult typeAnalysisResult,
		HashMap<PConstraint, String> mustUnitPropagationTrace,
		HashMap<PConstraint, String> currentUnitPropagationTrace,
		Map<String, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> queries
	) {
		val Map<Relation,  IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>>
			invalidWFQueries = patternGenerator.invalidIndexer.getInvalidateByWfQueryNames(problem).mapValues[it.lookup(queries)]
		val Map<Relation,  IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>>
			unfinishedWFQueries = patternGenerator.unfinishedIndexer.getUnfinishedWFQueryNames(problem).mapValues[it.lookup(queries)]
			
		val unfinishedMultiplicities = patternGenerator.unfinishedIndexer.getUnfinishedMultiplicityQueries(problem)
		val unfinishedContainmentMultiplicities = new HashMap
		val unfinishedNonContainmentMultiplicities = new HashMap
		for(entry : unfinishedMultiplicities.entrySet) {
			val relation = entry.key
			val value = entry.value.lookup(queries)
			if(problem.containmentHierarchies.head.containmentRelations.contains(relation)) {
				unfinishedContainmentMultiplicities.put(relation,value)
			} else {
				unfinishedNonContainmentMultiplicities.put(relation,value)
			}
		}
//		val Map<Relation,  IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>>
//			unfinishedMultiplicityQueries = patternGenerator.unfinishedIndexer.getUnfinishedMultiplicityQueries(problem).mapValues[it.lookup(queries)]
//			
			
		val Map<ObjectCreationPrecondition,  IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>>
			refineObjectsQueries = patternGenerator.typeRefinementGenerator.getRefineObjectQueryNames(problem,emptySolution,typeAnalysisResult).mapValues[it.lookup(queries)]
		val Map<? extends Type,  IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>>
			refineTypeQueries = patternGenerator.typeRefinementGenerator.getRefineTypeQueryNames(problem,emptySolution,typeAnalysisResult).mapValues[it.lookup(queries)]
		val Map<Pair<RelationDeclaration, Relation>,  IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>>
			refineRelationQueries = patternGenerator.relationRefinementGenerator.getRefineRelationQueries(problem).mapValues[it.lookup(queries)]
		val Map<PConstraint, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> 
			mustUnitPropagationPreconditionPatterns = mustUnitPropagationTrace.mapValues[it.lookup(queries)]
		val Map<PConstraint, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> 
			currentUnitPropagationPreconditionPatterns = currentUnitPropagationTrace.mapValues[it.lookup(queries)]
		return new GeneratedPatterns(
			invalidWFQueries,
			unfinishedWFQueries,
			unfinishedContainmentMultiplicities,
			unfinishedNonContainmentMultiplicities,
			refineObjectsQueries,
			refineTypeQueries,
			refineRelationQueries,
			mustUnitPropagationPreconditionPatterns,
			currentUnitPropagationPreconditionPatterns,
			queries.values
		)
	}
}
