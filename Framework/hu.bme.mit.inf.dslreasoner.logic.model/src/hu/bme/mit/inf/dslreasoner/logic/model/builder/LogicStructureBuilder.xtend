package hu.bme.mit.inf.dslreasoner.logic.model.builder

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.And
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Assertion
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolLiteral
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Constant
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
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IfThenElse
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Iff
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Impl
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IntLiteral
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IntTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LessOrEqualThan
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LessThan
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Minus
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Mod
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.MoreOrEqualThan
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.MoreThan
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Multiply
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Not
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Or
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Plus
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RealLiteral
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicValue
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Term
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TermDescription
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import java.math.BigDecimal
import java.util.ArrayList
import java.util.Collection
import java.util.Collections
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import java.util.Map
import org.eclipse.xtend.lib.annotations.Data

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.InstanceOf
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RealTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.StringTypeReference

@Data class InterpretationValidationResult {
	val List<String> problems;
	val List<Assertion> invalidAssertions;
	def isValid() { return problems.empty && invalidAssertions.empty}
}

class LogicStructureBuilder{
	val protected extension LogiclanguageFactory factory = LogiclanguageFactory.eINSTANCE
	
	def public dispatch Collection<DefinedElement> getElements(LogicModelInterpretation interpretation, TypeDeclaration type) {
		return interpretation.getElements(type)
	}
	def public dispatch Collection<DefinedElement> getElements(LogicModelInterpretation interpretation, TypeDefinition type) {
		return type.elements
	}

	def public Term evalAsTerm(LogicModelInterpretation interpretation, TermDescription term) { term.termDescriptiontoTerm.resolve(interpretation, emptyMap).toTerm }
	def public boolean evalAsBool(LogicModelInterpretation interpretation, TermDescription term) { term.termDescriptiontoTerm.resolve(interpretation, emptyMap) as Boolean}
	def public int evalAsInt(LogicModelInterpretation interpretation, TermDescription term) { term.termDescriptiontoTerm.resolve(interpretation, emptyMap) as Integer }
	def public BigDecimal evalAsReal(LogicModelInterpretation interpretation, TermDescription term) { term.termDescriptiontoTerm.resolve(interpretation, emptyMap) as BigDecimal }
	/**
	 * Evaluate the expression on a solution to an logic element.
	 * @param interpretation The interpretation which the expression is evaluated on.
	 * @param term An expression which results in a logic element.
	 * @return The logic element value of the expression. Returns the element directly, not a symbolic reference!
	 */
	def public DefinedElement evalAsElement(LogicModelInterpretation interpretation, TermDescription term) { term.toTerm.resolve(interpretation,emptyMap) as DefinedElement}
	/**
	 * Checks if the interpretation is a valid solution of the problem by checking the satisfactions of each assertion.
	 * Returns the collection of failed assertions.
	 * @param interpretation The checked interpretation.
	 * @param problem The interpretation is checked on this problem.
	 * @return The collection of failed assertions.
	 */
	def public validateInterpretationOnProblem(LogicModelInterpretation interpretation, LogicProblem problem) {
		val List<String> problems = new LinkedList
		
		// Checking types
		val type2ElementsMap = problem.types.toInvertedMap[interpretation.getElements(it)]
		
		// Checking definition does not changed
		for(type : problem.types.filter(TypeDefinition)) {
			val elements = type2ElementsMap.get(type)
			if(!type.elements.containsAll(elements))
				problems+='''The interpretation of «type.name» does not contains each elements of the problem'''
			if(!elements.containsAll(type.elements))
				problems+='''The interpretation of «type.name» does not contains additional elements not specified in the problem'''
		}
		// Checking the type table
		val allElements = type2ElementsMap.values.flatten.toSet
		for (element : allElements) {
			if(! checkElement(problem, type2ElementsMap, element)) {
				problems += '''«element.name» does not follows the type hierarchy'''
			}
		}
	
		// Checking assertions
		val List<Assertion> invalidAssertions = new LinkedList
		for(assertion : problem.assertions) {
			if(! interpretation.evalAsBool(assertion.value)) {
				invalidAssertions+= assertion
				problems += '''«assertion.name» is violated!'''
			}
		}
		return new InterpretationValidationResult(problems,invalidAssertions)
		//problem.assertions.filter[x | ! interpretation.evalAsBool(x.value)]
	}
	
