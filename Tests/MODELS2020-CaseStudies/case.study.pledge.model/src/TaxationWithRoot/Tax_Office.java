/**
 */
package TaxationWithRoot;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tax Office</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see TaxationWithRoot.TaxationPackage#getTax_Office()
 * @model
 * @generated
 */
public enum Tax_Office implements Enumerator {
	/**
	 * The '<em><b>RTS 2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTS_2_VALUE
	 * @generated
	 * @ordered
	 */
	RTS_2(0, "RTS_2", "RTS_2"),

	/**
	 * The '<em><b>RTS 3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTS_3_VALUE
	 * @generated
	 * @ordered
	 */
	RTS_3(1, "RTS_3", "RTS_3"),

	/**
	 * The '<em><b>RTS 4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTS_4_VALUE
	 * @generated
	 * @ordered
	 */
	RTS_4(2, "RTS_4", "RTS_4"),

	/**
	 * The '<em><b>RTS 5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTS_5_VALUE
	 * @generated
	 * @ordered
	 */
	RTS_5(3, "RTS_5", "RTS_5");

	/**
	 * The '<em><b>RTS 2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTS_2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RTS_2_VALUE = 0;

	/**
	 * The '<em><b>RTS 3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTS_3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RTS_3_VALUE = 1;

	/**
	 * The '<em><b>RTS 4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTS_4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RTS_4_VALUE = 2;

	/**
	 * The '<em><b>RTS 5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTS_5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RTS_5_VALUE = 3;

	/**
	 * An array of all the '<em><b>Tax Office</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Tax_Office[] VALUES_ARRAY =
		new Tax_Office[] {
			RTS_2,
			RTS_3,
			RTS_4,
			RTS_5,
		};

	/**
	 * A public read-only list of all the '<em><b>Tax Office</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Tax_Office> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tax Office</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Tax_Office get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Tax_Office result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tax Office</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Tax_Office getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Tax_Office result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tax Office</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Tax_Office get(int value) {
		switch (value) {
			case RTS_2_VALUE: return RTS_2;
			case RTS_3_VALUE: return RTS_3;
			case RTS_4_VALUE: return RTS_4;
			case RTS_5_VALUE: return RTS_5;
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
	private Tax_Office(int value, String name, String literal) {
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
	
} //Tax_Office
