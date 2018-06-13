/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partial Type Interpratation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage#getPartialTypeInterpratation()
 * @model abstract="true"
 * @generated
 */
public interface PartialTypeInterpratation extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage#getPartialTypeInterpratation_Elements()
	 * @model
	 * @generated
	 */
	EList<DefinedElement> getElements();

} // PartialTypeInterpratation
