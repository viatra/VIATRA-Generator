/**
 */
package hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl;

import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Component;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Input;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Output;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.ComponentImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.ComponentImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.impl.ComponentImpl#getComponentDefinition <em>Component Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> outputs;

	/**
	 * The cached value of the '{@link #getComponentDefinition() <em>Component Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentDefinition()
	 * @generated
	 * @ordered
	 */
	protected ComponentDefinition componentDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CftPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Input> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentWithInverseEList<Input>(Input.class, this, CftPackage.COMPONENT__INPUTS, CftPackage.INPUT__COMPONENT);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Output> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentWithInverseEList<Output>(Output.class, this, CftPackage.COMPONENT__OUTPUTS, CftPackage.OUTPUT__COMPONENT);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentDefinition getComponentDefinition() {
		if (componentDefinition != null && componentDefinition.eIsProxy()) {
			InternalEObject oldComponentDefinition = (InternalEObject)componentDefinition;
			componentDefinition = (ComponentDefinition)eResolveProxy(oldComponentDefinition);
			if (componentDefinition != oldComponentDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CftPackage.COMPONENT__COMPONENT_DEFINITION, oldComponentDefinition, componentDefinition));
			}
		}
		return componentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDefinition basicGetComponentDefinition() {
		return componentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentDefinition(ComponentDefinition newComponentDefinition) {
		ComponentDefinition oldComponentDefinition = componentDefinition;
		componentDefinition = newComponentDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CftPackage.COMPONENT__COMPONENT_DEFINITION, oldComponentDefinition, componentDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CftPackage.COMPONENT__INPUTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputs()).basicAdd(otherEnd, msgs);
			case CftPackage.COMPONENT__OUTPUTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutputs()).basicAdd(otherEnd, msgs);
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
			case CftPackage.COMPONENT__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case CftPackage.COMPONENT__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
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
			case CftPackage.COMPONENT__INPUTS:
				return getInputs();
			case CftPackage.COMPONENT__OUTPUTS:
				return getOutputs();
			case CftPackage.COMPONENT__COMPONENT_DEFINITION:
				if (resolve) return getComponentDefinition();
				return basicGetComponentDefinition();
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
			case CftPackage.COMPONENT__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends Input>)newValue);
				return;
			case CftPackage.COMPONENT__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends Output>)newValue);
				return;
			case CftPackage.COMPONENT__COMPONENT_DEFINITION:
				setComponentDefinition((ComponentDefinition)newValue);
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
			case CftPackage.COMPONENT__INPUTS:
				getInputs().clear();
				return;
			case CftPackage.COMPONENT__OUTPUTS:
				getOutputs().clear();
				return;
			case CftPackage.COMPONENT__COMPONENT_DEFINITION:
				setComponentDefinition((ComponentDefinition)null);
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
			case CftPackage.COMPONENT__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case CftPackage.COMPONENT__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case CftPackage.COMPONENT__COMPONENT_DEFINITION:
				return componentDefinition != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentImpl
