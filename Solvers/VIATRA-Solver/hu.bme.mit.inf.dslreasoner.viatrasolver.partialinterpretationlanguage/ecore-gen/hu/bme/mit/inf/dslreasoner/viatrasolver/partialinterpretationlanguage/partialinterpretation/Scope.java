/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.Scope#getMinNewElements <em>Min New Elements</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.Scope#getMaxNewElements <em>Max New Elements</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.Scope#getTargetTypeInterpretation <em>Target Type Interpretation</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage#getScope()
 * @model
 * @generated
 */
public interface Scope extends EObject {
	/**
	 * Returns the value of the '<em><b>Min New Elements</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min New Elements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min New Elements</em>' attribute.
	 * @see #setMinNewElements(int)
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage#getScope_MinNewElements()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getMinNewElements();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.Scope#getMinNewElements <em>Min New Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min New Elements</em>' attribute.
	 * @see #getMinNewElements()
	 * @generated
	 */
	void setMinNewElements(int value);

	/**
	 * Returns the value of the '<em><b>Max New Elements</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max New Elements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max New Elements</em>' attribute.
	 * @see #setMaxNewElements(int)
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage#getScope_MaxNewElements()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getMaxNewElements();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.Scope#getMaxNewElements <em>Max New Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max New Elements</em>' attribute.
	 * @see #getMaxNewElements()
	 * @generated
	 */
	void setMaxNewElements(int value);

	/**
	 * Returns the value of the '<em><b>Target Type Interpretation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Type Interpretation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Type Interpretation</em>' reference.
	 * @see #setTargetTypeInterpretation(PartialTypeInterpratation)
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage#getScope_TargetTypeInterpretation()
	 * @model required="true"
	 * @generated
	 */
	PartialTypeInterpratation getTargetTypeInterpretation();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.Scope#getTargetTypeInterpretation <em>Target Type Interpretation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Type Interpretation</em>' reference.
	 * @see #getTargetTypeInterpretation()
	 * @generated
	 */
	void setTargetTypeInterpretation(PartialTypeInterpratation value);

} // Scope
