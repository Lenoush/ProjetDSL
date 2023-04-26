/**
 */
package l3IA_ProjetHTML.provider;

import java.util.ArrayList;
import java.util.Collection;

import l3IA_ProjetHTML.util.L3IA_ProjetHTMLAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class L3IA_ProjetHTMLItemProviderAdapterFactory extends L3IA_ProjetHTMLAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public L3IA_ProjetHTMLItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link l3IA_ProjetHTML.Dashboard} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DashboardItemProvider dashboardItemProvider;

	/**
	 * This creates an adapter for a {@link l3IA_ProjetHTML.Dashboard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDashboardAdapter() {
		if (dashboardItemProvider == null) {
			dashboardItemProvider = new DashboardItemProvider(this);
		}

		return dashboardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link l3IA_ProjetHTML.GraphRealisation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphRealisationItemProvider graphRealisationItemProvider;

	/**
	 * This creates an adapter for a {@link l3IA_ProjetHTML.GraphRealisation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGraphRealisationAdapter() {
		if (graphRealisationItemProvider == null) {
			graphRealisationItemProvider = new GraphRealisationItemProvider(this);
		}

		return graphRealisationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link l3IA_ProjetHTML.ImportData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportDataItemProvider importDataItemProvider;

	/**
	 * This creates an adapter for a {@link l3IA_ProjetHTML.ImportData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImportDataAdapter() {
		if (importDataItemProvider == null) {
			importDataItemProvider = new ImportDataItemProvider(this);
		}

		return importDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link l3IA_ProjetHTML.FilterData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterDataItemProvider filterDataItemProvider;

	/**
	 * This creates an adapter for a {@link l3IA_ProjetHTML.FilterData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFilterDataAdapter() {
		if (filterDataItemProvider == null) {
			filterDataItemProvider = new FilterDataItemProvider(this);
		}

		return filterDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link l3IA_ProjetHTML.FilterCompare} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterCompareItemProvider filterCompareItemProvider;

	/**
	 * This creates an adapter for a {@link l3IA_ProjetHTML.FilterCompare}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFilterCompareAdapter() {
		if (filterCompareItemProvider == null) {
			filterCompareItemProvider = new FilterCompareItemProvider(this);
		}

		return filterCompareItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link l3IA_ProjetHTML.CompareQuali} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompareQualiItemProvider compareQualiItemProvider;

	/**
	 * This creates an adapter for a {@link l3IA_ProjetHTML.CompareQuali}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompareQualiAdapter() {
		if (compareQualiItemProvider == null) {
			compareQualiItemProvider = new CompareQualiItemProvider(this);
		}

		return compareQualiItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link l3IA_ProjetHTML.CompareQuanti} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompareQuantiItemProvider compareQuantiItemProvider;

	/**
	 * This creates an adapter for a {@link l3IA_ProjetHTML.CompareQuanti}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompareQuantiAdapter() {
		if (compareQuantiItemProvider == null) {
			compareQuantiItemProvider = new CompareQuantiItemProvider(this);
		}

		return compareQuantiItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link l3IA_ProjetHTML.FilterNotNull} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterNotNullItemProvider filterNotNullItemProvider;

	/**
	 * This creates an adapter for a {@link l3IA_ProjetHTML.FilterNotNull}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFilterNotNullAdapter() {
		if (filterNotNullItemProvider == null) {
			filterNotNullItemProvider = new FilterNotNullItemProvider(this);
		}

		return filterNotNullItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link l3IA_ProjetHTML.FilterGroupBy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterGroupByItemProvider filterGroupByItemProvider;

	/**
	 * This creates an adapter for a {@link l3IA_ProjetHTML.FilterGroupBy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFilterGroupByAdapter() {
		if (filterGroupByItemProvider == null) {
			filterGroupByItemProvider = new FilterGroupByItemProvider(this);
		}

		return filterGroupByItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link l3IA_ProjetHTML.GraphMaker} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphMakerItemProvider graphMakerItemProvider;

	/**
	 * This creates an adapter for a {@link l3IA_ProjetHTML.GraphMaker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGraphMakerAdapter() {
		if (graphMakerItemProvider == null) {
			graphMakerItemProvider = new GraphMakerItemProvider(this);
		}

		return graphMakerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link l3IA_ProjetHTML.GraphUpdate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphUpdateItemProvider graphUpdateItemProvider;

	/**
	 * This creates an adapter for a {@link l3IA_ProjetHTML.GraphUpdate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGraphUpdateAdapter() {
		if (graphUpdateItemProvider == null) {
			graphUpdateItemProvider = new GraphUpdateItemProvider(this);
		}

		return graphUpdateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link l3IA_ProjetHTML.UpdateCouleurGraph} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateCouleurGraphItemProvider updateCouleurGraphItemProvider;

	/**
	 * This creates an adapter for a {@link l3IA_ProjetHTML.UpdateCouleurGraph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpdateCouleurGraphAdapter() {
		if (updateCouleurGraphItemProvider == null) {
			updateCouleurGraphItemProvider = new UpdateCouleurGraphItemProvider(this);
		}

		return updateCouleurGraphItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link l3IA_ProjetHTML.UpdateNameAxeY} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateNameAxeYItemProvider updateNameAxeYItemProvider;

	/**
	 * This creates an adapter for a {@link l3IA_ProjetHTML.UpdateNameAxeY}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpdateNameAxeYAdapter() {
		if (updateNameAxeYItemProvider == null) {
			updateNameAxeYItemProvider = new UpdateNameAxeYItemProvider(this);
		}

		return updateNameAxeYItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link l3IA_ProjetHTML.UpdateNameAxeX} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateNameAxeXItemProvider updateNameAxeXItemProvider;

	/**
	 * This creates an adapter for a {@link l3IA_ProjetHTML.UpdateNameAxeX}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpdateNameAxeXAdapter() {
		if (updateNameAxeXItemProvider == null) {
			updateNameAxeXItemProvider = new UpdateNameAxeXItemProvider(this);
		}

		return updateNameAxeXItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link l3IA_ProjetHTML.UpdateNameLegend} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateNameLegendItemProvider updateNameLegendItemProvider;

	/**
	 * This creates an adapter for a {@link l3IA_ProjetHTML.UpdateNameLegend}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpdateNameLegendAdapter() {
		if (updateNameLegendItemProvider == null) {
			updateNameLegendItemProvider = new UpdateNameLegendItemProvider(this);
		}

		return updateNameLegendItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (dashboardItemProvider != null)
			dashboardItemProvider.dispose();
		if (graphRealisationItemProvider != null)
			graphRealisationItemProvider.dispose();
		if (importDataItemProvider != null)
			importDataItemProvider.dispose();
		if (filterDataItemProvider != null)
			filterDataItemProvider.dispose();
		if (filterCompareItemProvider != null)
			filterCompareItemProvider.dispose();
		if (compareQualiItemProvider != null)
			compareQualiItemProvider.dispose();
		if (compareQuantiItemProvider != null)
			compareQuantiItemProvider.dispose();
		if (filterNotNullItemProvider != null)
			filterNotNullItemProvider.dispose();
		if (filterGroupByItemProvider != null)
			filterGroupByItemProvider.dispose();
		if (graphMakerItemProvider != null)
			graphMakerItemProvider.dispose();
		if (graphUpdateItemProvider != null)
			graphUpdateItemProvider.dispose();
		if (updateCouleurGraphItemProvider != null)
			updateCouleurGraphItemProvider.dispose();
		if (updateNameAxeYItemProvider != null)
			updateNameAxeYItemProvider.dispose();
		if (updateNameAxeXItemProvider != null)
			updateNameAxeXItemProvider.dispose();
		if (updateNameLegendItemProvider != null)
			updateNameLegendItemProvider.dispose();
	}

}
