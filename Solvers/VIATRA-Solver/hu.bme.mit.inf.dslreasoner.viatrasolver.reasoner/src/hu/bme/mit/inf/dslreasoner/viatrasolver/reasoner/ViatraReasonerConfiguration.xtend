package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner

import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.ModelGenerationMethod
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeInferenceMethod
import java.util.LinkedList
import java.util.List
import java.util.Set
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery
import org.eclipse.xtext.xbase.lib.Functions.Function1

public enum StateCoderStrategy {
	Neighbourhood, NeighbourhoodWithEquivalence, IDBased, DefinedByDiversity
}

class ViatraReasonerConfiguration extends LogicSolverConfiguration{
	public var Iterable<PQuery> existingQueries
	public var LogicSolverConfiguration inconsistencDetectorConfiguration = null
	public var List<Function1<ModelGenerationMethod,ModelGenerationMethodBasedGlobalConstraint>> additionalGlobalConstraints = new LinkedList
	int maxDepth = -1
	
	public var TypeInferenceMethod typeInferenceMethod = TypeInferenceMethod.Generic
	
	public var nameNewElements = false
	public var StateCoderStrategy stateCoderStrategy = StateCoderStrategy.Neighbourhood
	
	/**
	 * Describes the required diversity between the solutions.
	 * Null means that the solutions have to have different state codes only.
	 */
	public var DiversityDescriptor diversityRequirement = null
}

public class DiversityDescriptor {
	public var int range = -1
	public var int parallels = Integer.MAX_VALUE
	public var int maxNumber = Integer.MAX_VALUE
	public var Set<TypeDeclaration> relevantTypes
	public var Set<RelationDeclaration> relevantRelations
}