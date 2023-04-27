/**
 */
package l3IA_ProjetHTML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compare Quali</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link l3IA_ProjetHTML.CompareQuali#getSomethingtocompare <em>Somethingtocompare</em>}</li>
 *   <li>{@link l3IA_ProjetHTML.CompareQuali#getName <em>Name</em>}</li>
 *   <li>{@link l3IA_ProjetHTML.CompareQuali#getComparaison <em>Comparaison</em>}</li>
 * </ul>
 *
 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage#getCompareQuali()
 * @model
 * @generated
 */
public interface CompareQuali extends FilterCompare {

	/**
	 * Returns the value of the '<em><b>Somethingtocompare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Somethingtocompare</em>' attribute.
	 * @see #setSomethingtocompare(String)
	 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage#getCompareQuali_Somethingtocompare()
	 * @model required="true"
	 * @generated
	 */
	String getSomethingtocompare();

	/**
	 * Sets the value of the '{@link l3IA_ProjetHTML.CompareQuali#getSomethingtocompare <em>Somethingtocompare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Somethingtocompare</em>' attribute.
	 * @see #getSomethingtocompare()
	 * @generated
	 */
	void setSomethingtocompare(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage#getCompareQuali_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link l3IA_ProjetHTML.CompareQuali#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Comparaison</b></em>' attribute.
	 * The literals are from the enumeration {@link l3IA_ProjetHTML.FonctionComparaisonQuali}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparaison</em>' attribute.
	 * @see l3IA_ProjetHTML.FonctionComparaisonQuali
	 * @see #setComparaison(FonctionComparaisonQuali)
	 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage#getCompareQuali_Comparaison()
	 * @model required="true"
	 * @generated
	 */
	FonctionComparaisonQuali getComparaison();

	/**
	 * Sets the value of the '{@link l3IA_ProjetHTML.CompareQuali#getComparaison <em>Comparaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparaison</em>' attribute.
	 * @see l3IA_ProjetHTML.FonctionComparaisonQuali
	 * @see #getComparaison()
	 * @generated
	 */
	void setComparaison(FonctionComparaisonQuali value);
} // CompareQuali
