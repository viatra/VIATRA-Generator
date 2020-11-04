/**
 */
package hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable;

import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.VariableMapping;
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl.VariableMappingImpl#getSourcePVariable <em>Source PVariable</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl.VariableMappingImpl#getTargetLogicVariable <em>Target Logic Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableMappingImpl extends MinimalEObjectImpl.Container implements VariableMapping {
	/**
	 * The default value of the '{@link #getSourcePVariable() <em>Source PVariable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePVariable()
	 * @generated
	 * @ordered
	 */
	protected static final Object SOURCE_PVARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourcePVariable() <em>Source PVariable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePVariable()
	 * @generated
	 * @ordered
	 */
	protected Object sourcePVariable = SOURCE_PVARIABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetLogicVariable() <em>Target Logic Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLogicVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable targetLogicVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Viatra2LogicAnnotationsPackage.Literals.VARIABLE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getSourcePVariable() {
		return sourcePVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourcePVariable(Object newSourcePVariable) {
		Object oldSourcePVariable = sourcePVariable;
		sourcePVariable = newSourcePVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Viatra2LogicAnnotationsPackage.VARIABLE_MAPPING__SOURCE_PVARIABLE, oldSourcePVariable, sourcePVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable getTargetLogicVariable() {
		if (targetLogicVariable != null && targetLogicVariable.eIsProxy()) {
			InternalEObject oldTargetLogicVariable = (InternalEObject)targetLogicVariable;
			targetLogicVariable = (Variable)eResolveProxy(oldTargetLogicVariable);
			if (targetLogicVariable != oldTargetLogicVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Viatra2LogicAnnotationsPackage.VARIABLE_MAPPING__TARGET_LOGIC_VARIABLE, oldTargetLogicVariable, targetLogicVariable));
			}
		}
		return targetLogicVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetTargetLogicVariable() {
		return targetLogicVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetLogicVariable(Variable newTargetLogicVariable) {
		Variable oldTargetLogicVariable = targetLogicVariable;
		targetLogicVariable = newTargetLogicVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Viatra2LogicAnnotationsPackage.VARIABLE_MAPPING__TARGET_LOGIC_VARIABLE, oldTargetLogicVariable, targetLogicVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Viatra2LogicAnnotationsPackage.VARIABLE_MAPPING__SOURCE_PVARIABLE:
				return getSourcePVariable();
			case Viatra2LogicAnnotationsPackage.VARIABLE_MAPPING__TARGET_LOGIC_VARIABLE:
				if (resolve) return getTargetLogicVariable();
				return basicGetTargetLogicVariable();
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
			case Viatra2LogicAnnotationsPackage.VARIABLE_MAPPING__SOURCE_PVARIABLE:
				setSourcePVariable(newValue);
				return;
			case Viatra2LogicAnnotationsPackage.VARIABLE_MAPPING__TARGET_LOGIC_VARIABLE:
				setTargetLogicVariable((Variable)newValue);
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
			case Viatra2LogicAnnotationsPackage.VARIABLE_MAPPING__SOURCE_PVARIABLE:
				setSourcePVariable(SOURCE_PVARIABLE_EDEFAULT);
				return;
			case Viatra2LogicAnnotationsPackage.VARIABLE_MAPPING__TARGET_LOGIC_VARIABLE:
				setTargetLogicVariable((Variable)null);
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
			case Viatra2LogicAnnotationsPackage.VARIABLE_MAPPING__SOURCE_PVARIABLE:
				return SOURCE_PVARIABLE_EDEFAULT == null ? sourcePVariable != null : !SOURCE_PVARIABLE_EDEFAULT.equals(sourcePVariable);
			case Viatra2LogicAnnotationsPackage.VARIABLE_MAPPING__TARGET_LOGIC_VARIABLE:
				return targetLogicVariable != null;
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
		result.append(" (sourcePVariable: ");
		result.append(sourcePVariable);
		result.append(')');
		return result.toString();
	}

} //VariableMappingImpl
