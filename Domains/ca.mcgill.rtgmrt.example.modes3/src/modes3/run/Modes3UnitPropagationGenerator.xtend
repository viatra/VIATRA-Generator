package modes3.run

import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic_Trace
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.Modality
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns.PatternGenerator
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns.UnitPropagationPatternGenerator
import java.util.Map
import modes3.Modes3Package
import modes3.queries.ExtraInputOfTurnout
import modes3.queries.Output
import modes3.queries.TurnoutOutput
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery
import org.eclipse.xtend2.lib.StringConcatenationClient

class Modes3UnitPropagationGenerator implements UnitPropagationPatternGenerator {
	static val MUST_NOT_CONNECTED_TO = "mustNotConnectedTo"
	static val MUST_NOT_CONNECTED_TO_HELPER = "mustNotConnectedTo_helper"
	static val MUST_NOT_TURNOUT_OUTPUT = "mustNotTurnoutOutput"
	static val MUST_NOT_STRAIGHT = "mustNotStraight"
	static val MUST_NOT_DIVERGENT = "mustNotDivergent"

	val Type segmentType
	val Type turnoutType
	val Relation connectedToRelation
	val Relation straightRelation
	val Relation divergentRelation

	new(extension Ecore2Logic ecore2Logic, Ecore2Logic_Trace ecore2LogicTrace) {
		extension val Modes3Package = Modes3Package.eINSTANCE
		segmentType = ecore2LogicTrace.TypeofEClass(segment)
		turnoutType = ecore2LogicTrace.TypeofEClass(turnout)
		connectedToRelation = ecore2LogicTrace.relationOfReference(segment_ConnectedTo)
		straightRelation = ecore2LogicTrace.relationOfReference(turnout_Straight)
		divergentRelation = ecore2LogicTrace.relationOfReference(turnout_Divergent)
	}

	override getMustPatterns() {
		emptyMap
	}

