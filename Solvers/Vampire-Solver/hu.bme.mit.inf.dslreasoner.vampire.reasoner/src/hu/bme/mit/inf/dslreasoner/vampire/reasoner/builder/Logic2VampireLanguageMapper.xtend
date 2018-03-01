package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder

import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Assertion
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.VampireSolverConfiguration
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSTerm
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguageFactory
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireModel
import java.util.Collections
import java.util.HashMap
import org.eclipse.xtend.lib.annotations.Accessors
import hu.bme.mit.inf.dslreasoner.services.VampireLanguageGrammarAccess.VLSConjectureElements
import hu.bme.mit.inf.dslreasoner.services.VampireLanguageGrammarAccess.VLSAxiomElements
import java.util.Collection
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Term
import java.util.Map
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolLiteral

class Logic2VampireLanguageMapper {
	private val extension VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE
	private val Logic2VampireLanguageMapper_Support support = new Logic2VampireLanguageMapper_Support;
	@Accessors(PUBLIC_GETTER) private val Logic2VampireLanguageMapper_ConstantMapper constantMapper = new Logic2VampireLanguageMapper_ConstantMapper(this)
	
	public new() {
		//add typeMapper when implemented
	}
	
	public def TracedOutput<VampireModel,Logic2VampireLanguageMapperTrace> transformProblem(LogicProblem problem, VampireSolverConfiguration configuration) {
		//create model bases
		
		//TODO
		val initialComment = createVLSComment => [
			it.comment = "%This is an initial Test Comment"
		]
		
		val specification = createVampireModel=>[
			it.comments += initialComment
		]
		
		val trace = new Logic2VampireLanguageMapperTrace => [
			it.specification = specification
			
//			it.incQueryEngine = viatraQueryEngine.on(new EMFScope(problem))
		]
		
		 
		//call mappers
		
		
		trace.constantDefinitions = problem.collectConstantDefinitions
		
		//only transforms definitions
		problem.constants.filter(ConstantDefinition).forEach[this.constantMapper.transformConstant(it, trace)]
		
		problem.constants.filter(ConstantDefinition).forEach[this.constantMapper.transformConstantDefinitionSpecification(it,trace)]
		
		////////////////////
		// Transform Assertions
		////////////////////
		for(assertion : problem.assertions) {		
				transformAssertion(assertion,trace)
		}
		
		
		
		return new TracedOutput(specification,trace)
	}
	
	
	

	
	//////////////
	// Collector
	//////////////
	
	//Same as for Alloy
	private def collectConstantDefinitions(LogicProblem problem) {
		val res = new HashMap
		problem.constants.filter(ConstantDefinition).filter[it.defines!==null].forEach[
			res.put(it.defines,it)
		]
		return res
	}
	
	//////////////
	// Assertions + Terms
	//////////////
	
	//TODO
	def protected transformAssertion(Assertion assertion, Logic2VampireLanguageMapperTrace trace) {
		//val role = createVLS
		val res = createVLSFofFormula => [
			it.name = support.toID(assertion.name)
			it.fofRole = "conjecture"
			it.fofFormula = assertion.value.transformTerm(trace, Collections.EMPTY_MAP)
			//it.annotation = nothing			
		]
		trace.specification.formulas += res
	}
	
	//Fix map contents
	def dispatch protected VLSTerm transformTerm(BoolLiteral literal, Logic2VampireLanguageMapperTrace trace, Map variables) {
		
	}
	
	//TODO similar for Int and Real
	
	//////////
	//Type Reference
	/////////
	def dispatch protected VLSTerm transformTypeReference(BoolTypeReference boolTypeReference, Logic2VampireLanguageMapperTrace trace) {
		return null
	}
	
	
	
	
}