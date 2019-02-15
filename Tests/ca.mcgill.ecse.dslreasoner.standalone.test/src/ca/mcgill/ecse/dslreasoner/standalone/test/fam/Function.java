/**
 */
package ca.mcgill.ecse.dslreasoner.standalone.test.fam;

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
 *   <li>{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.Function#getSubElements <em>Sub Elements</em>}</li>
 *   <li>{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.Function#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.famPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends FunctionalElement {
	/**
	 * Returns the value of the '<em><b>Sub Elements</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalElement}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Elements</em>' containment reference list.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.famPackage#getFunction_SubElements()
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionalElement#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<FunctionalElement> getSubElements();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.FunctionType
	 * @see ca.mcgill.ecse.dslreasoner.standalone.test.fam.famPackage#getFunction_Type()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='ca.mcgill.ecse.dslreasoner.standalone.test.xyz.type'"
	 * @generated
	 */
	FunctionType getType();

} // Function
