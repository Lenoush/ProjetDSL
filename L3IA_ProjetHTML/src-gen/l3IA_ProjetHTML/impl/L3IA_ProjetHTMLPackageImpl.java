/**
 */
package l3IA_ProjetHTML.impl;

import l3IA_ProjetHTML.CompareQuali;
import l3IA_ProjetHTML.CompareQuanti;
import l3IA_ProjetHTML.Dashboard;
import l3IA_ProjetHTML.FilterCompare;
import l3IA_ProjetHTML.FilterData;
import l3IA_ProjetHTML.FilterGroupBy;
import l3IA_ProjetHTML.FilterNotNull;
import l3IA_ProjetHTML.FonctionAgregation;
import l3IA_ProjetHTML.FonctionComparaisonQuali;
import l3IA_ProjetHTML.FonctionComparaisonQuanti;
import l3IA_ProjetHTML.GraphMaker;
import l3IA_ProjetHTML.GraphRealisation;
import l3IA_ProjetHTML.GraphUpdate;
import l3IA_ProjetHTML.ImportData;
import l3IA_ProjetHTML.L3IA_ProjetHTMLFactory;
import l3IA_ProjetHTML.L3IA_ProjetHTMLPackage;
import l3IA_ProjetHTML.TypeGraph;

import l3IA_ProjetHTML.UpdateCouleurGraph;
import l3IA_ProjetHTML.UpdateNameAxeX;
import l3IA_ProjetHTML.UpdateNameAxeY;
import l3IA_ProjetHTML.UpdateNameLegend;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class L3IA_ProjetHTMLPackageImpl extends EPackageImpl implements L3IA_ProjetHTMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dashboardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphRealisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterCompareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compareQualiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compareQuantiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterNotNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterGroupByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphMakerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateCouleurGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateNameAxeYEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateNameAxeXEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateNameLegendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeGraphEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fonctionComparaisonQuantiEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fonctionComparaisonQualiEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fonctionAgregationEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private L3IA_ProjetHTMLPackageImpl() {
		super(eNS_URI, L3IA_ProjetHTMLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link L3IA_ProjetHTMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static L3IA_ProjetHTMLPackage init() {
		if (isInited)
			return (L3IA_ProjetHTMLPackage) EPackage.Registry.INSTANCE.getEPackage(L3IA_ProjetHTMLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredL3IA_ProjetHTMLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		L3IA_ProjetHTMLPackageImpl theL3IA_ProjetHTMLPackage = registeredL3IA_ProjetHTMLPackage instanceof L3IA_ProjetHTMLPackageImpl
				? (L3IA_ProjetHTMLPackageImpl) registeredL3IA_ProjetHTMLPackage
				: new L3IA_ProjetHTMLPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theL3IA_ProjetHTMLPackage.createPackageContents();

		// Initialize created meta-data
		theL3IA_ProjetHTMLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theL3IA_ProjetHTMLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(L3IA_ProjetHTMLPackage.eNS_URI, theL3IA_ProjetHTMLPackage);
		return theL3IA_ProjetHTMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDashboard() {
		return dashboardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDashboard_OwnedGraphRealisation() {
		return (EReference) dashboardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDashboard_Name() {
		return (EAttribute) dashboardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphRealisation() {
		return graphRealisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphRealisation_OwnedImport() {
		return (EReference) graphRealisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphRealisation_OwnedFilter() {
		return (EReference) graphRealisationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphRealisation_OwnedGraphMaker() {
		return (EReference) graphRealisationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphRealisation_OwnedGraphUpdate() {
		return (EReference) graphRealisationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportData() {
		return importDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportData_Delimeter() {
		return (EAttribute) importDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportData_Name() {
		return (EAttribute) importDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterData() {
		return filterDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterCompare() {
		return filterCompareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompareQuali() {
		return compareQualiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompareQuali_Somethingtocompare() {
		return (EAttribute) compareQualiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompareQuali_Name() {
		return (EAttribute) compareQualiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompareQuali_Comparaison() {
		return (EAttribute) compareQualiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompareQuanti() {
		return compareQuantiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompareQuanti_Somethingtocompare() {
		return (EAttribute) compareQuantiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompareQuanti_Name() {
		return (EAttribute) compareQuantiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompareQuanti_Comparaison() {
		return (EAttribute) compareQuantiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterNotNull() {
		return filterNotNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterNotNull_Name() {
		return (EAttribute) filterNotNullEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterGroupBy() {
		return filterGroupByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterGroupBy_NameColumnsX() {
		return (EAttribute) filterGroupByEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterGroupBy_NameColumnsY() {
		return (EAttribute) filterGroupByEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterGroupBy_FonctionAgregation() {
		return (EAttribute) filterGroupByEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphMaker() {
		return graphMakerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphMaker_Type() {
		return (EAttribute) graphMakerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphMaker_NameAbscisse() {
		return (EAttribute) graphMakerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphMaker_NameOrdonnees() {
		return (EAttribute) graphMakerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphUpdate() {
		return graphUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateCouleurGraph() {
		return updateCouleurGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateCouleurGraph_Couleur() {
		return (EAttribute) updateCouleurGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateNameAxeY() {
		return updateNameAxeYEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateNameAxeY_Name() {
		return (EAttribute) updateNameAxeYEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateNameAxeX() {
		return updateNameAxeXEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateNameAxeX_Name() {
		return (EAttribute) updateNameAxeXEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateNameLegend() {
		return updateNameLegendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateNameLegend_Oldname() {
		return (EAttribute) updateNameLegendEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateNameLegend_Newname() {
		return (EAttribute) updateNameLegendEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeGraph() {
		return typeGraphEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFonctionComparaisonQuanti() {
		return fonctionComparaisonQuantiEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFonctionComparaisonQuali() {
		return fonctionComparaisonQualiEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFonctionAgregation() {
		return fonctionAgregationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public L3IA_ProjetHTMLFactory getL3IA_ProjetHTMLFactory() {
		return (L3IA_ProjetHTMLFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		dashboardEClass = createEClass(DASHBOARD);
		createEReference(dashboardEClass, DASHBOARD__OWNED_GRAPH_REALISATION);
		createEAttribute(dashboardEClass, DASHBOARD__NAME);

		graphRealisationEClass = createEClass(GRAPH_REALISATION);
		createEReference(graphRealisationEClass, GRAPH_REALISATION__OWNED_IMPORT);
		createEReference(graphRealisationEClass, GRAPH_REALISATION__OWNED_FILTER);
		createEReference(graphRealisationEClass, GRAPH_REALISATION__OWNED_GRAPH_MAKER);
		createEReference(graphRealisationEClass, GRAPH_REALISATION__OWNED_GRAPH_UPDATE);

		importDataEClass = createEClass(IMPORT_DATA);
		createEAttribute(importDataEClass, IMPORT_DATA__DELIMETER);
		createEAttribute(importDataEClass, IMPORT_DATA__NAME);

		filterDataEClass = createEClass(FILTER_DATA);

		filterCompareEClass = createEClass(FILTER_COMPARE);

		compareQualiEClass = createEClass(COMPARE_QUALI);
		createEAttribute(compareQualiEClass, COMPARE_QUALI__SOMETHINGTOCOMPARE);
		createEAttribute(compareQualiEClass, COMPARE_QUALI__NAME);
		createEAttribute(compareQualiEClass, COMPARE_QUALI__COMPARAISON);

		compareQuantiEClass = createEClass(COMPARE_QUANTI);
		createEAttribute(compareQuantiEClass, COMPARE_QUANTI__SOMETHINGTOCOMPARE);
		createEAttribute(compareQuantiEClass, COMPARE_QUANTI__NAME);
		createEAttribute(compareQuantiEClass, COMPARE_QUANTI__COMPARAISON);

		filterNotNullEClass = createEClass(FILTER_NOT_NULL);
		createEAttribute(filterNotNullEClass, FILTER_NOT_NULL__NAME);

		filterGroupByEClass = createEClass(FILTER_GROUP_BY);
		createEAttribute(filterGroupByEClass, FILTER_GROUP_BY__NAME_COLUMNS_X);
		createEAttribute(filterGroupByEClass, FILTER_GROUP_BY__NAME_COLUMNS_Y);
		createEAttribute(filterGroupByEClass, FILTER_GROUP_BY__FONCTION_AGREGATION);

		graphMakerEClass = createEClass(GRAPH_MAKER);
		createEAttribute(graphMakerEClass, GRAPH_MAKER__TYPE);
		createEAttribute(graphMakerEClass, GRAPH_MAKER__NAME_ABSCISSE);
		createEAttribute(graphMakerEClass, GRAPH_MAKER__NAME_ORDONNEES);

		graphUpdateEClass = createEClass(GRAPH_UPDATE);

		updateCouleurGraphEClass = createEClass(UPDATE_COULEUR_GRAPH);
		createEAttribute(updateCouleurGraphEClass, UPDATE_COULEUR_GRAPH__COULEUR);

		updateNameAxeYEClass = createEClass(UPDATE_NAME_AXE_Y);
		createEAttribute(updateNameAxeYEClass, UPDATE_NAME_AXE_Y__NAME);

		updateNameAxeXEClass = createEClass(UPDATE_NAME_AXE_X);
		createEAttribute(updateNameAxeXEClass, UPDATE_NAME_AXE_X__NAME);

		updateNameLegendEClass = createEClass(UPDATE_NAME_LEGEND);
		createEAttribute(updateNameLegendEClass, UPDATE_NAME_LEGEND__OLDNAME);
		createEAttribute(updateNameLegendEClass, UPDATE_NAME_LEGEND__NEWNAME);

		// Create enums
		typeGraphEEnum = createEEnum(TYPE_GRAPH);
		fonctionComparaisonQuantiEEnum = createEEnum(FONCTION_COMPARAISON_QUANTI);
		fonctionComparaisonQualiEEnum = createEEnum(FONCTION_COMPARAISON_QUALI);
		fonctionAgregationEEnum = createEEnum(FONCTION_AGREGATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		filterCompareEClass.getESuperTypes().add(this.getFilterData());
		compareQualiEClass.getESuperTypes().add(this.getFilterCompare());
		compareQuantiEClass.getESuperTypes().add(this.getFilterCompare());
		filterNotNullEClass.getESuperTypes().add(this.getFilterData());
		filterGroupByEClass.getESuperTypes().add(this.getFilterData());
		updateCouleurGraphEClass.getESuperTypes().add(this.getGraphUpdate());
		updateNameAxeYEClass.getESuperTypes().add(this.getGraphUpdate());
		updateNameAxeXEClass.getESuperTypes().add(this.getGraphUpdate());
		updateNameLegendEClass.getESuperTypes().add(this.getGraphUpdate());

		// Initialize classes, features, and operations; add parameters
		initEClass(dashboardEClass, Dashboard.class, "Dashboard", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDashboard_OwnedGraphRealisation(), this.getGraphRealisation(), null, "ownedGraphRealisation",
				null, 1, 4, Dashboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDashboard_Name(), ecorePackage.getEString(), "name", null, 1, 1, Dashboard.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphRealisationEClass, GraphRealisation.class, "GraphRealisation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphRealisation_OwnedImport(), this.getImportData(), null, "ownedImport", null, 1, 1,
				GraphRealisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphRealisation_OwnedFilter(), this.getFilterData(), null, "ownedFilter", null, 0, -1,
				GraphRealisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphRealisation_OwnedGraphMaker(), this.getGraphMaker(), null, "ownedGraphMaker", null, 1, 1,
				GraphRealisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphRealisation_OwnedGraphUpdate(), this.getGraphUpdate(), null, "ownedGraphUpdate", null, 0,
				-1, GraphRealisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importDataEClass, ImportData.class, "ImportData", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImportData_Delimeter(), ecorePackage.getEString(), "delimeter", null, 1, 1, ImportData.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getImportData_Name(), ecorePackage.getEString(), "name", null, 1, 1, ImportData.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(filterDataEClass, FilterData.class, "FilterData", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(filterCompareEClass, FilterCompare.class, "FilterCompare", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(compareQualiEClass, CompareQuali.class, "CompareQuali", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompareQuali_Somethingtocompare(), ecorePackage.getEString(), "somethingtocompare", null, 1,
				1, CompareQuali.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompareQuali_Name(), ecorePackage.getEString(), "name", null, 1, 1, CompareQuali.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompareQuali_Comparaison(), this.getFonctionComparaisonQuali(), "comparaison", null, 1, 1,
				CompareQuali.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(compareQuantiEClass, CompareQuanti.class, "CompareQuanti", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompareQuanti_Somethingtocompare(), ecorePackage.getEString(), "somethingtocompare", null, 1,
				1, CompareQuanti.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompareQuanti_Name(), ecorePackage.getEString(), "name", null, 1, 1, CompareQuanti.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompareQuanti_Comparaison(), this.getFonctionComparaisonQuanti(), "comparaison", null, 1, 1,
				CompareQuanti.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(filterNotNullEClass, FilterNotNull.class, "FilterNotNull", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilterNotNull_Name(), ecorePackage.getEString(), "name", null, 1, 1, FilterNotNull.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterGroupByEClass, FilterGroupBy.class, "FilterGroupBy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilterGroupBy_NameColumnsX(), ecorePackage.getEString(), "nameColumnsX", null, 1, 1,
				FilterGroupBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilterGroupBy_NameColumnsY(), ecorePackage.getEString(), "nameColumnsY", null, 1, 1,
				FilterGroupBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilterGroupBy_FonctionAgregation(), this.getFonctionAgregation(), "fonctionAgregation", null,
				1, 1, FilterGroupBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphMakerEClass, GraphMaker.class, "GraphMaker", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphMaker_Type(), this.getTypeGraph(), "type", null, 1, 1, GraphMaker.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphMaker_NameAbscisse(), ecorePackage.getEString(), "nameAbscisse", null, 1, 1,
				GraphMaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphMaker_NameOrdonnees(), ecorePackage.getEString(), "nameOrdonnees", null, 1, -1,
				GraphMaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(graphUpdateEClass, GraphUpdate.class, "GraphUpdate", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(updateCouleurGraphEClass, UpdateCouleurGraph.class, "UpdateCouleurGraph", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateCouleurGraph_Couleur(), ecorePackage.getEString(), "couleur", null, 1, -1,
				UpdateCouleurGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(updateNameAxeYEClass, UpdateNameAxeY.class, "UpdateNameAxeY", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateNameAxeY_Name(), ecorePackage.getEString(), "name", null, 1, 1, UpdateNameAxeY.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateNameAxeXEClass, UpdateNameAxeX.class, "UpdateNameAxeX", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateNameAxeX_Name(), ecorePackage.getEString(), "name", null, 1, 1, UpdateNameAxeX.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateNameLegendEClass, UpdateNameLegend.class, "UpdateNameLegend", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateNameLegend_Oldname(), ecorePackage.getEString(), "oldname", null, 1, 1,
				UpdateNameLegend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateNameLegend_Newname(), ecorePackage.getEString(), "newname", null, 1, 1,
				UpdateNameLegend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeGraphEEnum, TypeGraph.class, "TypeGraph");
		addEEnumLiteral(typeGraphEEnum, TypeGraph.BAR);
		addEEnumLiteral(typeGraphEEnum, TypeGraph.SCATTER);
		addEEnumLiteral(typeGraphEEnum, TypeGraph.BOX);

		initEEnum(fonctionComparaisonQuantiEEnum, FonctionComparaisonQuanti.class, "FonctionComparaisonQuanti");
		addEEnumLiteral(fonctionComparaisonQuantiEEnum, FonctionComparaisonQuanti.INF);
		addEEnumLiteral(fonctionComparaisonQuantiEEnum, FonctionComparaisonQuanti.SUP);
		addEEnumLiteral(fonctionComparaisonQuantiEEnum, FonctionComparaisonQuanti.EGAL);
		addEEnumLiteral(fonctionComparaisonQuantiEEnum, FonctionComparaisonQuanti.DIFFERENT);
		addEEnumLiteral(fonctionComparaisonQuantiEEnum, FonctionComparaisonQuanti.INFEGAL);
		addEEnumLiteral(fonctionComparaisonQuantiEEnum, FonctionComparaisonQuanti.SUPEGAL);

		initEEnum(fonctionComparaisonQualiEEnum, FonctionComparaisonQuali.class, "FonctionComparaisonQuali");
		addEEnumLiteral(fonctionComparaisonQualiEEnum, FonctionComparaisonQuali.EGAL);
		addEEnumLiteral(fonctionComparaisonQualiEEnum, FonctionComparaisonQuali.DIFFERENT);

		initEEnum(fonctionAgregationEEnum, FonctionAgregation.class, "FonctionAgregation");
		addEEnumLiteral(fonctionAgregationEEnum, FonctionAgregation.MEDIAN);
		addEEnumLiteral(fonctionAgregationEEnum, FonctionAgregation.SUM);
		addEEnumLiteral(fonctionAgregationEEnum, FonctionAgregation.MEAN);
		addEEnumLiteral(fonctionAgregationEEnum, FonctionAgregation.MIN);
		addEEnumLiteral(fonctionAgregationEEnum, FonctionAgregation.MAX);
		addEEnumLiteral(fonctionAgregationEEnum, FonctionAgregation.COUNT);
		addEEnumLiteral(fonctionAgregationEEnum, FonctionAgregation.STD);
		addEEnumLiteral(fonctionAgregationEEnum, FonctionAgregation.VAR);

		// Create resource
		createResource(eNS_URI);
	}

} //L3IA_ProjetHTMLPackageImpl
