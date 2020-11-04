/**
 */
package github.impl;

import github.Action;
import github.GithubPackage;
import github.IssueEvent;
import github.User;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link github.impl.IssueEventImpl#getUser <em>User</em>}</li>
 *   <li>{@link github.impl.IssueEventImpl#getAction <em>Action</em>}</li>
 *   <li>{@link github.impl.IssueEventImpl#getCreated_at <em>Created at</em>}</li>
 *   <li>{@link github.impl.IssueEventImpl#getActor_url <em>Actor url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueEventImpl extends MinimalEObjectImpl.Container implements IssueEvent {
	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected User user;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final Action ACTION_EDEFAULT = Action.SUBSCRIBED;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action = ACTION_EDEFAULT;

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
	 * The default value of the '{@link #getActor_url() <em>Actor url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor_url()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTOR_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActor_url() <em>Actor url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor_url()
	 * @generated
	 * @ordered
	 */
	protected String actor_url = ACTOR_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.ISSUE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getUser() {
		if (user != null && user.eIsProxy()) {
			InternalEObject oldUser = (InternalEObject)user;
			user = (User)eResolveProxy(oldUser);
			if (user != oldUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GithubPackage.ISSUE_EVENT__USER, oldUser, user));
			}
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUser(User newUser) {
		User oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.ISSUE_EVENT__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction(Action newAction) {
		Action oldAction = action;
		action = newAction == null ? ACTION_EDEFAULT : newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.ISSUE_EVENT__ACTION, oldAction, action));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.ISSUE_EVENT__CREATED_AT, oldCreated_at, created_at));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActor_url() {
		return actor_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActor_url(String newActor_url) {
		String oldActor_url = actor_url;
		actor_url = newActor_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.ISSUE_EVENT__ACTOR_URL, oldActor_url, actor_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubPackage.ISSUE_EVENT__USER:
				if (resolve) return getUser();
				return basicGetUser();
			case GithubPackage.ISSUE_EVENT__ACTION:
				return getAction();
			case GithubPackage.ISSUE_EVENT__CREATED_AT:
				return getCreated_at();
			case GithubPackage.ISSUE_EVENT__ACTOR_URL:
				return getActor_url();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GithubPackage.ISSUE_EVENT__USER:
				setUser((User)newValue);
				return;
			case GithubPackage.ISSUE_EVENT__ACTION:
				setAction((Action)newValue);
				return;
			case GithubPackage.ISSUE_EVENT__CREATED_AT:
				setCreated_at((Date)newValue);
				return;
			case GithubPackage.ISSUE_EVENT__ACTOR_URL:
				setActor_url((String)newValue);
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
			case GithubPackage.ISSUE_EVENT__USER:
				setUser((User)null);
				return;
			case GithubPackage.ISSUE_EVENT__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case GithubPackage.ISSUE_EVENT__CREATED_AT:
				setCreated_at(CREATED_AT_EDEFAULT);
				return;
			case GithubPackage.ISSUE_EVENT__ACTOR_URL:
				setActor_url(ACTOR_URL_EDEFAULT);
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
			case GithubPackage.ISSUE_EVENT__USER:
				return user != null;
			case GithubPackage.ISSUE_EVENT__ACTION:
				return action != ACTION_EDEFAULT;
			case GithubPackage.ISSUE_EVENT__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? created_at != null : !CREATED_AT_EDEFAULT.equals(created_at);
			case GithubPackage.ISSUE_EVENT__ACTOR_URL:
				return ACTOR_URL_EDEFAULT == null ? actor_url != null : !ACTOR_URL_EDEFAULT.equals(actor_url);
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
		result.append(" (action: ");
		result.append(action);
		result.append(", created_at: ");
		result.append(created_at);
		result.append(", actor_url: ");
		result.append(actor_url);
		result.append(')');
		return result.toString();
	}

} //IssueEventImpl
