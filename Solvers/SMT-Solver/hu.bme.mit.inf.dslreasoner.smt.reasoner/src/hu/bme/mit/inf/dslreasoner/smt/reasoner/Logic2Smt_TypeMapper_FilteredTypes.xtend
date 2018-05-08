package hu.bme.mit.inf.dslreasoner.smt.reasoner

import hu.bme.mit.inf.dslreasoner.logic.model.builder.TypeScopes
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.logic.model.patterns.PossibleDynamicType
import hu.bme.mit.inf.dslreasoner.logic.model.patterns.SupertypeStar
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTComplexTypeReference
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDocument
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTEnumLiteral
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTEnumeratedTypeDeclaration
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDeclaration
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDefinition
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTModelResult
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSetTypeDeclaration
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicDeclaration
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTerm
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTType
import hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguageFactory
import java.util.ArrayList
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.emf.EMFScope
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.xbase.lib.Functions.Function0
import org.eclipse.xtext.xbase.lib.Functions.Function1

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class Logic2Smt_TypeMapperTrace_FilteredTypes implements Logic2Smt_TypeMapperTrace{
	public var Map<Type, SMTType> independentClasses = new HashMap
	/**
	 * SMT type for the new objects
	 */
	public var SMTType newObjects
	/**
	 * SMT type for the existing objects
	 */
	public var SMTEnumeratedTypeDeclaration oldObjects
	/**
	 * existing element -> SMT literal map
	 */
	public var Map<DefinedElement, SMTEnumLiteral> elementMap = new HashMap
	
	public var SMTEnumeratedTypeDeclaration oldObjectTypes
	public var Map<Type, SMTEnumLiteral> oldObjectTypeMap = new HashMap
	public var SMTFunctionDefinition oldObjectTypeFunction
	public var Map<Type, SMTFunctionDefinition> oldObjectTypePredicates = new HashMap
	
	public var SMTEnumeratedTypeDeclaration newObjectTypes
	public var Map<Type, SMTEnumLiteral> newObjectTypeMap = new HashMap
	public var SMTFunctionDeclaration newObjectTypeFunction
	public var Map<Type, SMTFunctionDefinition> newObjectTypePredicates = new HashMap
	
	override copy(SMTInput newModel) {
		val a = this
		val b = new Logic2Smt_TypeMapperTrace_FilteredTypes
		
		b.independentClasses = copyMap(a.independentClasses,newModel.typeDeclarations,[name])
		b.independentClasses.values.validate(newModel)
		b.newObjects = newModel.typeDeclarations.copyValue(a.newObjects,[name])
		b.newObjects.validate(newModel)
		b.oldObjects = newModel.typeDeclarations.copyValue(a.oldObjects,[name]) as SMTEnumeratedTypeDeclaration
		b.oldObjects.validate(newModel)
		b.elementMap = a.elementMap.copyMap(
			newModel.typeDeclarations
				.filter(SMTEnumeratedTypeDeclaration)
				.map[it.elements]
				.flatten,
			[name]
		)
		b.elementMap.values.validate(newModel)
		
		b.oldObjectTypes = newModel.typeDeclarations.copyValue(a.newObjects,[name]) as SMTEnumeratedTypeDeclaration
		b.oldObjectTypes.validate(newModel)
		b.oldObjectTypeMap = a.oldObjectTypeMap.copyMap(b.oldObjectTypes.elements,[name])
		b.oldObjectTypeMap.values.validate(newModel)
		b.oldObjectTypeFunction = newModel.functionDefinition.copyValue(a.oldObjectTypeFunction,[name])
		b.oldObjectTypeFunction.validate(newModel)
		b.oldObjectTypePredicates = a.oldObjectTypePredicates.copyMap(newModel.functionDefinition,[name])
		b.oldObjectTypePredicates.values.validate(newModel)
		
		b.newObjectTypes = newModel.typeDeclarations.copyValue(a.newObjectTypes,[name])	as SMTEnumeratedTypeDeclaration
		b.newObjectTypes.validate(newModel)
		b.newObjectTypeMap = a.newObjectTypeMap.copyMap(b.newObjectTypes.elements,[name])
		b.newObjectTypeMap.values.validate(newModel)
		b.newObjectTypeFunction = newModel.functionDeclarations.copyValue(a.newObjectTypeFunction,[name])
		b.newObjectTypeFunction.validate(newModel)
		b.newObjectTypePredicates = a.newObjectTypePredicates.copyMap(newModel.functionDefinition,[name])
		b.newObjectTypePredicates.values.validate(newModel)
		return b
	}
	
	def public static <Type, ValueType> copyValue(Iterable<? extends Type> collection, Type target, Function1<Type,ValueType> extractor) {
		if(target===null) {
			return null
		} else {
			val targetValue = extractor.apply(target)
			val res = collection.filter[extractor.apply(it)==targetValue].head
			return res
		}
	}
	
	def validate(EObject element, EObject other) {
		if(element !== null) {
			val headOfElement = EcoreUtil2.getContainerOfType(element,SMTDocument)
			val expectedHeadOfElement = EcoreUtil2.getContainerOfType(other,SMTDocument)
			if(headOfElement !== expectedHeadOfElement) {
				throw new AssertionError('''
				Element in different resource: «element»
				Expected root: «expectedHeadOfElement»
				Found root: «headOfElement»''')
			}
		}
	}
	def validate(Iterable<? extends EObject> iterable, EObject root) {
		if(iterable !== null)
			for(element : iterable) {
				element.validate(root)
			}
	}
}

