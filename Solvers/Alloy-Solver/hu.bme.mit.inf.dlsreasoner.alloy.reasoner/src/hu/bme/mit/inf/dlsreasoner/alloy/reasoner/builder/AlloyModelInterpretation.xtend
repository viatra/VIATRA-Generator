package hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder

import edu.mit.csail.sdg.alloy4compiler.ast.ExprVar
import edu.mit.csail.sdg.alloy4compiler.ast.Sig.Field
import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicModelInterpretation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition
import java.util.Arrays
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import java.util.Map
import java.util.Set

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import edu.mit.csail.sdg.alloy4compiler.ast.Sig
import java.util.ArrayList

interface AlloyModelInterpretation_TypeInterpretation {
	def void resolveUnknownAtoms(
		Iterable<ExprVar> objectAtoms, 
		A4Solution solution,
		Logic2AlloyLanguageMapperTrace forwardTrace,
		Map<String, Sig> name2AlloySig,
		Map<String, Field> name2AlloyField,
		Map<String,DefinedElement> expression2DefinedElement,
		Map<TypeDeclaration, List<DefinedElement>> interpretationOfUndefinedType)
}

class AlloyModelInterpretation_TypeInterpretation_FilteredTypes implements AlloyModelInterpretation_TypeInterpretation{
	protected val extension LogiclanguageFactory factory = LogiclanguageFactory.eINSTANCE
	
	override resolveUnknownAtoms(
		Iterable<ExprVar> objectAtoms, 
		A4Solution solution,
		Logic2AlloyLanguageMapperTrace forwardTrace,
		Map<String, Sig> name2AlloySig,
		Map<String, Field> name2AlloyField,
		Map<String,DefinedElement> expression2DefinedElement,
		Map<TypeDeclaration, List<DefinedElement>> interpretationOfUndefinedType)
	{
		/*val Map<String,DefinedElement> expression2DefinedElement = new HashMap()
		val Map<TypeDeclaration, List<DefinedElement>> interpretationOfUndefinedType = new HashMap;*/
		
		val typeTrace = forwardTrace.typeMapperTrace as Logic2AlloyLanguageMapper_TypeMapperTrace_FilteredTypes
		
		// 1. Evaluate the defined elements
		for(definedElementMappingEntry : typeTrace.definedElement2Declaration.entrySet) {
			val name = definedElementMappingEntry.value.name
			val matchingSig = '''this/«name»'''.toString.lookup(name2AlloySig)
			val elementsOfSingletonSignature = solution.eval(matchingSig)
			if(elementsOfSingletonSignature.size != 1) {
				throw new IllegalArgumentException('''Defined element is unambigous: "«name»", possible values: «elementsOfSingletonSignature»!''')
			} else {
				val expressionOfDefinedElement	= elementsOfSingletonSignature.head.atom(0)// as ExprVar
				expression2DefinedElement.put(expressionOfDefinedElement, definedElementMappingEntry.key)
			}
		}
		
		// 2. evaluate the signatures and create new elements if necessary
		for(type2SingatureEntry : typeTrace.type2ALSType.entrySet) {
			val type = type2SingatureEntry.key
			if(type instanceof TypeDeclaration) {
				val name = type2SingatureEntry.value.name
				val matchingSig = '''this/«name»'''.toString.lookup(name2AlloySig)
				val elementsOfSignature = solution.eval(matchingSig)
				val elementList = new ArrayList(elementsOfSignature.size)
				var newVariableIndex = 1;
				for(elementOfSignature : elementsOfSignature) {
					val expressionOfDefinedElement	= elementOfSignature.atom(0)
					if(expression2DefinedElement.containsKey(expressionOfDefinedElement)) {
						elementList += expressionOfDefinedElement.lookup(expression2DefinedElement)
					} else {
						val newElementName = '''newObject «newVariableIndex.toString»'''
						val newRepresentation = createDefinedElement => [
							it.name = newElementName
						]
						elementList += newRepresentation
						expression2DefinedElement.put(expressionOfDefinedElement,newRepresentation)
					}
				}
				interpretationOfUndefinedType.put(type,elementList)
			}
		}
	}
}
/*
class AlloyModelInterpretation_TypeInterpretation_Horizontal implements AlloyModelInterpretation_TypeInterpretation{
	protected val extension LogiclanguageFactory factory = LogiclanguageFactory.eINSTANCE
	
	override resolveUnknownAtoms(Iterable<ExprVar> objectAtoms, Logic2AlloyLanguageMapperTrace forwardTrace, Map<String,DefinedElement> alloyAtom2LogicElement) {
		val Map<TypeDeclaration, List<DefinedElement>> interpretationOfUndefinedType = new HashMap;
		
		//TMP sig maps to identify alloy signatures by their names
		val Map<String,Type> sigName2LogicType =
			forwardTrace.type2ALSType.keySet.toMap[x|forwardTrace.type2ALSType.get(x).name]
		//val Map<String,DefinedElement> elementNameNamel2DefinedElement = 
		//	forwardTrace.definedElement2Declaration.keySet.toMap[x|forwardTrace.definedElement2Declaration.get(x).name]
			
		// Fill the interpretation map with empty lists
		forwardTrace.type2ALSType.keySet.filter(TypeDeclaration).forEach[x|interpretationOfUndefinedType.put(x,new LinkedList)]
		
		// exporing individuals
		for(atom: objectAtoms) {
			val typeName = getName(atom.type)
			//val atomName = atom.name
			
			if(sigName2LogicType.containsKey(typeName)) {
				val type = sigName2LogicType.get(typeName)
				val elementsOfType = interpretationOfUndefinedType.get(type)
				val element = createDefinedElement => [
					it.name += type.name
					it.name += (elementsOfType.size+1).toString
				]
				alloyAtom2LogicElement.put(atom.label,element)
				elementsOfType+=element
			}
			else throw new UnsupportedOperationException('''Unknown atom: «atom»''')
		}
		
		return interpretationOfUndefinedType
	}
	
	def private getName(edu.mit.csail.sdg.alloy4compiler.ast.Type type) {
		val name = type.toString
		if(name.startsWith("{this/") && name.endsWith("}")) {
			return type.toString.replaceFirst("\\{this\\/","").replace("}","")
		}
		else throw new IllegalArgumentException('''Unknown type format: "«name»"!''')
	}
	//def private getName(ExprVar atom) { atom.toString.split("\\$") }
}*/

