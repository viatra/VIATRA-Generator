package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder

import ca.mcgill.ecse.dslreasoner.vampire.reasoner.VampireSolverConfiguration
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTerm
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSVariable
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguageFactory
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireModel
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.And
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Assertion
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolLiteral
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Distinct
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Equals
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Exists
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Forall
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Iff
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Impl
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.InstanceOf
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IntLiteral
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Not
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Or
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicValue
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Term
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.RelationDefinitionImpl
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import java.util.Collections
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.RelationDeclarationImpl

class Logic2VampireLanguageMapper {
	private val extension VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE
	private val Logic2VampireLanguageMapper_Support support = new Logic2VampireLanguageMapper_Support;
	@Accessors(PUBLIC_GETTER) private val Logic2VampireLanguageMapper_ConstantMapper constantMapper = new Logic2VampireLanguageMapper_ConstantMapper(
		this)
	@Accessors(PUBLIC_GETTER) private val Logic2VampireLanguageMapper_ContainmentMapper containmentMapper = new Logic2VampireLanguageMapper_ContainmentMapper(
		this)
	@Accessors(PUBLIC_GETTER) private val Logic2VampireLanguageMapper_RelationMapper relationMapper = new Logic2VampireLanguageMapper_RelationMapper(
		this)
	@Accessors(PUBLIC_GETTER) private val Logic2VampireLanguageMapper_ScopeMapper scopeMapper = new Logic2VampireLanguageMapper_ScopeMapper(
		this)
	@Accessors(PUBLIC_GETTER) private val Logic2VampireLanguageMapper_TypeMapper typeMapper = new Logic2VampireLanguageMapper_TypeMapper(
		this)

	public def TracedOutput<VampireModel, Logic2VampireLanguageMapperTrace> transformProblem(LogicProblem problem,
		VampireSolverConfiguration config) {
		// create model bases
		// TODO
		val initialComment = createVLSComment => [
			it.comment = "%This is an initial Test Comment"
		]

		val specification = createVampireModel => [
			it.comments += initialComment
		]

		val trace = new Logic2VampireLanguageMapperTrace => [
			it.specification = specification

//			it.incQueryEngine = viatraQueryEngine.on(new EMFScope(problem))
		]

		// TYPE MAPPER
		if (!problem.types.isEmpty) {
			typeMapper.transformTypes(problem.types, problem.elements, this, trace)
		}

		// RELATION MAPPER
		trace.relationDefinitions = problem.collectRelationDefinitions
//		println(problem.relations.filter[class == RelationDefinitionImpl])
		toTrace(problem.relations.filter[class == RelationDefinitionImpl], trace)
		problem.relations.forEach[this.relationMapper.transformRelation(it, trace, new Logic2VampireLanguageMapper)]

		// CONTAINMENT MAPPER
		containmentMapper.transformContainment(config, problem.containmentHierarchies, trace)

		// SCOPE MAPPER
		scopeMapper.transformScope(problem.types, config, trace)

		// CONSTANT MAPPER
		// only transforms definitions
		trace.constantDefinitions = problem.collectConstantDefinitions
		// problem.constants.filter(ConstantDefinition).forEach[this.constantMapper.transformConstant(it, trace)]
		problem.constants.filter(ConstantDefinition).forEach [
			this.constantMapper.transformConstantDefinitionSpecification(it, trace)
		]

		// ASSERTION MAPPER
		for (assertion : problem.assertions) {
			transformAssertion(assertion, trace)
		}
		// OUTPUT
		return new TracedOutput(specification, trace)
	}

	def toTrace(Iterable<Relation> relations, Logic2VampireLanguageMapperTrace trace) {
		val List<VLSVariable> vars = newArrayList
		for (rel : relations) {
			//decide name
			val nameArray = rel.name.split(" ")
			var relNameVar = ""
			if (nameArray.length == 3) {
				relNameVar = support.toIDMultiple(nameArray.get(0), nameArray.get(2))
			} else {
				relNameVar = rel.name
			}
			val relName = relNameVar
			
			val relDef = rel as RelationDefinition
			for (i : 0 ..< rel.parameters.length) {

				val v = createVLSVariable => [
					it.name = support.toIDMultiple("V", i.toString)
				]
				vars.add(v)
			}

			val relFunc = createVLSFunction => [
				it.constant = support.toIDMultiple("r", relName)
				for (v : vars) {
					it.terms += support.duplicate(v)
				}
			]
			trace.relDef2Predicate.put(relDef, relFunc)
			trace.predicate2RelDef.put(relFunc, relDef)
		}
	}

