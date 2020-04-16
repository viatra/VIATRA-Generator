/**
 */
package hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.RelationAnnotation;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfomed Viatra Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransfomedViatraQuery#getPatternFullyQualifiedName <em>Pattern Fully Qualified Name</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransfomedViatraQuery#getPatternPQuery <em>Pattern PQuery</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransfomedViatraQuery#getVariableTrace <em>Variable Trace</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage#getTransfomedViatraQuery()
 * @model
 * @generated
 */
public interface TransfomedViatraQuery extends RelationAnnotation {

	/**
	 * Returns the value of the '<em><b>Pattern Fully Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Fully Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Fully Qualified Name</em>' attribute.
	 * @see #setPatternFullyQualifiedName(String)
	 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage#getTransfomedViatraQuery_PatternFullyQualifiedName()
	 * @model required="true"
	 * @generated
	 */
	String getPatternFullyQualifiedName();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransfomedViatraQuery#getPatternFullyQualifiedName <em>Pattern Fully Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Fully Qualified Name</em>' attribute.
	 * @see #getPatternFullyQualifiedName()
	 * @generated
	 */
	void setPatternFullyQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Pattern PQuery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern PQuery</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern PQuery</em>' attribute.
	 * @see #setPatternPQuery(Object)
	 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage#getTransfomedViatraQuery_PatternPQuery()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Object getPatternPQuery();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.TransfomedViatraQuery#getPatternPQuery <em>Pattern PQuery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern PQuery</em>' attribute.
	 * @see #getPatternPQuery()
	 * @generated
	 */
	void setPatternPQuery(Object value);

	/**
	 * Returns the value of the '<em><b>Variable Trace</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.VariableMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Trace</em>' containment reference list.
	 * @see hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.Viatra2LogicAnnotationsPackage#getTransfomedViatraQuery_VariableTrace()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableMapping> getVariableTrace();
} // TransfomedViatraQuery
