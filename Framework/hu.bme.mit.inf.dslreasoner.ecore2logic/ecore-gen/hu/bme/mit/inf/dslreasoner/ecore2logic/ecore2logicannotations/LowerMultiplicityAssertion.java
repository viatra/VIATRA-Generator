/**
 */
package hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lower Multiplicity Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.LowerMultiplicityAssertion#getLower <em>Lower</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage#getLowerMultiplicityAssertion()
 * @model
 * @generated
 */
public interface LowerMultiplicityAssertion extends MultiplicityAssertion {
	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see #setLower(int)
	 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsPackage#getLowerMultiplicityAssertion_Lower()
	 * @model required="true"
	 * @generated
	 */
	int getLower();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.LowerMultiplicityAssertion#getLower <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' attribute.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(int value);

} // LowerMultiplicityAssertion
