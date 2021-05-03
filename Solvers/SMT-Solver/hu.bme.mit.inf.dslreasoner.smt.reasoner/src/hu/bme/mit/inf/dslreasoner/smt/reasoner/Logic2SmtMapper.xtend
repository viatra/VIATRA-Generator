package hu.bme.mit.inf.dslreasoner.smt.reasoner

import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicProblemBuilder
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TypeScopes
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
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Function
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IfThenElse
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
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.QuantifiedExpression
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RealLiteral
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RealTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicValue
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Term
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ContainmentHierarchy
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAnd
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAssertion
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBoolTypeReference
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTComplexTypeReference
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDocument
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDeclaration
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDefinition
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIntTypeReference
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOr
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTQuantifiedExpression
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTRealTypeReference
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTReasoningTactic
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSortedVariable
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicValue
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTerm
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTType
import hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguageFactory
import hu.bme.mit.inf.dslreasoner.util.CollectionsUtil
import java.util.ArrayList
import java.util.HashMap
import java.util.LinkedHashMap
import java.util.LinkedList
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.xbase.lib.Functions.Function0
import org.eclipse.xtext.xbase.lib.Functions.Function1
import org.eclipse.xtext.xbase.lib.Functions.Function2

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import java.math.BigDecimal

class Logic2SmtMapper{
	val extension SmtLanguageFactory factory = SmtLanguageFactory.eINSTANCE
	val Logic2SmtMapper_UnfoldingSupport unfolder = new Logic2SmtMapper_UnfoldingSupport
	@Accessors val Logic2Smt_TypeMapper typeMapper;
	
	new(Logic2Smt_TypeMapper typeMapper) {
		this.typeMapper = typeMapper
	}
	
	public def TracedOutput<SMTDocument, Logic2SmtMapperTrace> transformProblem(LogicProblem problem, TypeScopes scope, SMTReasoningTactic strategy) {
		val documentInput = createSMTInput => [getModelCommand = createSMTGetModelCommand]
		if(strategy == null) documentInput.satCommand = createSMTSimpleSatCommand
		else documentInput.satCommand = createSMTComplexSatCommand => [it.method = EcoreUtil.copy(strategy)]
		
		val document = createSMTDocument => [input = documentInput]
		val trace = new Logic2SmtMapperTrace => [
			it.forwardMapper = this
			it.problem = problem
		]
		// Trafo
		this.typeMapper.transformTypes(documentInput,problem,trace, scope)
		problem.functions.filter(FunctionDeclaration).forEach[it.transformFunctionDeclaration(documentInput,trace)]
		problem.functions.filter(FunctionDefinition) .forEach[it.transformFunctionDefinition(documentInput,trace)]
		problem.relations.filter(RelationDeclaration).forEach[it.transformRelationDeclaration(documentInput,trace)]
		problem.relations.filter(RelationDefinition) .forEach[it.transformRelationDefinition(documentInput,trace)]
		problem.constants.filter(ConstantDeclaration).forEach[it.transformConstantDeclaration(documentInput,trace)]
		problem.constants.filter(ConstantDefinition) .forEach[it.transformConstantDefinition(documentInput,trace)]
		
		problem.relations.filter(RelationDefinition).forEach[it.transformRelationDefinition_definition(documentInput,trace)]
		documentInput.assertions += problem.assertions.map[transformAssertion(trace)]
		
		if(!problem.containmentHierarchies.empty) {
			transformContainmentV1(documentInput,problem.containmentHierarchies.head,trace)
		}
		// End trafo
		
		document.input.assertions.forEach[it.value.nameAllUnnamedVariable]
		document.input.functionDefinition.forEach[it.value.nameAllUnnamedVariable]
		document.cleanDocument
		document.orderDefinitions
		return new TracedOutput(document,trace)
	}
	
	private def toID(String name) {name.split("\\s+").join("!") }
	
	private def nameAllUnnamedVariable(SMTTerm root) {
		var index = 1
		val unnamedVariables = root.eAllContents.filter(SMTSortedVariable).filter[it.name == null].toList
		for(unnamedVariable : unnamedVariables) {
			unnamedVariable.name = '''var«index++»'''
		}
	}
	
//	def protected maxIntegerRageDefiniton(SMTInput documentInput) {
//		val upperlimit = createSMTFunctionDeclaration
//	}
	
	def dispatch protected List<TypeConstraint> transformTypeReference(BoolTypeReference boolTypeReference, Logic2SmtMapperTrace trace) {
		return #[new TypeConstraint(createSMTBoolTypeReference,null)]
	}
	def dispatch protected List<TypeConstraint> transformTypeReference(IntTypeReference intTypeReference, Logic2SmtMapperTrace trace) {
		return #[new TypeConstraint(createSMTIntTypeReference,null)]
	}
	def dispatch protected List<TypeConstraint> transformTypeReference(RealTypeReference realTypeReference, Logic2SmtMapperTrace trace) {
		return #[new TypeConstraint(createSMTRealTypeReference,null)]
	}
	def dispatch protected List<TypeConstraint> transformTypeReference(ComplexTypeReference complexTypeReference, Logic2SmtMapperTrace trace) {
		return typeMapper.transformTypeReference(complexTypeReference.referred,trace)
	}
	
	///////////////////////////////////////////////////////
	// Definitions
	///////////////////////////////////////////////////////
	
	def transformFunctionDeclaration(FunctionDeclaration function, SMTInput input, Logic2SmtMapperTrace trace) {
		val parameterTypeCombinations = unfolder.getPermutations(function.parameters.map[x|transformTypeReference(x,trace)])
		val rangeTypeCombinations = function.range.transformTypeReference(trace)
		
		if(rangeTypeCombinations.size == 1) {
			val rangeType = rangeTypeCombinations.head
			// Map it as function
			var index = 1
			for(combination : parameterTypeCombinations) {
				val nameWithIndex = if (parameterTypeCombinations.size > 1)
					toID('''function «function.name.toID» «index++»''')
				else
					toID('''function «function.name.toID»''')
					
				createFunctionDeclaration(function,nameWithIndex,combination,rangeType,true, input,trace)
			}
		} else {
			// Map it as a relation
			var index = 1
			for(combination : parameterTypeCombinations) {
				val type2function = new HashMap
				for(rangeType : rangeTypeCombinations) {
					val nameWithIndex = toID('''function «function.name.toID» «index++»''')
					val f = createFunctionDeclaration(function,nameWithIndex,combination,rangeType,false,input,trace)
					type2function.put(rangeType,f)
				}
				// for all rangeTypes, there is
				// 1. at least one range type that satisfies the relation
				input.assertions+=createSMTAssertion => [
					it.value = createSMTForall => [f|
						var paramIndex = 1
						for(param : combination) {
							val paramName = '''p«paramIndex++»'''
							val variable = createSMTSortedVariable => [
								it.name = paramName
								it.range = param.type
							]
							f.quantifiedVariables += variable
						}
						f.expression = createSMTOr => [
							operands+=rangeTypeCombinations.map[t|
								createSMTExists => [
									val v = createSMTSortedVariable => [
										it.name = "r"
										it.range = EcoreUtil.copy(t.type)
									]
									it.quantifiedVariables += v
									it.expression = createSMTSymbolicValue => [
										it.symbolicReference = type2function.get(t)
										it.parameterSubstitutions += f.quantifiedVariables.map[fv|
											createSMTSymbolicValue => [it.symbolicReference = fv]
										]
										it.parameterSubstitutions += createSMTSymbolicValue => [it.symbolicReference = v]	
									]
								]
							]
						]
					]
				]
				// 2. at most one range type that satisfies the relation
				// TODO a
			}
		}
	}
	
