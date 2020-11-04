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
import modes3.queries.Adjacent
import modes3.queries.Output
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery
import org.eclipse.xtend2.lib.StringConcatenationClient

class Modes3UnitPropagationGenerator implements UnitPropagationPatternGenerator {
	static val MUST_NOT_CONNECTED_TO = "mustNotConnectedTo"
	static val MUST_NOT_STRAIGHT = "mustNotStraight"
	static val MUST_NOT_DIVERGENT = "mustNotDivergent"
	static val MUST_CONNECTED_TO = "mustConnectedTo"
	static val MUST_STRAIGHT = "mustStraight"
	static val MUST_DIVERGENT = "mustDivergent"

	val Type segmentType
	val Type simpleSegmentType
	val Type turnoutType
	val Relation connectedToRelation
	val Relation straightRelation
	val Relation divergentRelation

	new(extension Ecore2Logic ecore2Logic, Ecore2Logic_Trace ecore2LogicTrace) {
		extension val Modes3Package = Modes3Package.eINSTANCE
		segmentType = ecore2LogicTrace.TypeofEClass(segment)
		simpleSegmentType = ecore2LogicTrace.TypeofEClass(simpleSegment)
		turnoutType = ecore2LogicTrace.TypeofEClass(turnout)
		connectedToRelation = ecore2LogicTrace.relationOfReference(segment_ConnectedTo)
		straightRelation = ecore2LogicTrace.relationOfReference(turnout_Straight)
		divergentRelation = ecore2LogicTrace.relationOfReference(turnout_Divergent)
	}

	override getMustPatterns() {
		#{
			connectedToRelation -> MUST_CONNECTED_TO,
			straightRelation -> MUST_STRAIGHT,
			divergentRelation -> MUST_DIVERGENT
		}
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
		
		val StringConcatenationClient commonMustParameterConstraints = '''
			find interpretation(problem, interpretation);
			find mustExist(problem, interpretation, source);
			find mustExist(problem, interpretation, target);
		'''
		
		val StringConcatenationClient commonMayParameterConstraints = '''
			find interpretation(problem, interpretation);
			find mayExist(problem, interpretation, source);
			find mayExist(problem, interpretation, target);
		'''

