/**
 */
package hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.VariableMapping#getSourcePVariable <em>Source PVariable</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.VariableMapping#getTargetLogicVariable <em>Target Logic Variable</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage#getVariableMapping()
 * @model
 * @generated
 */
public interface VariableMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Source PVariable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source PVariable</em>' attribute.
	 * @see #setSourcePVariable(Object)
	 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage#getVariableMapping_SourcePVariable()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Object getSourcePVariable();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.VariableMapping#getSourcePVariable <em>Source PVariable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source PVariable</em>' attribute.
	 * @see #getSourcePVariable()
	 * @generated
	 */
	void setSourcePVariable(Object value);

	/**
	 * Returns the value of the '<em><b>Target Logic Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Logic Variable</em>' reference.
	 * @see #setTargetLogicVariable(Variable)
	 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage#getVariableMapping_TargetLogicVariable()
	 * @model required="true"
	 * @generated
	 */
	Variable getTargetLogicVariable();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.VariableMapping#getTargetLogicVariable <em>Target Logic Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Logic Variable</em>' reference.
	 * @see #getTargetLogicVariable()
	 * @generated
	 */
	void setTargetLogicVariable(Variable value);

} // VariableMapping
