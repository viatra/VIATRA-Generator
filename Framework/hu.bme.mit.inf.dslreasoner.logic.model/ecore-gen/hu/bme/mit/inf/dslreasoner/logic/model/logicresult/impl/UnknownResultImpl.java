/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logicresult.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultPackage;
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.UnknownResult;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unknown Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class UnknownResultImpl extends LogicResultImpl implements UnknownResult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnknownResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicresultPackage.Literals.UNKNOWN_RESULT;
	}

} //UnknownResultImpl
