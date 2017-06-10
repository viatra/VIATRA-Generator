/**
 */
package hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Upper Multiplicity Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.UpperMultiplicityAssertion#getUpper <em>Upper</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage#getUpperMultiplicityAssertion()
 * @model
 * @generated
 */
public interface UpperMultiplicityAssertion extends MultiplicityAssertion {
	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see #setUpper(int)
	 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage#getUpperMultiplicityAssertion_Upper()
	 * @model required="true"
	 * @generated
	 */
	int getUpper();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.UpperMultiplicityAssertion#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(int value);

} // UpperMultiplicityAssertion
