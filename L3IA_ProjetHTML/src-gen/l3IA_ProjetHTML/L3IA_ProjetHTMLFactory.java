/**
 */
package l3IA_ProjetHTML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage
 * @generated
 */
public interface L3IA_ProjetHTMLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	L3IA_ProjetHTMLFactory eINSTANCE = l3IA_ProjetHTML.impl.L3IA_ProjetHTMLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dashboard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dashboard</em>'.
	 * @generated
	 */
	Dashboard createDashboard();

	/**
	 * Returns a new object of class '<em>Graph Realisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graph Realisation</em>'.
	 * @generated
	 */
	GraphRealisation createGraphRealisation();

	/**
	 * Returns a new object of class '<em>Import Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Data</em>'.
	 * @generated
	 */
	ImportData createImportData();

	/**
	 * Returns a new object of class '<em>Filter Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Data</em>'.
	 * @generated
	 */
	FilterData createFilterData();

	/**
	 * Returns a new object of class '<em>Filter Compare</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Compare</em>'.
	 * @generated
	 */
	FilterCompare createFilterCompare();

	/**
	 * Returns a new object of class '<em>Compare Quali</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compare Quali</em>'.
	 * @generated
	 */
	CompareQuali createCompareQuali();

	/**
	 * Returns a new object of class '<em>Compare Quanti</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compare Quanti</em>'.
	 * @generated
	 */
	CompareQuanti createCompareQuanti();

	/**
	 * Returns a new object of class '<em>Filter Not Null</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Not Null</em>'.
	 * @generated
	 */
	FilterNotNull createFilterNotNull();

	/**
	 * Returns a new object of class '<em>Filter Group By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter Group By</em>'.
	 * @generated
	 */
	FilterGroupBy createFilterGroupBy();

	/**
	 * Returns a new object of class '<em>Graph Maker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graph Maker</em>'.
	 * @generated
	 */
	GraphMaker createGraphMaker();

	/**
	 * Returns a new object of class '<em>Graph Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graph Update</em>'.
	 * @generated
	 */
	GraphUpdate createGraphUpdate();

	/**
	 * Returns a new object of class '<em>Update Couleur Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Couleur Graph</em>'.
	 * @generated
	 */
	UpdateCouleurGraph createUpdateCouleurGraph();

	/**
	 * Returns a new object of class '<em>Update Name Axe Y</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Name Axe Y</em>'.
	 * @generated
	 */
	UpdateNameAxeY createUpdateNameAxeY();

	/**
	 * Returns a new object of class '<em>Update Name Axe X</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Name Axe X</em>'.
	 * @generated
	 */
	UpdateNameAxeX createUpdateNameAxeX();

	/**
	 * Returns a new object of class '<em>Update Name Legend</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Name Legend</em>'.
	 * @generated
	 */
	UpdateNameLegend createUpdateNameLegend();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	L3IA_ProjetHTMLPackage getL3IA_ProjetHTMLPackage();

} //L3IA_ProjetHTMLFactory
