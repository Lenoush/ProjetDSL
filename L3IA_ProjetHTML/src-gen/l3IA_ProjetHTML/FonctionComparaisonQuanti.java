/**
 */
package l3IA_ProjetHTML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Fonction Comparaison Quanti</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage#getFonctionComparaisonQuanti()
 * @model
 * @generated
 */
public enum FonctionComparaisonQuanti implements Enumerator {
	/**
	 * The '<em><b>Inf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INF_VALUE
	 * @generated
	 * @ordered
	 */
	INF(0, "inf", "<"),

	/**
	 * The '<em><b>Sup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUP_VALUE
	 * @generated
	 * @ordered
	 */
	SUP(0, "sup", ">"),

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
	DIFFERENT(0, "different", "!="),
	/**
	 * The '<em><b>Infegal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #INFEGAL_VALUE
	 * @generated
	 * @ordered
	 */
	INFEGAL(0, "infegal", "<="),
	/**
	 * The '<em><b>Supegal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #SUPEGAL_VALUE
	 * @generated
	 * @ordered
	 */
	SUPEGAL(0, "supegal", ">=");

	/**
	 * The '<em><b>Inf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INF
	 * @model name="inf" literal="&lt;"
	 * @generated
	 * @ordered
	 */
	public static final int INF_VALUE = 0;

	/**
	 * The '<em><b>Sup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUP
	 * @model name="sup" literal="&gt;"
	 * @generated
	 * @ordered
	 */
	public static final int SUP_VALUE = 0;

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
	 * The '<em><b>Infegal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFEGAL
	 * @model name="infegal" literal="&lt;="
	 * @generated
	 * @ordered
	 */
	public static final int INFEGAL_VALUE = 0;

	/**
	 * The '<em><b>Supegal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPEGAL
	 * @model name="supegal" literal="&gt;="
	 * @generated
	 * @ordered
	 */
	public static final int SUPEGAL_VALUE = 0;

	/**
	 * An array of all the '<em><b>Fonction Comparaison Quanti</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FonctionComparaisonQuanti[] VALUES_ARRAY = new FonctionComparaisonQuanti[] { INF, SUP, EGAL,
			DIFFERENT, INFEGAL, SUPEGAL, };

	/**
	 * A public read-only list of all the '<em><b>Fonction Comparaison Quanti</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FonctionComparaisonQuanti> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Fonction Comparaison Quanti</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FonctionComparaisonQuanti get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FonctionComparaisonQuanti result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fonction Comparaison Quanti</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FonctionComparaisonQuanti getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FonctionComparaisonQuanti result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fonction Comparaison Quanti</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FonctionComparaisonQuanti get(int value) {
		switch (value) {
		case INF_VALUE:
			return INF;
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
	private FonctionComparaisonQuanti(int value, String name, String literal) {
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

} //FonctionComparaisonQuanti
