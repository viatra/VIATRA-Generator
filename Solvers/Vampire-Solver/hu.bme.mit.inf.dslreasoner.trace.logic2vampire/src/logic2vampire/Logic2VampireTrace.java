/**
 */
package logic2vampire;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TermDescription;

import hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSFofFormula;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic2 Vampire Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logic2vampire.Logic2VampireTrace#getTermDescription <em>Term Description</em>}</li>
 *   <li>{@link logic2vampire.Logic2VampireTrace#getVlsFormula <em>Vls Formula</em>}</li>
 * </ul>
 *
 * @see logic2vampire.Logic2vampirePackage#getLogic2VampireTrace()
 * @model
 * @generated
 */
public interface Logic2VampireTrace extends EObject {
	/**
	 * Returns the value of the '<em><b>Term Description</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TermDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term Description</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term Description</em>' reference list.
	 * @see logic2vampire.Logic2vampirePackage#getLogic2VampireTrace_TermDescription()
	 * @model
	 * @generated
	 */
	EList<TermDescription> getTermDescription();

	/**
	 * Returns the value of the '<em><b>Vls Formula</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.vampireLanguage.VLSFofFormula}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vls Formula</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vls Formula</em>' reference list.
	 * @see logic2vampire.Logic2vampirePackage#getLogic2VampireTrace_VlsFormula()
	 * @model
	 * @generated
	 */
	EList<VLSFofFormula> getVlsFormula();

} // Logic2VampireTrace
