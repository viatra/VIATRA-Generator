/**
 */
package ca.mcgill.ecse.dslreasoner.vampire.yakindumm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.vampire.yakindumm.Entry#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.ecse.dslreasoner.vampire.yakindumm.YakindummPackage#getEntry()
 * @model
 * @generated
 */
public interface Entry extends Pseudostate {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.mcgill.ecse.dslreasoner.vampire.yakindumm.EntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ca.mcgill.ecse.dslreasoner.vampire.yakindumm.EntryType
	 * @see #setType(EntryType)
	 * @see ca.mcgill.ecse.dslreasoner.vampire.yakindumm.YakindummPackage#getEntry_Type()
	 * @model required="true"
	 * @generated
	 */
	EntryType getType();

	/**
	 * Sets the value of the '{@link ca.mcgill.ecse.dslreasoner.vampire.yakindumm.Entry#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ca.mcgill.ecse.dslreasoner.vampire.yakindumm.EntryType
	 * @see #getType()
	 * @generated
	 */
	void setType(EntryType value);

} // Entry
