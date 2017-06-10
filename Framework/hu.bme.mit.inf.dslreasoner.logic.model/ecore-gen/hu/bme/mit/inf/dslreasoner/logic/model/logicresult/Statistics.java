/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logicresult;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.Statistics#getEntries <em>Entries</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.Statistics#getTransformationTime <em>Transformation Time</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.Statistics#getSolverTime <em>Solver Time</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.Statistics#getSolverMemory <em>Solver Memory</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultPackage#getStatistics()
 * @model
 * @generated
 */
public interface Statistics extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.StatisticEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultPackage#getStatistics_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<StatisticEntry> getEntries();

	/**
	 * Returns the value of the '<em><b>Transformation Time</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Time</em>' attribute.
	 * @see #setTransformationTime(int)
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultPackage#getStatistics_TransformationTime()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getTransformationTime();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.Statistics#getTransformationTime <em>Transformation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation Time</em>' attribute.
	 * @see #getTransformationTime()
	 * @generated
	 */
	void setTransformationTime(int value);

	/**
	 * Returns the value of the '<em><b>Solver Time</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solver Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solver Time</em>' attribute.
	 * @see #setSolverTime(int)
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultPackage#getStatistics_SolverTime()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getSolverTime();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.Statistics#getSolverTime <em>Solver Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solver Time</em>' attribute.
	 * @see #getSolverTime()
	 * @generated
	 */
	void setSolverTime(int value);

	/**
	 * Returns the value of the '<em><b>Solver Memory</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solver Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solver Memory</em>' attribute.
	 * @see #setSolverMemory(int)
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logicresult.LogicresultPackage#getStatistics_SolverMemory()
	 * @model default="-1"
	 * @generated
	 */
	int getSolverMemory();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logicresult.Statistics#getSolverMemory <em>Solver Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solver Memory</em>' attribute.
	 * @see #getSolverMemory()
	 * @generated
	 */
	void setSolverMemory(int value);

} // Statistics
