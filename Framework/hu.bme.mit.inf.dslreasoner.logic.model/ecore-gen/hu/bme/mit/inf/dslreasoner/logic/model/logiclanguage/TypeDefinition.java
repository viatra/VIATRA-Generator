/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition#getElements <em>Elements</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition#getDefines <em>Defines</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage#getTypeDefinition()
 * @model
 * @generated
 */
public interface TypeDefinition extends Type {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement#getDefinedInType <em>Defined In Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage#getTypeDefinition_Elements()
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement#getDefinedInType
	 * @model opposite="definedInType"
	 * @generated
	 */
	EList<DefinedElement> getElements();

	/**
	 * Returns the value of the '<em><b>Defines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defines</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defines</em>' reference.
	 * @see #setDefines(TypeDeclaration)
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage#getTypeDefinition_Defines()
	 * @model
	 * @generated
	 */
	TypeDeclaration getDefines();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition#getDefines <em>Defines</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defines</em>' reference.
	 * @see #getDefines()
	 * @generated
	 */
	void setDefines(TypeDeclaration value);

} // TypeDefinition
