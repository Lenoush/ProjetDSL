/**
 */
package l3IA_ProjetHTML.impl;

import java.util.Collection;

import l3IA_ProjetHTML.FilterData;
import l3IA_ProjetHTML.GraphMaker;
import l3IA_ProjetHTML.GraphRealisation;
import l3IA_ProjetHTML.GraphUpdate;
import l3IA_ProjetHTML.ImportData;
import l3IA_ProjetHTML.L3IA_ProjetHTMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph Realisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link l3IA_ProjetHTML.impl.GraphRealisationImpl#getOwnedImport <em>Owned Import</em>}</li>
 *   <li>{@link l3IA_ProjetHTML.impl.GraphRealisationImpl#getOwnedFilter <em>Owned Filter</em>}</li>
 *   <li>{@link l3IA_ProjetHTML.impl.GraphRealisationImpl#getOwnedGraphMaker <em>Owned Graph Maker</em>}</li>
 *   <li>{@link l3IA_ProjetHTML.impl.GraphRealisationImpl#getOwnedGraphUpdate <em>Owned Graph Update</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphRealisationImpl extends MinimalEObjectImpl.Container implements GraphRealisation {
	/**
	 * The cached value of the '{@link #getOwnedImport() <em>Owned Import</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedImport()
	 * @generated
	 * @ordered
	 */
	protected ImportData ownedImport;

	/**
	 * The cached value of the '{@link #getOwnedFilter() <em>Owned Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<FilterData> ownedFilter;

	/**
	 * The cached value of the '{@link #getOwnedGraphMaker() <em>Owned Graph Maker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedGraphMaker()
	 * @generated
	 * @ordered
	 */
	protected GraphMaker ownedGraphMaker;

	/**
	 * The cached value of the '{@link #getOwnedGraphUpdate() <em>Owned Graph Update</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedGraphUpdate()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphUpdate> ownedGraphUpdate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphRealisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return L3IA_ProjetHTMLPackage.Literals.GRAPH_REALISATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportData getOwnedImport() {
		return ownedImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedImport(ImportData newOwnedImport, NotificationChain msgs) {
		ImportData oldOwnedImport = ownedImport;
		ownedImport = newOwnedImport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_IMPORT, oldOwnedImport, newOwnedImport);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedImport(ImportData newOwnedImport) {
		if (newOwnedImport != ownedImport) {
			NotificationChain msgs = null;
			if (ownedImport != null)
				msgs = ((InternalEObject) ownedImport).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_IMPORT, null, msgs);
			if (newOwnedImport != null)
				msgs = ((InternalEObject) newOwnedImport).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_IMPORT, null, msgs);
			msgs = basicSetOwnedImport(newOwnedImport, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_IMPORT, newOwnedImport, newOwnedImport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FilterData> getOwnedFilter() {
		if (ownedFilter == null) {
			ownedFilter = new EObjectContainmentEList<FilterData>(FilterData.class, this,
					L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_FILTER);
		}
		return ownedFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphMaker getOwnedGraphMaker() {
		return ownedGraphMaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedGraphMaker(GraphMaker newOwnedGraphMaker, NotificationChain msgs) {
		GraphMaker oldOwnedGraphMaker = ownedGraphMaker;
		ownedGraphMaker = newOwnedGraphMaker;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_GRAPH_MAKER, oldOwnedGraphMaker,
					newOwnedGraphMaker);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedGraphMaker(GraphMaker newOwnedGraphMaker) {
		if (newOwnedGraphMaker != ownedGraphMaker) {
			NotificationChain msgs = null;
			if (ownedGraphMaker != null)
				msgs = ((InternalEObject) ownedGraphMaker).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_GRAPH_MAKER, null,
						msgs);
			if (newOwnedGraphMaker != null)
				msgs = ((InternalEObject) newOwnedGraphMaker).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_GRAPH_MAKER, null,
						msgs);
			msgs = basicSetOwnedGraphMaker(newOwnedGraphMaker, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_GRAPH_MAKER, newOwnedGraphMaker,
					newOwnedGraphMaker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphUpdate> getOwnedGraphUpdate() {
		if (ownedGraphUpdate == null) {
			ownedGraphUpdate = new EObjectContainmentEList<GraphUpdate>(GraphUpdate.class, this,
					L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_GRAPH_UPDATE);
		}
		return ownedGraphUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_IMPORT:
			return basicSetOwnedImport(null, msgs);
		case L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_FILTER:
			return ((InternalEList<?>) getOwnedFilter()).basicRemove(otherEnd, msgs);
		case L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_GRAPH_MAKER:
			return basicSetOwnedGraphMaker(null, msgs);
		case L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_GRAPH_UPDATE:
			return ((InternalEList<?>) getOwnedGraphUpdate()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_IMPORT:
			return getOwnedImport();
		case L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_FILTER:
			return getOwnedFilter();
		case L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_GRAPH_MAKER:
			return getOwnedGraphMaker();
		case L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_GRAPH_UPDATE:
			return getOwnedGraphUpdate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_IMPORT:
			setOwnedImport((ImportData) newValue);
			return;
		case L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_FILTER:
			getOwnedFilter().clear();
			getOwnedFilter().addAll((Collection<? extends FilterData>) newValue);
			return;
		case L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_GRAPH_MAKER:
			setOwnedGraphMaker((GraphMaker) newValue);
			return;
		case L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_GRAPH_UPDATE:
			getOwnedGraphUpdate().clear();
			getOwnedGraphUpdate().addAll((Collection<? extends GraphUpdate>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_IMPORT:
			setOwnedImport((ImportData) null);
			return;
		case L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_FILTER:
			getOwnedFilter().clear();
			return;
		case L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_GRAPH_MAKER:
			setOwnedGraphMaker((GraphMaker) null);
			return;
		case L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_GRAPH_UPDATE:
			getOwnedGraphUpdate().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_IMPORT:
			return ownedImport != null;
		case L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_FILTER:
			return ownedFilter != null && !ownedFilter.isEmpty();
		case L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_GRAPH_MAKER:
			return ownedGraphMaker != null;
		case L3IA_ProjetHTMLPackage.GRAPH_REALISATION__OWNED_GRAPH_UPDATE:
			return ownedGraphUpdate != null && !ownedGraphUpdate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GraphRealisationImpl