	private def checkElement(LogicProblem problem, Map<Type, List<DefinedElement>> type2ElementsMap, DefinedElement element) {
		val compatibleDynamicTypes = new LinkedList
		for(possibleDynamicType: problem.types.filter[!it.isIsAbstract]) {
			//println(possibleDynamicType.name)
			val compatibleTypes = possibleDynamicType.transitiveClosureStar[it.supertypes]
			//compatibleTypes.forEach[print(''' + «it.name»''')]
			val incompatibleTypes = problem.types.filter[!compatibleTypes.contains(it)]
			//incompatibleTypes.forEach[print(''' - «it.name»''')]
			if(compatibleTypes.forall[ type2ElementsMap.get(it).contains(element)] && incompatibleTypes.forall[!type2ElementsMap.get(it).contains(element)]) {
				//println("Ok")
				compatibleDynamicTypes += possibleDynamicType
			}
		}
		return compatibleDynamicTypes.size == 1
	}
	
	def protected dispatch Term toTerm(Integer o)  { createIntLiteral=>[value = o] }
	def protected dispatch Term toTerm(BigDecimal o) { createRealLiteral=>[value = o]}
	def protected dispatch Term toTerm(Boolean o) { createBoolLiteral=>[value = o]}
	def protected dispatch Term toTerm(SymbolicDeclaration o) { createSymbolicValue=>[symbolicReference = o]}
	def public Term termDescriptiontoTerm(TermDescription term) {
		if(term instanceof Term) return term
		else if (term instanceof Variable) return createSymbolicValue => [symbolicReference = term]
		else if (term instanceof Constant) return createSymbolicValue=>[symbolicReference = term]
		else if (term instanceof DefinedElement) return createSymbolicValue => [symbolicReference = term]
		else throw new UnsupportedOperationException("Can not create reference for symbolic declaration " + term.class.name)
	}
	/**
	 * Returns if the operation with the numbers in the parameter requires the use of <code>BigDecimal</code>.
	 */
	def private isBigDecimalRequired(Object... numbers) { return numbers.exists[it instanceof BigDecimal || it instanceof RealLiteral] }
	def private dispatch BigDecimal asBigDecimal(IntLiteral i) { i.value.asBigDecimal }
	def private dispatch BigDecimal asBigDecimal(RealLiteral i) { i.value.asBigDecimal }
	def private dispatch BigDecimal asBigDecimal(Integer i) { BigDecimal.valueOf(i) }
	def private dispatch BigDecimal asBigDecimal(BigDecimal i) { i }
	def private dispatch Integer asInteger(Integer i) { i }
	def private dispatch Integer asInteger(BigDecimal i) { i.intValue }
	def private dispatch Integer asInteger(IntLiteral i) { i.value.asInteger }
	
	// Atomic resoulutions
	def protected dispatch Object resolve(IntLiteral literal,  LogicModelInterpretation interpretation, Map<Variable,Object> variableBinding) { return literal.value as Integer }
	def protected dispatch Object resolve(BoolLiteral literal, LogicModelInterpretation interpretation, Map<Variable,Object> variableBinding) { return literal.value }
	def protected dispatch Object resolve(RealLiteral literal, LogicModelInterpretation interpretation, Map<Variable,Object> variableBinding) { return literal.value as BigDecimal }
	
