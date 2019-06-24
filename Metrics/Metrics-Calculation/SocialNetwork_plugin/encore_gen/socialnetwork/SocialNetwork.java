/**
 */
package socialnetwork;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Social Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link socialnetwork.SocialNetwork#getName <em>Name</em>}</li>
 *   <li>{@link socialnetwork.SocialNetwork#getPersons <em>Persons</em>}</li>
 * </ul>
 *
 * @see socialnetwork.SocialnetworkPackage#getSocialNetwork()
 * @model
 * @generated
 */
public interface SocialNetwork extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"SocialNetwork"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see socialnetwork.SocialnetworkPackage#getSocialNetwork_Name()
	 * @model default="SocialNetwork"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link socialnetwork.SocialNetwork#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link socialnetwork.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see socialnetwork.SocialnetworkPackage#getSocialNetwork_Persons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPersons();

} // SocialNetwork
