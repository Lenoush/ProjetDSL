/**
 */
package l3IA_ProjetHTML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Realisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link l3IA_ProjetHTML.GraphRealisation#getOwnedImport <em>Owned Import</em>}</li>
 *   <li>{@link l3IA_ProjetHTML.GraphRealisation#getOwnedFilter <em>Owned Filter</em>}</li>
 *   <li>{@link l3IA_ProjetHTML.GraphRealisation#getOwnedGraphMaker <em>Owned Graph Maker</em>}</li>
 *   <li>{@link l3IA_ProjetHTML.GraphRealisation#getOwnedGraphUpdate <em>Owned Graph Update</em>}</li>
 * </ul>
 *
 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage#getGraphRealisation()
 * @model
 * @generated
 */
public interface GraphRealisation extends EObject {

	/**
	 * Returns the value of the '<em><b>Owned Import</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Import</em>' containment reference.
	 * @see #setOwnedImport(ImportData)
	 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage#getGraphRealisation_OwnedImport()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ImportData getOwnedImport();

	/**
	 * Sets the value of the '{@link l3IA_ProjetHTML.GraphRealisation#getOwnedImport <em>Owned Import</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Import</em>' containment reference.
	 * @see #getOwnedImport()
	 * @generated
	 */
	void setOwnedImport(ImportData value);

	/**
	 * Returns the value of the '<em><b>Owned Filter</b></em>' containment reference list.
	 * The list contents are of type {@link l3IA_ProjetHTML.FilterData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Filter</em>' containment reference list.
	 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage#getGraphRealisation_OwnedFilter()
	 * @model containment="true"
	 * @generated
	 */
	EList<FilterData> getOwnedFilter();

	/**
	 * Returns the value of the '<em><b>Owned Graph Maker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Graph Maker</em>' containment reference.
	 * @see #setOwnedGraphMaker(GraphMaker)
	 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage#getGraphRealisation_OwnedGraphMaker()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GraphMaker getOwnedGraphMaker();

	/**
	 * Sets the value of the '{@link l3IA_ProjetHTML.GraphRealisation#getOwnedGraphMaker <em>Owned Graph Maker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Graph Maker</em>' containment reference.
	 * @see #getOwnedGraphMaker()
	 * @generated
	 */
	void setOwnedGraphMaker(GraphMaker value);

	/**
	 * Returns the value of the '<em><b>Owned Graph Update</b></em>' containment reference list.
	 * The list contents are of type {@link l3IA_ProjetHTML.GraphUpdate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Graph Update</em>' containment reference list.
	 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage#getGraphRealisation_OwnedGraphUpdate()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphUpdate> getOwnedGraphUpdate();

} // GraphRealisation
