/**
 */
package l3IA_ProjetHTML.impl;

import l3IA_ProjetHTML.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class L3IA_ProjetHTMLFactoryImpl extends EFactoryImpl implements L3IA_ProjetHTMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static L3IA_ProjetHTMLFactory init() {
		try {
			L3IA_ProjetHTMLFactory theL3IA_ProjetHTMLFactory = (L3IA_ProjetHTMLFactory) EPackage.Registry.INSTANCE
					.getEFactory(L3IA_ProjetHTMLPackage.eNS_URI);
			if (theL3IA_ProjetHTMLFactory != null) {
				return theL3IA_ProjetHTMLFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new L3IA_ProjetHTMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public L3IA_ProjetHTMLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case L3IA_ProjetHTMLPackage.DASHBOARD:
			return createDashboard();
		case L3IA_ProjetHTMLPackage.GRAPH_REALISATION:
			return createGraphRealisation();
		case L3IA_ProjetHTMLPackage.IMPORT_DATA:
			return createImportData();
		case L3IA_ProjetHTMLPackage.FILTER_DATA:
			return createFilterData();
		case L3IA_ProjetHTMLPackage.FILTER_COMPARE:
			return createFilterCompare();
		case L3IA_ProjetHTMLPackage.COMPARE_QUALI:
			return createCompareQuali();
		case L3IA_ProjetHTMLPackage.COMPARE_QUANTI:
			return createCompareQuanti();
		case L3IA_ProjetHTMLPackage.FILTER_NOT_NULL:
			return createFilterNotNull();
		case L3IA_ProjetHTMLPackage.FILTER_GROUP_BY:
			return createFilterGroupBy();
		case L3IA_ProjetHTMLPackage.GRAPH_MAKER:
			return createGraphMaker();
		case L3IA_ProjetHTMLPackage.GRAPH_UPDATE:
			return createGraphUpdate();
		case L3IA_ProjetHTMLPackage.UPDATE_COULEUR_GRAPH:
			return createUpdateCouleurGraph();
		case L3IA_ProjetHTMLPackage.UPDATE_NAME_AXE_Y:
			return createUpdateNameAxeY();
		case L3IA_ProjetHTMLPackage.UPDATE_NAME_AXE_X:
			return createUpdateNameAxeX();
		case L3IA_ProjetHTMLPackage.UPDATE_NAME_LEGEND:
			return createUpdateNameLegend();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case L3IA_ProjetHTMLPackage.TYPE_GRAPH:
			return createTypeGraphFromString(eDataType, initialValue);
		case L3IA_ProjetHTMLPackage.FONCTION_COMPARAISON_QUANTI:
			return createFonctionComparaisonQuantiFromString(eDataType, initialValue);
		case L3IA_ProjetHTMLPackage.FONCTION_COMPARAISON_QUALI:
			return createFonctionComparaisonQualiFromString(eDataType, initialValue);
		case L3IA_ProjetHTMLPackage.FONCTION_AGREGATION:
			return createFonctionAgregationFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case L3IA_ProjetHTMLPackage.TYPE_GRAPH:
			return convertTypeGraphToString(eDataType, instanceValue);
		case L3IA_ProjetHTMLPackage.FONCTION_COMPARAISON_QUANTI:
			return convertFonctionComparaisonQuantiToString(eDataType, instanceValue);
		case L3IA_ProjetHTMLPackage.FONCTION_COMPARAISON_QUALI:
			return convertFonctionComparaisonQualiToString(eDataType, instanceValue);
		case L3IA_ProjetHTMLPackage.FONCTION_AGREGATION:
			return convertFonctionAgregationToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dashboard createDashboard() {
		DashboardImpl dashboard = new DashboardImpl();
		return dashboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphRealisation createGraphRealisation() {
		GraphRealisationImpl graphRealisation = new GraphRealisationImpl();
		return graphRealisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportData createImportData() {
		ImportDataImpl importData = new ImportDataImpl();
		return importData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterData createFilterData() {
		FilterDataImpl filterData = new FilterDataImpl();
		return filterData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterCompare createFilterCompare() {
		FilterCompareImpl filterCompare = new FilterCompareImpl();
		return filterCompare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompareQuali createCompareQuali() {
		CompareQualiImpl compareQuali = new CompareQualiImpl();
		return compareQuali;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompareQuanti createCompareQuanti() {
		CompareQuantiImpl compareQuanti = new CompareQuantiImpl();
		return compareQuanti;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterNotNull createFilterNotNull() {
		FilterNotNullImpl filterNotNull = new FilterNotNullImpl();
		return filterNotNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterGroupBy createFilterGroupBy() {
		FilterGroupByImpl filterGroupBy = new FilterGroupByImpl();
		return filterGroupBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphMaker createGraphMaker() {
		GraphMakerImpl graphMaker = new GraphMakerImpl();
		return graphMaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphUpdate createGraphUpdate() {
		GraphUpdateImpl graphUpdate = new GraphUpdateImpl();
		return graphUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateCouleurGraph createUpdateCouleurGraph() {
		UpdateCouleurGraphImpl updateCouleurGraph = new UpdateCouleurGraphImpl();
		return updateCouleurGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateNameAxeY createUpdateNameAxeY() {
		UpdateNameAxeYImpl updateNameAxeY = new UpdateNameAxeYImpl();
		return updateNameAxeY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateNameAxeX createUpdateNameAxeX() {
		UpdateNameAxeXImpl updateNameAxeX = new UpdateNameAxeXImpl();
		return updateNameAxeX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateNameLegend createUpdateNameLegend() {
		UpdateNameLegendImpl updateNameLegend = new UpdateNameLegendImpl();
		return updateNameLegend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGraph createTypeGraphFromString(EDataType eDataType, String initialValue) {
		TypeGraph result = TypeGraph.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeGraphToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FonctionComparaisonQuanti createFonctionComparaisonQuantiFromString(EDataType eDataType,
			String initialValue) {
		FonctionComparaisonQuanti result = FonctionComparaisonQuanti.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFonctionComparaisonQuantiToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FonctionComparaisonQuali createFonctionComparaisonQualiFromString(EDataType eDataType, String initialValue) {
		FonctionComparaisonQuali result = FonctionComparaisonQuali.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFonctionComparaisonQualiToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FonctionAgregation createFonctionAgregationFromString(EDataType eDataType, String initialValue) {
		FonctionAgregation result = FonctionAgregation.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFonctionAgregationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public L3IA_ProjetHTMLPackage getL3IA_ProjetHTMLPackage() {
		return (L3IA_ProjetHTMLPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static L3IA_ProjetHTMLPackage getPackage() {
		return L3IA_ProjetHTMLPackage.eINSTANCE;
	}

} //L3IA_ProjetHTMLFactoryImpl
