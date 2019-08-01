package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra

import com.google.common.collect.ImmutableMap
import hu.bme.mit.inf.dslreasoner.logic.model.builder.DocumentationLevel
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransfomedViatraQuery
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.CbcPolyhedronSolver
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.MultiplicityGoalConstraintCalculator
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.PolyhedronScopePropagator
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.RelationConstraintCalculator
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.ScopePropagator
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.ScopePropagatorStrategy
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.TypeHierarchyScopePropagator
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.Z3PolyhedronSolver
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns.GeneratedPatterns
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns.ModalPatternQueries
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns.PatternProvider
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.rules.GoalConstraintProvider
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.rules.RefinementRuleProvider
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import java.util.Collection
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.IQuerySpecification
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule
import org.eclipse.xtend.lib.annotations.Data

class ModelGenerationStatistics {
	public var long transformationExecutionTime = 0

	synchronized def addExecutionTime(long amount) {
		transformationExecutionTime += amount
	}

	public var long scopePropagationTime = 0

	synchronized def addScopePropagationTime(long amount) {
		scopePropagationTime += amount
	}

	public var long preliminaryTypeAnalisisTime = 0

	public var int decisionsTried = 0
	
	synchronized def incrementDecisionCount() {
		decisionsTried++
	}
	
	public var int scopePropagatorInvocations
	
	synchronized def incrementScopePropagationCount() {
		scopePropagatorInvocations++
	}
}

@Data class ModelGenerationMethod {
	ModelGenerationStatistics statistics

	Collection<? extends BatchTransformationRule<?, ?>> objectRefinementRules
	Collection<? extends BatchTransformationRule<?, ?>> relationRefinementRules

	List<MultiplicityGoalConstraintCalculator> unfinishedMultiplicities

	Collection<? extends IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> unfinishedWF

	Collection<? extends IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> invalidWF

	Map<String, ModalPatternQueries> modalRelationQueries

	Collection<? extends IQuerySpecification<? extends ViatraQueryMatcher<? extends IPatternMatch>>> allPatterns
}

enum TypeInferenceMethod {
	Generic,
	PreliminaryAnalysis
}

class ModelGenerationMethodProvider {
	val PatternProvider patternProvider = new PatternProvider
	val RefinementRuleProvider refinementRuleProvider = new RefinementRuleProvider
	val GoalConstraintProvider goalConstraintProvider = new GoalConstraintProvider
	val relationConstraintCalculator = new RelationConstraintCalculator

	def ModelGenerationMethod createModelGenerationMethod(
		LogicProblem logicProblem,
		PartialInterpretation emptySolution,
		ReasonerWorkspace workspace,
		boolean nameNewElements,
		TypeInferenceMethod typeInferenceMethod,
		ScopePropagatorStrategy scopePropagatorStrategy,
		DocumentationLevel debugLevel
	) {
		val statistics = new ModelGenerationStatistics
		val writeFiles = (debugLevel === DocumentationLevel.NORMAL || debugLevel === DocumentationLevel.FULL)

		val Set<PQuery> existingQueries = logicProblem.relations.map[annotations].flatten.filter(TransfomedViatraQuery).
			map[it.patternPQuery as PQuery].toSet

		val relationConstraints = relationConstraintCalculator.calculateRelationConstraints(logicProblem)
		val queries = patternProvider.generateQueries(logicProblem, emptySolution, statistics, existingQueries,
			workspace, typeInferenceMethod, scopePropagatorStrategy, relationConstraints, writeFiles)
		val scopePropagator = createScopePropagator(scopePropagatorStrategy, emptySolution, queries, statistics)
		scopePropagator.propagateAllScopeConstraints
		val objectRefinementRules = refinementRuleProvider.createObjectRefinementRules(queries, scopePropagator,
			nameNewElements, statistics)
		val relationRefinementRules = refinementRuleProvider.createRelationRefinementRules(queries, scopePropagator,
			statistics)

		val unfinishedMultiplicities = goalConstraintProvider.getUnfinishedMultiplicityQueries(queries)
		val unfinishedWF = queries.getUnfinishedWFQueries.values

		val modalRelationQueriesBuilder = ImmutableMap.builder
		for (entry : queries.modalRelationQueries.entrySet) {
			val annotation = entry.key.annotations.filter(TransfomedViatraQuery).head
			if (annotation !== null) {
				modalRelationQueriesBuilder.put(annotation.patternFullyQualifiedName, entry.value)
			}
		}
		val modalRelationQueries = modalRelationQueriesBuilder.build

		val invalidWF = queries.getInvalidWFQueries.values

		return new ModelGenerationMethod(
			statistics,
			objectRefinementRules.values,
			relationRefinementRules.values,
			unfinishedMultiplicities,
			unfinishedWF,
			invalidWF,
			modalRelationQueries,
			queries.allQueries
		)
	}

	private def createScopePropagator(ScopePropagatorStrategy scopePropagatorStrategy,
		PartialInterpretation emptySolution, GeneratedPatterns queries, ModelGenerationStatistics statistics) {
		switch (scopePropagatorStrategy) {
			case ScopePropagatorStrategy.Count:
				new ScopePropagator(emptySolution, statistics)
			case ScopePropagatorStrategy.BasicTypeHierarchy:
				new TypeHierarchyScopePropagator(emptySolution, statistics)
			ScopePropagatorStrategy.Polyhedral: {
				val types = queries.refineObjectQueries.keySet.map[newType].toSet
				val solver = switch (scopePropagatorStrategy.solver) {
					case Z3Integer:
						new Z3PolyhedronSolver(false, scopePropagatorStrategy.timeoutSeconds)
					case Z3Real:
						new Z3PolyhedronSolver(true, scopePropagatorStrategy.timeoutSeconds)
					case Cbc:
						new CbcPolyhedronSolver(false, scopePropagatorStrategy.timeoutSeconds, true)
					case Clp:
						new CbcPolyhedronSolver(true, scopePropagatorStrategy.timeoutSeconds, true)
					default:
						throw new IllegalArgumentException("Unknown polyhedron solver: " +
							scopePropagatorStrategy.solver)
				}
				new PolyhedronScopePropagator(emptySolution, statistics, types, queries.multiplicityConstraintQueries,
					queries.hasElementInContainmentQuery, solver, scopePropagatorStrategy.requiresUpperBoundIndexing)
			}
			default:
				throw new IllegalArgumentException("Unknown scope propagator strategy: " + scopePropagatorStrategy)
		}
	}
}
