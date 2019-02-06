/**
 */
package hu.bme.mit.inf.dslreasoner.faulttree.model.cft;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intput Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.IntputEvent#isMultiple <em>Multiple</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage#getIntputEvent()
 * @model
 * @generated
 */
public interface IntputEvent extends EventDeclaration {
	/**
	 * Returns the value of the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple</em>' attribute.
	 * @see #setMultiple(boolean)
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage#getIntputEvent_Multiple()
	 * @model
	 * @generated
	 */
	boolean isMultiple();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.IntputEvent#isMultiple <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple</em>' attribute.
	 * @see #isMultiple()
	 * @generated
	 */
	void setMultiple(boolean value);

} // IntputEvent
