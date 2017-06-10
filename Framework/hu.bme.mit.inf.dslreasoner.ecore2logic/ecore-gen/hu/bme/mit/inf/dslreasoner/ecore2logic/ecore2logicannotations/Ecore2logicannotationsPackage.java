/**
 */
package hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.Ecore2logicannotationsFactory
 * @model kind="package"
 * @generated
 */
public interface Ecore2logicannotationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecore2logicannotations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.bme.hu/mit/inf/dslreasoner/logic/model/language/ecore2logicannotation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecore2logicannotations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ecore2logicannotationsPackage eINSTANCE = hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl.Ecore2logicannotationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl.MultiplicityAssertionImpl <em>Multiplicity Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl.MultiplicityAssertionImpl
	 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl.Ecore2logicannotationsPackageImpl#getMultiplicityAssertion()
	 * @generated
	 */
	int MULTIPLICITY_ASSERTION = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ASSERTION__TARGET = LogicproblemPackage.ASSERTION_ANNOTATION__TARGET;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ASSERTION__RELATION = LogicproblemPackage.ASSERTION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiplicity Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ASSERTION_FEATURE_COUNT = LogicproblemPackage.ASSERTION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multiplicity Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ASSERTION_OPERATION_COUNT = LogicproblemPackage.ASSERTION_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl.InverseRelationAssertionImpl <em>Inverse Relation Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl.InverseRelationAssertionImpl
	 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl.Ecore2logicannotationsPackageImpl#getInverseRelationAssertion()
	 * @generated
	 */
	int INVERSE_RELATION_ASSERTION = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_RELATION_ASSERTION__TARGET = LogicproblemPackage.ASSERTION_ANNOTATION__TARGET;

	/**
	 * The feature id for the '<em><b>Inverse A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_RELATION_ASSERTION__INVERSE_A = LogicproblemPackage.ASSERTION_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inverse B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_RELATION_ASSERTION__INVERSE_B = LogicproblemPackage.ASSERTION_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inverse Relation Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_RELATION_ASSERTION_FEATURE_COUNT = LogicproblemPackage.ASSERTION_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Inverse Relation Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVERSE_RELATION_ASSERTION_OPERATION_COUNT = LogicproblemPackage.ASSERTION_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl.LowerMultiplicityAssertionImpl <em>Lower Multiplicity Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl.LowerMultiplicityAssertionImpl
	 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl.Ecore2logicannotationsPackageImpl#getLowerMultiplicityAssertion()
	 * @generated
	 */
	int LOWER_MULTIPLICITY_ASSERTION = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_MULTIPLICITY_ASSERTION__TARGET = MULTIPLICITY_ASSERTION__TARGET;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_MULTIPLICITY_ASSERTION__RELATION = MULTIPLICITY_ASSERTION__RELATION;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_MULTIPLICITY_ASSERTION__LOWER = MULTIPLICITY_ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lower Multiplicity Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_MULTIPLICITY_ASSERTION_FEATURE_COUNT = MULTIPLICITY_ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lower Multiplicity Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_MULTIPLICITY_ASSERTION_OPERATION_COUNT = MULTIPLICITY_ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl.UpperMultiplicityAssertionImpl <em>Upper Multiplicity Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl.UpperMultiplicityAssertionImpl
	 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl.Ecore2logicannotationsPackageImpl#getUpperMultiplicityAssertion()
	 * @generated
	 */
	int UPPER_MULTIPLICITY_ASSERTION = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_MULTIPLICITY_ASSERTION__TARGET = MULTIPLICITY_ASSERTION__TARGET;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_MULTIPLICITY_ASSERTION__RELATION = MULTIPLICITY_ASSERTION__RELATION;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_MULTIPLICITY_ASSERTION__UPPER = MULTIPLICITY_ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Upper Multiplicity Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_MULTIPLICITY_ASSERTION_FEATURE_COUNT = MULTIPLICITY_ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Upper Multiplicity Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_MULTIPLICITY_ASSERTION_OPERATION_COUNT = MULTIPLICITY_ASSERTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.MultiplicityAssertion <em>Multiplicity Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Assertion</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.MultiplicityAssertion
	 * @generated
	 */
	EClass getMultiplicityAssertion();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.MultiplicityAssertion#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.MultiplicityAssertion#getRelation()
	 * @see #getMultiplicityAssertion()
	 * @generated
	 */
	EReference getMultiplicityAssertion_Relation();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.InverseRelationAssertion <em>Inverse Relation Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inverse Relation Assertion</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.InverseRelationAssertion
	 * @generated
	 */
	EClass getInverseRelationAssertion();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.InverseRelationAssertion#getInverseA <em>Inverse A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inverse A</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.InverseRelationAssertion#getInverseA()
	 * @see #getInverseRelationAssertion()
	 * @generated
	 */
	EReference getInverseRelationAssertion_InverseA();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.InverseRelationAssertion#getInverseB <em>Inverse B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inverse B</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.InverseRelationAssertion#getInverseB()
	 * @see #getInverseRelationAssertion()
	 * @generated
	 */
	EReference getInverseRelationAssertion_InverseB();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.LowerMultiplicityAssertion <em>Lower Multiplicity Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower Multiplicity Assertion</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.LowerMultiplicityAssertion
	 * @generated
	 */
	EClass getLowerMultiplicityAssertion();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.LowerMultiplicityAssertion#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.LowerMultiplicityAssertion#getLower()
	 * @see #getLowerMultiplicityAssertion()
	 * @generated
	 */
	EAttribute getLowerMultiplicityAssertion_Lower();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.UpperMultiplicityAssertion <em>Upper Multiplicity Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Upper Multiplicity Assertion</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.UpperMultiplicityAssertion
	 * @generated
	 */
	EClass getUpperMultiplicityAssertion();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.UpperMultiplicityAssertion#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.UpperMultiplicityAssertion#getUpper()
	 * @see #getUpperMultiplicityAssertion()
	 * @generated
	 */
	EAttribute getUpperMultiplicityAssertion_Upper();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Ecore2logicannotationsFactory getEcore2logicannotationsFactory();

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
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl.MultiplicityAssertionImpl <em>Multiplicity Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl.MultiplicityAssertionImpl
		 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl.Ecore2logicannotationsPackageImpl#getMultiplicityAssertion()
		 * @generated
		 */
		EClass MULTIPLICITY_ASSERTION = eINSTANCE.getMultiplicityAssertion();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLICITY_ASSERTION__RELATION = eINSTANCE.getMultiplicityAssertion_Relation();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl.InverseRelationAssertionImpl <em>Inverse Relation Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl.InverseRelationAssertionImpl
		 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl.Ecore2logicannotationsPackageImpl#getInverseRelationAssertion()
		 * @generated
		 */
		EClass INVERSE_RELATION_ASSERTION = eINSTANCE.getInverseRelationAssertion();

		/**
		 * The meta object literal for the '<em><b>Inverse A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERSE_RELATION_ASSERTION__INVERSE_A = eINSTANCE.getInverseRelationAssertion_InverseA();

		/**
		 * The meta object literal for the '<em><b>Inverse B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVERSE_RELATION_ASSERTION__INVERSE_B = eINSTANCE.getInverseRelationAssertion_InverseB();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl.LowerMultiplicityAssertionImpl <em>Lower Multiplicity Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl.LowerMultiplicityAssertionImpl
		 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl.Ecore2logicannotationsPackageImpl#getLowerMultiplicityAssertion()
		 * @generated
		 */
		EClass LOWER_MULTIPLICITY_ASSERTION = eINSTANCE.getLowerMultiplicityAssertion();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOWER_MULTIPLICITY_ASSERTION__LOWER = eINSTANCE.getLowerMultiplicityAssertion_Lower();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl.UpperMultiplicityAssertionImpl <em>Upper Multiplicity Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl.UpperMultiplicityAssertionImpl
		 * @see hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl.Ecore2logicannotationsPackageImpl#getUpperMultiplicityAssertion()
		 * @generated
		 */
		EClass UPPER_MULTIPLICITY_ASSERTION = eINSTANCE.getUpperMultiplicityAssertion();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPPER_MULTIPLICITY_ASSERTION__UPPER = eINSTANCE.getUpperMultiplicityAssertion_Upper();

	}

} //Ecore2logicannotationsPackage
