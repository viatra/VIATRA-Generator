package hu.bme.mit.inf.dslreasoner.ecore2logic

import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicProblemBuilder
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import java.util.Map
import org.eclipse.emf.ecore.EClass
import java.util.HashMap

interface EClassMapper {
	def void transformEClasses(Ecore2Logic_Trace trace, LogicProblem problem, Iterable<EClass> classes, int numberOfObjects, EcoreMetamodelDescriptor metamodelDescriptor)
	def Iterable<EClass> allClassesInScope(Ecore2Logic_Trace trace) 
	def Type TypeofEClass(Ecore2Logic_Trace trace, EClass type)
}

class EClassMapper_AllElementAsObject_Trace implements Trace<EClassMapper_AllElementAsObject>{
	public var Map<EClass, Type> typeMap = new HashMap;
}

class EClassMapper_AllElementAsObject implements EClassMapper{
	val extension LogicProblemBuilder builder = new LogicProblemBuilder
	
	override transformEClasses(Ecore2Logic_Trace trace, LogicProblem problem,
		Iterable<EClass> classes, int numberOfObjects, EcoreMetamodelDescriptor metamodelDescriptor
	) {
		val classMapperTrace = new EClassMapper_AllElementAsObject_Trace
		trace.classMapperTrace = classMapperTrace
		for(c:classes) {
			val logicType = problem.add(TypeDeclaration('''«c.name» class''',c.isAbstract || c.isInterface))
			classMapperTrace.typeMap.put(c,logicType)
		}
		for(c:classes) {
			for(s : c.ESuperTypes) {
				Supertype(classMapperTrace.typeMap.get(c),classMapperTrace.typeMap.get(s))
			}
		}
	}
	
	def asTrace(Trace<? extends EClassMapper> o) { o as EClassMapper_AllElementAsObject_Trace }
	
	override TypeofEClass(Ecore2Logic_Trace trace, EClass type) {
		val typeMap = trace.classMapperTrace.asTrace.typeMap
		if(typeMap.containsKey(type)) {
			typeMap.get(type)
		} else {
			throw new IllegalArgumentException('''Class «type.name» is not translated to logic!''')
		}
	}
	
	override allClassesInScope(Ecore2Logic_Trace trace) {
		trace.classMapperTrace.asTrace.typeMap.keySet
	}
}
