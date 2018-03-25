/**
 */
package functionalarchitecture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Architecture Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link functionalarchitecture.FunctionalArchitectureModel#getRootElements <em>Root Elements</em>}</li>
 * </ul>
 *
 * @see functionalarchitecture.FunctionalarchitecturePackage#getFunctionalArchitectureModel()
 * @model
 * @generated
 */
public interface FunctionalArchitectureModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Root Elements</b></em>' containment reference list.
	 * The list contents are of type {@link functionalarchitecture.FunctionalElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Elements</em>' containment reference list.
	 * @see functionalarchitecture.FunctionalarchitecturePackage#getFunctionalArchitectureModel_RootElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionalElement> getRootElements();

} // FunctionalArchitectureModel
