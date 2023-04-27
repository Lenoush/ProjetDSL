/**
 */
package l3IA_ProjetHTML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dashboard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link l3IA_ProjetHTML.Dashboard#getOwnedGraphRealisation <em>Owned Graph Realisation</em>}</li>
 *   <li>{@link l3IA_ProjetHTML.Dashboard#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage#getDashboard()
 * @model
 * @generated
 */
public interface Dashboard extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Graph Realisation</b></em>' containment reference list.
	 * The list contents are of type {@link l3IA_ProjetHTML.GraphRealisation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Graph Realisation</em>' containment reference list.
	 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage#getDashboard_OwnedGraphRealisation()
	 * @model containment="true" required="true" upper="4"
	 * @generated
	 */
	EList<GraphRealisation> getOwnedGraphRealisation();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage#getDashboard_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link l3IA_ProjetHTML.Dashboard#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Dashboard
