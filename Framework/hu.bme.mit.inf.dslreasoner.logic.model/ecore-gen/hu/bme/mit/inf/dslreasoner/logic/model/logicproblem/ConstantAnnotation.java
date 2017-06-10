/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logicproblem;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Constant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ConstantAnnotation#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage#getConstantAnnotation()
 * @model
 * @generated
 */
public interface ConstantAnnotation extends Annotation {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Constant#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Constant)
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage#getConstantAnnotation_Target()
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Constant#getAnnotations
	 * @model opposite="annotations" required="true"
	 * @generated
	 */
	Constant getTarget();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.ConstantAnnotation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Constant value);

} // ConstantAnnotation
