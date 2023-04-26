/**
 */
package l3IA_ProjetHTML.provider;

import java.util.Collection;
import java.util.List;

import l3IA_ProjetHTML.GraphRealisation;
import l3IA_ProjetHTML.L3IA_ProjetHTMLFactory;
import l3IA_ProjetHTML.L3IA_ProjetHTMLPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link l3IA_ProjetHTML.GraphRealisation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphRealisationItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphRealisationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(L3IA_ProjetHTMLPackage.Literals.GRAPH_REALISATION__OWNED_IMPORT);
			childrenFeatures.add(L3IA_ProjetHTMLPackage.Literals.GRAPH_REALISATION__OWNED_FILTER);
			childrenFeatures.add(L3IA_ProjetHTMLPackage.Literals.GRAPH_REALISATION__OWNED_GRAPH_MAKER);
			childrenFeatures.add(L3IA_ProjetHTMLPackage.Literals.GRAPH_REALISATION__OWNED_GRAPH_UPDATE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns GraphRealisation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GraphRealisation"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_GraphRealisation_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(GraphRealisation.class)) {
		case L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_IMPORT:
		case L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_FILTER:
		case L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_GRAPH_MAKER:
		case L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_GRAPH_UPDATE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(L3IA_ProjetHTMLPackage.Literals.GRAPH_REALISATION__OWNED_IMPORT,
				L3IA_ProjetHTMLFactory.eINSTANCE.createImportData()));

		newChildDescriptors.add(createChildParameter(L3IA_ProjetHTMLPackage.Literals.GRAPH_REALISATION__OWNED_FILTER,
				L3IA_ProjetHTMLFactory.eINSTANCE.createFilterData()));

		newChildDescriptors.add(createChildParameter(L3IA_ProjetHTMLPackage.Literals.GRAPH_REALISATION__OWNED_FILTER,
				L3IA_ProjetHTMLFactory.eINSTANCE.createFilterCompare()));

		newChildDescriptors.add(createChildParameter(L3IA_ProjetHTMLPackage.Literals.GRAPH_REALISATION__OWNED_FILTER,
				L3IA_ProjetHTMLFactory.eINSTANCE.createCompareQuali()));

		newChildDescriptors.add(createChildParameter(L3IA_ProjetHTMLPackage.Literals.GRAPH_REALISATION__OWNED_FILTER,
				L3IA_ProjetHTMLFactory.eINSTANCE.createCompareQuanti()));

		newChildDescriptors.add(createChildParameter(L3IA_ProjetHTMLPackage.Literals.GRAPH_REALISATION__OWNED_FILTER,
				L3IA_ProjetHTMLFactory.eINSTANCE.createFilterNotNull()));

		newChildDescriptors.add(createChildParameter(L3IA_ProjetHTMLPackage.Literals.GRAPH_REALISATION__OWNED_FILTER,
				L3IA_ProjetHTMLFactory.eINSTANCE.createFilterGroupBy()));

		newChildDescriptors
				.add(createChildParameter(L3IA_ProjetHTMLPackage.Literals.GRAPH_REALISATION__OWNED_GRAPH_MAKER,
						L3IA_ProjetHTMLFactory.eINSTANCE.createGraphMaker()));

		newChildDescriptors
				.add(createChildParameter(L3IA_ProjetHTMLPackage.Literals.GRAPH_REALISATION__OWNED_GRAPH_UPDATE,
						L3IA_ProjetHTMLFactory.eINSTANCE.createGraphUpdate()));

		newChildDescriptors
				.add(createChildParameter(L3IA_ProjetHTMLPackage.Literals.GRAPH_REALISATION__OWNED_GRAPH_UPDATE,
						L3IA_ProjetHTMLFactory.eINSTANCE.createUpdateCouleurGraph()));

		newChildDescriptors
				.add(createChildParameter(L3IA_ProjetHTMLPackage.Literals.GRAPH_REALISATION__OWNED_GRAPH_UPDATE,
						L3IA_ProjetHTMLFactory.eINSTANCE.createUpdateNameAxeY()));

		newChildDescriptors
				.add(createChildParameter(L3IA_ProjetHTMLPackage.Literals.GRAPH_REALISATION__OWNED_GRAPH_UPDATE,
						L3IA_ProjetHTMLFactory.eINSTANCE.createUpdateNameAxeX()));

		newChildDescriptors
				.add(createChildParameter(L3IA_ProjetHTMLPackage.Literals.GRAPH_REALISATION__OWNED_GRAPH_UPDATE,
						L3IA_ProjetHTMLFactory.eINSTANCE.createUpdateNameLegend()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return L3IA_ProjetHTMLEditPlugin.INSTANCE;
	}

}