		'''
			pattern mayInput(«parameters») {
				«commonMayParameterConstraints»
				«typeIndexer.referInstanceOf(segmentType, Modality.MAY, "target")»
				«relationDefinitionIndexer.referPattern(fqnToPQuery.get(Adjacent.instance.fullyQualifiedName), #["target", "source"], Modality.MAY, true, false)»
				neg «referRelation(straightRelation, "target", "source", Modality.MUST, fqnToPQuery)»
				neg «referRelation(straightRelation, "target", "source", Modality.MUST, fqnToPQuery)»
			}
			
			pattern multipleMayInput(problem: LogicProblem, interpretation: PartialInterpretation,
						target: DefinedElement) {
				find interpretation(problem, interpretation);
				find mustExist(problem, interpretation, target);
				find mayInput(problem, interpretaton, source1, target);
				find mayInput(problem, interpretaton, source2, target);
				neg find mustEquivalent(problem, interpretation, source1, source2);
			}
			
			pattern multipleMayStraight(problem: LogicProblem, interpretation: PartialInterpretation,
						source: DefinedElement) {
				find interpretation(problem, interpretation);
				find mustExist(problem, interpretation, source);
				«typeIndexer.referInstanceOf(turnoutType, Modality.MAY, "source")»
				«referRelation(straightRelation, "source", "target1", Modality.MAY, fqnToPQuery)»
				«referRelation(straightRelation, "source", "target2", Modality.MAY, fqnToPQuery)»
				neg find mustEquivalent(problem, interpretation, target1, target2);
			}
			
			pattern multipleMayDivergent(problem: LogicProblem, interpretation: PartialInterpretation,
						source: DefinedElement) {
				find interpretation(problem, interpretation);
				find mustExist(problem, interpretation, source);
				«typeIndexer.referInstanceOf(turnoutType, Modality.MAY, "source")»
				«referRelation(divergentRelation, "source", "target1", Modality.MAY, fqnToPQuery)»
				«referRelation(divergentRelation, "source", "target2", Modality.MAY, fqnToPQuery)»
				neg find mustEquivalent(problem, interpretation, target1, target2);
			}
			
			pattern «MUST_CONNECTED_TO»(«parameters») {
				«commonMustParameterConstraints»
				«typeIndexer.referInstanceOf(segmentType, Modality.MAY, "target")»
				find mayInput(problem, interpretaton, source, target);
				neg find multipleMayInput(problem, interpretaton, target);
				«referRelation(connectedToRelation, "source", "target", Modality.MAY, fqnToPQuery)»
				neg «referRelation(connectedToRelation, "source", "target", Modality.MUST, fqnToPQuery)»
				neg «referRelation(straightRelation, "source", "target", Modality.MAY, fqnToPQuery)»
				neg «referRelation(divergentRelation, "source", "target", Modality.MAY, fqnToPQuery)»
			}
			
			pattern «MUST_STRAIGHT»(«parameters») {
				«commonMustParameterConstraints»
				neg «referRelation(straightRelation, "source", "_", Modality.MUST, fqnToPQuery)»
				neg find multipleMayStraight(problem, interpretation, source);
				«referRelation(straightRelation, "source", "target", Modality.MAY, fqnToPQuery)»
				neg «referRelation(straightRelation, "source", "target", Modality.MUST, fqnToPQuery)»
			} or {
				«commonMustParameterConstraints»
				«typeIndexer.referInstanceOf(segmentType, Modality.MAY, "target")»
				find mayInput(problem, interpretaton, source, target);
				neg find multipleMayInput(problem, interpretaton, target);
				neg «referRelation(connectedToRelation, "source", "target", Modality.MAY, fqnToPQuery)»
				«referRelation(straightRelation, "source", "target", Modality.MAY, fqnToPQuery)»
				neg «referRelation(straightRelation, "source", "target", Modality.MUST, fqnToPQuery)»
				neg «referRelation(divergentRelation, "source", "target", Modality.MAY, fqnToPQuery)»
			}
			
			pattern «MUST_DIVERGENT»(«parameters») {
				«commonMustParameterConstraints»
				neg «referRelation(divergentRelation, "source", "_", Modality.MUST, fqnToPQuery)»
				neg find multipleMayDivergent(problem, interpretation, source);
				«referRelation(divergentRelation, "source", "target", Modality.MAY, fqnToPQuery)»
				neg «referRelation(divergentRelation, "source", "target", Modality.MUST, fqnToPQuery)»
			} or {
				«commonMustParameterConstraints»
				«typeIndexer.referInstanceOf(segmentType, Modality.MAY, "target")»
				find mayInput(problem, interpretaton, source, target);
				neg find multipleMayInput(problem, interpretaton, target);
				neg «referRelation(connectedToRelation, "source", "target", Modality.MAY, fqnToPQuery)»
				neg «referRelation(straightRelation, "source", "target", Modality.MAY, fqnToPQuery)»
				«referRelation(divergentRelation, "source", "target", Modality.MAY, fqnToPQuery)»
				neg «referRelation(divergentRelation, "source", "target", Modality.MUST, fqnToPQuery)»
			}
			
			pattern turnoutOutput_must_to_true_by_straight(«parameters», T : DefinedElement, S : DefinedElement) {
				«commonMayParameterConstraints»
				«typeIndexer.referInstanceOf(turnoutType, Modality.MAY, "source")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MAY, "target")»
				T == source;
				S == target;
			}
			
			pattern turnoutOutput_must_to_true_by_divergent(«parameters», T : DefinedElement, S : DefinedElement) {
				«commonMayParameterConstraints»
				«typeIndexer.referInstanceOf(turnoutType, Modality.MAY, "source")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MAY, "target")»
				T == source;
				S == target;
			}
			
			pattern output_must_to_true_by_connectedTo(«parameters», S1 : DefinedElement, S2 : DefinedElement) {
				«commonMayParameterConstraints»
				«typeIndexer.referInstanceOf(segmentType, Modality.MAY, "source")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MAY, "target")»
				S1 == source;
				S2 == target;
			}
			
			pattern output_must_to_true_by_straight(«parameters», S1 : DefinedElement, S2 : DefinedElement) {
				find turnoutOutput_must_to_true_by_straight(problem, interpretation, source, target, S1, S2);
			}
			
			pattern output_must_to_true_by_divergent(«parameters», S1 : DefinedElement, S2 : DefinedElement) {
				find turnoutOutput_must_to_true_by_divergent(problem, interpretation, source, target, S1, S2);
			}
			
			pattern adjacent_must_to_true_by_connectedTo(«parameters», S1 : DefinedElement, S2 : DefinedElement) {
				find output_must_to_true_by_connectedTo(problem, interpretation, source, target, S1, S2);
			}
			
			pattern adjacent_must_to_true_by_straight(«parameters», S1 : DefinedElement, S2 : DefinedElement) {
				find output_must_to_true_by_straight(problem, interpretation, source, target, S1, S2);
			} or {
				find turnoutOutput_must_to_true_by_straight(problem, interpretation, source, target, S2, S1);
			}
			
			pattern adjacent_must_to_true_by_divergent(«parameters», S1 : DefinedElement, S2 : DefinedElement) {
				find output_must_to_true_by_divergent(problem, interpretation, source, target, S1, S2);
			} or {
				find turnoutOutput_must_to_true_by_divergent(problem, interpretation, source, target, S2, S1);
			}
			
			pattern connectedToReflexive_must_to_true_by_connectedTo(«parameters», S : DefinedElement) {
				find mustExist(problem, interpretation, source);
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "source")»
				S == source;
				S == target;
			}
			
			pattern outputReflexive_must_to_true_by_straight(«parameters», T : DefinedElement) {
				find turnoutOutput_must_to_true_by_straight(problem, interpretation, source, target, T, T);
			}
			
			pattern outputReflexive_must_to_true_by_divergent(«parameters», T : DefinedElement) {
				find turnoutOutput_must_to_true_by_divergent(problem, interpretation, source, target, T, T);
			}
			
			pattern turnoutOutputsAreSame_must_to_true_by_straight(«parameters», T : DefinedElement) {
				«commonMayParameterConstraints»
				«typeIndexer.referInstanceOf(turnoutType, Modality.MAY, "source")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MAY, "target")»
				T == source;
				S == target;
				«referRelation(divergentRelation, "T", "S", Modality.MUST, fqnToPQuery)»
			}
			
			pattern turnoutOutputsAreSame_must_to_true_by_divergent(«parameters», T : DefinedElement) {
				«commonMayParameterConstraints»
				«typeIndexer.referInstanceOf(turnoutType, Modality.MAY, "source")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MAY, "target")»
				T == source;
				S == target;
				«referRelation(straightRelation, "T", "S", Modality.MUST, fqnToPQuery)»
			}
			
			pattern tooManyInputsOfSegment_must_to_true_by_connectedTo(«parameters», S : DefinedElement) {
				find mustExist(problem, interpretation, S);
				«typeIndexer.referInstanceOf(simpleSegmentType, Modality.MUST, "S")»
				find output_must_to_true_by_connectedTo(problem, interpretation, source, target, I1, S);
				«relationDefinitionIndexer.referPattern(fqnToPQuery.get(Output.instance.fullyQualifiedName), #["I2", "S"], Modality.MUST, true, false)»
				«relationDefinitionIndexer.referPattern(fqnToPQuery.get(Output.instance.fullyQualifiedName), #["I3", "S"], Modality.MUST, true, false)»
				I1 != I2;
				I1 != I3;
				I2 != I3;
			}
			
			pattern tooManyInputsOfSegment_must_to_true_by_straight(«parameters», S : DefinedElement) {
				find mustExist(problem, interpretation, S);
				«typeIndexer.referInstanceOf(simpleSegmentType, Modality.MUST, "S")»
				find output_must_to_true_by_straight(problem, interpretation, source, target, I1, S);
				«relationDefinitionIndexer.referPattern(fqnToPQuery.get(Output.instance.fullyQualifiedName), #["I2", "S"], Modality.MUST, true, false)»
				«relationDefinitionIndexer.referPattern(fqnToPQuery.get(Output.instance.fullyQualifiedName), #["I3", "S"], Modality.MUST, true, false)»
				I1 != I2;
				I1 != I3;
				I2 != I3;
			}
			
			pattern tooManyInputsOfSegment_must_to_true_by_divergent(«parameters», S : DefinedElement) {
				find mustExist(problem, interpretation, S);
				«typeIndexer.referInstanceOf(simpleSegmentType, Modality.MUST, "S")»
				find output_must_to_true_by_divergent(problem, interpretation, source, target, I1, S);
				«relationDefinitionIndexer.referPattern(fqnToPQuery.get(Output.instance.fullyQualifiedName), #["I2", "S"], Modality.MUST, true, false)»
				«relationDefinitionIndexer.referPattern(fqnToPQuery.get(Output.instance.fullyQualifiedName), #["I3", "S"], Modality.MUST, true, false)»
				I1 != I2;
				I1 != I3;
				I2 != I3;
			}
			
			pattern turnoutConnectedToBothOutputs_must_to_true_by_connectedTo(«parameters», T : DefinedElement) {
				«commonMayParameterConstraints»
				find mustExist(problem, interpretation, Straight);
				find mustExist(problem, interpretation, Divergent);
				«typeIndexer.referInstanceOf(turnoutType, Modality.MAY, "source")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MAY, "target")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "Straight")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "Divergent")»
				«referRelation(straightRelation, "T", "Straight", Modality.MUST, fqnToPQuery)»
				«referRelation(divergentRelation, "T", "Divergent", Modality.MUST, fqnToPQuery)»
				T == source;
				Straight == target;
				«referRelation(connectedToRelation, "T", "Divergent", Modality.MUST, fqnToPQuery)»
			} or {
				«commonMayParameterConstraints»
				find mustExist(problem, interpretation, Straight);
				find mustExist(problem, interpretation, Divergent);
				«typeIndexer.referInstanceOf(turnoutType, Modality.MAY, "source")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MAY, "target")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "Straight")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "Divergent")»
				«referRelation(straightRelation, "T", "Straight", Modality.MUST, fqnToPQuery)»
				«referRelation(divergentRelation, "T", "Divergent", Modality.MUST, fqnToPQuery)»
				«referRelation(connectedToRelation, "T", "Straight", Modality.MUST, fqnToPQuery)»
				T == source;
				Straight == target;
			}
			
			pattern turnoutConnectedToBothOutputs_must_to_true_by_straight(«parameters», T : DefinedElement) {
				«commonMayParameterConstraints»
				find mustExist(problem, interpretation, Straight);
				find mustExist(problem, interpretation, Divergent);
				«typeIndexer.referInstanceOf(turnoutType, Modality.MAY, "source")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MAY, "target")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "Straight")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "Divergent")»
				T == source;
				Straight == target;
				«referRelation(divergentRelation, "T", "Divergent", Modality.MUST, fqnToPQuery)»
				«referRelation(connectedToRelation, "T", "Straight", Modality.MUST, fqnToPQuery)»
				«referRelation(connectedToRelation, "T", "Divergent", Modality.MUST, fqnToPQuery)»
			}
			
			pattern turnoutConnectedToBothOutputs_must_to_true_by_divergent(«parameters», T : DefinedElement) {
				«commonMayParameterConstraints»
				find mustExist(problem, interpretation, Straight);
				find mustExist(problem, interpretation, Divergent);
				«typeIndexer.referInstanceOf(turnoutType, Modality.MAY, "source")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MAY, "target")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "Straight")»
				«typeIndexer.referInstanceOf(segmentType, Modality.MUST, "Divergent")»
				«referRelation(straightRelation, "T", "Straight", Modality.MUST, fqnToPQuery)»
				T == source;
				Divergent == target;
				«referRelation(connectedToRelation, "T", "Straight", Modality.MUST, fqnToPQuery)»
				«referRelation(connectedToRelation, "T", "Divergent", Modality.MUST, fqnToPQuery)»
			}
			
			pattern tooManyInputsOfTurnout_must_to_true_by_connectedTo(«parameters», T : DefinedElement) {
				find mustExist(problem, interpretation, S);
				«typeIndexer.referInstanceOf(turnoutType, Modality.MUST, "S")»
				find adjacent_must_to_true_by_connectedTo(problem, interpretation, source, target, I1, S);
				«relationDefinitionIndexer.referPattern(fqnToPQuery.get(Adjacent.instance.fullyQualifiedName), #["I2", "S"], Modality.MUST, true, false)»
				«relationDefinitionIndexer.referPattern(fqnToPQuery.get(Adjacent.instance.fullyQualifiedName), #["I3", "S"], Modality.MUST, true, false)»
				«relationDefinitionIndexer.referPattern(fqnToPQuery.get(Adjacent.instance.fullyQualifiedName), #["I4", "S"], Modality.MUST, true, false)»
				I1 != I2;
				I1 != I3;
				I1 != I4;
				I2 != I3;
				I2 != I4;
				I3 != I4;
			}
			
			pattern tooManyInputsOfTurnout_must_to_true_by_straight(«parameters», T : DefinedElement) {
				find mustExist(problem, interpretation, S);
				«typeIndexer.referInstanceOf(turnoutType, Modality.MUST, "S")»
				find adjacent_must_to_true_by_straight(problem, interpretation, source, target, I1, S);
				«relationDefinitionIndexer.referPattern(fqnToPQuery.get(Adjacent.instance.fullyQualifiedName), #["I2", "S"], Modality.MUST, true, false)»
				«relationDefinitionIndexer.referPattern(fqnToPQuery.get(Adjacent.instance.fullyQualifiedName), #["I3", "S"], Modality.MUST, true, false)»
				«relationDefinitionIndexer.referPattern(fqnToPQuery.get(Adjacent.instance.fullyQualifiedName), #["I4", "S"], Modality.MUST, true, false)»
				I1 != I2;
				I1 != I3;
				I1 != I4;
				I2 != I3;
				I2 != I4;
				I3 != I4;
			}
			
			pattern tooManyInputsOfTurnout_must_to_true_by_divergent(«parameters», T : DefinedElement) {
				find mustExist(problem, interpretation, S);
				«typeIndexer.referInstanceOf(turnoutType, Modality.MUST, "S")»
				find adjacent_must_to_true_by_divergent(problem, interpretation, source, target, I1, S);
				«relationDefinitionIndexer.referPattern(fqnToPQuery.get(Adjacent.instance.fullyQualifiedName), #["I2", "S"], Modality.MUST, true, false)»
				«relationDefinitionIndexer.referPattern(fqnToPQuery.get(Adjacent.instance.fullyQualifiedName), #["I3", "S"], Modality.MUST, true, false)»
				«relationDefinitionIndexer.referPattern(fqnToPQuery.get(Adjacent.instance.fullyQualifiedName), #["I4", "S"], Modality.MUST, true, false)»
				I1 != I2;
				I1 != I3;
				I1 != I4;
				I2 != I3;
				I2 != I4;
				I3 != I4;
			}
			
			pattern «MUST_NOT_CONNECTED_TO»_helper(«parameters») {
				find connectedToReflexive_must_to_true_by_connectedTo(problem, interpretation, source, target, _);
			} or {
				find tooManyInputsOfSegment_must_to_true_by_connectedTo(problem, interpretation, source, target, _);
			} or {
				find turnoutConnectedToBothOutputs_must_to_true_by_connectedTo(problem, interpretation, source, target, _);
			} or {
				find tooManyInputsOfTurnout_must_to_true_by_connectedTo(problem, interpretation, source, target, _);
			}
			
			pattern «MUST_NOT_CONNECTED_TO»(«parameters») {
				find «MUST_NOT_CONNECTED_TO»_helper(problem, interpretation, source, target);
			} or {
				find «MUST_NOT_CONNECTED_TO»_helper(problem, interpretation, target, source);
			}
			
			pattern «MUST_NOT_STRAIGHT»(«parameters») {
				find outputReflexive_must_to_true_by_straight(problem, interpretation, source, target, _);
			} or {
				find turnoutOutputsAreSame_must_to_true_by_straight(problem, interpretation, source, target, _);
			} or {
				find tooManyInputsOfSegment_must_to_true_by_straight(problem, interpretation, source, target, _);
			} or {
				find turnoutConnectedToBothOutputs_must_to_true_by_straight(problem, interpretation, source, target, _);
			} or {
				find tooManyInputsOfTurnout_must_to_true_by_straight(problem, interpretation, source, target, _);
			}
			
			pattern «MUST_NOT_DIVERGENT»(«parameters») {
				find outputReflexive_must_to_true_by_divergent(problem, interpretation, source, target, _);
			} or {
				find turnoutOutputsAreSame_must_to_true_by_divergent(problem, interpretation, source, target, _);
			} or {
				find tooManyInputsOfSegment_must_to_true_by_divergent(problem, interpretation, source, target, _);
			} or {
				find turnoutConnectedToBothOutputs_must_to_true_by_divergent(problem, interpretation, source, target, _);
			} or {
				find tooManyInputsOfTurnout_must_to_true_by_divergent(problem, interpretation, source, target, _);
			}
		'''
	}
}
