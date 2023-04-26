/**
 */
package l3IA_ProjetHTML.impl;

import java.util.Collection;

import l3IA_ProjetHTML.L3IA_ProjetHTMLPackage;
import l3IA_ProjetHTML.UpdateCouleurGraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Couleur Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link l3IA_ProjetHTML.impl.UpdateCouleurGraphImpl#getCouleur <em>Couleur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateCouleurGraphImpl extends GraphUpdateImpl implements UpdateCouleurGraph {
	/**
	 * The cached value of the '{@link #getCouleur() <em>Couleur</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleur()
	 * @generated
	 * @ordered
	 */
	protected EList<String> couleur;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateCouleurGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return L3IA_ProjetHTMLPackage.Literals.UPDATE_COULEUR_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCouleur() {
		if (couleur == null) {
			couleur = new EDataTypeUniqueEList<String>(String.class, this,
					L3IA_ProjetHTMLPackage.UPDATE_COULEUR_GRAPH__COULEUR);
		}
		return couleur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case L3IA_ProjetHTMLPackage.UPDATE_COULEUR_GRAPH__COULEUR:
			return getCouleur();
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
		case L3IA_ProjetHTMLPackage.UPDATE_COULEUR_GRAPH__COULEUR:
			getCouleur().clear();
			getCouleur().addAll((Collection<? extends String>) newValue);
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
		case L3IA_ProjetHTMLPackage.UPDATE_COULEUR_GRAPH__COULEUR:
			getCouleur().clear();
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
		case L3IA_ProjetHTMLPackage.UPDATE_COULEUR_GRAPH__COULEUR:
			return couleur != null && !couleur.isEmpty();
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
		result.append(" (couleur: ");
		result.append(couleur);
		result.append(')');
		return result.toString();
	}

} //UpdateCouleurGraphImpl
