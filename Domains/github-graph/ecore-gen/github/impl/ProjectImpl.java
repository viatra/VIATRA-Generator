/**
 */
package github.impl;

import github.Commit;
import github.GithubPackage;
import github.Issue;
import github.Project;
import github.User;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link github.impl.ProjectImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link github.impl.ProjectImpl#getCreatd_at <em>Creatd at</em>}</li>
 *   <li>{@link github.impl.ProjectImpl#getDeleted <em>Deleted</em>}</li>
 *   <li>{@link github.impl.ProjectImpl#getUpdated_at <em>Updated at</em>}</li>
 *   <li>{@link github.impl.ProjectImpl#getProjectMembers <em>Project Members</em>}</li>
 *   <li>{@link github.impl.ProjectImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link github.impl.ProjectImpl#getCommits <em>Commits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
	/**
	 * The cached value of the '{@link #getIssue() <em>Issue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> issue;

	/**
	 * The default value of the '{@link #getCreatd_at() <em>Creatd at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatd_at()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATD_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatd_at() <em>Creatd at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatd_at()
	 * @generated
	 * @ordered
	 */
	protected Date creatd_at = CREATD_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeleted() <em>Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleted()
	 * @generated
	 * @ordered
	 */
	protected static final int DELETED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDeleted() <em>Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleted()
	 * @generated
	 * @ordered
	 */
	protected int deleted = DELETED_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdated_at() <em>Updated at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdated_at()
	 * @generated
	 * @ordered
	 */
	protected static final Date UPDATED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdated_at() <em>Updated at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdated_at()
	 * @generated
	 * @ordered
	 */
	protected Date updated_at = UPDATED_AT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProjectMembers() <em>Project Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> projectMembers;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommits() <em>Commits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommits()
	 * @generated
	 * @ordered
	 */
	protected EList<Commit> commits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Issue> getIssue() {
		if (issue == null) {
			issue = new EObjectContainmentEList<Issue>(Issue.class, this, GithubPackage.PROJECT__ISSUE);
		}
		return issue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatd_at() {
		return creatd_at;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatd_at(Date newCreatd_at) {
		Date oldCreatd_at = creatd_at;
		creatd_at = newCreatd_at;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.PROJECT__CREATD_AT, oldCreatd_at, creatd_at));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDeleted() {
		return deleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeleted(int newDeleted) {
		int oldDeleted = deleted;
		deleted = newDeleted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.PROJECT__DELETED, oldDeleted, deleted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getUpdated_at() {
		return updated_at;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdated_at(Date newUpdated_at) {
		Date oldUpdated_at = updated_at;
		updated_at = newUpdated_at;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.PROJECT__UPDATED_AT, oldUpdated_at, updated_at));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<User> getProjectMembers() {
		if (projectMembers == null) {
			projectMembers = new EObjectContainmentEList<User>(User.class, this, GithubPackage.PROJECT__PROJECT_MEMBERS);
		}
		return projectMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.PROJECT__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Commit> getCommits() {
		if (commits == null) {
			commits = new EObjectContainmentEList<Commit>(Commit.class, this, GithubPackage.PROJECT__COMMITS);
		}
		return commits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubPackage.PROJECT__ISSUE:
				return ((InternalEList<?>)getIssue()).basicRemove(otherEnd, msgs);
			case GithubPackage.PROJECT__PROJECT_MEMBERS:
				return ((InternalEList<?>)getProjectMembers()).basicRemove(otherEnd, msgs);
			case GithubPackage.PROJECT__COMMITS:
				return ((InternalEList<?>)getCommits()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubPackage.PROJECT__ISSUE:
				return getIssue();
			case GithubPackage.PROJECT__CREATD_AT:
				return getCreatd_at();
			case GithubPackage.PROJECT__DELETED:
				return getDeleted();
			case GithubPackage.PROJECT__UPDATED_AT:
				return getUpdated_at();
			case GithubPackage.PROJECT__PROJECT_MEMBERS:
				return getProjectMembers();
			case GithubPackage.PROJECT__URL:
				return getUrl();
			case GithubPackage.PROJECT__COMMITS:
				return getCommits();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GithubPackage.PROJECT__ISSUE:
				getIssue().clear();
				getIssue().addAll((Collection<? extends Issue>)newValue);
				return;
			case GithubPackage.PROJECT__CREATD_AT:
				setCreatd_at((Date)newValue);
				return;
			case GithubPackage.PROJECT__DELETED:
				setDeleted((Integer)newValue);
				return;
			case GithubPackage.PROJECT__UPDATED_AT:
				setUpdated_at((Date)newValue);
				return;
			case GithubPackage.PROJECT__PROJECT_MEMBERS:
				getProjectMembers().clear();
				getProjectMembers().addAll((Collection<? extends User>)newValue);
				return;
			case GithubPackage.PROJECT__URL:
				setUrl((String)newValue);
				return;
			case GithubPackage.PROJECT__COMMITS:
				getCommits().clear();
				getCommits().addAll((Collection<? extends Commit>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GithubPackage.PROJECT__ISSUE:
				getIssue().clear();
				return;
			case GithubPackage.PROJECT__CREATD_AT:
				setCreatd_at(CREATD_AT_EDEFAULT);
				return;
			case GithubPackage.PROJECT__DELETED:
				setDeleted(DELETED_EDEFAULT);
				return;
			case GithubPackage.PROJECT__UPDATED_AT:
				setUpdated_at(UPDATED_AT_EDEFAULT);
				return;
			case GithubPackage.PROJECT__PROJECT_MEMBERS:
				getProjectMembers().clear();
				return;
			case GithubPackage.PROJECT__URL:
				setUrl(URL_EDEFAULT);
				return;
			case GithubPackage.PROJECT__COMMITS:
				getCommits().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GithubPackage.PROJECT__ISSUE:
				return issue != null && !issue.isEmpty();
			case GithubPackage.PROJECT__CREATD_AT:
				return CREATD_AT_EDEFAULT == null ? creatd_at != null : !CREATD_AT_EDEFAULT.equals(creatd_at);
			case GithubPackage.PROJECT__DELETED:
				return deleted != DELETED_EDEFAULT;
			case GithubPackage.PROJECT__UPDATED_AT:
				return UPDATED_AT_EDEFAULT == null ? updated_at != null : !UPDATED_AT_EDEFAULT.equals(updated_at);
			case GithubPackage.PROJECT__PROJECT_MEMBERS:
				return projectMembers != null && !projectMembers.isEmpty();
			case GithubPackage.PROJECT__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case GithubPackage.PROJECT__COMMITS:
				return commits != null && !commits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (creatd_at: ");
		result.append(creatd_at);
		result.append(", deleted: ");
		result.append(deleted);
		result.append(", updated_at: ");
		result.append(updated_at);
		result.append(", url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
