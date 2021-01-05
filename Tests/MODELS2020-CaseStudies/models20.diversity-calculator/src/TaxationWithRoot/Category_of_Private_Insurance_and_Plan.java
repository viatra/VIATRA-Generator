/**
 */
package TaxationWithRoot;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Category of Private Insurance and Plan</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see TaxationWithRoot.TaxationWithRootPackage#getCategory_of_Private_Insurance_and_Plan()
 * @model
 * @generated
 */
public enum Category_of_Private_Insurance_and_Plan implements Enumerator {
	/**
	 * The '<em><b>PRIVATE INSURANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATE_INSURANCE_VALUE
	 * @generated
	 * @ordered
	 */
	PRIVATE_INSURANCE(0, "PRIVATE_INSURANCE", "PRIVATE_INSURANCE"),

	/**
	 * The '<em><b>PRIVATE LIFE INSURANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATE_LIFE_INSURANCE_VALUE
	 * @generated
	 * @ordered
	 */
	PRIVATE_LIFE_INSURANCE(1, "PRIVATE_LIFE_INSURANCE", "PRIVATE_LIFE_INSURANCE"),

	/**
	 * The '<em><b>COMPANY MEMBERS PRIVATE INSURANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPANY_MEMBERS_PRIVATE_INSURANCE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPANY_MEMBERS_PRIVATE_INSURANCE(2, "COMPANY_MEMBERS_PRIVATE_INSURANCE", "COMPANY_MEMBERS_PRIVATE_INSURANCE"),

	/**
	 * The '<em><b>HOUSING SAVING PLAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOUSING_SAVING_PLAN_VALUE
	 * @generated
	 * @ordered
	 */
	HOUSING_SAVING_PLAN(3, "HOUSING_SAVING_PLAN", "HOUSING_SAVING_PLAN"),

	/**
	 * The '<em><b>OLD AGE PENSION PLAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OLD_AGE_PENSION_PLAN_VALUE
	 * @generated
	 * @ordered
	 */
	OLD_AGE_PENSION_PLAN(4, "OLD_AGE_PENSION_PLAN", "OLD_AGE_PENSION_PLAN");

	/**
	 * The '<em><b>PRIVATE INSURANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATE_INSURANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRIVATE_INSURANCE_VALUE = 0;

	/**
	 * The '<em><b>PRIVATE LIFE INSURANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVATE_LIFE_INSURANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRIVATE_LIFE_INSURANCE_VALUE = 1;

	/**
	 * The '<em><b>COMPANY MEMBERS PRIVATE INSURANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPANY_MEMBERS_PRIVATE_INSURANCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPANY_MEMBERS_PRIVATE_INSURANCE_VALUE = 2;

	/**
	 * The '<em><b>HOUSING SAVING PLAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOUSING_SAVING_PLAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOUSING_SAVING_PLAN_VALUE = 3;

	/**
	 * The '<em><b>OLD AGE PENSION PLAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OLD_AGE_PENSION_PLAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OLD_AGE_PENSION_PLAN_VALUE = 4;

	/**
	 * An array of all the '<em><b>Category of Private Insurance and Plan</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Category_of_Private_Insurance_and_Plan[] VALUES_ARRAY =
		new Category_of_Private_Insurance_and_Plan[] {
			PRIVATE_INSURANCE,
			PRIVATE_LIFE_INSURANCE,
			COMPANY_MEMBERS_PRIVATE_INSURANCE,
			HOUSING_SAVING_PLAN,
			OLD_AGE_PENSION_PLAN,
		};

	/**
	 * A public read-only list of all the '<em><b>Category of Private Insurance and Plan</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Category_of_Private_Insurance_and_Plan> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Category of Private Insurance and Plan</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Category_of_Private_Insurance_and_Plan get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Category_of_Private_Insurance_and_Plan result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Category of Private Insurance and Plan</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Category_of_Private_Insurance_and_Plan getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Category_of_Private_Insurance_and_Plan result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Category of Private Insurance and Plan</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Category_of_Private_Insurance_and_Plan get(int value) {
		switch (value) {
			case PRIVATE_INSURANCE_VALUE: return PRIVATE_INSURANCE;
			case PRIVATE_LIFE_INSURANCE_VALUE: return PRIVATE_LIFE_INSURANCE;
			case COMPANY_MEMBERS_PRIVATE_INSURANCE_VALUE: return COMPANY_MEMBERS_PRIVATE_INSURANCE;
			case HOUSING_SAVING_PLAN_VALUE: return HOUSING_SAVING_PLAN;
			case OLD_AGE_PENSION_PLAN_VALUE: return OLD_AGE_PENSION_PLAN;
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
	private Category_of_Private_Insurance_and_Plan(int value, String name, String literal) {
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
	
} //Category_of_Private_Insurance_and_Plan
