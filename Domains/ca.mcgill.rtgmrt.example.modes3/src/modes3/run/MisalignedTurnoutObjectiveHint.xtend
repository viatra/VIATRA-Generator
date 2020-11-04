package modes3.run

import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.ExtendedLinearExpressionBuilderFactory
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.CostElementMatch
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.CostElementMatchers
import hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.optimization.CostObjectiveHint
import java.util.Collection
import java.util.Map
import modes3.Modes3Package
import modes3.queries.MisalignedTurnout_step_2
import modes3.queries.MisalignedTurnout_step_3
import modes3.queries.MisalignedTurnout_step_4
import modes3.queries.MisalignedTurnout_step_5

class MisalignedTurnoutObjectiveHint extends CostObjectiveHint {
	val Type segmentType
	val Type turnoutType
	val Type trainType

	new(extension Ecore2Logic ecore2Logic, Ecore2Logic_Trace ecore2LogicTrace) {
		extension val Modes3Package = Modes3Package.eINSTANCE
		segmentType = ecore2LogicTrace.TypeofEClass(segment)
		turnoutType = ecore2LogicTrace.TypeofEClass(turnout)
		trainType = ecore2LogicTrace.TypeofEClass(train)
	}

	override isExact() {
		true
//		false
	}

	override createPolyhedronExtensionOperator(Map<String, CostElementMatchers> costElementMatchers) {
		val step2 = costElementMatchers.get(MisalignedTurnout_step_2.instance.fullyQualifiedName)
		val step3 = costElementMatchers.get(MisalignedTurnout_step_3.instance.fullyQualifiedName)
		val step4 = costElementMatchers.get(MisalignedTurnout_step_4.instance.fullyQualifiedName)
		val step5 = costElementMatchers.get(MisalignedTurnout_step_5.instance.fullyQualifiedName);

		[
			val objectiveBuilder = createBuilder

			for (m : step2.matches) {
				val dimension = getDimension(m.match)
				objectiveBuilder.add(step2.weight, dimension)
				dimension.tightenLowerBound(0)
				if (m.multi) {
					createBuilder.add(1, dimension).add(-1, turnoutType).build.assertEqualsTo(0)
				} else {
					dimension.tightenUpperBound(1)
					if (m.must) {
						dimension.tightenLowerBound(1)
					}
				}
			}

			val step3Matches = step3.matches
			for (m : step3Matches) {
				val dimension = getDimension(m.match)
				objectiveBuilder.add(step3.weight, dimension)
				dimension.tightenLowerBound(0)
				if (!m.multi) {
					dimension.tightenUpperBound(1)
					if (m.must) {
						dimension.tightenLowerBound(1)
					}
				}
			}
			for (pair : step3Matches.groupBy[step2.projectMayMatch(match, 2)].entrySet) {
				val multiplicityBuilder = createBuilder
				for (m : pair.value) {
					multiplicityBuilder.add(1, m.match)
				}
				multiplicityBuilder.add(-1, pair.key)
				multiplicityBuilder.build.tightenUpperBound(0)
			}
			boundLimit(step3Matches, 2, turnoutType, 1)
			boundLimit(step3Matches, 3, segmentType, 2)

			val step4Matches = step4.matches
			for (m : step4Matches) {
				val dimension = getDimension(m.match)
				objectiveBuilder.add(step4.weight, dimension)
				dimension.tightenLowerBound(0)
				if (!m.multi) {
					dimension.tightenUpperBound(1)
					if (m.must) {
						dimension.tightenLowerBound(1)
					}
				}
				createBuilder.add(1, m.match).add(-1, step3.projectMayMatch(m.match, 2, 3)).build.tightenUpperBound(0)
			}
			boundLimit(step4Matches, 2, turnoutType, 1)
			boundLimit(step4Matches, 3, segmentType, 2)

			val step5Matches = step5.matches
			for (m : step5Matches) {
				val dimension = getDimension(m.match)
				objectiveBuilder.add(step5.weight, dimension)
				dimension.tightenLowerBound(0)
				if (!m.multi) {
					dimension.tightenUpperBound(1)
					if (m.must) {
						dimension.tightenLowerBound(1)
					}
				}
			}
			for (pair : step5Matches.groupBy[step4.projectMayMatch(match, 2, 3)].entrySet) {
				val multiplicityBuilder = createBuilder
				for (m : pair.value) {
					multiplicityBuilder.add(1, m.match)
				}
				multiplicityBuilder.add(-1, pair.key)
				multiplicityBuilder.build.tightenUpperBound(0)
			}
			boundLimit(step5Matches, 2, turnoutType, 1)
			boundLimit(step5Matches, 3, segmentType, 2)
			boundLimit(step5Matches, 4, trainType, 2)

			objectiveBuilder.buildWithBounds
		]
	}

	private static def boundLimit(extension ExtendedLinearExpressionBuilderFactory factory,
		Collection<CostElementMatch> matches, int index, Type type, int count) {
		for (pair : matches.groupBy[match.get(index)].entrySet) {
			val multiplicityBuilder = createBuilder
			for (m : pair.value) {
				multiplicityBuilder.add(1, m.match)
			}
			if (CostElementMatchers.isMulti(pair.key)) {
				multiplicityBuilder.add(-count, type)
				multiplicityBuilder.build.tightenUpperBound(0)
			} else {
				multiplicityBuilder.build.tightenUpperBound(count)
			}
		}
	}
}
