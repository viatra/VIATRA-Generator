package hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder

import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMultiplicity
import hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ContainmentHierarchy
import java.util.HashMap

class Logic2AlloyLanguageMapper_Containment {
	val extension AlloyLanguageFactory factory = AlloyLanguageFactory.eINSTANCE
	private val Logic2AlloyLanguageMapper_Support support = new Logic2AlloyLanguageMapper_Support;
	val Logic2AlloyLanguageMapper base;
	public new(Logic2AlloyLanguageMapper base) {
		this.base = base
	}
	
	def protected transformContainmentHierarchy(ContainmentHierarchy containment, Logic2AlloyLanguageMapperTrace trace) {
		// Single root
		val rootField = createALSFieldDeclaration => [
			it.name= support.toID(#["util", "root"])
			it.multiplicity = ALSMultiplicity.ONE
			it.type = typesOrderedInContainment(containment,trace)
		]
		trace.logicLanguageBody.fields += rootField
		
		val contains = createALSFieldDeclaration => [
			it.name = support.toID(#["util", "contains"])
			//it.multiplicity = ALSMultiplicity::SET
			it.type = createALSDirectProduct => [
				it.leftMultiplicit = ALSMultiplicity::LONE
				it.rightMultiplicit = ALSMultiplicity::SET
				it.leftOperand = typesOrderedInContainment(containment,trace)
				it.rightOperand = typesOrderedInContainment(containment,trace)
			]
		]
		trace.logicLanguageBody.fields += contains
		
		val containmentRelationDefinition = createALSFactDeclaration => [
			it.name = support.toID(#["util", "containmentDefinition"])		
		]
		
		if(containment.containmentRelations.forall[it instanceof RelationDeclaration]) {
			val containmentRelations = containment.containmentRelations.filter(RelationDeclaration).map[relation|
				base.relationMapper.transformRelationReference(relation,trace)
			].toList
			
			containmentRelationDefinition.term = createALSEquals => [
				leftOperand = createALSJoin => [
					leftOperand = createALSReference => [referred = trace.logicLanguage]
					rightOperand = createALSReference => [ referred = contains ]]
				rightOperand = support.unfoldPlus(containmentRelations)
			]
		} else {
			val parent = createALSVariableDeclaration => [
				it.name = "parent"
				it.range = typesOrderedInContainment(containment, trace)
			]
			val child = createALSVariableDeclaration => [
				it.name = "child"
				it.range = typesOrderedInContainment(containment, trace)
			]
			
			val logicFactory = LogiclanguageFactory.eINSTANCE
			val logicParentVariable = logicFactory.createVariable
			val logicChildVariable = logicFactory.createVariable
			val logicParent = logicFactory.createSymbolicValue => [it.symbolicReference = logicParentVariable]
			val logicChild = logicFactory.createSymbolicValue => [it.symbolicReference = logicChildVariable]
			val variableMap = new HashMap => [put(logicParentVariable,parent) put(logicChildVariable,child)]
			val possibleRelations = containment.containmentRelations.map[relation |
				base.transformSymbolicReference(relation,#[logicParent,logicChild],trace,variableMap)
			]
			
			containmentRelationDefinition.term = createALSQuantifiedEx => [
				it.type = ALSMultiplicity.ALL
				it.variables += parent
				it.variables += child
				it.expression = createALSIff => [
					it.leftOperand = createALSSubset => [
						it.leftOperand = createALSDirectProduct => [
							it.leftOperand = createALSReference => [it.referred = child]
							it.rightOperand = createALSReference => [it.referred = parent]
						]
						it.rightOperand = createALSJoin => [
							leftOperand = createALSReference => [referred = trace.logicLanguage]
							rightOperand = createALSReference => [ referred = contains ]
						]
					]
					it.rightOperand = support.unfoldOr(possibleRelations,trace)
				]
			]
		}
		
		trace.specification.factDeclarations += containmentRelationDefinition
		
		// With the exception of the root, every object has at least one parent
		// No parent for root
		trace.specification.factDeclarations += createALSFactDeclaration => [
			it.name = support.toID(#["util", "noParentForRoot"])
			it.term = createALSQuantifiedEx => [
				it.type = ALSMultiplicity::NO
				val parent = createALSVariableDeclaration => [
					it.name = "parent"
					it.range = typesOrderedInContainment(containment,trace)
				]
				it.variables += parent
				it.expression = createALSSubset => [
					it.leftOperand = createALSDirectProduct => [
						it.leftOperand = createALSReference => [it.referred = parent]
						it.rightOperand = createALSJoin => [
							it.leftOperand = createALSReference => [it.referred = trace.logicLanguage]
							it.rightOperand = createALSReference => [it.referred = rootField]
						]
					]
					it.rightOperand = createALSJoin => [
						leftOperand = createALSReference => [referred = trace.logicLanguage]
						rightOperand = createALSReference => [ referred = contains ]
					]
				]
			]
		]
		// Parent for nonroot
		trace.specification.factDeclarations += createALSFactDeclaration => [
			it.name = support.toID(#["util", "atLeastOneParent"])
			it.term = createALSQuantifiedEx => [
				it.type = ALSMultiplicity::ALL
				val child = createALSVariableDeclaration => [
					it.name = "child"
					it.range = typesOrderedInContainment(containment,trace)
				]
				it.variables += child
				it.expression = createALSOr => [
					it.leftOperand = createALSEquals => [
						it.leftOperand = createALSReference => [it.referred = child]
						it.rightOperand = createALSJoin => [
							it.leftOperand = createALSReference => [it.referred = trace.logicLanguage]
							it.rightOperand = createALSReference => [it.referred = rootField]
						]
					]
					it.rightOperand = createALSQuantifiedEx => [
						it.type = ALSMultiplicity::SOME
						val parent = createALSVariableDeclaration => [
							it.name = "parent"
							it.range = typesOrderedInContainment(containment, trace)
						]
						it.variables += parent
						it.expression = createALSSubset => [
							it.leftOperand = createALSDirectProduct => [
								it.leftOperand = createALSReference => [it.referred = parent]
								it.rightOperand = createALSReference => [it.referred = child]
							]
							it.rightOperand = createALSJoin => [
								leftOperand = createALSReference => [referred = trace.logicLanguage]
								rightOperand = createALSReference => [ referred = contains ]
							]
						]
					]
				]
			]
		]
		
		// Every object has at most one parent
//		trace.specification.factDeclarations += createALSFactDeclaration => [
//			it.name = support.toID(#["util", "atMostOneParent"])
//			it.term = createALSQuantifiedEx => [
//				it.type = ALSMultiplicity::ALL
//				val child = createALSVariableDeclaration => [
//					it.name = "child"
//					it.range = typesOrderedInContainment(containment,trace)
//				]
//				it.variables += child
//				it.expression = createALSQuantifiedEx => [
//					it.type = ALSMultiplicity::LONE
//					val parent = createALSVariableDeclaration => [
//						it.name = "parent"
//						it.range = typesOrderedInContainment(containment, trace)
//					]
//					it.variables += parent
//					it.expression = createALSFunctionCall => [
//						it.referredDefinition = containmentRelation
//						it.params += createALSReference => [
//							it.referred = parent
//							it.referred = child
//						]
//					]
//				]
//			]
//		]
		
		// No circle in containment
		trace.specification.factDeclarations += createALSFactDeclaration => [
			it.name = support.toID(#["util", "noCircularContainment"])
			it.term = createALSQuantifiedEx => [
				it.type = ALSMultiplicity::NO
				val variable = createALSVariableDeclaration => [
					it.name = "circle"
					it.range = typesOrderedInContainment(containment,trace)
				]
				it.variables += variable
				it.expression = createALSSubset => [
					it.leftOperand = createALSDirectProduct => [
						it.leftOperand = createALSReference => [it.referred = variable]
						it.rightOperand = createALSReference => [it.referred = variable]
					]
					it.rightOperand = createAlSTransitiveClosure => [
						it.operand = createALSJoin => [
							leftOperand = createALSReference => [referred = trace.logicLanguage]
							rightOperand = createALSReference => [ referred = contains ]
						]
					]
				]
			]
		]
		
	}
	
	/*def protected calculateContainmentTypeCoveringSignatures(ContainmentHierarchy containment, Logic2AlloyLanguageMapperTrace trace) {
		val types = containment.typesOrderedInHierarchy
		val signaturesInContainment = types.map[base.typeMapper.transformTypeReference(it, base, trace)].flatten.toList
//		val uncoveredSignatures = new ArrayList(signaturesInContainment)
//		val coveringSignatures = new LinkedList
//		
		val engine = ViatraQueryEngine.on(new EMFScope(trace.specification))
		//val directSubsetMatcher = DirectSubsetMatcher.on(engine)
		// x <= y
		val subsetMatcher = SubsetMatcher.on(engine) 
		
		if()
	}*/
	
	/*def boolean coveringAllSignaturesInContainment(ALSSignatureDeclaration target, List<ALSSignatureDeclaration> signaturesInContainment, SubsetMatcher matcher) {
		for(signatureInContainment : signaturesInContainment) {
			if(!matcher.hasMatch(signatureInContainment,target)) {
				return false
			}
		}
		return true
	}*/
	
	/*def boolean coveringSignatureNotInContainment(ALSSignatureDeclaration target, List<ALSSignatureDeclaration> signaturesInContainment, SubsetMatcher matcher) {
		val subtypes = matcher.getAllValuesOfx(target);
		for(subType : subtypes) {
			val isSubtypeOfASignatureInContainment = signaturesInContainment.exists[contained |
				matcher.hasMatch(subType,contained)
			]
			if(!isSubtypeOfASignatureInContainment) {
				return false
			}
		}
		return true
	}*/
	
	def protected typesOrderedInContainment(ContainmentHierarchy containment, Logic2AlloyLanguageMapperTrace trace) {
		val types = containment.typesOrderedInHierarchy
		val signaturesInContainment = types.map[base.typeMapper.transformTypeReference(it, base, trace)].flatten
		// val allSignatures = trace.specification.signatureBodies.map[declarations].flatten
		val typeReferences = signaturesInContainment.map[sig | createALSReference => [it.referred = sig]].toList
		return support.unfoldPlus(typeReferences)
	}
}