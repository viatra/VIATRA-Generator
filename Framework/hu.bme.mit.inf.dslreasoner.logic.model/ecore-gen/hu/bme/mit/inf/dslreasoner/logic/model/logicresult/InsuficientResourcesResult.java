/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logicresult;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insuficient Resources Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.InsuficientResourcesResult#getResourceName <em>Resource Name</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultPackage#getInsuficientResourcesResult()
 * @model
 * @generated
 */
public interface InsuficientResourcesResult extends UnknownResult {
	/**
	 * Returns the value of the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Name</em>' attribute.
	 * @see #setResourceName(String)
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultPackage#getInsuficientResourcesResult_ResourceName()
	 * @model required="true"
	 * @generated
	 */
	String getResourceName();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.InsuficientResourcesResult#getResourceName <em>Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Name</em>' attribute.
	 * @see #getResourceName()
	 * @generated
	 */
	void setResourceName(String value);

} // InsuficientResourcesResult
