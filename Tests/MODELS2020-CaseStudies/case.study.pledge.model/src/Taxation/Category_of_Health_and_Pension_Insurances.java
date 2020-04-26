/**
 */
package Taxation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Category of Health and Pension Insurances</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Taxation.TaxationPackage#getCategory_of_Health_and_Pension_Insurances()
 * @model
 * @generated
 */
public enum Category_of_Health_and_Pension_Insurances implements Enumerator {
	/**
	 * The '<em><b>MANDATORY HEALTH AND PENSION INSURANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANDATORY_HEALTH_AND_PENSION_INSURANCE_VALUE
	 * @generated
	 * @ordered
	 */
	MANDATORY_HEALTH_AND_PENSION_INSURANCE(0, "MANDATORY_HEALTH_AND_PENSION_INSURANCE", "MANDATORY_HEALTH_AND_PENSION_INSURANCE"),

	/**
	 * The '<em><b>ADDITIONAL EMPLOYERS PENSION INSURANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDITIONAL_EMPLOYERS_PENSION_INSURANCE_VALUE
	 * @generated
	 * @ordered
	 */
	ADDITIONAL_EMPLOYERS_PENSION_INSURANCE(1, "ADDITIONAL_EMPLOYERS_PENSION_INSURANCE", "ADDITIONAL_EMPLOYERS_PENSION_INSURANCE"),

	/**
	 * The '<em><b>CONTINUED HEALTH AND PENSION INSURANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTINUED_HEALTH_AND_PENSION_INSURANCE_VALUE
	 * @generated
	 * @ordered
	 */
	CONTINUED_HEALTH_AND_PENSION_INSURANCE(2, "CONTINUED_HEALTH_AND_PENSION_INSURANCE", "CONTINUED_HEALTH_AND_PENSION_INSURANCE");

	/**
	 * The '<em><b>MANDATORY HEALTH AND PENSION INSURANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANDATORY_HEALTH_AND_PENSION_INSURANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANDATORY_HEALTH_AND_PENSION_INSURANCE_VALUE = 0;

	/**
	 * The '<em><b>ADDITIONAL EMPLOYERS PENSION INSURANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDITIONAL_EMPLOYERS_PENSION_INSURANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADDITIONAL_EMPLOYERS_PENSION_INSURANCE_VALUE = 1;

	/**
	 * The '<em><b>CONTINUED HEALTH AND PENSION INSURANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTINUED_HEALTH_AND_PENSION_INSURANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTINUED_HEALTH_AND_PENSION_INSURANCE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Category of Health and Pension Insurances</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Category_of_Health_and_Pension_Insurances[] VALUES_ARRAY =
		new Category_of_Health_and_Pension_Insurances[] {
			MANDATORY_HEALTH_AND_PENSION_INSURANCE,
			ADDITIONAL_EMPLOYERS_PENSION_INSURANCE,
			CONTINUED_HEALTH_AND_PENSION_INSURANCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Category of Health and Pension Insurances</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Category_of_Health_and_Pension_Insurances> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Category of Health and Pension Insurances</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Category_of_Health_and_Pension_Insurances get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Category_of_Health_and_Pension_Insurances result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Category of Health and Pension Insurances</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Category_of_Health_and_Pension_Insurances getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Category_of_Health_and_Pension_Insurances result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Category of Health and Pension Insurances</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Category_of_Health_and_Pension_Insurances get(int value) {
		switch (value) {
			case MANDATORY_HEALTH_AND_PENSION_INSURANCE_VALUE: return MANDATORY_HEALTH_AND_PENSION_INSURANCE;
			case ADDITIONAL_EMPLOYERS_PENSION_INSURANCE_VALUE: return ADDITIONAL_EMPLOYERS_PENSION_INSURANCE;
			case CONTINUED_HEALTH_AND_PENSION_INSURANCE_VALUE: return CONTINUED_HEALTH_AND_PENSION_INSURANCE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Category_of_Health_and_Pension_Insurances(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Category_of_Health_and_Pension_Insurances