	override getMustNotPatterns() {
		#{
			connectedToRelation -> MUST_NOT_CONNECTED_TO,
			straightRelation -> MUST_NOT_STRAIGHT,
			divergentRelation -> MUST_NOT_DIVERGENT
		}
	}

	override getAdditionalPatterns(extension PatternGenerator generator, Map<String, PQuery> fqnToPQuery) {
		val StringConcatenationClient parameters = '''
			problem: LogicProblem, interpretation: PartialInterpretation,
			source: DefinedElement, target: DefinedElement
		'''
		
		val StringConcatenationClient commonParameterConstraints = '''
			find interpretation(problem, interpretation);
			find mustExist(problem, interpretation, source);
			find mustExist(problem, interpretation, target);
		'''

		'''
			pattern «MUST_NOT_CONNECTED_TO_HELPER»(«parameters») {
				// connectedToReflexive unit propagation
				«commonParameterConstraints»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "source")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "target")»
				source == target;
			} or {
				// tooManyInputsOfSegment unit propagation
				«commonParameterConstraints»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "source")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "target")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "input1")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "input2")»
				neg «typeIndexer.referInstanceOf(turnoutType, Modality.MAY, "source")»
				«relationDefinitionIndexer.referPattern(fqnToPQuery.get(Output.instance.fullyQualifiedName), #["input1", "source"], Modality.MUST, true, false)»
				«relationDefinitionIndexer.referPattern(fqnToPQuery.get(Output.instance.fullyQualifiedName), #["input2", "source"], Modality.MUST, true, false)»
				input1 != input2;
				input1 != target;
				input2 != target;
			} or {
				// turnoutConnectedToBothOutputs unit propagation 1
				«commonParameterConstraints»
				«typeIndexer.referInstanceOf(turnoutType, Modality.MUST, "source")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "target")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "divergent")»
				«referRelation(straightRelation, "source", "target", Modality.MUST, fqnToPQuery)»
				«referRelation(divergentRelation, "source", "divergent", Modality.MUST, fqnToPQuery)»
				«referRelation(connectedToRelation, "source", "divergent", Modality.MUST, fqnToPQuery)»
			} or {
				// turnoutConnectedToBothOutputs unit propagation 2
				«commonParameterConstraints»
				«typeIndexer.referInstanceOf(turnoutType, Modality.MUST, "source")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "target")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "straight")»
				«referRelation(straightRelation, "source", "straight", Modality.MUST, fqnToPQuery)»
				«referRelation(divergentRelation, "source", "target", Modality.MUST, fqnToPQuery)»
				«referRelation(connectedToRelation, "source", "straight", Modality.MUST, fqnToPQuery)»
			} or {
				// tooManyExtraInputsOfTurnout unit propagation
				«commonParameterConstraints»
				«typeIndexer.referInstanceOf(turnoutType, Modality.MUST, "source")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "target")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "extraInput")»
				«relationDefinitionIndexer.referPattern(fqnToPQuery.get(TurnoutOutput.instance.fullyQualifiedName), #["source", "target"], Modality.MAY, false, false)»
				«relationDefinitionIndexer.referPattern(fqnToPQuery.get(ExtraInputOfTurnout.instance.fullyQualifiedName), #["source", "extraInput"], Modality.MUST, true, false)»
				target != extraInput;
			}
			
			pattern «MUST_NOT_CONNECTED_TO»(«parameters») {
				find «MUST_NOT_CONNECTED_TO_HELPER»(problem, interpretation, source, target);
			} or {
				find «MUST_NOT_CONNECTED_TO_HELPER»(problem, interpretation, target, source);
			}
			
			pattern «MUST_NOT_TURNOUT_OUTPUT»(«parameters») {
				// outputReflexive unit propagation
				«commonParameterConstraints»
				«typeIndexer.referInstanceOf(turnoutType, Modality.MUST, "source")»
				«typeIndexer.referInstanceOf(turnoutType, Modality.MUST, "target")»
				source == target;
			} or {
				// tooManyInputsOfSegment unit propagation
				«commonParameterConstraints»
				«typeIndexer.referInstanceOf(turnoutType, Modality.MUST, "source")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "target")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "input1")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "input2")»
				neg «typeIndexer.referInstanceOf(turnoutType, Modality.MAY, "target")»
				«relationDefinitionIndexer.referPattern(fqnToPQuery.get(Output.instance.fullyQualifiedName), #["input1", "target"], Modality.MUST, true, false)»
				«relationDefinitionIndexer.referPattern(fqnToPQuery.get(Output.instance.fullyQualifiedName), #["input2", "target"], Modality.MUST, true, false)»
				input1 != input2;
				input1 != source;
				input2 != source;
			}
			
			pattern «MUST_NOT_STRAIGHT»(«parameters») {
				find «MUST_NOT_TURNOUT_OUTPUT»(problem, interpretation, source, target);
			} or {
				// turnoutOutputsAreSame unit propagation
				«commonParameterConstraints»
				«typeIndexer.referInstanceOf(turnoutType, Modality.MUST, "source")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "target")»
				«referRelation(divergentRelation, "source", "target", Modality.MUST, fqnToPQuery)»
			} or {
				// turnoutConnectedToBothOutputs unit propagation
				«commonParameterConstraints»
				«typeIndexer.referInstanceOf(turnoutType, Modality.MUST, "source")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "target")»
				«typeIndexer.referInstanceOf(turnoutType, Modality.MUST, "divergent")»
				«referRelation(connectedToRelation, "source", "target", Modality.MUST, fqnToPQuery)»
				«referRelation(divergentRelation, "source", "divergent", Modality.MUST, fqnToPQuery)»
				«referRelation(connectedToRelation, "source", "divergent", Modality.MUST, fqnToPQuery)»
			} or {
				// tooManyExtraInputsOfTurnout unit propagation
				«commonParameterConstraints»
				«typeIndexer.referInstanceOf(turnoutType, Modality.MUST, "source")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "target")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "extraInput")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "potentialExtraInput")»
				«relationDefinitionIndexer.referPattern(fqnToPQuery.get(ExtraInputOfTurnout.instance.fullyQualifiedName), #["source", "extraInput"], Modality.MUST, true, false)»
				«referRelation(connectedToRelation, "source", "potentialExtraInput", Modality.MUST, fqnToPQuery)»
				neg «referRelation(divergentRelation, "source", "potentialExtraInput", Modality.MAY, fqnToPQuery)»
				extraInput != potentialExtraInput;
				extraInput != target;
				potentialExtraInput != target;
			}
			
			pattern «MUST_NOT_DIVERGENT»(«parameters») {
				find «MUST_NOT_TURNOUT_OUTPUT»(problem, interpretation, source, target);
			} or {
				// turnoutOutputsAreSame unit propagation
				«commonParameterConstraints»
				«typeIndexer.referInstanceOf(turnoutType, Modality.MUST, "source")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "target")»
				«referRelation(straightRelation, "source", "target", Modality.MUST, fqnToPQuery)»
			} or {
				// turnoutConnectedToBothOutputs unit propagation
				«commonParameterConstraints»
				«typeIndexer.referInstanceOf(turnoutType, Modality.MUST, "source")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "target")»
				«typeIndexer.referInstanceOf(turnoutType, Modality.MUST, "straight")»
				«referRelation(connectedToRelation, "source", "target", Modality.MUST, fqnToPQuery)»
				«referRelation(straightRelation, "source", "straight", Modality.MUST, fqnToPQuery)»
				«referRelation(connectedToRelation, "source", "straight", Modality.MUST, fqnToPQuery)»
			} or {
				// tooManyExtraInputsOfTurnout unit propagation
				«commonParameterConstraints»
				«typeIndexer.referInstanceOf(turnoutType, Modality.MUST, "source")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "target")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "extraInput")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "potentialExtraInput")»
				«relationDefinitionIndexer.referPattern(fqnToPQuery.get(ExtraInputOfTurnout.instance.fullyQualifiedName), #["source", "extraInput"], Modality.MUST, true, false)»
				«referRelation(connectedToRelation, "source", "potentialExtraInput", Modality.MUST, fqnToPQuery)»
				neg «referRelation(straightRelation, "source", "potentialExtraInput", Modality.MAY, fqnToPQuery)»
				extraInput != potentialExtraInput;
				extraInput != target;
				potentialExtraInput != target;
			}
		'''
	}
}
