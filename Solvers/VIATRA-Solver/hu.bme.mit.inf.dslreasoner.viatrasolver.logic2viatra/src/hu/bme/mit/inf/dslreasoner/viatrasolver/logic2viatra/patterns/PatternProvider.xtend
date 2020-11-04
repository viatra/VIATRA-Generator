package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns

import com.google.common.collect.ImmutableSet
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.Modality
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.ModelGenerationStatistics
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeAnalysis
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeAnalysisResult
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeInferenceMethod
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.LinearTypeConstraintHint
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.RelationConstraints
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.RelationMultiplicityConstraint
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.ScopePropagatorStrategy
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.util.ParseUtil
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import java.util.Collection
import java.util.HashMap
import java.util.Map
import java.util.Set
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.query.runtime.matchers.psystem.PConstraint
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery
import org.eclipse.xtend.lib.annotations.Data

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

@Data class GeneratedPatterns {
	public Map<Relation, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> invalidWFQueries
	public Map<Relation, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> unfinishedWFQueries
	public Map<RelationMultiplicityConstraint, UnifinishedMultiplicityQueries> multiplicityConstraintQueries
	public IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> hasElementInContainmentQuery
	public Map<ObjectCreationPrecondition, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> refineObjectQueries
	public Map<? extends Type, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> refineTypeQueries
	public Map<Pair<RelationDeclaration, Relation>, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> refineRelationQueries
	public Map<Pair<RelationDeclaration, Relation>, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> mustRelationPropagationQueries
	public Map<PConstraint, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> mustUnitPropagationPreconditionPatterns
	public Map<PConstraint, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> currentUnitPropagationPreconditionPatterns
	public Map<RelationDefinition, ModalPatternQueries> modalRelationQueries
	public Collection<IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> allQueries
}

@Data
class ModalPatternQueries {
	val IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> mayQuery
	val IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> mustQuery
	val IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> currentQuery
}

@Data
class UnifinishedMultiplicityQueries {
	val IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> existingMultiplicityQuery
	val IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>> existingInverseMultiplicityQuery

	def Set<IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> getAllQueries() {
		val builder = ImmutableSet.builder
		if (existingMultiplicityQuery !== null) {
			builder.add(existingMultiplicityQuery)
		}
		if (existingInverseMultiplicityQuery !== null) {
			builder.add(existingInverseMultiplicityQuery)
		}
		builder.build
	}
}

class PatternProvider {
	val TypeAnalysis typeAnalysis = new TypeAnalysis

	def generateQueries(LogicProblem problem, PartialInterpretation emptySolution, ModelGenerationStatistics statistics,
		Set<PQuery> existingQueries, ReasonerWorkspace workspace, TypeInferenceMethod typeInferenceMethod,
		ScopePropagatorStrategy scopePropagatorStrategy, RelationConstraints relationConstraints,
		Collection<LinearTypeConstraintHint> hints,
		Collection<UnitPropagationPatternGenerator> unitPropagationPatternGenerators, boolean writeToFile) {
		val fqn2Query = existingQueries.toMap[it.fullyQualifiedName]
		val PatternGenerator patternGenerator = new PatternGenerator(typeInferenceMethod, scopePropagatorStrategy)
		val typeAnalysisResult = if (patternGenerator.requiresTypeAnalysis) {
				val startTime = System.nanoTime
				val result = typeAnalysis.performTypeAnalysis(problem, emptySolution)
				val typeAnalysisTime = System.nanoTime - startTime
				statistics.preliminaryTypeAnalisisTime = typeAnalysisTime
				result
			} else {
				null
			}
		val patternGeneratorResult = patternGenerator.transformBaseProperties(problem, emptySolution, fqn2Query,
			typeAnalysisResult, relationConstraints, hints, unitPropagationPatternGenerators)
		if (writeToFile) {
			workspace.writeText('''generated3valued.vql_deactivated''', patternGeneratorResult.patternText)
		}
		val ParseUtil parseUtil = new ParseUtil
		val generatedQueries = parseUtil.parse(patternGeneratorResult.patternText)
		val runtimeQueries = calclulateRuntimeQueries(patternGenerator, problem, emptySolution, typeAnalysisResult,
			patternGeneratorResult.constraint2MustPreconditionName,
			patternGeneratorResult.constraint2CurrentPreconditionName, relationConstraints,
			unitPropagationPatternGenerators, generatedQueries)
		return runtimeQueries
	}

