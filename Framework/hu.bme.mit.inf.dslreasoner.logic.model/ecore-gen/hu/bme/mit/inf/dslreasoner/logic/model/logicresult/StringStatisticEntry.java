/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logicresult;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Statistic Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.StringStatisticEntry#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultPackage#getStringStatisticEntry()
 * @model
 * @generated
 */
public interface StringStatisticEntry extends StatisticEntry {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"Unfilled"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultPackage#getStringStatisticEntry_Value()
	 * @model default="Unfilled" required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.StringStatisticEntry#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // StringStatisticEntry
