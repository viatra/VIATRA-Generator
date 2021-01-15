/**
 */
package crossingScenario;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Distance</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see crossingScenario.CrossingScenarioPackage#getDistance()
 * @model
 * @generated
 */
public enum Distance implements Enumerator {
	/**
	 * The '<em><b>DNear</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNEAR_VALUE
	 * @generated
	 * @ordered
	 */
	DNEAR(0, "D_Near", "D_Near"), /**
	 * The '<em><b>DMed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMED_VALUE
	 * @generated
	 * @ordered
	 */
	DMED(1, "D_Med", "D_Med"), /**
	 * The '<em><b>DFar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DFAR_VALUE
	 * @generated
	 * @ordered
	 */
	DFAR(2, "D_Far", "D_Far");

	/**
	 * The '<em><b>DNear</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DNEAR
	 * @model name="D_Near"
	 * @generated
	 * @ordered
	 */
	public static final int DNEAR_VALUE = 0;

	/**
	 * The '<em><b>DMed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DMED
	 * @model name="D_Med"
	 * @generated
	 * @ordered
	 */
	public static final int DMED_VALUE = 1;

	/**
	 * The '<em><b>DFar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DFAR
	 * @model name="D_Far"
	 * @generated
	 * @ordered
	 */
	public static final int DFAR_VALUE = 2;

	/**
	 * An array of all the '<em><b>Distance</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Distance[] VALUES_ARRAY =
		new Distance[] {
			DNEAR,
			DMED,
			DFAR,
		};

	/**
	 * A public read-only list of all the '<em><b>Distance</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Distance> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Distance</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Distance get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Distance result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Distance</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Distance getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Distance result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Distance</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Distance get(int value) {
		switch (value) {
			case DNEAR_VALUE: return DNEAR;
			case DMED_VALUE: return DMED;
			case DFAR_VALUE: return DFAR;
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
	private Distance(int value, String name, String literal) {
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
	
} //Distance
