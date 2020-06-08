/**
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.yakindu;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Region#getVertices <em>Vertices</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.YakinduPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends EObject {
	/**
	 * Returns the value of the '<em><b>Vertices</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.Vertex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertices</em>' containment reference list.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.yakindu.YakinduPackage#getRegion_Vertices()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Vertex> getVertices();

} // Region
