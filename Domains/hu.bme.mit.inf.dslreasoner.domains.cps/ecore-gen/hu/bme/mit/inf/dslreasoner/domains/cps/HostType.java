/**
 */
package hu.bme.mit.inf.dslreasoner.domains.cps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Host Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.HostType#getDefaultMemory <em>Default Memory</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.HostType#getDefaultHdd <em>Default Hdd</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.HostType#getInstances <em>Instances</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.HostType#getCost <em>Cost</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getHostType()
 * @model
 * @generated
 */
public interface HostType extends EObject {
	/**
	 * Returns the value of the '<em><b>Default Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Memory</em>' attribute.
	 * @see #setDefaultMemory(int)
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getHostType_DefaultMemory()
	 * @model required="true"
	 * @generated
	 */
	int getDefaultMemory();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.HostType#getDefaultMemory <em>Default Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Memory</em>' attribute.
	 * @see #getDefaultMemory()
	 * @generated
	 */
	void setDefaultMemory(int value);

	/**
	 * Returns the value of the '<em><b>Default Hdd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Hdd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Hdd</em>' attribute.
	 * @see #setDefaultHdd(int)
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getHostType_DefaultHdd()
	 * @model required="true"
	 * @generated
	 */
	int getDefaultHdd();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.HostType#getDefaultHdd <em>Default Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Hdd</em>' attribute.
	 * @see #getDefaultHdd()
	 * @generated
	 */
	void setDefaultHdd(int value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getHostType_Instances()
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance#getType
	 * @model opposite="type" containment="true"
	 * @generated
	 */
	EList<HostInstance> getInstances();

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(int)
	 * @see hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage#getHostType_Cost()
	 * @model required="true"
	 * @generated
	 */
	int getCost();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.domains.cps.HostType#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(int value);

} // HostType
