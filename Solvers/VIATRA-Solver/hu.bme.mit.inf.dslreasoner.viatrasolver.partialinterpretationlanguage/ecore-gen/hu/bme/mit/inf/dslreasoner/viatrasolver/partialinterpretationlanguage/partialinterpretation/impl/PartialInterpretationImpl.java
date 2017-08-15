/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BooleanElement;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.IntegerElement;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialConstantInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialFunctionInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage;

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RealElement;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.StringElement;
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
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialInterpretationImpl#getOpenWorldElementPrototypes <em>Open World Element Prototypes</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialInterpretationImpl#getProblemConainer <em>Problem Conainer</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialInterpretationImpl#getStringelement <em>Stringelement</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialInterpretationImpl#getStringelements <em>Stringelements</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialInterpretationImpl#getRealelements <em>Realelements</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialInterpretationImpl#getIntegerelements <em>Integerelements</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialInterpretationImpl#getBooleanelements <em>Booleanelements</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialInterpretationImpl#getMaxNewIntegers <em>Max New Integers</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialInterpretationImpl#getMaxNewReals <em>Max New Reals</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialInterpretationImpl#getMaxNewStrings <em>Max New Strings</em>}</li>
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
	 * The cached value of the '{@link #getOpenWorldElementPrototypes() <em>Open World Element Prototypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenWorldElementPrototypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DefinedElement> openWorldElementPrototypes;

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
	 * The cached value of the '{@link #getStringelement() <em>Stringelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringelement()
	 * @generated
	 * @ordered
	 */
	protected EList<StringElement> stringelement;

	/**
	 * The cached value of the '{@link #getStringelements() <em>Stringelements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringelements()
	 * @generated
	 * @ordered
	 */
	protected EList<StringElement> stringelements;

	/**
	 * The cached value of the '{@link #getRealelements() <em>Realelements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealelements()
	 * @generated
	 * @ordered
	 */
	protected EList<RealElement> realelements;

	/**
	 * The cached value of the '{@link #getIntegerelements() <em>Integerelements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerelements()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegerElement> integerelements;

	/**
	 * The cached value of the '{@link #getBooleanelements() <em>Booleanelements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanelements()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanElement> booleanelements;

	/**
	 * The default value of the '{@link #getMaxNewIntegers() <em>Max New Integers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNewIntegers()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_NEW_INTEGERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxNewIntegers() <em>Max New Integers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNewIntegers()
	 * @generated
	 * @ordered
	 */
	protected int maxNewIntegers = MAX_NEW_INTEGERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxNewReals() <em>Max New Reals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNewReals()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_NEW_REALS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxNewReals() <em>Max New Reals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNewReals()
	 * @generated
	 * @ordered
	 */
	protected int maxNewReals = MAX_NEW_REALS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxNewStrings() <em>Max New Strings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNewStrings()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_NEW_STRINGS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxNewStrings() <em>Max New Strings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNewStrings()
	 * @generated
	 * @ordered
	 */
	protected int maxNewStrings = MAX_NEW_STRINGS_EDEFAULT;

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
	public EList<DefinedElement> getOpenWorldElementPrototypes() {
		if (openWorldElementPrototypes == null) {
			openWorldElementPrototypes = new EObjectContainmentEList<DefinedElement>(DefinedElement.class, this, PartialinterpretationPackage.PARTIAL_INTERPRETATION__OPEN_WORLD_ELEMENT_PROTOTYPES);
		}
		return openWorldElementPrototypes;
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
	public EList<StringElement> getStringelement() {
		if (stringelement == null) {
			stringelement = new EObjectContainmentEList<StringElement>(StringElement.class, this, PartialinterpretationPackage.PARTIAL_INTERPRETATION__STRINGELEMENT);
		}
		return stringelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StringElement> getStringelements() {
		if (stringelements == null) {
			stringelements = new EObjectContainmentEList<StringElement>(StringElement.class, this, PartialinterpretationPackage.PARTIAL_INTERPRETATION__STRINGELEMENTS);
		}
		return stringelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RealElement> getRealelements() {
		if (realelements == null) {
			realelements = new EObjectContainmentEList<RealElement>(RealElement.class, this, PartialinterpretationPackage.PARTIAL_INTERPRETATION__REALELEMENTS);
		}
		return realelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegerElement> getIntegerelements() {
		if (integerelements == null) {
			integerelements = new EObjectContainmentEList<IntegerElement>(IntegerElement.class, this, PartialinterpretationPackage.PARTIAL_INTERPRETATION__INTEGERELEMENTS);
		}
		return integerelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanElement> getBooleanelements() {
		if (booleanelements == null) {
			booleanelements = new EObjectContainmentEList<BooleanElement>(BooleanElement.class, this, PartialinterpretationPackage.PARTIAL_INTERPRETATION__BOOLEANELEMENTS);
		}
		return booleanelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxNewIntegers() {
		return maxNewIntegers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNewIntegers(int newMaxNewIntegers) {
		int oldMaxNewIntegers = maxNewIntegers;
		maxNewIntegers = newMaxNewIntegers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialinterpretationPackage.PARTIAL_INTERPRETATION__MAX_NEW_INTEGERS, oldMaxNewIntegers, maxNewIntegers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxNewReals() {
		return maxNewReals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNewReals(int newMaxNewReals) {
		int oldMaxNewReals = maxNewReals;
		maxNewReals = newMaxNewReals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialinterpretationPackage.PARTIAL_INTERPRETATION__MAX_NEW_REALS, oldMaxNewReals, maxNewReals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxNewStrings() {
		return maxNewStrings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNewStrings(int newMaxNewStrings) {
		int oldMaxNewStrings = maxNewStrings;
		maxNewStrings = newMaxNewStrings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PartialinterpretationPackage.PARTIAL_INTERPRETATION__MAX_NEW_STRINGS, oldMaxNewStrings, maxNewStrings));
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
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__OPEN_WORLD_ELEMENT_PROTOTYPES:
				return ((InternalEList<?>)getOpenWorldElementPrototypes()).basicRemove(otherEnd, msgs);
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PROBLEM_CONAINER:
				return basicSetProblemConainer(null, msgs);
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__STRINGELEMENT:
				return ((InternalEList<?>)getStringelement()).basicRemove(otherEnd, msgs);
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__STRINGELEMENTS:
				return ((InternalEList<?>)getStringelements()).basicRemove(otherEnd, msgs);
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__REALELEMENTS:
				return ((InternalEList<?>)getRealelements()).basicRemove(otherEnd, msgs);
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__INTEGERELEMENTS:
				return ((InternalEList<?>)getIntegerelements()).basicRemove(otherEnd, msgs);
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__BOOLEANELEMENTS:
				return ((InternalEList<?>)getBooleanelements()).basicRemove(otherEnd, msgs);
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
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__OPEN_WORLD_ELEMENT_PROTOTYPES:
				return getOpenWorldElementPrototypes();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PROBLEM_CONAINER:
				return getProblemConainer();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__STRINGELEMENT:
				return getStringelement();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__STRINGELEMENTS:
				return getStringelements();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__REALELEMENTS:
				return getRealelements();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__INTEGERELEMENTS:
				return getIntegerelements();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__BOOLEANELEMENTS:
				return getBooleanelements();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__MAX_NEW_INTEGERS:
				return getMaxNewIntegers();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__MAX_NEW_REALS:
				return getMaxNewReals();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__MAX_NEW_STRINGS:
				return getMaxNewStrings();
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
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__OPEN_WORLD_ELEMENT_PROTOTYPES:
				getOpenWorldElementPrototypes().clear();
				getOpenWorldElementPrototypes().addAll((Collection<? extends DefinedElement>)newValue);
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PROBLEM_CONAINER:
				setProblemConainer((LogicProblem)newValue);
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__STRINGELEMENT:
				getStringelement().clear();
				getStringelement().addAll((Collection<? extends StringElement>)newValue);
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__STRINGELEMENTS:
				getStringelements().clear();
				getStringelements().addAll((Collection<? extends StringElement>)newValue);
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__REALELEMENTS:
				getRealelements().clear();
				getRealelements().addAll((Collection<? extends RealElement>)newValue);
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__INTEGERELEMENTS:
				getIntegerelements().clear();
				getIntegerelements().addAll((Collection<? extends IntegerElement>)newValue);
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__BOOLEANELEMENTS:
				getBooleanelements().clear();
				getBooleanelements().addAll((Collection<? extends BooleanElement>)newValue);
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__MAX_NEW_INTEGERS:
				setMaxNewIntegers((Integer)newValue);
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__MAX_NEW_REALS:
				setMaxNewReals((Integer)newValue);
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__MAX_NEW_STRINGS:
				setMaxNewStrings((Integer)newValue);
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
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__OPEN_WORLD_ELEMENT_PROTOTYPES:
				getOpenWorldElementPrototypes().clear();
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PROBLEM_CONAINER:
				setProblemConainer((LogicProblem)null);
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__STRINGELEMENT:
				getStringelement().clear();
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__STRINGELEMENTS:
				getStringelements().clear();
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__REALELEMENTS:
				getRealelements().clear();
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__INTEGERELEMENTS:
				getIntegerelements().clear();
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__BOOLEANELEMENTS:
				getBooleanelements().clear();
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__MAX_NEW_INTEGERS:
				setMaxNewIntegers(MAX_NEW_INTEGERS_EDEFAULT);
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__MAX_NEW_REALS:
				setMaxNewReals(MAX_NEW_REALS_EDEFAULT);
				return;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__MAX_NEW_STRINGS:
				setMaxNewStrings(MAX_NEW_STRINGS_EDEFAULT);
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
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__OPEN_WORLD_ELEMENT_PROTOTYPES:
				return openWorldElementPrototypes != null && !openWorldElementPrototypes.isEmpty();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__PROBLEM_CONAINER:
				return problemConainer != null;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__STRINGELEMENT:
				return stringelement != null && !stringelement.isEmpty();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__STRINGELEMENTS:
				return stringelements != null && !stringelements.isEmpty();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__REALELEMENTS:
				return realelements != null && !realelements.isEmpty();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__INTEGERELEMENTS:
				return integerelements != null && !integerelements.isEmpty();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__BOOLEANELEMENTS:
				return booleanelements != null && !booleanelements.isEmpty();
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__MAX_NEW_INTEGERS:
				return maxNewIntegers != MAX_NEW_INTEGERS_EDEFAULT;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__MAX_NEW_REALS:
				return maxNewReals != MAX_NEW_REALS_EDEFAULT;
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION__MAX_NEW_STRINGS:
				return maxNewStrings != MAX_NEW_STRINGS_EDEFAULT;
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
		result.append(", maxNewIntegers: ");
		result.append(maxNewIntegers);
		result.append(", maxNewReals: ");
		result.append(maxNewReals);
		result.append(", maxNewStrings: ");
		result.append(maxNewStrings);
		result.append(')');
		return result.toString();
	}

} //PartialInterpretationImpl
