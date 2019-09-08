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
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.RelationDeclarationImpl
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.TypeDeclarationImpl
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.TypeDefinitionImpl
import java.util.Arrays
import java.util.HashMap
import java.util.List
import java.util.Map

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
import java.util.concurrent.TimeUnit

class VampireModelInterpretation implements LogicModelInterpretation {
	protected val extension LogiclanguageFactory factory = LogiclanguageFactory.eINSTANCE

	protected val Logic2VampireLanguageMapperTrace forwardTrace;

	// These three maps capture all the information found in the Vampire output
	private val Map<String, DefinedElement> name2DefinedElement = new HashMap
	private val Map<TypeDeclaration, List<DefinedElement>> type2DefinedElement = new HashMap
	private val Map<RelationDeclaration, List<String[]>> relDec2Inst = new HashMap
	private val Map<RelationDefinition, List<String[]>> relDef2Inst = new HashMap

	// end
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
		println(trace.type2Predicate.keySet)
		val allTypeDecls = trace.type2Predicate.keySet.filter[class == TypeDeclarationImpl]
		val allTypeFunctions = trace.predicate2Type
		println(trace.type2Predicate.keySet.filter[class == TypeDefinitionImpl])

		for (type : allTypeDecls) {
			type2DefinedElement.put(type as TypeDeclaration, newArrayList)
		}

		// USE THE DECLARE_<TYPE_NAME> FORMULAS TO SEE WHAT THE TYPES ARE
		val typeFormulas = model.tfformulas.filter [
			name.length > 12 && (name.substring(0, 12) == "predicate_t_" || name.substring(0, 12) == "predicate_e_")
		]
		// ^this way, we ignore the "object" type
		// TODO potentially need to handle the enums in this case as well
		for (formula : typeFormulas) {
			// get associated type
			val associatedTypeName = (formula as VLSTffFormula).name.substring(10)
			print(associatedTypeName)
			val associatedFunctions = allTypeFunctions.keySet.filter[constant == associatedTypeName]
			if (associatedFunctions.length > 0) {
				val associatedFunction = associatedFunctions.get(0) as VLSFunction
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

		}

		printMap()

		// 3. get relations
		// Fill keys of map
		val allRelDecls = trace.rel2Predicate.keySet
		val allRelDefns = trace.relDef2Predicate.keySet
		val allRelDeclFunctions = trace.predicate2Relation
		val allRelDefnFunctions = trace.predicate2RelDef

		for (rel : allRelDecls) {
			relDec2Inst.put(rel as RelationDeclaration, newArrayList)
		}

		for (rel : allRelDefns) {
			relDef2Inst.put(rel as RelationDefinition, newArrayList)
		}

		// USE THE DECLARE_<RELATION_NAME> FORMULAS TO SEE WHAT THE RELATIONS ARE
		val relFormulas = model.tfformulas.filter[name.length > 12 && name.substring(0, 12) == "predicate_r_"]

		for (formula : relFormulas) {
			// get associated type
			val associatedRelName = (formula as VLSTffFormula).name.substring(10)

			// TRY FOR DECLARATION
			val associatedRelFunctionList = allRelDeclFunctions.keySet.filter[constant == associatedRelName]
			if (associatedRelFunctionList.isEmpty) {
				// THEN IT IS NOT A DECLARATION
			} else {
				val associatedRelFunction = associatedRelFunctionList.get(0) as VLSFunction // ASSUMING ONLY 1 SATISFIES QUERY
				val associatedRel = associatedRelFunction.lookup(allRelDeclFunctions) as RelationDeclaration

				// get definedElements
				var andFormulaTerm = formula.fofFormula
				end = false
				val List<String[]> instances = newArrayList
				while (!end) {
					if (andFormulaTerm.class == VLSAndImpl) {
						val andFormula = andFormulaTerm as VLSAnd
						val andRight = andFormula.right
						addRelIfNotNeg(andRight, instances)
						andFormulaTerm = andFormula.left
					} else {
						addRelIfNotNeg(andFormulaTerm as VLSTerm, instances)
						end = true
					}

				}
				for (elem : instances) {
					associatedRel.lookup(relDec2Inst).add(elem)
				}

			}

		}

//		printMap2()
	}

	def printMap() {
		println("------------------")
		for (key : type2DefinedElement.keySet) {
			println(key.name + "==>")
			for (elem : key.lookup(type2DefinedElement)) {
				print(elem.name + ", ")
			}
			println()

		}
		println()
	}

	def printMap2() {
		println("------------------")
		for (key : relDec2Inst.keySet) {
			println(key.name + "==>")
			for (elem : key.lookup(relDec2Inst)) {
				print("[" + elem.get(0) + "-" + elem.get(1) + "], ")
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

	def private addRelIfNotNeg(VLSTerm term, List<String[]> list) {
		if (term.class != VLSUnaryNegationImpl) {
			val nodeName1 = ((term as VLSFunction).terms.get(0) as VLSFunctionAsTerm).functor
			val nodeName2 = ((term as VLSFunction).terms.get(1) as VLSFunctionAsTerm).functor
			val strArr = newArrayList(nodeName1, nodeName2)
			list.add(strArr)
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
		print("-- " + relation.name)
		val node1 = (parameterSubstitution.get(0) as DefinedElement).name
		val node2 = (parameterSubstitution.get(1) as DefinedElement).name
		val realRelations = relation.lookup(relDec2Inst)
		for (real : realRelations) {
			if (real.contains(node1) && real.contains(node2)) {
				println("  true")
				TimeUnit.SECONDS.sleep(1)
				return true
			}
		}
		println("  false")
		TimeUnit.SECONDS.sleep(1)
		return false
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

/**
 * Helper class for efficiently matching parameter substitutions for functions and relations.
 */
class ParameterSubstitution {
	val Object[] data;

	new(Object[] data) {
		this.data = data
	}

	override equals(Object obj) {
		if(obj === this) return true else if(obj == null) return false
		if (obj instanceof ParameterSubstitution) {
			return Arrays.equals(this.data, obj.data)
		}
		return false
	}

	override hashCode() {
		Arrays.hashCode(data)
	}
}
