/**
 */
package github;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see github.GithubFactory
 * @model kind="package"
 * @generated
 */
public interface GithubPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "github";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "sure.ghtorrent.github";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "github";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GithubPackage eINSTANCE = github.impl.GithubPackageImpl.init();

	/**
	 * The meta object id for the '{@link github.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see github.impl.UserImpl
	 * @see github.impl.GithubPackageImpl#getUser()
	 * @generated
	 */
	int USER = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__URL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 1;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link github.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see github.impl.ProjectImpl
	 * @see github.impl.GithubPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ISSUE = 0;

	/**
	 * The feature id for the '<em><b>Creatd at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CREATD_AT = 1;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DELETED = 2;

	/**
	 * The feature id for the '<em><b>Updated at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__UPDATED_AT = 3;

	/**
	 * The feature id for the '<em><b>Project Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_MEMBERS = 4;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__URL = 5;

	/**
	 * The feature id for the '<em><b>Commits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__COMMITS = 6;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link github.impl.CommitImpl <em>Commit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see github.impl.CommitImpl
	 * @see github.impl.GithubPackageImpl#getCommit()
	 * @generated
	 */
	int COMMIT = 2;

	/**
	 * The feature id for the '<em><b>Committer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__COMMITTER = 0;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__PARENTS = 1;

	/**
	 * The feature id for the '<em><b>Pullrequest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__PULLREQUEST = 2;

	/**
	 * The feature id for the '<em><b>Created at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__CREATED_AT = 3;

	/**
	 * The feature id for the '<em><b>Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__SHA = 4;

	/**
	 * The feature id for the '<em><b>Parents sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__PARENTS_SHA = 5;

	/**
	 * The number of structural features of the '<em>Commit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Commit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link github.impl.IssueImpl <em>Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see github.impl.IssueImpl
	 * @see github.impl.GithubPackageImpl#getIssue()
	 * @generated
	 */
	int ISSUE = 3;

	/**
	 * The feature id for the '<em><b>Pullrequest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__PULLREQUEST = 0;

	/**
	 * The feature id for the '<em><b>Issueevent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ISSUEEVENT = 1;

	/**
	 * The feature id for the '<em><b>Created at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CREATED_AT = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__URL = 3;

	/**
	 * The number of structural features of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link github.impl.PullRequestImpl <em>Pull Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see github.impl.PullRequestImpl
	 * @see github.impl.GithubPackageImpl#getPullRequest()
	 * @generated
	 */
	int PULL_REQUEST = 4;

	/**
	 * The feature id for the '<em><b>Commit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST__COMMIT = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST__URL = 1;

	/**
	 * The number of structural features of the '<em>Pull Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pull Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link github.impl.IssueEventImpl <em>Issue Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see github.impl.IssueEventImpl
	 * @see github.impl.GithubPackageImpl#getIssueEvent()
	 * @generated
	 */
	int ISSUE_EVENT = 5;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_EVENT__USER = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_EVENT__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Created at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_EVENT__CREATED_AT = 2;

	/**
	 * The feature id for the '<em><b>Actor url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_EVENT__ACTOR_URL = 3;

	/**
	 * The number of structural features of the '<em>Issue Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_EVENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Issue Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link github.Action <em>Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see github.Action
	 * @see github.impl.GithubPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 6;


	/**
	 * Returns the meta object for class '{@link github.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see github.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link github.User#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see github.User#getUrl()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Url();

	/**
	 * Returns the meta object for the attribute '{@link github.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see github.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for class '{@link github.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see github.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link github.Project#getIssue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issue</em>'.
	 * @see github.Project#getIssue()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Issue();

	/**
	 * Returns the meta object for the attribute '{@link github.Project#getCreatd_at <em>Creatd at</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creatd at</em>'.
	 * @see github.Project#getCreatd_at()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Creatd_at();

	/**
	 * Returns the meta object for the attribute '{@link github.Project#getDeleted <em>Deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deleted</em>'.
	 * @see github.Project#getDeleted()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Deleted();

	/**
	 * Returns the meta object for the attribute '{@link github.Project#getUpdated_at <em>Updated at</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updated at</em>'.
	 * @see github.Project#getUpdated_at()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Updated_at();

	/**
	 * Returns the meta object for the containment reference list '{@link github.Project#getProjectMembers <em>Project Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Project Members</em>'.
	 * @see github.Project#getProjectMembers()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_ProjectMembers();

	/**
	 * Returns the meta object for the attribute '{@link github.Project#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see github.Project#getUrl()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Url();

	/**
	 * Returns the meta object for the containment reference list '{@link github.Project#getCommits <em>Commits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commits</em>'.
	 * @see github.Project#getCommits()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Commits();

	/**
	 * Returns the meta object for class '{@link github.Commit <em>Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commit</em>'.
	 * @see github.Commit
	 * @generated
	 */
	EClass getCommit();

	/**
	 * Returns the meta object for the reference '{@link github.Commit#getCommitter <em>Committer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Committer</em>'.
	 * @see github.Commit#getCommitter()
	 * @see #getCommit()
	 * @generated
	 */
	EReference getCommit_Committer();

	/**
	 * Returns the meta object for the reference list '{@link github.Commit#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parents</em>'.
	 * @see github.Commit#getParents()
	 * @see #getCommit()
	 * @generated
	 */
	EReference getCommit_Parents();

	/**
	 * Returns the meta object for the reference '{@link github.Commit#getPullrequest <em>Pullrequest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pullrequest</em>'.
	 * @see github.Commit#getPullrequest()
	 * @see #getCommit()
	 * @generated
	 */
	EReference getCommit_Pullrequest();

	/**
	 * Returns the meta object for the attribute '{@link github.Commit#getCreated_at <em>Created at</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created at</em>'.
	 * @see github.Commit#getCreated_at()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_Created_at();

	/**
	 * Returns the meta object for the attribute '{@link github.Commit#getSha <em>Sha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sha</em>'.
	 * @see github.Commit#getSha()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_Sha();

	/**
	 * Returns the meta object for the attribute '{@link github.Commit#getParents_sha <em>Parents sha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parents sha</em>'.
	 * @see github.Commit#getParents_sha()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_Parents_sha();

	/**
	 * Returns the meta object for class '{@link github.Issue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue</em>'.
	 * @see github.Issue
	 * @generated
	 */
	EClass getIssue();

	/**
	 * Returns the meta object for the containment reference '{@link github.Issue#getPullrequest <em>Pullrequest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pullrequest</em>'.
	 * @see github.Issue#getPullrequest()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Pullrequest();

	/**
	 * Returns the meta object for the containment reference list '{@link github.Issue#getIssueevent <em>Issueevent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issueevent</em>'.
	 * @see github.Issue#getIssueevent()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Issueevent();

	/**
	 * Returns the meta object for the attribute '{@link github.Issue#getCreated_at <em>Created at</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created at</em>'.
	 * @see github.Issue#getCreated_at()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Created_at();

	/**
	 * Returns the meta object for the attribute '{@link github.Issue#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see github.Issue#getUrl()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Url();

	/**
	 * Returns the meta object for class '{@link github.PullRequest <em>Pull Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pull Request</em>'.
	 * @see github.PullRequest
	 * @generated
	 */
	EClass getPullRequest();

	/**
	 * Returns the meta object for the reference '{@link github.PullRequest#getCommit <em>Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Commit</em>'.
	 * @see github.PullRequest#getCommit()
	 * @see #getPullRequest()
	 * @generated
	 */
	EReference getPullRequest_Commit();

	/**
	 * Returns the meta object for the attribute '{@link github.PullRequest#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see github.PullRequest#getUrl()
	 * @see #getPullRequest()
	 * @generated
	 */
	EAttribute getPullRequest_Url();

	/**
	 * Returns the meta object for class '{@link github.IssueEvent <em>Issue Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Event</em>'.
	 * @see github.IssueEvent
	 * @generated
	 */
	EClass getIssueEvent();

	/**
	 * Returns the meta object for the reference '{@link github.IssueEvent#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see github.IssueEvent#getUser()
	 * @see #getIssueEvent()
	 * @generated
	 */
	EReference getIssueEvent_User();

	/**
	 * Returns the meta object for the attribute '{@link github.IssueEvent#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see github.IssueEvent#getAction()
	 * @see #getIssueEvent()
	 * @generated
	 */
	EAttribute getIssueEvent_Action();

	/**
	 * Returns the meta object for the attribute '{@link github.IssueEvent#getCreated_at <em>Created at</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created at</em>'.
	 * @see github.IssueEvent#getCreated_at()
	 * @see #getIssueEvent()
	 * @generated
	 */
	EAttribute getIssueEvent_Created_at();

	/**
	 * Returns the meta object for the attribute '{@link github.IssueEvent#getActor_url <em>Actor url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actor url</em>'.
	 * @see github.IssueEvent#getActor_url()
	 * @see #getIssueEvent()
	 * @generated
	 */
	EAttribute getIssueEvent_Actor_url();

	/**
	 * Returns the meta object for enum '{@link github.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action</em>'.
	 * @see github.Action
	 * @generated
	 */
	EEnum getAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GithubFactory getGithubFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link github.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see github.impl.UserImpl
		 * @see github.impl.GithubPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__URL = eINSTANCE.getUser_Url();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '{@link github.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see github.impl.ProjectImpl
		 * @see github.impl.GithubPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Issue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__ISSUE = eINSTANCE.getProject_Issue();

		/**
		 * The meta object literal for the '<em><b>Creatd at</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__CREATD_AT = eINSTANCE.getProject_Creatd_at();

		/**
		 * The meta object literal for the '<em><b>Deleted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__DELETED = eINSTANCE.getProject_Deleted();

		/**
		 * The meta object literal for the '<em><b>Updated at</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__UPDATED_AT = eINSTANCE.getProject_Updated_at();

		/**
		 * The meta object literal for the '<em><b>Project Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PROJECT_MEMBERS = eINSTANCE.getProject_ProjectMembers();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__URL = eINSTANCE.getProject_Url();

		/**
		 * The meta object literal for the '<em><b>Commits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__COMMITS = eINSTANCE.getProject_Commits();

		/**
		 * The meta object literal for the '{@link github.impl.CommitImpl <em>Commit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see github.impl.CommitImpl
		 * @see github.impl.GithubPackageImpl#getCommit()
		 * @generated
		 */
		EClass COMMIT = eINSTANCE.getCommit();

		/**
		 * The meta object literal for the '<em><b>Committer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMIT__COMMITTER = eINSTANCE.getCommit_Committer();

		/**
		 * The meta object literal for the '<em><b>Parents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMIT__PARENTS = eINSTANCE.getCommit_Parents();

		/**
		 * The meta object literal for the '<em><b>Pullrequest</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMIT__PULLREQUEST = eINSTANCE.getCommit_Pullrequest();

		/**
		 * The meta object literal for the '<em><b>Created at</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__CREATED_AT = eINSTANCE.getCommit_Created_at();

		/**
		 * The meta object literal for the '<em><b>Sha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__SHA = eINSTANCE.getCommit_Sha();

		/**
		 * The meta object literal for the '<em><b>Parents sha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__PARENTS_SHA = eINSTANCE.getCommit_Parents_sha();

		/**
		 * The meta object literal for the '{@link github.impl.IssueImpl <em>Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see github.impl.IssueImpl
		 * @see github.impl.GithubPackageImpl#getIssue()
		 * @generated
		 */
		EClass ISSUE = eINSTANCE.getIssue();

		/**
		 * The meta object literal for the '<em><b>Pullrequest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__PULLREQUEST = eINSTANCE.getIssue_Pullrequest();

		/**
		 * The meta object literal for the '<em><b>Issueevent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__ISSUEEVENT = eINSTANCE.getIssue_Issueevent();

		/**
		 * The meta object literal for the '<em><b>Created at</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__CREATED_AT = eINSTANCE.getIssue_Created_at();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__URL = eINSTANCE.getIssue_Url();

		/**
		 * The meta object literal for the '{@link github.impl.PullRequestImpl <em>Pull Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see github.impl.PullRequestImpl
		 * @see github.impl.GithubPackageImpl#getPullRequest()
		 * @generated
		 */
		EClass PULL_REQUEST = eINSTANCE.getPullRequest();

		/**
		 * The meta object literal for the '<em><b>Commit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PULL_REQUEST__COMMIT = eINSTANCE.getPullRequest_Commit();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PULL_REQUEST__URL = eINSTANCE.getPullRequest_Url();

		/**
		 * The meta object literal for the '{@link github.impl.IssueEventImpl <em>Issue Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see github.impl.IssueEventImpl
		 * @see github.impl.GithubPackageImpl#getIssueEvent()
		 * @generated
		 */
		EClass ISSUE_EVENT = eINSTANCE.getIssueEvent();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE_EVENT__USER = eINSTANCE.getIssueEvent_User();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_EVENT__ACTION = eINSTANCE.getIssueEvent_Action();

		/**
		 * The meta object literal for the '<em><b>Created at</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_EVENT__CREATED_AT = eINSTANCE.getIssueEvent_Created_at();

		/**
		 * The meta object literal for the '<em><b>Actor url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_EVENT__ACTOR_URL = eINSTANCE.getIssueEvent_Actor_url();

		/**
		 * The meta object literal for the '{@link github.Action <em>Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see github.Action
		 * @see github.impl.GithubPackageImpl#getAction()
		 * @generated
		 */
		EEnum ACTION = eINSTANCE.getAction();

	}

} //GithubPackage
