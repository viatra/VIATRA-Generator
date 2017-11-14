/**
 */
package logic2vampire;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;

import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic2 Vampire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logic2vampire.Logic2Vampire#getLogic <em>Logic</em>}</li>
 *   <li>{@link logic2vampire.Logic2Vampire#getVampire <em>Vampire</em>}</li>
 *   <li>{@link logic2vampire.Logic2Vampire#getTraces <em>Traces</em>}</li>
 * </ul>
 *
 * @see logic2vampire.Logic2vampirePackage#getLogic2Vampire()
 * @model
 * @generated
 */
public interface Logic2Vampire extends EObject {
	/**
	 * Returns the value of the '<em><b>Logic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logic</em>' reference.
	 * @see #setLogic(LogicProblem)
	 * @see logic2vampire.Logic2vampirePackage#getLogic2Vampire_Logic()
	 * @model
	 * @generated
	 */
	LogicProblem getLogic();

	/**
	 * Sets the value of the '{@link logic2vampire.Logic2Vampire#getLogic <em>Logic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logic</em>' reference.
	 * @see #getLogic()
	 * @generated
	 */
	void setLogic(LogicProblem value);

	/**
	 * Returns the value of the '<em><b>Vampire</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vampire</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vampire</em>' reference.
	 * @see #setVampire(VampireModel)
	 * @see logic2vampire.Logic2vampirePackage#getLogic2Vampire_Vampire()
	 * @model
	 * @generated
	 */
	VampireModel getVampire();

	/**
	 * Sets the value of the '{@link logic2vampire.Logic2Vampire#getVampire <em>Vampire</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vampire</em>' reference.
	 * @see #getVampire()
	 * @generated
	 */
	void setVampire(VampireModel value);

	/**
	 * Returns the value of the '<em><b>Traces</b></em>' containment reference list.
	 * The list contents are of type {@link logic2vampire.Logic2VampireTrace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traces</em>' containment reference list.
	 * @see logic2vampire.Logic2vampirePackage#getLogic2Vampire_Traces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Logic2VampireTrace> getTraces();

} // Logic2Vampire
