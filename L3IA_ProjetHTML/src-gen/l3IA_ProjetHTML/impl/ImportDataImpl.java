/**
 */
package l3IA_ProjetHTML.impl;

import l3IA_ProjetHTML.ImportData;
import l3IA_ProjetHTML.L3IA_ProjetHTMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link l3IA_ProjetHTML.impl.ImportDataImpl#getDelimeter <em>Delimeter</em>}</li>
 *   <li>{@link l3IA_ProjetHTML.impl.ImportDataImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportDataImpl extends MinimalEObjectImpl.Container implements ImportData {
	/**
	 * The default value of the '{@link #getDelimeter() <em>Delimeter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimeter()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelimeter() <em>Delimeter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimeter()
	 * @generated
	 * @ordered
	 */
	protected String delimeter = DELIMETER_EDEFAULT;

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
	protected ImportDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return L3IA_ProjetHTMLPackage.Literals.IMPORT_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDelimeter() {
		return delimeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelimeter(String newDelimeter) {
		String oldDelimeter = delimeter;
		delimeter = newDelimeter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, L3IA_ProjetHTMLPackage.IMPORT_DATA__DELIMETER,
					oldDelimeter, delimeter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, L3IA_ProjetHTMLPackage.IMPORT_DATA__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case L3IA_ProjetHTMLPackage.IMPORT_DATA__DELIMETER:
			return getDelimeter();
		case L3IA_ProjetHTMLPackage.IMPORT_DATA__NAME:
			return getName();
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
		case L3IA_ProjetHTMLPackage.IMPORT_DATA__DELIMETER:
			setDelimeter((String) newValue);
			return;
		case L3IA_ProjetHTMLPackage.IMPORT_DATA__NAME:
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
		case L3IA_ProjetHTMLPackage.IMPORT_DATA__DELIMETER:
			setDelimeter(DELIMETER_EDEFAULT);
			return;
		case L3IA_ProjetHTMLPackage.IMPORT_DATA__NAME:
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
		case L3IA_ProjetHTMLPackage.IMPORT_DATA__DELIMETER:
			return DELIMETER_EDEFAULT == null ? delimeter != null : !DELIMETER_EDEFAULT.equals(delimeter);
		case L3IA_ProjetHTMLPackage.IMPORT_DATA__NAME:
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
		result.append(" (delimeter: ");
		result.append(delimeter);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ImportDataImpl
