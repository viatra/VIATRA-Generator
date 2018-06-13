package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns

import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.InverseRelationAssertion
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.Modality
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeAnalysisResult
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.HashMap

class TypeRefinementWithPreliminaryTypeAnalysis extends TypeRefinementGenerator{
	public new(PatternGenerator base) {
		super(base)
	}
	override requiresTypeAnalysis() { true }

	override generateRefineObjectQueries(LogicProblem p, PartialInterpretation emptySolution, TypeAnalysisResult typeAnalysisResult) {
		val containment = p.containmentHierarchies.head
		val possibleNewDynamicType = typeAnalysisResult.possibleNewDynamicTypes
		val inverseRelations = new HashMap
		p.annotations.filter(InverseRelationAssertion).forEach[
			inverseRelations.put(it.inverseA,it.inverseB)
			inverseRelations.put(it.inverseB,it.inverseA)
		]
		return '''
		private pattern hasElementInContainment(problem:LogicProblem, interpretation:PartialInterpretation)
		«FOR type :containment.typesOrderedInHierarchy SEPARATOR "or"»{
			find interpretation(problem,interpretation);
			«base.typeIndexer.referInstanceOf(type,Modality.MAY,"root")»
			find mustExist(problem, interpretation, root);
		}«ENDFOR»
		«FOR type:possibleNewDynamicType»
			«IF(containment.typesOrderedInHierarchy.contains(type))»
				«FOR containmentRelation : containment.containmentRelations.filter[canBeContainedByRelation(it,type)]»
					«IF inverseRelations.containsKey(containmentRelation)»
						pattern «this.patternName(containmentRelation,inverseRelations.get(containmentRelation),type)»(
							problem:LogicProblem, interpretation:PartialInterpretation,
							relationInterpretation:PartialRelationInterpretation, inverseInterpretation:PartialRelationInterpretation, typeInterpretation:PartialTypeInterpratation,
							container:DefinedElement)
						{
							find interpretation(problem,interpretation);
							PartialInterpretation.partialtypeinterpratation(interpretation,typeInterpretation);
							PartialComplexTypeInterpretation.interpretationOf.name(typeInterpretation,"«type.name»");
							PartialInterpretation.partialrelationinterpretation(interpretation,relationInterpretation);
							PartialRelationInterpretation.interpretationOf.name(relationInterpretation,"«containmentRelation.name»");
							PartialInterpretation.partialrelationinterpretation(interpretation,inverseInterpretation);
							PartialRelationInterpretation.interpretationOf.name(inverseInterpretation,"«inverseRelations.get(containmentRelation).name»");
							«base.typeIndexer.referInstanceOf((containmentRelation.parameters.get(0) as ComplexTypeReference).referred,Modality.MUST,"container")»
							«base.typeIndexer.referInstanceOf(type,Modality.MAY,"newObject")»
							«base.relationDeclarationIndexer.referRelation(containmentRelation as RelationDeclaration,"container","newObject",Modality.MAY)»
							find mustExist(problem, interpretation, container);
							neg find mustExist(problem, interpretation, newObject);
						}
					«ELSE»
						pattern «this.patternName(containmentRelation,null,type)»(
							problem:LogicProblem, interpretation:PartialInterpretation,
							relationInterpretation:PartialRelationInterpretation, typeInterpretation:PartialTypeInterpratation,
							container:DefinedElement)
						{
							find interpretation(problem,interpretation);
							PartialInterpretation.partialtypeinterpratation(interpretation,typeInterpretation);
							PartialComplexTypeInterpretation.interpretationOf.name(typeInterpretation,"«type.name»");
							PartialInterpretation.partialrelationinterpretation(interpretation,relationInterpretation);
							PartialRelationInterpretation.interpretationOf.name(relationInterpretation,"«containmentRelation.name»");
							«base.typeIndexer.referInstanceOf((containmentRelation.parameters.get(0) as ComplexTypeReference).referred,Modality.MUST,"container")»
							«base.typeIndexer.referInstanceOf(type,Modality.MAY,"newObject")»
							«base.relationDeclarationIndexer.referRelation(containmentRelation as RelationDeclaration,"container","newObject",Modality.MAY)»
							find mustExist(problem, interpretation, container);
							neg find mustExist(problem, interpretation, newObject);
						}
					«ENDIF»
				«ENDFOR»
				pattern «patternName(null,null,type)»(
					problem:LogicProblem, interpretation:PartialInterpretation,
					typeInterpretation:PartialTypeInterpratation)
				{
					find interpretation(problem,interpretation);
					neg find hasElementInContainment(problem,interpretation);
					PartialInterpretation.partialtypeinterpratation(interpretation,typeInterpretation);
					PartialComplexTypeInterpretation.interpretationOf.name(typeInterpretation,"«type.name»");
					«base.typeIndexer.referInstanceOf(type,Modality.MAY,"newObject")»
					find mayExist(problem, interpretation, newObject);
					neg find mustExist(problem, interpretation, newObject);
				}
			«ELSE»
				pattern «this.patternName(null,null,type)»(
					problem:LogicProblem, interpretation:PartialInterpretation,
					typeInterpretation:PartialTypeInterpratation)
				{
					find interpretation(problem,interpretation);
					PartialInterpretation.partialtypeinterpratation(interpretation,typeInterpretation);
					PartialTypeInterpratation.interpretationOf.name(type,"«type.name»");
					«base.typeIndexer.referInstanceOf(type,Modality.MAY,"newObject")»
					find mayExist(problem, interpretation, newObject);
					neg find mustExist(problem, interpretation, newObject);
				}
			«ENDIF»
		«ENDFOR»
		'''
	}

	override generateRefineTypeQueries(LogicProblem p, PartialInterpretation emptySolution, TypeAnalysisResult typeAnalysisResult) {
		val newTypeRefinements = typeAnalysisResult.possibleNewTypeRefinements
		return '''
		«FOR newTypeRefinement : newTypeRefinements»
			pattern refineTypeTo_«base.canonizeName(newTypeRefinement.targetType.name)»(problem:LogicProblem, interpretation:PartialInterpretation, element: DefinedElement) {
				find interpretation(problem,interpretation);
				PartialInterpretation.newElements(interpretation,element);
				«FOR inhibitorType : newTypeRefinement.inhibitorTypes»
					neg «base.typeIndexer.referInstanceOf(inhibitorType,Modality.MUST,"element")»
				«ENDFOR»
			}
		«ENDFOR»
		'''
	}
	
	override getRefineTypeQueryNames(LogicProblem p, PartialInterpretation emptySolution, TypeAnalysisResult typeAnalysisResult) {
		val newTypeRefinements = typeAnalysisResult.possibleNewTypeRefinements
		newTypeRefinements.map[targetType].toInvertedMap['''refineTypeTo_«base.canonizeName(it.name)»''']
	}
}