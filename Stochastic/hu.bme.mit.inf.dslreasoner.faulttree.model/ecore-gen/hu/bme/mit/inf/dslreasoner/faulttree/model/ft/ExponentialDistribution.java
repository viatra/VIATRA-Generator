/**
 */
package hu.bme.mit.inf.dslreasoner.faulttree.model.ft;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exponential Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ExponentialDistribution#getLambda <em>Lambda</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FtPackage#getExponentialDistribution()
 * @model
 * @generated
 */
public interface ExponentialDistribution extends Distribution {
	/**
	 * Returns the value of the '<em><b>Lambda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lambda</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda</em>' attribute.
	 * @see #setLambda(double)
	 * @see hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FtPackage#getExponentialDistribution_Lambda()
	 * @model
	 * @generated
	 */
	double getLambda();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ExponentialDistribution#getLambda <em>Lambda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lambda</em>' attribute.
	 * @see #getLambda()
	 * @generated
	 */
	void setLambda(double value);

} // ExponentialDistribution
