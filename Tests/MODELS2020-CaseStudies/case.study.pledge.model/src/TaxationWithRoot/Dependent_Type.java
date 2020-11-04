/**
 */
package TaxationWithRoot;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dependent Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see TaxationWithRoot.TaxationPackage#getDependent_Type()
 * @model
 * @generated
 */
public enum Dependent_Type implements Enumerator {
	/**
	 * The '<em><b>CHILD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILD_VALUE
	 * @generated
	 * @ordered
	 */
	CHILD(0, "CHILD", "CHILD"),

	/**
	 * The '<em><b>SPOUSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPOUSE_VALUE
	 * @generated
	 * @ordered
	 */
	SPOUSE(1, "SPOUSE", "SPOUSE"),

	/**
	 * The '<em><b>RELATIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	RELATIVE(2, "RELATIVE", "RELATIVE"),

	/**
	 * The '<em><b>OTHER FAMILY MEMBER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_FAMILY_MEMBER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_FAMILY_MEMBER(3, "OTHER_FAMILY_MEMBER", "OTHER_FAMILY_MEMBER"),

	/**
	 * The '<em><b>NOT OWN CHILD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_OWN_CHILD_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_OWN_CHILD(4, "NOT_OWN_CHILD", "NOT_OWN_CHILD");

	/**
	 * The '<em><b>CHILD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHILD_VALUE = 0;

	/**
	 * The '<em><b>SPOUSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPOUSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPOUSE_VALUE = 1;

	/**
	 * The '<em><b>RELATIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RELATIVE_VALUE = 2;

	/**
	 * The '<em><b>OTHER FAMILY MEMBER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_FAMILY_MEMBER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_FAMILY_MEMBER_VALUE = 3;

	/**
	 * The '<em><b>NOT OWN CHILD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_OWN_CHILD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_OWN_CHILD_VALUE = 4;

	/**
	 * An array of all the '<em><b>Dependent Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Dependent_Type[] VALUES_ARRAY =
		new Dependent_Type[] {
			CHILD,
			SPOUSE,
			RELATIVE,
			OTHER_FAMILY_MEMBER,
			NOT_OWN_CHILD,
		};

	/**
	 * A public read-only list of all the '<em><b>Dependent Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Dependent_Type> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Dependent Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Dependent_Type get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Dependent_Type result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dependent Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Dependent_Type getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Dependent_Type result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dependent Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Dependent_Type get(int value) {
		switch (value) {
			case CHILD_VALUE: return CHILD;
			case SPOUSE_VALUE: return SPOUSE;
			case RELATIVE_VALUE: return RELATIVE;
			case OTHER_FAMILY_MEMBER_VALUE: return OTHER_FAMILY_MEMBER;
			case NOT_OWN_CHILD_VALUE: return NOT_OWN_CHILD;
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
	private Dependent_Type(int value, String name, String literal) {
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
	
} //Dependent_Type
