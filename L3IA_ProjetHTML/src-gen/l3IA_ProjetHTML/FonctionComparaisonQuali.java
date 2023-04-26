/**
 */
package l3IA_ProjetHTML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Fonction Comparaison Quali</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage#getFonctionComparaisonQuali()
 * @model
 * @generated
 */
public enum FonctionComparaisonQuali implements Enumerator {
	/**
	 * The '<em><b>Egal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EGAL_VALUE
	 * @generated
	 * @ordered
	 */
	EGAL(0, "egal", "=="),

	/**
	 * The '<em><b>Different</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIFFERENT_VALUE
	 * @generated
	 * @ordered
	 */
	DIFFERENT(0, "different", "!=");

	/**
	 * The '<em><b>Egal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EGAL
	 * @model name="egal" literal="=="
	 * @generated
	 * @ordered
	 */
	public static final int EGAL_VALUE = 0;

	/**
	 * The '<em><b>Different</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIFFERENT
	 * @model name="different" literal="!="
	 * @generated
	 * @ordered
	 */
	public static final int DIFFERENT_VALUE = 0;

	/**
	 * An array of all the '<em><b>Fonction Comparaison Quali</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FonctionComparaisonQuali[] VALUES_ARRAY = new FonctionComparaisonQuali[] { EGAL, DIFFERENT, };

	/**
	 * A public read-only list of all the '<em><b>Fonction Comparaison Quali</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FonctionComparaisonQuali> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Fonction Comparaison Quali</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FonctionComparaisonQuali get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FonctionComparaisonQuali result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fonction Comparaison Quali</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FonctionComparaisonQuali getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FonctionComparaisonQuali result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fonction Comparaison Quali</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FonctionComparaisonQuali get(int value) {
		switch (value) {
		case EGAL_VALUE:
			return EGAL;
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
	private FonctionComparaisonQuali(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

} //FonctionComparaisonQuali
