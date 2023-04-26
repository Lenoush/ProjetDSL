/**
 */
package l3IA_ProjetHTML.impl;

import l3IA_ProjetHTML.CompareQuali;
import l3IA_ProjetHTML.FonctionComparaisonQuali;
import l3IA_ProjetHTML.L3IA_ProjetHTMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compare Quali</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link l3IA_ProjetHTML.impl.CompareQualiImpl#getSomethingtocompare <em>Somethingtocompare</em>}</li>
 *   <li>{@link l3IA_ProjetHTML.impl.CompareQualiImpl#getName <em>Name</em>}</li>
 *   <li>{@link l3IA_ProjetHTML.impl.CompareQualiImpl#getComparaison <em>Comparaison</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompareQualiImpl extends FilterCompareImpl implements CompareQuali {
	/**
	 * The default value of the '{@link #getSomethingtocompare() <em>Somethingtocompare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSomethingtocompare()
	 * @generated
	 * @ordered
	 */
	protected static final String SOMETHINGTOCOMPARE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSomethingtocompare() <em>Somethingtocompare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSomethingtocompare()
	 * @generated
	 * @ordered
	 */
	protected String somethingtocompare = SOMETHINGTOCOMPARE_EDEFAULT;
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
	 * The default value of the '{@link #getComparaison() <em>Comparaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparaison()
	 * @generated
	 * @ordered
	 */
	protected static final FonctionComparaisonQuali COMPARAISON_EDEFAULT = FonctionComparaisonQuali.EGAL;
	/**
	 * The cached value of the '{@link #getComparaison() <em>Comparaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparaison()
	 * @generated
	 * @ordered
	 */
	protected FonctionComparaisonQuali comparaison = COMPARAISON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompareQualiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return L3IA_ProjetHTMLPackage.Literals.COMPARE_QUALI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSomethingtocompare() {
		return somethingtocompare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSomethingtocompare(String newSomethingtocompare) {
		String oldSomethingtocompare = somethingtocompare;
		somethingtocompare = newSomethingtocompare;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					L3IA_ProjetHTMLPackage.COMPARE_QUALI__SOMETHINGTOCOMPARE, oldSomethingtocompare,
					somethingtocompare));
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
			eNotify(new ENotificationImpl(this, Notification.SET, L3IA_ProjetHTMLPackage.COMPARE_QUALI__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FonctionComparaisonQuali getComparaison() {
		return comparaison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparaison(FonctionComparaisonQuali newComparaison) {
		FonctionComparaisonQuali oldComparaison = comparaison;
		comparaison = newComparaison == null ? COMPARAISON_EDEFAULT : newComparaison;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, L3IA_ProjetHTMLPackage.COMPARE_QUALI__COMPARAISON,
					oldComparaison, comparaison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case L3IA_ProjetHTMLPackage.COMPARE_QUALI__SOMETHINGTOCOMPARE:
			return getSomethingtocompare();
		case L3IA_ProjetHTMLPackage.COMPARE_QUALI__NAME:
			return getName();
		case L3IA_ProjetHTMLPackage.COMPARE_QUALI__COMPARAISON:
			return getComparaison();
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
		case L3IA_ProjetHTMLPackage.COMPARE_QUALI__SOMETHINGTOCOMPARE:
			setSomethingtocompare((String) newValue);
			return;
		case L3IA_ProjetHTMLPackage.COMPARE_QUALI__NAME:
			setName((String) newValue);
			return;
		case L3IA_ProjetHTMLPackage.COMPARE_QUALI__COMPARAISON:
			setComparaison((FonctionComparaisonQuali) newValue);
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
		case L3IA_ProjetHTMLPackage.COMPARE_QUALI__SOMETHINGTOCOMPARE:
			setSomethingtocompare(SOMETHINGTOCOMPARE_EDEFAULT);
			return;
		case L3IA_ProjetHTMLPackage.COMPARE_QUALI__NAME:
			setName(NAME_EDEFAULT);
			return;
		case L3IA_ProjetHTMLPackage.COMPARE_QUALI__COMPARAISON:
			setComparaison(COMPARAISON_EDEFAULT);
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
		case L3IA_ProjetHTMLPackage.COMPARE_QUALI__SOMETHINGTOCOMPARE:
			return SOMETHINGTOCOMPARE_EDEFAULT == null ? somethingtocompare != null
					: !SOMETHINGTOCOMPARE_EDEFAULT.equals(somethingtocompare);
		case L3IA_ProjetHTMLPackage.COMPARE_QUALI__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case L3IA_ProjetHTMLPackage.COMPARE_QUALI__COMPARAISON:
			return comparaison != COMPARAISON_EDEFAULT;
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
		result.append(" (somethingtocompare: ");
		result.append(somethingtocompare);
		result.append(", name: ");
		result.append(name);
		result.append(", comparaison: ");
		result.append(comparaison);
		result.append(')');
		return result.toString();
	}

} //CompareQualiImpl
