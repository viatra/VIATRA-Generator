/**
 */
package org.eclipse.viatra.solver.language.model.problem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.viatra.solver.language.model.problem.ClassDeclaration;
import org.eclipse.viatra.solver.language.model.problem.ProblemPackage;
import org.eclipse.viatra.solver.language.model.problem.ReferenceDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.impl.ClassDeclarationImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.impl.ClassDeclarationImpl#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.model.problem.impl.ClassDeclarationImpl#getReferenceDeclarations <em>Reference Declarations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassDeclarationImpl extends RelationImpl implements ClassDeclaration {
	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuperTypes() <em>Super Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassDeclaration> superTypes;

	/**
	 * The cached value of the '{@link #getReferenceDeclarations() <em>Reference Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceDeclaration> referenceDeclarations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProblemPackage.Literals.CLASS_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblemPackage.CLASS_DECLARATION__ABSTRACT,
					oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassDeclaration> getSuperTypes() {
		if (superTypes == null) {
			superTypes = new EObjectResolvingEList<ClassDeclaration>(ClassDeclaration.class, this,
					ProblemPackage.CLASS_DECLARATION__SUPER_TYPES);
		}
		return superTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceDeclaration> getReferenceDeclarations() {
		if (referenceDeclarations == null) {
			referenceDeclarations = new EObjectContainmentEList<ReferenceDeclaration>(ReferenceDeclaration.class, this,
					ProblemPackage.CLASS_DECLARATION__REFERENCE_DECLARATIONS);
		}
		return referenceDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProblemPackage.CLASS_DECLARATION__REFERENCE_DECLARATIONS:
			return ((InternalEList<?>) getReferenceDeclarations()).basicRemove(otherEnd, msgs);
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
		case ProblemPackage.CLASS_DECLARATION__ABSTRACT:
			return isAbstract();
		case ProblemPackage.CLASS_DECLARATION__SUPER_TYPES:
			return getSuperTypes();
		case ProblemPackage.CLASS_DECLARATION__REFERENCE_DECLARATIONS:
			return getReferenceDeclarations();
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
		case ProblemPackage.CLASS_DECLARATION__ABSTRACT:
			setAbstract((Boolean) newValue);
			return;
		case ProblemPackage.CLASS_DECLARATION__SUPER_TYPES:
			getSuperTypes().clear();
			getSuperTypes().addAll((Collection<? extends ClassDeclaration>) newValue);
			return;
		case ProblemPackage.CLASS_DECLARATION__REFERENCE_DECLARATIONS:
			getReferenceDeclarations().clear();
			getReferenceDeclarations().addAll((Collection<? extends ReferenceDeclaration>) newValue);
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
		case ProblemPackage.CLASS_DECLARATION__ABSTRACT:
			setAbstract(ABSTRACT_EDEFAULT);
			return;
		case ProblemPackage.CLASS_DECLARATION__SUPER_TYPES:
			getSuperTypes().clear();
			return;
		case ProblemPackage.CLASS_DECLARATION__REFERENCE_DECLARATIONS:
			getReferenceDeclarations().clear();
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
		case ProblemPackage.CLASS_DECLARATION__ABSTRACT:
			return abstract_ != ABSTRACT_EDEFAULT;
		case ProblemPackage.CLASS_DECLARATION__SUPER_TYPES:
			return superTypes != null && !superTypes.isEmpty();
		case ProblemPackage.CLASS_DECLARATION__REFERENCE_DECLARATIONS:
			return referenceDeclarations != null && !referenceDeclarations.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(')');
		return result.toString();
	}

} //ClassDeclarationImpl