	def protected dispatch Object resolve(Not not, LogicModelInterpretation interpretation, Map<Variable,Object> variableBinding) {
		return ! (not.operand.resolve(interpretation,variableBinding) as Boolean) }
	def protected dispatch Object resolve(And and, LogicModelInterpretation interpretation, Map<Variable,Object> variableBinding) {
		//for(operand : and.operands) {
			//val r = operand.resolve(interpretation,variableBinding) as Boolean
			//println(r)
		//}
		return and.operands.forall[resolve(interpretation,variableBinding) as Boolean] as Boolean }
	def protected dispatch Object resolve(Or or, LogicModelInterpretation interpretation, Map<Variable,Object> variableBinding) {
		//val resolved = or.operands.map[resolve(interpretation,variableBinding) as Boolean]
		//println(resolved)
		return or.operands.exists[resolve(interpretation,variableBinding) as Boolean] }
	def protected dispatch Object resolve(Impl impl, LogicModelInterpretation interpretation, Map<Variable,Object> variableBinding) {
		val left = impl.leftOperand. resolve(interpretation,variableBinding) as Boolean
		val right = impl.rightOperand.resolve(interpretation,variableBinding) as Boolean
		return (! left) || (right) }
	def protected dispatch Object resolve(Iff iff, LogicModelInterpretation interpretation, Map<Variable,Object> variableBinding) {
		return (iff.leftOperand.resolve(interpretation,variableBinding) as Boolean) ==
		       (iff.rightOperand.resolve(interpretation,variableBinding) as Boolean) }
	def protected dispatch Object resolve(IfThenElse ite, LogicModelInterpretation interpretation, Map<Variable,Object> variableBinding) {
		val condition = ite.condition.resolve(interpretation,variableBinding) as Boolean
		if(condition) return ite.ifTrue.resolve(interpretation,variableBinding)
		else return ite.ifFalse.resolve(interpretation,variableBinding)
	}
	def protected dispatch Object resolve(MoreThan moreThan, LogicModelInterpretation interpretation, Map<Variable,Object> variableBinding) {
		val left = moreThan.leftOperand.resolve(interpretation,variableBinding) as Number
		val right = moreThan.rightOperand.resolve(interpretation,variableBinding) as Number
		if(isBigDecimalRequired(left,right)) {
			return left.asBigDecimal.compareTo(right.asBigDecimal) > 0 }
		else { return left.asInteger > right.asInteger } }
	def protected dispatch Object resolve(LessThan lessThan, LogicModelInterpretation interpretation, Map<Variable,Object> variableBinding) {
		val left = lessThan.leftOperand.resolve(interpretation,variableBinding) as Number
		val right = lessThan.rightOperand.resolve(interpretation,variableBinding) as Number
		if(isBigDecimalRequired(left,right)) {
			return left.asBigDecimal.compareTo(right.asBigDecimal) < 0 }
		else { return left.asInteger < right.asInteger } }
	def protected dispatch Object resolve(MoreOrEqualThan moreThan, LogicModelInterpretation interpretation, Map<Variable,Object> variableBinding) {
		val left = moreThan.leftOperand.resolve(interpretation,variableBinding) as Number
		val right = moreThan.rightOperand.resolve(interpretation,variableBinding) as Number
		if(isBigDecimalRequired(left,right)) {
			return left.asBigDecimal.compareTo(right.asBigDecimal) >= 0 }
		else { return left.asInteger >= right.asInteger } }
	def protected dispatch Object resolve(LessOrEqualThan lessThan, LogicModelInterpretation interpretation, Map<Variable,Object> variableBinding) {
		val left = lessThan.leftOperand.resolve(interpretation,variableBinding) as Number
		val right = lessThan.rightOperand.resolve(interpretation,variableBinding) as Number
		if(isBigDecimalRequired(left,right)) return left.asBigDecimal.compareTo(right.asBigDecimal) <= 0 
		else { return left.asInteger <= right.asInteger } }
	

