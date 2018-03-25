/**
 */
package functionalarchitecture;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link functionalarchitecture.FunctionalInterface#getData <em>Data</em>}</li>
 *   <li>{@link functionalarchitecture.FunctionalInterface#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see functionalarchitecture.FunctionalarchitecturePackage#getFunctionalInterface()
 * @model
 * @generated
 */
public interface FunctionalInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link functionalarchitecture.FunctionalData}.
	 * It is bidirectional and its opposite is '{@link functionalarchitecture.FunctionalData#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see functionalarchitecture.FunctionalarchitecturePackage#getFunctionalInterface_Data()
	 * @see functionalarchitecture.FunctionalData#getInterface
	 * @model opposite="interface" containment="true"
	 * @generated
	 */
	EList<FunctionalData> getData();

	/**
	 * Returns the value of the '<em><b>Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link functionalarchitecture.FunctionalElement#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' container reference.
	 * @see #setElement(FunctionalElement)
	 * @see functionalarchitecture.FunctionalarchitecturePackage#getFunctionalInterface_Element()
	 * @see functionalarchitecture.FunctionalElement#getInterface
	 * @model opposite="interface" transient="false"
	 * @generated
	 */
	FunctionalElement getElement();

	/**
	 * Sets the value of the '{@link functionalarchitecture.FunctionalInterface#getElement <em>Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' container reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(FunctionalElement value);

} // FunctionalInterface
