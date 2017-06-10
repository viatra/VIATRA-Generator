/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference#getReferred <em>Referred</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage#getComplexTypeReference()
 * @model
 * @generated
 */
public interface ComplexTypeReference extends TypeReference {
	/**
	 * Returns the value of the '<em><b>Referred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred</em>' reference.
	 * @see #setReferred(Type)
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage#getComplexTypeReference_Referred()
	 * @model
	 * @generated
	 */
	Type getReferred();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference#getReferred <em>Referred</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred</em>' reference.
	 * @see #getReferred()
	 * @generated
	 */
	void setReferred(Type value);

} // ComplexTypeReference
