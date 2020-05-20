package hu.bme.mit.inf.dslreasoner.logic.model.builder

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TermDescription
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition
import java.math.BigDecimal
import java.util.List
import java.util.Map
import java.util.SortedSet
import java.util.TreeSet

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

interface LogicModelInterpretation {

	/**
	 * Returns the elements of a type.
	 */
	def List<DefinedElement> getElements(Type type)

	/**
	 * Returns the interpretation of a function. The parameters and the return values are encoded to primitive java objects defined by the following table:
	 * <p><table>
	 * <tr><th>Term type</th><th>Java object type</th></tr>
	 * <tr><td>Element of a type </td><td>DefinedElement </td></tr>
	 * <tr><td>Boolean literal </td><td>Boolean </td></tr>
	 * <tr><td>Integer literal </td><td>Integer </td></tr>
	 * <tr><td>Real literal </td><td>BigDecimal </td></tr>
	 * <tr><td>String literal </td><td>String </td></tr>
	 * </table></p>
	 * @param function The target function to be interpreted.
	 * @param parameterSubstitution The array of the substituted parameters encoded as defined in the table.
	 * @return The result of the function call encoded as defined in the table.
	 */
	def Object getInterpretation(FunctionDeclaration function, Object[] parameterSubstitution)

	/**
	 * Returns the interpretation of a relation. The parameters are encoded to primitive java objects defined by the following table:
	 * <p><table>
	 * <tr><th>Term type</th><th>Java object type</th></tr>
	 * <tr><td>Element of a type </td><td>DefinedElement </td></tr>
	 * <tr><td>Boolean literal </td><td>Boolean </td></tr>
	 * <tr><td>Integer literal </td><td>Integer </td></tr>
	 * <tr><td>Real literal </td><td>BigDecimal </td></tr>
	 * <tr><td>String literal </td><td>String </td></tr>
	 * </table></p>
	 * @param relation The target relation to be interpreted.
	 * @param parameterSubstitution The array of the substituted parameters encoded as defined in the table.
	 * @return If the parameter tuple is in the relation.
	 */
	def boolean getInterpretation(RelationDeclaration relation, Object[] parameterSubstitution)

	/**
	 * Returns the interpretation of a constant. The value is encoded to primitive java objects defined by the following table:
	 * <p><table>
	 * <tr><th>Term type</th><th>Java object type</th></tr>
	 * <tr><td>Element of a type </td><td>DefinedElement </td></tr>
	 * <tr><td>Boolean literal </td><td>Boolean </td></tr>
	 * <tr><td>Integer literal </td><td>Integer </td></tr>
	 * <tr><td>Real literal </td><td>BigDecimal </td></tr>
	 * <tr><td>String literal </td><td>String </td></tr>
	 * </table></p>
	 * @param constant The target constant to be interpreted.
	 * @return The value of the constant encoded as specified in the table.
	 */
	def Object getInterpretation(ConstantDeclaration constant)

	/**
	 * Returns all integers relevant to the logic structure. Not all integer is necessarily used.
	 */
	def SortedSet<Integer> getAllIntegersInStructure()

	def Map<TermDescription, Integer> getAllIntegersWithInterpretation() {
		allIntegersInStructure.toMap [ integer |
			(LogiclanguageFactory.eINSTANCE.createIntLiteral => [value = integer]) as TermDescription
		]
	}

	/**
	 * Returns all real numbers relevant to the logic structure. Not all integer is necessarily used.
	 */
	def SortedSet<BigDecimal> getAllRealsInStructure()

	def Map<TermDescription, BigDecimal> getAllRealsWithInterpretation() {
		allRealsInStructure.toMap [ real |
			(LogiclanguageFactory.eINSTANCE.createRealLiteral => [value = real]) as TermDescription
		]
	}

	/**
	 * Returns all string values relevant to the logic structure. Not all integer is necessarily used.
	 */
	def SortedSet<String> getAllStringsInStructure()
	
	def Map<TermDescription, String> getAllStringsWithInterpretation() {
		allStringsInStructure.toMap [ string |
			(LogiclanguageFactory.eINSTANCE.createStringLiteral => [value = string]) as TermDescription
		]
	}
	
	def SortedSet<Boolean> getAllBooleansInStructure() {
		new TreeSet(#{true, false})
	}
	
	def Map<TermDescription, Boolean> getAllBooleansWithInterpretation() {
		allBooleansInStructure.toMap [ bool |
			(LogiclanguageFactory.eINSTANCE.createBoolLiteral => [value = bool]) as TermDescription
		]
	}
}

class Uninterpreted implements LogicModelInterpretation {
	/*private val static unknownBecauseUninterpreted = LogiclanguageFactory.eINSTANCE.createUnknownBecauseUninterpreted
	 public def static getUnknownBecauseUninterpreted() {return Uninterpreted.unknownBecauseUninterpreted}*/
	override getElements(Type type) {
		throw new UnsupportedOperationException("The interpteration is unknown.")
	}

	def getKnownElements(Type type) {
		val allSubtypes = type.transitiveClosureStar[it.subtypes]
		return allSubtypes.filter(TypeDefinition).map[elements].flatten.toList
	}

	def allElementsAreInterpreted(Type type) {
		val allSubtypes = type.transitiveClosureStar[it.subtypes]
		return allSubtypes.exists[it instanceof TypeDeclaration]
	}

	override getInterpretation(FunctionDeclaration function, Object[] parameterSubstitution) {
		throw new UnsupportedOperationException("The interpteration is unknown.")
	}

	override getInterpretation(RelationDeclaration relation, Object[] parameterSubstitution) {
		throw new UnsupportedOperationException("The interpteration is unknown.")
	}

	override getInterpretation(ConstantDeclaration constant) {
		throw new UnsupportedOperationException("The interpteration is unknown.")
	}

	override getAllIntegersInStructure() {
		throw new UnsupportedOperationException("The interpteration is unknown.")
	}

	override getAllRealsInStructure() {
		throw new UnsupportedOperationException("The interpteration is unknown.")
	}

	override getAllStringsInStructure() {
		throw new UnsupportedOperationException("The interpteration is unknown.")
	}
}
