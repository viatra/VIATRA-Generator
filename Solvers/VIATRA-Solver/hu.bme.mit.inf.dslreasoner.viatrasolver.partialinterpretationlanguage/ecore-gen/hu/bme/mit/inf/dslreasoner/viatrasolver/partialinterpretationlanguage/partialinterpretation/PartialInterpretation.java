/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicProblem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partial Interpretation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getProblem <em>Problem</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getPartialconstantinterpretation <em>Partialconstantinterpretation</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getPartialrelationinterpretation <em>Partialrelationinterpretation</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getPartialfunctioninterpretation <em>Partialfunctioninterpretation</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getNewElements <em>New Elements</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getPartialtypeinterpratation <em>Partialtypeinterpratation</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getMinNewElements <em>Min New Elements</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getMaxNewElements <em>Max New Elements</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getOpenWorldElementPrototype <em>Open World Element Prototype</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getProblemConainer <em>Problem Conainer</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage#getPartialInterpretation()
 * @model
 * @generated
 */
public interface PartialInterpretation extends EObject {
	/**
	 * Returns the value of the '<em><b>Problem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problem</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem</em>' reference.
	 * @see #setProblem(LogicProblem)
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage#getPartialInterpretation_Problem()
	 * @model required="true"
	 * @generated
	 */
	LogicProblem getProblem();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getProblem <em>Problem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem</em>' reference.
	 * @see #getProblem()
	 * @generated
	 */
	void setProblem(LogicProblem value);

	/**
	 * Returns the value of the '<em><b>Partialconstantinterpretation</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialConstantInterpretation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partialconstantinterpretation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partialconstantinterpretation</em>' containment reference list.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage#getPartialInterpretation_Partialconstantinterpretation()
	 * @model containment="true"
	 * @generated
	 */
	EList<PartialConstantInterpretation> getPartialconstantinterpretation();

	/**
	 * Returns the value of the '<em><b>Partialrelationinterpretation</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partialrelationinterpretation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partialrelationinterpretation</em>' containment reference list.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage#getPartialInterpretation_Partialrelationinterpretation()
	 * @model containment="true"
	 * @generated
	 */
	EList<PartialRelationInterpretation> getPartialrelationinterpretation();

	/**
	 * Returns the value of the '<em><b>Partialfunctioninterpretation</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialFunctionInterpretation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partialfunctioninterpretation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partialfunctioninterpretation</em>' containment reference list.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage#getPartialInterpretation_Partialfunctioninterpretation()
	 * @model containment="true"
	 * @generated
	 */
	EList<PartialFunctionInterpretation> getPartialfunctioninterpretation();

	/**
	 * Returns the value of the '<em><b>New Elements</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Elements</em>' containment reference list.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage#getPartialInterpretation_NewElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<DefinedElement> getNewElements();

	/**
	 * Returns the value of the '<em><b>Partialtypeinterpratation</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partialtypeinterpratation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partialtypeinterpratation</em>' containment reference list.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage#getPartialInterpretation_Partialtypeinterpratation()
	 * @model containment="true"
	 * @generated
	 */
	EList<PartialTypeInterpratation> getPartialtypeinterpratation();

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
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage#getPartialInterpretation_MinNewElements()
	 * @model default="0" id="true" required="true"
	 * @generated
	 */
	int getMinNewElements();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getMinNewElements <em>Min New Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min New Elements</em>' attribute.
	 * @see #getMinNewElements()
	 * @generated
	 */
	void setMinNewElements(int value);

	/**
	 * Returns the value of the '<em><b>Max New Elements</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max New Elements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max New Elements</em>' attribute.
	 * @see #setMaxNewElements(int)
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage#getPartialInterpretation_MaxNewElements()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getMaxNewElements();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getMaxNewElements <em>Max New Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max New Elements</em>' attribute.
	 * @see #getMaxNewElements()
	 * @generated
	 */
	void setMaxNewElements(int value);

	/**
	 * Returns the value of the '<em><b>Open World Element Prototype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open World Element Prototype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open World Element Prototype</em>' containment reference.
	 * @see #setOpenWorldElementPrototype(DefinedElement)
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage#getPartialInterpretation_OpenWorldElementPrototype()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DefinedElement getOpenWorldElementPrototype();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getOpenWorldElementPrototype <em>Open World Element Prototype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open World Element Prototype</em>' containment reference.
	 * @see #getOpenWorldElementPrototype()
	 * @generated
	 */
	void setOpenWorldElementPrototype(DefinedElement value);

	/**
	 * Returns the value of the '<em><b>Problem Conainer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problem Conainer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem Conainer</em>' containment reference.
	 * @see #setProblemConainer(LogicProblem)
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage#getPartialInterpretation_ProblemConainer()
	 * @model containment="true"
	 * @generated
	 */
	LogicProblem getProblemConainer();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getProblemConainer <em>Problem Conainer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem Conainer</em>' containment reference.
	 * @see #getProblemConainer()
	 * @generated
	 */
	void setProblemConainer(LogicProblem value);

} // PartialInterpretation
