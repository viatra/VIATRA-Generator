/**
 */
package Taxation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CE Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Taxation.TaxationPackage#getCE_Type()
 * @model
 * @generated
 */
public enum CE_Type implements Enumerator {
	/**
	 * The '<em><b>INALIDITY AND INFIRMITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INALIDITY_AND_INFIRMITY_VALUE
	 * @generated
	 * @ordered
	 */
	INALIDITY_AND_INFIRMITY(0, "INALIDITY_AND_INFIRMITY", "INALIDITY_AND_INFIRMITY"),

	/**
	 * The '<em><b>DEPENDENCE AND CARE EXCLUDING CHLIDREN NOT PART OF HOUSEHOLD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCE_AND_CARE_EXCLUDING_CHLIDREN_NOT_PART_OF_HOUSEHOLD_VALUE
	 * @generated
	 * @ordered
	 */
	DEPENDENCE_AND_CARE_EXCLUDING_CHLIDREN_NOT_PART_OF_HOUSEHOLD(1, "DEPENDENCE_AND_CARE_EXCLUDING_CHLIDREN_NOT_PART_OF_HOUSEHOLD", "DEPENDENCE_AND_CARE_EXCLUDING_CHLIDREN_NOT_PART_OF_HOUSEHOLD"),

	/**
	 * The '<em><b>CARE FOR CHILDREN NOT BEING PART OF HOUSEHOLD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARE_FOR_CHILDREN_NOT_BEING_PART_OF_HOUSEHOLD_VALUE
	 * @generated
	 * @ordered
	 */
	CARE_FOR_CHILDREN_NOT_BEING_PART_OF_HOUSEHOLD(2, "CARE_FOR_CHILDREN_NOT_BEING_PART_OF_HOUSEHOLD", "CARE_FOR_CHILDREN_NOT_BEING_PART_OF_HOUSEHOLD");

	/**
	 * The '<em><b>INALIDITY AND INFIRMITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INALIDITY_AND_INFIRMITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INALIDITY_AND_INFIRMITY_VALUE = 0;

	/**
	 * The '<em><b>DEPENDENCE AND CARE EXCLUDING CHLIDREN NOT PART OF HOUSEHOLD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDENCE_AND_CARE_EXCLUDING_CHLIDREN_NOT_PART_OF_HOUSEHOLD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDENCE_AND_CARE_EXCLUDING_CHLIDREN_NOT_PART_OF_HOUSEHOLD_VALUE = 1;

	/**
	 * The '<em><b>CARE FOR CHILDREN NOT BEING PART OF HOUSEHOLD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARE_FOR_CHILDREN_NOT_BEING_PART_OF_HOUSEHOLD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CARE_FOR_CHILDREN_NOT_BEING_PART_OF_HOUSEHOLD_VALUE = 2;

	/**
	 * An array of all the '<em><b>CE Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CE_Type[] VALUES_ARRAY =
		new CE_Type[] {
			INALIDITY_AND_INFIRMITY,
			DEPENDENCE_AND_CARE_EXCLUDING_CHLIDREN_NOT_PART_OF_HOUSEHOLD,
			CARE_FOR_CHILDREN_NOT_BEING_PART_OF_HOUSEHOLD,
		};

	/**
	 * A public read-only list of all the '<em><b>CE Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CE_Type> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CE Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CE_Type get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CE_Type result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CE Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CE_Type getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CE_Type result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CE Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CE_Type get(int value) {
		switch (value) {
			case INALIDITY_AND_INFIRMITY_VALUE: return INALIDITY_AND_INFIRMITY;
			case DEPENDENCE_AND_CARE_EXCLUDING_CHLIDREN_NOT_PART_OF_HOUSEHOLD_VALUE: return DEPENDENCE_AND_CARE_EXCLUDING_CHLIDREN_NOT_PART_OF_HOUSEHOLD;
			case CARE_FOR_CHILDREN_NOT_BEING_PART_OF_HOUSEHOLD_VALUE: return CARE_FOR_CHILDREN_NOT_BEING_PART_OF_HOUSEHOLD;
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
	private CE_Type(int value, String name, String literal) {
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
	
} //CE_Type
