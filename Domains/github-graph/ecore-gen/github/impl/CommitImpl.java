/**
 */
package github.impl;

import github.Commit;
import github.GithubPackage;
import github.PullRequest;
import github.User;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link github.impl.CommitImpl#getCommitter <em>Committer</em>}</li>
 *   <li>{@link github.impl.CommitImpl#getParents <em>Parents</em>}</li>
 *   <li>{@link github.impl.CommitImpl#getPullrequest <em>Pullrequest</em>}</li>
 *   <li>{@link github.impl.CommitImpl#getCreated_at <em>Created at</em>}</li>
 *   <li>{@link github.impl.CommitImpl#getSha <em>Sha</em>}</li>
 *   <li>{@link github.impl.CommitImpl#getParents_sha <em>Parents sha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommitImpl extends MinimalEObjectImpl.Container implements Commit {
	/**
	 * The cached value of the '{@link #getCommitter() <em>Committer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitter()
	 * @generated
	 * @ordered
	 */
	protected User committer;

	/**
	 * The cached value of the '{@link #getParents() <em>Parents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParents()
	 * @generated
	 * @ordered
	 */
	protected EList<Commit> parents;

	/**
	 * The cached value of the '{@link #getPullrequest() <em>Pullrequest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPullrequest()
	 * @generated
	 * @ordered
	 */
	protected PullRequest pullrequest;

	/**
	 * The default value of the '{@link #getCreated_at() <em>Created at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated_at()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated_at() <em>Created at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated_at()
	 * @generated
	 * @ordered
	 */
	protected Date created_at = CREATED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSha() <em>Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSha()
	 * @generated
	 * @ordered
	 */
	protected static final String SHA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSha() <em>Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSha()
	 * @generated
	 * @ordered
	 */
	protected String sha = SHA_EDEFAULT;

	/**
	 * The default value of the '{@link #getParents_sha() <em>Parents sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParents_sha()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> PARENTS_SHA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParents_sha() <em>Parents sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParents_sha()
	 * @generated
	 * @ordered
	 */
	protected List<String> parents_sha = PARENTS_SHA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.COMMIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getCommitter() {
		if (committer != null && committer.eIsProxy()) {
			InternalEObject oldCommitter = (InternalEObject)committer;
			committer = (User)eResolveProxy(oldCommitter);
			if (committer != oldCommitter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GithubPackage.COMMIT__COMMITTER, oldCommitter, committer));
			}
		}
		return committer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetCommitter() {
		return committer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommitter(User newCommitter) {
		User oldCommitter = committer;
		committer = newCommitter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.COMMIT__COMMITTER, oldCommitter, committer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Commit> getParents() {
		if (parents == null) {
			parents = new EObjectResolvingEList<Commit>(Commit.class, this, GithubPackage.COMMIT__PARENTS);
		}
		return parents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PullRequest getPullrequest() {
		if (pullrequest != null && pullrequest.eIsProxy()) {
			InternalEObject oldPullrequest = (InternalEObject)pullrequest;
			pullrequest = (PullRequest)eResolveProxy(oldPullrequest);
			if (pullrequest != oldPullrequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GithubPackage.COMMIT__PULLREQUEST, oldPullrequest, pullrequest));
			}
		}
		return pullrequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PullRequest basicGetPullrequest() {
		return pullrequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPullrequest(PullRequest newPullrequest, NotificationChain msgs) {
		PullRequest oldPullrequest = pullrequest;
		pullrequest = newPullrequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubPackage.COMMIT__PULLREQUEST, oldPullrequest, newPullrequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPullrequest(PullRequest newPullrequest) {
		if (newPullrequest != pullrequest) {
			NotificationChain msgs = null;
			if (pullrequest != null)
				msgs = ((InternalEObject)pullrequest).eInverseRemove(this, GithubPackage.PULL_REQUEST__COMMIT, PullRequest.class, msgs);
			if (newPullrequest != null)
				msgs = ((InternalEObject)newPullrequest).eInverseAdd(this, GithubPackage.PULL_REQUEST__COMMIT, PullRequest.class, msgs);
			msgs = basicSetPullrequest(newPullrequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.COMMIT__PULLREQUEST, newPullrequest, newPullrequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreated_at() {
		return created_at;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreated_at(Date newCreated_at) {
		Date oldCreated_at = created_at;
		created_at = newCreated_at;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.COMMIT__CREATED_AT, oldCreated_at, created_at));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSha() {
		return sha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSha(String newSha) {
		String oldSha = sha;
		sha = newSha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.COMMIT__SHA, oldSha, sha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getParents_sha() {
		return parents_sha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParents_sha(List<String> newParents_sha) {
		List<String> oldParents_sha = parents_sha;
		parents_sha = newParents_sha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.COMMIT__PARENTS_SHA, oldParents_sha, parents_sha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubPackage.COMMIT__PULLREQUEST:
				if (pullrequest != null)
					msgs = ((InternalEObject)pullrequest).eInverseRemove(this, GithubPackage.PULL_REQUEST__COMMIT, PullRequest.class, msgs);
				return basicSetPullrequest((PullRequest)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubPackage.COMMIT__PULLREQUEST:
				return basicSetPullrequest(null, msgs);
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
			case GithubPackage.COMMIT__COMMITTER:
				if (resolve) return getCommitter();
				return basicGetCommitter();
			case GithubPackage.COMMIT__PARENTS:
				return getParents();
			case GithubPackage.COMMIT__PULLREQUEST:
				if (resolve) return getPullrequest();
				return basicGetPullrequest();
			case GithubPackage.COMMIT__CREATED_AT:
				return getCreated_at();
			case GithubPackage.COMMIT__SHA:
				return getSha();
			case GithubPackage.COMMIT__PARENTS_SHA:
				return getParents_sha();
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
			case GithubPackage.COMMIT__COMMITTER:
				setCommitter((User)newValue);
				return;
			case GithubPackage.COMMIT__PARENTS:
				getParents().clear();
				getParents().addAll((Collection<? extends Commit>)newValue);
				return;
			case GithubPackage.COMMIT__PULLREQUEST:
				setPullrequest((PullRequest)newValue);
				return;
			case GithubPackage.COMMIT__CREATED_AT:
				setCreated_at((Date)newValue);
				return;
			case GithubPackage.COMMIT__SHA:
				setSha((String)newValue);
				return;
			case GithubPackage.COMMIT__PARENTS_SHA:
				setParents_sha((List<String>)newValue);
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
			case GithubPackage.COMMIT__COMMITTER:
				setCommitter((User)null);
				return;
			case GithubPackage.COMMIT__PARENTS:
				getParents().clear();
				return;
			case GithubPackage.COMMIT__PULLREQUEST:
				setPullrequest((PullRequest)null);
				return;
			case GithubPackage.COMMIT__CREATED_AT:
				setCreated_at(CREATED_AT_EDEFAULT);
				return;
			case GithubPackage.COMMIT__SHA:
				setSha(SHA_EDEFAULT);
				return;
			case GithubPackage.COMMIT__PARENTS_SHA:
				setParents_sha(PARENTS_SHA_EDEFAULT);
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
			case GithubPackage.COMMIT__COMMITTER:
				return committer != null;
			case GithubPackage.COMMIT__PARENTS:
				return parents != null && !parents.isEmpty();
			case GithubPackage.COMMIT__PULLREQUEST:
				return pullrequest != null;
			case GithubPackage.COMMIT__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? created_at != null : !CREATED_AT_EDEFAULT.equals(created_at);
			case GithubPackage.COMMIT__SHA:
				return SHA_EDEFAULT == null ? sha != null : !SHA_EDEFAULT.equals(sha);
			case GithubPackage.COMMIT__PARENTS_SHA:
				return PARENTS_SHA_EDEFAULT == null ? parents_sha != null : !PARENTS_SHA_EDEFAULT.equals(parents_sha);
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
		result.append(" (created_at: ");
		result.append(created_at);
		result.append(", sha: ");
		result.append(sha);
		result.append(", parents_sha: ");
		result.append(parents_sha);
		result.append(')');
		return result.toString();
	}

} //CommitImpl