class Logic2Smt_TypeMapper_FilteredTypes implements Logic2Smt_TypeMapper {
	val extension SmtLanguageFactory factory = SmtLanguageFactory.eINSTANCE
	val LogiclanguageFactory factory2 = LogiclanguageFactory.eINSTANCE
	
	private def String toID(List<String> names) { names.map[split("\\s+").join("!")].join("!") }
	private def String toID(String name) { name.split("\\s+").join("!")}
	
	override transformTypes(SMTInput document, LogicProblem problem, Logic2SmtMapperTrace trace, TypeScopes scopes) {
		val typeTrace = new Logic2Smt_TypeMapperTrace_FilteredTypes
		trace.typeMapperTrace = typeTrace
		val engine = ViatraQueryEngine.on(new EMFScope(problem))
		
		val independentTypes = problem.types.filter(TypeDefinition).filter[isIndependentType]
		
		val connectedTypes = problem.types.filter[!isIndependentType]
		val connectedElements = problem.elements.filter[!isIndependentElement]
		
		val connectedTypesWithoutDefintypesWithoutDefinedSupertype = connectedTypes.filter(TypeDeclaration).filter[!hasDefinedSupertype].toList
		val hasOldElements = !connectedElements.empty
		val hasNewElements = !connectedTypesWithoutDefintypesWithoutDefinedSupertype.empty
		
		// 0. map the simple types
		this.transformIndependentTypes(independentTypes,trace,document)
		
		// 1. Has old elements => create supertype for it
		if(hasOldElements) {
			this.transformDefinedElements(connectedElements, trace,document)
		}
		// 2. Has new types => create a supertype for it
		if(hasNewElements) {
			this.transformUndefinedElements(scopes,trace,document)
		}
		// 3. Adding type definitions of the types
		// 3.1: Type definition to old elements
		if(hasOldElements) {
			this.transformOldTypes(connectedTypes, connectedElements, trace, document, engine)
		}
		// 3.2: Type definition to new elements
		if(hasNewElements) {
			this.transformNewTypes(connectedTypesWithoutDefintypesWithoutDefinedSupertype,trace,document,engine);
		}
	}
	
	private def isIndependentType(Type t) {
		val res = (t instanceof TypeDefinition) && t.supertypes.empty && t.subtypes.empty
		return res
	}
	private def isIndependentElement(DefinedElement e) {
		val types = e.definedInType
		return types.size == 1 && types.head.isIndependentType
	}
	
