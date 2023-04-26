/**
 */
package l3IA_ProjetHTML;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Group By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link l3IA_ProjetHTML.FilterGroupBy#getNameColumnsX <em>Name Columns X</em>}</li>
 *   <li>{@link l3IA_ProjetHTML.FilterGroupBy#getNameColumnsY <em>Name Columns Y</em>}</li>
 *   <li>{@link l3IA_ProjetHTML.FilterGroupBy#getFonctionAgregation <em>Fonction Agregation</em>}</li>
 * </ul>
 *
 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage#getFilterGroupBy()
 * @model
 * @generated
 */
public interface FilterGroupBy extends FilterData {
	/**
	 * Returns the value of the '<em><b>Name Columns X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Columns X</em>' attribute.
	 * @see #setNameColumnsX(String)
	 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage#getFilterGroupBy_NameColumnsX()
	 * @model required="true"
	 * @generated
	 */
	String getNameColumnsX();

	/**
	 * Sets the value of the '{@link l3IA_ProjetHTML.FilterGroupBy#getNameColumnsX <em>Name Columns X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Columns X</em>' attribute.
	 * @see #getNameColumnsX()
	 * @generated
	 */
	void setNameColumnsX(String value);

	/**
	 * Returns the value of the '<em><b>Name Columns Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Columns Y</em>' attribute.
	 * @see #setNameColumnsY(String)
	 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage#getFilterGroupBy_NameColumnsY()
	 * @model required="true"
	 * @generated
	 */
	String getNameColumnsY();

	/**
	 * Sets the value of the '{@link l3IA_ProjetHTML.FilterGroupBy#getNameColumnsY <em>Name Columns Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Columns Y</em>' attribute.
	 * @see #getNameColumnsY()
	 * @generated
	 */
	void setNameColumnsY(String value);

	/**
	 * Returns the value of the '<em><b>Fonction Agregation</b></em>' attribute.
	 * The literals are from the enumeration {@link l3IA_ProjetHTML.FonctionAgregation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fonction Agregation</em>' attribute.
	 * @see l3IA_ProjetHTML.FonctionAgregation
	 * @see #setFonctionAgregation(FonctionAgregation)
	 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage#getFilterGroupBy_FonctionAgregation()
	 * @model required="true"
	 * @generated
	 */
	FonctionAgregation getFonctionAgregation();

	/**
	 * Sets the value of the '{@link l3IA_ProjetHTML.FilterGroupBy#getFonctionAgregation <em>Fonction Agregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fonction Agregation</em>' attribute.
	 * @see l3IA_ProjetHTML.FonctionAgregation
	 * @see #getFonctionAgregation()
	 * @generated
	 */
	void setFonctionAgregation(FonctionAgregation value);

} // FilterGroupBy
