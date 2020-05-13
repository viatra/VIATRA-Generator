/**
 */
package TaxationWithRoot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legal Union Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.Legal_Union_Record#getStart_year <em>Start year</em>}</li>
 *   <li>{@link TaxationWithRoot.Legal_Union_Record#getEnd_year <em>End year</em>}</li>
 *   <li>{@link TaxationWithRoot.Legal_Union_Record#getSeparation_cause <em>Separation cause</em>}</li>
 *   <li>{@link TaxationWithRoot.Legal_Union_Record#getIndividual_A <em>Individual A</em>}</li>
 *   <li>{@link TaxationWithRoot.Legal_Union_Record#getIndividual_B <em>Individual B</em>}</li>
 *   <li>{@link TaxationWithRoot.Legal_Union_Record#getProperties <em>Properties</em>}</li>
 *   <li>{@link TaxationWithRoot.Legal_Union_Record#isMutual_agreement <em>Mutual agreement</em>}</li>
 *   <li>{@link TaxationWithRoot.Legal_Union_Record#getId9 <em>Id9</em>}</li>
 *   <li>{@link TaxationWithRoot.Legal_Union_Record#getHousehold <em>Household</em>}</li>
 * </ul>
 *
 * @see TaxationWithRoot.TaxationPackage#getLegal_Union_Record()
 * @model abstract="true"
 * @generated
 */
public interface Legal_Union_Record extends EObject {
	/**
	 * Returns the value of the '<em><b>Start year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start year</em>' attribute.
	 * @see #setStart_year(int)
	 * @see TaxationWithRoot.TaxationPackage#getLegal_Union_Record_Start_year()
	 * @model required="true"
	 * @generated
	 */
	int getStart_year();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Legal_Union_Record#getStart_year <em>Start year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start year</em>' attribute.
	 * @see #getStart_year()
	 * @generated
	 */
	void setStart_year(int value);

	/**
	 * Returns the value of the '<em><b>End year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End year</em>' attribute.
	 * @see #setEnd_year(int)
	 * @see TaxationWithRoot.TaxationPackage#getLegal_Union_Record_End_year()
	 * @model required="true"
	 * @generated
	 */
	int getEnd_year();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Legal_Union_Record#getEnd_year <em>End year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End year</em>' attribute.
	 * @see #getEnd_year()
	 * @generated
	 */
	void setEnd_year(int value);

	/**
	 * Returns the value of the '<em><b>Separation cause</b></em>' attribute.
	 * The literals are from the enumeration {@link TaxationWithRoot.Separation_Causes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Separation cause</em>' attribute.
	 * @see TaxationWithRoot.Separation_Causes
	 * @see #setSeparation_cause(Separation_Causes)
	 * @see TaxationWithRoot.TaxationPackage#getLegal_Union_Record_Separation_cause()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Separation_Causes getSeparation_cause();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Legal_Union_Record#getSeparation_cause <em>Separation cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Separation cause</em>' attribute.
	 * @see TaxationWithRoot.Separation_Causes
	 * @see #getSeparation_cause()
	 * @generated
	 */
	void setSeparation_cause(Separation_Causes value);

	/**
	 * Returns the value of the '<em><b>Individual A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual A</em>' containment reference.
	 * @see #setIndividual_A(Physical_Person)
	 * @see TaxationWithRoot.TaxationPackage#getLegal_Union_Record_Individual_A()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='legal_union_A'"
	 * @generated
	 */
	Physical_Person getIndividual_A();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Legal_Union_Record#getIndividual_A <em>Individual A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual A</em>' containment reference.
	 * @see #getIndividual_A()
	 * @generated
	 */
	void setIndividual_A(Physical_Person value);

	/**
	 * Returns the value of the '<em><b>Individual B</b></em>' containment reference list.
	 * The list contents are of type {@link TaxationWithRoot.Physical_Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual B</em>' containment reference list.
	 * @see TaxationWithRoot.TaxationPackage#getLegal_Union_Record_Individual_B()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='legal_union_B'"
	 * @generated
	 */
	EList<Physical_Person> getIndividual_B();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link TaxationWithRoot.Tax_Property}.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.Tax_Property#getUnion_record <em>Union record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see TaxationWithRoot.TaxationPackage#getLegal_Union_Record_Properties()
	 * @see TaxationWithRoot.Tax_Property#getUnion_record
	 * @model opposite="union_record" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Tax_Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Mutual agreement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutual agreement</em>' attribute.
	 * @see #setMutual_agreement(boolean)
	 * @see TaxationWithRoot.TaxationPackage#getLegal_Union_Record_Mutual_agreement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isMutual_agreement();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Legal_Union_Record#isMutual_agreement <em>Mutual agreement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutual agreement</em>' attribute.
	 * @see #isMutual_agreement()
	 * @generated
	 */
	void setMutual_agreement(boolean value);

	/**
	 * Returns the value of the '<em><b>Id9</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id9</em>' attribute.
	 * @see #setId9(String)
	 * @see TaxationWithRoot.TaxationPackage#getLegal_Union_Record_Id9()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getId9();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Legal_Union_Record#getId9 <em>Id9</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id9</em>' attribute.
	 * @see #getId9()
	 * @generated
	 */
	void setId9(String value);

	/**
	 * Returns the value of the '<em><b>Household</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link TaxationWithRoot.Household#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Household</em>' container reference.
	 * @see #setHousehold(Household)
	 * @see TaxationWithRoot.TaxationPackage#getLegal_Union_Record_Household()
	 * @see TaxationWithRoot.Household#getParents
	 * @model opposite="parents" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Household getHousehold();

	/**
	 * Sets the value of the '{@link TaxationWithRoot.Legal_Union_Record#getHousehold <em>Household</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Household</em>' container reference.
	 * @see #getHousehold()
	 * @generated
	 */
	void setHousehold(Household value);

} // Legal_Union_Record
