/**
 */
package satellite;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Spacecraft Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see satellite.SatellitePackage#getSpacecraftKind()
 * @model
 * @generated
 */
public enum SpacecraftKind implements Enumerator {
	/**
	 * The '<em><b>Cube Sat3 U</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUBE_SAT3_U_VALUE
	 * @generated
	 * @ordered
	 */
	CUBE_SAT3_U(0, "CubeSat3U", "CubeSat3U"),

	/**
	 * The '<em><b>Cube Sat6 U</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUBE_SAT6_U_VALUE
	 * @generated
	 * @ordered
	 */
	CUBE_SAT6_U(1, "CubeSat6U", "CubeSat6U"),

	/**
	 * The '<em><b>Small Sat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL_SAT_VALUE
	 * @generated
	 * @ordered
	 */
	SMALL_SAT(2, "SmallSat", "SmallSat");

	/**
	 * The '<em><b>Cube Sat3 U</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUBE_SAT3_U
	 * @model name="CubeSat3U"
	 * @generated
	 * @ordered
	 */
	public static final int CUBE_SAT3_U_VALUE = 0;

	/**
	 * The '<em><b>Cube Sat6 U</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUBE_SAT6_U
	 * @model name="CubeSat6U"
	 * @generated
	 * @ordered
	 */
	public static final int CUBE_SAT6_U_VALUE = 1;

	/**
	 * The '<em><b>Small Sat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL_SAT
	 * @model name="SmallSat"
	 * @generated
	 * @ordered
	 */
	public static final int SMALL_SAT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Spacecraft Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SpacecraftKind[] VALUES_ARRAY = new SpacecraftKind[] { CUBE_SAT3_U, CUBE_SAT6_U, SMALL_SAT, };

	/**
	 * A public read-only list of all the '<em><b>Spacecraft Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SpacecraftKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Spacecraft Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpacecraftKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpacecraftKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Spacecraft Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpacecraftKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpacecraftKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Spacecraft Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpacecraftKind get(int value) {
		switch (value) {
		case CUBE_SAT3_U_VALUE:
			return CUBE_SAT3_U;
		case CUBE_SAT6_U_VALUE:
			return CUBE_SAT6_U;
		case SMALL_SAT_VALUE:
			return SMALL_SAT;
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
	private SpacecraftKind(int value, String name, String literal) {
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

} //SpacecraftKind
