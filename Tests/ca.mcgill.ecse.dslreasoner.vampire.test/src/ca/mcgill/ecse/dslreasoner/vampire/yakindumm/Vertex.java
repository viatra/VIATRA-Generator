<<<<<<< HEAD:Tests/ca.mcgill.ecse.dslreasoner.vampire.test/src/ca/mcgill/ecse/dslreasoner/vampire/yakindumm/Vertex.java
/**
 */
package ca.mcgill.ecse.dslreasoner.vampire.yakindumm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.vampire.yakindumm.Vertex#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.vampire.yakindumm.Vertex#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.ecse.dslreasoner.vampire.yakindumm.YakindummPackage#getVertex()
 * @model abstract="true"
 * @generated
 */
public interface Vertex extends EObject {
	/**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.ecse.dslreasoner.vampire.yakindumm.Transition}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.ecse.dslreasoner.vampire.yakindumm.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transitions</em>' reference list.
	 * @see ca.mcgill.ecse.dslreasoner.vampire.yakindumm.YakindummPackage#getVertex_IncomingTransitions()
	 * @see ca.mcgill.ecse.dslreasoner.vampire.yakindumm.Transition#getTarget
	 * @model opposite="target" ordered="false"
	 * @generated
	 */
	EList<Transition> getIncomingTransitions();

	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.ecse.dslreasoner.vampire.yakindumm.Transition}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.ecse.dslreasoner.vampire.yakindumm.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' containment reference list.
	 * @see ca.mcgill.ecse.dslreasoner.vampire.yakindumm.YakindummPackage#getVertex_OutgoingTransitions()
	 * @see ca.mcgill.ecse.dslreasoner.vampire.yakindumm.Transition#getSource
	 * @model opposite="source" containment="true" ordered="false"
	 * @generated
	 */
	EList<Transition> getOutgoingTransitions();

} // Vertex
=======
/**
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.yakindu;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Vertex#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Vertex#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.YakinduPackage#getVertex()
 * @model abstract="true"
 * @generated
 */
public interface Vertex extends EObject {
	/**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Transition}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transitions</em>' reference list.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.YakinduPackage#getVertex_IncomingTransitions()
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Transition#getTarget
	 * @model opposite="target" ordered="false"
	 * @generated
	 */
	EList<Transition> getIncomingTransitions();

	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Transition}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' containment reference list.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.YakinduPackage#getVertex_OutgoingTransitions()
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Transition#getSource
	 * @model opposite="source" containment="true" ordered="false"
	 * @generated
	 */
	EList<Transition> getOutgoingTransitions();

} // Vertex
>>>>>>> f1f2a1fa... Pre-realisticBranchCreation Commit:Tests/ca.mcgill.ecse.dslreasoner.standalone.test/src/ca/mcgill/ecse/dslreasoner/standalone/test/yakindu/Vertex.java