	// End of transformProblem
	// ////////////
	// Type References
	// ////////////
	def dispatch protected VLSTerm transformTypeReference(BoolTypeReference boolTypeReference,
		Logic2VampireLanguageMapperTrace trace) {
		// TODO, Not Now
		// return createALSReference => [ it.referred = support.getBooleanType(trace) ]
	}

	// ////////////
	// Collectors
	// ////////////
	// exact Same as for Alloy
	private def collectConstantDefinitions(LogicProblem problem) {
		val res = new HashMap
		problem.constants.filter(ConstantDefinition).filter[it.defines !== null].forEach [
			res.put(it.defines, it)
		]
		return res
	}

	private def collectRelationDefinitions(LogicProblem problem) {
		val res = new HashMap
		problem.relations.filter(RelationDefinition).filter[it.defines !== null].forEach [
			res.put(it.defines, it)
		]
		return res
	}

	// ////////////
	// Assertions + Terms
	// ////////////
	def protected transformAssertion(Assertion assertion, Logic2VampireLanguageMapperTrace trace) {
		val res = createVLSFofFormula => [
			it.name = support.toID("assertion_" + assertion.name)
			// below is temporary solution
			it.fofRole = "axiom"
			it.fofFormula = assertion.value.transformTerm(trace, Collections.EMPTY_MAP)
		// it.annotation = nothing			
		]
		trace.specification.formulas += res
	}

	def dispatch protected VLSTerm transformTerm(BoolLiteral literal, Logic2VampireLanguageMapperTrace trace,
		Map<Variable, VLSVariable> variables) {
		if (literal.value == true) {
			createVLSTrue
		} else {
			createVLSFalse
		}
	}

	def dispatch protected VLSTerm transformTerm(IntLiteral literal, Logic2VampireLanguageMapperTrace trace,
		Map<Variable, VLSVariable> variables) {
		createVLSInt => [it.value = literal.value.toString()]
	}

//	def dispatch protected VLSTerm transformTerm(RealLiteral literal, Logic2VampireLanguageMapperTrace trace,
//		Map<Variable, VLSVariable> variables) {
//		createVLSReal => [it.value = literal.value.toString()]
//	}
	def dispatch protected VLSTerm transformTerm(Not not, Logic2VampireLanguageMapperTrace trace,
		Map<Variable, VLSVariable> variables) {
		createVLSUnaryNegation => [operand = not.operand.transformTerm(trace, variables)]
	}

	def dispatch protected VLSTerm transformTerm(And and, Logic2VampireLanguageMapperTrace trace,
		Map<Variable, VLSVariable> variables) { support.unfoldAnd(and.operands.map[transformTerm(trace, variables)]) }

	def dispatch protected VLSTerm transformTerm(Or or, Logic2VampireLanguageMapperTrace trace,
		Map<Variable, VLSVariable> variables) { support.unfoldOr(or.operands.map[transformTerm(trace, variables)]) }

	def dispatch protected VLSTerm transformTerm(Impl impl, Logic2VampireLanguageMapperTrace trace,
		Map<Variable, VLSVariable> variables) {
		createVLSImplies => [
			left = impl.leftOperand.transformTerm(trace, variables)
			right = impl.rightOperand.transformTerm(trace, variables)
		]
	}

