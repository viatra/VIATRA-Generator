package hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder

import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.AlloySolverConfiguration
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSEnumLiteral
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMultiplicity
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNumericOperator
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTerm
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSVariableDeclaration
import hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration
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
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Divison
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Equals
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Exists
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Forall
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Iff
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Impl
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.InstanceOf
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IntLiteral
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IntTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LessOrEqualThan
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LessThan
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Minus
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Mod
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.MoreOrEqualThan
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.MoreThan
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Multiply
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Not
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Or
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Plus
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RealLiteral
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RealTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicValue
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Term
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import java.util.Collections
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope
import org.eclipse.xtend.lib.annotations.Accessors

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.Annotation
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.InverseRelationAssertion
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.AssertionAnnotation
import java.util.Collection
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.LowerMultiplicityAssertion
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.UpperMultiplicityAssertion
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDirectProduct

class Logic2AlloyLanguageMapper {
	private val extension AlloyLanguageFactory factory = AlloyLanguageFactory.eINSTANCE
	private val Logic2AlloyLanguageMapper_Support support = new Logic2AlloyLanguageMapper_Support;
	@Accessors(PUBLIC_GETTER) private val Logic2AlloyLanguageMapper_TypeMapper typeMapper;
	@Accessors(PUBLIC_GETTER) private val Logic2AlloyLanguageMapper_ConstantMapper constantMapper = new Logic2AlloyLanguageMapper_ConstantMapper(this)
	@Accessors(PUBLIC_GETTER) private val Logic2AlloyLanguageMapper_FunctionMapper functionMapper = new Logic2AlloyLanguageMapper_FunctionMapper(this)
	@Accessors(PUBLIC_GETTER) private val Logic2AlloyLanguageMapper_RelationMapper relationMapper = new Logic2AlloyLanguageMapper_RelationMapper(this)
	@Accessors(PUBLIC_GETTER) private val Logic2AlloyLanguageMapper_Containment containmentMapper = new Logic2AlloyLanguageMapper_Containment(this)
	
	public new(Logic2AlloyLanguageMapper_TypeMapper typeMapper) {
		this.typeMapper = typeMapper
	}
	
