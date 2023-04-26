/**
 */
package l3IA_ProjetHTML.util;

import l3IA_ProjetHTML.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage
 * @generated
 */
public class L3IA_ProjetHTMLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static L3IA_ProjetHTMLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public L3IA_ProjetHTMLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = L3IA_ProjetHTMLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected L3IA_ProjetHTMLSwitch<Adapter> modelSwitch = new L3IA_ProjetHTMLSwitch<Adapter>() {
		@Override
		public Adapter caseDashboard(Dashboard object) {
			return createDashboardAdapter();
		}

		@Override
		public Adapter caseGraphRealisation(GraphRealisation object) {
			return createGraphRealisationAdapter();
		}

		@Override
		public Adapter caseImportData(ImportData object) {
			return createImportDataAdapter();
		}

		@Override
		public Adapter caseFilterData(FilterData object) {
			return createFilterDataAdapter();
		}

		@Override
		public Adapter caseFilterCompare(FilterCompare object) {
			return createFilterCompareAdapter();
		}

		@Override
		public Adapter caseCompareQuali(CompareQuali object) {
			return createCompareQualiAdapter();
		}

		@Override
		public Adapter caseCompareQuanti(CompareQuanti object) {
			return createCompareQuantiAdapter();
		}

		@Override
		public Adapter caseFilterNotNull(FilterNotNull object) {
			return createFilterNotNullAdapter();
		}

		@Override
		public Adapter caseFilterGroupBy(FilterGroupBy object) {
			return createFilterGroupByAdapter();
		}

		@Override
		public Adapter caseGraphMaker(GraphMaker object) {
			return createGraphMakerAdapter();
		}

		@Override
		public Adapter caseGraphUpdate(GraphUpdate object) {
			return createGraphUpdateAdapter();
		}

		@Override
		public Adapter caseUpdateCouleurGraph(UpdateCouleurGraph object) {
			return createUpdateCouleurGraphAdapter();
		}

		@Override
		public Adapter caseUpdateNameAxeY(UpdateNameAxeY object) {
			return createUpdateNameAxeYAdapter();
		}

		@Override
		public Adapter caseUpdateNameAxeX(UpdateNameAxeX object) {
			return createUpdateNameAxeXAdapter();
		}

		@Override
		public Adapter caseUpdateNameLegend(UpdateNameLegend object) {
			return createUpdateNameLegendAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link l3IA_ProjetHTML.Dashboard <em>Dashboard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see l3IA_ProjetHTML.Dashboard
	 * @generated
	 */
	public Adapter createDashboardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link l3IA_ProjetHTML.GraphRealisation <em>Graph Realisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see l3IA_ProjetHTML.GraphRealisation
	 * @generated
	 */
	public Adapter createGraphRealisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link l3IA_ProjetHTML.ImportData <em>Import Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see l3IA_ProjetHTML.ImportData
	 * @generated
	 */
	public Adapter createImportDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link l3IA_ProjetHTML.FilterData <em>Filter Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see l3IA_ProjetHTML.FilterData
	 * @generated
	 */
	public Adapter createFilterDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link l3IA_ProjetHTML.FilterCompare <em>Filter Compare</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see l3IA_ProjetHTML.FilterCompare
	 * @generated
	 */
	public Adapter createFilterCompareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link l3IA_ProjetHTML.CompareQuali <em>Compare Quali</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see l3IA_ProjetHTML.CompareQuali
	 * @generated
	 */
	public Adapter createCompareQualiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link l3IA_ProjetHTML.CompareQuanti <em>Compare Quanti</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see l3IA_ProjetHTML.CompareQuanti
	 * @generated
	 */
	public Adapter createCompareQuantiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link l3IA_ProjetHTML.FilterNotNull <em>Filter Not Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see l3IA_ProjetHTML.FilterNotNull
	 * @generated
	 */
	public Adapter createFilterNotNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link l3IA_ProjetHTML.FilterGroupBy <em>Filter Group By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see l3IA_ProjetHTML.FilterGroupBy
	 * @generated
	 */
	public Adapter createFilterGroupByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link l3IA_ProjetHTML.GraphMaker <em>Graph Maker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see l3IA_ProjetHTML.GraphMaker
	 * @generated
	 */
	public Adapter createGraphMakerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link l3IA_ProjetHTML.GraphUpdate <em>Graph Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see l3IA_ProjetHTML.GraphUpdate
	 * @generated
	 */
	public Adapter createGraphUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link l3IA_ProjetHTML.UpdateCouleurGraph <em>Update Couleur Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see l3IA_ProjetHTML.UpdateCouleurGraph
	 * @generated
	 */
	public Adapter createUpdateCouleurGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link l3IA_ProjetHTML.UpdateNameAxeY <em>Update Name Axe Y</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see l3IA_ProjetHTML.UpdateNameAxeY
	 * @generated
	 */
	public Adapter createUpdateNameAxeYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link l3IA_ProjetHTML.UpdateNameAxeX <em>Update Name Axe X</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see l3IA_ProjetHTML.UpdateNameAxeX
	 * @generated
	 */
	public Adapter createUpdateNameAxeXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link l3IA_ProjetHTML.UpdateNameLegend <em>Update Name Legend</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see l3IA_ProjetHTML.UpdateNameLegend
	 * @generated
	 */
	public Adapter createUpdateNameLegendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //L3IA_ProjetHTMLAdapterFactory
