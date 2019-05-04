/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Defined Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement#getDefinedInType <em>Defined In Type</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage#getDefinedElement()
 * @model
 * @generated
 */
public interface DefinedElement extends SymbolicDeclaration {

	/**
	 * Returns the value of the '<em><b>Defined In Type</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defined In Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defined In Type</em>' reference list.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage#getDefinedElement_DefinedInType()
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition#getElements
	 * @model opposite="elements"
	 * @generated
	 */
	EList<TypeDefinition> getDefinedInType();
} // DefinedElement
