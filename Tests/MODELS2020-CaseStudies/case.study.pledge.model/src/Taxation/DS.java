/**
 */
package Taxation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Taxation.DS#getMaximum_deductible_amount <em>Maximum deductible amount</em>}</li>
 *   <li>{@link Taxation.DS#getId3 <em>Id3</em>}</li>
 * </ul>
 *
 * @see Taxation.TaxationPackage#getDS()
 * @model
 * @generated
 */
public interface DS extends EObject {
	/**
	 * Returns the value of the '<em><b>Maximum deductible amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum deductible amount</em>' attribute.
	 * @see #setMaximum_deductible_amount(double)
	 * @see Taxation.TaxationPackage#getDS_Maximum_deductible_amount()
	 * @model required="true"
	 * @generated
	 */
	double getMaximum_deductible_amount();

	/**
	 * Sets the value of the '{@link Taxation.DS#getMaximum_deductible_amount <em>Maximum deductible amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum deductible amount</em>' attribute.
	 * @see #getMaximum_deductible_amount()
	 * @generated
	 */
	void setMaximum_deductible_amount(double value);

	/**
	 * Returns the value of the '<em><b>Id3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id3</em>' attribute.
	 * @see #setId3(String)
	 * @see Taxation.TaxationPackage#getDS_Id3()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getId3();

	/**
	 * Sets the value of the '{@link Taxation.DS#getId3 <em>Id3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id3</em>' attribute.
	 * @see #getId3()
	 * @generated
	 */
	void setId3(String value);

} // DS
