/**
 */
package l3IA_ProjetHTML.impl;

import java.util.Collection;
import l3IA_ProjetHTML.GraphMaker;
import l3IA_ProjetHTML.L3IA_ProjetHTMLPackage;
import l3IA_ProjetHTML.TypeGraph;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph Maker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link l3IA_ProjetHTML.impl.GraphMakerImpl#getType <em>Type</em>}</li>
 *   <li>{@link l3IA_ProjetHTML.impl.GraphMakerImpl#getNameAbscisse <em>Name Abscisse</em>}</li>
 *   <li>{@link l3IA_ProjetHTML.impl.GraphMakerImpl#getNameOrdonnees <em>Name Ordonnees</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphMakerImpl extends MinimalEObjectImpl.Container implements GraphMaker {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeGraph TYPE_EDEFAULT = TypeGraph.BAR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeGraph type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameAbscisse() <em>Name Abscisse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameAbscisse()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_ABSCISSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameAbscisse() <em>Name Abscisse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameAbscisse()
	 * @generated
	 * @ordered
	 */
	protected String nameAbscisse = NAME_ABSCISSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNameOrdonnees() <em>Name Ordonnees</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameOrdonnees()
	 * @generated
	 * @ordered
	 */
	protected EList<String> nameOrdonnees;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphMakerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return L3IA_ProjetHTMLPackage.Literals.GRAPH_MAKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeGraph getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeGraph newType) {
		TypeGraph oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, L3IA_ProjetHTMLPackage.GRAPH_MAKER__TYPE, oldType,
					type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameAbscisse() {
		return nameAbscisse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameAbscisse(String newNameAbscisse) {
		String oldNameAbscisse = nameAbscisse;
		nameAbscisse = newNameAbscisse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, L3IA_ProjetHTMLPackage.GRAPH_MAKER__NAME_ABSCISSE,
					oldNameAbscisse, nameAbscisse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNameOrdonnees() {
		if (nameOrdonnees == null) {
			nameOrdonnees = new EDataTypeUniqueEList<String>(String.class, this,
					L3IA_ProjetHTMLPackage.GRAPH_MAKER__NAME_ORDONNEES);
		}
		return nameOrdonnees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case L3IA_ProjetHTMLPackage.GRAPH_MAKER__TYPE:
			return getType();
		case L3IA_ProjetHTMLPackage.GRAPH_MAKER__NAME_ABSCISSE:
			return getNameAbscisse();
		case L3IA_ProjetHTMLPackage.GRAPH_MAKER__NAME_ORDONNEES:
			return getNameOrdonnees();
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
		case L3IA_ProjetHTMLPackage.GRAPH_MAKER__TYPE:
			setType((TypeGraph) newValue);
			return;
		case L3IA_ProjetHTMLPackage.GRAPH_MAKER__NAME_ABSCISSE:
			setNameAbscisse((String) newValue);
			return;
		case L3IA_ProjetHTMLPackage.GRAPH_MAKER__NAME_ORDONNEES:
			getNameOrdonnees().clear();
			getNameOrdonnees().addAll((Collection<? extends String>) newValue);
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
		case L3IA_ProjetHTMLPackage.GRAPH_MAKER__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case L3IA_ProjetHTMLPackage.GRAPH_MAKER__NAME_ABSCISSE:
			setNameAbscisse(NAME_ABSCISSE_EDEFAULT);
			return;
		case L3IA_ProjetHTMLPackage.GRAPH_MAKER__NAME_ORDONNEES:
			getNameOrdonnees().clear();
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
		case L3IA_ProjetHTMLPackage.GRAPH_MAKER__TYPE:
			return type != TYPE_EDEFAULT;
		case L3IA_ProjetHTMLPackage.GRAPH_MAKER__NAME_ABSCISSE:
			return NAME_ABSCISSE_EDEFAULT == null ? nameAbscisse != null : !NAME_ABSCISSE_EDEFAULT.equals(nameAbscisse);
		case L3IA_ProjetHTMLPackage.GRAPH_MAKER__NAME_ORDONNEES:
			return nameOrdonnees != null && !nameOrdonnees.isEmpty();
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
		result.append(" (type: ");
		result.append(type);
		result.append(", nameAbscisse: ");
		result.append(nameAbscisse);
		result.append(", nameOrdonnees: ");
		result.append(nameOrdonnees);
		result.append(')');
		return result.toString();
	}

} //GraphMakerImpl
