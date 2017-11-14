/**
 */
package logic2vampire.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TermDescription;

import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSFofFormula;
import java.util.Collection;

import logic2vampire.Logic2VampireTrace;
import logic2vampire.Logic2vampirePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logic2 Vampire Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logic2vampire.impl.Logic2VampireTraceImpl#getTermDescription <em>Term Description</em>}</li>
 *   <li>{@link logic2vampire.impl.Logic2VampireTraceImpl#getVlsFormula <em>Vls Formula</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Logic2VampireTraceImpl extends MinimalEObjectImpl.Container implements Logic2VampireTrace {
	/**
	 * The cached value of the '{@link #getTermDescription() <em>Term Description</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<TermDescription> termDescription;

	/**
	 * The cached value of the '{@link #getVlsFormula() <em>Vls Formula</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVlsFormula()
	 * @generated
	 * @ordered
	 */
	protected EList<VLSFofFormula> vlsFormula;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Logic2VampireTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Logic2vampirePackage.Literals.LOGIC2_VAMPIRE_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TermDescription> getTermDescription() {
		if (termDescription == null) {
			termDescription = new EObjectResolvingEList<TermDescription>(TermDescription.class, this, Logic2vampirePackage.LOGIC2_VAMPIRE_TRACE__TERM_DESCRIPTION);
		}
		return termDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VLSFofFormula> getVlsFormula() {
		if (vlsFormula == null) {
			vlsFormula = new EObjectResolvingEList<VLSFofFormula>(VLSFofFormula.class, this, Logic2vampirePackage.LOGIC2_VAMPIRE_TRACE__VLS_FORMULA);
		}
		return vlsFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Logic2vampirePackage.LOGIC2_VAMPIRE_TRACE__TERM_DESCRIPTION:
				return getTermDescription();
			case Logic2vampirePackage.LOGIC2_VAMPIRE_TRACE__VLS_FORMULA:
				return getVlsFormula();
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
			case Logic2vampirePackage.LOGIC2_VAMPIRE_TRACE__TERM_DESCRIPTION:
				getTermDescription().clear();
				getTermDescription().addAll((Collection<? extends TermDescription>)newValue);
				return;
			case Logic2vampirePackage.LOGIC2_VAMPIRE_TRACE__VLS_FORMULA:
				getVlsFormula().clear();
				getVlsFormula().addAll((Collection<? extends VLSFofFormula>)newValue);
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
			case Logic2vampirePackage.LOGIC2_VAMPIRE_TRACE__TERM_DESCRIPTION:
				getTermDescription().clear();
				return;
			case Logic2vampirePackage.LOGIC2_VAMPIRE_TRACE__VLS_FORMULA:
				getVlsFormula().clear();
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
			case Logic2vampirePackage.LOGIC2_VAMPIRE_TRACE__TERM_DESCRIPTION:
				return termDescription != null && !termDescription.isEmpty();
			case Logic2vampirePackage.LOGIC2_VAMPIRE_TRACE__VLS_FORMULA:
				return vlsFormula != null && !vlsFormula.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Logic2VampireTraceImpl
