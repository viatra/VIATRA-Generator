package hu.bme.mit.inf.dslreasoner.logic.model.builder

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.AggregateExpression
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Assertion
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Constant
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Function
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IntTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ProjectedAggregateExpression
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.QuantifiedExpression
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RealTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicValue
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Term
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TermDescription
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDescriptor
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ContainmentHierarchy
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemFactory
import hu.bme.mit.inf.dslreasoner.util.LogicProblemBuilder_AdvancedConstructs
import java.math.BigDecimal
import java.util.ArrayList
import java.util.Collections
import java.util.LinkedList
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.xtext.xbase.lib.Functions.Function1

@Data class FunctionDescription {
	Iterable<TypeReference> parameters
	TypeReference range
}

class LogicProblemBuilderException extends Exception {
	new(String reason) {
		super(reason)
	}
}

class LogicProblemBuilder{
	val protected extension LogiclanguageFactory logicFactiory = LogiclanguageFactory.eINSTANCE
	val protected extension LogicproblemFactory problemFactory = LogicproblemFactory.eINSTANCE
	val protected advancedConstructs = new LogicProblemBuilder_AdvancedConstructs(this)
	
	def createProblem(){	createLogicProblem 	}
	
	// Names
	def protected String canonize(CharSequence name) {
		if(name === null) return ""
		val result = name.toString.split("\\s+");
		if(result.size == 1) {
			val element = result.get(0);
			if(element == "bool" ||
			   element == "int" ||
			   element == "real" ||
			   element == "string") throw new LogicProblemBuilderException('''Reserved keyword "«element»"!''')
			else return result.join(' ')
		}
		else return result.join(' ')
	}
	def protected String generateUniqueName(Iterable<String> previous, Function1<Integer,String> namer) {
		var int i = 0
		var generateNew = false;
		var String finalName;
		do {
			i = i+1;
			val nameCandidate = namer.apply(i)
			finalName = nameCandidate
			generateNew = previous.exists[equals(nameCandidate)]
		}
		while(generateNew)
		return finalName
	}
	
	// Type builders
	def Element(CharSequence elementName) { return createDefinedElement => [x|x.name = elementName.canonize] }
	def Element() { return createDefinedElement }
	def TypeDeclaration(CharSequence name, boolean isAbstract) { TypeDeclaration => [x | x.name = name.canonize x.isAbstract = isAbstract] }
	def TypeDeclaration() { createTypeDeclaration }
	def TypeDefinition(CharSequence name, boolean isAbstract, DefinedElement... elements) { TypeDefinition(name, isAbstract, elements as Iterable<DefinedElement>) }
	def TypeDefinition(CharSequence name, boolean isAbstract, Iterable<DefinedElement> elements) { createTypeDefinition => [x | x.name = name.canonize x.isAbstract = isAbstract x.elements += elements ] }
	
	def Supertype(Type subtype, Type supertype) {
		subtype.supertypes+=supertype
	}
	def SetSupertype(Type subtype, Type supertype, boolean value) {
		if(value) subtype.supertypes+=supertype
		else subtype.subtypes-=supertype
	}
	
	// Type add
	def add(LogicProblem problem, Type type) {
		problem.nameIfAnonymType(type)
		problem.types+=type
		if(type instanceof TypeDefinition) {
			problem.elements+=type.elements
		}
		return type
	}
	def protected dispatch nameIfAnonymType(LogicProblem problem, Type typeDeclaration) {
		if(typeDeclaration.name.nullOrEmpty) 
			typeDeclaration.name = problem.types.map[it.name].generateUniqueName[i | '''type «i.toString»''']
	}
	def protected dispatch nameIfAnonymType(LogicProblem problem, TypeDefinition typeDefinition) {
		if(typeDefinition.name.nullOrEmpty) 
			typeDefinition.name = problem.types.map[it.name].generateUniqueName[i | '''type «i.toString»''']
		for(element : typeDefinition.elements) 
			if(element.name.nullOrEmpty) 
				element.name = typeDefinition.elements.map[it.name].generateUniqueName[i | '''type «i.toString»''']		
	}
	
