/**
 */
package l3IA_ProjetHTML.impl;

import java.util.Collection;

import l3IA_ProjetHTML.Dashboard;
import l3IA_ProjetHTML.GraphRealisation;
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
 * An implementation of the model object '<em><b>Dashboard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link l3IA_ProjetHTML.impl.DashboardImpl#getOwnedGraphRealisation <em>Owned Graph Realisation</em>}</li>
 *   <li>{@link l3IA_ProjetHTML.impl.DashboardImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DashboardImpl extends MinimalEObjectImpl.Container implements Dashboard {
	/**
	 * The cached value of the '{@link #getOwnedGraphRealisation() <em>Owned Graph Realisation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedGraphRealisation()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphRealisation> ownedGraphRealisation;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DashboardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return L3IA_ProjetHTMLPackage.Literals.DASHBOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphRealisation> getOwnedGraphRealisation() {
		if (ownedGraphRealisation == null) {
			ownedGraphRealisation = new EObjectContainmentEList<GraphRealisation>(GraphRealisation.class, this,
					L3IA_ProjetHTMLPackage.DASHBOARD__OWNED_GRAPH_REALISATION);
		}
		return ownedGraphRealisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, L3IA_ProjetHTMLPackage.DASHBOARD__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case L3IA_ProjetHTMLPackage.DASHBOARD__OWNED_GRAPH_REALISATION:
			return ((InternalEList<?>) getOwnedGraphRealisation()).basicRemove(otherEnd, msgs);
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
		case L3IA_ProjetHTMLPackage.DASHBOARD__OWNED_GRAPH_REALISATION:
			return getOwnedGraphRealisation();
		case L3IA_ProjetHTMLPackage.DASHBOARD__NAME:
			return getName();
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
		case L3IA_ProjetHTMLPackage.DASHBOARD__OWNED_GRAPH_REALISATION:
			getOwnedGraphRealisation().clear();
			getOwnedGraphRealisation().addAll((Collection<? extends GraphRealisation>) newValue);
			return;
		case L3IA_ProjetHTMLPackage.DASHBOARD__NAME:
			setName((String) newValue);
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
		case L3IA_ProjetHTMLPackage.DASHBOARD__OWNED_GRAPH_REALISATION:
			getOwnedGraphRealisation().clear();
			return;
		case L3IA_ProjetHTMLPackage.DASHBOARD__NAME:
			setName(NAME_EDEFAULT);
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
		case L3IA_ProjetHTMLPackage.DASHBOARD__OWNED_GRAPH_REALISATION:
			return ownedGraphRealisation != null && !ownedGraphRealisation.isEmpty();
		case L3IA_ProjetHTMLPackage.DASHBOARD__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DashboardImpl
