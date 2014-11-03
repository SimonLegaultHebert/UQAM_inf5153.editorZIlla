/**
 */
package defaultname;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see defaultname.DefaultnamePackage#getDocumentStrategy()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DocumentStrategy extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Document load(String fileName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void save(Document document);

} // DocumentStrategy
