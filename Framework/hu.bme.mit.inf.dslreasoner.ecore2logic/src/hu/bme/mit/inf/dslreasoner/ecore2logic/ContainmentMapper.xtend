package hu.bme.mit.inf.dslreasoner.ecore2logic

import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicProblemBuilder
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Constant
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import org.eclipse.emf.ecore.EReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Assertion

interface ContainmentMapper {
	def  void transformContainment(Ecore2Logic_Trace trace, LogicProblem problem, Iterable<EReference> references, boolean singleRoot);
}

class ContainmentMapper_ReferenceConjuction_Trace implements Trace<ContainmentMapper_ReferenceConjuction> {
	public var Constant root;
	public var Relation contains
	public var Assertion containsDefinition;
	public var Assertion rootIsNotContained;
	public var Assertion everithingElseContained;
	public var Assertion notContainedByMore;
}

class ContainmentMapper_ReferenceConjuction implements ContainmentMapper{
	val extension LogicProblemBuilder builder = new LogicProblemBuilder
	val extension EClassMapper classMapper;
	val extension EReferenceMapper referenceMapper
	val int containmentAcyclicityApproximationLevel;
	
	public new(EClassMapper classMapper, EReferenceMapper referenceMapper, int containmentAcyclicityApproximationLevel) {
		this.classMapper = classMapper
		this.referenceMapper = referenceMapper
		this.containmentAcyclicityApproximationLevel = containmentAcyclicityApproximationLevel
	}
	
	override transformContainment(Ecore2Logic_Trace trace, LogicProblem problem, Iterable<EReference> references, boolean singleRoot) {
		val allClasses = classMapper.allClassesInScope(trace).map[classMapper.TypeofEClass(trace,it)]
		val containmentRelation = references.filter[isContainment].map[referenceMapper.relationOfReference(trace,it)]
		val containmentHierarchy = ContainmentHierarchy(allClasses,#[],containmentRelation,null)
		problem.add(containmentHierarchy)
	}
}

/*val containmentMapperTrace = new ContainmentMapper_ReferenceConjuction_Trace
			trace.containmentMapperTrace = containmentMapperTrace
			
			val containment = references.filter[containment]
						
			val contains = problem.add(RelationDeclaration('''contains''', getType(trace,references),getType(trace,references)))
			containmentMapperTrace.contains = contains
			containmentMapperTrace.containsDefinition = problem.add(Assertion('''containsDefinition''',
				Forall[
					val parent = addVar("parent",getType(trace,references))
					val child = addVar("child",getType(trace,references))
					contains.call(parent,child) <=> Or(containment.map[IsInReference(trace,parent,child,it)])
				]
			))
			
			
			
			containmentMapperTrace.notContainedByMore = problem.add(Assertion('''notContainedByMore''',
				Forall[
					val child = addVar('''child''',getType(trace,references))
					val parent1 = addVar('''parent 1''',getType(trace,references))
					val parent2 = addVar('''parent 2''',getType(trace,references))
					(contains.call(parent1,child) && contains.call(parent2,child)) => (parent1 == parent2)
				]
			))

			(2..containmentAcyclicityApproximationLevel).forEach[problem.add(getAcyclicityConstraint(trace,references,it))]
			
			if (singleRoot) {
				val root = problem.add(ConstantDeclaration('''root''', getType(trace, references)))
				containmentMapperTrace.root = root
	
				containmentMapperTrace.rootIsNotContained = problem.add(
					Assertion(
						'''rootIsNotContained''',
						Forall[
							val parent = addVar("parent", getType(trace, references))
							!contains.call(parent, root)
						]
					))
	
				containmentMapperTrace.everithingElseContained = problem.add(
					Assertion(
						'''nonrootIsContained''',
						Forall[
							val child = addVar("child", getType(trace, references))
							(child != root) => Exists[
								val parent = addVar("parent", getType(trace, references))
								contains.call(parent, child)
							]
						]
					))
			}*/
			
	
//	def asTrace(Trace<? extends ContainmentMapper> trace) { trace as ContainmentMapper_ReferenceConjuction_Trace }
//	
//	def getAcyclicityConstraint(Ecore2Logic_Trace trace, Iterable<EReference> references,int circleSize) {
//		val newTrace = trace.containmentMapperTrace.asTrace
//		//val newTrace2 = trace.containmentMapperTrace as ContainmentMapper_ReferenceConjuction_Trace // ???
//		
//		Forall[context | 
//			val elements = (0..circleSize).map[context.addVar(getType(trace,references))].toList
//			!(And((0..circleSize-1).map[newTrace.contains.call(elements.get(it),elements.get(it+1))]) &&
//			  newTrace.contains.call(elements.last,elements.head))
//		]
//	}
//	
//	def private getType(Ecore2Logic_Trace trace, Iterable<EReference> references) {
//		trace.TypeofEClass(references.head.EContainingClass)
//	}

	/*// This type is contained -> (From this type -> By those references)
			val Map<TypeDescriptor,Map<TypeDescriptor,Set<EReference>>> typeContainedBy = new HashMap
			for(reference: references.filter[containment]) {
				val sourceType = TypeofEClass(classMapperTrace, reference.EContainingClass)
				val targetType = TypeofEClass(classMapperTrace, reference.EType as EClass)
				if(typeContainedBy.containsKey(targetType)) {
					val m = typeContainedBy.get(targetType)
					if(m.containsKey(sourceType)) {
						m.get(sourceType).add(reference)
					} else {
						m.put(sourceType,new HashSet => [add(reference)])
					}
				} else { // initialise the collection
					val Map<TypeDescriptor,Set<EReference>> m = new HashMap
					m.put(sourceType,new HashSet => [add(reference)])
					typeContainedBy.put(targetType,m)
				}
			}*/
			// Only one type