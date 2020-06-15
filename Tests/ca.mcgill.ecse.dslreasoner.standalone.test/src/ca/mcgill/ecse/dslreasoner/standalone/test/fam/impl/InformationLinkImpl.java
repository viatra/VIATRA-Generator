/**
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.fam.impl;

import ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalInput;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalOutput;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.InformationLink;
import ca.mcgill.ecse.dslreasoner.standalone.test.fam.famPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.impl.InformationLinkImpl#getFrom <em>From</em>}</li>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.impl.InformationLinkImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InformationLinkImpl extends MinimalEObjectImpl.Container implements InformationLink {
	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected FunctionalInput to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return famPackage.Literals.INFORMATION_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalOutput getFrom() {
		if (eContainerFeatureID() != famPackage.INFORMATION_LINK__FROM) return null;
		return (FunctionalOutput)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(FunctionalOutput newFrom, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFrom, famPackage.INFORMATION_LINK__FROM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(FunctionalOutput newFrom) {
		if (newFrom != eInternalContainer() || (eContainerFeatureID() != famPackage.INFORMATION_LINK__FROM && newFrom != null)) {
			if (EcoreUtil.isAncestor(this, newFrom))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, famPackage.FUNCTIONAL_OUTPUT__OUTGOING_LINKS, FunctionalOutput.class, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, famPackage.INFORMATION_LINK__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalInput getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (FunctionalInput)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, famPackage.INFORMATION_LINK__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalInput basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(FunctionalInput newTo, NotificationChain msgs) {
		FunctionalInput oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, famPackage.INFORMATION_LINK__TO, oldTo, newTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(FunctionalInput newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, famPackage.FUNCTIONAL_INPUT__INCOMING_LINKS, FunctionalInput.class, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, famPackage.FUNCTIONAL_INPUT__INCOMING_LINKS, FunctionalInput.class, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, famPackage.INFORMATION_LINK__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case famPackage.INFORMATION_LINK__FROM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFrom((FunctionalOutput)otherEnd, msgs);
			case famPackage.INFORMATION_LINK__TO:
				if (to != null)
					msgs = ((InternalEObject)to).eInverseRemove(this, famPackage.FUNCTIONAL_INPUT__INCOMING_LINKS, FunctionalInput.class, msgs);
				return basicSetTo((FunctionalInput)otherEnd, msgs);
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
			case famPackage.INFORMATION_LINK__FROM:
				return basicSetFrom(null, msgs);
			case famPackage.INFORMATION_LINK__TO:
				return basicSetTo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case famPackage.INFORMATION_LINK__FROM:
				return eInternalContainer().eInverseRemove(this, famPackage.FUNCTIONAL_OUTPUT__OUTGOING_LINKS, FunctionalOutput.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case famPackage.INFORMATION_LINK__FROM:
				return getFrom();
			case famPackage.INFORMATION_LINK__TO:
				if (resolve) return getTo();
				return basicGetTo();
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
			case famPackage.INFORMATION_LINK__FROM:
				setFrom((FunctionalOutput)newValue);
				return;
			case famPackage.INFORMATION_LINK__TO:
				setTo((FunctionalInput)newValue);
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
			case famPackage.INFORMATION_LINK__FROM:
				setFrom((FunctionalOutput)null);
				return;
			case famPackage.INFORMATION_LINK__TO:
				setTo((FunctionalInput)null);
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
			case famPackage.INFORMATION_LINK__FROM:
				return getFrom() != null;
			case famPackage.INFORMATION_LINK__TO:
				return to != null;
		}
		return super.eIsSet(featureID);
	}

} //InformationLinkImpl
