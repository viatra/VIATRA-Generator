/**
 */
package Taxation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Country</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Taxation.TaxationPackage#getCountry()
 * @model
 * @generated
 */
public enum Country implements Enumerator {
	/**
	 * The '<em><b>ZZ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZZ_VALUE
	 * @generated
	 * @ordered
	 */
	ZZ(0, "ZZ", "ZZ"),

	/**
	 * The '<em><b>FF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FF_VALUE
	 * @generated
	 * @ordered
	 */
	FF(1, "FF", "FF"),

	/**
	 * The '<em><b>BB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BB_VALUE
	 * @generated
	 * @ordered
	 */
	BB(2, "BB", "BB"),

	/**
	 * The '<em><b>DD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DD_VALUE
	 * @generated
	 * @ordered
	 */
	DD(3, "DD", "DD"),

	/**
	 * The '<em><b>NN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NN_VALUE
	 * @generated
	 * @ordered
	 */
	NN(4, "NN", "NN"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(5, "OTHER", "OTHER");

	/**
	 * The '<em><b>ZZ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZZ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZZ_VALUE = 0;

	/**
	 * The '<em><b>FF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FF_VALUE = 1;

	/**
	 * The '<em><b>BB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BB_VALUE = 2;

	/**
	 * The '<em><b>DD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DD_VALUE = 3;

	/**
	 * The '<em><b>NN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NN_VALUE = 4;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 5;

	/**
	 * An array of all the '<em><b>Country</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Country[] VALUES_ARRAY =
		new Country[] {
			ZZ,
			FF,
			BB,
			DD,
			NN,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Country</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Country> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Country</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Country get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Country result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Country</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Country getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Country result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Country</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Country get(int value) {
		switch (value) {
			case ZZ_VALUE: return ZZ;
			case FF_VALUE: return FF;
			case BB_VALUE: return BB;
			case DD_VALUE: return DD;
			case NN_VALUE: return NN;
			case OTHER_VALUE: return OTHER;
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
	private Country(int value, String name, String literal) {
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
	
} //Country
