/**
 */
package TaxationWithRoot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>From Law</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.FromLaw#getId <em>Id</em>}</li>
 *   <li>{@link TaxationWithRoot.FromLaw#getTaxPayer <em>Tax Payer</em>}</li>
 * </ul>
 *
 * @see TaxationWithRoot.TaxationPackage#getFromLaw()
 * @model
 * @generated
 */
public interface FromLaw extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see TaxationWithRoot.TaxationPackage#getFromLaw_Id()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.FromLaw#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Tax Payer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.Tax_Payer#getFrom_law <em>From law</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Payer</em>' container reference.
	 * @see #setTaxPayer(Tax_Payer)
	 * @see TaxationWithRoot.TaxationPackage#getFromLaw_TaxPayer()
	 * @see TaxationWithRoot.Tax_Payer#getFrom_law
	 * @model opposite="from_law" required="true" transient="false"
	 * @generated
	 */
	Tax_Payer getTaxPayer();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.FromLaw#getTaxPayer <em>Tax Payer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Payer</em>' container reference.
	 * @see #getTaxPayer()
	 * @generated
	 */
	void setTaxPayer(Tax_Payer value);

} // FromLaw
