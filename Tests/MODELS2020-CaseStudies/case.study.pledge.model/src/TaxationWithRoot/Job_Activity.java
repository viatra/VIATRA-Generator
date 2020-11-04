/**
 */
package TaxationWithRoot;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Job Activity</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see TaxationWithRoot.TaxationPackage#getJob_Activity()
 * @model
 * @generated
 */
public enum Job_Activity implements Enumerator {
	/**
	 * The '<em><b>Salary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SALARY_VALUE
	 * @generated
	 * @ordered
	 */
	SALARY(0, "Salary", "Salary"),

	/**
	 * The '<em><b>Pension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PENSION_VALUE
	 * @generated
	 * @ordered
	 */
	PENSION(1, "Pension", "Pension"),

	/**
	 * The '<em><b>Annuity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANNUITY_VALUE
	 * @generated
	 * @ordered
	 */
	ANNUITY(2, "Annuity", "Annuity");

	/**
	 * The '<em><b>Salary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SALARY
	 * @model name="Salary"
	 * @generated
	 * @ordered
	 */
	public static final int SALARY_VALUE = 0;

	/**
	 * The '<em><b>Pension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PENSION
	 * @model name="Pension"
	 * @generated
	 * @ordered
	 */
	public static final int PENSION_VALUE = 1;

	/**
	 * The '<em><b>Annuity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANNUITY
	 * @model name="Annuity"
	 * @generated
	 * @ordered
	 */
	public static final int ANNUITY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Job Activity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Job_Activity[] VALUES_ARRAY =
		new Job_Activity[] {
			SALARY,
			PENSION,
			ANNUITY,
		};

	/**
	 * A public read-only list of all the '<em><b>Job Activity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Job_Activity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Job Activity</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Job_Activity get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Job_Activity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Job Activity</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Job_Activity getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Job_Activity result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Job Activity</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Job_Activity get(int value) {
		switch (value) {
			case SALARY_VALUE: return SALARY;
			case PENSION_VALUE: return PENSION;
			case ANNUITY_VALUE: return ANNUITY;
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
	private Job_Activity(int value, String name, String literal) {
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
	
} //Job_Activity
