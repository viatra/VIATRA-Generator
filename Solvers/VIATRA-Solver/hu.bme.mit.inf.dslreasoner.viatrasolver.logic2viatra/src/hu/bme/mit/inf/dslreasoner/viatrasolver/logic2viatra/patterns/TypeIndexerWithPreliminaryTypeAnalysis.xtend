package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.Modality
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeAnalysisResult
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import org.eclipse.emf.ecore.EClass
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeRefinementPrecondition
import java.util.Collections

class TypeIndexerWithPreliminaryTypeAnalysis implements TypeIndexer{
	val PatternGenerator base;
	
	new(PatternGenerator base) {
		this.base = base
	}
	override requiresTypeAnalysis() { true }
	
	override getRequiredQueries() '''
	private pattern typeInterpretation(problem:LogicProblem, interpetation:PartialInterpretation, type:TypeDeclaration, typeInterpretation:PartialTypeInterpratation) {
		find interpretation(problem,interpetation);
		LogicProblem.types(problem,type);
		PartialInterpretation.partialtypeinterpratation(interpetation,typeInterpretation);
		PartialTypeInterpratation.interpretationOf(typeInterpretation,type);
	}
	
	private pattern directInstanceOf(problem:LogicProblem, interpetation:PartialInterpretation, element:DefinedElement, type:Type) {
		find interpretation(problem,interpetation);
		LogicProblem.types(problem,type);
		TypeDefinition.elements(type,element);
	} or {
		find interpretation(problem,interpetation);
		find typeInterpretation(problem,interpetation,type,typeInterpretation);
		PartialTypeInterpratation.elements(typeInterpretation,element);
	}
	'''
	
	override generateInstanceOfQueries(LogicProblem problem, PartialInterpretation emptySolution, TypeAnalysisResult typeAnalysisResult) {
		val mayNewTypePreconditions = typeAnalysisResult.mayNewTypePreconditions
		
		return '''
		«FOR type:problem.types»
			«problem.generateMustInstenceOf(type)»
			«problem.generateMayInstanceOf(type,mayNewTypePreconditions.get(type))»
		«ENDFOR»
		'''
	}
	
	private def patternName(Type type, Modality modality)
		'''«modality.toString.toLowerCase»InstanceOf«base.canonizeName(type.name)»'''
	
	private def generateMustInstenceOf(LogicProblem problem, Type type) {
		'''
		/**
		 * An element must be an instance of type "«type.name»".
		 */
		private pattern «patternName(type,Modality.MUST)»(problem:LogicProblem, interpretation:PartialInterpretation, element:DefinedElement) {
			Type.name(type,"«type.name»");
			find directInstanceOf(problem,interpretation,element,type);
		}
		'''
	}
	
	private def generateMayInstanceOf(LogicProblem problem, Type type, TypeRefinementPrecondition precondition) {
		val inhibitorTypes = if(precondition!=null) {
			precondition.inhibitorTypes
		} else {
			null
		}
		'''
		/**
		 * An element may be an instance of type "«type.name»".
		 */
		private pattern «patternName(type,Modality.MAY)»(problem:LogicProblem, interpretation:PartialInterpretation, element:DefinedElement)
		«IF inhibitorTypes != null»{
			find interpretation(problem,interpretation);
			PartialInterpretation.newElements(interpretation,element);
			«FOR inhibitorType : inhibitorTypes»
				neg «referInstanceOf(inhibitorType,Modality.MUST,"element")»
			«ENDFOR»
		} or {
			find interpretation(problem,interpretation);
			PartialInterpretation.openWorldElementPrototype(interpetation,element);
		} or
		«ENDIF»
		{ «referInstanceOf(type,Modality.MUST,"element")» }
		'''
	}
	
	public override referInstanceOf(Type type, Modality modality, String variableName) {
		'''find «patternName(type,modality)»(problem,interpretation,«variableName»);'''
	}
	public override referInstanceOf(EClass type, Modality modality, String variableName) {
		'''find «modality.toString.toLowerCase»InstanceOf«base.canonizeName('''class «type.name»''')»(problem,interpretation,«variableName»);'''
	}
}