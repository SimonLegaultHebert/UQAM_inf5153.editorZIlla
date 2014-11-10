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
 *   <li>{@link defaultname.DocumentBuilder#getStrategy <em>Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @see defaultname.DefaultnamePackage#getDocumentBuilder()
 * @model
 * @generated
 */
public interface DocumentBuilder extends EObject {
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
	 * Returns the value of the '<em><b>Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' containment reference.
	 * @see #setStrategy(DocumentStrategy)
	 * @see defaultname.DefaultnamePackage#getDocumentBuilder_Strategy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DocumentStrategy getStrategy();

	/**
	 * Sets the value of the '{@link defaultname.DocumentBuilder#getStrategy <em>Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' containment reference.
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(DocumentStrategy value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Document load(String documentName);

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
