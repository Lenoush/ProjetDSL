/**
 */
package l3IA_ProjetHTML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link l3IA_ProjetHTML.ImportData#getDelimeter <em>Delimeter</em>}</li>
 *   <li>{@link l3IA_ProjetHTML.ImportData#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage#getImportData()
 * @model
 * @generated
 */
public interface ImportData extends EObject {
	/**
	 * Returns the value of the '<em><b>Delimeter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delimeter</em>' attribute.
	 * @see #setDelimeter(String)
	 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage#getImportData_Delimeter()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDelimeter();

	/**
	 * Sets the value of the '{@link l3IA_ProjetHTML.ImportData#getDelimeter <em>Delimeter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delimeter</em>' attribute.
	 * @see #getDelimeter()
	 * @generated
	 */
	void setDelimeter(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see l3IA_ProjetHTML.L3IA_ProjetHTMLPackage#getImportData_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link l3IA_ProjetHTML.ImportData#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ImportData