	def dispatch protected VLSTerm transformTerm(Iff iff, Logic2VampireLanguageMapperTrace trace,
		Map<Variable, VLSVariable> variables) {
		createVLSEquivalent => [
			left = iff.leftOperand.transformTerm(trace, variables)
			right = iff.rightOperand.transformTerm(trace, variables)
		]
	}

//	def dispatch protected VLSTerm transformTerm(MoreThan moreThan, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
//		createALSMore => [leftOperand = moreThan.leftOperand.transformTerm(trace,variables) rightOperand = moreThan.rightOperand.transformTerm(trace,variables)] }
//	def dispatch protected VLSTerm transformTerm(LessThan lessThan, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
//		createALSLess => [leftOperand = lessThan.leftOperand.transformTerm(trace,variables) rightOperand = lessThan.rightOperand.transformTerm(trace,variables)] }
//	def dispatch protected VLSTerm transformTerm(MoreOrEqualThan moreThan, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
//		createALSMeq => [leftOperand = moreThan.leftOperand.transformTerm(trace,variables) rightOperand = moreThan.rightOperand.transformTerm(trace,variables)] }
//	def dispatch protected VLSTerm transformTerm(LessOrEqualThan lessThan, Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
//		createALSLeq => [leftOperand = lessThan.leftOperand.transformTerm(trace,variables) rightOperand = lessThan.rightOperand.transformTerm(trace,variables)] }
	def dispatch protected VLSTerm transformTerm(Equals equals, Logic2VampireLanguageMapperTrace trace,
		Map<Variable, VLSVariable> variables) {
		createVLSEquality => [
			left = equals.leftOperand.transformTerm(trace, variables)
			right = equals.rightOperand.transformTerm(trace, variables)
		]
	}

	def dispatch protected VLSTerm transformTerm(Distinct distinct, Logic2VampireLanguageMapperTrace trace,
		Map<Variable, VLSVariable> variables) { support.unfoldDistinctTerms(this, distinct.operands, trace, variables) }

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
	def dispatch protected VLSTerm transformTerm(Forall forall, Logic2VampireLanguageMapperTrace trace,
		Map<Variable, VLSVariable> variables) {
		support.createQuantifiedExpression(this, forall, trace, variables, true)
	}

	def dispatch protected VLSTerm transformTerm(Exists exists, Logic2VampireLanguageMapperTrace trace,
		Map<Variable, VLSVariable> variables) {
		support.createQuantifiedExpression(this, exists, trace, variables, false)
	}

	def dispatch protected VLSTerm transformTerm(InstanceOf instanceOf, Logic2VampireLanguageMapperTrace trace,
		Map<Variable, VLSVariable> variables) {
		return createVLSFunction => [
			it.constant = (instanceOf.range as ComplexTypeReference).referred.lookup(trace.type2Predicate).constant
			it.terms += instanceOf.value.transformTerm(trace, variables)
		]
	}

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
	def dispatch protected VLSTerm transformTerm(SymbolicValue symbolicValue, Logic2VampireLanguageMapperTrace trace,
		Map<Variable, VLSVariable> variables) {
		symbolicValue.symbolicReference.transformSymbolicReference(symbolicValue.parameterSubstitutions, trace,
			variables)
	}

	def dispatch protected VLSTerm transformSymbolicReference(DefinedElement referred,
		List<Term> parameterSubstitutions, Logic2VampireLanguageMapperTrace trace,
		Map<Variable, VLSVariable> variables) {
		val name = referred.lookup(trace.definedElement2String)
		return createVLSConstant => [
			it.name = name
		]
//		typeMapper.transformReference(referred, trace)
	}

	def dispatch protected VLSTerm transformSymbolicReference(ConstantDeclaration constant,
		List<Term> parameterSubstitutions, Logic2VampireLanguageMapperTrace trace,
		Map<Variable, VLSVariable> variables) {
		// might need to make sure that only declared csts get transformed. see for Alloy
		val res = createVLSConstant => [
			// ask if necessary VLSConstantDeclaration and not just directly strng
			it.name = support.toID(constant.name)
		]
		// no postprocessing cuz booleans are accepted
		return res
	}

	// NOT NEEDED FOR NOW
	// TODO
	def dispatch protected VLSTerm transformSymbolicReference(ConstantDefinition constant,
		List<Term> parameterSubstitutions, Logic2VampireLanguageMapperTrace trace,
		Map<Variable, VLSVariable> variables) {
//		val res = createVLSFunctionCall => [
//			it.referredDefinition = constant.lookup(trace.constantDefinition2Function)
//		]
//		return support.postprocessResultOfSymbolicReference(constant.type,res,trace)
	}