class AlloyModelInterpretation implements LogicModelInterpretation{
	
	protected val extension LogiclanguageFactory factory = LogiclanguageFactory.eINSTANCE
	protected val AlloyModelInterpretation_TypeInterpretation typeInterpretator
		
	protected val Logic2AlloyLanguageMapper forwardMapper
	protected val Logic2AlloyLanguageMapperTrace forwardTrace;
	
	private var ExprVar logicLanguage;
	
	private var String logicBooleanTrue;
	private var String logicBooleanFalse;
		
	private val Map<String, DefinedElement> alloyAtom2LogicElement = new HashMap
	private val Map<TypeDeclaration, List<DefinedElement>> interpretationOfUndefinedType = new HashMap
	
	private val Map<ConstantDeclaration, Object> constant2Value
	private val Map<FunctionDeclaration, ? extends Map<ParameterSubstitution, Object>> function2Value
	private val Map<RelationDeclaration, ? extends Set<ParameterSubstitution>> relation2Value
	
	private val int minInt
	private val int maxInt
	
	public new (AlloyModelInterpretation_TypeInterpretation typeInterpretator, A4Solution solution, Logic2AlloyLanguageMapper forwardMapper, Logic2AlloyLanguageMapperTrace trace) {
		this.typeInterpretator = typeInterpretator
		this.forwardMapper = forwardMapper
		this.forwardTrace = trace
		
		// Maps to trace language elements to the parsed problem.
		val Map<String, Sig> name2AlloySig = new HashMap
		val Map<String, Field> name2AlloyField = new HashMap
		// exploring signatures
		for(sig:solution.allReachableSigs) {
			name2AlloySig.put(sig.label,sig)
			for(field : sig.fields) {
				name2AlloyField.put(field.label,field)
			}
		}
		
		val unknownAtoms = collectUnknownAndResolveKnownAtoms(solution.allAtoms)
		this.typeInterpretator.resolveUnknownAtoms(
			unknownAtoms,
			solution,
			forwardTrace,
			name2AlloySig,
			name2AlloyField,
			alloyAtom2LogicElement,
			interpretationOfUndefinedType)
		
		// eval consants
		constant2Value = forwardTrace.constantDeclaration2LanguageField.mapValues[
			solution.eval(it.name.lookup(name2AlloyField)).head.atom(1).atomLabel2Term
		]
		// eval functions
		val hostedfunction2Value = forwardTrace.functionDeclaration2HostedField.mapValues[ function |
			newHashMap(
				solution.eval(function.name.lookup(name2AlloyField))
					.map[t | new ParameterSubstitution(#[t.atom(0).atomLabel2Term]) -> t.atom(1).atomLabel2Term])]
		
		val globalfunction2Value = forwardTrace.functionDeclaration2LanguageField.keySet.toInvertedMap[ function |
			val alsFunction = function.lookup(forwardTrace.functionDeclaration2LanguageField)
			val paramIndexes = 1..(function.parameters.size)
			return newHashMap(
				solution.eval(alsFunction.name.lookup(name2AlloyField)).map[t |
					new ParameterSubstitution(paramIndexes.map[t.atom(it).atomLabel2Term])
						->
					t.atom(function.parameters.size + 1).atomLabel2Term
				])]
		this.function2Value = Union(hostedfunction2Value,globalfunction2Value)
		// eval relations
		val hostedRelation2Value = forwardTrace.relationDeclaration2Field.mapValues[ relation |
			solution.eval(relation.name.lookup(name2AlloyField)).map[ t |
				new ParameterSubstitution(#[t.atom(0).atomLabel2Term,t.atom(1).atomLabel2Term])].toSet]
		val globalRelation2Value = forwardTrace.relationDeclaration2Global.mapValues[ relation |
			solution.eval(relation.name.lookup(name2AlloyField)).map[ t |
				new ParameterSubstitution((1..<t.arity).map[int a|t.atom(a).atomLabel2Term])].toSet]
		this.relation2Value = Union(hostedRelation2Value,globalRelation2Value)
		
		//Int limits
		this.minInt = solution.min
		this.maxInt = solution.max
		
		//print(trace)
	}
	
	def List<ExprVar> collectUnknownAndResolveKnownAtoms(Iterable<ExprVar> allAtoms) {
		val List<ExprVar> unknownAtoms = new LinkedList
		
		for(atom: allAtoms) {
			val typeName = getName(atom.type)
			val atomName = atom.name
			//println(atom.toString + "  < -  " + typeName)
			if(typeName == forwardTrace.logicLanguage.name) {
				this.logicLanguage = atom
			} else if(typeName == "Int" || typeName == "seq/Int") {
				// do nothing, integers will be parsed from the string
			} else if(forwardTrace.boolType != null && typeName == forwardTrace.boolType.name) {
				if(atomName.head == forwardTrace.boolTrue.name) { this.logicBooleanTrue = atom.label }
				else if(atomName.head == forwardTrace.boolFalse.name) { this.logicBooleanFalse = atom.label}
				else throw new UnsupportedOperationException('''Unknown boolean value: «atom»''')
			}
			else unknownAtoms += atom
		}
		
		return unknownAtoms
	}
	
	def private getName(edu.mit.csail.sdg.alloy4compiler.ast.Type type) {
		val name = type.toString
		if(name.startsWith("{this/") && name.endsWith("}")) {
			return type.toString.replaceFirst("\\{this\\/","").replace("}","")
		}
		else throw new IllegalArgumentException('''Unknown type format: "«name»"!''')
	}
	def private getName(ExprVar atom) { atom.toString.split("\\$") }
	
	def print(Logic2AlloyLanguageMapperTrace trace) {
		println('''Undefined-----''')
		interpretationOfUndefinedType.forEach[k,v|println('''«k.name» -> «v.map[name]»''')]
		//println('''Defined-----''')
		//trace.type2ALSType.keySet.filter(TypeDefinition).forEach[println('''«it.name» -> «it.elements.map[name.join]»''')]
		
		println('''Constants-----''')
		constant2Value.forEach[k, v|println('''«k.name» : «v»''')]
		println('''Functions-----''')
		function2Value.forEach[f,m|m.forEach[k,v| println('''«f.name» : «k» |-> «v»''')]]
		println('''Relations-----''')
		relation2Value.forEach[r,s|s.forEach[t | println('''«r.name»: («t»)''')]]
	}

	override getElements(Type type) { getElementsDispatch(type) }
	def private dispatch getElementsDispatch(TypeDeclaration declaration) { return declaration.lookup(this.interpretationOfUndefinedType) }
	def private dispatch getElementsDispatch(TypeDefinition declaration) { return declaration.elements }
	
	override getInterpretation(FunctionDeclaration function, Object[] parameterSubstitution) {
		val transformedParams = new ParameterSubstitution(parameterSubstitution)
		return transformedParams.lookup(
			function.lookup(this.function2Value)
		)
	}
	
	override getInterpretation(RelationDeclaration relation, Object[] parameterSubstitution) {
		relation.lookup(this.relation2Value).contains(new ParameterSubstitution(parameterSubstitution))
	}
	
	override getInterpretation(ConstantDeclaration constant) {
		constant.lookup(this.constant2Value)
	}
	
	override getMinimalInteger() { this.minInt }
	override getMaximalInteger() { this.maxInt }
	
	// Alloy term -> logic term
	def private atomLabel2Term(String label) {
		if(label.number) return Integer.parseInt(label)
		else if(label == this.logicBooleanTrue) return true
		else if(label == this.logicBooleanFalse) return false
		else if(this.alloyAtom2LogicElement.containsKey(label)) return label.lookup(alloyAtom2LogicElement)
		else throw new IllegalArgumentException('''Unknown atom label: "«label»"!''')
	}
	def private isNumber(String s) {
		try{
			Integer.parseInt(s)
			return true
		}catch(NumberFormatException e) {
			return false
		}
	}
}

/**
 * Helper class for efficiently matching parameter substitutions for functions and relations.
 */
class ParameterSubstitution{
	val Object[] data;
	
	new(Object[] data) { this.data = data }
	
	override equals(Object obj) {
		if(obj === this) return true
		else if(obj == null) return false
		if(obj instanceof ParameterSubstitution) {
			return Arrays.equals(this.data,obj.data)
		}
		return false
	}
	
	override hashCode() {
		Arrays.hashCode(data)
	}
}