	protected def transformIndependentTypes(Iterable<TypeDefinition> types,Logic2SmtMapperTrace trace, SMTInput document) {
		for(type: types) {
			val independentSMTType = createSMTEnumeratedTypeDeclaration => [
				name = toID(#["oldType",type.name])
			]
			trace.typeTrace.independentClasses.put(type,independentSMTType)
			for(element : type.elements) {
				val enumLiteral = createSMTEnumLiteral => [it.name = toID(#["oldElement",element.name])]
				independentSMTType.elements += enumLiteral
				trace.typeTrace.elementMap.put(element,enumLiteral)
			}
			document.typeDeclarations += independentSMTType
		}
	}
	
	protected def transformDefinedElements(Iterable<DefinedElement> oldElements, Logic2SmtMapperTrace trace, SMTInput document) {
		val List<SMTEnumLiteral> literals = new ArrayList(oldElements.size)
		for(element : oldElements) {
			val elementName ='''oldElement «element.name»'''
			val literal = createSMTEnumLiteral => [name = elementName.toID]
			literals += literal
			trace.typeTrace.elementMap.put(element,literal)
		}
		trace.typeTrace.oldObjects = createSMTEnumeratedTypeDeclaration =>
			[name = "oldObjects" it.elements += literals]
		document.typeDeclarations += trace.typeTrace.oldObjects
	}
	
	protected def transformUndefinedElements(TypeScopes scopes, Logic2SmtMapperTrace trace, SMTInput document) {
		var SMTType newObjects
		if(scopes.maxNewElements == -1) {
			newObjects = createSMTSetTypeDeclaration => [
				name = "newObjects"
			]
		} else {
			val newElements = new ArrayList(scopes.maxNewElements)
			for(index : (1..<scopes.maxNewElements+1)) {
				val literal = createSMTEnumLiteral => [
					name = #["newElement",index.toString].toID
				]
				newElements += literal
			}
			newObjects = createSMTEnumeratedTypeDeclaration => [
				name = "newObjects"
				it.elements += newElements
			]
		}
		trace.typeTrace.newObjects = newObjects
		document.typeDeclarations += newObjects
	}
	
	protected def transformOldTypes(Iterable<Type> oldTypes,Iterable<DefinedElement> oldElements, Logic2SmtMapperTrace trace, SMTInput document, ViatraQueryEngine engine) {
		val possibleTypeMatcher = PossibleDynamicType.Matcher.on(engine)
		val supertypeStarMatcher = SupertypeStar.Matcher.on(engine)
//		val possibleTypes = new LinkedList
//		if(hasDefinedElement) possibleTypes += typesWithDefinedSupertype
//		if(hasUndefinedElement) possibleTypes += typesWithoutDefinedSupertype
//		val possibleConcreteTypes = possibleTypes.filter[!it.isIsAbstract]
//		val possibleConcreteTypes = possibleTypeMatcher.allValuesOfdynamic
		
		// 3.1.1. cretate a type for old types
		val possibleConcreteTypeLiterals = new ArrayList()
		for(possibleConcreteType: oldTypes.filter[!isIsAbstract]) {
			val typeName = '''oldType «possibleConcreteType.name»'''
			val literal = createSMTEnumLiteral => [name = typeName.toID]
			trace.typeTrace.oldObjectTypeMap.put(possibleConcreteType,literal)
			possibleConcreteTypeLiterals+=literal
		}
		val oldObjectTypes = createSMTEnumeratedTypeDeclaration => [
			it.name = "oldTypes"
			it.elements += possibleConcreteTypeLiterals
		]
		trace.typeTrace.oldObjectTypes = oldObjectTypes
		document.typeDeclarations += oldObjectTypes
		
		// 3.1.2 for each object, create a constant for its possible dynamic type
		val Map<DefinedElement,SMTFunctionDeclaration> possibleTypesOfElement = new HashMap
		val Map<DefinedElement,Type> onlyPossibleType = new HashMap
		for(object: oldElements) {
			val types = possibleTypeMatcher.getAllValuesOfdynamic(null,object)
			if(types.size == 1) {
				onlyPossibleType.put(object,types.head)
			} else { // including 0 or more than 1
				// create a constant declaration
				val typeOfObjectConstant = createSMTFunctionDeclaration => [
					it.name = toID(#["typeDecisions",toID(object.name)])
					it.range = createSMTComplexTypeReference => [
						it.referred = trace.typeTrace.oldObjectTypes
					]
				]
				document.functionDeclarations += typeOfObjectConstant
				possibleTypesOfElement.put(object,typeOfObjectConstant)
				// add assertions to the constant to select valid values
				document.assertions += createSMTAssertion => [
					val options = types.map[type | createSMTEquals => [
						it.leftOperand = createSMTSymbolicValue => [it.symbolicReference = typeOfObjectConstant]
						it.rightOperand = createSMTSymbolicValue => [it.symbolicReference = type.lookup(trace.typeTrace.oldObjectTypeMap)]
					]]
					it.value = if(options.empty) {
						createSMTBoolLiteral => [it.value = false]
					} else {
						createSMTOr=>[operands += options]
					}
				]
			}
		}
		
		// 3.1.2 create a function: old elements -> old types
		val oldTypeFunction = createSMTFunctionDefinition => [
			it.name = "oldTypeFunction"
			val o = createSMTSortedVariable => [
				it.name = "o"
				it.range= createSMTComplexTypeReference => [it.referred = trace.typeTrace.oldObjects] 
			]
			it.parameters += o
			it.range = createSMTComplexTypeReference => [it.referred = trace.typeTrace.oldObjectTypes]
			it.value = unfoldITE(oldElements,
				[createSMTSymbolicValue => [it.symbolicReference = o]],
				[DefinedElement e | createSMTSymbolicValue => [it.symbolicReference = e.lookup(trace.typeTrace.elementMap)]],
				[DefinedElement e |
					if(onlyPossibleType.containsKey(e)) {
						return createSMTSymbolicValue => [
							symbolicReference = e.lookup(onlyPossibleType).lookup(trace.typeTrace.oldObjectTypeMap) ]
					} else {
						return createSMTSymbolicValue => [
							symbolicReference = e.lookup(possibleTypesOfElement)
						]
					}
				]
			)
		]
		trace.typeTrace.oldObjectTypeFunction = oldTypeFunction
		document.functionDefinition += oldTypeFunction
		
		// 3.1.3 create a predicate for each type: old object -> {true, false}
		for(oldType: oldTypes) {
			val oldTypePredicate = createSMTFunctionDefinition
			oldTypePredicate.name = toID(#["oldTypePredicate",oldType.name.toID])
			val param = createSMTSortedVariable => [
				name = "o"
				range = createSMTComplexTypeReference => [referred = trace.typeTrace.oldObjects]
			]
			oldTypePredicate.parameters += param
			oldTypePredicate.range = createSMTBoolTypeReference
			val values = new LinkedList
			for(concreteSupbtype : supertypeStarMatcher.getAllValuesOfsubtype(oldType).filter[!isIsAbstract]) {
				val typeOfO = createSMTSymbolicValue => [
					it.symbolicReference = oldTypeFunction
					it.parameterSubstitutions += createSMTSymbolicValue => [it.symbolicReference = param]
				]
				val valueOfConcreteSupbtype = createSMTSymbolicValue => [
					it.symbolicReference = concreteSupbtype.lookup(trace.typeTrace.oldObjectTypeMap)
				]
				values += createSMTEquals => [
					it.leftOperand = typeOfO
					it.rightOperand = valueOfConcreteSupbtype
				]
			}
			oldTypePredicate.value = createSMTOr=>[it.operands +=values]
			
			document.functionDefinition += oldTypePredicate
			trace.typeTrace.oldObjectTypePredicates.put(oldType,oldTypePredicate)
		}
	}
	
	protected def transformNewTypes(
		Iterable<TypeDeclaration> typesWithoutDefinedSupertype,
		Logic2SmtMapperTrace trace, SMTInput document, ViatraQueryEngine engine)
	{
		val supertypeStarMatcher = SupertypeStar.Matcher.on(engine)
		val possibleTypes = typesWithoutDefinedSupertype
		val possibleConcreteTypes = possibleTypes.filter[!it.isIsAbstract].toList
		
		// 3.2.1. cretate a type for new types
		val possibleConcreteTypeLiterals = new ArrayList()
		for(possibleConcreteType: possibleConcreteTypes) {
			val typeName = '''newType «possibleConcreteType.name»'''
			val literal = createSMTEnumLiteral => [name = typeName.toID]
			trace.typeTrace.newObjectTypeMap.put(possibleConcreteType,literal)
			possibleConcreteTypeLiterals+=literal
		}
		val newObjectTypes = createSMTEnumeratedTypeDeclaration => [
			it.name = "newTypes"
			it.elements += possibleConcreteTypeLiterals
		]
		trace.typeTrace.newObjectTypes = newObjectTypes
		document.typeDeclarations += newObjectTypes
		
		// 3.2.2 create a function: new elements -> new types
		val newTypeFunction = createSMTFunctionDeclaration => [
			it.name = "newTypeFunction"
			it.parameters += createSMTComplexTypeReference => [it.referred = trace.typeTrace.newObjects] 
			it.range = createSMTComplexTypeReference => [it.referred = trace.typeTrace.newObjectTypes]
		]
		trace.typeTrace.newObjectTypeFunction = newTypeFunction
		document.functionDeclarations += newTypeFunction
		
		// 3.1.3 create a predicate for each type: new type -> {true, false}
		for(newType: possibleTypes) {
			val newTypePredicate = createSMTFunctionDefinition 
			newTypePredicate.name = toID(#["newTypePredicate",newType.name.toID])
			val param = createSMTSortedVariable => [
				name = "o"
				range = createSMTComplexTypeReference => [referred = trace.typeTrace.newObjects]
			]
			newTypePredicate.parameters += param
			newTypePredicate.range = createSMTBoolTypeReference
			val values = new LinkedList
			for(concreteSupbtype : supertypeStarMatcher.getAllValuesOfsubtype(newType).filter[!isIsAbstract]) {
				if(possibleConcreteTypes.contains(concreteSupbtype)) {
					val typeOfO = createSMTSymbolicValue => [
						it.symbolicReference = newTypeFunction
						it.parameterSubstitutions += createSMTSymbolicValue => [it.symbolicReference = param]
					]
					if(!trace.typeTrace.newObjectTypeMap.containsKey(concreteSupbtype)) {
						println("gebasz")
					}
					val valueOfConcreteSupbtype = createSMTSymbolicValue => [
						it.symbolicReference = concreteSupbtype.lookup(trace.typeTrace.newObjectTypeMap)
					]
					values+= createSMTEquals => [
						it.leftOperand = typeOfO
						it.rightOperand = valueOfConcreteSupbtype
					]
				}
			}
			newTypePredicate.value = createSMTOr=>[it.operands +=values]
			
			document.functionDefinition += newTypePredicate
			trace.typeTrace.newObjectTypePredicates.put(newType,newTypePredicate)
		}
	}
	
	private def Logic2Smt_TypeMapperTrace_FilteredTypes getTypeTrace(Logic2SmtMapperTrace trace) {
		val typeTrace = trace.typeMapperTrace
		if(typeTrace instanceof Logic2Smt_TypeMapperTrace_FilteredTypes) {
			return typeTrace
		} else {
			throw new IllegalArgumentException('''Unknown trace type: «typeTrace.class.name»''')
		}
	}
	
	private def boolean hasDefinedSupertype(Type type) {
		if(type instanceof TypeDefinition) {
			return true
		} else {
			if(type.supertypes.empty) return false
			else return type.supertypes.exists[it.hasDefinedSupertype]
		}
	}
	
	def private <T> SMTTerm unfoldITE(Iterable<T> options, Function0<SMTTerm> input, Function1<T,SMTTerm> conditionOfOption, Function1<T,SMTTerm> outputForOption) {
		if(options.size == 1) {
			return outputForOption.apply(options.head)
		} else {
			return createSMTITE => [
				it.condition = createSMTEquals => [
					leftOperand = input.apply
					rightOperand = conditionOfOption.apply(options.head)
				]
				it.^if = outputForOption.apply(options.head)
				it.^else = unfoldITE(options.tail,input,conditionOfOption,outputForOption)
			]
		}
	}
	
	override transformSymbolicReference(DefinedElement referred,Logic2SmtMapperTrace trace) {
		val x = referred.lookup(trace.typeTrace.elementMap)
		new ComplexSubterm(#[],#[],
			createSMTSymbolicValue => [it.symbolicReference = x],
			new TypeDescriptor(x.eContainer as SMTEnumeratedTypeDeclaration)
		)
	}
	
	override transformTypeReference(Type type, Logic2SmtMapperTrace trace) {
		val list = new ArrayList
		
		if(trace.typeTrace.oldObjectTypePredicates.containsKey(type)) {
			list += new TypeConstraint(
				createSMTComplexTypeReference => [it.referred = trace.typeTrace.oldObjects],
				[x|createSMTSymbolicValue => [
					it.symbolicReference = trace.typeTrace.oldObjectTypePredicates.get(type)
					it.parameterSubstitutions += createSMTSymbolicValue => [it.symbolicReference = x]]]
			)
		} 
		if(trace.typeTrace.newObjectTypePredicates.containsKey(type)) {
			list += new TypeConstraint(
				createSMTComplexTypeReference => [it.referred = trace.typeTrace.newObjects],
				[x|createSMTSymbolicValue => [
					it.symbolicReference = trace.typeTrace.newObjectTypePredicates.get(type)
					it.parameterSubstitutions += createSMTSymbolicValue => [it.symbolicReference = x]]]
			)
		}
		if(trace.typeTrace.independentClasses.containsKey(type)) {
			list += new TypeConstraint(
				createSMTComplexTypeReference => [it.referred = type.lookup(trace.typeTrace.independentClasses)],
				null
			)
		}
		
		if(list.empty) throw new AssertionError('''Typereference to type is «type.name» empty''')
		if(list.exists[it.type === null]){
			throw new AssertionError('''Typereference to null!''')
		}
		return list
	}
	
	override getTypeInterpretation(LogicProblem problem, SMTDocument document, SmtModelInterpretation interpretation, Logic2SmtMapperTrace trace) {
		val model = document.output.getModelResult as SMTModelResult
		val newTypeDec = trace.typeTrace.newObjects
		var List<ValueType> newElements = null
		
		if(newTypeDec instanceof SMTSetTypeDeclaration) {
			val newElementType = model.typeDefinitions.filter[
				(it.type as SMTComplexTypeReference).referred == newTypeDec
			].head
			newElements = newElementType.elements.map[new ValueType(new TypeDescriptor(newTypeDec),it.symbolicReference)]
		} else if(newTypeDec instanceof SMTEnumeratedTypeDeclaration) {
			newElements = newTypeDec.elements.map[new ValueType(new TypeDescriptor(newTypeDec),it)]
		} else throw new IllegalArgumentException('''Unknown type : «newTypeDec.class.name»''')
		
		val Map<DefinedElement, ValueType> logic2smt = new HashMap<DefinedElement,ValueType>
		val Map<SMTSymbolicDeclaration, DefinedElement> smt2logic = new HashMap<SMTSymbolicDeclaration,DefinedElement>
		
		var index = 1;
		for(newElement : newElements) {
			val n = '''new «index++»'''
			val logic = factory2.createDefinedElement => [it.name = n]
			logic2smt.put(logic,newElement)
			smt2logic.put(newElement.value as SMTSymbolicDeclaration,logic)
		}
		for(oldElement : problem.elements) {
			val declaration = trace.typeTrace.oldObjectTypeMap.get(oldElement)
			logic2smt.put(oldElement,new ValueType(new TypeDescriptor(trace.typeTrace.oldObjects),declaration))
			smt2logic.put(declaration,oldElement)
		}
		
		val engine = ViatraQueryEngine.on(new EMFScope(problem))
		val supertypeStarMatcher = SupertypeStar.Matcher.on(engine)
		
		val Map<Type,List<DefinedElement>> type2Elements = new HashMap
		for(key : problem.types) {
			type2Elements.put(key,new LinkedList<DefinedElement>)
		}
		
		if(trace.typeTrace.independentClasses !== null) {
			for(type : trace.typeTrace.independentClasses.keySet) {
				if(type instanceof TypeDefinition) {
					type.lookup(type2Elements).addAll(type.elements)
				} else {
					throw new AssertionError('''Independent classes are type definitions, but got: "«type»"''')
				}
			}
		}
		
		if(trace.typeTrace.oldObjectTypeFunction !== null) {
			val inverseOldTypeMap = trace.typeTrace.oldObjectTypeMap.bijectiveInverse
			for(oldElement: trace.typeTrace.elementMap.values) {
				val type = interpretation.queryEngine.resolveFunctionDefinition(
					trace.typeTrace.oldObjectTypeFunction,#[oldElement]) as SMTEnumLiteral
				val dynamicType = type.lookup(inverseOldTypeMap)
				val supertypes = supertypeStarMatcher.getAllValuesOfsupertype(dynamicType)
				for(superType : supertypes) {
					superType.lookup(type2Elements) += oldElement.lookup(smt2logic)
				}
			}
		}
		
		if(trace.typeTrace.newObjectTypeFunction !== null) {
			val inverseNewTypeMap = trace.typeTrace.newObjectTypeMap.bijectiveInverse
			for(newElement: newElements.map[value as SMTSymbolicDeclaration]) {
				val type = interpretation.queryEngine.resolveFunctionDeclaration(
					trace.typeTrace.newObjectTypeFunction,#[newElement]) as SMTEnumLiteral
				val dynamicType = type.lookup(inverseNewTypeMap)
				val supertypes = supertypeStarMatcher.getAllValuesOfsupertype(dynamicType)
				for(superType : supertypes) {
					superType.lookup(type2Elements) += newElement.lookup(smt2logic)
				}
			}
		}
		
		return new Logic2SMT_TypeMapperInterpretation(type2Elements,logic2smt,smt2logic)
	}
}