	def protected dispatch Object resolve(Equals equals, LogicModelInterpretation interpretation, Map<Variable,Object> variableBinding) {
		val left = equals.leftOperand.resolve(interpretation,variableBinding)
		val right = equals.rightOperand.resolve(interpretation,variableBinding)
		return compare(left,right)
	}
	def protected dispatch Object resolve(Distinct distinct, LogicModelInterpretation interpretation, Map<Variable,Object> variableBinding) {
		val elements = distinct.operands.map[it.resolve(interpretation,variableBinding)]
		if(elements.size== 0) return true
		else {
			val res = (0..<elements.size).forall[i |
				(0..<i).forall[j|
					! this.compare(elements.get(i),elements.get(j))]]
			//println('''«elements» = «res»''')
			return res
		}
				
		//return elements.forall[x| elements.filter[it!=x].forall[y | x != y ]]
	}
	
	def protected dispatch Object resolve(Plus plus, LogicModelInterpretation interpretation, Map<Variable,Object> variableBinding) {
		val left  = plus.leftOperand.resolve(interpretation,variableBinding) as Number
		val right = plus.rightOperand.resolve(interpretation,variableBinding) as Number
		if(isBigDecimalRequired(left,right)) return left.asBigDecimal.add(right.asBigDecimal)
		else return left.asInteger + right.asInteger
	}
	def protected dispatch Object resolve(Minus minus, LogicModelInterpretation interpretation, Map<Variable,Object> variableBinding) {
		val left  = minus.leftOperand.resolve(interpretation,variableBinding) as Number
		val right = minus.rightOperand.resolve(interpretation,variableBinding) as Number
		if(isBigDecimalRequired(left,right)) return left.asBigDecimal.subtract(right.asBigDecimal)
		else return left.asInteger - right.asInteger
	}
	def protected dispatch Object resolve(Multiply multiply, LogicModelInterpretation interpretation, Map<Variable,Object> variableBinding) {
		val left  = multiply.leftOperand.resolve(interpretation,variableBinding)
		val right = multiply.rightOperand.resolve(interpretation,variableBinding)
		if(isBigDecimalRequired(left,right)) return left.asBigDecimal.multiply(right.asBigDecimal)
		else return left.asInteger * right.asInteger
	}
	def protected dispatch Object resolve(Divison divide, LogicModelInterpretation interpretation, Map<Variable,Object> variableBinding) {
		val left  = divide.leftOperand.resolve(interpretation,variableBinding) as Number
		val right = divide.rightOperand.resolve(interpretation,variableBinding) as Number
		if(isBigDecimalRequired(left,right)) return left.asBigDecimal.divide(right.asBigDecimal)
		return left.asInteger / right.asInteger
	}
	def protected dispatch Object resolve(Mod modulo, LogicModelInterpretation interpretation, Map<Variable,Object> variableBinding) {
		val left  = modulo.leftOperand.resolve(interpretation,variableBinding) as Number
		val right = modulo.rightOperand.resolve(interpretation,variableBinding) as Number
		if(isBigDecimalRequired(left,right)) return left.asBigDecimal.remainder(right.asBigDecimal)
		else return left.asInteger % right.asInteger
	}
	
	def protected dispatch Object resolve(InstanceOf instanceOf, LogicModelInterpretation interpretation, Map<Variable,Object> variableBinding) {
		val typeReference = instanceOf.range
		if(typeReference instanceof ComplexTypeReference) {
			val elements = this.getElements(interpretation,typeReference.referred)
			val element = instanceOf.value.resolve(interpretation,variableBinding)
			if(element instanceof DefinedElement) {
				return elements.contains(element)
			} else throw new AssertionError('''InstanceOf with «element.class.simpleName» object''') 
		} else {
			throw new AssertionError('''InstanceOf with «typeReference.class.simpleName» reference''')
		}
	}
	
	def protected dispatch Object resolve(Exists exists, LogicModelInterpretation interpretation, Map<Variable,Object> variableBinding) {
		executeExists(exists.expression,interpretation,variableBinding,exists.quantifiedVariables) }
	def protected dispatch Object resolve(Forall forall, LogicModelInterpretation interpretation, Map<Variable,Object> variableBinding) {
		executeForall(forall.expression,interpretation,variableBinding,forall.quantifiedVariables) }
	
