/**
 */
package TaxationWithRoot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.FD#getDistance_declared_in_january <em>Distance declared in january</em>}</li>
 * </ul>
 *
 * @see TaxationWithRoot.TaxationPackage#getFD()
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
	 * @see TaxationWithRoot.TaxationPackage#getFD_Distance_declared_in_january()
	 * @model required="true"
	 * @generated
	 */
	double getDistance_declared_in_january();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.FD#getDistance_declared_in_january <em>Distance declared in january</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance declared in january</em>' attribute.
	 * @see #getDistance_declared_in_january()
	 * @generated
	 */
	void setDistance_declared_in_january(double value);

} // FD
