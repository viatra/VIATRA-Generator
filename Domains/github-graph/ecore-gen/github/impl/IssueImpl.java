/**
 */
package github.impl;

import github.GithubPackage;
import github.Issue;
import github.IssueEvent;
import github.PullRequest;

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
 * An implementation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link github.impl.IssueImpl#getPullrequest <em>Pullrequest</em>}</li>
 *   <li>{@link github.impl.IssueImpl#getIssueevent <em>Issueevent</em>}</li>
 *   <li>{@link github.impl.IssueImpl#getCreated_at <em>Created at</em>}</li>
 *   <li>{@link github.impl.IssueImpl#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueImpl extends MinimalEObjectImpl.Container implements Issue {
	/**
	 * The cached value of the '{@link #getPullrequest() <em>Pullrequest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPullrequest()
	 * @generated
	 * @ordered
	 */
	protected PullRequest pullrequest;

	/**
	 * The cached value of the '{@link #getIssueevent() <em>Issueevent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueevent()
	 * @generated
	 * @ordered
	 */
	protected EList<IssueEvent> issueevent;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.ISSUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PullRequest getPullrequest() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubPackage.ISSUE__PULLREQUEST, oldPullrequest, newPullrequest);
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
				msgs = ((InternalEObject)pullrequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubPackage.ISSUE__PULLREQUEST, null, msgs);
			if (newPullrequest != null)
				msgs = ((InternalEObject)newPullrequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubPackage.ISSUE__PULLREQUEST, null, msgs);
			msgs = basicSetPullrequest(newPullrequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.ISSUE__PULLREQUEST, newPullrequest, newPullrequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IssueEvent> getIssueevent() {
		if (issueevent == null) {
			issueevent = new EObjectContainmentEList<IssueEvent>(IssueEvent.class, this, GithubPackage.ISSUE__ISSUEEVENT);
		}
		return issueevent;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.ISSUE__CREATED_AT, oldCreated_at, created_at));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.ISSUE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubPackage.ISSUE__PULLREQUEST:
				return basicSetPullrequest(null, msgs);
			case GithubPackage.ISSUE__ISSUEEVENT:
				return ((InternalEList<?>)getIssueevent()).basicRemove(otherEnd, msgs);
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
			case GithubPackage.ISSUE__PULLREQUEST:
				return getPullrequest();
			case GithubPackage.ISSUE__ISSUEEVENT:
				return getIssueevent();
			case GithubPackage.ISSUE__CREATED_AT:
				return getCreated_at();
			case GithubPackage.ISSUE__URL:
				return getUrl();
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
			case GithubPackage.ISSUE__PULLREQUEST:
				setPullrequest((PullRequest)newValue);
				return;
			case GithubPackage.ISSUE__ISSUEEVENT:
				getIssueevent().clear();
				getIssueevent().addAll((Collection<? extends IssueEvent>)newValue);
				return;
			case GithubPackage.ISSUE__CREATED_AT:
				setCreated_at((Date)newValue);
				return;
			case GithubPackage.ISSUE__URL:
				setUrl((String)newValue);
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
			case GithubPackage.ISSUE__PULLREQUEST:
				setPullrequest((PullRequest)null);
				return;
			case GithubPackage.ISSUE__ISSUEEVENT:
				getIssueevent().clear();
				return;
			case GithubPackage.ISSUE__CREATED_AT:
				setCreated_at(CREATED_AT_EDEFAULT);
				return;
			case GithubPackage.ISSUE__URL:
				setUrl(URL_EDEFAULT);
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
			case GithubPackage.ISSUE__PULLREQUEST:
				return pullrequest != null;
			case GithubPackage.ISSUE__ISSUEEVENT:
				return issueevent != null && !issueevent.isEmpty();
			case GithubPackage.ISSUE__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? created_at != null : !CREATED_AT_EDEFAULT.equals(created_at);
			case GithubPackage.ISSUE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
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
		result.append(", url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //IssueImpl
