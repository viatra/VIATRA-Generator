package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner

import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicReasoner
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.ModelGenerationMethod
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeInferenceMethod
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.PolyhedralScopePropagatorConstraints
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.PolyhedralScopePropagatorSolver
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.ScopePropagatorStrategy
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretationVisualiser
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.ObjectiveKind
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.ObjectiveThreshold
import java.util.LinkedList
import java.util.List
import java.util.Set
import org.eclipse.xtext.xbase.lib.Functions.Function1

enum StateCoderStrategy {
	Neighbourhood,
	PairwiseNeighbourhood,
	NeighbourhoodWithEquivalence,
	IDBased,
	DefinedByDiversity
}

class ViatraReasonerConfiguration extends LogicSolverConfiguration {
	// public var Iterable<PQuery> existingQueries
	public var nameNewElements = false
	public var StateCoderStrategy stateCoderStrategy = StateCoderStrategy.Neighbourhood
	public var TypeInferenceMethod typeInferenceMethod = TypeInferenceMethod.PreliminaryAnalysis
	/**
	 * Once per 1/randomBacktrackChance the search selects a random state.
	 */
	public var int randomBacktrackChance = 20;

	/**
	 * Describes the required diversity between the solutions.
	 * Null means that the solutions have to have different state codes only.
	 */
	public var DiversityDescriptor diversityRequirement = new DiversityDescriptor
	/**
	 * A logic solver that able to check the consistency of an intermediate solution.
	 * Null means that no solver is called.
	 */
	public var InternalConsistencyCheckerConfiguration internalConsistencyCheckerConfiguration = new InternalConsistencyCheckerConfiguration
	/**
	 * Configuration for debugging support.
	 */
	public var DebugConfiguration debugConfiguration = new DebugConfiguration
	/**
	 * Configuration for cutting search space.
	 */
	public var SearchSpaceConstraint searchSpaceConstraints = new SearchSpaceConstraint

	public var ScopePropagatorStrategy scopePropagatorStrategy = new ScopePropagatorStrategy.Polyhedral(
		PolyhedralScopePropagatorConstraints.Relational, PolyhedralScopePropagatorSolver.Clp)

	public var List<CostObjectiveConfiguration> costObjectives = newArrayList
}

class DiversityDescriptor {
	public var ensureDiversity = false
	public static val FixPointRange = -1
	public var int range = FixPointRange
	public var int parallels = Integer.MAX_VALUE
	public var int maxNumber = Integer.MAX_VALUE
	public var Set<TypeDeclaration> relevantTypes = null
	public var Set<RelationDeclaration> relevantRelations = null
}

class DebugConfiguration {
	public var PartialInterpretationVisualiser partialInterpretatioVisualiser = null
	public var partalInterpretationVisualisationFrequency = 1
}

class InternalConsistencyCheckerConfiguration {
	public var LogicReasoner internalIncosnsitencyDetector = null
	public var LogicSolverConfiguration internalInconsistencDetectorConfiguration = null
	public var incternalConsistencyCheckingFrequency = 1
}

class SearchSpaceConstraint {
	public static val UNLIMITED_MAXDEPTH = Integer.MAX_VALUE
	public var int maxDepth = UNLIMITED_MAXDEPTH
	public var List<Function1<ModelGenerationMethod, ModelGenerationMethodBasedGlobalConstraint>> additionalGlobalConstraints = new LinkedList
}

class CostObjectiveConfiguration {
	public var List<CostObjectiveElementConfiguration> elements = newArrayList
	public var ObjectiveKind kind
	public var ObjectiveThreshold threshold
	public var boolean findExtremum
}

class CostObjectiveElementConfiguration {
	public var String patternQualifiedName
	public var int weight
}
