/**
 */
package socialnetwork;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link socialnetwork.Person#getFriends <em>Friends</em>}</li>
 *   <li>{@link socialnetwork.Person#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see socialnetwork.SocialnetworkPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Friends</b></em>' reference list.
	 * The list contents are of type {@link socialnetwork.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friends</em>' reference list.
	 * @see socialnetwork.SocialnetworkPackage#getPerson_Friends()
	 * @model
	 * @generated
	 */
	EList<Person> getFriends();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Name"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see socialnetwork.SocialnetworkPackage#getPerson_Name()
	 * @model default="Name"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link socialnetwork.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Person
