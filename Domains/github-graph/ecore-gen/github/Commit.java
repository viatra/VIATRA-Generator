/**
 */
package github;

import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link github.Commit#getCommitter <em>Committer</em>}</li>
 *   <li>{@link github.Commit#getParents <em>Parents</em>}</li>
 *   <li>{@link github.Commit#getPullrequest <em>Pullrequest</em>}</li>
 *   <li>{@link github.Commit#getCreated_at <em>Created at</em>}</li>
 *   <li>{@link github.Commit#getSha <em>Sha</em>}</li>
 *   <li>{@link github.Commit#getParents_sha <em>Parents sha</em>}</li>
 * </ul>
 *
 * @see github.GithubPackage#getCommit()
 * @model
 * @generated
 */
public interface Commit extends EObject {
	/**
	 * Returns the value of the '<em><b>Committer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Committer</em>' reference.
	 * @see #setCommitter(User)
	 * @see github.GithubPackage#getCommit_Committer()
	 * @model required="true"
	 * @generated
	 */
	User getCommitter();

	/**
	 * Sets the value of the '{@link github.Commit#getCommitter <em>Committer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Committer</em>' reference.
	 * @see #getCommitter()
	 * @generated
	 */
	void setCommitter(User value);

	/**
	 * Returns the value of the '<em><b>Parents</b></em>' reference list.
	 * The list contents are of type {@link github.Commit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parents</em>' reference list.
	 * @see github.GithubPackage#getCommit_Parents()
	 * @model upper="2"
	 * @generated
	 */
	EList<Commit> getParents();

	/**
	 * Returns the value of the '<em><b>Pullrequest</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link github.PullRequest#getCommit <em>Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pullrequest</em>' reference.
	 * @see #setPullrequest(PullRequest)
	 * @see github.GithubPackage#getCommit_Pullrequest()
	 * @see github.PullRequest#getCommit
	 * @model opposite="commit"
	 * @generated
	 */
	PullRequest getPullrequest();

	/**
	 * Sets the value of the '{@link github.Commit#getPullrequest <em>Pullrequest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pullrequest</em>' reference.
	 * @see #getPullrequest()
	 * @generated
	 */
	void setPullrequest(PullRequest value);

	/**
	 * Returns the value of the '<em><b>Created at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created at</em>' attribute.
	 * @see #setCreated_at(Date)
	 * @see github.GithubPackage#getCommit_Created_at()
	 * @model
	 * @generated
	 */
	Date getCreated_at();

	/**
	 * Sets the value of the '{@link github.Commit#getCreated_at <em>Created at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created at</em>' attribute.
	 * @see #getCreated_at()
	 * @generated
	 */
	void setCreated_at(Date value);

	/**
	 * Returns the value of the '<em><b>Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sha</em>' attribute.
	 * @see #setSha(String)
	 * @see github.GithubPackage#getCommit_Sha()
	 * @model required="true"
	 * @generated
	 */
	String getSha();

	/**
	 * Sets the value of the '{@link github.Commit#getSha <em>Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sha</em>' attribute.
	 * @see #getSha()
	 * @generated
	 */
	void setSha(String value);

	/**
	 * Returns the value of the '<em><b>Parents sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parents sha</em>' attribute.
	 * @see #setParents_sha(List)
	 * @see github.GithubPackage#getCommit_Parents_sha()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ENTITIES" many="false"
	 * @generated
	 */
	List<String> getParents_sha();

	/**
	 * Sets the value of the '{@link github.Commit#getParents_sha <em>Parents sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parents sha</em>' attribute.
	 * @see #getParents_sha()
	 * @generated
	 */
	void setParents_sha(List<String> value);

} // Commit
