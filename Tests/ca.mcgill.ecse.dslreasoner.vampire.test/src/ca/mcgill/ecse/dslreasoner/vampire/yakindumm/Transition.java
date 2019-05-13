<<<<<<< HEAD:Tests/ca.mcgill.ecse.dslreasoner.vampire.test/src/ca/mcgill/ecse/dslreasoner/vampire/yakindumm/Transition.java
/**
 */
package ca.mcgill.ecse.dslreasoner.vampire.yakindumm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.vampire.yakindumm.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.vampire.yakindumm.Transition#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.ecse.dslreasoner.vampire.yakindumm.YakindummPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.ecse.dslreasoner.vampire.yakindumm.Vertex#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Vertex)
	 * @see ca.mcgill.ecse.dslreasoner.vampire.yakindumm.YakindummPackage#getTransition_Target()
	 * @see ca.mcgill.ecse.dslreasoner.vampire.yakindumm.Vertex#getIncomingTransitions
	 * @model opposite="incomingTransitions" required="true" ordered="false"
	 * @generated
	 */
	Vertex getTarget();

	/**
	 * Sets the value of the '{@link ca.mcgill.ecse.dslreasoner.vampire.yakindumm.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Vertex value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.ecse.dslreasoner.vampire.yakindumm.Vertex#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(Vertex)
	 * @see ca.mcgill.ecse.dslreasoner.vampire.yakindumm.YakindummPackage#getTransition_Source()
	 * @see ca.mcgill.ecse.dslreasoner.vampire.yakindumm.Vertex#getOutgoingTransitions
	 * @model opposite="outgoingTransitions" transient="false" ordered="false"
	 * @generated
	 */
	Vertex getSource();

	/**
	 * Sets the value of the '{@link ca.mcgill.ecse.dslreasoner.vampire.yakindumm.Transition#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Vertex value);

} // Transition
=======
/**
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.yakindu;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Transition#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.YakinduPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Vertex#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Vertex)
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.YakinduPackage#getTransition_Target()
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Vertex#getIncomingTransitions
	 * @model opposite="incomingTransitions" required="true" ordered="false"
	 * @generated
	 */
	Vertex getTarget();

	/**
	 * Sets the value of the '{@link ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Vertex value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Vertex#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(Vertex)
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.YakinduPackage#getTransition_Source()
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Vertex#getOutgoingTransitions
	 * @model opposite="outgoingTransitions" transient="false" ordered="false"
	 * @generated
	 */
	Vertex getSource();

	/**
	 * Sets the value of the '{@link ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Transition#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Vertex value);

} // Transition
>>>>>>> f1f2a1fa... Pre-realisticBranchCreation Commit:Tests/ca.mcgill.ecse.dslreasoner.standalone.test/src/ca/mcgill/ecse/dslreasoner/standalone/test/yakindu/Transition.java
