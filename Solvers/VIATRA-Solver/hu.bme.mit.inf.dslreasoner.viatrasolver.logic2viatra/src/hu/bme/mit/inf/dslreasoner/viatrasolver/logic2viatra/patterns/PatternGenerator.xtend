package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns

import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.InverseRelationAssertion
import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.LowerMultiplicityAssertion
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
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EReference
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PQuery
import org.eclipse.xtend.lib.annotations.Accessors

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class PatternGenerator {
	@Accessors(PUBLIC_GETTER) val TypeIndexer typeIndexer //= new TypeIndexer(this)
	@Accessors(PUBLIC_GETTER) val RelationDeclarationIndexer relationDeclarationIndexer = new RelationDeclarationIndexer(this)
	@Accessors(PUBLIC_GETTER) val RelationDefinitionIndexer relationDefinitionIndexer = new RelationDefinitionIndexer(this)
	@Accessors(PUBLIC_GETTER) val ContainmentIndexer containmentIndexer = new ContainmentIndexer(this)
	@Accessors(PUBLIC_GETTER) val InvalidIndexer invalidIndexer = new InvalidIndexer(this)
	@Accessors(PUBLIC_GETTER) val UnfinishedIndexer unfinishedIndexer = new UnfinishedIndexer(this)
	@Accessors(PUBLIC_GETTER) val TypeRefinementGenerator typeRefinementGenerator //= new RefinementGenerator(this)
	@Accessors(PUBLIC_GETTER) val RelationRefinementGenerator relationRefinementGenerator = new RelationRefinementGenerator(this)
	
	public new(TypeInferenceMethod typeInferenceMethod) {
		if(typeInferenceMethod == TypeInferenceMethod.Generic) {
			this.typeIndexer = new GenericTypeIndexer(this)
			this.typeRefinementGenerator = new GenericTypeRefinementGenerator(this)
		} else if(typeInferenceMethod == TypeInferenceMethod.PreliminaryAnalysis) {
			this.typeIndexer = new TypeIndexerWithPreliminaryTypeAnalysis(this)
			this.typeRefinementGenerator = new TypeRefinementWithPreliminaryTypeAnalysis(this)
		} else {
			this.typeIndexer = null
			this.typeRefinementGenerator = null
			throw new IllegalArgumentException('''Unknown type indexing technique : «typeInferenceMethod.name»''')
		}
	}
	
	public def requiresTypeAnalysis() {
		typeIndexer.requiresTypeAnalysis || typeRefinementGenerator.requiresTypeAnalysis
	}
	
	public dispatch def referRelation(
		RelationDeclaration referred,
		String sourceVariable,
		String targetVariable,
		Modality modality,
		Map<String,PQuery> fqn2PQuery)
	{
		return this.relationDeclarationIndexer.referRelation(referred,sourceVariable,targetVariable,modality)
	}
	public dispatch def referRelation(
		RelationDefinition referred,
		String sourceVariable,
		String targetVariable,
		Modality modality,
		Map<String,PQuery> fqn2PQuery)
	{
		val pattern = referred.annotations.filter(TransfomedViatraQuery).head.patternFullyQualifiedName.lookup(fqn2PQuery)
		return this.relationDefinitionIndexer.referPattern(pattern,#[sourceVariable,targetVariable],modality,true,false)
	}
	
	def public referRelationByName(EReference reference,
		String sourceVariable,
		String targetVariable,
		Modality modality)
	{
		'''find «modality.name.toLowerCase»InRelation«canonizeName('''«reference.name» reference «reference.EContainingClass.name»''')
		»(problem,interpretation,«sourceVariable»,«targetVariable»);'''
	}
	
	def public CharSequence referAttributeByName(EAttribute attribute,
		String sourceVariable,
		String targetVariable,
		Modality modality)
	{
		throw new UnsupportedOperationException
	}
	
	public def canonizeName(String name) {
		name.split(' ').join('_')
	}
	
	public def lowerMultiplicities(LogicProblem problem) {
		problem.assertions.map[annotations].flatten.filter(LowerMultiplicityAssertion).filter[!it.relation.isDerived]
	}
	public def wfQueries(LogicProblem problem) {
		problem.assertions.map[it.annotations]
			.flatten
			.filter(TransformedViatraWellformednessConstraint)
			.map[it.query]
	}
	public def getContainments(LogicProblem p) {
		return p.containmentHierarchies.head.containmentRelations
	}
	public def getInverseRelations(LogicProblem p) {
		val inverseRelations = new HashMap
		p.annotations.filter(InverseRelationAssertion).forEach[
			inverseRelations.put(it.inverseA,it.inverseB)
			inverseRelations.put(it.inverseB,it.inverseA)
		]
		return inverseRelations
	}
	public def isRepresentative(Relation relation, Relation inverse) {
		if(inverse == null) {
			return true
		} else {
			relation.name.compareTo(inverse.name)<1
		}
	}
	
	public def isDerived(Relation relation) {
		relation.annotations.exists[it instanceof DefinedByDerivedFeature]
	}
	public def getDerivedDefinition(RelationDeclaration relation) {
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
	
	public def transformBaseProperties(
		LogicProblem problem,
		PartialInterpretation emptySolution,
		Map<String,PQuery> fqn2PQuery,
		TypeAnalysisResult typeAnalysisResult
	) {
		
		return '''
			import epackage "http://www.bme.hu/mit/inf/dslreasoner/viatrasolver/partialinterpretationlanguage"
			import epackage "http://www.bme.hu/mit/inf/dslreasoner/logic/model/problem"
			import epackage "http://www.bme.hu/mit/inf/dslreasoner/logic/model/language"
			
			//////////
			// 0. Util
			//////////
			private pattern interpretation(problem:LogicProblem, interpetation:PartialInterpretation) {
				PartialInterpretation.problem(interpetation,problem);
			}
				
			/////////////////////////
			// 0.1 Existence
			/////////////////////////
			private pattern mustExist(problem:LogicProblem, interpetation:PartialInterpretation, element:DefinedElement) {
				find interpretation(problem,interpetation);
				LogicProblem.elements(problem,element);
			} or {
				find interpretation(problem,interpetation);
				PartialInterpretation.newElements(interpetation,element);
			}
			«IF problem.hasBoolean»or {
				find interpretation(problem,interpetation);
				PartialInterpretation.booleanelements(interpetation,element);
			}«ENDIF»
			«IF problem.hasInteger»or {
				find interpretation(problem,interpetation);
				PartialInterpretation.integerelements(interpetation,element);
			}«ENDIF»
			«IF problem.hasReal»or {
				find interpretation(problem,interpetation);
				PartialInterpretation.realelements(interpetation,element);
			}«ENDIF»
			«IF problem.hasString»or {
				find interpretation(problem,interpetation);
				PartialInterpretation.stringelements(interpetation,element);
			}«ENDIF»
			
			private pattern mayExist(problem:LogicProblem, interpetation:PartialInterpretation, element:DefinedElement) {
			    find mustExist(problem,interpetation,element);
			} or {
			    find interpretation(problem,interpetation);
			    neg find elementCloseWorld(interpetation);
			    PartialInterpretation.openWorldElementPrototypes(interpetation,element);
			}
			«IF problem.hasInteger»or {
				find interpretation(problem,interpetation);
				neg find integerCloseWorld(interpetation);
				PartialInterpretation.newIntegers(interpetation,element);
			}«ENDIF»
			«IF problem.hasReal»or {
				find interpretation(problem,interpetation);
				neg find realCloseWorld(interpetation);
				PartialInterpretation.newReals(interpetation,element);
			}«ENDIF»
			«IF problem.hasString»or {
				find interpretation(problem,interpetation);
				neg find stringCloseWorld(interpetation);
				PartialInterpretation.newStrings(interpetation,element);
			}«ENDIF»
			
			private pattern elementCloseWorld(interpetation:PartialInterpretation) {
			    PartialInterpretation.maxNewElements(interpetation,0);
			}
			«IF problem.hasInteger»private pattern integerCloseWorld(interpetation:PartialInterpretation) {
			    PartialInterpretation.maxNewIntegers(interpetation,0);
			}«ENDIF»
			«IF problem.hasReal»private pattern realCloseWorld(interpetation:PartialInterpretation) {
			    PartialInterpretation.maxNewReals(interpetation,0);
			}«ENDIF»
			«IF problem.hasString»private pattern stringCloseWorld(interpetation:PartialInterpretation) {
			    PartialInterpretation.maxNewStrings(interpetation,0);
			}«ENDIF»
			
			////////////////////////
			// 0.2 Equivalence
			////////////////////////
			pattern mayEquivalent(problem:LogicProblem, interpretation:PartialInterpretation, a: DefinedElement, b: DefinedElement) {
				find mayExist(problem,interpretation,a);
				find mayExist(problem,interpretation,b);
				a == b;
			}
			
			////////////////////////
			// 0.3 Required Patterns by TypeIndexer
			////////////////////////
			«typeIndexer.requiredQueries»
			
			//////////
			// 1. Problem-Specific Base Indexers
			//////////
			// 1.1 Type Indexers
			//////////
			// 1.1.1 primitive Type Indexers
			//////////
			pattern instanceofBoolean(problem:LogicProblem, interpretation:PartialInterpretation, element:DefinedElement) {
				find interpretation(problem,interpretation);
				PartialInterpretation.booleanelements(interpretation,element);
			}
			pattern instanceofInteger(problem:LogicProblem, interpretation:PartialInterpretation, element:DefinedElement) {
				find interpretation(problem,interpretation);
				PartialInterpretation.integerelements(interpretation,element);
			} or {
				find interpretation(problem,interpretation);
				PartialInterpretation.newIntegers(interpetation,element);
			}
			pattern instanceofReal(problem:LogicProblem, interpretation:PartialInterpretation, element:DefinedElement) {
				find interpretation(problem,interpretation);
				PartialInterpretation.realelements(interpretation,element);
			} or {
				find interpretation(problem,interpretation);
				PartialInterpretation.newReals(interpetation,element);
			}
			pattern instanceofString(problem:LogicProblem, interpretation:PartialInterpretation, element:DefinedElement) {
				find interpretation(problem,interpretation);
				PartialInterpretation.stringelements(interpretation,element);
			} or {
				find interpretation(problem,interpretation);
				PartialInterpretation.newStrings(interpetation,element);
			}
			
			//////////
			// 1.1.2 domain-specific Type Indexers
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
			«unfinishedIndexer.generateUnfinishedMultiplicityQueries(problem,fqn2PQuery)»
			
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
			'''
	}
}
