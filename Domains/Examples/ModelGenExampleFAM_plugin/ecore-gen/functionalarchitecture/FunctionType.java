/**
 */
package functionalarchitecture;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Function Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see functionalarchitecture.FunctionalarchitecturePackage#getFunctionType()
 * @model
 * @generated
 */
public enum FunctionType implements Enumerator {
	/**
	 * The '<em><b>Root</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROOT_VALUE
	 * @generated
	 * @ordered
	 */
	ROOT(0, "Root", "Root"),

	/**
	 * The '<em><b>Intermediate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERMEDIATE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERMEDIATE(1, "Intermediate", "Intermediate"),

	/**
	 * The '<em><b>Leaf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEAF_VALUE
	 * @generated
	 * @ordered
	 */
	LEAF(2, "Leaf", "Leaf");

	/**
	 * The '<em><b>Root</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Root</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROOT
	 * @model name="Root"
	 * @generated
	 * @ordered
	 */
	public static final int ROOT_VALUE = 0;

	/**
	 * The '<em><b>Intermediate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Intermediate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERMEDIATE
	 * @model name="Intermediate"
	 * @generated
	 * @ordered
	 */
	public static final int INTERMEDIATE_VALUE = 1;

	/**
	 * The '<em><b>Leaf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Leaf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEAF
	 * @model name="Leaf"
	 * @generated
	 * @ordered
	 */
	public static final int LEAF_VALUE = 2;

	/**
	 * An array of all the '<em><b>Function Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FunctionType[] VALUES_ARRAY =
		new FunctionType[] {
			ROOT,
			INTERMEDIATE,
			LEAF,
		};

	/**
	 * A public read-only list of all the '<em><b>Function Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FunctionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Function Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FunctionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FunctionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Function Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FunctionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FunctionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Function Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FunctionType get(int value) {
		switch (value) {
			case ROOT_VALUE: return ROOT;
			case INTERMEDIATE_VALUE: return INTERMEDIATE;
			case LEAF_VALUE: return LEAF;
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
	private FunctionType(int value, String name, String literal) {
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
	
} //FunctionType
