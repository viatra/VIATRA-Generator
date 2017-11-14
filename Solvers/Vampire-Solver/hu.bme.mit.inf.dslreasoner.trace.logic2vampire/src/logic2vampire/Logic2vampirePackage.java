/**
 */
package logic2vampire;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see logic2vampire.Logic2vampireFactory
 * @model kind="package"
 * @generated
 */
public interface Logic2vampirePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "logic2vampire";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/logic2vampire";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "logic2vampire";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Logic2vampirePackage eINSTANCE = logic2vampire.impl.Logic2vampirePackageImpl.init();

	/**
	 * The meta object id for the '{@link logic2vampire.impl.Logic2VampireImpl <em>Logic2 Vampire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logic2vampire.impl.Logic2VampireImpl
	 * @see logic2vampire.impl.Logic2vampirePackageImpl#getLogic2Vampire()
	 * @generated
	 */
	int LOGIC2_VAMPIRE = 0;

	/**
	 * The feature id for the '<em><b>Logic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC2_VAMPIRE__LOGIC = 0;

	/**
	 * The feature id for the '<em><b>Vampire</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC2_VAMPIRE__VAMPIRE = 1;

	/**
	 * The feature id for the '<em><b>Traces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC2_VAMPIRE__TRACES = 2;

	/**
	 * The number of structural features of the '<em>Logic2 Vampire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC2_VAMPIRE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Logic2 Vampire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC2_VAMPIRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link logic2vampire.impl.Logic2VampireTraceImpl <em>Logic2 Vampire Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see logic2vampire.impl.Logic2VampireTraceImpl
	 * @see logic2vampire.impl.Logic2vampirePackageImpl#getLogic2VampireTrace()
	 * @generated
	 */
	int LOGIC2_VAMPIRE_TRACE = 1;

	/**
	 * The feature id for the '<em><b>Term Description</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC2_VAMPIRE_TRACE__TERM_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Vls Formula</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC2_VAMPIRE_TRACE__VLS_FORMULA = 1;

	/**
	 * The number of structural features of the '<em>Logic2 Vampire Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC2_VAMPIRE_TRACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Logic2 Vampire Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC2_VAMPIRE_TRACE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link logic2vampire.Logic2Vampire <em>Logic2 Vampire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic2 Vampire</em>'.
	 * @see logic2vampire.Logic2Vampire
	 * @generated
	 */
	EClass getLogic2Vampire();

	/**
	 * Returns the meta object for the reference '{@link logic2vampire.Logic2Vampire#getLogic <em>Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logic</em>'.
	 * @see logic2vampire.Logic2Vampire#getLogic()
	 * @see #getLogic2Vampire()
	 * @generated
	 */
	EReference getLogic2Vampire_Logic();

	/**
	 * Returns the meta object for the reference '{@link logic2vampire.Logic2Vampire#getVampire <em>Vampire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vampire</em>'.
	 * @see logic2vampire.Logic2Vampire#getVampire()
	 * @see #getLogic2Vampire()
	 * @generated
	 */
	EReference getLogic2Vampire_Vampire();

	/**
	 * Returns the meta object for the containment reference list '{@link logic2vampire.Logic2Vampire#getTraces <em>Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Traces</em>'.
	 * @see logic2vampire.Logic2Vampire#getTraces()
	 * @see #getLogic2Vampire()
	 * @generated
	 */
	EReference getLogic2Vampire_Traces();

	/**
	 * Returns the meta object for class '{@link logic2vampire.Logic2VampireTrace <em>Logic2 Vampire Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic2 Vampire Trace</em>'.
	 * @see logic2vampire.Logic2VampireTrace
	 * @generated
	 */
	EClass getLogic2VampireTrace();

	/**
	 * Returns the meta object for the reference list '{@link logic2vampire.Logic2VampireTrace#getTermDescription <em>Term Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Term Description</em>'.
	 * @see logic2vampire.Logic2VampireTrace#getTermDescription()
	 * @see #getLogic2VampireTrace()
	 * @generated
	 */
	EReference getLogic2VampireTrace_TermDescription();

	/**
	 * Returns the meta object for the reference list '{@link logic2vampire.Logic2VampireTrace#getVlsFormula <em>Vls Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vls Formula</em>'.
	 * @see logic2vampire.Logic2VampireTrace#getVlsFormula()
	 * @see #getLogic2VampireTrace()
	 * @generated
	 */
	EReference getLogic2VampireTrace_VlsFormula();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Logic2vampireFactory getLogic2vampireFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link logic2vampire.impl.Logic2VampireImpl <em>Logic2 Vampire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logic2vampire.impl.Logic2VampireImpl
		 * @see logic2vampire.impl.Logic2vampirePackageImpl#getLogic2Vampire()
		 * @generated
		 */
		EClass LOGIC2_VAMPIRE = eINSTANCE.getLogic2Vampire();

		/**
		 * The meta object literal for the '<em><b>Logic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC2_VAMPIRE__LOGIC = eINSTANCE.getLogic2Vampire_Logic();

		/**
		 * The meta object literal for the '<em><b>Vampire</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC2_VAMPIRE__VAMPIRE = eINSTANCE.getLogic2Vampire_Vampire();

		/**
		 * The meta object literal for the '<em><b>Traces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC2_VAMPIRE__TRACES = eINSTANCE.getLogic2Vampire_Traces();

		/**
		 * The meta object literal for the '{@link logic2vampire.impl.Logic2VampireTraceImpl <em>Logic2 Vampire Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see logic2vampire.impl.Logic2VampireTraceImpl
		 * @see logic2vampire.impl.Logic2vampirePackageImpl#getLogic2VampireTrace()
		 * @generated
		 */
		EClass LOGIC2_VAMPIRE_TRACE = eINSTANCE.getLogic2VampireTrace();

		/**
		 * The meta object literal for the '<em><b>Term Description</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC2_VAMPIRE_TRACE__TERM_DESCRIPTION = eINSTANCE.getLogic2VampireTrace_TermDescription();

		/**
		 * The meta object literal for the '<em><b>Vls Formula</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIC2_VAMPIRE_TRACE__VLS_FORMULA = eINSTANCE.getLogic2VampireTrace_VlsFormula();

	}

} //Logic2vampirePackage