	def protected dispatch Object resolve(SymbolicValue symbolicValue, LogicModelInterpretation interpretation, Map<Variable,Object> variableBinding) {
		val referenced = symbolicValue.symbolicReference
		return referenced.resolveSymbolicValue(interpretation,symbolicValue.parameterSubstitutions,variableBinding)
	}
	
	protected dispatch def Object resolveSymbolicValue(DefinedElement element, LogicModelInterpretation interpretation, List<? extends Term> parameterSubstitution, Map<Variable,Object> variableBinding) {
		return element
	}
	protected dispatch def Object resolveSymbolicValue(Variable variable, LogicModelInterpretation interpretation, List<? extends Term> parameterSubstitution, Map<Variable,Object> variableBinding) {
		return variable.lookup(variableBinding)
	}
	protected dispatch def Object resolveSymbolicValue(FunctionDeclaration declaration, LogicModelInterpretation interpretation, List<? extends Term> parameterSubstitution, Map<Variable,Object> variableBinding) {
		val internalDefinition = hasDefined(declaration)
		if(internalDefinition === null) {
			interpretation.getInterpretation(declaration,createBinding2(parameterSubstitution, interpretation, variableBinding))
		} else {
			internalDefinition.resolveSymbolicValue(interpretation,parameterSubstitution,variableBinding)
		}
	}
	protected dispatch def Object resolveSymbolicValue(FunctionDefinition definition, LogicModelInterpretation interpretation, List<? extends Term> parameterSubstitution, Map<Variable,Object> variableBinding) {
		return definition.value.resolve(interpretation,createBinding(interpretation,variableBinding,definition.variable,parameterSubstitution))
	}
	protected dispatch def Object resolveSymbolicValue(ConstantDeclaration declaration, LogicModelInterpretation interpretation, List<? extends Term> parameterSubstitution, Map<Variable,Object> variableBinding) {
		val internalDefinition = hasDefined(declaration)
		if(internalDefinition === null) {
			return interpretation.getInterpretation(declaration)
		} else {
			return internalDefinition.resolveSymbolicValue(interpretation,parameterSubstitution,variableBinding)
		}
	}
	protected dispatch def Object resolveSymbolicValue(ConstantDefinition definition, LogicModelInterpretation interpretation, List<? extends Term> parameterSubstitution, Map<Variable,Object> variableBinding) {
		return definition.value.resolve(interpretation,emptyMap)
	}
	protected dispatch def Object resolveSymbolicValue(RelationDeclaration declaration, LogicModelInterpretation interpretation, List<? extends Term> parameterSubstitution, Map<Variable,Object> variableBinding) {
		val internalDefinition = hasDefined(declaration)
		if(internalDefinition === null) {
			interpretation.getInterpretation(declaration,createBinding2(parameterSubstitution, interpretation, variableBinding))
		} else {
			internalDefinition.resolveSymbolicValue(interpretation,parameterSubstitution,variableBinding)
		}
	}
	protected dispatch def Object resolveSymbolicValue(RelationDefinition definition, LogicModelInterpretation interpretation, List<? extends Term> parameterSubstitution, Map<Variable,Object> variableBinding) {
		return definition.value.resolve(interpretation,createBinding(interpretation,variableBinding,definition.variables,parameterSubstitution))
	}
	
