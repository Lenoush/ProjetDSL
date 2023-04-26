/**
 */
package l3IA_ProjetHTML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLFactory
 * @model kind="package"
 * @generated
 */
public interface L3IA_ProjetHTMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "l3IA_ProjetHTML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/l3IA_ProjetHTML";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "l3IA_ProjetHTML";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	L3IA_ProjetHTMLPackage eINSTANCE = l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link l3IA_ProjetHTML.impl.DashboardImpl <em>Dashboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see l3IA_ProjetHTML.impl.DashboardImpl
	 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getDashboard()
	 * @generated
	 */
	int DASHBOARD = 0;

	/**
	 * The feature id for the '<em><b>Owned Graph Realisation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD__OWNED_GRAPH_REALISATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD__NAME = 1;

	/**
	 * The number of structural features of the '<em>Dashboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dashboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link l3IA_ProjetHTML.impl.GraphRealisationImpl <em>Graph Realisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see l3IA_ProjetHTML.impl.GraphRealisationImpl
	 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getGraphRealisation()
	 * @generated
	 */
	int GRAPH_REALISATION = 1;

	/**
	 * The feature id for the '<em><b>Owned Import</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_REALISATION__OWNED_IMPORT = 0;

	/**
	 * The feature id for the '<em><b>Owned Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_REALISATION__OWNED_FILTER = 1;

	/**
	 * The feature id for the '<em><b>Owned Graph Maker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_REALISATION__OWNED_GRAPH_MAKER = 2;

	/**
	 * The feature id for the '<em><b>Owned Graph Update</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_REALISATION__OWNED_GRAPH_UPDATE = 3;

	/**
	 * The number of structural features of the '<em>Graph Realisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_REALISATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Graph Realisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_REALISATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link l3IA_ProjetHTML.impl.ImportDataImpl <em>Import Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see l3IA_ProjetHTML.impl.ImportDataImpl
	 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getImportData()
	 * @generated
	 */
	int IMPORT_DATA = 2;

	/**
	 * The feature id for the '<em><b>Delimeter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DATA__DELIMETER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DATA__NAME = 1;

	/**
	 * The number of structural features of the '<em>Import Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Import Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link l3IA_ProjetHTML.impl.FilterDataImpl <em>Filter Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see l3IA_ProjetHTML.impl.FilterDataImpl
	 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getFilterData()
	 * @generated
	 */
	int FILTER_DATA = 3;

	/**
	 * The number of structural features of the '<em>Filter Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_DATA_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Filter Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link l3IA_ProjetHTML.impl.FilterCompareImpl <em>Filter Compare</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see l3IA_ProjetHTML.impl.FilterCompareImpl
	 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getFilterCompare()
	 * @generated
	 */
	int FILTER_COMPARE = 4;

	/**
	 * The number of structural features of the '<em>Filter Compare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_COMPARE_FEATURE_COUNT = FILTER_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Filter Compare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_COMPARE_OPERATION_COUNT = FILTER_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link l3IA_ProjetHTML.impl.CompareQualiImpl <em>Compare Quali</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see l3IA_ProjetHTML.impl.CompareQualiImpl
	 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getCompareQuali()
	 * @generated
	 */
	int COMPARE_QUALI = 5;

	/**
	 * The feature id for the '<em><b>Somethingtocompare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_QUALI__SOMETHINGTOCOMPARE = FILTER_COMPARE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_QUALI__NAME = FILTER_COMPARE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comparaison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_QUALI__COMPARAISON = FILTER_COMPARE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Compare Quali</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_QUALI_FEATURE_COUNT = FILTER_COMPARE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Compare Quali</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_QUALI_OPERATION_COUNT = FILTER_COMPARE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link l3IA_ProjetHTML.impl.CompareQuantiImpl <em>Compare Quanti</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see l3IA_ProjetHTML.impl.CompareQuantiImpl
	 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getCompareQuanti()
	 * @generated
	 */
	int COMPARE_QUANTI = 6;

	/**
	 * The feature id for the '<em><b>Somethingtocompare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_QUANTI__SOMETHINGTOCOMPARE = FILTER_COMPARE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_QUANTI__NAME = FILTER_COMPARE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comparaison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_QUANTI__COMPARAISON = FILTER_COMPARE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Compare Quanti</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_QUANTI_FEATURE_COUNT = FILTER_COMPARE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Compare Quanti</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_QUANTI_OPERATION_COUNT = FILTER_COMPARE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link l3IA_ProjetHTML.impl.FilterNotNullImpl <em>Filter Not Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see l3IA_ProjetHTML.impl.FilterNotNullImpl
	 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getFilterNotNull()
	 * @generated
	 */
	int FILTER_NOT_NULL = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_NOT_NULL__NAME = FILTER_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Filter Not Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_NOT_NULL_FEATURE_COUNT = FILTER_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Filter Not Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_NOT_NULL_OPERATION_COUNT = FILTER_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link l3IA_ProjetHTML.impl.FilterGroupByImpl <em>Filter Group By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see l3IA_ProjetHTML.impl.FilterGroupByImpl
	 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getFilterGroupBy()
	 * @generated
	 */
	int FILTER_GROUP_BY = 8;

	/**
	 * The feature id for the '<em><b>Name Columns X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_GROUP_BY__NAME_COLUMNS_X = FILTER_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name Columns Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_GROUP_BY__NAME_COLUMNS_Y = FILTER_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fonction Agregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_GROUP_BY__FONCTION_AGREGATION = FILTER_DATA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Filter Group By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_GROUP_BY_FEATURE_COUNT = FILTER_DATA_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Filter Group By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_GROUP_BY_OPERATION_COUNT = FILTER_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link l3IA_ProjetHTML.impl.GraphMakerImpl <em>Graph Maker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see l3IA_ProjetHTML.impl.GraphMakerImpl
	 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getGraphMaker()
	 * @generated
	 */
	int GRAPH_MAKER = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_MAKER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name Abscisse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_MAKER__NAME_ABSCISSE = 1;

	/**
	 * The feature id for the '<em><b>Name Ordonnees</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_MAKER__NAME_ORDONNEES = 2;

	/**
	 * The number of structural features of the '<em>Graph Maker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_MAKER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Graph Maker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_MAKER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link l3IA_ProjetHTML.impl.GraphUpdateImpl <em>Graph Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see l3IA_ProjetHTML.impl.GraphUpdateImpl
	 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getGraphUpdate()
	 * @generated
	 */
	int GRAPH_UPDATE = 10;

	/**
	 * The number of structural features of the '<em>Graph Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_UPDATE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Graph Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_UPDATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link l3IA_ProjetHTML.impl.UpdateCouleurGraphImpl <em>Update Couleur Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see l3IA_ProjetHTML.impl.UpdateCouleurGraphImpl
	 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getUpdateCouleurGraph()
	 * @generated
	 */
	int UPDATE_COULEUR_GRAPH = 11;

	/**
	 * The feature id for the '<em><b>Couleur</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_COULEUR_GRAPH__COULEUR = GRAPH_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Couleur Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_COULEUR_GRAPH_FEATURE_COUNT = GRAPH_UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Couleur Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_COULEUR_GRAPH_OPERATION_COUNT = GRAPH_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link l3IA_ProjetHTML.impl.UpdateNameAxeYImpl <em>Update Name Axe Y</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see l3IA_ProjetHTML.impl.UpdateNameAxeYImpl
	 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getUpdateNameAxeY()
	 * @generated
	 */
	int UPDATE_NAME_AXE_Y = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_NAME_AXE_Y__NAME = GRAPH_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Name Axe Y</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_NAME_AXE_Y_FEATURE_COUNT = GRAPH_UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Name Axe Y</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_NAME_AXE_Y_OPERATION_COUNT = GRAPH_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link l3IA_ProjetHTML.impl.UpdateNameAxeXImpl <em>Update Name Axe X</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see l3IA_ProjetHTML.impl.UpdateNameAxeXImpl
	 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getUpdateNameAxeX()
	 * @generated
	 */
	int UPDATE_NAME_AXE_X = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_NAME_AXE_X__NAME = GRAPH_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Name Axe X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_NAME_AXE_X_FEATURE_COUNT = GRAPH_UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Name Axe X</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_NAME_AXE_X_OPERATION_COUNT = GRAPH_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link l3IA_ProjetHTML.impl.UpdateNameLegendImpl <em>Update Name Legend</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see l3IA_ProjetHTML.impl.UpdateNameLegendImpl
	 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getUpdateNameLegend()
	 * @generated
	 */
	int UPDATE_NAME_LEGEND = 14;

	/**
	 * The feature id for the '<em><b>Oldname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_NAME_LEGEND__OLDNAME = GRAPH_UPDATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Newname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_NAME_LEGEND__NEWNAME = GRAPH_UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Update Name Legend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_NAME_LEGEND_FEATURE_COUNT = GRAPH_UPDATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Update Name Legend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_NAME_LEGEND_OPERATION_COUNT = GRAPH_UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link l3IA_ProjetHTML.TypeGraph <em>Type Graph</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see l3IA_ProjetHTML.TypeGraph
	 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getTypeGraph()
	 * @generated
	 */
	int TYPE_GRAPH = 15;

	/**
	 * The meta object id for the '{@link l3IA_ProjetHTML.FonctionComparaisonQuanti <em>Fonction Comparaison Quanti</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see l3IA_ProjetHTML.FonctionComparaisonQuanti
	 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getFonctionComparaisonQuanti()
	 * @generated
	 */
	int FONCTION_COMPARAISON_QUANTI = 16;

	/**
	 * The meta object id for the '{@link l3IA_ProjetHTML.FonctionComparaisonQuali <em>Fonction Comparaison Quali</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see l3IA_ProjetHTML.FonctionComparaisonQuali
	 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getFonctionComparaisonQuali()
	 * @generated
	 */
	int FONCTION_COMPARAISON_QUALI = 17;

	/**
	 * The meta object id for the '{@link l3IA_ProjetHTML.FonctionAgregation <em>Fonction Agregation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see l3IA_ProjetHTML.FonctionAgregation
	 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getFonctionAgregation()
	 * @generated
	 */
	int FONCTION_AGREGATION = 18;

	/**
	 * Returns the meta object for class '{@link l3IA_ProjetHTML.Dashboard <em>Dashboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dashboard</em>'.
	 * @see l3IA_ProjetHTML.Dashboard
	 * @generated
	 */
	EClass getDashboard();

	/**
	 * Returns the meta object for the containment reference list '{@link l3IA_ProjetHTML.Dashboard#getOwnedGraphRealisation <em>Owned Graph Realisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Graph Realisation</em>'.
	 * @see l3IA_ProjetHTML.Dashboard#getOwnedGraphRealisation()
	 * @see #getDashboard()
	 * @generated
	 */
	EReference getDashboard_OwnedGraphRealisation();

	/**
	 * Returns the meta object for the attribute '{@link l3IA_ProjetHTML.Dashboard#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see l3IA_ProjetHTML.Dashboard#getName()
	 * @see #getDashboard()
	 * @generated
	 */
	EAttribute getDashboard_Name();

	/**
	 * Returns the meta object for class '{@link l3IA_ProjetHTML.GraphRealisation <em>Graph Realisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Realisation</em>'.
	 * @see l3IA_ProjetHTML.GraphRealisation
	 * @generated
	 */
	EClass getGraphRealisation();

	/**
	 * Returns the meta object for the containment reference '{@link l3IA_ProjetHTML.GraphRealisation#getOwnedImport <em>Owned Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Import</em>'.
	 * @see l3IA_ProjetHTML.GraphRealisation#getOwnedImport()
	 * @see #getGraphRealisation()
	 * @generated
	 */
	EReference getGraphRealisation_OwnedImport();

	/**
	 * Returns the meta object for the containment reference list '{@link l3IA_ProjetHTML.GraphRealisation#getOwnedFilter <em>Owned Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Filter</em>'.
	 * @see l3IA_ProjetHTML.GraphRealisation#getOwnedFilter()
	 * @see #getGraphRealisation()
	 * @generated
	 */
	EReference getGraphRealisation_OwnedFilter();

	/**
	 * Returns the meta object for the containment reference '{@link l3IA_ProjetHTML.GraphRealisation#getOwnedGraphMaker <em>Owned Graph Maker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Graph Maker</em>'.
	 * @see l3IA_ProjetHTML.GraphRealisation#getOwnedGraphMaker()
	 * @see #getGraphRealisation()
	 * @generated
	 */
	EReference getGraphRealisation_OwnedGraphMaker();

	/**
	 * Returns the meta object for the containment reference list '{@link l3IA_ProjetHTML.GraphRealisation#getOwnedGraphUpdate <em>Owned Graph Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Graph Update</em>'.
	 * @see l3IA_ProjetHTML.GraphRealisation#getOwnedGraphUpdate()
	 * @see #getGraphRealisation()
	 * @generated
	 */
	EReference getGraphRealisation_OwnedGraphUpdate();

	/**
	 * Returns the meta object for class '{@link l3IA_ProjetHTML.ImportData <em>Import Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Data</em>'.
	 * @see l3IA_ProjetHTML.ImportData
	 * @generated
	 */
	EClass getImportData();

	/**
	 * Returns the meta object for the attribute '{@link l3IA_ProjetHTML.ImportData#getDelimeter <em>Delimeter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delimeter</em>'.
	 * @see l3IA_ProjetHTML.ImportData#getDelimeter()
	 * @see #getImportData()
	 * @generated
	 */
	EAttribute getImportData_Delimeter();

	/**
	 * Returns the meta object for the attribute '{@link l3IA_ProjetHTML.ImportData#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see l3IA_ProjetHTML.ImportData#getName()
	 * @see #getImportData()
	 * @generated
	 */
	EAttribute getImportData_Name();

	/**
	 * Returns the meta object for class '{@link l3IA_ProjetHTML.FilterData <em>Filter Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Data</em>'.
	 * @see l3IA_ProjetHTML.FilterData
	 * @generated
	 */
	EClass getFilterData();

	/**
	 * Returns the meta object for class '{@link l3IA_ProjetHTML.FilterCompare <em>Filter Compare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Compare</em>'.
	 * @see l3IA_ProjetHTML.FilterCompare
	 * @generated
	 */
	EClass getFilterCompare();

	/**
	 * Returns the meta object for class '{@link l3IA_ProjetHTML.CompareQuali <em>Compare Quali</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compare Quali</em>'.
	 * @see l3IA_ProjetHTML.CompareQuali
	 * @generated
	 */
	EClass getCompareQuali();

	/**
	 * Returns the meta object for the attribute '{@link l3IA_ProjetHTML.CompareQuali#getSomethingtocompare <em>Somethingtocompare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Somethingtocompare</em>'.
	 * @see l3IA_ProjetHTML.CompareQuali#getSomethingtocompare()
	 * @see #getCompareQuali()
	 * @generated
	 */
	EAttribute getCompareQuali_Somethingtocompare();

	/**
	 * Returns the meta object for the attribute '{@link l3IA_ProjetHTML.CompareQuali#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see l3IA_ProjetHTML.CompareQuali#getName()
	 * @see #getCompareQuali()
	 * @generated
	 */
	EAttribute getCompareQuali_Name();

	/**
	 * Returns the meta object for the attribute '{@link l3IA_ProjetHTML.CompareQuali#getComparaison <em>Comparaison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparaison</em>'.
	 * @see l3IA_ProjetHTML.CompareQuali#getComparaison()
	 * @see #getCompareQuali()
	 * @generated
	 */
	EAttribute getCompareQuali_Comparaison();

	/**
	 * Returns the meta object for class '{@link l3IA_ProjetHTML.CompareQuanti <em>Compare Quanti</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compare Quanti</em>'.
	 * @see l3IA_ProjetHTML.CompareQuanti
	 * @generated
	 */
	EClass getCompareQuanti();

	/**
	 * Returns the meta object for the attribute '{@link l3IA_ProjetHTML.CompareQuanti#getSomethingtocompare <em>Somethingtocompare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Somethingtocompare</em>'.
	 * @see l3IA_ProjetHTML.CompareQuanti#getSomethingtocompare()
	 * @see #getCompareQuanti()
	 * @generated
	 */
	EAttribute getCompareQuanti_Somethingtocompare();

	/**
	 * Returns the meta object for the attribute '{@link l3IA_ProjetHTML.CompareQuanti#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see l3IA_ProjetHTML.CompareQuanti#getName()
	 * @see #getCompareQuanti()
	 * @generated
	 */
	EAttribute getCompareQuanti_Name();

	/**
	 * Returns the meta object for the attribute '{@link l3IA_ProjetHTML.CompareQuanti#getComparaison <em>Comparaison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparaison</em>'.
	 * @see l3IA_ProjetHTML.CompareQuanti#getComparaison()
	 * @see #getCompareQuanti()
	 * @generated
	 */
	EAttribute getCompareQuanti_Comparaison();

	/**
	 * Returns the meta object for class '{@link l3IA_ProjetHTML.FilterNotNull <em>Filter Not Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Not Null</em>'.
	 * @see l3IA_ProjetHTML.FilterNotNull
	 * @generated
	 */
	EClass getFilterNotNull();

	/**
	 * Returns the meta object for the attribute '{@link l3IA_ProjetHTML.FilterNotNull#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see l3IA_ProjetHTML.FilterNotNull#getName()
	 * @see #getFilterNotNull()
	 * @generated
	 */
	EAttribute getFilterNotNull_Name();

	/**
	 * Returns the meta object for class '{@link l3IA_ProjetHTML.FilterGroupBy <em>Filter Group By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Group By</em>'.
	 * @see l3IA_ProjetHTML.FilterGroupBy
	 * @generated
	 */
	EClass getFilterGroupBy();

	/**
	 * Returns the meta object for the attribute '{@link l3IA_ProjetHTML.FilterGroupBy#getNameColumnsX <em>Name Columns X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Columns X</em>'.
	 * @see l3IA_ProjetHTML.FilterGroupBy#getNameColumnsX()
	 * @see #getFilterGroupBy()
	 * @generated
	 */
	EAttribute getFilterGroupBy_NameColumnsX();

	/**
	 * Returns the meta object for the attribute '{@link l3IA_ProjetHTML.FilterGroupBy#getNameColumnsY <em>Name Columns Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Columns Y</em>'.
	 * @see l3IA_ProjetHTML.FilterGroupBy#getNameColumnsY()
	 * @see #getFilterGroupBy()
	 * @generated
	 */
	EAttribute getFilterGroupBy_NameColumnsY();

	/**
	 * Returns the meta object for the attribute '{@link l3IA_ProjetHTML.FilterGroupBy#getFonctionAgregation <em>Fonction Agregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fonction Agregation</em>'.
	 * @see l3IA_ProjetHTML.FilterGroupBy#getFonctionAgregation()
	 * @see #getFilterGroupBy()
	 * @generated
	 */
	EAttribute getFilterGroupBy_FonctionAgregation();

	/**
	 * Returns the meta object for class '{@link l3IA_ProjetHTML.GraphMaker <em>Graph Maker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Maker</em>'.
	 * @see l3IA_ProjetHTML.GraphMaker
	 * @generated
	 */
	EClass getGraphMaker();

	/**
	 * Returns the meta object for the attribute '{@link l3IA_ProjetHTML.GraphMaker#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see l3IA_ProjetHTML.GraphMaker#getType()
	 * @see #getGraphMaker()
	 * @generated
	 */
	EAttribute getGraphMaker_Type();

	/**
	 * Returns the meta object for the attribute '{@link l3IA_ProjetHTML.GraphMaker#getNameAbscisse <em>Name Abscisse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Abscisse</em>'.
	 * @see l3IA_ProjetHTML.GraphMaker#getNameAbscisse()
	 * @see #getGraphMaker()
	 * @generated
	 */
	EAttribute getGraphMaker_NameAbscisse();

	/**
	 * Returns the meta object for the attribute list '{@link l3IA_ProjetHTML.GraphMaker#getNameOrdonnees <em>Name Ordonnees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Name Ordonnees</em>'.
	 * @see l3IA_ProjetHTML.GraphMaker#getNameOrdonnees()
	 * @see #getGraphMaker()
	 * @generated
	 */
	EAttribute getGraphMaker_NameOrdonnees();

	/**
	 * Returns the meta object for class '{@link l3IA_ProjetHTML.GraphUpdate <em>Graph Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Update</em>'.
	 * @see l3IA_ProjetHTML.GraphUpdate
	 * @generated
	 */
	EClass getGraphUpdate();

	/**
	 * Returns the meta object for class '{@link l3IA_ProjetHTML.UpdateCouleurGraph <em>Update Couleur Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Couleur Graph</em>'.
	 * @see l3IA_ProjetHTML.UpdateCouleurGraph
	 * @generated
	 */
	EClass getUpdateCouleurGraph();

	/**
	 * Returns the meta object for the attribute list '{@link l3IA_ProjetHTML.UpdateCouleurGraph#getCouleur <em>Couleur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Couleur</em>'.
	 * @see l3IA_ProjetHTML.UpdateCouleurGraph#getCouleur()
	 * @see #getUpdateCouleurGraph()
	 * @generated
	 */
	EAttribute getUpdateCouleurGraph_Couleur();

	/**
	 * Returns the meta object for class '{@link l3IA_ProjetHTML.UpdateNameAxeY <em>Update Name Axe Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Name Axe Y</em>'.
	 * @see l3IA_ProjetHTML.UpdateNameAxeY
	 * @generated
	 */
	EClass getUpdateNameAxeY();

	/**
	 * Returns the meta object for the attribute '{@link l3IA_ProjetHTML.UpdateNameAxeY#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see l3IA_ProjetHTML.UpdateNameAxeY#getName()
	 * @see #getUpdateNameAxeY()
	 * @generated
	 */
	EAttribute getUpdateNameAxeY_Name();

	/**
	 * Returns the meta object for class '{@link l3IA_ProjetHTML.UpdateNameAxeX <em>Update Name Axe X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Name Axe X</em>'.
	 * @see l3IA_ProjetHTML.UpdateNameAxeX
	 * @generated
	 */
	EClass getUpdateNameAxeX();

	/**
	 * Returns the meta object for the attribute '{@link l3IA_ProjetHTML.UpdateNameAxeX#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see l3IA_ProjetHTML.UpdateNameAxeX#getName()
	 * @see #getUpdateNameAxeX()
	 * @generated
	 */
	EAttribute getUpdateNameAxeX_Name();

	/**
	 * Returns the meta object for class '{@link l3IA_ProjetHTML.UpdateNameLegend <em>Update Name Legend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Name Legend</em>'.
	 * @see l3IA_ProjetHTML.UpdateNameLegend
	 * @generated
	 */
	EClass getUpdateNameLegend();

	/**
	 * Returns the meta object for the attribute '{@link l3IA_ProjetHTML.UpdateNameLegend#getOldname <em>Oldname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oldname</em>'.
	 * @see l3IA_ProjetHTML.UpdateNameLegend#getOldname()
	 * @see #getUpdateNameLegend()
	 * @generated
	 */
	EAttribute getUpdateNameLegend_Oldname();

	/**
	 * Returns the meta object for the attribute '{@link l3IA_ProjetHTML.UpdateNameLegend#getNewname <em>Newname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Newname</em>'.
	 * @see l3IA_ProjetHTML.UpdateNameLegend#getNewname()
	 * @see #getUpdateNameLegend()
	 * @generated
	 */
	EAttribute getUpdateNameLegend_Newname();

	/**
	 * Returns the meta object for enum '{@link l3IA_ProjetHTML.TypeGraph <em>Type Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Graph</em>'.
	 * @see l3IA_ProjetHTML.TypeGraph
	 * @generated
	 */
	EEnum getTypeGraph();

	/**
	 * Returns the meta object for enum '{@link l3IA_ProjetHTML.FonctionComparaisonQuanti <em>Fonction Comparaison Quanti</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fonction Comparaison Quanti</em>'.
	 * @see l3IA_ProjetHTML.FonctionComparaisonQuanti
	 * @generated
	 */
	EEnum getFonctionComparaisonQuanti();

	/**
	 * Returns the meta object for enum '{@link l3IA_ProjetHTML.FonctionComparaisonQuali <em>Fonction Comparaison Quali</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fonction Comparaison Quali</em>'.
	 * @see l3IA_ProjetHTML.FonctionComparaisonQuali
	 * @generated
	 */
	EEnum getFonctionComparaisonQuali();

	/**
	 * Returns the meta object for enum '{@link l3IA_ProjetHTML.FonctionAgregation <em>Fonction Agregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fonction Agregation</em>'.
	 * @see l3IA_ProjetHTML.FonctionAgregation
	 * @generated
	 */
	EEnum getFonctionAgregation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	L3IA_ProjetHTMLFactory getL3IA_ProjetHTMLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link l3IA_ProjetHTML.impl.DashboardImpl <em>Dashboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see l3IA_ProjetHTML.impl.DashboardImpl
		 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getDashboard()
		 * @generated
		 */
		EClass DASHBOARD = eINSTANCE.getDashboard();

		/**
		 * The meta object literal for the '<em><b>Owned Graph Realisation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DASHBOARD__OWNED_GRAPH_REALISATION = eINSTANCE.getDashboard_OwnedGraphRealisation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DASHBOARD__NAME = eINSTANCE.getDashboard_Name();

		/**
		 * The meta object literal for the '{@link l3IA_ProjetHTML.impl.GraphRealisationImpl <em>Graph Realisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see l3IA_ProjetHTML.impl.GraphRealisationImpl
		 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getGraphRealisation()
		 * @generated
		 */
		EClass GRAPH_REALISATION = eINSTANCE.getGraphRealisation();

		/**
		 * The meta object literal for the '<em><b>Owned Import</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_REALISATION__OWNED_IMPORT = eINSTANCE.getGraphRealisation_OwnedImport();

		/**
		 * The meta object literal for the '<em><b>Owned Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_REALISATION__OWNED_FILTER = eINSTANCE.getGraphRealisation_OwnedFilter();

		/**
		 * The meta object literal for the '<em><b>Owned Graph Maker</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_REALISATION__OWNED_GRAPH_MAKER = eINSTANCE.getGraphRealisation_OwnedGraphMaker();

		/**
		 * The meta object literal for the '<em><b>Owned Graph Update</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_REALISATION__OWNED_GRAPH_UPDATE = eINSTANCE.getGraphRealisation_OwnedGraphUpdate();

		/**
		 * The meta object literal for the '{@link l3IA_ProjetHTML.impl.ImportDataImpl <em>Import Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see l3IA_ProjetHTML.impl.ImportDataImpl
		 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getImportData()
		 * @generated
		 */
		EClass IMPORT_DATA = eINSTANCE.getImportData();

		/**
		 * The meta object literal for the '<em><b>Delimeter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_DATA__DELIMETER = eINSTANCE.getImportData_Delimeter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_DATA__NAME = eINSTANCE.getImportData_Name();

		/**
		 * The meta object literal for the '{@link l3IA_ProjetHTML.impl.FilterDataImpl <em>Filter Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see l3IA_ProjetHTML.impl.FilterDataImpl
		 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getFilterData()
		 * @generated
		 */
		EClass FILTER_DATA = eINSTANCE.getFilterData();

		/**
		 * The meta object literal for the '{@link l3IA_ProjetHTML.impl.FilterCompareImpl <em>Filter Compare</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see l3IA_ProjetHTML.impl.FilterCompareImpl
		 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getFilterCompare()
		 * @generated
		 */
		EClass FILTER_COMPARE = eINSTANCE.getFilterCompare();

		/**
		 * The meta object literal for the '{@link l3IA_ProjetHTML.impl.CompareQualiImpl <em>Compare Quali</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see l3IA_ProjetHTML.impl.CompareQualiImpl
		 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getCompareQuali()
		 * @generated
		 */
		EClass COMPARE_QUALI = eINSTANCE.getCompareQuali();

		/**
		 * The meta object literal for the '<em><b>Somethingtocompare</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARE_QUALI__SOMETHINGTOCOMPARE = eINSTANCE.getCompareQuali_Somethingtocompare();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARE_QUALI__NAME = eINSTANCE.getCompareQuali_Name();

		/**
		 * The meta object literal for the '<em><b>Comparaison</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARE_QUALI__COMPARAISON = eINSTANCE.getCompareQuali_Comparaison();

		/**
		 * The meta object literal for the '{@link l3IA_ProjetHTML.impl.CompareQuantiImpl <em>Compare Quanti</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see l3IA_ProjetHTML.impl.CompareQuantiImpl
		 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getCompareQuanti()
		 * @generated
		 */
		EClass COMPARE_QUANTI = eINSTANCE.getCompareQuanti();

		/**
		 * The meta object literal for the '<em><b>Somethingtocompare</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARE_QUANTI__SOMETHINGTOCOMPARE = eINSTANCE.getCompareQuanti_Somethingtocompare();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARE_QUANTI__NAME = eINSTANCE.getCompareQuanti_Name();

		/**
		 * The meta object literal for the '<em><b>Comparaison</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARE_QUANTI__COMPARAISON = eINSTANCE.getCompareQuanti_Comparaison();

		/**
		 * The meta object literal for the '{@link l3IA_ProjetHTML.impl.FilterNotNullImpl <em>Filter Not Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see l3IA_ProjetHTML.impl.FilterNotNullImpl
		 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getFilterNotNull()
		 * @generated
		 */
		EClass FILTER_NOT_NULL = eINSTANCE.getFilterNotNull();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_NOT_NULL__NAME = eINSTANCE.getFilterNotNull_Name();

		/**
		 * The meta object literal for the '{@link l3IA_ProjetHTML.impl.FilterGroupByImpl <em>Filter Group By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see l3IA_ProjetHTML.impl.FilterGroupByImpl
		 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getFilterGroupBy()
		 * @generated
		 */
		EClass FILTER_GROUP_BY = eINSTANCE.getFilterGroupBy();

		/**
		 * The meta object literal for the '<em><b>Name Columns X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_GROUP_BY__NAME_COLUMNS_X = eINSTANCE.getFilterGroupBy_NameColumnsX();

		/**
		 * The meta object literal for the '<em><b>Name Columns Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_GROUP_BY__NAME_COLUMNS_Y = eINSTANCE.getFilterGroupBy_NameColumnsY();

		/**
		 * The meta object literal for the '<em><b>Fonction Agregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_GROUP_BY__FONCTION_AGREGATION = eINSTANCE.getFilterGroupBy_FonctionAgregation();

		/**
		 * The meta object literal for the '{@link l3IA_ProjetHTML.impl.GraphMakerImpl <em>Graph Maker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see l3IA_ProjetHTML.impl.GraphMakerImpl
		 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getGraphMaker()
		 * @generated
		 */
		EClass GRAPH_MAKER = eINSTANCE.getGraphMaker();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_MAKER__TYPE = eINSTANCE.getGraphMaker_Type();

		/**
		 * The meta object literal for the '<em><b>Name Abscisse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_MAKER__NAME_ABSCISSE = eINSTANCE.getGraphMaker_NameAbscisse();

		/**
		 * The meta object literal for the '<em><b>Name Ordonnees</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_MAKER__NAME_ORDONNEES = eINSTANCE.getGraphMaker_NameOrdonnees();

		/**
		 * The meta object literal for the '{@link l3IA_ProjetHTML.impl.GraphUpdateImpl <em>Graph Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see l3IA_ProjetHTML.impl.GraphUpdateImpl
		 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getGraphUpdate()
		 * @generated
		 */
		EClass GRAPH_UPDATE = eINSTANCE.getGraphUpdate();

		/**
		 * The meta object literal for the '{@link l3IA_ProjetHTML.impl.UpdateCouleurGraphImpl <em>Update Couleur Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see l3IA_ProjetHTML.impl.UpdateCouleurGraphImpl
		 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getUpdateCouleurGraph()
		 * @generated
		 */
		EClass UPDATE_COULEUR_GRAPH = eINSTANCE.getUpdateCouleurGraph();

		/**
		 * The meta object literal for the '<em><b>Couleur</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_COULEUR_GRAPH__COULEUR = eINSTANCE.getUpdateCouleurGraph_Couleur();

		/**
		 * The meta object literal for the '{@link l3IA_ProjetHTML.impl.UpdateNameAxeYImpl <em>Update Name Axe Y</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see l3IA_ProjetHTML.impl.UpdateNameAxeYImpl
		 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getUpdateNameAxeY()
		 * @generated
		 */
		EClass UPDATE_NAME_AXE_Y = eINSTANCE.getUpdateNameAxeY();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_NAME_AXE_Y__NAME = eINSTANCE.getUpdateNameAxeY_Name();

		/**
		 * The meta object literal for the '{@link l3IA_ProjetHTML.impl.UpdateNameAxeXImpl <em>Update Name Axe X</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see l3IA_ProjetHTML.impl.UpdateNameAxeXImpl
		 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getUpdateNameAxeX()
		 * @generated
		 */
		EClass UPDATE_NAME_AXE_X = eINSTANCE.getUpdateNameAxeX();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_NAME_AXE_X__NAME = eINSTANCE.getUpdateNameAxeX_Name();

		/**
		 * The meta object literal for the '{@link l3IA_ProjetHTML.impl.UpdateNameLegendImpl <em>Update Name Legend</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see l3IA_ProjetHTML.impl.UpdateNameLegendImpl
		 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getUpdateNameLegend()
		 * @generated
		 */
		EClass UPDATE_NAME_LEGEND = eINSTANCE.getUpdateNameLegend();

		/**
		 * The meta object literal for the '<em><b>Oldname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_NAME_LEGEND__OLDNAME = eINSTANCE.getUpdateNameLegend_Oldname();

		/**
		 * The meta object literal for the '<em><b>Newname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_NAME_LEGEND__NEWNAME = eINSTANCE.getUpdateNameLegend_Newname();

		/**
		 * The meta object literal for the '{@link l3IA_ProjetHTML.TypeGraph <em>Type Graph</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see l3IA_ProjetHTML.TypeGraph
		 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getTypeGraph()
		 * @generated
		 */
		EEnum TYPE_GRAPH = eINSTANCE.getTypeGraph();

		/**
		 * The meta object literal for the '{@link l3IA_ProjetHTML.FonctionComparaisonQuanti <em>Fonction Comparaison Quanti</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see l3IA_ProjetHTML.FonctionComparaisonQuanti
		 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getFonctionComparaisonQuanti()
		 * @generated
		 */
		EEnum FONCTION_COMPARAISON_QUANTI = eINSTANCE.getFonctionComparaisonQuanti();

		/**
		 * The meta object literal for the '{@link l3IA_ProjetHTML.FonctionComparaisonQuali <em>Fonction Comparaison Quali</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see l3IA_ProjetHTML.FonctionComparaisonQuali
		 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getFonctionComparaisonQuali()
		 * @generated
		 */
		EEnum FONCTION_COMPARAISON_QUALI = eINSTANCE.getFonctionComparaisonQuali();

		/**
		 * The meta object literal for the '{@link l3IA_ProjetHTML.FonctionAgregation <em>Fonction Agregation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see l3IA_ProjetHTML.FonctionAgregation
		 * @see l3IA_ProjetHTML.impl.L3IA_ProjetHTMLPackageImpl#getFonctionAgregation()
		 * @generated
		 */
		EEnum FONCTION_AGREGATION = eINSTANCE.getFonctionAgregation();

	}

} //L3IA_ProjetHTMLPackage
