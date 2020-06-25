package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns

import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.InverseRelationAssertion
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IntTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RealTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.StringTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.DefinedByDerivedFeature
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransfomedViatraQuery
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransformedViatraWellformednessConstraint
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.Modality
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeAnalysisResult
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.TypeInferenceMethod
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.LinearTypeConstraintHint
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.RelationConstraints
import hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.cardinality.ScopePropagatorStrategy
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.Collection
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EReference
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery
import org.eclipse.xtend.lib.annotations.Accessors

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import org.eclipse.xtend.lib.annotations.Data
import org.eclipse.viatra.query.runtime.matchers.psystem.PConstraint

@Data class PatternGeneratorResult {
	CharSequence patternText
	HashMap<PConstraint,String> constraint2MustPreconditionName
	HashMap<PConstraint,String> constraint2CurrentPreconditionName
}

class PatternGenerator {
	@Accessors(PUBLIC_GETTER) val TypeIndexer typeIndexer // = new TypeIndexer(this)
	@Accessors(PUBLIC_GETTER) val RelationDeclarationIndexer relationDeclarationIndexer = new RelationDeclarationIndexer(
		this)
	@Accessors(PUBLIC_GETTER) val RelationDefinitionIndexer relationDefinitionIndexer = new RelationDefinitionIndexer(
		this)
	@Accessors(PUBLIC_GETTER) val ContainmentIndexer containmentIndexer = new ContainmentIndexer(this)
	@Accessors(PUBLIC_GETTER) val InvalidIndexer invalidIndexer = new InvalidIndexer(this)
	@Accessors(PUBLIC_GETTER) val UnfinishedIndexer unfinishedIndexer
	@Accessors(PUBLIC_GETTER) val TypeRefinementGenerator typeRefinementGenerator //= new RefinementGenerator(this)
	@Accessors(PUBLIC_GETTER) val RelationRefinementGenerator relationRefinementGenerator = new RelationRefinementGenerator(this)
	@Accessors(PUBLIC_GETTER) val UnitPropagationPreconditionGenerator unitPropagationPreconditionGenerator = new UnitPropagationPreconditionGenerator(this)
	
	public new(TypeInferenceMethod typeInferenceMethod, ScopePropagatorStrategy scopePropagatorStrategy) {
		if(typeInferenceMethod == TypeInferenceMethod.Generic) {
			this.typeIndexer = new GenericTypeIndexer(this)
			this.typeRefinementGenerator = new GenericTypeRefinementGenerator(this)
		} else if (typeInferenceMethod == TypeInferenceMethod.PreliminaryAnalysis) {
			this.typeIndexer = new TypeIndexerWithPreliminaryTypeAnalysis(this)
			this.typeRefinementGenerator = new TypeRefinementWithPreliminaryTypeAnalysis(this)
		} else {
			this.typeIndexer = null
			this.typeRefinementGenerator = null
			throw new IllegalArgumentException('''Unknown type indexing technique : «typeInferenceMethod.name»''')
		}
		this.unfinishedIndexer = new UnfinishedIndexer(this, scopePropagatorStrategy.requiresUpperBoundIndexing)
	}

	def requiresTypeAnalysis() {
		typeIndexer.requiresTypeAnalysis || typeRefinementGenerator.requiresTypeAnalysis
	}

	dispatch def CharSequence referRelation(RelationDeclaration referred, String sourceVariable, String targetVariable,
		Modality modality, Map<String, PQuery> fqn2PQuery) {
		return this.relationDeclarationIndexer.referRelation(referred, sourceVariable, targetVariable, modality)
	}

	dispatch def CharSequence referRelation(RelationDefinition referred, String sourceVariable, String targetVariable,
		Modality modality, Map<String, PQuery> fqn2PQuery) {
		val pattern = referred.annotations.filter(TransfomedViatraQuery).head.patternFullyQualifiedName.lookup(
			fqn2PQuery)
		return this.relationDefinitionIndexer.referPattern(pattern, #[sourceVariable, targetVariable], modality, true,
			false)
	}

	def referRelationByName(EReference reference, String sourceVariable, String targetVariable, Modality modality) {
		'''find «modality.name.toLowerCase»InRelation«canonizeName('''«reference.name» reference «reference.EContainingClass.name»''')»(problem,interpretation,«sourceVariable»,«targetVariable»);'''
	}

	def CharSequence referAttributeByName(EAttribute attribute, String sourceVariable, String targetVariable,
		Modality modality) {
		'''find «modality.name.toLowerCase»InRelation«canonizeName('''«attribute.name» attribute «attribute.EContainingClass.name»''')»(problem,interpretation,«sourceVariable»,«targetVariable»);'''
	}

	def canonizeName(String name) {
		name.split(' ').join('_')
	}

	def wfQueries(LogicProblem problem) {
		problem.assertions.map[it.annotations].flatten.filter(TransformedViatraWellformednessConstraint).map[it.query]
	}

	def getContainments(LogicProblem p) {
		return p.containmentHierarchies.head.containmentRelations
	}

