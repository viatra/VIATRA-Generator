/**
 */
package hu.bme.mit.inf.dslreasoner.faulttree.model.cft;

import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Distribution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.BasicEventDefinition#getDistribution <em>Distribution</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage#getBasicEventDefinition()
 * @model
 * @generated
 */
public interface BasicEventDefinition extends EventDefinition {
	/**
	 * Returns the value of the '<em><b>Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution</em>' containment reference.
	 * @see #setDistribution(Distribution)
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.cft.CftPackage#getBasicEventDefinition_Distribution()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Distribution getDistribution();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.cft.BasicEventDefinition#getDistribution <em>Distribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution</em>' containment reference.
	 * @see #getDistribution()
	 * @generated
	 */
	void setDistribution(Distribution value);

} // BasicEventDefinition
