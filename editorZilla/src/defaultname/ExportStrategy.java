/**
 */
package defaultname;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Export Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see defaultname.DefaultnamePackage#getExportStrategy()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ExportStrategy extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void export(Document document, String filePath);

} // ExportStrategy