	private def createFunctionDeclaration(
		Function function,
		String nameWithIndex,
		List<TypeConstraint> combination,
		TypeConstraint rangeType,
		boolean useFunction,
		SMTInput input,
		Logic2SmtMapperTrace trace
	) {
		val smtFunction = if(useFunction) {
			createSMTFunctionDeclaration => [
				it.name = nameWithIndex
				it.parameters += combination.map[it.type]
				it.range = rangeType.type
			]
		} else {
			createSMTFunctionDeclaration => [
				it.name = nameWithIndex
				it.parameters += combination.map[it.type]
				it.parameters += rangeType.type
				it.range = createSMTBoolTypeReference
			]
		}
		
		val descriptor = new Descriptor<Function>((combination+#[rangeType]).toList.map[
			TypeDescriptor.createFromTypeReference(it.type)],function)
		trace.functionMap.put(descriptor,smtFunction)
		input.functionDeclarations += smtFunction
		trace.functionUnfolding.put(function,#[descriptor])
		
		if(!useFunction) {
			input.assertions += createSMTAssertion => [
				it.value = createSMTForall => [f|
					var pi = 0
					for(param : combination) {
						val variable = createSMTSortedVariable
						variable.name = "p"+pi.toString
						variable.range = EcoreUtil.copy(combination.get(pi).type)
						f.quantifiedVariables+=variable
						pi++
					}
					val resultParam1 = createSMTSortedVariable => [
						it.name = "res1"
						it.range = EcoreUtil.copy(rangeType.type)
					]
					f.quantifiedVariables+=resultParam1
					val resultParam2 = createSMTSortedVariable => [
						it.name = "res2"
						it.range = EcoreUtil.copy(rangeType.type)
					]
					f.quantifiedVariables+=resultParam2
					f.expression = createSMTImpl => [
						it.leftOperand = createSMTAnd => [
							it.operands += createSMTSymbolicValue => [
								it.symbolicReference = smtFunction
								it.parameterSubstitutions += (0..<combination.size).map[x|
									createSMTSymbolicValue => [it.symbolicReference = f.quantifiedVariables.get(x)]]
								it.parameterSubstitutions += createSMTSymbolicValue => [it.symbolicReference = resultParam1]
							]
							it.operands += createSMTSymbolicValue => [
								it.symbolicReference = smtFunction
								it.parameterSubstitutions += (0..<combination.size).map[x|
									createSMTSymbolicValue => [it.symbolicReference = f.quantifiedVariables.get(x)]]
								it.parameterSubstitutions += createSMTSymbolicValue => [it.symbolicReference = resultParam2]
							]
						]
						it.rightOperand = createSMTEquals => [
							it.leftOperand = createSMTSymbolicValue => [it.symbolicReference = resultParam1]
							it.rightOperand = createSMTSymbolicValue => [it.symbolicReference = resultParam2]
						]
					]
				]
			]
		}
		
		if(rangeType.constraint != null) {
			input.assertions += createSMTAssertion => [
				it.value = createSMTForall => [f|
					var pi = 0
					for(param : combination) {
						val variable = createSMTSortedVariable
						variable.name = "p"+pi.toString
						variable.range = EcoreUtil.copy(combination.get(pi).type)
						f.quantifiedVariables+=variable
						pi++
					}
					val resultParam = createSMTSortedVariable => [
						it.name = "res"
						it.range = EcoreUtil.copy(rangeType.type)
					]
					f.quantifiedVariables += resultParam
					f.expression = createSMTImpl => [
						it.leftOperand = if(useFunction)
						{
							createSMTEquals => [
								leftOperand = createSMTSymbolicValue => [
									it.symbolicReference = smtFunction
									it.parameterSubstitutions += (0..<combination.size).map[x|
										createSMTSymbolicValue => [it.symbolicReference = f.quantifiedVariables.get(x)]
									]
								]
								rightOperand = createSMTSymbolicValue => [it.symbolicReference = resultParam]
							]
						} else {
							createSMTSymbolicValue => [
								it.symbolicReference = smtFunction
								it.parameterSubstitutions += (0..<combination.size).map[x|
									createSMTSymbolicValue => [it.symbolicReference = f.quantifiedVariables.get(x)]]
								it.parameterSubstitutions += createSMTSymbolicValue => [it.symbolicReference = resultParam]
							]
						}
						it.rightOperand = rangeType.constraint.apply(resultParam)
					]
				]
			]
		}
		return smtFunction
	}
	
	def transformFunctionDefinition(FunctionDefinition function, SMTInput input, Logic2SmtMapperTrace trace) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def protected transformRelationDeclaration(RelationDeclaration relation, SMTInput input, Logic2SmtMapperTrace trace) {
		val parameterTypeCombinations = unfolder.getPermutations(relation.parameters.map[x|transformTypeReference(x,trace)])
		var relationIndex = 1
		val unfolding = new ArrayList(parameterTypeCombinations.size)
		for(parameterTypeCombination : parameterTypeCombinations) {
			/// Create a name for the relation
			val nameWithIndex = if (parameterTypeCombinations.size > 1)
					toID('''relation «relation.name.toID» «relationIndex++»''')
				else
					toID('''relation «relation.name.toID»''')
			
			// Adding an unfolded relation
			val smtRelation = createSMTFunctionDeclaration => [
				name = nameWithIndex
				parameters+= parameterTypeCombination.map[typeConstraint | EcoreUtil.copy(typeConstraint.type)]
				range = createSMTBoolTypeReference
			]
			val Descriptor<Relation> descriptor = new Descriptor<Relation>(parameterTypeCombination.map[
				TypeDescriptor.createFromTypeReference(it.type)],relation)
			trace.relationMap.put(descriptor,smtRelation)
			input.functionDeclarations += smtRelation
			unfolding += descriptor
			
			// If there is a type constraint
			if(parameterTypeCombination.exists[it.constraint != null]) {
				// create a constraint that specifies that the relation contains elemenents with the required properties
				val and = createSMTAnd
				val rel = createSMTSymbolicValue => [it.symbolicReference = smtRelation]
				val forall = createSMTForall => [
					it.expression = createSMTImpl => [
						it.leftOperand = rel
						it.rightOperand = and
					]
				]
				var paramIndex = 0
				for(param : parameterTypeCombination) {
					val paramName = '''p«paramIndex++»'''
					val variable = createSMTSortedVariable => [
						it.name = paramName
						it.range = param.type
					]
					forall.quantifiedVariables += variable
					rel.parameterSubstitutions += createSMTSymbolicValue => [it.symbolicReference = variable]
					if(param.constraint != null) {
						and.operands+=param.constraint.apply(variable)
					}
				}
				input.assertions += createSMTAssertion => [
					it.value = forall
				]
			}
		}
		trace.relationUnfolding.put(relation,unfolding)
	}
	def protected transformRelationDefinition(RelationDefinition relation, SMTInput input, Logic2SmtMapperTrace trace) {
		val parameterTypeCombinations = unfolder.getPermutations(relation.variables.map[x|transformTypeReference(x.range,trace)]).toList
		var relationIndex = 1
		val unfolding = new ArrayList(parameterTypeCombinations.size)
		for(parameterTypeCombination : parameterTypeCombinations) {
			/// Create a name for the relation
			val nameWithIndex = if (parameterTypeCombinations.size > 1)
					toID('''relation «relation.name.toID» «relationIndex++»''')
				else
					toID('''relation «relation.name.toID»''')
			
			// creating an unfolded relation
			val smtRelation = createSMTFunctionDefinition => [
				name = nameWithIndex
				range = createSMTBoolTypeReference
			]
			/*
			// adding variables as parameters
			val Map<Variable, SMTSortedVariable> variables = new HashMap
			var paramIndex = 0
			val constraintList = new LinkedList
			for(param : parameterTypeCombination) {
				val paramName = relation.variables.get(paramIndex).name.toID
				val variable = createSMTSortedVariable => [
					it.name = paramName
					it.range = param.type
				]
				
				smtRelation.parameters+=variable
				variables.put(relation.variables.get(paramIndex),variable)
				if(param.constraint != null) {
					constraintList+=param.constraint.apply(variable)
				}
				paramIndex++
			}
			val definition = transformTerm(relation.value,trace,variables)
			if(constraintList.empty) {
				smtRelation.value = definition.expectLogic.value
			} else if(constraintList.size == 1) {
				smtRelation.value = createSMTAnd => [
					it.operands += constraintList.head
					it.operands += definition.expectLogic.value
				]
			} else {
				smtRelation.value = createSMTAnd => [
					it.operands += createSMTAnd => [operands += constraintList]
					it.operands += definition.expectLogic.value
				]
			}
			*/
			// 
			val Descriptor<Relation> descriptor = new Descriptor<Relation>(parameterTypeCombination.map[
				TypeDescriptor.createFromTypeReference(it.type)],relation)
			trace.relationMap.put(descriptor,smtRelation)
			input.functionDefinition += smtRelation
			unfolding += descriptor
		}
		trace.relationUnfolding.put(relation,unfolding)
	}
	def transformRelationDefinition_definition(RelationDefinition relation, SMTInput input, Logic2SmtMapperTrace trace) {
		val parameterTypeCombinations = unfolder.getPermutations(relation.variables.map[x|transformTypeReference(x.range,trace)]).toList
		for(parameterTypeCombination : parameterTypeCombinations) {
			val Descriptor<Relation> descriptor = new Descriptor<Relation>(parameterTypeCombination.map[
				TypeDescriptor.createFromTypeReference(it.type)],relation)
			val smtRelation = descriptor.lookup(trace.relationMap) as SMTFunctionDefinition
			
			// adding variables as parameters
			val Map<Variable, SMTSortedVariable> variables = new HashMap
			var paramIndex = 0
			val constraintList = new LinkedList
			for(param : parameterTypeCombination) {
				val paramName = relation.variables.get(paramIndex).name.toID
				val variable = createSMTSortedVariable => [
					it.name = paramName
					it.range = param.type
				]
				
				smtRelation.parameters+=variable
				variables.put(relation.variables.get(paramIndex),variable)
				if(param.constraint != null) {
					constraintList+=param.constraint.apply(variable)
				}
				paramIndex++
			}
			val definition = transformTerm(relation.value,trace,variables)
			if(constraintList.empty) {
				smtRelation.value = definition.expectLogic.value
			} else if(constraintList.size == 1) {
				smtRelation.value = createSMTAnd => [
					it.operands += constraintList.head
					it.operands += definition.expectLogic.value
				]
			} else {
				smtRelation.value = createSMTAnd => [
					it.operands += createSMTAnd => [operands += constraintList]
					it.operands += definition.expectLogic.value
				]
			}
		}
	}
	
	def transformConstantDeclaration(ConstantDeclaration constant,SMTInput input, Logic2SmtMapperTrace trace) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def transformConstantDefinition(ConstantDefinition constant, SMTInput input, Logic2SmtMapperTrace trace) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	
	def protected SMTAssertion transformAssertion(Assertion assertion, Logic2SmtMapperTrace trace) {
		val a = assertion.value.transformTerm(trace,emptyMap)
		createSMTAssertion => [value = a.expectLogic.value]
	}
	
	///////////////////////////////////////////////////////
	// Logic -> Logic value transformation
	///////////////////////////////////////////////////////
	
	///////////////////////////////////////////////////////
	// Literals
	///////////////////////////////////////////////////////
	def dispatch protected TransformedSubterm transformTerm(BoolLiteral literal, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		new LogicSubterm(createSMTBoolLiteral => [value = literal.value])	}
	def dispatch protected TransformedSubterm transformTerm(IntLiteral literal, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables)  {
		if(literal.value>=0) { new NumericSubterm(#[],#[],createSMTIntLiteral  => [value = literal.value])}
		else {new NumericSubterm(#[],#[],createSMTMinus => [ leftOperand = (createSMTIntLiteral => [value = - (literal.value) ] ) ]) } }
	def dispatch protected TransformedSubterm transformTerm(RealLiteral literal, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		new NumericSubterm(#[],#[],createSMTRealLiteral => [value = BigDecimal.valueOf(literal.value)])	}
	
	///////////////////////////////////////////////////////
	// NumericOperators
	///////////////////////////////////////////////////////
	def dispatch protected TransformedSubterm transformTerm(Plus plus, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		return transformBinaryNumericOperator(
			plus.leftOperand,plus.rightOperand,
			[l,r|createSMTPlus => [ leftOperand = l rightOperand = r ]],
			trace,variables)
	}
	def dispatch protected TransformedSubterm transformTerm(Minus minus, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		return transformBinaryNumericOperator(
			minus.leftOperand,minus.rightOperand,
			[l,r|createSMTMinus => [ leftOperand = l rightOperand = r ]],
			trace,variables)
	}
	def dispatch protected TransformedSubterm transformTerm(Multiply multiply, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		return transformBinaryNumericOperator(
			multiply.leftOperand,multiply.rightOperand,
			[l,r|createSMTMultiply => [ leftOperand = l rightOperand = r ]],
			trace,variables)
	}
	def dispatch protected TransformedSubterm transformTerm(Divison div, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		return transformBinaryNumericOperator(
			div.leftOperand,div.rightOperand,
			[l,r|createSMTDiv => [ leftOperand = l rightOperand = r ]],
			trace,variables)
	}
	def dispatch protected TransformedSubterm transformTerm(Mod mod, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		return transformBinaryNumericOperator(
			mod.leftOperand,mod.rightOperand,
			[l,r|createSMTMod => [ leftOperand = l rightOperand = r ]],
			trace,variables)
	}
	
	def protected TransformedSubterm transformBinaryNumericOperator(
		Term leftOperand,
		Term rightOperand,
		Function2<SMTTerm,SMTTerm,SMTTerm> combinator,
		Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables)
	{
		val left  = leftOperand. transformTerm(trace,variables).expectNumber.getPossibleValues
		val right = rightOperand.transformTerm(trace,variables).expectNumber.getPossibleValues
		val values = new ArrayList(left.size * right.size)
		for(combination : TransformedSubterm.allCombinations(left,right)) {
			val l = combination.get(0)
			val r = combination.get(1)
			values += new SubtermOption(
				#[l,r],#[],#[],
				combinator.apply(l.expression, r.expression),
				TypeDescriptor.numericTypeDescriptor_Instance
			)
		}
		return new NumericSubterm(values)
	}
	
	///////////////////////////////////////////////////////
	// LogicOperators
	///////////////////////////////////////////////////////
	def dispatch protected TransformedSubterm transformTerm(Not not, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		val operand = not.operand.transformTerm(trace,variables).expectLogic
		new LogicSubterm(createSMTNot => [operand = operand.value]) }
	def dispatch protected TransformedSubterm transformTerm(And and, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		transformBinaryLogicOperator2(and.operands,[x|createSMTAnd => [operands += x]],trace,variables) }
	def dispatch protected TransformedSubterm transformTerm(Or or, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		transformBinaryLogicOperator2(or.operands,[x|createSMTOr => [operands += x]],trace,variables) }
	def dispatch protected TransformedSubterm transformTerm(Impl impl, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		transformBinaryLogicOperator1(impl.leftOperand,impl.rightOperand,[l,r|createSMTImpl =>[leftOperand = l rightOperand = r]],trace,variables) }
	def dispatch protected TransformedSubterm transformTerm(Iff iff, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		transformBinaryLogicOperator1(iff.leftOperand,iff.rightOperand,[l,r|createSMTIff => [leftOperand = l rightOperand = r]],trace,variables)}
	
	/**
	 * Logic combinator with two values
	 */
	def protected transformBinaryLogicOperator1(
		Term leftOperand, Term rightOperand,
		Function2<SMTTerm,SMTTerm,SMTTerm> combinator,
		Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		val left = leftOperand.transformTerm(trace,variables).expectLogic
		val right = rightOperand.transformTerm(trace,variables).expectLogic
		return new LogicSubterm(combinator.apply(left.value, right.value))
	}
	/**
	 * Logic combinator with multiple values
	 */
	def protected transformBinaryLogicOperator2(
		Iterable<? extends Term> operands,
		Function1<Iterable<? extends SMTTerm>,SMTTerm> combinator,
		Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		val smtOperands = operands.map[transformTerm(trace,variables).expectLogic.value]
		return new LogicSubterm(combinator.apply(smtOperands))
	}
	
	///////////////////////////////////////////////////////
	// Numeric -> Logic
	///////////////////////////////////////////////////////
	def dispatch protected TransformedSubterm transformTerm(MoreThan moreThan, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		transformNumericComparison(moreThan.leftOperand,moreThan.rightOperand, [l,r|createSMTMT => [ leftOperand = l rightOperand = r ]],trace,variables)}
	def dispatch protected TransformedSubterm transformTerm(LessThan lessThan, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		transformNumericComparison(lessThan.leftOperand,lessThan.rightOperand, [l,r|createSMTLT => [ leftOperand = l rightOperand = r ]],trace,variables)}
	def dispatch protected TransformedSubterm transformTerm(MoreOrEqualThan moreThan, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		transformNumericComparison(moreThan.leftOperand,moreThan.rightOperand, [l,r|createSMTMEQ => [ leftOperand = l rightOperand = r ]],trace,variables)}
	def dispatch protected TransformedSubterm transformTerm(LessOrEqualThan lessThan, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		transformNumericComparison(lessThan.leftOperand,lessThan.rightOperand, [l,r|createSMTLEQ => [ leftOperand = l rightOperand = r ]],trace,variables)}
	
	def protected transformNumericComparison(Term leftOperand, Term rightOperand, Function2<SMTTerm,SMTTerm,SMTTerm> combinator, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables){
		val left = leftOperand.transformTerm(trace,variables).getPossibleValues
		val right = rightOperand.transformTerm(trace,variables).getPossibleValues
		val values = new ArrayList(left.size * right.size)
		for(combination : TransformedSubterm.allCombinations(left,right)) {
			val l = combination.get(0)
			val r = combination.get(1)
			values += LogicSubterm::resolveToLogic(#[l,r],combinator.apply(l.expression, r.expression))
		}
		val res = createSMTOr =>[operands += values]
		return new LogicSubterm(res)
	}
	
	///////////////////////////////////////////////////////
	// Equals and Distinct
	///////////////////////////////////////////////////////
	
	def dispatch protected TransformedSubterm transformTerm(Equals equals, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		val left = equals.leftOperand.transformTerm(trace,variables)
		val rightX = equals.rightOperand.transformTerm(trace,variables)
		if(left instanceof LogicSubterm) {
			val right = rightX.expectLogic
			new LogicSubterm(createSMTEquals => [
				leftOperand = left.value
				rightOperand = right.value ])
		} else if(left instanceof NumericSubterm) {
			val right = rightX.expectNumber
			val leftOperands = left.possibleValues
			val rightOperands = right.possibleValues
			val values = new ArrayList(leftOperands.size * rightOperands.size)
			for(combination : TransformedSubterm.allCombinations(left.possibleValues,right.possibleValues)) {
				val l = combination.get(0)
				val r = combination.get(1)
				values += TransformedSubterm.resolveToLogic(#[l,r],
				createSMTEquals => [
					leftOperand = combination.get(0).expression
					rightOperand = combination.get(1).expression])
			}
			return new LogicSubterm(createSMTOr =>[operands += values])
		} else if(left instanceof ComplexSubterm){
			val right = rightX as ComplexSubterm
			
			val values = new LinkedList
			for(combination : TransformedSubterm.allCombinations(left.possibleValues,right.possibleValues)) {
				val l = combination.get(0)
				val r = combination.get(1)
				if(l.type.complexType == r.type.complexType) {
					values += TransformedSubterm.resolveToLogic(#[l,r],createSMTEquals => [
						leftOperand = l.expression
						rightOperand = r.expression ])
				} /*else dont add*/
			}
			
			if(values.size == 0) {
				return new LogicSubterm(createSMTBoolLiteral => [it.value = false])
			} else if(values.size == 1) {
				return new LogicSubterm(values.head)
			} else {
				return new LogicSubterm(createSMTOr => [operands += values])
			}
		}
	}
	
	def dispatch protected TransformedSubterm transformTerm(Distinct distinct, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		val o = distinct.operands.map[transformTerm(trace,variables)]
		if(o.empty) {
			throw new IllegalArgumentException('''empty distinct''')
		} else if(o.size == 1) {
			// 1 element is always distinct
			new LogicSubterm(createSMTBoolLiteral => [it.value = true])
		} else {
			val head = o.head
			if(head instanceof LogicSubterm) {
				return new LogicSubterm(createSMTDistinct => [
						it.operands += o.map[expectLogic.value]])
			} else if(head instanceof NumericSubterm) {
				val numbers = o.map[expectNumber.possibleValues]
				val distincts = new LinkedList
				for(combination : TransformedSubterm.allCombinations(numbers)) {
					distincts += LogicSubterm::resolveToLogic(combination,createSMTDistinct => [operands += combination.map[it.expression]])
				}
				new LogicSubterm(createSMTOr => [it.operands += distincts])
			} else {
				val objects = o.map[possibleValues]
				val distincts = new LinkedList
				for(combination : TransformedSubterm.allCombinations(objects)) {		
					val Map<SMTType,LinkedList<SubtermOption>> type2Terms = new LinkedHashMap;
					for(param:combination) {
						val type = param.type.complexType
						val value = param
						var LinkedList<SubtermOption> list;
						if(type2Terms.containsKey(type)) {
							list = type2Terms.get(type)
						} else {
							list = new LinkedList
							type2Terms.put(type,list)
						}
						list+=value
					}
					
					val groups = type2Terms.values.map[elementList|
						if(elementList.size == 1) return null
						else return LogicSubterm.resolveToLogic(elementList,createSMTDistinct => [it.operands += elementList.map[expression]])
					].filterNull
					if(groups.empty) {
						// One of the group is trivially satisfied
						return new LogicSubterm(createSMTBoolLiteral => [it.value = true])
					} else {
						val and = createSMTAnd => [operands += groups]
						distincts.add(and)
					}
				}
				if(distincts.size == 1) {
					return new LogicSubterm(distincts.head)
				} else {
					return new LogicSubterm(createSMTOr => [it.operands += distincts])
				}
			}
		}
	}
	
	///////////////////////////////////////////////////////
	// Quantifiers
	///////////////////////////////////////////////////////
	
	def dispatch protected TransformedSubterm transformTerm(Forall forall, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		new LogicSubterm(transformQuantifiedExpression(forall,trace,variables,
			[createSMTForall],
			[q|createSMTAnd=>[operands+=q]],
			[precondition,expression|createSMTImpl=>[leftOperand=precondition rightOperand=expression]]))
	}
	def dispatch protected TransformedSubterm transformTerm(Exists exists, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		new LogicSubterm(transformQuantifiedExpression(exists,trace,variables,
			[createSMTExists],
			[q|createSMTOr=>[operands+=q]],
			[precondition,expression|createSMTAnd=>[operands+=precondition operands+=expression]]))
	}
	
	def protected SMTTerm transformQuantifiedExpression(
		QuantifiedExpression q, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables,
		Function0<SMTQuantifiedExpression> constructor,
		Function1<Iterable<SMTQuantifiedExpression>,SMTTerm> combinator,
		Function2<SMTTerm,SMTTerm,SMTTerm> preconditionCombinator
	) {
		val permutations = unfolder.getPermutations(q.quantifiedVariables.map[it.range.transformTypeReference(trace)])
		val ArrayList<SMTQuantifiedExpression> unfoldedQuantification = new ArrayList(permutations.size)
		
		for(permutation : permutations) {
			val allVariables = new HashMap(variables)
			val newSMTVariables = new ArrayList(q.quantifiedVariables.size)
			val typePrecondition = new ArrayList<SMTTerm>(q.quantifiedVariables.size)
			
			for(variableIndex: 0..<q.quantifiedVariables.size) {
				val logicVariable = q.quantifiedVariables.get(variableIndex)
				val elementInPermutation = permutation.get(variableIndex)
				
				val newSMTVariable = createSMTSortedVariable => [
					name = logicVariable.name.toID
					range = elementInPermutation.type
				]
				allVariables.put(logicVariable, newSMTVariable)
				newSMTVariables+=newSMTVariable
				if(elementInPermutation.constraint != null) {
					typePrecondition += elementInPermutation.constraint.apply(newSMTVariable)
				}
			}
			
			val expressionOfQuantifiedFormula =
				if(typePrecondition.isEmpty)
					q.expression.transformTerm(trace,allVariables).expectLogic.value
				else if(typePrecondition.size == 1)
					preconditionCombinator.apply(
						typePrecondition.head,
						q.expression.transformTerm(trace,allVariables).expectLogic.value)
				else
					preconditionCombinator.apply(
						createSMTAnd => [it.operands += typePrecondition],
						q.expression.transformTerm(trace,allVariables).expectLogic.value)
			
			unfoldedQuantification += constructor.apply => [
				quantifiedVariables += newSMTVariables
				expression = expressionOfQuantifiedFormula
			]
			
//			if(newSMTVariables.exists[it.range == null]) {
//				println(newSMTVariables.filter[it.range == null].map[name])
//			}
		}
		
		if(permutations.size == 1) return unfoldedQuantification.head
		else return combinator.apply(unfoldedQuantification)
	}
	
	///////////////////////////////////////////////////////
	// If - Then - Else
	///////////////////////////////////////////////////////
	def dispatch protected TransformedSubterm transformTerm(IfThenElse ite, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		val condition = ite.condition.transformTerm(trace,variables).expectLogic.value
		val positiveTerm = ite.ifTrue.transformTerm(trace,variables)
		val positives = positiveTerm.possibleValues
		val negativeTerm = ite.ifFalse.transformTerm(trace,variables)
		val negatives = negativeTerm.possibleValues
		// Simple ITE
		if(positives.size == 1 && negatives.size == 1 && positives.head.type == negatives.head.type) {
			val t = positives.head.type
			if(t.isLogic) {
				return new LogicSubterm(createSMTITE => [
					it.condition = condition
					it.^if = positives.head.expression
					it.^else = negatives.head.expression])
			} else if(t.isNumeric) {
				return new NumericSubterm(
					(positives.head.variables + negatives.head.variables).toList,
					(positives.head.preconditions + negatives.head.preconditions).toList,
					createSMTITE => [
					it.condition = condition
					it.^if = positives.head.expression
					it.^else = negatives.head.expression
				])
			} else {
				return new ComplexSubterm(
					(positives.head.variables + negatives.head.variables).toList,
					(positives.head.preconditions + negatives.head.preconditions).toList,
					createSMTITE => [
						it.condition = condition
						it.^if = positives.head.expression
						it.^else = negatives.head.expression],
					t
				)
			}
		// else the ite need to be unfolded
		} else {
			if(positiveTerm instanceof LogicSubterm) {
				throw new AssertionError('''If the subterm has logic value it should be transformed as "Simple ITE""''')
			} else if (positiveTerm instanceof NumericSubterm){
				return new NumericSubterm(unfoldIte(positives, condition, negatives))
			} else {
				return new ComplexSubterm(unfoldIte(positives, condition, negatives))
			}
		}
	}
	
	private def List<SubtermOption> unfoldIte(List<SubtermOption> positives, SMTTerm condition, List<SubtermOption> negatives) {
		(positives.map[
			new SubtermOption(#[it],#[],#[condition],it.expression,it.type)
		] +
		negatives.map[
			new SubtermOption(#[it],#[],#[createSMTNot => [it.operand = condition]],it.expression,it.type)
		]).toList
	}
	
	///////////////////////////////////////////////////////
	// instanceof
	///////////////////////////////////////////////////////
	
	def dispatch protected TransformedSubterm transformTerm(InstanceOf i, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		val value = i.value.transformTerm(trace,variables)
		val range = i.range
		if(range instanceof BoolTypeReference) {
			return new LogicSubterm(createSMTBoolLiteral=>[it.value = (value instanceof LogicSubterm)])
		} else if(range instanceof IntTypeReference || range instanceof RealTypeReference) {
			return new LogicSubterm(createSMTBoolLiteral=>[it.value = (value instanceof NumericSubterm)])
		} else {
			val requestedTypes = this.typeMapper.transformTypeReference((range as ComplexTypeReference).referred,trace)
			val possileValues = value.possibleValues
			val options = new ArrayList(requestedTypes.size)
			for(typeConstraint : requestedTypes) {
				val possibleValue = possileValues.filter[it.type.complexType == (typeConstraint.type as SMTComplexTypeReference).referred].head
				if(possibleValue != null) {
					val x = if(typeConstraint.constraint != null ) {
						if(possibleValue.expression instanceof SMTSymbolicValue && (possibleValue.expression as SMTSymbolicValue).symbolicReference instanceof SMTSortedVariable) {
							val referred = (possibleValue.expression as SMTSymbolicValue).symbolicReference as SMTSortedVariable
							typeConstraint.constraint.apply(referred)
						} else {
							createSMTForall => [
								val v = createSMTSortedVariable => [it.range = EcoreUtil.copy(typeConstraint.type)]
								it.quantifiedVariables += v
								it.expression = createSMTImpl => [
									leftOperand = createSMTEquals => [
										it.leftOperand = possibleValue.expression
										it.rightOperand = createSMTSymbolicValue => [it.symbolicReference = v]
									]
									rightOperand = typeConstraint.constraint.apply(v)
								]
							]
						}
					} else if(typeConstraint.constraint == null) {
						createSMTBoolLiteral => [it.value = true]
					}
					options += LogicSubterm::resolveToLogic(#[possibleValue],x)
				}
			}
			
			if(options.size == 0) {
				return new LogicSubterm(createSMTBoolLiteral=>[it.value = false])
			} else if(options.size == 1) {
				return new LogicSubterm(options.head)
			} else {
				return new LogicSubterm(createSMTOr => [it.operands += options])
			}
		}
		
	}
	
	///////////////////////////////////////////////////////
	// SymbolicReference
	///////////////////////////////////////////////////////
	
	def dispatch protected TransformedSubterm transformTerm(SymbolicValue symbolicValue, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		val referred = symbolicValue.symbolicReference
		val params = symbolicValue.parameterSubstitutions
		return transformSymbolicReference(referred,params,trace,variables)
	}
	
	def dispatch protected TransformedSubterm transformSymbolicReference(Relation referred, List<Term> parameterSubstitution, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		val parameters = parameterSubstitution.map[transformTerm(it,trace,variables)]
		val list = new LinkedList
		for(combination : TransformedSubterm.allCombinations(parameters.map[it.possibleValues])) {
			val descriptor = new Descriptor(combination.map[it.type],referred)
			val targetRelation = descriptor.lookup(trace.relationMap)
			if(targetRelation == null) {
				throw new AssertionError('''target relation should not be null (yet)''')
			
			} else {
				list += TransformedSubterm.resolveToLogic(combination,createSMTSymbolicValue => [
					it.symbolicReference = targetRelation
					it.parameterSubstitutions += combination.map[it.expression]
				])
			}
		}
		
		if(list.size == 1) {
			return new LogicSubterm(list.head)
		} else {
			return new LogicSubterm(createSMTOr => [ operands += list ])
		}
	}
	
	
	def dispatch protected TransformedSubterm transformSymbolicReference(Function referred, List<Term> parameterSubstitution, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		throw new UnsupportedOperationException
	}
	
	def dispatch protected TransformedSubterm transformSymbolicReference(Variable referred, List<Term> parameterSubstitution, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		if(!variables.containsKey(referred)) {
			val container = referred.eContainer
			println("X" + container)
			for(v : variables.keySet) {
				println(v)
				println("in " +v.eContainer)
			}
			return null
		}
		val v = referred.lookup(variables)
		
		val expression = createSMTSymbolicValue => [it.symbolicReference = v]
		if(v.range instanceof SMTBoolTypeReference) {
			return new LogicSubterm(expression)
		} else if(v.range instanceof SMTIntTypeReference || v.range instanceof SMTRealTypeReference) {
			return new NumericSubterm(#[],#[],expression)
		} else {
			return new ComplexSubterm(#[],#[],expression,
				new TypeDescriptor((v.range as SMTComplexTypeReference).referred));
		}
	}
	
	def dispatch protected TransformedSubterm transformSymbolicReference(DefinedElement referred, List<Term> parameterSubstitution, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		this.typeMapper.transformSymbolicReference(referred,trace)
	}
	
	def dispatch protected TransformedSubterm transformSymbolicReference(Void referred, List<Term> parameterSubstitution, Logic2SmtMapperTrace trace, Map<Variable, SMTSortedVariable> variables) {
		throw new NullPointerException('''unfilled symbolic reference!''')
	}
	
	///////////
	
	def transformContainmentV1(SMTInput document, ContainmentHierarchy h, Logic2SmtMapperTrace trace) {
		val extension builder = new LogicProblemBuilder
		val types = h.typesOrderedInHierarchy
		
		val rootRelations = new HashMap<Type,Relation>
		for(type: types) {
			val rootRelation = RelationDeclaration('''Root «type.name»''',type)
			rootRelations.put(type,rootRelation)
			this.transformRelationDeclaration(rootRelation,document,trace)
		}
		val possibleParentRelations = types.toInvertedMap[type|
			h.containmentRelations.filter[it.parameters.get(1) === type]
			//TODO inheritance
		]
		
		// root is true only for at most one element in every root type
		for(root: rootRelations.entrySet) {
			val a1 = Assertion(Forall[
				val r1 = addVar(root.key)
				val r2 = addVar(root.key)
				return (root.value.call(r1) && root.value.call(r2)) => (r1 == r2)
			])
			document.assertions+=this.transformAssertion(a1,trace)
		}
		
		// only one of the root entries is true
		val a2 = Assertion(
			Or(rootRelations.entrySet.map[selected|
				And(rootRelations.entrySet.map[other|
					val isSupertype = selected.key.transitiveClosurePlus[return supertypes].contains(other)
					val type = other.key
					val relation = other.value
					if(selected == other) {
						return Exists[
							val r = addVar(type)
							val x = addVar(LogicInt)
							return relation.call(r)
						]
					}else if(isSupertype) {
						return true.asTerm
					}else {
						return Forall[
							val r = addVar(other.key)
							!other.value.call(r)
						]
					}
				])
			])
		)
		document.assertions+=this.transformAssertion(a2,trace)
		// the root has no parent
		for(root : rootRelations.entrySet) {
			val parentRelations = root.key.lookup(possibleParentRelations)
			val a3 = Assertion(Forall[
				val r = addVar(root.key)
				root.value.call(r) => parentRelations.map[containment |
					Forall[
						val container = addVar(containment.parameters.get(0))
						!containment.call(container,r)
					]
				].And
			])
			document.assertions+=this.transformAssertion(a3,trace)
		}
		// no element has two parents
		for(root : rootRelations.entrySet) {
			val parentRelations = root.key.lookup(possibleParentRelations)
			val a4 = Assertion(Forall[
				val element = addVar(root.key)
				parentRelations.map[selected |
					Forall[
						val container = addVar(selected.parameters.get(0))
						selected.call(container,element) => (
							Forall[
								val other = addVar(selected.parameters.get(0))
								(!selected.call(other,element)) || (other == element)
							] &&
							parentRelations.filter[it !==selected].map[otherContainment |
									Forall[
									val other = addVar(otherContainment.parameters.get(0))
									otherContainment.call(other,element)
								]
							].And)
						
						]
				].And
			])
			document.assertions+=this.transformAssertion(a4,trace)
		}
	
		// an element is not root, then it has a container
		for(root : rootRelations.entrySet) {
			val parentRelations = root.key.lookup(possibleParentRelations)
			val a5 = Assertion(Forall[
				val element = addVar(root.key)
				!root.value.call(element) =>
				parentRelations.map[selected |
					Exists[
						val container = addVar(selected.parameters.get(0))
						selected.call(container,element)
					]
				].Or
			])
			document.assertions+=this.transformAssertion(a5,trace)
		}
//		
//		// no circle in containment
//		for(length : 1..5) {
//			val paths = h.containmentRelations.paths(length)
//			val loopPaths = paths.filter[path|
//				val first = (path.head.parameters.get(0) as ComplexTypeReference).referred
//				val last = (path.last.parameters.get(1) as ComplexTypeReference).referred
//				hasCommonElement(first,last)
//			]
//			for(loopPath : loopPaths) {
//				val variableIndexes = 0..<length
//				val a6 = Assertion(!Exists[e|
//					val variables = new ArrayList
//					for(variableIndex : variableIndexes) {
//						variables += e.addVar('''c«variableIndex»''',(loopPath.get(variableIndex).parameters.get(0) as ComplexTypeReference).referred)
//					}
//					val pathElements = new ArrayList
//					for(variableIndex : variableIndexes) {
//						val from = variableIndex
//						val to = variableIndex+1
//						if(variableIndexes.contains(to)) {
//							pathElements += loopPath.get(variableIndex).call(variables.get(from),variables.get(to))
//						}
//					}
//					pathElements += loopPath.last.call(variables.last,variables.head)
//					
//					pathElements.And
//				])
//				document.assertions+=this.transformAssertion(a6,trace)
//			}
//		}
//	}
//	
//	def private Iterable<List<Relation>> paths(Iterable<Relation> relations, int length) {
//		if(length == 0) {
//			return #[]
//		} else if(length == 1) {
//			return relations.map[#[it]]
//		} else {
//			val previous = paths(relations,length-1)
//			val List<List<Relation>> res = new ArrayList(previous.size*relations.size)
//			for(p:previous) {
//				for(r:relations) {
//					val lastType = (p.last.parameters.get(1) as ComplexTypeReference).referred
//					val firstType = (r.parameters.get(0) as ComplexTypeReference).referred
//					val hasCommonElement = hasCommonElement(lastType, firstType)
//					if(hasCommonElement) {
//						res.add(new ArrayList(p) => [add(r)])
//					}
//				}
//			}
//			return res
//		}
	}
	
	protected def boolean hasCommonElement(Type lastType, Type firstType) {
		val a = lastType.transitiveClosureStar[subtypes]
		val b = firstType.transitiveClosureStar[subtypes]
		return a.exists[b.contains(it)]
	}
	
	def transformContainmentV2(SMTDocument document, ContainmentHierarchy h, Logic2SmtMapperTrace trace) {
		val typeConstraintsOfTypesInContainment = h.typesOrderedInHierarchy
			.map[typeMapper.transformTypeReference(it,trace)].flatten
		val relationsOfTypeConstraints = h.containmentRelations.map[it]
		val typesOfTypeConstraints = typeConstraintsOfTypesInContainment
			.map[(it.type as SMTComplexTypeReference).referred]
			.toSet
		
		// Root declaration
		val rootRelations = new HashMap<SMTType,SMTFunctionDeclaration>
		for(t : typesOfTypeConstraints) {
			val rootRelation = createSMTFunctionDeclaration => [
				it.name = toID('''root «t.name»''')
				it.range = createSMTBoolTypeReference
				it.parameters += createSMTComplexTypeReference => [
					it.referred = t
				]
			]
			document.input.functionDeclarations += rootRelation
			rootRelations.put(t,rootRelation)
		}
		// root is true only for one element in every root type
		for(entry : rootRelations.entrySet) {
			document.input.assertions += createSMTAssertion => [
				it.value = createSMTForall => [
					val r1 = createSMTSortedVariable => [
						it.name = "r1"
						it.range = createSMTComplexTypeReference => [it.referred = entry.key]
					]
					val r2 = createSMTSortedVariable => [
						it.name = "r2"
						it.range = createSMTComplexTypeReference => [it.referred = entry.key]
					]
					
					it.quantifiedVariables += r1
					it.quantifiedVariables += r2
					
					it.expression = createSMTImpl => [
						it.leftOperand = createSMTAnd => [
							it.operands += createSMTSymbolicValue => [
								it.symbolicReference = entry.value
								it.parameterSubstitutions += createSMTSymbolicValue => [it.symbolicReference = r1]
							]
							it.operands += createSMTSymbolicValue => [
								it.symbolicReference = entry.value
								it.parameterSubstitutions += createSMTSymbolicValue => [it.symbolicReference = r2]
							]
						]
						it.rightOperand = createSMTEquals => [
							it.leftOperand = createSMTSymbolicValue => [it.symbolicReference = r1]
							it.rightOperand = createSMTSymbolicValue => [it.symbolicReference = r2]
						]
					]
				]
			]
		}
		// only one of the root entries is true
		document.input.assertions += createSMTAssertion => [
			it.value = createSMTOr =>[or |
				for(selectedCombination : rootRelations.entrySet) {
					or.operands += createSMTAnd => [and |
						for(otherCombination : rootRelations.entrySet) {
							if(selectedCombination == otherCombination) {
								and.operands += createSMTExists => [
									val r = createSMTSortedVariable => [
										it.name = "r"
										it.range = createSMTComplexTypeReference => [it.referred = otherCombination.key]
									]
									it.quantifiedVariables += r
									it.expression = createSMTSymbolicValue => [
										it.symbolicReference = otherCombination.value
										it.parameterSubstitutions += createSMTSymbolicValue => [it.symbolicReference = r]
									]
								]
							} else {
								and.operands += createSMTForall => [
									val r = createSMTSortedVariable => [
										it.name = "r"
										it.range = createSMTComplexTypeReference => [it.referred = otherCombination.key]
									]
									it.quantifiedVariables += r
									it.expression = createSMTNot=> [
										it.operand = createSMTSymbolicValue => [
											it.symbolicReference = otherCombination.value
											it.parameterSubstitutions += createSMTSymbolicValue => [it.symbolicReference = r]
										]
									]
								]
							}
						}
					]
				}
			]
		]
		
		// the root has no parent
		throw new UnsupportedOperationException('''Unfinished version''')
		
		// no element has two parents
	
		// an element is either root or has parent
		
		// no circle in containment
	}
	
	///////////
	
	def cleanDocument(SMTDocument document) {
		val content = document.eAllContents.toList
		for(object:content) {
			for(containmentReference : object.eClass.EAllReferences.filter[containment]) {
				val child = object.eGet(containmentReference) {
					if(child!=null) {
						if(containmentReference.isMany) {
							val list = child as List<EObject>
							for(index : 0..<list.size) {
								val single = list.get(index)
								val newSingle = replaceWith(single)
								if(newSingle!=null) {
									list.set(index,newSingle)
								}
							}
						} else {
							val single = child as EObject
							val newSingle = replaceWith(single)
							if(newSingle!=null) {
								object.eSet(containmentReference,newSingle)
							}
						}
					}
				}
			}
		}
	}
	def private dispatch replaceWith(SMTOr or) {
		if(or.operands.empty) {
			return createSMTBoolLiteral => [it.value = false]
		} else return null
	}
	def private dispatch replaceWith(SMTAnd and) {
		if(and.operands.empty) {
			return createSMTBoolLiteral => [it.value = true]
		} else return null
	}
	def private dispatch replaceWith(EObject object)  {
		null
	}
	
	def orderDefinitions(SMTDocument document) {
		val definitionsInDocument = document.input.functionDefinition
		val List<SMTFunctionDefinition> definitionsInOrder = new ArrayList(definitionsInDocument.size)
		while(!definitionsInDocument.empty) {
			val selection = definitionsInDocument.selectOneUnreferenced
			definitionsInOrder.add(selection)
			definitionsInDocument.remove(selection)
		}
		document.input.functionDefinition.addAll(definitionsInOrder)
	}
	
	def referencedDefinitions(SMTFunctionDefinition definition) {
		definition
			.eAllContents
			.filter(SMTSymbolicValue)
			.map[it.symbolicReference]
			.filter(SMTFunctionDefinition)
			.toList
	}
	
	def selectOneUnreferenced(List<SMTFunctionDefinition> definitions) {
		for(definition : definitions) {
			val references = definition.referencedDefinitions
			if(references.forall[!definitions.contains(it)]) {
				return definition
			}
		}
		throw new AssertionError('''Recursion in function definitions! definitions: «definitions.map[name].toList»''')
	}
}