/**
 */
package org.eclipse.viatra.solver.language.solverLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.Field#isContainment <em>Containment</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.Field#isCrossReference <em>Cross Reference</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.Field#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.Field#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.Field#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.Field#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getField()
 * @model
 * @generated
 */
public interface Field extends EObject {
	/**
	 * Returns the value of the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment</em>' attribute.
	 * @see #setContainment(boolean)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getField_Containment()
	 * @model
	 * @generated
	 */
	boolean isContainment();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.Field#isContainment <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment</em>' attribute.
	 * @see #isContainment()
	 * @generated
	 */
	void setContainment(boolean value);

	/**
	 * Returns the value of the '<em><b>Cross Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Reference</em>' attribute.
	 * @see #setCrossReference(boolean)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getField_CrossReference()
	 * @model
	 * @generated
	 */
	boolean isCrossReference();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.Field#isCrossReference <em>Cross Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cross Reference</em>' attribute.
	 * @see #isCrossReference()
	 * @generated
	 */
	void setCrossReference(boolean value);

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(Symbol)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getField_Opposite()
	 * @model
	 * @generated
	 */
	Symbol getOpposite();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.Field#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(Symbol value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' containment reference.
	 * @see #setMultiplicity(Multiplicity)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getField_Multiplicity()
	 * @model containment="true"
	 * @generated
	 */
	Multiplicity getMultiplicity();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.Field#getMultiplicity <em>Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' containment reference.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(Multiplicity value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Symbol)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getField_Type()
	 * @model
	 * @generated
	 */
	Symbol getType();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.Field#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Symbol value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getField_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.Field#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Field
