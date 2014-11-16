/**
 */
package defaultname;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link defaultname.DocumentBuilder#getDocument <em>Document</em>}</li>
 *   <li>{@link defaultname.DocumentBuilder#getFilePath <em>File Path</em>}</li>
 *   <li>{@link defaultname.DocumentBuilder#getDocumentStrategy <em>Document Strategy</em>}</li>
 *   <li>{@link defaultname.DocumentBuilder#getExportStrategy <em>Export Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @see defaultname.DefaultnamePackage#getDocumentBuilder()
 * @model
 * @generated
 */
public interface DocumentBuilder extends EObject {
	
	DocumentBuilder getInstance();
	
	/**
	 * Returns the value of the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' reference.
	 * @see #setDocument(Document)
	 * @see defaultname.DefaultnamePackage#getDocumentBuilder_Document()
	 * @model required="true"
	 * @generated
	 */
	Document getDocument();

	/**
	 * Sets the value of the '{@link defaultname.DocumentBuilder#getDocument <em>Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(Document value);

	/**
	 * Returns the value of the '<em><b>File Path</b></em>' attribute.
	 * The default value is <code>"DossierDefaut"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Path</em>' attribute.
	 * @see #setFilePath(String)
	 * @see defaultname.DefaultnamePackage#getDocumentBuilder_FilePath()
	 * @model default="DossierDefaut"
	 * @generated
	 */
	String getFilePath();

	/**
	 * Sets the value of the '{@link defaultname.DocumentBuilder#getFilePath <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Path</em>' attribute.
	 * @see #getFilePath()
	 * @generated
	 */
	void setFilePath(String value);

	/**
	 * Returns the value of the '<em><b>Document Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Strategy</em>' containment reference.
	 * @see #setDocumentStrategy(DocumentStrategy)
	 * @see defaultname.DefaultnamePackage#getDocumentBuilder_DocumentStrategy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DocumentStrategy getDocumentStrategy();

	/**
	 * Sets the value of the '{@link defaultname.DocumentBuilder#getDocumentStrategy <em>Document Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Strategy</em>' containment reference.
	 * @see #getDocumentStrategy()
	 * @generated
	 */
	void setDocumentStrategy(DocumentStrategy value);

	/**
	 * Returns the value of the '<em><b>Export Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export Strategy</em>' containment reference.
	 * @see #setExportStrategy(ExportStrategy)
	 * @see defaultname.DefaultnamePackage#getDocumentBuilder_ExportStrategy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExportStrategy getExportStrategy();

	/**
	 * Sets the value of the '{@link defaultname.DocumentBuilder#getExportStrategy <em>Export Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Export Strategy</em>' containment reference.
	 * @see #getExportStrategy()
	 * @generated
	 */
	void setExportStrategy(ExportStrategy value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Document load(String filePath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void export(String documentName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void save(Document document);

} // DocumentBuilder