	def getInverseRelations(LogicProblem p) {
		val inverseRelations = new HashMap
		p.annotations.filter(InverseRelationAssertion).forEach [
			inverseRelations.put(it.inverseA, it.inverseB)
			inverseRelations.put(it.inverseB, it.inverseA)
		]
		return inverseRelations
	}

	def isRepresentative(Relation relation, Relation inverse) {
		if (relation === null) {
			return false
		} else if (inverse === null) {
			return true
		} else {
			relation.name.compareTo(inverse.name) < 1
		}
	}

	def isDerived(Relation relation) {
		relation.annotations.exists[it instanceof DefinedByDerivedFeature]
	}

	def getDerivedDefinition(RelationDeclaration relation) {
		relation.annotations.filter(DefinedByDerivedFeature).head.query
	}

	private def allTypeReferences(LogicProblem problem) {
		problem.eAllContents.filter(TypeReference).toIterable
	}

	protected def hasBoolean(LogicProblem problem) {
		problem.allTypeReferences.exists[it instanceof BoolTypeReference]
	}

	protected def hasInteger(LogicProblem problem) {
		problem.allTypeReferences.exists[it instanceof IntTypeReference]
	}

	protected def hasReal(LogicProblem problem) {
		problem.allTypeReferences.exists[it instanceof RealTypeReference]
	}

	protected def hasString(LogicProblem problem) {
		problem.allTypeReferences.exists[it instanceof StringTypeReference]
	}

