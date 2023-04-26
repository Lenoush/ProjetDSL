/**
 */
package l3IA_ProjetHTML.impl;

import l3IA_ProjetHTML.L3IA_ProjetHTMLPackage;
import l3IA_ProjetHTML.UpdateNameLegend;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Name Legend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link l3IA_ProjetHTML.impl.UpdateNameLegendImpl#getOldname <em>Oldname</em>}</li>
 *   <li>{@link l3IA_ProjetHTML.impl.UpdateNameLegendImpl#getNewname <em>Newname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateNameLegendImpl extends GraphUpdateImpl implements UpdateNameLegend {
	/**
	 * The default value of the '{@link #getOldname() <em>Oldname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldname()
	 * @generated
	 * @ordered
	 */
	protected static final String OLDNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOldname() <em>Oldname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldname()
	 * @generated
	 * @ordered
	 */
	protected String oldname = OLDNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewname() <em>Newname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewname()
	 * @generated
	 * @ordered
	 */
	protected static final String NEWNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewname() <em>Newname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewname()
	 * @generated
	 * @ordered
	 */
	protected String newname = NEWNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateNameLegendImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return L3IA_ProjetHTMLPackage.Literals.UPDATE_NAME_LEGEND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOldname() {
		return oldname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldname(String newOldname) {
		String oldOldname = oldname;
		oldname = newOldname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, L3IA_ProjetHTMLPackage.UPDATE_NAME_LEGEND__OLDNAME,
					oldOldname, oldname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewname() {
		return newname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewname(String newNewname) {
		String oldNewname = newname;
		newname = newNewname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, L3IA_ProjetHTMLPackage.UPDATE_NAME_LEGEND__NEWNAME,
					oldNewname, newname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case L3IA_ProjetHTMLPackage.UPDATE_NAME_LEGEND__OLDNAME:
			return getOldname();
		case L3IA_ProjetHTMLPackage.UPDATE_NAME_LEGEND__NEWNAME:
			return getNewname();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case L3IA_ProjetHTMLPackage.UPDATE_NAME_LEGEND__OLDNAME:
			setOldname((String) newValue);
			return;
		case L3IA_ProjetHTMLPackage.UPDATE_NAME_LEGEND__NEWNAME:
			setNewname((String) newValue);
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
		case L3IA_ProjetHTMLPackage.UPDATE_NAME_LEGEND__OLDNAME:
			setOldname(OLDNAME_EDEFAULT);
			return;
		case L3IA_ProjetHTMLPackage.UPDATE_NAME_LEGEND__NEWNAME:
			setNewname(NEWNAME_EDEFAULT);
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
		case L3IA_ProjetHTMLPackage.UPDATE_NAME_LEGEND__OLDNAME:
			return OLDNAME_EDEFAULT == null ? oldname != null : !OLDNAME_EDEFAULT.equals(oldname);
		case L3IA_ProjetHTMLPackage.UPDATE_NAME_LEGEND__NEWNAME:
			return NEWNAME_EDEFAULT == null ? newname != null : !NEWNAME_EDEFAULT.equals(newname);
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
		result.append(" (oldname: ");
		result.append(oldname);
		result.append(", newname: ");
		result.append(newname);
		result.append(')');
		return result.toString();
	}

} //UpdateNameLegendImpl
