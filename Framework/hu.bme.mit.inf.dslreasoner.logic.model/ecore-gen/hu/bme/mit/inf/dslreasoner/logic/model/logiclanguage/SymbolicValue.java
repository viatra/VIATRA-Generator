/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbolic Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicValue#getSymbolicReference <em>Symbolic Reference</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicValue#getParameterSubstitutions <em>Parameter Substitutions</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage#getSymbolicValue()
 * @model
 * @generated
 */
public interface SymbolicValue extends Term {
	/**
	 * Returns the value of the '<em><b>Symbolic Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbolic Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbolic Reference</em>' reference.
	 * @see #setSymbolicReference(SymbolicDeclaration)
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage#getSymbolicValue_SymbolicReference()
	 * @model
	 * @generated
	 */
	SymbolicDeclaration getSymbolicReference();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicValue#getSymbolicReference <em>Symbolic Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbolic Reference</em>' reference.
	 * @see #getSymbolicReference()
	 * @generated
	 */
	void setSymbolicReference(SymbolicDeclaration value);

	/**
	 * Returns the value of the '<em><b>Parameter Substitutions</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Term}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Substitutions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Substitutions</em>' containment reference list.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage#getSymbolicValue_ParameterSubstitutions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Term> getParameterSubstitutions();

} // SymbolicValue