	def dispatch protected VLSTerm transformSymbolicReference(Variable variable, List<Term> parameterSubstitutions,
		Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {

		// cannot treat variable as function (constant) because of name ID not being the same
		// no need for potprocessing cuz booleans are supported
		return support.duplicate(variable.lookup(variables))
	}

	// TODO
	def dispatch protected VLSTerm transformSymbolicReference(FunctionDeclaration function,
		List<Term> parameterSubstitutions, Logic2VampireLanguageMapperTrace trace,
		Map<Variable, VLSVariable> variables) {
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

	// TODO
	def dispatch protected VLSTerm transformSymbolicReference(FunctionDefinition function,
		List<Term> parameterSubstitutions, Logic2VampireLanguageMapperTrace trace,
		Map<Variable, VLSVariable> variables) {
//		val result = createVLSFunctionCall => [
//			it.referredDefinition = function.lookup(trace.functionDefinition2Function)
//			it.params += parameterSubstitutions.map[it.transformTerm(trace,variables)]
//		]
//		return support.postprocessResultOfSymbolicReference(function.range,result,trace)
	}

	// TODO
	/*
	 * def dispatch protected VLSTerm transformSymbolicReference(Relation relation,
	 * 	List<Term> parameterSubstitutions, Logic2VampireLanguageMapperTrace trace,
	 * 	Map<Variable, VLSVariable> variables) {
	 * 	if (trace.relationDefinitions.containsKey(relation)) {
	 * 		this.transformSymbolicReference(relation.lookup(trace.relationDefinitions),
	 * 			parameterSubstitutions, trace, variables)
	 * 	}
	 * 	else {
	 * //						if (relationMapper.transformToHostedField(relation, trace)) {
	 * //							val VLSRelation = relation.lookup(trace.relationDeclaration2Field)
	 * //							// R(a,b) =>
	 * //							// b in a.R
	 * //							return createVLSSubset => [
	 * //								it.leftOperand = parameterSubstitutions.get(1).transformTerm(trace, variables)
	 * //								it.rightOperand = createVLSJoin => [
	 * //									it.leftOperand = parameterSubstitutions.get(0).transformTerm(trace, variables)
	 * //									it.rightOperand = createVLSReference => [it.referred = VLSRelation]
	 * //								]
	 * //							]
	 * //						} else {
	 * //							val target = createVLSJoin => [
	 * //								leftOperand = createVLSReference => [referred = trace.logicLanguage]
	 * //								rightOperand = createVLSReference => [
	 * //									referred = relation.lookup(trace.relationDeclaration2Global)
	 * //								]
	 * //							]
	 * //							val source = support.unfoldTermDirectProduct(this, parameterSubstitutions, trace, variables)
	 * //
	 * //							return createVLSSubset => [
	 * //								leftOperand = source
	 * //								rightOperand = target
	 * //							]
	 * //						}
	 * 	}
	 * }
	 */
	// TODO
	def dispatch protected VLSTerm transformSymbolicReference(Relation relation, List<Term> parameterSubstitutions,
		Logic2VampireLanguageMapperTrace trace, Map<Variable, VLSVariable> variables) {
//					 createVLSFunction => [
//						it.referredDefinition = relation.lookup(trace.relationDefinition2Predicate)
//						it.params += parameterSubstitutions.map[p|p.transformTerm(trace, variables)]
//					]
//		println(relation.name)
//		if(relation.class == RelationDefinitionImpl) {
//			println("(" + (relation as RelationDefinition).getDefines + ")")
//		}
		return createVLSFunction => [
			if (relation.class == RelationDeclarationImpl) {
				it.constant = (relation as RelationDeclaration).lookup(trace.rel2Predicate).constant
			} else {
				it.constant = (relation as RelationDefinition).lookup(trace.relDef2Predicate).constant
			}

			it.terms += parameterSubstitutions.map[p|p.transformTerm(trace, variables)]
		]
	}

}
