/**
 */
package l3IA_ProjetHTML.impl;

import l3IA_ProjetHTML.FilterGroupBy;
import l3IA_ProjetHTML.FonctionAgregation;
import l3IA_ProjetHTML.L3IA_ProjetHTMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Group By</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link l3IA_ProjetHTML.impl.FilterGroupByImpl#getNameColumnsX <em>Name Columns X</em>}</li>
 *   <li>{@link l3IA_ProjetHTML.impl.FilterGroupByImpl#getNameColumnsY <em>Name Columns Y</em>}</li>
 *   <li>{@link l3IA_ProjetHTML.impl.FilterGroupByImpl#getFonctionAgregation <em>Fonction Agregation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterGroupByImpl extends FilterDataImpl implements FilterGroupBy {
	/**
	 * The default value of the '{@link #getNameColumnsX() <em>Name Columns X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameColumnsX()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_COLUMNS_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameColumnsX() <em>Name Columns X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameColumnsX()
	 * @generated
	 * @ordered
	 */
	protected String nameColumnsX = NAME_COLUMNS_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameColumnsY() <em>Name Columns Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameColumnsY()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_COLUMNS_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameColumnsY() <em>Name Columns Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameColumnsY()
	 * @generated
	 * @ordered
	 */
	protected String nameColumnsY = NAME_COLUMNS_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getFonctionAgregation() <em>Fonction Agregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonctionAgregation()
	 * @generated
	 * @ordered
	 */
	protected static final FonctionAgregation FONCTION_AGREGATION_EDEFAULT = FonctionAgregation.MEDIAN;

	/**
	 * The cached value of the '{@link #getFonctionAgregation() <em>Fonction Agregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonctionAgregation()
	 * @generated
	 * @ordered
	 */
	protected FonctionAgregation fonctionAgregation = FONCTION_AGREGATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterGroupByImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return L3IA_ProjetHTMLPackage.Literals.FILTER_GROUP_BY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameColumnsX() {
		return nameColumnsX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameColumnsX(String newNameColumnsX) {
		String oldNameColumnsX = nameColumnsX;
		nameColumnsX = newNameColumnsX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					L3IA_ProjetHTMLPackage.FILTER_GROUP_BY__NAME_COLUMNS_X, oldNameColumnsX, nameColumnsX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameColumnsY() {
		return nameColumnsY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameColumnsY(String newNameColumnsY) {
		String oldNameColumnsY = nameColumnsY;
		nameColumnsY = newNameColumnsY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					L3IA_ProjetHTMLPackage.FILTER_GROUP_BY__NAME_COLUMNS_Y, oldNameColumnsY, nameColumnsY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FonctionAgregation getFonctionAgregation() {
		return fonctionAgregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFonctionAgregation(FonctionAgregation newFonctionAgregation) {
		FonctionAgregation oldFonctionAgregation = fonctionAgregation;
		fonctionAgregation = newFonctionAgregation == null ? FONCTION_AGREGATION_EDEFAULT : newFonctionAgregation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					L3IA_ProjetHTMLPackage.FILTER_GROUP_BY__FONCTION_AGREGATION, oldFonctionAgregation,
					fonctionAgregation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case L3IA_ProjetHTMLPackage.FILTER_GROUP_BY__NAME_COLUMNS_X:
			return getNameColumnsX();
		case L3IA_ProjetHTMLPackage.FILTER_GROUP_BY__NAME_COLUMNS_Y:
			return getNameColumnsY();
		case L3IA_ProjetHTMLPackage.FILTER_GROUP_BY__FONCTION_AGREGATION:
			return getFonctionAgregation();
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
		case L3IA_ProjetHTMLPackage.FILTER_GROUP_BY__NAME_COLUMNS_X:
			setNameColumnsX((String) newValue);
			return;
		case L3IA_ProjetHTMLPackage.FILTER_GROUP_BY__NAME_COLUMNS_Y:
			setNameColumnsY((String) newValue);
			return;
		case L3IA_ProjetHTMLPackage.FILTER_GROUP_BY__FONCTION_AGREGATION:
			setFonctionAgregation((FonctionAgregation) newValue);
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
		case L3IA_ProjetHTMLPackage.FILTER_GROUP_BY__NAME_COLUMNS_X:
			setNameColumnsX(NAME_COLUMNS_X_EDEFAULT);
			return;
		case L3IA_ProjetHTMLPackage.FILTER_GROUP_BY__NAME_COLUMNS_Y:
			setNameColumnsY(NAME_COLUMNS_Y_EDEFAULT);
			return;
		case L3IA_ProjetHTMLPackage.FILTER_GROUP_BY__FONCTION_AGREGATION:
			setFonctionAgregation(FONCTION_AGREGATION_EDEFAULT);
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
		case L3IA_ProjetHTMLPackage.FILTER_GROUP_BY__NAME_COLUMNS_X:
			return NAME_COLUMNS_X_EDEFAULT == null ? nameColumnsX != null
					: !NAME_COLUMNS_X_EDEFAULT.equals(nameColumnsX);
		case L3IA_ProjetHTMLPackage.FILTER_GROUP_BY__NAME_COLUMNS_Y:
			return NAME_COLUMNS_Y_EDEFAULT == null ? nameColumnsY != null
					: !NAME_COLUMNS_Y_EDEFAULT.equals(nameColumnsY);
		case L3IA_ProjetHTMLPackage.FILTER_GROUP_BY__FONCTION_AGREGATION:
			return fonctionAgregation != FONCTION_AGREGATION_EDEFAULT;
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
		result.append(" (nameColumnsX: ");
		result.append(nameColumnsX);
		result.append(", nameColumnsY: ");
		result.append(nameColumnsY);
		result.append(", fonctionAgregation: ");
		result.append(fonctionAgregation);
		result.append(')');
		return result.toString();
	}

} //FilterGroupByImpl
