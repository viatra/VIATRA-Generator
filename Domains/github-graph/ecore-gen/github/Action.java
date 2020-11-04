/**
 */
package github;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Action</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see github.GithubPackage#getAction()
 * @model
 * @generated
 */
public enum Action implements Enumerator {
	/**
	 * The '<em><b>SUBSCRIBED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSCRIBED_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSCRIBED(0, "SUBSCRIBED", "SUBSCRIBED"),

	/**
	 * The '<em><b>MENTIONED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MENTIONED_VALUE
	 * @generated
	 * @ordered
	 */
	MENTIONED(1, "MENTIONED", "MENTIONED"),

	/**
	 * The '<em><b>CLOSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSED(2, "CLOSED", "CLOSED"),

	/**
	 * The '<em><b>REFERENCED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCED_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCED(3, "REFERENCED", "REFERENCED"),

	/**
	 * The '<em><b>ASSIGNED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIGNED_VALUE
	 * @generated
	 * @ordered
	 */
	ASSIGNED(4, "ASSIGNED", "ASSIGNED"),

	/**
	 * The '<em><b>REOPENED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REOPENED_VALUE
	 * @generated
	 * @ordered
	 */
	REOPENED(5, "REOPENED", "REOPENED"),

	/**
	 * The '<em><b>UNSUBSCRIBED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSUBSCRIBED_VALUE
	 * @generated
	 * @ordered
	 */
	UNSUBSCRIBED(6, "UNSUBSCRIBED", "UNSUBSCRIBED"),

	/**
	 * The '<em><b>MERGED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MERGED_VALUE
	 * @generated
	 * @ordered
	 */
	MERGED(7, "MERGED", "MERGED"),

	/**
	 * The '<em><b>HEAD REF CLEANED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD_REF_CLEANED_VALUE
	 * @generated
	 * @ordered
	 */
	HEAD_REF_CLEANED(8, "HEAD_REF_CLEANED", "HEAD_REF_CLEANED"),

	/**
	 * The '<em><b>HEAD REF DELETED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD_REF_DELETED_VALUE
	 * @generated
	 * @ordered
	 */
	HEAD_REF_DELETED(9, "HEAD_REF_DELETED", "HEAD_REF_DELETED"),

	/**
	 * The '<em><b>HEAD REF RESTORED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD_REF_RESTORED_VALUE
	 * @generated
	 * @ordered
	 */
	HEAD_REF_RESTORED(10, "HEAD_REF_RESTORED", "HEAD_REF_RESTORED");

	/**
	 * The '<em><b>SUBSCRIBED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSCRIBED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUBSCRIBED_VALUE = 0;

	/**
	 * The '<em><b>MENTIONED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MENTIONED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MENTIONED_VALUE = 1;

	/**
	 * The '<em><b>CLOSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLOSED_VALUE = 2;

	/**
	 * The '<em><b>REFERENCED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCED_VALUE = 3;

	/**
	 * The '<em><b>ASSIGNED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIGNED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNED_VALUE = 4;

	/**
	 * The '<em><b>REOPENED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REOPENED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REOPENED_VALUE = 5;

	/**
	 * The '<em><b>UNSUBSCRIBED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSUBSCRIBED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNSUBSCRIBED_VALUE = 6;

	/**
	 * The '<em><b>MERGED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MERGED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MERGED_VALUE = 7;

	/**
	 * The '<em><b>HEAD REF CLEANED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD_REF_CLEANED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEAD_REF_CLEANED_VALUE = 8;

	/**
	 * The '<em><b>HEAD REF DELETED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD_REF_DELETED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEAD_REF_DELETED_VALUE = 9;

	/**
	 * The '<em><b>HEAD REF RESTORED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAD_REF_RESTORED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEAD_REF_RESTORED_VALUE = 10;

	/**
	 * An array of all the '<em><b>Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Action[] VALUES_ARRAY =
		new Action[] {
			SUBSCRIBED,
			MENTIONED,
			CLOSED,
			REFERENCED,
			ASSIGNED,
			REOPENED,
			UNSUBSCRIBED,
			MERGED,
			HEAD_REF_CLEANED,
			HEAD_REF_DELETED,
			HEAD_REF_RESTORED,
		};

	/**
	 * A public read-only list of all the '<em><b>Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Action> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Action</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Action get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Action result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Action getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Action result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Action get(int value) {
		switch (value) {
			case SUBSCRIBED_VALUE: return SUBSCRIBED;
			case MENTIONED_VALUE: return MENTIONED;
			case CLOSED_VALUE: return CLOSED;
			case REFERENCED_VALUE: return REFERENCED;
			case ASSIGNED_VALUE: return ASSIGNED;
			case REOPENED_VALUE: return REOPENED;
			case UNSUBSCRIBED_VALUE: return UNSUBSCRIBED;
			case MERGED_VALUE: return MERGED;
			case HEAD_REF_CLEANED_VALUE: return HEAD_REF_CLEANED;
			case HEAD_REF_DELETED_VALUE: return HEAD_REF_DELETED;
			case HEAD_REF_RESTORED_VALUE: return HEAD_REF_RESTORED;
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
	private Action(int value, String name, String literal) {
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
	
} //Action
