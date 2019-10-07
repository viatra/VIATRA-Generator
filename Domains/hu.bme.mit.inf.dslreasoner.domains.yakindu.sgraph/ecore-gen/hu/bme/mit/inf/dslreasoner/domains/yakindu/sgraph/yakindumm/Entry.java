/**
 */
package hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.Entry#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage#getEntry()
 * @model
 * @generated
 */
public interface Entry extends Pseudostate {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.EntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.EntryType
	 * @see #setType(EntryType)
	 * @see hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage#getEntry_Type()
	 * @model
	 * @generated
	 */
	EntryType getType();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.Entry#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.EntryType
	 * @see #getType()
	 * @generated
	 */
	void setType(EntryType value);
} // Entry