	def transformBaseProperties(
		LogicProblem problem,
		PartialInterpretation emptySolution,
		Map<String, PQuery> fqn2PQuery,
		TypeAnalysisResult typeAnalysisResult,
		RelationConstraints constraints,
		Collection<LinearTypeConstraintHint> hints
	) {
		val first = 
		 '''
			import epackage "http://www.bme.hu/mit/inf/dslreasoner/viatrasolver/partialinterpretationlanguage"
			import epackage "http://www.bme.hu/mit/inf/dslreasoner/logic/model/problem"
			import epackage "http://www.bme.hu/mit/inf/dslreasoner/logic/model/language"
			
			//////////
			// 0. Util
			//////////
			private pattern interpretation(problem:LogicProblem, interpretation:PartialInterpretation) {
				PartialInterpretation.problem(interpretation,problem);
			}
				
			/////////////////////////
			// 0.1 Existence
			/////////////////////////
			/** [[exist(element)]]=1 */
			private pattern mustExist(problem:LogicProblem, interpretation:PartialInterpretation, element:DefinedElement) {
				find interpretation(problem,interpretation);
				LogicProblem.elements(problem,element);
			} or {
				find interpretation(problem,interpretation);
				PartialInterpretation.newElements(interpretation,element);
			}
			
			/** [[exist(element)]]>=1/2 */
			private pattern mayExist(problem:LogicProblem, interpretation:PartialInterpretation, element:DefinedElement) {
			    find mustExist(problem,interpretation,element);
			} or {
			    find interpretation(problem,interpretation);
			    neg find elementCloseWorld(element);
			    PartialInterpretation.openWorldElements(interpretation,element);
			}
			
			private pattern elementCloseWorld(element:DefinedElement) {
				PartialInterpretation.openWorldElements(i,element);
				PartialInterpretation.maxNewElements(i,0);
			} or {
				Scope.targetTypeInterpretation(scope,interpretation);
				PartialTypeInterpratation.elements(interpretation,element);
				Scope.maxNewElements(scope,0);
			}
			
			////////////////////////
			// 0.2 Equivalence
			////////////////////////
			pattern mayEquivalent(problem:LogicProblem, interpretation:PartialInterpretation, a: DefinedElement, b: DefinedElement)
			// For non-primitive type. Boolean types always must equivalent or cannot equivalent
			{
				find mayExist(problem,interpretation,a);
				find mayExist(problem,interpretation,b);
				a == b;
«««			} or {
«««				find mayExist(problem,interpretation,a);
«««				find mayExist(problem,interpretation,b);
«««				IntegerElement(a);
«««				IntegerElement(b);
«««				PrimitiveElement.valueSet(a,false);
«««			} or {
«««				find mayExist(problem,interpretation,a);
«««				find mayExist(problem,interpretation,b);
«««				IntegerElement(a);
«««				IntegerElement(b);
«««				PrimitiveElement.valueSet(b,false);
«««			} or {
«««				find mayExist(problem,interpretation,a);
«««				find mayExist(problem,interpretation,b);
«««				RealElement(a);
«««				RealElement(b);
«««				PrimitiveElement.valueSet(a,false);
«««			} or {
«««				find mayExist(problem,interpretation,a);
«««				find mayExist(problem,interpretation,b);
«««				RealElement(a);
«««				RealElement(b);
«««				PrimitiveElement.valueSet(b,false);
«««			} or {
«««				find mayExist(problem,interpretation,a);
«««				find mayExist(problem,interpretation,b);
«««				StringElement(a);
«««				StringElement(b);
«««				PrimitiveElement.valueSet(a,false);
«««			} or {
«««				find mayExist(problem,interpretation,a);
«««				find mayExist(problem,interpretation,b);
«««				StringElement(a);
«««				StringElement(b);
«««				PrimitiveElement.valueSet(b,false);
			}
			
			pattern mustEquivalent(problem:LogicProblem, interpretation:PartialInterpretation, a: DefinedElement, b: DefinedElement) {
			// For non-primitive and Boolean primitive type
				find mustExist(problem,interpretation,a);
				find mustExist(problem,interpretation,b);
				a == b;
«««			} or {
«««				find mustExist(problem,interpretation,a);
«««				find mustExist(problem,interpretation,b);
«««				PrimitiveElement.valueSet(a,true);
«««				PrimitiveElement.valueSet(b,true);
«««				IntegerElement.value(a,value);
«««				IntegerElement.value(b,value);
«««			} or {
«««				find mustExist(problem,interpretation,a);
«««				find mustExist(problem,interpretation,b);
«««				PrimitiveElement.valueSet(a,true);
«««				PrimitiveElement.valueSet(b,true);
«««				RealElement.value(a,value);
«««				RealElement.value(b,value);
«««			} or {
«««				find mustExist(problem,interpretation,a);
«««				find mustExist(problem,interpretation,b);
«««				PrimitiveElement.valueSet(a,true);
«««				PrimitiveElement.valueSet(b,true);
«««				StringElement.value(a,value);
«««				StringElement.value(b,value);
			}
			
			//////////
			// 1. Problem-Specific Base Indexers
			//////////
			// 1.1 Type Indexers
			//////////
			// 1.1.1 Required Patterns by TypeIndexer
			//////////

			«typeIndexer.requiredQueries»
			
			//////////
			// 1.1.2 primitive Type Indexers
			//////////
			// Currently unused. Refer primitive types as:
			// > PrimitiveElement(element)
			// specific types are referred as:
			// > BooleanElement(variableName)
			// > IntegerElement(variableName)
			// > RealElement(variableName)
			// > StringElement(variableName)
			// And their value as
			// > BooleanElement.value(variableName,value)
			// > IntegerElement.value(variableName,value)
			// > RealElement.value(variableName,value)
			// > StringElement.value(variableName,value)
			// Whether a value is set is defined by:
			// > PrimitiveElement.valueSet(variableName,isFilled);
			
			//////////
			// 1.1.3 domain-specific Type Indexers
			//////////
			«typeIndexer.generateInstanceOfQueries(problem,emptySolution,typeAnalysisResult)»
			
			//////////
			// 1.2 Relation Declaration Indexers
			//////////
			«relationDeclarationIndexer.generateRelationIndexers(problem,problem.relations.filter(RelationDeclaration),fqn2PQuery)»
			
			//////////
			// 1.3 Relation Definition Indexers
			//////////
			«relationDefinitionIndexer.generateRelationDefinitions(problem,problem.relations.filter(RelationDefinition),fqn2PQuery)»
			
			//////////
			// 1.4 Containment Indexer
			//////////
			«containmentIndexer.transformContainment(problem,problem.relations,fqn2PQuery)»
			
			//////////
			// 2. Invalidation Indexers
			//////////
			// 2.1 Invalidated by WF Queries
			//////////
			«invalidIndexer.generateInvalidatedByWfQueries(problem,fqn2PQuery)»
			
			//////////
			// 3. Unfinishedness Indexers
			//////////
			// 3.1 Unfinishedness Measured by Multiplicity
			//////////
			«unfinishedIndexer.generateUnfinishedMultiplicityQueries(constraints.multiplicityConstraints,fqn2PQuery)»
			
			//////////
			// 3.2 Unfinishedness Measured by WF Queries
			//////////
			«unfinishedIndexer.generateUnfinishedWfQueries(problem,fqn2PQuery)»
			
			//////////
			// 4. Refinement Indexers
			//////////
			// 4.1 Object constructors
			//////////
			«typeRefinementGenerator.generateRefineObjectQueries(problem,emptySolution,typeAnalysisResult)»
			
			//////////
			// 4.2 Type refinement
			//////////
			«typeRefinementGenerator.generateRefineTypeQueries(problem,emptySolution,typeAnalysisResult)»
			
			//////////
			// 4.3 Relation refinement
			//////////
			«relationRefinementGenerator.generateRefineReference(problem)»
			
			//////////
			// 5 Hints
			//////////
			«FOR hint : hints»
				«hint.getAdditionalPatterns(this)»
			«ENDFOR»
			
			//////////
			// 6 Unit Propagations
			//////////
			'''
		val up = unitPropagationPreconditionGenerator.generateUnitPropagationRules(problem,problem.relations.filter(RelationDefinition),fqn2PQuery)
		val second = up.definitions
		return new PatternGeneratorResult(first+second,up.constraint2MustPreconditionName,up.constraint2CurrentPreconditionName)
	}
}
