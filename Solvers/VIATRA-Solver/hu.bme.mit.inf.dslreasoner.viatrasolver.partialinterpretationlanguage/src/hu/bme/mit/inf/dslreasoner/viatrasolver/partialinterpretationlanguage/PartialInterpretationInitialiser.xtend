package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage

import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.patterns.SupertypeStarMatcher
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialConstantInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialFunctionInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationFactory
import java.util.HashMap
import java.util.Map
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope
import org.eclipse.xtend.lib.annotations.Data

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TypeScopes

@Data class Problem2PartialInterpretationTrace {
	Map<TypeDeclaration, PartialTypeInterpratation> type2Interpretation = new HashMap
	Map<RelationDeclaration, PartialRelationInterpretation> relation2Interpretation = new HashMap
}

class PartialInterpretationInitialiser {
	val extension PartialinterpretationFactory factory = PartialinterpretationFactory.eINSTANCE
	val extension LogiclanguageFactory factory2 = LogiclanguageFactory.eINSTANCE
	
	/**
	 * Initialises an empty partial interpretation from a logic problem
	 */
	def TracedOutput<PartialInterpretation,Problem2PartialInterpretationTrace> initialisePartialInterpretation(
		LogicProblem problem, TypeScopes typeScopes) 
	{
		val engine = ViatraQueryEngine.on(new EMFScope(problem))
		val trace = new Problem2PartialInterpretationTrace
		
		val res = createPartialInterpretation => [
			it.problem = problem
			
			it.minNewElements = typeScopes.maxNewElements
			it.maxNewElements = typeScopes.minNewElements
			if(maxNewElements>0) {
				it.openWorldElementPrototypes += createDefinedElement => [it.name = "Symbolic New Element"]
			}
			
			it.maxNewIntegers = typeScopes.numberOfUseableIntegers
			if(maxNewIntegers>0) {
				it.openWorldElementPrototypes += createIntegerElement => [it.name = "Symbolic New Integer" it.valueSet = false]
			}
			it.maxNewReals = typeScopes.numberOfUseableReals
			if(maxNewReals>0) {
				it.openWorldElementPrototypes += createRealElement => [it.name = "Symbolic New Real" it.valueSet = false]
			}
			it.maxNewStrings = typeScopes.numberOfUseableStrings
			if(maxNewStrings>0) {
				it.openWorldElementPrototypes += createStringElement => [it.name = "Symbolic New String" it.valueSet = false]
			}
			
			for(typeDeclaration : problem.types.filter(TypeDeclaration)) {
				it.partialtypeinterpratation += typeDeclaration.initialisePartialTypeInterpretation(engine,trace)
			}
			problem.connectSuperypes(trace)
						
			it.partialrelationinterpretation += problem.relations.filter(RelationDeclaration)
				.map[initialisePartialRelationInterpretation(trace)]
			it.partialfunctioninterpretation += problem.functions.filter(FunctionDeclaration)
				.map[initialisePartialFunctionInterpretation(trace)]
			it.partialconstantinterpretation += problem.constants.filter(ConstantDeclaration)
				.map[initialisePartialConstantDeclaration(trace)]
		]
		
		return new TracedOutput(res,trace)
	}
	
	/**
	 * Initialize type with existing elements
	 */
	def private initialisePartialTypeInterpretation(TypeDeclaration t, ViatraQueryEngine engine, Problem2PartialInterpretationTrace trace) {
		val supertypeMatcher = SupertypeStarMatcher.on(engine)
		val res = createPartialTypeInterpratation => [
			it.interpretationOf = t
			it.elements += supertypeMatcher.getAllValuesOfsubtype(t)
				.filter(TypeDefinition)
				.map[elements].flatten
		]
		trace.type2Interpretation.put(t,res)
		return res
	}
	
	def private connectSuperypes(LogicProblem problem, Problem2PartialInterpretationTrace trace) {
		for(typeDeclaration : problem.types.filter(TypeDeclaration)) {
			val supertypes = typeDeclaration.<Type>transitiveClosurePlus[it.supertypes]
			for(supertype : supertypes.filter(TypeDeclaration)) {
				typeDeclaration.lookup(trace.type2Interpretation).supertypeInterpretation += supertype.lookup(trace.type2Interpretation)
				//println('''«typeDeclaration.name» --> «supertype.name»''')
			}
		}
	}
	
	def private initialisePartialRelationInterpretation(RelationDeclaration r, Problem2PartialInterpretationTrace trace) {
		val res = createPartialRelationInterpretation => [
			it.interpretationOf = r
			if(r.parameters.size==2) {
				it.param1 = r.parameters.get(0)
				it.param2 = r.parameters.get(1)
			} else throw new UnsupportedOperationException
		]
		trace.relation2Interpretation.put(r,res)
		return res
	}
	
	def private PartialConstantInterpretation initialisePartialConstantDeclaration(ConstantDeclaration c, Problem2PartialInterpretationTrace trace) {
		throw new UnsupportedOperationException
	}
	
	def private PartialFunctionInterpretation initialisePartialFunctionInterpretation(FunctionDeclaration f, Problem2PartialInterpretationTrace trace) {
		throw new UnsupportedOperationException
	}
}