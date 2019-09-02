package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder

import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSAnd
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSConstant
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSEquality
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFunction
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSFunctionAsTerm
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSOr
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTerm
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSTffFormula
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VLSUniversalQuantifier
import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireModel
import ca.mcgill.ecse.dslreasoner.vampireLanguage.impl.VLSAndImpl
import ca.mcgill.ecse.dslreasoner.vampireLanguage.impl.VLSOrImpl
import ca.mcgill.ecse.dslreasoner.vampireLanguage.impl.VLSUnaryNegationImpl
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicModelInterpretation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.TypeDeclarationImpl
import java.util.HashMap
import java.util.List
import java.util.Map

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class VampireModelInterpretation implements LogicModelInterpretation {
	protected val extension LogiclanguageFactory factory = LogiclanguageFactory.eINSTANCE

	protected val Logic2VampireLanguageMapperTrace forwardTrace;

	private val Map<String, DefinedElement> name2DefinedElement = new HashMap
	private val Map<TypeDeclaration, List<DefinedElement>> type2DefinedElement = new HashMap

	var num = -1

	public new(VampireModel model, Logic2VampireLanguageMapperTrace trace) {
		this.forwardTrace = trace

		// 1. look at "finite_domain" formula (there should only be one)
		// IN REALITY THE DEFINED ELEMENTS ARE DEFINED AS <nameOfDefinedEement>:$i
		// SPECIFICALLY, THESE ARE "TYPE" FORMULAS
		val finDomFormula = model.tfformulas.filter[name == "finite_domain"].get(0) as VLSTffFormula
		val univQuant = finDomFormula.fofFormula as VLSUniversalQuantifier
		var orFormulaTerm = univQuant.operand

		var end = false
		while (!end) {
			if (orFormulaTerm.class == VLSOrImpl) {
				val orFormula = orFormulaTerm as VLSOr
				val orRight = orFormula.right as VLSEquality
				add2ConstDefMap(orRight)
				orFormulaTerm = orFormula.left
			} else {
				val firstTerm = orFormulaTerm as VLSEquality
				add2ConstDefMap(firstTerm)
				end = true
			}

		}

		// 2. associate each type to defined elements
//		println(trace.type2Predicate.keySet)
//		println(trace.type2Predicate.keySet.length)
//		println(trace.type2Predicate.keySet.filter[class == TypeDeclarationImpl])
//		println(trace.type2Predicate.keySet.filter[class == TypeDeclarationImpl].length)
//		println()
//		println(trace.type2Predicate)
		// Fill keys of map
		val allTypeDecls = trace.type2Predicate.keySet.filter[class == TypeDeclarationImpl]
		val allTypeFunctions = trace.predicate2Type

		for (type : allTypeDecls) {
			type2DefinedElement.put(type as TypeDeclaration, newArrayList)
		}

		// USE THE DECLARE_<TYPE_NAME> FORMULAS TO SEE WHAT THE TYPES ARE
		val typeFormulas = model.tfformulas.filter[name.length > 12 && name.substring(0, 12) == "predicate_t_"]
		// ^this way, we ignore the "object" type
		//TODO potentially need to handle the enums in this case as well
		for (formula : typeFormulas) {
			// get associated type
			val associatedTypeName = (formula as VLSTffFormula).name.substring(10)
			val associatedFunction = allTypeFunctions.keySet.filter[constant == associatedTypeName].
				get(0) as VLSFunction
			val associatedTypeAll = associatedFunction.lookup(allTypeFunctions)
//			val associatedTypeDeclFormula = model.tfformulas.filter[name == ("declare_t_" + associatedTypeName)].get(0) as VLSTffFormula
//			val associatedTypeDefn = associatedTypeDeclFormula.fofFormula as VLSOtherDeclaration
//			val associatedTypeFct = associatedTypeDefn.name as VLSConstant
			if (associatedTypeAll.class == TypeDeclarationImpl) {
				val associatedType = associatedTypeAll as TypeDeclaration

				// get definedElements
				var andFormulaTerm = formula.fofFormula
				end = false
				val List<DefinedElement> instances = newArrayList
				while (!end) {
					if (andFormulaTerm.class == VLSAndImpl) {
						val andFormula = andFormulaTerm as VLSAnd
						val andRight = andFormula.right
						addIfNotNeg(andRight, instances)
						andFormulaTerm = andFormula.left
					} else {
						addIfNotNeg(andFormulaTerm as VLSTerm, instances)
						end = true
					}

				}
				for (elem : instances) {
					associatedType.lookup(type2DefinedElement).add(elem)
				}
			}
		}

		printMap()

	}

	def printMap() {
		for (key : type2DefinedElement.keySet) {
			println(key.name + "==>")
			for (elem : key.lookup(type2DefinedElement)) {
				print(elem.name + ", ")
			}
			println()

		}
		println()
	}

	def private addIfNotNeg(VLSTerm term, List<DefinedElement> list) {
		if (term.class != VLSUnaryNegationImpl) {
			val nodeName = ((term as VLSFunction).terms.get(0) as VLSFunctionAsTerm).functor
			val defnElem = nodeName.lookup(name2DefinedElement)
			list.add(defnElem)
		}
	}

	def private add2ConstDefMap(VLSEquality eq) {
		val defElemConst = (eq.right as VLSConstant)
		val definedElement = createDefinedElement => [name = defElemConst.name]
		this.name2DefinedElement.put(defElemConst.name, definedElement)
	}

	override getElements(Type type) { getElementsDispatch(type) }

	def private dispatch getElementsDispatch(TypeDeclaration declaration) {
		return declaration.lookup(this.type2DefinedElement)
	}

	def private dispatch getElementsDispatch(TypeDefinition declaration) { return declaration.elements }

	override getInterpretation(FunctionDeclaration function, Object[] parameterSubstitution) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override getInterpretation(RelationDeclaration relation, Object[] parameterSubstitution) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override getInterpretation(ConstantDeclaration constant) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override getAllIntegersInStructure() {
		return null
	}

	override getAllRealsInStructure() {
		return null
	}

	override getAllStringsInStructure() {
		return null
	}

}
