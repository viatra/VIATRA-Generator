/**
 */
package TaxationWithRoot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.Resource#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see TaxationWithRoot.TaxationPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link TaxationWithRoot.Root}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see TaxationWithRoot.TaxationPackage#getResource_Contains()
	 * @model containment="true"
	 * @generated
	 */
	EList<Root> getContains();

} // Resource
