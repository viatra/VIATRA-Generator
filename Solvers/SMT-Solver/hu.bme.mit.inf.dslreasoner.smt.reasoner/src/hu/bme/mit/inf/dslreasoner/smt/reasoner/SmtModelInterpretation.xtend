package hu.bme.mit.inf.dslreasoner.smt.reasoner

import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicModelInterpretation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem
import hu.bme.mit.inf.dslreasoner.smt.reasoner.builder.SmtModelQueryEngine
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDocument
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicDeclaration
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.Data

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDeclaration
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIntLiteral
import java.util.TreeSet
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTRealLiteral
import java.math.BigDecimal

@Data
class ValueType {
	TypeDescriptor descriptor
	Object value
}

class SmtModelInterpretation implements LogicModelInterpretation {
	//val extension LogiclanguageFactory factory = LogiclanguageFactory.eINSTANCE
	@Accessors(PUBLIC_GETTER) val SmtModelQueryEngine queryEngine;
	
	// Trace info
	val SMTDocument document
	val Logic2SmtMapperTrace newTrace;
	val Logic2SMT_TypeMapperInterpretation typeInterpretation
	
	/**
	 * Creates a model builder which queries a logic structure.
	 * @param document The whole SMT2 document.
	 * @param trace The trace of the [Logic problem -> SMT problem] mapping 
	 */
	new(LogicProblem problem, SMTDocument document, Logic2SmtMapper forwardMapper, Logic2SmtMapperTrace forwardTrace) {
		//document.input.typeDeclarations.forEach[typeNames.put(it.name,it)]
		this.document = document
		this.queryEngine = new SmtModelQueryEngine(document)
		this.newTrace = initialiseNewTrace(document,forwardTrace)
		this.typeInterpretation = forwardMapper.typeMapper.getTypeInterpretation(problem,document,this,newTrace)
	}
	
	/**
	 * Creates a new trace from the logic model to the new smt file by using the old trace.
	 */
	def protected Logic2SmtMapperTrace initialiseNewTrace(SMTDocument document, Logic2SmtMapperTrace oldTrace) {
		val i = document.input
		
		val res = new Logic2SmtMapperTrace => [	typeMapperTrace = oldTrace.typeMapperTrace.copy(i) ]
		
		for(entry : oldTrace.relationUnfolding.entrySet) {
			val rel = entry.key
			val descriptors = entry.value.map[old | 
				new Descriptor<Relation>(
					old.parameterTypes.map[copyTypeDescriptor(i)],
					old.relation)
			]
			res.relationUnfolding.put(rel,descriptors)
		}
		
		for(entry : oldTrace.relationMap.entrySet) {
			val desc = new Descriptor<Relation>(
					entry.key.parameterTypes.map[copyTypeDescriptor(i)],
					entry.key.relation)
			val fun = i.functionDeclarations.filter[it.name == entry.value.name].head
			res.relationMap.put(desc,fun)
		}
		
		return res
	}
	
	def private copyTypeDescriptor(TypeDescriptor original, SMTInput i) {
		if(original.complexType == null) return original
		else {
			val newType = i.typeDeclarations.filter[it.name == original.complexType.name].head
			new TypeDescriptor(newType)
		}
	}
	
	/*def protected initialiseTypes(SMTDocument document) {
		val model = document.output.getModelResult as SMTModelResult
		val smtUndefinedType2LogicType = this.newTrace.typeDeclarationMap.bijectiveInverse
		
		for(cardinalityConstraint : model.typeDefinitions) {
			val targetType = (cardinalityConstraint.type as SMTComplexTypeReference).referred as SMTSetTypeDeclaration
			val List<DefinedElement> elementCollection = new LinkedList
			for(element : cardinalityConstraint.elements.map[symbolicReference]) {
				if(element instanceof SMTFunctionDeclaration) {
					val definedElementRepresentation = createDefinedElement => [name += element.name.split("!")]
					newElement2Constants.put(definedElementRepresentation,element)
					newConstants2Elements.put(element,definedElementRepresentation)
				} else{
					throw new UnsupportedOperationException(
						"Unresolvable reference in cardinality constraint: " + element.class.name + ": " + element.name)	
				}
			}
			undefinedTypeDefinitions.put(targetType.lookup(smtUndefinedType2LogicType),elementCollection);
		}
	}*/
	
	def private dispatch ValueType logicLiteral2SmtLiteral(Integer literal) {
		new ValueType(TypeDescriptor::numericTypeDescriptor_Instance, literal)
	}
	def private dispatch ValueType logicLiteral2SmtLiteral(Boolean literal) {
		new ValueType(TypeDescriptor::logicTypeDescriptor_Instance, literal)
	}
	def private dispatch ValueType logicLiteral2SmtLiteral(DefinedElement literal) {
		this.typeInterpretation.logicElement2Smt(literal)
	}

//	def private dispatch Object smt2Literal2LogicLiteral(Integer literal) { literal }
//	def private dispatch Object smt2Literal2LogicLiteral(Boolean literal) { literal }
//	def private dispatch Object smt2Literal2LogicLiteral(SMTSymbolicDeclaration literal) { 
//		this.typeInterpretation.smtElement2Logic(literal)
//	}

	override getElements(Type type) {
		return this.typeInterpretation.getElements(type)
	}
	
	override getInterpretation(FunctionDeclaration function, Object[] parameterSubstitution) {
		/*queryEngine.resolveFunctionDeclaration(
			function.lookup(newTrace.functionDeclarationMap),
			parameterSubstitution.map[logicLiteral2SmtLiteral]
		).smt2Literal2LogicLiteral*/
		throw new UnsupportedOperationException
	}
	
	override getInterpretation(RelationDeclaration relation, Object[] parameterSubstitution) {
		val transformedParameters = parameterSubstitution.map[logicLiteral2SmtLiteral]
		
		val smtFunction = new Descriptor<Relation>(
			transformedParameters.map[descriptor],
			relation)
			.lookup(newTrace.relationMap)
			
		val result = queryEngine.resolveFunctionDeclaration(
			smtFunction as SMTFunctionDeclaration,
			transformedParameters.map[value]
		) as Boolean
		
		return result
	}
	
	override getInterpretation(ConstantDeclaration constant) {
		/*queryEngine.resolveFunctionDeclaration(
			constant.lookup(newTrace.constantDeclarationMap),
			Collections.EMPTY_LIST
		).smt2Literal2LogicLiteral*/
		throw new UnsupportedOperationException
	}
	
	override getAllIntegersInStructure() {
		val res = new TreeSet
		for(literal : document.eAllContents.filter(SMTIntLiteral).toIterable) {
			res += literal.value
			res += -literal.value
		}
		res
	}
	
	override getAllRealsInStructure() {
		val res = new TreeSet
		for(literal : document.eAllContents.filter(SMTRealLiteral).toIterable) {
			res += literal.value.doubleValue
			res += -literal.value.doubleValue
		}
		res
	}
	
	override getAllStringsInStructure() {
		new TreeSet
	}
	
}