/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PrimitiveElement#isValueSet <em>Value Set</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage#getPrimitiveElement()
 * @model abstract="true"
 * @generated
 */
public interface PrimitiveElement extends DefinedElement {
	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set</em>' attribute.
	 * @see #setValueSet(boolean)
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage#getPrimitiveElement_ValueSet()
	 * @model required="true"
	 * @generated
	 */
	boolean isValueSet();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PrimitiveElement#isValueSet <em>Value Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set</em>' attribute.
	 * @see #isValueSet()
	 * @generated
	 */
	void setValueSet(boolean value);

} // PrimitiveElement
