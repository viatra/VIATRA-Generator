/**
 */
package hu.bme.mit.inf.dslreasoner.faulttree.model.ft;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ConstantEvent#isFailed <em>Failed</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FtPackage#getConstantEvent()
 * @model
 * @generated
 */
public interface ConstantEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Failed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failed</em>' attribute.
	 * @see #setFailed(boolean)
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FtPackage#getConstantEvent_Failed()
	 * @model
	 * @generated
	 */
	boolean isFailed();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ConstantEvent#isFailed <em>Failed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failed</em>' attribute.
	 * @see #isFailed()
	 * @generated
	 */
	void setFailed(boolean value);

} // ConstantEvent
