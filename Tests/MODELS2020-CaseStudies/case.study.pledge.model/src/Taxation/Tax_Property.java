/**
 */
package Taxation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tax Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Taxation.Tax_Property#getStarting_year <em>Starting year</em>}</li>
 *   <li>{@link Taxation.Tax_Property#getId10 <em>Id10</em>}</li>
 *   <li>{@link Taxation.Tax_Property#getUnion_record <em>Union record</em>}</li>
 * </ul>
 *
 * @see Taxation.TaxationPackage#getTax_Property()
 * @model
 * @generated
 */
public interface Tax_Property extends EObject {
	/**
	 * Returns the value of the '<em><b>Starting year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting year</em>' attribute.
	 * @see #setStarting_year(int)
	 * @see Taxation.TaxationPackage#getTax_Property_Starting_year()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getStarting_year();

	/**
	 * Sets the value of the '{@link Taxation.Tax_Property#getStarting_year <em>Starting year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting year</em>' attribute.
	 * @see #getStarting_year()
	 * @generated
	 */
	void setStarting_year(int value);

	/**
	 * Returns the value of the '<em><b>Id10</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id10</em>' attribute.
	 * @see #setId10(String)
	 * @see Taxation.TaxationPackage#getTax_Property_Id10()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getId10();

	/**
	 * Sets the value of the '{@link Taxation.Tax_Property#getId10 <em>Id10</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id10</em>' attribute.
	 * @see #getId10()
	 * @generated
	 */
	void setId10(String value);

	/**
	 * Returns the value of the '<em><b>Union record</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Taxation.Legal_Union_Record#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Union record</em>' container reference.
	 * @see #setUnion_record(Legal_Union_Record)
	 * @see Taxation.TaxationPackage#getTax_Property_Union_record()
	 * @see Taxation.Legal_Union_Record#getProperties
	 * @model opposite="properties" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Legal_Union_Record getUnion_record();

	/**
	 * Sets the value of the '{@link Taxation.Tax_Property#getUnion_record <em>Union record</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Union record</em>' container reference.
	 * @see #getUnion_record()
	 * @generated
	 */
	void setUnion_record(Legal_Union_Record value);

} // Tax_Property
