/**
 */
package Taxation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tax Card Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Taxation.TaxationPackage#getTax_Card_Type()
 * @model
 * @generated
 */
public enum Tax_Card_Type implements Enumerator {
	/**
	 * The '<em><b>Principal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRINCIPAL_VALUE
	 * @generated
	 * @ordered
	 */
	PRINCIPAL(0, "Principal", "Principal"),

	/**
	 * The '<em><b>Additional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDITIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	ADDITIONAL(1, "Additional", "Additional");

	/**
	 * The '<em><b>Principal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRINCIPAL
	 * @model name="Principal"
	 * @generated
	 * @ordered
	 */
	public static final int PRINCIPAL_VALUE = 0;

	/**
	 * The '<em><b>Additional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDITIONAL
	 * @model name="Additional"
	 * @generated
	 * @ordered
	 */
	public static final int ADDITIONAL_VALUE = 1;

	/**
	 * An array of all the '<em><b>Tax Card Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Tax_Card_Type[] VALUES_ARRAY =
		new Tax_Card_Type[] {
			PRINCIPAL,
			ADDITIONAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Tax Card Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Tax_Card_Type> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tax Card Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Tax_Card_Type get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Tax_Card_Type result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tax Card Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Tax_Card_Type getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Tax_Card_Type result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tax Card Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Tax_Card_Type get(int value) {
		switch (value) {
			case PRINCIPAL_VALUE: return PRINCIPAL;
			case ADDITIONAL_VALUE: return ADDITIONAL;
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
	private Tax_Card_Type(int value, String name, String literal) {
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
	
} //Tax_Card_Type
