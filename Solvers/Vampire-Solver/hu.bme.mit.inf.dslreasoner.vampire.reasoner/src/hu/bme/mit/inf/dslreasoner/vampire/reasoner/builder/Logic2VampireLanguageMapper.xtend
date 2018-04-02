package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder

import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.And
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Assertion
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolLiteral
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Equals
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Exists
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Forall
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Iff
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Impl
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IntLiteral
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Not
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Or
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RealLiteral
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicValue
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Term
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.vampire.reasoner.VampireSolverConfiguration
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSTerm
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSVariable
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguageFactory
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireModel
import java.util.Collections
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class Logic2VampireLanguageMapper {
	private val extension VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE
	private val Logic2VampireLanguageMapper_Support support = new Logic2VampireLanguageMapper_Support;
	@Accessors(PUBLIC_GETTER) private val Logic2VampireLanguageMapper_ConstantMapper constantMapper = new Logic2VampireLanguageMapper_ConstantMapper(this)
	@Accessors(PUBLIC_GETTER) private val Logic2VampireLanguageMapper_RelationMapper relationMapper = new Logic2VampireLanguageMapper_RelationMapper(this)
	@Accessors(PUBLIC_GETTER) private val Logic2VampireLanguageMapper_TypeMapper typeMapper
	
	
	public new(Logic2VampireLanguageMapper_TypeMapper typeMapper) {
		this.typeMapper = typeMapper		
	}
	
	public def TracedOutput<VampireModel,Logic2VampireLanguageMapperTrace> transformProblem(LogicProblem problem, VampireSolverConfiguration configuration) {
		//create model bases
		
		//TODO
		val initialComment = createVLSComment => [
			it.comment = "%This is an initial Test Comment \r"
		]
		
		val specification = createVampireModel=>[
			it.comments += initialComment
		]
		
		val trace = new Logic2VampireLanguageMapperTrace => [
			it.specification = specification
			
//			it.incQueryEngine = viatraQueryEngine.on(new EMFScope(problem))
		]
		
		 
		//call mappers
		if(!problem.types.isEmpty) {
			typeMapper.transformTypes(problem.types,problem.elements,this,trace)
		}
		
		
		trace.constantDefinitions = problem.collectConstantDefinitions
		trace.relationDefinitions = problem.collectRelationDefinitions
		
		problem.relations.filter(RelationDefinition).forEach[this.relationMapper.transformRelation(it, trace)]
		
		//only transforms definitions
		//problem.constants.filter(ConstantDefinition).forEach[this.constantMapper.transformConstant(it, trace)]
		
		problem.constants.filter(ConstantDefinition).forEach[this.constantMapper.transformConstantDefinitionSpecification(it,trace)]
		
		////////////////////
		// Transform Assertions
		////////////////////
		for(assertion : problem.assertions) {		
				transformAssertion(assertion,trace)
		}
		
		
		
		return new TracedOutput(specification,trace)
	}
	//End of transformProblem
	
	//////////////
	// Type References
	//////////////
	def dispatch protected VLSTerm transformTypeReference(BoolTypeReference boolTypeReference, Logic2VampireLanguageMapperTrace trace) {
		//TODO, Not Now
		//return createALSReference => [ it.referred = support.getBooleanType(trace) ]
	}

	
	//////////////
	// Collectors
	//////////////
	
	//exact Same as for Alloy
	private def collectConstantDefinitions(LogicProblem problem) {
		val res = new HashMap
		problem.constants.filter(ConstantDefinition).filter[it.defines!==null].forEach[
			res.put(it.defines,it)
		]
		return res
	}
	
	private def collectRelationDefinitions(LogicProblem problem) {
		val res = new HashMap
		problem.relations.filter(RelationDefinition).filter[it.defines!==null].forEach[
			res.put(it.defines,it)
		]
		return res
	}
	
	//////////////
	// Assertions + Terms
	//////////////
	
	//TODO
	def protected transformAssertion(Assertion assertion, Logic2VampireLanguageMapperTrace trace) {
		val res = createVLSFofFormula => [
			it.name = support.toID(assertion.name)
			//below is temporary solution
			it.fofRole = "axiom"
			it.fofFormula = assertion.value.transformTerm(trace, Collections.EMPTY_MAP)
			//it.annotation = nothing			
		]
		trace.specification.formulas += res
	}
	
	def dispatch protected VLSTerm transformTerm(BoolLiteral literal, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
		if(literal.value == true) { createVLSTrue }
		else { createVLSFalse }
	}
	def dispatch protected VLSTerm transformTerm(IntLiteral literal, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
		createVLSInt => [ it.value = literal.value.toString() ]
	}
	def dispatch protected VLSTerm transformTerm(RealLiteral literal, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
		createVLSReal => [ it.value = literal.value.toString() ]
	}
	
	def dispatch protected VLSTerm transformTerm(Not not, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
		createVLSUnaryNegation=>[operand = not.operand.transformTerm(trace,variables)] }
	def dispatch protected VLSTerm transformTerm(And and, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
		support.unfoldAnd(and.operands.map[transformTerm(trace,variables)]) }
	def dispatch protected VLSTerm transformTerm(Or or, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
		support.unfoldOr(or.operands.map[transformTerm(trace,variables)]) }
	def dispatch protected VLSTerm transformTerm(Impl impl, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
		createVLSImplies => [left = impl.leftOperand.transformTerm(trace,variables) right = impl.rightOperand.transformTerm(trace,variables)] }
	def dispatch protected VLSTerm transformTerm(Iff iff, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
		createVLSEquivalent => [left = iff.leftOperand.transformTerm(trace,variables) right = iff.rightOperand.transformTerm(trace,variables)] }

//	def dispatch protected VLSTerm transformTerm(MoreThan moreThan, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
//		createALSMore => [leftOperand = moreThan.leftOperand.transformTerm(trace,variables) rightOperand = moreThan.rightOperand.transformTerm(trace,variables)] }
//	def dispatch protected VLSTerm transformTerm(LessThan lessThan, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
//		createALSLess => [leftOperand = lessThan.leftOperand.transformTerm(trace,variables) rightOperand = lessThan.rightOperand.transformTerm(trace,variables)] }
//	def dispatch protected VLSTerm transformTerm(MoreOrEqualThan moreThan, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
//		createALSMeq => [leftOperand = moreThan.leftOperand.transformTerm(trace,variables) rightOperand = moreThan.rightOperand.transformTerm(trace,variables)] }
//	def dispatch protected VLSTerm transformTerm(LessOrEqualThan lessThan, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
//		createALSLeq => [leftOperand = lessThan.leftOperand.transformTerm(trace,variables) rightOperand = lessThan.rightOperand.transformTerm(trace,variables)] }
	def dispatch protected VLSTerm transformTerm(Equals equals, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
		createVLSEquality => [left = equals.leftOperand.transformTerm(trace,variables) right = equals.rightOperand.transformTerm(trace,variables)] }
//	def dispatch protected VLSTerm transformTerm(Distinct distinct, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
//		support.unfoldDistinctTerms(this,distinct.operands,trace,variables) }
//	
//		def dispatch protected ALSTerm transformTerm(Plus plus, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
//		createALSFunctionCall => [it.params += plus.leftOperand.transformTerm(trace,variables) it.params += plus.rightOperand.transformTerm(trace,variables) it.referredNumericOperator = ALSNumericOperator.PLUS] }
//	def dispatch protected ALSTerm transformTerm(Minus minus, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
//		createALSFunctionCall => [it.params += minus.leftOperand.transformTerm(trace,variables) it.params += minus.rightOperand.transformTerm(trace,variables) it.referredNumericOperator = ALSNumericOperator.SUB] }
//	def dispatch protected ALSTerm transformTerm(Multiply multiply, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
//		createALSFunctionCall => [it.params += multiply.leftOperand.transformTerm(trace,variables) it.params += multiply.rightOperand.transformTerm(trace,variables) it.referredNumericOperator = ALSNumericOperator.MUL] }
//	def dispatch protected ALSTerm transformTerm(Divison div, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
//		createALSFunctionCall => [it.params += div.leftOperand.transformTerm(trace,variables) it.params += div.rightOperand.transformTerm(trace,variables) it.referredNumericOperator = ALSNumericOperator.DIV] }
//	def dispatch protected ALSTerm transformTerm(Mod mod, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
//		createALSFunctionCall => [it.params += mod.leftOperand.transformTerm(trace,variables) it.params += mod.rightOperand.transformTerm(trace,variables) it.referredNumericOperator = ALSNumericOperator.REM] }
//	
	def dispatch protected VLSTerm transformTerm(Forall forall, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
		support.createUniversallQuantifiedExpression(this, forall, trace, variables) }
	def dispatch protected VLSTerm transformTerm(Exists exists, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
		support.createExistentiallyQuantifiedExpression(this, exists, trace, variables) }
		
//	def dispatch protected ALSTerm transformTerm(InstanceOf instanceOf, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
//		return createALSSubset => [
//			it.leftOperand = instanceOf.value.transformTerm(trace,variables)
//			it.rightOperand = instanceOf.range.transformTypeReference(trace)
//		]
//	}
//	
//	def dispatch protected ALSTerm transformTerm(TransitiveClosure tc, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
//		return this.relationMapper.transformTransitiveRelationReference(
//			tc.relation,
//			tc.leftOperand.transformTerm(trace,variables),
//			tc.rightOperand.transformTerm(trace,variables),
//			trace
//		)
//	}
//	

	def dispatch protected VLSTerm transformTerm(SymbolicValue symbolicValue, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
		symbolicValue.symbolicReference.transformSymbolicReference(symbolicValue.parameterSubstitutions,trace,variables) }
	
	//Not Needed for now
	//TODO
	def dispatch protected VLSTerm transformSymbolicReference(DefinedElement referred, List<Term> parameterSubstitutions, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
		typeMapper.transformReference(referred,trace)
	}
	
	def dispatch protected VLSTerm transformSymbolicReference(ConstantDeclaration constant, List<Term> parameterSubstitutions, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
		//might need to make sure that only declared csts get transformed. see for Alloy
		val res = createVLSConstant=> [
			//ask if necessary VLSConstantDeclaration and not just directly strng
			it.name = support.toID(constant.name)
		]
		//no postprocessing cuz booleans are accepted
		return res
	}
	//NOT NEEDED FOR NOW
	//TODO
	def dispatch protected VLSTerm transformSymbolicReference(ConstantDefinition constant, List<Term> parameterSubstitutions, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
//		val res = createVLSFunctionCall => [
//			it.referredDefinition = constant.lookup(trace.constantDefinition2Function)
//		]
//		return support.postprocessResultOfSymbolicReference(constant.type,res,trace)
	}

	def dispatch protected VLSTerm transformSymbolicReference(Variable variable, List<Term> parameterSubstitutions, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
		
		//cannot treat variable as function (constant) because of name ID not being the same
		//below does not work
		val res = createVLSVariable => [
						it.name = variable.lookup(variables).name
					]
		//no need for potprocessing cuz booleans are supported
		return res
	} 
	//TODO
	def dispatch protected VLSTerm transformSymbolicReference(FunctionDeclaration function, List<Term> parameterSubstitutions, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
//		if(trace.functionDefinitions.containsKey(function)) {
//			return this.transformSymbolicReference(function.lookup(trace.functionDefinitions),parameterSubstitutions,trace,variables)
//		} else {
//			if(functionMapper.transformedToHostedField(function,trace)) {
//				val param = parameterSubstitutions.get(0).transformTerm(trace,variables)
//				val res = createVLSJoin => [
//					leftOperand = support.prepareParameterOfSymbolicReference(function.parameters.get(0),param,trace)
//					rightOperand = createVLSReference => [referred = function.lookup(trace.functionDeclaration2HostedField)]
//				]
//				return support.postprocessResultOfSymbolicReference(function.range,res,trace)
//			} else {
//				val functionExpression = createVLSJoin=>[
//						leftOperand = createVLSReference => [referred = trace.logicLanguage]
//						rightOperand = createVLSReference => [referred = function.lookup(trace.functionDeclaration2LanguageField)]
//					]
//				val res =  support.unfoldDotJoin(this,parameterSubstitutions,functionExpression,trace,variables)
//				return support.postprocessResultOfSymbolicReference(function.range,res,trace)
//			}
//		}
	}
	//TODO
	def dispatch protected VLSTerm transformSymbolicReference(FunctionDefinition function, List<Term> parameterSubstitutions, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
//		val result = createVLSFunctionCall => [
//			it.referredDefinition = function.lookup(trace.functionDefinition2Function)
//			it.params += parameterSubstitutions.map[it.transformTerm(trace,variables)]
//		]
//		return support.postprocessResultOfSymbolicReference(function.range,result,trace)
	}
	
	//TODO
//	def dispatch protected VLSTerm transformSymbolicReference(RelationDeclaration relation, List<Term> parameterSubstitutions,
////		Logic2AlloyLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
////		if(trace.relationDefinitions.containsKey(relation)) {
////			this.transformSymbolicReference(relation.lookup(trace.relationDefinitions),parameterSubstitutions,trace,variables)
////		} else {
////			if(relationMapper.transformToHostedField(relation,trace)) {
////				val VLSRelation = relation.lookup(trace.relationDeclaration2Field)
////				// R(a,b) =>
////				// b in a.R
////				return createVLSSubset => [
////					it.leftOperand = parameterSubstitutions.get(1).transformTerm(trace,variables)
////					it.rightOperand = createVLSJoin => [
////						it.leftOperand = parameterSubstitutions.get(0).transformTerm(trace,variables)
////						it.rightOperand = createVLSReference => [ it.referred = VLSRelation ]
////					]
////				]
////			} else {
////				val target = createVLSJoin => [
////					leftOperand = createVLSReference => [referred = trace.logicLanguage]
////					rightOperand = createVLSReference => [ referred = relation.lookup(trace.relationDeclaration2Global) ]]
////				val source = support.unfoldTermDirectProduct(this,parameterSubstitutions,trace,variables)
////				
////				return  createVLSSubset => [
////					leftOperand = source
////					rightOperand = target
////				]
////			}
////		}
//	}
//
//	
//	//TODO
//	def dispatch protected VLSTerm transformSymbolicReference(RelationDefinition relation, List<Term> parameterSubstitutions,
//		Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables)
//	{
////		return createVLSFunctionCall => [
////			it.referredDefinition = relation.lookup(trace.relationDefinition2Predicate)
////			it.params += parameterSubstitutions.map[p | p.transformTerm(trace,variables)]
////		]
//	}

	
	
	
	
	
}