/**
 */
package Taxation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Taxation.FD#getDistance_declared_in_january <em>Distance declared in january</em>}</li>
 *   <li>{@link Taxation.FD#getCalculated_distance <em>Calculated distance</em>}</li>
 * </ul>
 *
 * @see Taxation.TaxationPackage#getFD()
 * @model
 * @generated
 */
public interface FD extends Professional_Expenses_Deduction {
	/**
	 * Returns the value of the '<em><b>Distance declared in january</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance declared in january</em>' attribute.
	 * @see #setDistance_declared_in_january(double)
	 * @see Taxation.TaxationPackage#getFD_Distance_declared_in_january()
	 * @model required="true"
	 * @generated
	 */
	double getDistance_declared_in_january();

	/**
	 * Sets the value of the '{@link Taxation.FD#getDistance_declared_in_january <em>Distance declared in january</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance declared in january</em>' attribute.
	 * @see #getDistance_declared_in_january()
	 * @generated
	 */
	void setDistance_declared_in_january(double value);

	/**
	 * Returns the value of the '<em><b>Calculated distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculated distance</em>' attribute.
	 * @see #setCalculated_distance(double)
	 * @see Taxation.TaxationPackage#getFD_Calculated_distance()
	 * @model required="true" derived="true"
	 * @generated
	 */
	double getCalculated_distance();

	/**
	 * Sets the value of the '{@link Taxation.FD#getCalculated_distance <em>Calculated distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculated distance</em>' attribute.
	 * @see #getCalculated_distance()
	 * @generated
	 */
	void setCalculated_distance(double value);

} // FD
