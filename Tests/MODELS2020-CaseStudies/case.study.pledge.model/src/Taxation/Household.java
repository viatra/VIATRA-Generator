/**
 */
package Taxation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Household</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Taxation.Household#getParents <em>Parents</em>}</li>
 *   <li>{@link Taxation.Household#getId1 <em>Id1</em>}</li>
 *   <li>{@link Taxation.Household#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see Taxation.TaxationPackage#getHousehold()
 * @model
 * @generated
 */
public interface Household extends Tax_Case {
	/**
	 * Returns the value of the '<em><b>Parents</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link Taxation.Legal_Union_Record#getHousehold <em>Household</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parents</em>' containment reference.
	 * @see #setParents(Legal_Union_Record)
	 * @see Taxation.TaxationPackage#getHousehold_Parents()
	 * @see Taxation.Legal_Union_Record#getHousehold
	 * @model opposite="household" containment="true" required="true" ordered="false"
	 * @generated
	 */
	Legal_Union_Record getParents();

	/**
	 * Sets the value of the '{@link Taxation.Household#getParents <em>Parents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parents</em>' containment reference.
	 * @see #getParents()
	 * @generated
	 */
	void setParents(Legal_Union_Record value);

	/**
	 * Returns the value of the '<em><b>Id1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id1</em>' attribute.
	 * @see #setId1(String)
	 * @see Taxation.TaxationPackage#getHousehold_Id1()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getId1();

	/**
	 * Sets the value of the '{@link Taxation.Household#getId1 <em>Id1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id1</em>' attribute.
	 * @see #getId1()
	 * @generated
	 */
	void setId1(String value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link Taxation.Dependent}.
	 * It is bidirectional and its opposite is '{@link Taxation.Dependent#getHousehold <em>Household</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see Taxation.TaxationPackage#getHousehold_Children()
	 * @see Taxation.Dependent#getHousehold
	 * @model opposite="household" containment="true" ordered="false"
	 * @generated
	 */
	EList<Dependent> getChildren();

} // Household
