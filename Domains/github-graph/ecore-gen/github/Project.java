/**
 */
package github;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link github.Project#getIssue <em>Issue</em>}</li>
 *   <li>{@link github.Project#getCreatd_at <em>Creatd at</em>}</li>
 *   <li>{@link github.Project#getDeleted <em>Deleted</em>}</li>
 *   <li>{@link github.Project#getUpdated_at <em>Updated at</em>}</li>
 *   <li>{@link github.Project#getProjectMembers <em>Project Members</em>}</li>
 *   <li>{@link github.Project#getUrl <em>Url</em>}</li>
 *   <li>{@link github.Project#getCommits <em>Commits</em>}</li>
 * </ul>
 *
 * @see github.GithubPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Issue</b></em>' containment reference list.
	 * The list contents are of type {@link github.Issue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue</em>' containment reference list.
	 * @see github.GithubPackage#getProject_Issue()
	 * @model containment="true"
	 * @generated
	 */
	EList<Issue> getIssue();

	/**
	 * Returns the value of the '<em><b>Creatd at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creatd at</em>' attribute.
	 * @see #setCreatd_at(Date)
	 * @see github.GithubPackage#getProject_Creatd_at()
	 * @model
	 * @generated
	 */
	Date getCreatd_at();

	/**
	 * Sets the value of the '{@link github.Project#getCreatd_at <em>Creatd at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creatd at</em>' attribute.
	 * @see #getCreatd_at()
	 * @generated
	 */
	void setCreatd_at(Date value);

	/**
	 * Returns the value of the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deleted</em>' attribute.
	 * @see #setDeleted(int)
	 * @see github.GithubPackage#getProject_Deleted()
	 * @model
	 * @generated
	 */
	int getDeleted();

	/**
	 * Sets the value of the '{@link github.Project#getDeleted <em>Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deleted</em>' attribute.
	 * @see #getDeleted()
	 * @generated
	 */
	void setDeleted(int value);

	/**
	 * Returns the value of the '<em><b>Updated at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated at</em>' attribute.
	 * @see #setUpdated_at(Date)
	 * @see github.GithubPackage#getProject_Updated_at()
	 * @model
	 * @generated
	 */
	Date getUpdated_at();

	/**
	 * Sets the value of the '{@link github.Project#getUpdated_at <em>Updated at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated at</em>' attribute.
	 * @see #getUpdated_at()
	 * @generated
	 */
	void setUpdated_at(Date value);

	/**
	 * Returns the value of the '<em><b>Project Members</b></em>' containment reference list.
	 * The list contents are of type {@link github.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Members</em>' containment reference list.
	 * @see github.GithubPackage#getProject_ProjectMembers()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getProjectMembers();

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see github.GithubPackage#getProject_Url()
	 * @model required="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link github.Project#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Commits</b></em>' containment reference list.
	 * The list contents are of type {@link github.Commit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commits</em>' containment reference list.
	 * @see github.GithubPackage#getProject_Commits()
	 * @model containment="true"
	 * @generated
	 */
	EList<Commit> getCommits();

} // Project
