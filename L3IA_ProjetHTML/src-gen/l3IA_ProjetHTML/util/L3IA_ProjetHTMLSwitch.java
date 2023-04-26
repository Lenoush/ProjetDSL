/**
 */
package l3IA_ProjetHTML.util;

import l3IA_ProjetHTML.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage
 * @generated
 */
public class L3IA_ProjetHTMLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static L3IA_ProjetHTMLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public L3IA_ProjetHTMLSwitch() {
		if (modelPackage == null) {
			modelPackage = L3IA_ProjetHTMLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case L3IA_ProjetHTMLPackage.DASHBOARD: {
			Dashboard dashboard = (Dashboard) theEObject;
			T result = caseDashboard(dashboard);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case L3IA_ProjetHTMLPackage.GRAPH_REALISATION: {
			GraphRealisation graphRealisation = (GraphRealisation) theEObject;
			T result = caseGraphRealisation(graphRealisation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case L3IA_ProjetHTMLPackage.IMPORT_DATA: {
			ImportData importData = (ImportData) theEObject;
			T result = caseImportData(importData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case L3IA_ProjetHTMLPackage.FILTER_DATA: {
			FilterData filterData = (FilterData) theEObject;
			T result = caseFilterData(filterData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case L3IA_ProjetHTMLPackage.FILTER_COMPARE: {
			FilterCompare filterCompare = (FilterCompare) theEObject;
			T result = caseFilterCompare(filterCompare);
			if (result == null)
				result = caseFilterData(filterCompare);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case L3IA_ProjetHTMLPackage.COMPARE_QUALI: {
			CompareQuali compareQuali = (CompareQuali) theEObject;
			T result = caseCompareQuali(compareQuali);
			if (result == null)
				result = caseFilterCompare(compareQuali);
			if (result == null)
				result = caseFilterData(compareQuali);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case L3IA_ProjetHTMLPackage.COMPARE_QUANTI: {
			CompareQuanti compareQuanti = (CompareQuanti) theEObject;
			T result = caseCompareQuanti(compareQuanti);
			if (result == null)
				result = caseFilterCompare(compareQuanti);
			if (result == null)
				result = caseFilterData(compareQuanti);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case L3IA_ProjetHTMLPackage.FILTER_NOT_NULL: {
			FilterNotNull filterNotNull = (FilterNotNull) theEObject;
			T result = caseFilterNotNull(filterNotNull);
			if (result == null)
				result = caseFilterData(filterNotNull);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case L3IA_ProjetHTMLPackage.FILTER_GROUP_BY: {
			FilterGroupBy filterGroupBy = (FilterGroupBy) theEObject;
			T result = caseFilterGroupBy(filterGroupBy);
			if (result == null)
				result = caseFilterData(filterGroupBy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case L3IA_ProjetHTMLPackage.GRAPH_MAKER: {
			GraphMaker graphMaker = (GraphMaker) theEObject;
			T result = caseGraphMaker(graphMaker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case L3IA_ProjetHTMLPackage.GRAPH_UPDATE: {
			GraphUpdate graphUpdate = (GraphUpdate) theEObject;
			T result = caseGraphUpdate(graphUpdate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case L3IA_ProjetHTMLPackage.UPDATE_COULEUR_GRAPH: {
			UpdateCouleurGraph updateCouleurGraph = (UpdateCouleurGraph) theEObject;
			T result = caseUpdateCouleurGraph(updateCouleurGraph);
			if (result == null)
				result = caseGraphUpdate(updateCouleurGraph);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case L3IA_ProjetHTMLPackage.UPDATE_NAME_AXE_Y: {
			UpdateNameAxeY updateNameAxeY = (UpdateNameAxeY) theEObject;
			T result = caseUpdateNameAxeY(updateNameAxeY);
			if (result == null)
				result = caseGraphUpdate(updateNameAxeY);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case L3IA_ProjetHTMLPackage.UPDATE_NAME_AXE_X: {
			UpdateNameAxeX updateNameAxeX = (UpdateNameAxeX) theEObject;
			T result = caseUpdateNameAxeX(updateNameAxeX);
			if (result == null)
				result = caseGraphUpdate(updateNameAxeX);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case L3IA_ProjetHTMLPackage.UPDATE_NAME_LEGEND: {
			UpdateNameLegend updateNameLegend = (UpdateNameLegend) theEObject;
			T result = caseUpdateNameLegend(updateNameLegend);
			if (result == null)
				result = caseGraphUpdate(updateNameLegend);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dashboard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dashboard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDashboard(Dashboard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Realisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Realisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphRealisation(GraphRealisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportData(ImportData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterData(FilterData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Compare</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Compare</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterCompare(FilterCompare object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compare Quali</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compare Quali</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompareQuali(CompareQuali object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compare Quanti</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compare Quanti</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompareQuanti(CompareQuanti object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Not Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Not Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterNotNull(FilterNotNull object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Group By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Group By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterGroupBy(FilterGroupBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Maker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Maker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphMaker(GraphMaker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphUpdate(GraphUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Couleur Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Couleur Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateCouleurGraph(UpdateCouleurGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Name Axe Y</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Name Axe Y</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateNameAxeY(UpdateNameAxeY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Name Axe X</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Name Axe X</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateNameAxeX(UpdateNameAxeX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Name Legend</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Name Legend</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateNameLegend(UpdateNameLegend object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //L3IA_ProjetHTMLSwitch
