/**
 */
package github;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pull Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link github.PullRequest#getCommit <em>Commit</em>}</li>
 *   <li>{@link github.PullRequest#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see github.GithubPackage#getPullRequest()
 * @model
 * @generated
 */
public interface PullRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Commit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link github.Commit#getPullrequest <em>Pullrequest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commit</em>' reference.
	 * @see #setCommit(Commit)
	 * @see github.GithubPackage#getPullRequest_Commit()
	 * @see github.Commit#getPullrequest
	 * @model opposite="pullrequest"
	 * @generated
	 */
	Commit getCommit();

	/**
	 * Sets the value of the '{@link github.PullRequest#getCommit <em>Commit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commit</em>' reference.
	 * @see #getCommit()
	 * @generated
	 */
	void setCommit(Commit value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see github.GithubPackage#getPullRequest_Url()
	 * @model required="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link github.PullRequest#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

} // PullRequest
