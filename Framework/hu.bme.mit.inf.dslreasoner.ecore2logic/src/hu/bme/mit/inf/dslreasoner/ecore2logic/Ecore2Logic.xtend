package hu.bme.mit.inf.dslreasoner.ecore2logic

import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicProblemBuilder
import hu.bme.mit.inf.dslreasoner.logic.model.builder.TracedOutput
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Term
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TermDescription
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ContainmentHierarchy
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EEnumLiteral
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.xtend.lib.annotations.Delegate

@Data class EcoreMetamodelDescriptor {
	val List<EClass> classes;
	val Set<EClass> concretised;
	val boolean isEObjectConcretised;
	val List<EEnum> enums;
	val List<EEnumLiteral> literals;
	val List<EReference> references;
	val List<EAttribute> attributes;
	
	def isConcretised(EClass clazz) {concretised.contains(clazz)}
}

interface Trace<Mapper> {}

class Ecore2Logic_Trace implements Trace<Ecore2Logic> {
	public var ContainmentHierarchy containmentHierarchy;
	public var Trace<? extends EClassMapper> classMapperTrace
	public var Trace<? extends EEnumMapper> enumMapperTrace
	public var Trace<? extends EReferenceMapper> referenceMapperTrace
	public var Trace<? extends ContainmentMapper> containmentMapperTrace
	public var Trace<? extends EAttributeMapper> attributeMapperTrace
}

class Ecore2LogicConfiguration {
	var public boolean singleRoot = true
	var public int numberOfObjects = -1
	public static val Undefined = -1
}

class Ecore2LogicScope {
	public static val int Unlimited = -1
	public var numberOfObjects = Unlimited
}

class Ecore2Logic implements EClassMapper,  EEnumMapper, EReferenceMapper, ContainmentMapper, EAttributeMapper {
	@Delegate protected val EClassMapper classMapper
	@Delegate protected val EEnumMapper enumMapper
	@Delegate protected val EReferenceMapper referenceMapper
	@Delegate protected val ContainmentMapper containmentMapper
	@Delegate protected val EAttributeMapper attributeMapper
	
	public new() {
		this.classMapper = new EClassMapper_AllElementAsObject
		this.enumMapper = new EEnumMapper_PredefinedClasses
		this.referenceMapper = new EReferenceMapper_RelationsOverTypes(this.classMapper)
		this.containmentMapper = new ContainmentMapper_ReferenceConjuction(this.classMapper, this.referenceMapper,0)
		this.attributeMapper = new EAttributeMapper_RelationsOverTypes(this.classMapper, this.enumMapper)
	}
	
	public new(
		EClassMapper classMapper,
		EEnumMapper enumMapper,
		EReferenceMapper referenceMapper,
		ContainmentMapper containmentMapper,
		EAttributeMapper attributeMapper)
	{
		if(classMapper === null || enumMapper === null || referenceMapper === null || containmentMapper === null ||
			attributeMapper === null) {
			throw new IllegalArgumentException('''The mappers should not be null!''')
		}
		
		this.classMapper = classMapper
		this.enumMapper = enumMapper
		this.referenceMapper = referenceMapper
		this.containmentMapper = containmentMapper
		this.attributeMapper = attributeMapper
	}
	
	def public TracedOutput<LogicProblem,Ecore2Logic_Trace> transformMetamodel(EcoreMetamodelDescriptor metamodel, Ecore2LogicConfiguration config) {
		
		
		val Ecore2Logic_Trace trace = new Ecore2Logic_Trace
		val LogicProblem problem = (new LogicProblemBuilder).createProblem
		transformEClasses(trace,problem,metamodel.classes,config.numberOfObjects,metamodel)
		transformEEnums(trace,problem,metamodel.enums,config)
		transformEReferences(trace,problem,metamodel.references)
		transformContainment(trace,problem,metamodel.references, config.singleRoot)
		transformEAttributes(trace,problem,metamodel.attributes)
		
		return new TracedOutput(problem,trace)
	}
}
