/**
 */
package hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture;

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
 *   <li>{@link hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.Function#getSubElements <em>Sub Elements</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.Function#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.FunctionalArchitecturePackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends FunctionalElement {
	/**
	 * Returns the value of the '<em><b>Sub Elements</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.FunctionalElement}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.FunctionalElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Elements</em>' containment reference list.
	 * @see hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.FunctionalArchitecturePackage#getFunction_SubElements()
	 * @see hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.FunctionalElement#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<FunctionalElement> getSubElements();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.FunctionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.FunctionType
	 * @see hu.bme.mit.inf.dslreasomer.domains.transima.fam.FunctionalArchitecture.FunctionalArchitecturePackage#getFunction_Type()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='hu.bme.mit.inf.dslreasoner.domains.transima.fam.patterns.type'"
	 * @generated
	 */
	FunctionType getType();

} // Function
