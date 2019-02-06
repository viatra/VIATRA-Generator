/**
 */
package hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl;

import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Connection;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Input;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.ConnectionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.ConnectionImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected Output output;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CftPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Input getInput() {
		if (eContainerFeatureID() != CftPackage.CONNECTION__INPUT) return null;
		return (Input)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(Input newInput, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInput, CftPackage.CONNECTION__INPUT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInput(Input newInput) {
		if (newInput != eInternalContainer() || (eContainerFeatureID() != CftPackage.CONNECTION__INPUT && newInput != null)) {
			if (EcoreUtil.isAncestor(this, newInput))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInput != null)
				msgs = ((InternalEObject)newInput).eInverseAdd(this, CftPackage.INPUT__INCOMING_CONNECTIONS, Input.class, msgs);
			msgs = basicSetInput(newInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CftPackage.CONNECTION__INPUT, newInput, newInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject)output;
			output = (Output)eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CftPackage.CONNECTION__OUTPUT, oldOutput, output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(Output newOutput, NotificationChain msgs) {
		Output oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CftPackage.CONNECTION__OUTPUT, oldOutput, newOutput);
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
	public void setOutput(Output newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject)output).eInverseRemove(this, CftPackage.OUTPUT__OUTGOING_CONNECTIONS, Output.class, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject)newOutput).eInverseAdd(this, CftPackage.OUTPUT__OUTGOING_CONNECTIONS, Output.class, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CftPackage.CONNECTION__OUTPUT, newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CftPackage.CONNECTION__INPUT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInput((Input)otherEnd, msgs);
			case CftPackage.CONNECTION__OUTPUT:
				if (output != null)
					msgs = ((InternalEObject)output).eInverseRemove(this, CftPackage.OUTPUT__OUTGOING_CONNECTIONS, Output.class, msgs);
				return basicSetOutput((Output)otherEnd, msgs);
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
			case CftPackage.CONNECTION__INPUT:
				return basicSetInput(null, msgs);
			case CftPackage.CONNECTION__OUTPUT:
				return basicSetOutput(null, msgs);
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
			case CftPackage.CONNECTION__INPUT:
				return eInternalContainer().eInverseRemove(this, CftPackage.INPUT__INCOMING_CONNECTIONS, Input.class, msgs);
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
			case CftPackage.CONNECTION__INPUT:
				return getInput();
			case CftPackage.CONNECTION__OUTPUT:
				if (resolve) return getOutput();
				return basicGetOutput();
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
			case CftPackage.CONNECTION__INPUT:
				setInput((Input)newValue);
				return;
			case CftPackage.CONNECTION__OUTPUT:
				setOutput((Output)newValue);
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
			case CftPackage.CONNECTION__INPUT:
				setInput((Input)null);
				return;
			case CftPackage.CONNECTION__OUTPUT:
				setOutput((Output)null);
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
			case CftPackage.CONNECTION__INPUT:
				return getInput() != null;
			case CftPackage.CONNECTION__OUTPUT:
				return output != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectionImpl
