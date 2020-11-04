/**
 */
package github;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link github.Issue#getPullrequest <em>Pullrequest</em>}</li>
 *   <li>{@link github.Issue#getIssueevent <em>Issueevent</em>}</li>
 *   <li>{@link github.Issue#getCreated_at <em>Created at</em>}</li>
 *   <li>{@link github.Issue#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see github.GithubPackage#getIssue()
 * @model
 * @generated
 */
public interface Issue extends EObject {
	/**
	 * Returns the value of the '<em><b>Pullrequest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pullrequest</em>' containment reference.
	 * @see #setPullrequest(PullRequest)
	 * @see github.GithubPackage#getIssue_Pullrequest()
	 * @model containment="true"
	 * @generated
	 */
	PullRequest getPullrequest();

	/**
	 * Sets the value of the '{@link github.Issue#getPullrequest <em>Pullrequest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pullrequest</em>' containment reference.
	 * @see #getPullrequest()
	 * @generated
	 */
	void setPullrequest(PullRequest value);

	/**
	 * Returns the value of the '<em><b>Issueevent</b></em>' containment reference list.
	 * The list contents are of type {@link github.IssueEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issueevent</em>' containment reference list.
	 * @see github.GithubPackage#getIssue_Issueevent()
	 * @model containment="true"
	 * @generated
	 */
	EList<IssueEvent> getIssueevent();

	/**
	 * Returns the value of the '<em><b>Created at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created at</em>' attribute.
	 * @see #setCreated_at(Date)
	 * @see github.GithubPackage#getIssue_Created_at()
	 * @model
	 * @generated
	 */
	Date getCreated_at();

	/**
	 * Sets the value of the '{@link github.Issue#getCreated_at <em>Created at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created at</em>' attribute.
	 * @see #getCreated_at()
	 * @generated
	 */
	void setCreated_at(Date value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see github.GithubPackage#getIssue_Url()
	 * @model required="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link github.Issue#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

} // Issue
