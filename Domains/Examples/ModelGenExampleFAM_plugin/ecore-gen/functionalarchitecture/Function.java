/**
 */
package functionalarchitecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link functionalarchitecture.Function#getSubElements <em>Sub Elements</em>}</li>
 *   <li>{@link functionalarchitecture.Function#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see functionalarchitecture.FunctionalarchitecturePackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends FunctionalElement {
	/**
	 * Returns the value of the '<em><b>Sub Elements</b></em>' containment reference list.
	 * The list contents are of type {@link functionalarchitecture.FunctionalElement}.
	 * It is bidirectional and its opposite is '{@link functionalarchitecture.FunctionalElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Elements</em>' containment reference list.
	 * @see functionalarchitecture.FunctionalarchitecturePackage#getFunction_SubElements()
	 * @see functionalarchitecture.FunctionalElement#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<FunctionalElement> getSubElements();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link functionalarchitecture.FunctionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see functionalarchitecture.FunctionType
	 * @see #setType(FunctionType)
	 * @see functionalarchitecture.FunctionalarchitecturePackage#getFunction_Type()
	 * @model required="true" transient="true" volatile="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='hu.bme.mit.inf.dslreasoner.domains.transima.fam.type'"
	 * @generated
	 */
	FunctionType getType();

	/**
	 * Sets the value of the '{@link functionalarchitecture.Function#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see functionalarchitecture.FunctionType
	 * @see #getType()
	 * @generated
	 */
	void setType(FunctionType value);

} // Function
