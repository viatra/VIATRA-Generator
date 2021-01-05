/**
 */
package TaxationWithRoot;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Expense Purpose</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see TaxationWithRoot.TaxationWithRootPackage#getExpense_Purpose()
 * @model
 * @generated
 */
public enum Expense_Purpose implements Enumerator {
	/**
	 * The '<em><b>HOUSE CARE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOUSE_CARE_VALUE
	 * @generated
	 * @ordered
	 */
	HOUSE_CARE(0, "HOUSE_CARE", "HOUSE_CARE"),

	/**
	 * The '<em><b>CHILD CARE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILD_CARE_VALUE
	 * @generated
	 * @ordered
	 */
	CHILD_CARE(1, "CHILD_CARE", "CHILD_CARE"),

	/**
	 * The '<em><b>DEPENDENCE CARE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCE_CARE_VALUE
	 * @generated
	 * @ordered
	 */
	DEPENDENCE_CARE(2, "DEPENDENCE_CARE", "DEPENDENCE_CARE"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(3, "OTHER", "OTHER"),

	/**
	 * The '<em><b>ALIMONY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALIMONY_VALUE
	 * @generated
	 * @ordered
	 */
	ALIMONY(4, "ALIMONY", "ALIMONY"),

	/**
	 * The '<em><b>RECURRENT DEPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECURRENT_DEPT_VALUE
	 * @generated
	 * @ordered
	 */
	RECURRENT_DEPT(5, "RECURRENT_DEPT", "RECURRENT_DEPT");

	/**
	 * The '<em><b>HOUSE CARE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOUSE_CARE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOUSE_CARE_VALUE = 0;

	/**
	 * The '<em><b>CHILD CARE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILD_CARE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHILD_CARE_VALUE = 1;

	/**
	 * The '<em><b>DEPENDENCE CARE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCE_CARE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDENCE_CARE_VALUE = 2;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 3;

	/**
	 * The '<em><b>ALIMONY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALIMONY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALIMONY_VALUE = 4;

	/**
	 * The '<em><b>RECURRENT DEPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECURRENT_DEPT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RECURRENT_DEPT_VALUE = 5;

	/**
	 * An array of all the '<em><b>Expense Purpose</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Expense_Purpose[] VALUES_ARRAY =
		new Expense_Purpose[] {
			HOUSE_CARE,
			CHILD_CARE,
			DEPENDENCE_CARE,
			OTHER,
			ALIMONY,
			RECURRENT_DEPT,
		};

	/**
	 * A public read-only list of all the '<em><b>Expense Purpose</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Expense_Purpose> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Expense Purpose</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Expense_Purpose get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Expense_Purpose result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Expense Purpose</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Expense_Purpose getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Expense_Purpose result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Expense Purpose</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Expense_Purpose get(int value) {
		switch (value) {
			case HOUSE_CARE_VALUE: return HOUSE_CARE;
			case CHILD_CARE_VALUE: return CHILD_CARE;
			case DEPENDENCE_CARE_VALUE: return DEPENDENCE_CARE;
			case OTHER_VALUE: return OTHER;
			case ALIMONY_VALUE: return ALIMONY;
			case RECURRENT_DEPT_VALUE: return RECURRENT_DEPT;
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
	private Expense_Purpose(int value, String name, String literal) {
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
	
} //Expense_Purpose
