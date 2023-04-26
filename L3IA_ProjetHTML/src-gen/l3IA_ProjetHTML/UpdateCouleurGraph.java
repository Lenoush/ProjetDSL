/**
 */
package l3IA_ProjetHTML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Couleur Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link l3IA_ProjetHTML.UpdateCouleurGraph#getCouleur <em>Couleur</em>}</li>
 * </ul>
 *
 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage#getUpdateCouleurGraph()
 * @model
 * @generated
 */
public interface UpdateCouleurGraph extends GraphUpdate {
	/**
	 * Returns the value of the '<em><b>Couleur</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couleur</em>' attribute list.
	 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage#getUpdateCouleurGraph_Couleur()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getCouleur();

} // UpdateCouleurGraph
