/**
 */
package Taxation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Grantor</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Taxation.TaxationPackage#getGrantor()
 * @model
 * @generated
 */
public enum Grantor implements Enumerator {
	/**
	 * The '<em><b>WWW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WWW_VALUE
	 * @generated
	 * @ordered
	 */
	WWW(0, "WWW", "WWW"),

	/**
	 * The '<em><b>Employer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPLOYER_VALUE
	 * @generated
	 * @ordered
	 */
	EMPLOYER(1, "Employer", "Employer"),

	/**
	 * The '<em><b>MMM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MMM_VALUE
	 * @generated
	 * @ordered
	 */
	MMM(2, "MMM", "MMM"),

	/**
	 * The '<em><b>UUU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UUU_VALUE
	 * @generated
	 * @ordered
	 */
	UUU(3, "UUU", "UUU"),

	/**
	 * The '<em><b>YYY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YYY_VALUE
	 * @generated
	 * @ordered
	 */
	YYY(4, "YYY", "YYY"),

	/**
	 * The '<em><b>OOO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OOO_VALUE
	 * @generated
	 * @ordered
	 */
	OOO(5, "OOO", "OOO");

	/**
	 * The '<em><b>WWW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WWW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WWW_VALUE = 0;

	/**
	 * The '<em><b>Employer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPLOYER
	 * @model name="Employer"
	 * @generated
	 * @ordered
	 */
	public static final int EMPLOYER_VALUE = 1;

	/**
	 * The '<em><b>MMM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MMM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MMM_VALUE = 2;

	/**
	 * The '<em><b>UUU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UUU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UUU_VALUE = 3;

	/**
	 * The '<em><b>YYY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YYY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YYY_VALUE = 4;

	/**
	 * The '<em><b>OOO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OOO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OOO_VALUE = 5;

	/**
	 * An array of all the '<em><b>Grantor</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Grantor[] VALUES_ARRAY =
		new Grantor[] {
			WWW,
			EMPLOYER,
			MMM,
			UUU,
			YYY,
			OOO,
		};

	/**
	 * A public read-only list of all the '<em><b>Grantor</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Grantor> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Grantor</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Grantor get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Grantor result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Grantor</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Grantor getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Grantor result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Grantor</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Grantor get(int value) {
		switch (value) {
			case WWW_VALUE: return WWW;
			case EMPLOYER_VALUE: return EMPLOYER;
			case MMM_VALUE: return MMM;
			case UUU_VALUE: return UUU;
			case YYY_VALUE: return YYY;
			case OOO_VALUE: return OOO;
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
	private Grantor(int value, String name, String literal) {
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
	
} //Grantor
