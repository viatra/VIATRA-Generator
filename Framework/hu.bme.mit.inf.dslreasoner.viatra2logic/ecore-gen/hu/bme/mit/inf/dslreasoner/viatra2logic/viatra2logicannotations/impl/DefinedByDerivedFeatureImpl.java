/**
 */
package hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.impl.RelationAnnotationImpl;

import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.DefinedByDerivedFeature;
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransfomedViatraQuery;
import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Defined By Derived Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl.DefinedByDerivedFeatureImpl#getQuery <em>Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinedByDerivedFeatureImpl extends RelationAnnotationImpl implements DefinedByDerivedFeature {
	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected TransfomedViatraQuery query;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinedByDerivedFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Viatra2LogicAnnotationsPackage.Literals.DEFINED_BY_DERIVED_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransfomedViatraQuery getQuery() {
		if (query != null && query.eIsProxy()) {
			InternalEObject oldQuery = (InternalEObject)query;
			query = (TransfomedViatraQuery)eResolveProxy(oldQuery);
			if (query != oldQuery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Viatra2LogicAnnotationsPackage.DEFINED_BY_DERIVED_FEATURE__QUERY, oldQuery, query));
			}
		}
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransfomedViatraQuery basicGetQuery() {
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuery(TransfomedViatraQuery newQuery) {
		TransfomedViatraQuery oldQuery = query;
		query = newQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Viatra2LogicAnnotationsPackage.DEFINED_BY_DERIVED_FEATURE__QUERY, oldQuery, query));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Viatra2LogicAnnotationsPackage.DEFINED_BY_DERIVED_FEATURE__QUERY:
				if (resolve) return getQuery();
				return basicGetQuery();
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
			case Viatra2LogicAnnotationsPackage.DEFINED_BY_DERIVED_FEATURE__QUERY:
				setQuery((TransfomedViatraQuery)newValue);
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
			case Viatra2LogicAnnotationsPackage.DEFINED_BY_DERIVED_FEATURE__QUERY:
				setQuery((TransfomedViatraQuery)null);
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
			case Viatra2LogicAnnotationsPackage.DEFINED_BY_DERIVED_FEATURE__QUERY:
				return query != null;
		}
		return super.eIsSet(featureID);
	}

} //DefinedByDerivedFeatureImpl
