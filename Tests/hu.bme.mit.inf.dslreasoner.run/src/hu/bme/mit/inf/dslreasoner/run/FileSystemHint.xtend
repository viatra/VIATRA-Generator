package hu.bme.mit.inf.dslreasoner.run

import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.LinearTypeExpressionBuilderFactory
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns.PatternGenerator
import java.util.Map
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery

class FileSystemHint extends Ecore2LogicTraceBasedHint {
	static val REMAINING_CONTENTS_ROOT = "hint_root"

	new(Ecore2Logic ecore2Logic, Ecore2Logic_Trace trace) {
		super(ecore2Logic, trace)
	}

	override getAdditionalPatterns(PatternGenerator it, Map<String, PQuery> fqnToPQuery) '''
		pattern «REMAINING_CONTENTS_ROOT»(problem:LogicProblem, interpretation:PartialInterpretation, remainingContents:java Integer) {
			find interpretation(problem, interpretation);
			remainingContents == sum find remainingContents_root_reference_Dir_helper(problem, interpretation, _, #_)
		}
	'''

	override createConstraintUpdater(LinearTypeExpressionBuilderFactory it) {
		val dirCount = createBuilder.add(1, "Dir".type).build

		val remainingContentsRootMatcher = createMatcher(REMAINING_CONTENTS_ROOT)

		return [ p |
			dirCount.tightenLowerBound(remainingContentsRootMatcher.getCount(p))
		]
	}

}
