/**
 */
package l3IA_ProjetHTML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Maker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link l3IA_ProjetHTML.GraphMaker#getType <em>Type</em>}</li>
 *   <li>{@link l3IA_ProjetHTML.GraphMaker#getNameAbscisse <em>Name Abscisse</em>}</li>
 *   <li>{@link l3IA_ProjetHTML.GraphMaker#getNameOrdonnees <em>Name Ordonnees</em>}</li>
 * </ul>
 *
 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage#getGraphMaker()
 * @model
 * @generated
 */
public interface GraphMaker extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link l3IA_ProjetHTML.TypeGraph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see l3IA_ProjetHTML.TypeGraph
	 * @see #setType(TypeGraph)
	 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage#getGraphMaker_Type()
	 * @model required="true"
	 * @generated
	 */
	TypeGraph getType();

	/**
	 * Sets the value of the '{@link l3IA_ProjetHTML.GraphMaker#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see l3IA_ProjetHTML.TypeGraph
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeGraph value);

	/**
	 * Returns the value of the '<em><b>Name Abscisse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Abscisse</em>' attribute.
	 * @see #setNameAbscisse(String)
	 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage#getGraphMaker_NameAbscisse()
	 * @model required="true"
	 * @generated
	 */
	String getNameAbscisse();

	/**
	 * Sets the value of the '{@link l3IA_ProjetHTML.GraphMaker#getNameAbscisse <em>Name Abscisse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Abscisse</em>' attribute.
	 * @see #getNameAbscisse()
	 * @generated
	 */
	void setNameAbscisse(String value);

	/**
	 * Returns the value of the '<em><b>Name Ordonnees</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Ordonnees</em>' attribute list.
	 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage#getGraphMaker_NameOrdonnees()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getNameOrdonnees();

} // GraphMaker
