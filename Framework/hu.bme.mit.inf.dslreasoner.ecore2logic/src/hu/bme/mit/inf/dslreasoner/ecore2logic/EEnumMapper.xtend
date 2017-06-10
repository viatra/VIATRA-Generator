package hu.bme.mit.inf.dslreasoner.ecore2logic

import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicProblemBuilder
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TermDescription
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import java.util.ArrayList
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.common.util.Enumerator
import org.eclipse.emf.ecore.EEnum

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

interface EEnumMapper {
	def void transformEEnums(Ecore2Logic_Trace trace, LogicProblem problem, Iterable<EEnum> enums,Ecore2LogicConfiguration config)
	def Type TypeofEEnum(Ecore2Logic_Trace trace, EEnum type)
	def TermDescription Literal(Ecore2Logic_Trace trace, Enumerator literal)
}

class EEnumMapper_PredefinedClasses_Trace implements Trace<EEnumMapper_PredefinedClasses>{
	public var Map<EEnum, Type> enums

	public var Map<Enumerator,DefinedElement> literals
}

class EEnumMapper_PredefinedClasses implements EEnumMapper {
	val extension LogicProblemBuilder builder = new LogicProblemBuilder
	
	override transformEEnums(Ecore2Logic_Trace trace, LogicProblem problem, Iterable<EEnum> enums, Ecore2LogicConfiguration config) {
		val enumTrace = new EEnumMapper_PredefinedClasses_Trace
		trace.enumMapperTrace = enumTrace
		enumTrace.enums = new HashMap
		enumTrace.literals = new HashMap
		
		for(enum : enums) {
			val l = new ArrayList<DefinedElement>(enum.ELiterals.size)
			for(literal : enum.ELiterals.map[instance]) {
				val element = Element('''«literal.name» «enum.name»''')
				l+=element
				enumTrace.literals.put(literal,element)
			}
			val type = TypeDefinition('''enum «enum.name»''',false,l)
			problem.add(type)
			enumTrace.enums.put(enum,type)
		}
		
	}
	
	private def asTrace(Trace<? extends EEnumMapper> o) { o as EEnumMapper_PredefinedClasses_Trace }
	
	override TypeofEEnum(Ecore2Logic_Trace trace, EEnum type) {
		trace.enumMapperTrace.asTrace.enums.get(type)
	}
	
	override Literal(Ecore2Logic_Trace trace, Enumerator literal) {
		literal.lookup(trace.enumMapperTrace.asTrace.literals)
	}
}