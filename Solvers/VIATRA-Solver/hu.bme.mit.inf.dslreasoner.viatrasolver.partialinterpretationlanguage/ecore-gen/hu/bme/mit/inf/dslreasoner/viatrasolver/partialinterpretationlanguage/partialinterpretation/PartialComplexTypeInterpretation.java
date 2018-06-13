/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partial Complex Type Interpretation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation#getSupertypeInterpretation <em>Supertype Interpretation</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation#getInterpretationOf <em>Interpretation Of</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage#getPartialComplexTypeInterpretation()
 * @model
 * @generated
 */
public interface PartialComplexTypeInterpretation extends PartialTypeInterpratation {
	/**
	 * Returns the value of the '<em><b>Supertype Interpretation</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supertype Interpretation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supertype Interpretation</em>' reference list.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage#getPartialComplexTypeInterpretation_SupertypeInterpretation()
	 * @model
	 * @generated
	 */
	EList<PartialComplexTypeInterpretation> getSupertypeInterpretation();

	/**
	 * Returns the value of the '<em><b>Interpretation Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interpretation Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation Of</em>' reference.
	 * @see #setInterpretationOf(TypeDeclaration)
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage#getPartialComplexTypeInterpretation_InterpretationOf()
	 * @model required="true"
	 * @generated
	 */
	TypeDeclaration getInterpretationOf();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation#getInterpretationOf <em>Interpretation Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation Of</em>' reference.
	 * @see #getInterpretationOf()
	 * @generated
	 */
	void setInterpretationOf(TypeDeclaration value);

} // PartialComplexTypeInterpretation
