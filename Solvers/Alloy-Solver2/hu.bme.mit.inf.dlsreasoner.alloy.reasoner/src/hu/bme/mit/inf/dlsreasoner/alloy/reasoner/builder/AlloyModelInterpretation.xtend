package hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder

import edu.mit.csail.sdg.alloy4compiler.ast.ExprVar
import edu.mit.csail.sdg.alloy4compiler.ast.Sig
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
import java.util.SortedSet
import java.util.TreeSet

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class AlloyModelInterpretation implements LogicModelInterpretation{
	
	protected val extension LogiclanguageFactory factory = LogiclanguageFactory.eINSTANCE
	protected val AlloyModelInterpretation_TypeInterpretation typeInterpretator
		
	protected val Logic2AlloyLanguageMapper forwardMapper
	protected val Logic2AlloyLanguageMapperTrace forwardTrace;
	
	private var ExprVar logicLanguage;
	
	private var String logicBooleanTrue;
	private var String logicBooleanFalse;
	private SortedSet<Integer> integerAtoms = new TreeSet
	private SortedSet<String> stringAtoms = new TreeSet
		
	private val Map<String, DefinedElement> alloyAtom2LogicElement = new HashMap
	private val Map<TypeDeclaration, List<DefinedElement>> interpretationOfUndefinedType = new HashMap
	
	private val Map<ConstantDeclaration, Object> constant2Value
	private val Map<FunctionDeclaration, ? extends Map<ParameterSubstitution, Object>> function2Value
	private val Map<RelationDeclaration, ? extends Set<ParameterSubstitution>> relation2Value
	
	//private val int minInt
	//private val int maxInt
	
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
		val unknownAtoms = collectUnknownAndResolveKnownAtoms(solution)
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
		//this.minInt = solution.min
		//this.maxInt = solution.max
		
		//print(trace)
	}
	
	def List<ExprVar> collectUnknownAndResolveKnownAtoms(A4Solution solution) {
		val Iterable<ExprVar> allAtoms = solution.allAtoms
		val List<ExprVar> unknownAtoms = new LinkedList
		
		for(atom: allAtoms) {
			val typeName = getName(atom.type)
			val atomName = atom.name
			println(atom.toString + "  < -  " + typeName)
			if(typeName == forwardTrace.logicLanguage.name) {
				this.logicLanguage = atom
			} else if(typeName == "Int" || typeName == "seq/Int") {
				val value = Integer.parseInt(atomName.join)
				this.integerAtoms.add(value)
			} else if(forwardTrace.boolType != null && typeName == forwardTrace.boolType.name) {
				if(atomName.head == forwardTrace.boolTrue.name) { this.logicBooleanTrue = atom.label }
				else if(atomName.head == forwardTrace.boolFalse.name) { this.logicBooleanFalse = atom.label}
				else throw new UnsupportedOperationException('''Unknown boolean value: «atom»''')
			} else if(typeName == "String") {
				val value = parseString(atomName.join)
				this.stringAtoms.add(value)
			} else {
				unknownAtoms += atom
			}
		}
		val integerSignature = solution.allReachableSigs.filter[it.label=="Int"].head
		for(i : solution.eval(integerSignature)) {
			val value = Integer.parseInt(i.atom(0))
			this.integerAtoms.add(value)
		}
		val stringSignature = solution.allReachableSigs.filter[it.label=="String"].head
		for(i : solution.eval(stringSignature)) {
			val value = parseString(i.atom(0))
			this.stringAtoms.add(value)
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

	// Alloy term -> logic term
	def private atomLabel2Term(String label) {
		if(label.number) return Integer.parseInt(label)
		else if(label == this.logicBooleanTrue) return true
		else if(label == this.logicBooleanFalse) return false
		else if(this.alloyAtom2LogicElement.containsKey(label)) return label.lookup(alloyAtom2LogicElement)
		else if(label.isString) return parseString(label)
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
	def private isString(String label) {
		label.startsWith("\"") && label.endsWith("\"")
	}
	def private parseString(String label) {
		label.substring(1,label.length-1)
	}
	
	override getAllIntegersInStructure() {
		this.integerAtoms
	}
	
	override getAllRealsInStructure() {
		new TreeSet
	}
	
	override getAllStringsInStructure() {
		this.stringAtoms
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