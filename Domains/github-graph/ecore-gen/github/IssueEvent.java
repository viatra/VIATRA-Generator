/**
 */
package github;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link github.IssueEvent#getUser <em>User</em>}</li>
 *   <li>{@link github.IssueEvent#getAction <em>Action</em>}</li>
 *   <li>{@link github.IssueEvent#getCreated_at <em>Created at</em>}</li>
 *   <li>{@link github.IssueEvent#getActor_url <em>Actor url</em>}</li>
 * </ul>
 *
 * @see github.GithubPackage#getIssueEvent()
 * @model
 * @generated
 */
public interface IssueEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see github.GithubPackage#getIssueEvent_User()
	 * @model required="true"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link github.IssueEvent#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link github.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see github.Action
	 * @see #setAction(Action)
	 * @see github.GithubPackage#getIssueEvent_Action()
	 * @model
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link github.IssueEvent#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see github.Action
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Created at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created at</em>' attribute.
	 * @see #setCreated_at(Date)
	 * @see github.GithubPackage#getIssueEvent_Created_at()
	 * @model
	 * @generated
	 */
	Date getCreated_at();

	/**
	 * Sets the value of the '{@link github.IssueEvent#getCreated_at <em>Created at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created at</em>' attribute.
	 * @see #getCreated_at()
	 * @generated
	 */
	void setCreated_at(Date value);

	/**
	 * Returns the value of the '<em><b>Actor url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor url</em>' attribute.
	 * @see #setActor_url(String)
	 * @see github.GithubPackage#getIssueEvent_Actor_url()
	 * @model required="true"
	 * @generated
	 */
	String getActor_url();

	/**
	 * Sets the value of the '{@link github.IssueEvent#getActor_url <em>Actor url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor url</em>' attribute.
	 * @see #getActor_url()
	 * @generated
	 */
	void setActor_url(String value);

} // IssueEvent
