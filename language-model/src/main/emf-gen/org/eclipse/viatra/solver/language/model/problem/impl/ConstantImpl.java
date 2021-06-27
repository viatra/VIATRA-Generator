/**
 */
package org.eclipse.viatra.solver.language.model.problem.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.viatra.solver.language.model.problem.Constant;
import org.eclipse.viatra.solver.language.model.problem.ProblemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ConstantImpl extends MinimalEObjectImpl.Container implements Constant {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProblemPackage.Literals.CONSTANT;
	}

} //ConstantImpl