	def LogicBool() { createBoolTypeReference }
	def LogicInt() { createIntTypeReference }
	def LogicReal() { createRealTypeReference }
	def LogicString() { createStringTypeReference }
	def toTypeReference(TypeDescriptor descriptor) {
		if(descriptor instanceof TypeReference) { return EcoreUtil.copy(descriptor); }
		else if(descriptor instanceof Type) { return createComplexTypeReference => [referred = descriptor]}
		else throw new UnsupportedOperationException("Unsupported type descriptor: " + descriptor.class)
	}
	
	// Variables
	def createVar(CharSequence name, TypeDescriptor range) {
		return createVariable => [it.name = name.canonize it.range = range.toTypeReference]
	}
	
	// Functions
	def FunctionDescription ->(TypeDescriptor parameter, TypeDescriptor range) { return #[parameter] -> range }
	def FunctionDescription ->(Iterable<? extends TypeDescriptor> parameters, TypeDescriptor range) { return new FunctionDescription(parameters.map[toTypeReference], range.toTypeReference); }
	def FunctionDeclaration(CharSequence name, FunctionDescription functionDescription) { FunctionDeclaration(name,functionDescription.range, functionDescription.parameters) }
	def FunctionDeclaration(FunctionDescription functionDescription) { FunctionDeclaration(functionDescription.range, functionDescription.parameters) }
	def FunctionDeclaration(CharSequence name, TypeDescriptor range, TypeDescriptor... parameters) { FunctionDeclaration(name, range, parameters as Iterable<? extends TypeReference>)	}	
	def FunctionDeclaration(TypeDescriptor range, TypeDescriptor... parameters) { FunctionDeclaration(range, parameters as Iterable<? extends TypeReference>)	}
	def FunctionDeclaration(CharSequence name, TypeDescriptor range, Iterable<? extends TypeDescriptor> parameters) { return FunctionDeclaration(range,parameters) => [x|x.name = name.canonize] }
	def FunctionDeclaration(TypeDescriptor range, Iterable<? extends TypeDescriptor> parameters) {
		val function = createFunctionDeclaration
		for(parameter : parameters) function.parameters+=parameter.toTypeReference
		function.range = range.toTypeReference
		return function
	}
	
	def FunctionDefinition(CharSequence name, TypeDescriptor range, Function1<VariableContext, ? extends TermDescription> expression) {
		val context = new VariableContext(this,logicFactiory)
		val definition = expression.apply(context)
		return FunctionDefinition(name,range,context.variables,definition);
	}
	def FunctionDefinition(CharSequence name, TypeDescriptor range, Iterable<Variable> variables, TermDescription definition) {
		return createFunctionDefinition => [
			it.name = name.canonize
			it.parameters += variables.map[it.range.toTypeReference]
			it.variable += variables
			it.range = range.toTypeReference
			it.value = definition.toTerm
		]
	}
	def FunctionDefinition(CharSequence name, TypeDescriptor range, Iterable<TypeDescriptor> parameters, Map<List<Term>,Term> parametersToValue) {
		return FunctionDefinition(name,range,parameters,parametersToValue,null)
	}
	def FunctionDefinition(CharSequence name, TypeDescriptor range, Iterable<TypeDescriptor> parameters, Map<List<Term>,Term> parametersToValue, Term defaultValue) {
		val parameterList = parameters.toList;
		val variableList = (1..parameterList.size).map[index | '''param «index»'''.createVar(parameterList.get(index-1))].toList
		return FunctionDefinition(name,range,variableList,advancedConstructs.FunctionDefinitionBody(variableList,parametersToValue,defaultValue))
	}
	
	// Add function to a problem
	def add(LogicProblem input, Function function) {
		input.nameIfAnonymFunction(function)
		input.checkFunction(function)
		input.functions += function
		return function
	}
	def add(LogicProblem input, FunctionDescription functionDescription) { input.add(FunctionDeclaration(functionDescription)) }
	def protected nameIfAnonymFunction(LogicProblem problem, Function functionDeclaration) {
		if(functionDeclaration.name.nullOrEmpty) {
			functionDeclaration.name = problem.functions.map[it.name].generateUniqueName[i | "function"+i]
		}
	}
	def protected checkFunction(LogicProblem problem, Function function) {
		if(problem.functions.exists(x|x.name == function.name))
			throw new LogicProblemBuilderException('''Function with the following name is already defined: "«function.name»"!''')
		for(ref : function.parameters.filter(typeof(ComplexTypeReference)).map[referred]) {
			if(!problem.types.contains(ref))
				throw new LogicProblemBuilderException('''Type "«ref.name»" is not availabe in the logic problem!''')
		}
		val range = function.range
		if(range instanceof ComplexTypeReference) {
			if(!problem.types.contains(range.referred))
				throw new LogicProblemBuilderException('''Type "«range.referred.name»" is not availabe in the logic problem!''')
		}
	}
	
	// Constants
	def ConstantDeclaration(CharSequence name, TypeDescriptor type) { ConstantDeclaration(type) => [it.name = name.canonize] }
	def ConstantDeclaration(TypeDescriptor type) { createConstantDeclaration => [it.type = type.toTypeReference] }
	
	def ConstantDefinition(CharSequence name, TypeDescriptor type, TermDescription value) {
		createConstantDefinition => [it.name = name.canonize it.type = type.toTypeReference it.value = value.toTerm]
	}
	
	// Add constant to a problem
	def add(LogicProblem problem, Constant constant) {
		problem.nameIfAnonymConstant(constant);
		problem.checkConstant(constant)
		problem.constants += constant
		return constant
	}
	def protected nameIfAnonymConstant(LogicProblem problem, Constant constant) {
		if(constant.name.nullOrEmpty) {
			constant.name = problem.constants.map[it.name].generateUniqueName[i | "constant"+i]
		}
	}
	def protected checkConstant(LogicProblem problem, Constant constant) {
		if(problem.constants.exists(x|x.name == constant.name))
			throw new LogicProblemBuilderException('''Constant with the following name is already defined: "«constant.name»"!''')
		if((constant.type instanceof ComplexTypeReference) && ! (problem.types.contains((constant.type as ComplexTypeReference).referred))) 
				throw new LogicProblemBuilderException('''Type "«(constant.type as ComplexTypeReference).referred.name»" is not availabe in the logic problem!''')
	}
	
	// Relations 	
	def RelationDeclaration(CharSequence name,  TypeDescriptor... parameters) { return RelationDeclaration(name, parameters as Iterable<? extends TypeReference>)	}
	def RelationDeclaration(CharSequence name, Iterable<? extends TypeDescriptor> parameters) { return RelationDeclaration(parameters) => [x|x.name = name.canonize] }
	def RelationDeclaration(TypeDescriptor... parameters) { RelationDeclaration( parameters as Iterable<? extends TypeReference>)	}
	def RelationDeclaration(Iterable<? extends TypeDescriptor> parameters) {
		val relation = createRelationDeclaration
		for(parameter : parameters) {
			relation.parameters+=parameter.toTypeReference
		}
		return relation
	}
	
	def RelationDefinition(CharSequence name, Function1<VariableContext, ? extends TermDescription> expression) {
		val context = new VariableContext(this,logicFactiory);
		val definition = expression.apply(context);
		return RelationDefinition(name,context.variables,definition)
	}
	def RelationDefinition(CharSequence name, Iterable<Variable> variables, TermDescription definition) {
		return createRelationDefinition => [
			it.name = name.canonize
			it.parameters += variables.map[it.range.toTypeReference]
			it.variables += variables
			it.value = definition?.toTerm
		]
	}
	def RelationDefinition(CharSequence name, Iterable<? extends TypeDescriptor> parameters, Iterable<? extends List<? extends TermDescription>> possibleValues) {
		val res = createRelationDefinition => [it.name = name.canonize]
		val variableMap = new ArrayList(parameters.size)
		var index = 0
		for(parameter : parameters) {
			val actualIndex = index
			val newVar = createVariable=>[it.name ='''var «actualIndex»'''.canonize it.range = parameter.toTypeReference]
			variableMap.add(index,newVar)
			res.variables+=newVar
			res.parameters+=newVar.range
			index+=1
		}
		res.value = possibleValues.map[possibleValue |(0..<parameters.size).map[i| variableMap.get(i) == possibleValue.get(i).toTerm].And].Or
		return res	
	}
	
	// Add Relation to a problem
	def add(LogicProblem input, Relation relation) {
		input.nameIfAnonymRelation(relation)
		input.checkRelation(relation)
		input.relations+=relation
		//println('''«relation.name» - [«relation.parameters»]''')
		return relation
	}
	
	def protected nameIfAnonymRelation(LogicProblem problem, Relation relation) {
		if(relation.name.nullOrEmpty) {
			relation.name = problem.relations.map[it.name].generateUniqueName[i | "relation"+i]
		}
	}
	def protected checkRelation(LogicProblem problem, Relation relation) {
		if(problem.relations.exists(x|x.name == relation.name))
			throw new LogicProblemBuilderException('''Relation with the following name is already defined: "«relation.name»"!''')
		for(ref : relation.parameters.filter(typeof(ComplexTypeReference)).map[referred]) {
			if(!problem.types.contains(ref))
				throw new LogicProblemBuilderException('''Type "«ref.name»" is not availabe in the logic problem!''')
		}
		if(relation instanceof RelationDefinition) {
			checkDefinition(relation)
		}
	}
	
	// Assertion
	def Assertion(TermDescription term) {
		val result = term.toTerm
		result.nameAnonymVariables(Collections.EMPTY_LIST)
		createAssertion => [it.value = result]
	}
	def Assertion(CharSequence name, TermDescription term) {
		val result = term.toTerm
		result.nameAnonymVariables(Collections.EMPTY_LIST)
		createAssertion => [it.value = result it.name=name.canonize]
	}
	def add(LogicProblem problem, Assertion assertion) {
		if(assertion.name.nullOrEmpty) {
			val name = problem.assertions.map[name].generateUniqueName["assertion"+it]
			assertion.name=name
		}
		checkAssertion(assertion)
		problem.assertions+=assertion
		return assertion
	}
	
	def add(LogicProblem problem, TermDescription term) {
		problem.add(Assertion(term))
	}
	
		
	def checkAssertion(Assertion assertion) {
		for(value : assertion.eAllContents.filter(SymbolicValue).toIterable) {
			var referred = value.symbolicReference
			if(referred instanceof Variable) {
				if(!value.hasDeclaredVariable(referred)){
					throw new LogicProblemBuilderException('''Variable "«referred.name»" is not availabe in the logic problem!''')
				}
			}
		}
	}
	
	def checkDefinition(EObject definition) {
		/*for(value : definition.eAllContents.filter(SymbolicValue).toIterable) {
			var referred = value.symbolicReference
			if(referred instanceof Variable) {
				if(!value.hasDeclaredVariable(referred)){
					throw new LogicProblemBuilderException('''Variable "«referred.name»" is not availabe in the logic problem!''')
				}
			}
		}*/
	}
	
	// Containment
	def ContainmentHierarchy(
		Iterable<? extends Type> typesInHierarchy,
		Iterable<? extends Function> containmentFunctions,
		Iterable<? extends Relation> containmentRelations,
		Constant rootConstant
	) {
		val result = createContainmentHierarchy => [
			it.typesOrderedInHierarchy += typesInHierarchy
			it.containmentFunctions += containmentFunctions
			it.containmentRelations += containmentRelations
			it.rootConstant = rootConstant
		]
		return result
	}
	def add(LogicProblem problem, ContainmentHierarchy hierarchy) {
		problem.containmentHierarchies+=hierarchy
		return hierarchy
	}
	
	// Terms
	
	private dispatch def boolean hasDeclaredVariable(QuantifiedExpression term, Variable variable) {
		return term.quantifiedVariables.contains(variable) || ((term.eContainer instanceof Term) && (term.eContainer as Term).hasDeclaredVariable(variable))
	}
	private dispatch def boolean hasDeclaredVariable(Term term, Variable variable) {
		return (term.eContainer instanceof Term) && (term.eContainer as Term).hasDeclaredVariable(variable)
	}
	private dispatch def boolean hasDeclaredVariable(RelationDefinition relation, Variable variable) {
		relation.variables.contains(variable)
	}
	private dispatch def boolean hasDeclaredVariable(Void term, Variable variable) {
		return false
	}
	
	def protected void nameAnonymVariables(EObject termSegment, List<String> previousNames) {
		if(termSegment instanceof QuantifiedExpression) {
			val newNames = new LinkedList(previousNames)
			for(variable : termSegment.quantifiedVariables) {
				var String newName
				if(variable.name.nullOrEmpty) {
					newName = newNames.generateUniqueName[i | 
						var x = variable.range.variableAnonymName
						x+="var"+i.toString
						//println(x)
						return x
					]
					variable.name = newName
				}
				else newName = variable.name
				newNames+= newName
			}
			termSegment.expression.nameAnonymVariables(newNames)
		}
		else {
			for(subTerm : termSegment.eContents) {
				subTerm.nameAnonymVariables(previousNames)
			}
		}
	}
	def protected dispatch String variableAnonymName(BoolTypeReference ref)	{ "bool" }
	def protected dispatch String variableAnonymName(IntTypeReference ref)	{ "int" }
	def protected dispatch String variableAnonymName(RealTypeReference ref)	{ "real" }
	def protected dispatch String variableAnonymName(ComplexTypeReference ref) { ref.referred.name.toLowerCase }
	 
	def protected allSubterms(Term term) {
		val content = term.eAllContents
		val result =  new ArrayList<EObject>(content.size+1)
		result+=term
		result+=content.toIterable
		return result;
	}
	
	def Term toTerm(TermDescription term) {
		if(term instanceof Term) return term
		else if (term instanceof Variable) return createSymbolicValue => [symbolicReference = term]
		else if (term instanceof Constant) return term.call()
		else if (term instanceof DefinedElement) return createSymbolicValue => [symbolicReference = term]
		else throw new UnsupportedOperationException("Can not create reference for symbolic declaration " + term.class.name)
	}
	
	def !(TermDescription term) { Not(term) }
	def Not(TermDescription term) { createNot => [operand = term.toTerm] }
	
	def &&(TermDescription a, TermDescription b) { And(a,b) }
	def And(TermDescription... terms) { return And(terms as Iterable<? extends TermDescription>) }	
	def And(Iterable<? extends TermDescription> terms) { createAnd => [operands += terms.map[toTerm]] }
	
	def ||(TermDescription a, TermDescription b) { Or(a,b) } 
	def Or(TermDescription... terms) { Or(terms as Iterable<? extends TermDescription>) }	
	def Or(Iterable<? extends TermDescription> terms) { createOr => [operands += terms.map[toTerm]] }
	
	def =>(TermDescription a, TermDescription b) { Impl(a,b) }
	def Impl(TermDescription a, TermDescription b) { createImpl => [leftOperand = a.toTerm rightOperand = b.toTerm] }
	
	def <=>(TermDescription a, TermDescription b) { Iff(a,b)}
	def Iff(TermDescription a, TermDescription b) { createIff =>[leftOperand=a.toTerm rightOperand=b.toTerm] }
	
	def ITE(TermDescription condition, TermDescription ifTrue, TermDescription ifFalse) {
		createIfThenElse => [it.condition = condition.toTerm it.ifTrue = ifTrue.toTerm it.ifFalse = ifFalse.toTerm]
	}
	
	def >(TermDescription left, TermDescription right) { MoreThan(left,right)}
	def MoreThan(TermDescription left, TermDescription right) { createMoreThan => [leftOperand=left.toTerm rightOperand=right.toTerm] }
	
	def <(TermDescription left, TermDescription right) { LessThan(left,right)}
	def LessThan(TermDescription left, TermDescription right) { createLessThan => [leftOperand=left.toTerm rightOperand=right.toTerm] }
	
	def <=(TermDescription left, TermDescription right) { LessOrEqual(left,right) }
	def LessOrEqual(TermDescription left, TermDescription right) { createLessOrEqualThan => [leftOperand=left.toTerm rightOperand=right.toTerm] }
	
	def >=(TermDescription left, TermDescription right) { MoreOrEqual(left,right) }
	def MoreOrEqual(TermDescription left, TermDescription right) { createMoreOrEqualThan => [leftOperand=left.toTerm rightOperand=right.toTerm] }
	
	def ==(TermDescription left, TermDescription right) {Equals(left,right)}
	def Equals(TermDescription left, TermDescription right) { createEquals => [leftOperand=left.toTerm rightOperand=right.toTerm] }
	
	def !=(TermDescription left, TermDescription right) { Distinct(left,right) }
	def Distinct(TermDescription... terms) { return Distinct(terms as Iterable<? extends TermDescription>) }
	def Distinct(Iterable<? extends TermDescription> terms) { createDistinct => [operands += terms.map[toTerm]] }
	
	def +(TermDescription left, TermDescription right) { Plus(left,right) }
	def Plus(TermDescription left, TermDescription right) { createPlus => [leftOperand=left.toTerm rightOperand=right.toTerm] }
	
	def -(TermDescription left, TermDescription right) { Minus(left,right) }
	def Minus(TermDescription left, TermDescription right) { createMinus => [leftOperand=left.toTerm rightOperand=right.toTerm] }
	
	def *(TermDescription left, TermDescription right) { Multiply(left,right) }
	def Multiply(TermDescription left, TermDescription right) { createMultiply => [leftOperand=left.toTerm rightOperand=right.toTerm] }
	
	def /(TermDescription left, TermDescription right) { Divide(left,right) }
	def Divide(TermDescription left, TermDescription right) { createDivison => [leftOperand = left.toTerm rightOperand = right.toTerm]}
	
	def %(TermDescription left, TermDescription right) { Modulo(left,right) }
	def Modulo(TermDescription left, TermDescription right) { createMod => [leftOperand = left.toTerm rightOperand = right.toTerm]}
	
	def Pow(TermDescription left, TermDescription right) {createPow => [leftOperand = left.toTerm rightOperand = right.toTerm]}
	def asTerm(boolean value) { createBoolLiteral => [x|x.value = value]  }
	def asTerm(int value) { createIntLiteral => [x|x.value = value] }
	def asTerm(double value) { BigDecimal.valueOf(value).asTerm }
	def asTerm(float value) { BigDecimal.valueOf(value).asTerm }
	def asTerm(BigDecimal value) { createRealLiteral => [x|x.value = value]	}
	def asTerm(String value) { createStringLiteral => [x|x.value = value]}
	def InstanceOf(TermDescription term, TypeDescriptor type) {
		createInstanceOf => [
			it.value = term.toTerm
			it.range = type.toTypeReference
		]
	}
	def transitiveClosure(Relation relation, TermDescription source, TermDescription target) {
		createTransitiveClosure => [
			it.relation = relation
			it.leftOperand = source.toTerm
			it.rightOperand = target.toTerm
		]
	}
	
	// QuantifiedExpressions
	
	def Forall(Function1<VariableContext, ? extends TermDescription> expression) {
		val context = new VariableContext(this,logicFactiory)
		val term = expression.apply(context)
		return createForall => [x| x.quantifiedVariables+=context.variables x.expression = term.toTerm]
	}
	def Forall(TermDescription expression, Variable... variables) {
		Forall(variables,expression) }	
	def Forall(Iterable<? extends Variable> variables,TermDescription expression) {
		val forallExpression = createForall
		for(variable : variables) forallExpression.quantifiedVariables += variable
		forallExpression.expression = expression.toTerm
		return forallExpression
	}
	
	def Exists(Function1<VariableContext, ? extends TermDescription> expression) {
		val context = new VariableContext(this,logicFactiory)
		val term = expression.apply(context)
		return createExists => [x| x.quantifiedVariables+=context.variables x.expression = term.toTerm]
	}
	def Exists(TermDescription expression, Variable... variables) {
		Exists(variables,expression) }
	def Exists(Iterable<? extends Variable> variables, TermDescription expression) {
		val existsExpression = createExists
		for(variable : variables) existsExpression.quantifiedVariables += variable
		existsExpression.expression = expression.toTerm
		return existsExpression
	}
	
	// AggregatedExpression
	
	private def <T extends AggregateExpression> configureAggregateExpression(T expression, Relation referred, List<Variable> terms, Variable target) {
		if(terms.size != referred.parameters.size) {
			throw new LogicProblemBuilderException(
			'''The function called has «referred.parameters.size» parameters but it is called with «terms.size»!''')
		} else {
			expression.relation = referred
			expression.resultVariable = target
			for(var i=0; i<referred.parameters.size;i++) {
				val targetRelation = terms.get(i)
				val substitution = createAggregatedParameterSubstitution => [it.variable = targetRelation]
				expression.parameterSubstitution += substitution
			}
			return expression
		}
	}
	private def <T extends ProjectedAggregateExpression> configureProjectedAggregateExpression(T expression, Relation referred, List<Variable> terms, Variable target, int projection) {
		if(projection < 0 || projection >= referred.parameters.size) {
			throw new LogicProblemBuilderException(
			'''The function called has «referred.parameters.size» parameters but it is called with «terms.size»!''')
		} else {
			val res = expression.configureAggregateExpression(referred, terms,target)
			if(res.parameterSubstitution.get(projection).variable !== null) {
				throw new LogicProblemBuilderException(
				'''Projection over set variable!''')
			}
			val projectionType = referred.parameters.get(projection)
			if(!(projectionType instanceof IntTypeReference || projectionType instanceof RealTypeReference)) {
				throw new LogicProblemBuilderException('''Projection over nunnumeric parameter!'''
				)
			}
			res.projectionIndex = projection
			return res
		}
		
	}
	def Count(Relation referred, List<Variable> terms, Variable result) {
		createCount.configureAggregateExpression(referred,terms,result)
	}
	def Sum(Relation referred,  List<Variable> terms, int projection, Variable result) {
		createSum.configureProjectedAggregateExpression(referred,terms,result,projection)
	}
	def Min(Relation referred,  List<Variable> terms, int projection, Variable result) {
		createMin.configureProjectedAggregateExpression(referred,terms,result,projection)
	}
	def Max(Relation referred,  List<Variable> terms, int projection, Variable result) {
		createMax.configureProjectedAggregateExpression(referred,terms,result,projection)
	}
	
	// Function calls
	def call(Function function, TermDescription... substitutions) {
		call(function, substitutions as Iterable<? extends TermDescription>) }
	def call(Function function, Iterable<? extends TermDescription> substitutions) {
		val functionReference = createSymbolicValue
		functionReference.symbolicReference=function
		val List<TermDescription> l= new LinkedList()
		l.addAll(substitutions)
		for(substitution : l)
			functionReference.parameterSubstitutions += substitution.toTerm
		functionReference.checkFunctionCall(function)
		return functionReference
	}
	def private checkFunctionCall(SymbolicValue value, Function referredFunction) {
		if(value.parameterSubstitutions.size != referredFunction.parameters.size)
			throw new LogicProblemBuilderException(
			'''The function called has «referredFunction.parameters.size» parameters but it is called with «value.parameterSubstitutions.size»!''')
	}
	
	//  Relation calls
	def call(Relation relation, TermDescription... substitution) { relation.call(substitution as Iterable<? extends TermDescription>)}
	def call(Relation relation, Iterable<? extends TermDescription> substitution) {
		val relationReference = createSymbolicValue
		if(relation === null) {
			throw new LogicProblemBuilderException('''Call is referring to null!''')
		}
		relationReference.symbolicReference = relation
		for(value : substitution)
			relationReference.parameterSubstitutions += value.toTerm
		relationReference.checkRelationCall(relation)
		return relationReference
	}
	def private checkRelationCall(SymbolicValue value, Relation referredRelation) {
		if(value === null || referredRelation === null) {
			throw new LogicProblemBuilderException('''Call is referring to null!''')
		}
		if(value.parameterSubstitutions.size != referredRelation.parameters.size) {
			throw new LogicProblemBuilderException(
				'''The relation "«referredRelation.name»" called has «referredRelation.parameters.size» parameters but it is called with «value.parameterSubstitutions.size»!''')
		}
	}
	
	// constant evaluation
	def call(Constant constant) {
		val constantReference = createSymbolicValue
		constantReference.symbolicReference = constant
		return constantReference
	}	
}