	private def GeneratedPatterns calclulateRuntimeQueries(
		PatternGenerator patternGenerator,
		LogicProblem problem,
		PartialInterpretation emptySolution,
		TypeAnalysisResult typeAnalysisResult,
		HashMap<PConstraint, String> mustUnitPropagationTrace,
		HashMap<PConstraint, String> currentUnitPropagationTrace,
		RelationConstraints relationConstraints,
		Collection<UnitPropagationPatternGenerator> unitPropagationPatternGenerators,
		Map<String, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> queries
	) {
		val Map<Relation, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> invalidWFQueries = patternGenerator.
			invalidIndexer.getInvalidateByWfQueryNames(problem).mapValues[it.lookup(queries)]
		val Map<Relation, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> unfinishedWFQueries = patternGenerator.
			unfinishedIndexer.getUnfinishedWFQueryNames(problem).mapValues[it.lookup(queries)]

		val unfinishedMultiplicities = patternGenerator.unfinishedIndexer.getUnfinishedMultiplicityQueries(
			relationConstraints.multiplicityConstraints)
		val multiplicityConstraintQueries = unfinishedMultiplicities.mapValues [
			new UnifinishedMultiplicityQueries(existingMultiplicityQueryName?.lookup(queries),
				existingInverseMultiplicityQueryName?.lookup(queries))
		]
		val hasElementInContainmentQuery = patternGenerator.typeRefinementGenerator.hasElementInContainmentName.lookup(
			queries)

		val Map<ObjectCreationPrecondition, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> refineObjectsQueries = patternGenerator.
			typeRefinementGenerator.getRefineObjectQueryNames(problem, emptySolution, typeAnalysisResult).mapValues [
				it.lookup(queries)
			]
		val Map<? extends Type, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> refineTypeQueries = patternGenerator.
			typeRefinementGenerator.getRefineTypeQueryNames(problem, emptySolution, typeAnalysisResult).mapValues [
				it.lookup(queries)
			]
		val Map<Pair<RelationDeclaration, Relation>, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> refineRelationQueries = patternGenerator.
			relationRefinementGenerator.getRefineRelationQueries(problem).mapValues[it.lookup(queries)]
		val Map<Pair<RelationDeclaration, Relation>, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> mustRelationPropagationQueries = patternGenerator.
			relationRefinementGenerator.getMustPropagationQueries(problem, unitPropagationPatternGenerators).mapValues[it.lookup(queries)]
		val Map<PConstraint, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> mustUnitPropagationPreconditionPatterns = mustUnitPropagationTrace.
			mapValues[it.lookup(queries)]
		val Map<PConstraint, IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> currentUnitPropagationPreconditionPatterns = currentUnitPropagationTrace.
			mapValues[it.lookup(queries)]

		val modalRelationQueries = problem.relations.filter(RelationDefinition).toMap([it], [ relationDefinition |
			val indexer = patternGenerator.relationDefinitionIndexer
			new ModalPatternQueries(
				indexer.relationDefinitionName(relationDefinition, Modality.MAY).lookup(queries),
				indexer.relationDefinitionName(relationDefinition, Modality.MUST).lookup(queries),
				indexer.relationDefinitionName(relationDefinition, Modality.CURRENT).lookup(queries)
			)
		])

		return new GeneratedPatterns(
			invalidWFQueries,
			unfinishedWFQueries,
			multiplicityConstraintQueries,
			hasElementInContainmentQuery,
			refineObjectsQueries,
			refineTypeQueries,
			refineRelationQueries,
			mustRelationPropagationQueries,
			mustUnitPropagationPreconditionPatterns,
			currentUnitPropagationPreconditionPatterns,
			modalRelationQueries,
			queries.values
		)
	}
}
