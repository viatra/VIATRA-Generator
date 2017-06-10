/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logicresult;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult#getMaxInteger <em>Max Integer</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult#getMinInteger <em>Min Integer</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultPackage#getModelResult()
 * @model
 * @generated
 */
public interface ModelResult extends LogicResult {
	/**
	 * Returns the value of the '<em><b>Max Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Integer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Integer</em>' attribute.
	 * @see #setMaxInteger(int)
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultPackage#getModelResult_MaxInteger()
	 * @model required="true"
	 * @generated
	 */
	int getMaxInteger();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult#getMaxInteger <em>Max Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Integer</em>' attribute.
	 * @see #getMaxInteger()
	 * @generated
	 */
	void setMaxInteger(int value);

	/**
	 * Returns the value of the '<em><b>Min Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Integer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Integer</em>' attribute.
	 * @see #setMinInteger(int)
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultPackage#getModelResult_MinInteger()
	 * @model required="true"
	 * @generated
	 */
	int getMinInteger();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.ModelResult#getMinInteger <em>Min Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Integer</em>' attribute.
	 * @see #getMinInteger()
	 * @generated
	 */
	void setMinInteger(int value);

} // ModelResult