	public def TracedOutput<ALSDocument,Logic2AlloyLanguageMapperTrace> transformProblem(LogicProblem problem, AlloySolverConfiguration config) {
		val logicLanguage = createALSSignatureBody => [
				it.multiplicity = ALSMultiplicity.ONE
				it.declarations +=
					createALSSignatureDeclaration => [
							it.name = support.toID(#["util", "language"]) ] 
		]
		
		val specification = createALSDocument=>[
			it.signatureBodies+=logicLanguage
		]
		val trace = new Logic2AlloyLanguageMapperTrace => [
			it.specification = specification
			it.logicLanguage = logicLanguage.declarations.head
			it.logicLanguageBody = logicLanguage
			
			it.incqueryEngine = ViatraQueryEngine.on(new EMFScope(problem))
		]
		
		typeMapper.transformTypes(problem.types,problem.elements,this,trace)
		
		trace.constantDefinitions = problem.collectConstantDefinitions
		trace.functionDefinitions = problem.collectFunctionDefinitions
		trace.relationDefinitions = problem.collectRelationDefinitions
		
		problem.constants.forEach[this.constantMapper.transformConstant(it,trace)]
		problem.functions.forEach[this.functionMapper.transformFunction(it, trace)]
		problem.relations.forEach[this.relationMapper.transformRelation(it, trace)]
		
		problem.constants.filter(ConstantDefinition).forEach[this.constantMapper.transformConstantDefinitionSpecification(it,trace)]
		problem.functions.filter(FunctionDefinition).forEach[this.functionMapper.transformFunctionDefinitionSpecification(it,trace)]
		problem.relations.filter(RelationDefinition).forEach[this.relationMapper.transformRelationDefinitionSpecification(it,trace)]
		
		val containment = problem.getContainmentHierarchies.head
		if(containment !== null) {
			this.containmentMapper.transformContainmentHierarchy(containment,trace)
		}
		
		////////////////////
		// Collect EMF-specific assertions
		////////////////////
		val assertion2InverseRelation = problem.annotations.collectAnnotations(InverseRelationAssertion)
		val assertion2UpperMultiplicityAssertion = problem.annotations.collectAnnotations(UpperMultiplicityAssertion)
		val assertion2LowerMultiplicityAssertion = problem.annotations.collectAnnotations(LowerMultiplicityAssertion)
		
		////////////////////
		// Transform Assertions
		////////////////////
		for(assertion : problem.assertions) {
			if(assertion2InverseRelation.containsKey(assertion)) {
				transformInverseAssertion(assertion.lookup(assertion2InverseRelation),trace)
			} else if(assertion2UpperMultiplicityAssertion.containsKey(assertion)) {
				transformUpperMultiplicityAssertion(assertion.lookup(assertion2UpperMultiplicityAssertion),trace)
			} else if(assertion2LowerMultiplicityAssertion.containsKey(assertion)) {
				transformLowerMultiplicityAssertion(assertion.lookup(assertion2LowerMultiplicityAssertion),trace)
			} else {
				transformAssertion(assertion,trace)
			}
		}
		
		transformRunCommand(specification, trace, config)
		
		return new TracedOutput(specification,trace)
	}
	
	def transformInverseAssertion(InverseRelationAssertion assertion, Logic2AlloyLanguageMapperTrace trace) {
		val a = assertion.inverseA
		val b = assertion.inverseB
		if(a instanceof RelationDeclaration && b instanceof RelationDeclaration &&
			!trace.relationDefinitions.containsKey(a) && !trace.relationDefinitions.containsKey(b))
		{
			val fact = createALSFactDeclaration => [
				it.name = support.toID(assertion.target.name)
				it.term = createALSEquals => [
					it.leftOperand = relationMapper.transformRelationReference(a as RelationDeclaration, trace)
					it.rightOperand = createALSInverseRelation => [it.operand = relationMapper.transformRelationReference(b as RelationDeclaration, trace) ]
				]
			]
			trace.specification.factDeclarations += fact
		} else {
			return transformAssertion(assertion.target,trace)
		}
	}
	
	def transformUpperMultiplicityAssertion(UpperMultiplicityAssertion assertion, Logic2AlloyLanguageMapperTrace trace) {
		val x = assertion.relation
		if(x instanceof RelationDeclaration && !trace.relationDefinitions.containsKey(x)) {
			val relation = relationMapper.getRelationReference((x as RelationDeclaration),trace)
			val type = relation.type
			
			if(type instanceof ALSDirectProduct) {
				type.rightMultiplicit = type.rightMultiplicit.addUpper
			} else {
				relation.multiplicity = relation.multiplicity.addUpper
			}
			
			if(assertion.upper === 1) {
				return true
			} else {
				return transformAssertion(assertion.target,trace)
			}
			
		} else {
			return transformAssertion(assertion.target,trace)
		}
	}
	
	def transformLowerMultiplicityAssertion(LowerMultiplicityAssertion assertion, Logic2AlloyLanguageMapperTrace trace) {
		val x = assertion.relation
		if(x instanceof RelationDeclaration && !trace.relationDefinitions.containsKey(x)) {
			val relation = relationMapper.getRelationReference((x as RelationDeclaration),trace)
			val type = relation.type
			
			if(type instanceof ALSDirectProduct) {
				type.rightMultiplicit = type.rightMultiplicit.addLower
			} else {
				relation.multiplicity = relation.multiplicity.addLower
			}
			
			if(assertion.lower === 1) {
				return true
			} else {
				return transformAssertion(assertion.target,trace)
			}
			
		} else {
			return transformAssertion(assertion.target,trace)
		}
	}
	
	private def addLower(ALSMultiplicity multiplicity) {
		if(multiplicity === ALSMultiplicity::SET || multiplicity === null) {
			return ALSMultiplicity::SOME
		} else if(multiplicity === ALSMultiplicity::LONE) {
			return ALSMultiplicity::ONE
		} else {
			throw new IllegalArgumentException('''Lower multiplicity is already set!''')
		}
	}
	private def addUpper(ALSMultiplicity multiplicity) {
		if(multiplicity === ALSMultiplicity::SET || multiplicity === null) {
			return ALSMultiplicity::LONE
		} else if(multiplicity === ALSMultiplicity::SOME) {
			return ALSMultiplicity::ONE
		} else {
			throw new IllegalArgumentException('''Upper multiplicity is already set!''')
		}
	}
	
	private def <T extends AssertionAnnotation>  collectAnnotations(Collection<? extends Annotation> collection, Class<T> annotationKind) {
		val res = new HashMap
		collection.filter(annotationKind).forEach[res.put(it.target,it)]
		return res
	}
	
	private def collectConstantDefinitions(LogicProblem problem) {
		val res = new HashMap
		problem.constants.filter(ConstantDefinition).filter[it.defines!==null].forEach[
			res.put(it.defines,it)
		]
		return res
	}
	private def collectFunctionDefinitions(LogicProblem problem) {
		val res = new HashMap
		problem.functions.filter(FunctionDefinition).filter[it.defines!==null].forEach[
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
	
	////////////////////
	// Type References
	////////////////////
	def dispatch protected ALSTerm transformTypeReference(BoolTypeReference boolTypeReference, Logic2AlloyLanguageMapperTrace trace) {
		return createALSReference => [ it.referred = support.getBooleanType(trace) ]
	}
	def dispatch protected ALSTerm transformTypeReference(IntTypeReference intTypeReference, Logic2AlloyLanguageMapperTrace trace) { createALSInt }
	def dispatch protected ALSTerm transformTypeReference(RealTypeReference realTypeReference, Logic2AlloyLanguageMapperTrace trace) {throw new UnsupportedOperationException('''Real types are not supported in Alloy.''')}
	def dispatch protected ALSTerm transformTypeReference(ComplexTypeReference complexTypeReference, Logic2AlloyLanguageMapperTrace trace) {
		val types = typeMapper.transformTypeReference(complexTypeReference.referred, this, trace)
		return support.unfoldPlus(types.map[t|createALSReference=>[referred = t]])
	}	
	
	//////////////
	// Scopes
	//////////////
	
	def transformRunCommand(ALSDocument specification, Logic2AlloyLanguageMapperTrace trace, AlloySolverConfiguration config) {
		specification.runCommand = createALSRunCommand => [
			it.typeScopes+= createALSSigScope => [
				it.type= typeMapper.getUndefinedSupertype(trace)
				it.number = typeMapper.getUndefinedSupertypeScope(config.typeScopes.maxNewElements,trace) 
				it.exactly = (config.typeScopes.maxNewElements == config.typeScopes.minNewElements)
			]
			if(config.typeScopes.maxNewIntegers == LogicSolverConfiguration::Unlimited) throw new UnsupportedOperationException(
				'''An integer scope have to be specified for Alloy!''')
			it.typeScopes += createALSIntScope => [
				val knownIntegerMax = config.typeScopes.knownIntegers.max
				val knownIntegerMin = config.typeScopes.knownIntegers.min
				val needNewPlaces =  Math.max(knownIntegerMax - knownIntegerMin - config.typeScopes.maxNewIntegers,0)
				val maxAbsoluteValue = Math.max(Math.abs(knownIntegerMax)+needNewPlaces+1/2, Math.abs(knownIntegerMin)+needNewPlaces/2)
				number = Integer.SIZE-Integer.numberOfLeadingZeros(maxAbsoluteValue)
			]
//			for(definedScope : config.typeScopes.allDefinedScope) {
//				it.typeScopes += createALSSigScope => [
//					it.type = definedScope.type.lookup(trace.type2ALSType)
//					it.number = definedScope.upperLimit
//					it.exactly = (definedScope.upperLimit == definedScope.lowerLimit)
//				]
//			}
		]
	}
	
	
	//////////////
	// Assertions + Terms
	//////////////
	
	def protected transformAssertion(Assertion assertion, Logic2AlloyLanguageMapperTrace trace) {
		val res = createALSFactDeclaration => [
			it.name = support.toID(assertion.name)
			it.term = assertion.value.transformTerm(trace,Collections.EMPTY_MAP)
		]
		trace.specification.factDeclarations += res
	}	
	
	def dispatch protected ALSTerm transformTerm(BoolLiteral literal, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		var ALSEnumLiteral ref;
		if(literal.value==true) {ref = support.getBooleanTrue(trace)}
		else {ref = support.getBooleanFalse(trace)}
		val refFinal = ref
		
		return  support.booleanToLogicValue((createALSReference => [referred = refFinal]),trace)
	}
	def dispatch protected ALSTerm transformTerm(RealLiteral literal, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		throw new UnsupportedOperationException("RealLiteral is not supported")
	}
	def dispatch protected ALSTerm transformTerm(IntLiteral literal, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables)  {
		if(literal.value>=0) { createALSNumberLiteral => [value = literal.value]}
		else {createALSUnaryMinus  => [it.operand = createALSNumberLiteral => [value = literal.value] ] } 
	}
	
	def dispatch protected ALSTerm transformTerm(Not not, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		createALSNot=>[operand = not.operand.transformTerm(trace,variables)] }
	def dispatch protected ALSTerm transformTerm(And and, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		support.unfoldAnd(and.operands.map[transformTerm(trace,variables)]) }
	def dispatch protected ALSTerm transformTerm(Or or, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		support.unfoldOr(or.operands.map[transformTerm(trace,variables)],trace) }
	def dispatch protected ALSTerm transformTerm(Impl impl, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		createALSImpl => [leftOperand = impl.leftOperand.transformTerm(trace,variables) rightOperand = impl.rightOperand.transformTerm(trace,variables)] }
	def dispatch protected ALSTerm transformTerm(Iff iff, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		createALSIff => [leftOperand = iff.leftOperand.transformTerm(trace,variables) rightOperand = iff.rightOperand.transformTerm(trace,variables)] }
	def dispatch protected ALSTerm transformTerm(MoreThan moreThan, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		createALSMore => [leftOperand = moreThan.leftOperand.transformTerm(trace,variables) rightOperand = moreThan.rightOperand.transformTerm(trace,variables)] }
	def dispatch protected ALSTerm transformTerm(LessThan lessThan, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		createALSLess => [leftOperand = lessThan.leftOperand.transformTerm(trace,variables) rightOperand = lessThan.rightOperand.transformTerm(trace,variables)] }
	def dispatch protected ALSTerm transformTerm(MoreOrEqualThan moreThan, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		createALSMeq => [leftOperand = moreThan.leftOperand.transformTerm(trace,variables) rightOperand = moreThan.rightOperand.transformTerm(trace,variables)] }
	def dispatch protected ALSTerm transformTerm(LessOrEqualThan lessThan, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		createALSLeq => [leftOperand = lessThan.leftOperand.transformTerm(trace,variables) rightOperand = lessThan.rightOperand.transformTerm(trace,variables)] }
	def dispatch protected ALSTerm transformTerm(Equals equals, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		createALSEquals => [leftOperand = equals.leftOperand.transformTerm(trace,variables) rightOperand = equals.rightOperand.transformTerm(trace,variables)] }
	def dispatch protected ALSTerm transformTerm(Distinct distinct, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		support.unfoldDistinctTerms(this,distinct.operands,trace,variables) }
		
	def dispatch protected ALSTerm transformTerm(Plus plus, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		createALSFunctionCall => [it.params += plus.leftOperand.transformTerm(trace,variables) it.params += plus.rightOperand.transformTerm(trace,variables) it.referredNumericOperator = ALSNumericOperator.PLUS] }
	def dispatch protected ALSTerm transformTerm(Minus minus, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		createALSFunctionCall => [it.params += minus.leftOperand.transformTerm(trace,variables) it.params += minus.rightOperand.transformTerm(trace,variables) it.referredNumericOperator = ALSNumericOperator.SUB] }
	def dispatch protected ALSTerm transformTerm(Multiply multiply, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		createALSFunctionCall => [it.params += multiply.leftOperand.transformTerm(trace,variables) it.params += multiply.rightOperand.transformTerm(trace,variables) it.referredNumericOperator = ALSNumericOperator.MUL] }
	def dispatch protected ALSTerm transformTerm(Divison div, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		createALSFunctionCall => [it.params += div.leftOperand.transformTerm(trace,variables) it.params += div.rightOperand.transformTerm(trace,variables) it.referredNumericOperator = ALSNumericOperator.DIV] }
	def dispatch protected ALSTerm transformTerm(Mod mod, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		createALSFunctionCall => [it.params += mod.leftOperand.transformTerm(trace,variables) it.params += mod.rightOperand.transformTerm(trace,variables) it.referredNumericOperator = ALSNumericOperator.REM] }
	
	def dispatch protected ALSTerm transformTerm(Forall forall, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		support.createQuantifiedExpression(this,forall,ALSMultiplicity.ALL,trace,variables) }
	def dispatch protected ALSTerm transformTerm(Exists exists, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		support.createQuantifiedExpression(this,exists,ALSMultiplicity.SOME,trace,variables) }
	
	def dispatch protected ALSTerm transformTerm(InstanceOf instanceOf, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		return createALSSubset => [
			it.leftOperand = instanceOf.value.transformTerm(trace,variables)
			it.rightOperand = instanceOf.range.transformTypeReference(trace)
		]
	}
	
	def dispatch protected ALSTerm transformTerm(SymbolicValue symbolicValue, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		symbolicValue.symbolicReference.transformSymbolicReference(symbolicValue.parameterSubstitutions,trace,variables) }
	
	def dispatch protected ALSTerm transformSymbolicReference(DefinedElement referred, List<Term> parameterSubstitutions, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		typeMapper.transformReference(referred,trace)}
	def dispatch protected ALSTerm transformSymbolicReference(ConstantDeclaration constant, List<Term> parameterSubstitutions, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		if(trace.constantDefinitions.containsKey(constant)) {
			return this.transformSymbolicReference(constant.lookup(trace.constantDefinitions),parameterSubstitutions,trace,variables)
		} else {
			val res = createALSJoin=> [
				leftOperand = createALSReference => [ referred = trace.logicLanguage ]
				rightOperand = createALSReference => [ referred = constant.lookup(trace.constantDeclaration2LanguageField) ]
			]
			return support.postprocessResultOfSymbolicReference(constant.type,res,trace)
		}
	}
	def dispatch protected ALSTerm transformSymbolicReference(ConstantDefinition constant, List<Term> parameterSubstitutions, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		val res = createALSFunctionCall => [
			it.referredDefinition = constant.lookup(trace.constantDefinition2Function)
		]
		return support.postprocessResultOfSymbolicReference(constant.type,res,trace)
	}
	def dispatch protected ALSTerm transformSymbolicReference(Variable variable, List<Term> parameterSubstitutions, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		val res = createALSReference => [referred = variable.lookup(variables)]
		return support.postprocessResultOfSymbolicReference(variable.range,res,trace)
	}
	def dispatch protected ALSTerm transformSymbolicReference(FunctionDeclaration function, List<Term> parameterSubstitutions, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		if(trace.functionDefinitions.containsKey(function)) {
			return this.transformSymbolicReference(function.lookup(trace.functionDefinitions),parameterSubstitutions,trace,variables)
		} else {
			if(functionMapper.transformedToHostedField(function,trace)) {
				val param = parameterSubstitutions.get(0).transformTerm(trace,variables)
				val res = createALSJoin => [
					leftOperand = support.prepareParameterOfSymbolicReference(function.parameters.get(0),param,trace)
					rightOperand = createALSReference => [referred = function.lookup(trace.functionDeclaration2HostedField)]
				]
				return support.postprocessResultOfSymbolicReference(function.range,res,trace)
			} else {
				val functionExpression = createALSJoin=>[
						leftOperand = createALSReference => [referred = trace.logicLanguage]
						rightOperand = createALSReference => [referred = function.lookup(trace.functionDeclaration2LanguageField)]
					]
				val res =  support.unfoldDotJoin(this,parameterSubstitutions,functionExpression,trace,variables)
				return support.postprocessResultOfSymbolicReference(function.range,res,trace)
			}
		}
	}
	def dispatch protected ALSTerm transformSymbolicReference(FunctionDefinition function, List<Term> parameterSubstitutions, Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		val result = createALSFunctionCall => [
			it.referredDefinition = function.lookup(trace.functionDefinition2Function)
			it.params += parameterSubstitutions.map[it.transformTerm(trace,variables)]
		]
		return support.postprocessResultOfSymbolicReference(function.range,result,trace)
	}

	def dispatch protected ALSTerm transformSymbolicReference(RelationDeclaration relation, List<Term> parameterSubstitutions,
		Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables) {
		if(trace.relationDefinitions.containsKey(relation)) {
			this.transformSymbolicReference(relation.lookup(trace.relationDefinitions),parameterSubstitutions,trace,variables)
		} else {
			if(relationMapper.transformToHostedField(relation,trace)) {
				val alsRelation = relation.lookup(trace.relationDeclaration2Field)
				// R(a,b) =>
				// b in a.R
				return createALSSubset => [
					it.leftOperand = parameterSubstitutions.get(1).transformTerm(trace,variables)
					it.rightOperand = createALSJoin => [
						it.leftOperand = parameterSubstitutions.get(0).transformTerm(trace,variables)
						it.rightOperand = createALSReference => [ it.referred = alsRelation ]
					]
				]
			} else {
				val target = createALSJoin => [
					leftOperand = createALSReference => [referred = trace.logicLanguage]
					rightOperand = createALSReference => [ referred = relation.lookup(trace.relationDeclaration2Global) ]]
				val source = support.unfoldTermDirectProduct(this,parameterSubstitutions,trace,variables)
				
				return  createALSSubset => [
					leftOperand = source
					rightOperand = target
				]
			}
		}
	}

	
	
	def dispatch protected ALSTerm transformSymbolicReference(RelationDefinition relation, List<Term> parameterSubstitutions,
		Logic2AlloyLanguageMapperTrace trace, Map<Variable, ALSVariableDeclaration> variables)
	{
		return createALSFunctionCall => [
			it.referredDefinition = relation.lookup(trace.relationDefinition2Predicate)
			it.params += parameterSubstitutions.map[p | p.transformTerm(trace,variables)]
		]
	}
}