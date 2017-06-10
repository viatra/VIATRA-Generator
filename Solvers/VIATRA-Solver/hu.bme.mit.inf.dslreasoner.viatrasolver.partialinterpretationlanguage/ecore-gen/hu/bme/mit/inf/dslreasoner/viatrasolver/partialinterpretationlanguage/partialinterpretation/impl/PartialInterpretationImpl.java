/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialConstantInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialFunctionInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partial Interpretation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialInterpretationImpl#getProblem <em>Problem</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialInterpretationImpl#getPartialconstantinterpretation <em>Partialconstantinterpretation</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialInterpretationImpl#getPartialrelationinterpretation <em>Partialrelationinterpretation</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialInterpretationImpl#getPartialfunctioninterpretation <em>Partialfunctioninterpretation</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialInterpretationImpl#getNewElements <em>New Elements</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialInterpretationImpl#getPartialtypeinterpratation <em>Partialtypeinterpratation</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialInterpretationImpl#getMinNewElements <em>Min New Elements</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialInterpretationImpl#getMaxNewElements <em>Max New Elements</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialInterpretationImpl#getOpenWorldElementPrototype <em>Open World Element Prototype</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialInterpretationImpl#getProblemConainer <em>Problem Conainer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartialInterpretationImpl extends MinimalEObjectImpl.Container implements PartialInterpretation {
	/**
	 * The cached value of the '{@link #getProblem() <em>Problem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblem()
	 * @generated
	 * @ordered
	 */
	protected LogicProblem problem;

	/**
	 * The cached value of the '{@link #getPartialconstantinterpretation() <em>Partialconstantinterpretation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartialconstantinterpretation()
	 * @generated
	 * @ordered
	 */
	protected EList<PartialConstantInterpretation> partialconstantinterpretation;

	/**
	 * The cached value of the '{@link #getPartialrelationinterpretation() <em>Partialrelationinterpretation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartialrelationinterpretation()
	 * @generated
	 * @ordered
	 */
	protected EList<PartialRelationInterpretation> partialrelationinterpretation;

	/**
	 * The cached value of the '{@link #getPartialfunctioninterpretation() <em>Partialfunctioninterpretation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartialfunctioninterpretation()
	 * @generated
	 * @ordered
	 */
	protected EList<PartialFunctionInterpretation> partialfunctioninterpretation;

	/**
	 * The cached value of the '{@link #getNewElements() <em>New Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewElements()
	 * @generated
	 * @ordered
	 */
	protected EList<DefinedElement> newElements;

	/**
	 * The cached value of the '{@link #getPartialtypeinterpratation() <em>Partialtypeinterpratation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartialtypeinterpratation()
	 * @generated
	 * @ordered
	 */
	protected EList<PartialTypeInterpratation> partialtypeinterpratation;

	/**
	 * The default value of the '{@link #getMinNewElements() <em>Min New Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinNewElements()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_NEW_ELEMENTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinNewElements() <em>Min New Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinNewElements()
	 * @generated
	 * @ordered
	 */
	protected int minNewElements = MIN_NEW_ELEMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxNewElements() <em>Max New Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNewElements()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_NEW_ELEMENTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxNewElements() <em>Max New Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNewElements()
	 * @generated
	 * @ordered
	 */
	protected int maxNewElements = MAX_NEW_ELEMENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOpenWorldElementPrototype() <em>Open World Element Prototype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenWorldElementPrototype()
	 * @generated
	 * @ordered
	 */
	protected DefinedElement openWorldElementPrototype;

	/**
	 * The cached value of the '{@link #getProblemConainer() <em>Problem Conainer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemConainer()
	 * @generated
	 * @ordered
	 */
	protected LogicProblem problemConainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartialInterpretationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PartialinterpretationPackage.Literals.PARTIAL_INTERPRETATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicProblem getProblem() {
		if (problem != null && problem.eIsProxy()) {
			InternalEObject oldProblem = (InternalEObject)problem;
			problem = (LogicProblem)eResolveProxy(oldProblem);
			if (problem != oldProblem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PartialinterpretationPackage.PARTIAL_INTERPRETATION__PROBLEM, oldProblem, problem));
			}
		}
		return problem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicProblem basicGetProblem() {
		return problem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblem(LogicProblem newProblem) {
		LogicProblem oldProblem = problem;
		problem = newProblem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialinterpretationPackage.PARTIAL_INTERPRETATION__PROBLEM, oldProblem, problem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartialConstantInterpretation> getPartialconstantinterpretation() {
		if (partialconstantinterpretation == null) {
			partialconstantinterpretation = new EObjectContainmentEList<PartialConstantInterpretation>(PartialConstantInterpretation.class, this, PartialinterpretationPackage.PARTIAL_INTERPRETATION__PARTIALCONSTANTINTERPRETATION);
		}
		return partialconstantinterpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartialRelationInterpretation> getPartialrelationinterpretation() {
		if (partialrelationinterpretation == null) {
			partialrelationinterpretation = new EObjectContainmentEList<PartialRelationInterpretation>(PartialRelationInterpretation.class, this, PartialinterpretationPackage.PARTIAL_INTERPRETATION__PARTIALRELATIONINTERPRETATION);
		}
		return partialrelationinterpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartialFunctionInterpretation> getPartialfunctioninterpretation() {
		if (partialfunctioninterpretation == null) {
			partialfunctioninterpretation = new EObjectContainmentEList<PartialFunctionInterpretation>(PartialFunctionInterpretation.class, this, PartialinterpretationPackage.PARTIAL_INTERPRETATION__PARTIALFUNCTIONINTERPRETATION);
		}
		return partialfunctioninterpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DefinedElement> getNewElements() {
		if (newElements == null) {
			newElements = new EObjectContainmentEList<DefinedElement>(DefinedElement.class, this, PartialinterpretationPackage.PARTIAL_INTERPRETATION__NEW_ELEMENTS);
		}
		return newElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartialTypeInterpratation> getPartialtypeinterpratation() {
		if (partialtypeinterpratation == null) {
			partialtypeinterpratation = new EObjectContainmentEList<PartialTypeInterpratation>(PartialTypeInterpratation.class, this, PartialinterpretationPackage.PARTIAL_INTERPRETATION__PARTIALTYPEINTERPRATATION);
		}
		return partialtypeinterpratation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinNewElements() {
		return minNewElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinNewElements(int newMinNewElements) {
		int oldMinNewElements = minNewElements;
		minNewElements = newMinNewElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialinterpretationPackage.PARTIAL_INTERPRETATION__MIN_NEW_ELEMENTS, oldMinNewElements, minNewElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxNewElements() {
		return maxNewElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNewElements(int newMaxNewElements) {
		int oldMaxNewElements = maxNewElements;
		maxNewElements = newMaxNewElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialinterpretationPackage.PARTIAL_INTERPRETATION__MAX_NEW_ELEMENTS, oldMaxNewElements, maxNewElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinedElement getOpenWorldElementPrototype() {
		return openWorldElementPrototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpenWorldElementPrototype(DefinedElement newOpenWorldElementPrototype, NotificationChain msgs) {
		DefinedElement oldOpenWorldElementPrototype = openWorldElementPrototype;
		openWorldElementPrototype = newOpenWorldElementPrototype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartialinterpretationPackage.PARTIAL_INTERPRETATION__OPEN_WORLD_ELEMENT_PROTOTYPE, oldOpenWorldElementPrototype, newOpenWorldElementPrototype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenWorldElementPrototype(DefinedElement newOpenWorldElementPrototype) {
		if (newOpenWorldElementPrototype != openWorldElementPrototype) {
			NotificationChain msgs = null;
			if (openWorldElementPrototype != null)
				msgs = ((InternalEObject)openWorldElementPrototype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartialinterpretationPackage.PARTIAL_INTERPRETATION__OPEN_WORLD_ELEMENT_PROTOTYPE, null, msgs);
			if (newOpenWorldElementPrototype != null)
				msgs = ((InternalEObject)newOpenWorldElementPrototype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartialinterpretationPackage.PARTIAL_INTERPRETATION__OPEN_WORLD_ELEMENT_PROTOTYPE, null, msgs);
			msgs = basicSetOpenWorldElementPrototype(newOpenWorldElementPrototype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialinterpretationPackage.PARTIAL_INTERPRETATION__OPEN_WORLD_ELEMENT_PROTOTYPE, newOpenWorldElementPrototype, newOpenWorldElementPrototype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicProblem getProblemConainer() {
		return problemConainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProblemConainer(LogicProblem newProblemConainer, NotificationChain msgs) {
		LogicProblem oldProblemConainer = problemConainer;
		problemConainer = newProblemConainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PartialinterpretationPackage.PARTIAL_INTERPRETATION__PROBLEM_CONAINER, oldProblemConainer, newProblemConainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblemConainer(LogicProblem newProblemConainer) {
		if (newProblemConainer != problemConainer) {
			NotificationChain msgs = null;
			if (problemConainer != null)
				msgs = ((InternalEObject)problemConainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PartialinterpretationPackage.PARTIAL_INTERPRETATION__PROBLEM_CONAINER, null, msgs);
			if (newProblemConainer != null)
				msgs = ((InternalEObject)newProblemConainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PartialinterpretationPackage.PARTIAL_INTERPRETATION__PROBLEM_CONAINER, null, msgs);
			msgs = basicSetProblemConainer(newProblemConainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialinterpretationPackage.PARTIAL_INTERPRETATION__PROBLEM_CONAINER, newProblemConainer, newProblemConainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PARTIALCONSTANTINTERPRETATION:
				return ((InternalEList<?>)getPartialconstantinterpretation()).basicRemove(otherEnd, msgs);
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PARTIALRELATIONINTERPRETATION:
				return ((InternalEList<?>)getPartialrelationinterpretation()).basicRemove(otherEnd, msgs);
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PARTIALFUNCTIONINTERPRETATION:
				return ((InternalEList<?>)getPartialfunctioninterpretation()).basicRemove(otherEnd, msgs);
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__NEW_ELEMENTS:
				return ((InternalEList<?>)getNewElements()).basicRemove(otherEnd, msgs);
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PARTIALTYPEINTERPRATATION:
				return ((InternalEList<?>)getPartialtypeinterpratation()).basicRemove(otherEnd, msgs);
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__OPEN_WORLD_ELEMENT_PROTOTYPE:
				return basicSetOpenWorldElementPrototype(null, msgs);
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PROBLEM_CONAINER:
				return basicSetProblemConainer(null, msgs);
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
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PROBLEM:
				if (resolve) return getProblem();
				return basicGetProblem();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PARTIALCONSTANTINTERPRETATION:
				return getPartialconstantinterpretation();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PARTIALRELATIONINTERPRETATION:
				return getPartialrelationinterpretation();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PARTIALFUNCTIONINTERPRETATION:
				return getPartialfunctioninterpretation();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__NEW_ELEMENTS:
				return getNewElements();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PARTIALTYPEINTERPRATATION:
				return getPartialtypeinterpratation();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__MIN_NEW_ELEMENTS:
				return getMinNewElements();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__MAX_NEW_ELEMENTS:
				return getMaxNewElements();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__OPEN_WORLD_ELEMENT_PROTOTYPE:
				return getOpenWorldElementPrototype();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PROBLEM_CONAINER:
				return getProblemConainer();
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
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PROBLEM:
				setProblem((LogicProblem)newValue);
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PARTIALCONSTANTINTERPRETATION:
				getPartialconstantinterpretation().clear();
				getPartialconstantinterpretation().addAll((Collection<? extends PartialConstantInterpretation>)newValue);
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PARTIALRELATIONINTERPRETATION:
				getPartialrelationinterpretation().clear();
				getPartialrelationinterpretation().addAll((Collection<? extends PartialRelationInterpretation>)newValue);
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PARTIALFUNCTIONINTERPRETATION:
				getPartialfunctioninterpretation().clear();
				getPartialfunctioninterpretation().addAll((Collection<? extends PartialFunctionInterpretation>)newValue);
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__NEW_ELEMENTS:
				getNewElements().clear();
				getNewElements().addAll((Collection<? extends DefinedElement>)newValue);
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PARTIALTYPEINTERPRATATION:
				getPartialtypeinterpratation().clear();
				getPartialtypeinterpratation().addAll((Collection<? extends PartialTypeInterpratation>)newValue);
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__MIN_NEW_ELEMENTS:
				setMinNewElements((Integer)newValue);
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__MAX_NEW_ELEMENTS:
				setMaxNewElements((Integer)newValue);
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__OPEN_WORLD_ELEMENT_PROTOTYPE:
				setOpenWorldElementPrototype((DefinedElement)newValue);
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PROBLEM_CONAINER:
				setProblemConainer((LogicProblem)newValue);
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
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PROBLEM:
				setProblem((LogicProblem)null);
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PARTIALCONSTANTINTERPRETATION:
				getPartialconstantinterpretation().clear();
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PARTIALRELATIONINTERPRETATION:
				getPartialrelationinterpretation().clear();
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PARTIALFUNCTIONINTERPRETATION:
				getPartialfunctioninterpretation().clear();
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__NEW_ELEMENTS:
				getNewElements().clear();
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PARTIALTYPEINTERPRATATION:
				getPartialtypeinterpratation().clear();
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__MIN_NEW_ELEMENTS:
				setMinNewElements(MIN_NEW_ELEMENTS_EDEFAULT);
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__MAX_NEW_ELEMENTS:
				setMaxNewElements(MAX_NEW_ELEMENTS_EDEFAULT);
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__OPEN_WORLD_ELEMENT_PROTOTYPE:
				setOpenWorldElementPrototype((DefinedElement)null);
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PROBLEM_CONAINER:
				setProblemConainer((LogicProblem)null);
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
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PROBLEM:
				return problem != null;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PARTIALCONSTANTINTERPRETATION:
				return partialconstantinterpretation != null && !partialconstantinterpretation.isEmpty();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PARTIALRELATIONINTERPRETATION:
				return partialrelationinterpretation != null && !partialrelationinterpretation.isEmpty();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PARTIALFUNCTIONINTERPRETATION:
				return partialfunctioninterpretation != null && !partialfunctioninterpretation.isEmpty();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__NEW_ELEMENTS:
				return newElements != null && !newElements.isEmpty();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PARTIALTYPEINTERPRATATION:
				return partialtypeinterpratation != null && !partialtypeinterpratation.isEmpty();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__MIN_NEW_ELEMENTS:
				return minNewElements != MIN_NEW_ELEMENTS_EDEFAULT;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__MAX_NEW_ELEMENTS:
				return maxNewElements != MAX_NEW_ELEMENTS_EDEFAULT;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__OPEN_WORLD_ELEMENT_PROTOTYPE:
				return openWorldElementPrototype != null;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PROBLEM_CONAINER:
				return problemConainer != null;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (minNewElements: ");
		result.append(minNewElements);
		result.append(", maxNewElements: ");
		result.append(maxNewElements);
		result.append(')');
		return result.toString();
	}

} //PartialInterpretationImpl
