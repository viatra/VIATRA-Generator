/**
 */
package TaxationWithRoot;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Separation Causes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see TaxationWithRoot.TaxationWithRootPackage#getSeparation_Causes()
 * @model
 * @generated
 */
public enum Separation_Causes implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "NONE"),

	/**
	 * The '<em><b>DIVORCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVORCE_VALUE
	 * @generated
	 * @ordered
	 */
	DIVORCE(1, "DIVORCE", "DIVORCE"),

	/**
	 * The '<em><b>SEPARATION DE FAIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEPARATION_DE_FAIT_VALUE
	 * @generated
	 * @ordered
	 */
	SEPARATION_DE_FAIT(2, "SEPARATION_DE_FAIT", "SEPARATION_DE_FAIT"),

	/**
	 * The '<em><b>SEPARATION BY COURT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEPARATION_BY_COURT_VALUE
	 * @generated
	 * @ordered
	 */
	SEPARATION_BY_COURT(3, "SEPARATION_BY_COURT", "SEPARATION_BY_COURT");

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>DIVORCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIVORCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIVORCE_VALUE = 1;

	/**
	 * The '<em><b>SEPARATION DE FAIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEPARATION_DE_FAIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEPARATION_DE_FAIT_VALUE = 2;

	/**
	 * The '<em><b>SEPARATION BY COURT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEPARATION_BY_COURT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEPARATION_BY_COURT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Separation Causes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Separation_Causes[] VALUES_ARRAY =
		new Separation_Causes[] {
			NONE,
			DIVORCE,
			SEPARATION_DE_FAIT,
			SEPARATION_BY_COURT,
		};

	/**
	 * A public read-only list of all the '<em><b>Separation Causes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Separation_Causes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Separation Causes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Separation_Causes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Separation_Causes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Separation Causes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Separation_Causes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Separation_Causes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Separation Causes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Separation_Causes get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case DIVORCE_VALUE: return DIVORCE;
			case SEPARATION_DE_FAIT_VALUE: return SEPARATION_DE_FAIT;
			case SEPARATION_BY_COURT_VALUE: return SEPARATION_BY_COURT;
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
	private Separation_Causes(int value, String name, String literal) {
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
	
} //Separation_Causes
