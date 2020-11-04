package hu.bme.mit.inf.dslreasoner.run

import com.google.common.collect.ImmutableMap
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.LinearTypeConstraintHint
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.Map
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher

abstract class Ecore2LogicTraceBasedHint implements LinearTypeConstraintHint {
	val Map<String, Type> nameToType
	val Map<String, Map<String, RelationDeclaration>> nameToRelation

	protected new(Ecore2Logic ecore2Logic, Ecore2Logic_Trace trace) {
		nameToType = ImmutableMap.copyOf(ecore2Logic.allClassesInScope(trace).toMap[name].mapValues [ eClass |
			ecore2Logic.TypeofEClass(trace, eClass)
		])
		nameToRelation = ImmutableMap.copyOf(ecore2Logic.allReferencesInScope(trace).groupBy[EContainingClass.name].
			mapValues [ references |
				ImmutableMap.copyOf(references.toMap[name].mapValues [ reference |
					ecore2Logic.relationOfReference(trace, reference)
				])
			])
	}

	protected def getType(String name) {
		nameToType.get(name)
	}

	protected def relation(String typeName, String relationName) {
		nameToRelation.get(typeName).get(relationName)
	}

	protected static def <T extends IPatternMatch> int countMatches(ViatraQueryMatcher<T> matcher, PartialInterpretation p) {
		val match = matcher.newEmptyMatch
		match.set(0, p.problem)
		match.set(1, p)
		matcher.countMatches(match)
	}

	protected static def <T extends IPatternMatch> int getCount(ViatraQueryMatcher<T> matcher, PartialInterpretation p) {
		val match = matcher.newEmptyMatch
		match.set(0, p.problem)
		match.set(1, p)
		val realMatch = matcher.getOneArbitraryMatch(match)
		if (realMatch.present) {
			realMatch.get.get(2) as Integer
		} else {
			0
		}
	}
}