	private def hasDefined(RelationDeclaration declaration) {
		val container = declaration.eContainer
		if(container instanceof LogicProblem) {
			val internalDefinitions = container.relations.filter(RelationDefinition).filter[it.defines === declaration]
			if(!internalDefinitions.empty) {
				return internalDefinitions.head
			}
		}
		return null
	}
	private def hasDefined(FunctionDeclaration declaration) {
		val container = declaration.eContainer
		if(container instanceof LogicProblem) {
			val internalDefinitions = container.relations.filter(FunctionDefinition).filter[it.defines === declaration]
			if(!internalDefinitions.empty) {
				return internalDefinitions.head
			}
		}
		return null
	}
	private def hasDefined(ConstantDeclaration declaration) {
		val container = declaration.eContainer
		if(container instanceof LogicProblem) {
			val internalDefinitions = container.relations.filter(ConstantDefinition).filter[it.defines === declaration]
			if(!internalDefinitions.empty) {
				return internalDefinitions.head
			}
		}
		return null
	}
	private def createBinding(LogicModelInterpretation interpretation, Map<Variable,Object> previousVariableBinding, List<Variable> definitionVariables, List<? extends Term> parameterSubstitution){
		val binding = new HashMap<Variable,Object>(previousVariableBinding)
		for(place: 0..<definitionVariables.size) {
			binding.put(
				definitionVariables.get(place),
				parameterSubstitution.get(place).resolve(interpretation,previousVariableBinding))
		}
		return binding
	}
	private def List<Object> createBinding2(List<? extends Term> parameterSubstitution, LogicModelInterpretation interpretation, Map<Variable, Object> variableBinding) {
		parameterSubstitution.map[it.resolve(interpretation,variableBinding)]
	}
	
	def private compare(Object left, Object right) {
		if(left instanceof Number && right instanceof Number) {
			if(isBigDecimalRequired(left as Number,right as Number)) {
				return (left as Number).asBigDecimal.compareTo((right as Number).asBigDecimal) == 0
			} else {
				return (left as Number).asInteger == (right as Number).asInteger
			}
		} else return left.equals(right)
	}

	private dispatch def allObjects(LogicModelInterpretation interpretation, ComplexTypeReference type) {
		return interpretation.getElements(type.referred)
	}
	private dispatch def allObjects(LogicModelInterpretation interpretation, BoolTypeReference type) {
		return #[true,false]
	}
	private dispatch def allObjects(LogicModelInterpretation interpretation, IntTypeReference type) {
		return interpretation.allIntegersInStructure
	}
	private dispatch def allObjects(LogicModelInterpretation interpretation, RealTypeReference type) {
		return interpretation.allRealsInStructure
	}
	private dispatch def allObjects(LogicModelInterpretation interpretation, StringTypeReference type) {
		return interpretation.allStringsInStructure
	}
	private dispatch def allObjects(LogicModelInterpretation interpretation, TypeReference type) {
		throw new UnsupportedOperationException('''Unknown type :«type.class.simpleName»!''')
	}
	
	
	def private boolean executeExists(
		Term expression,
		LogicModelInterpretation interpretation,
		Map<Variable,Object> variableBinding,
		List<Variable> variablesToBind)
	{
		if(variablesToBind.empty) {
			val res = expression.resolve(interpretation,variableBinding) as Boolean
			return res
		}
		else {
			val unfoldedVariable = variablesToBind.head
			val possibleValues = interpretation.allObjects(unfoldedVariable.range)
			return possibleValues.exists[newBinding |
				executeExists(
				expression,
				interpretation,
				new HashMap(variableBinding) => [put(unfoldedVariable,newBinding)],
				variablesToBind.subList(1,variablesToBind.size))]
		}
	}
	
	def private boolean executeForall(
		Term expression,
		LogicModelInterpretation interpretation,
		Map<Variable,Object> variableBinding,
		List<Variable> variablesToBind)
	{
		if(variablesToBind.empty) {
			return expression.resolve(interpretation,variableBinding) as Boolean
		}
		else {
			val unfoldedVariable = variablesToBind.head
			val possibleValues = interpretation.allObjects(unfoldedVariable.range)
			return possibleValues.forall[newBinding |
				executeForall(
				expression,
				interpretation,
				new HashMap(variableBinding) => [put(unfoldedVariable,newBinding)],
				variablesToBind.subList(1,variablesToBind.size))]
		}
	}
}