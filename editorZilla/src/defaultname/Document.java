/**
 */
package defaultname;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link defaultname.Document#getName <em>Name</em>}</li>
 *   <li>{@link defaultname.Document#getFormat <em>Format</em>}</li>
 *   <li>{@link defaultname.Document#getRacine <em>Racine</em>}</li>
 * </ul>
 * </p>
 *
 * @see defaultname.DefaultnamePackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends DocumentBuilder, DocumentStrategy {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"document"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see defaultname.DefaultnamePackage#getDocument_Name()
	 * @model default="document"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link defaultname.Document#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see defaultname.DefaultnamePackage#getDocument_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link defaultname.Document#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Racine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Racine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Racine</em>' reference.
	 * @see #setRacine(SectionComponent)
	 * @see defaultname.DefaultnamePackage#getDocument_Racine()
	 * @model required="true"
	 * @generated
	 */
	SectionComponent getRacine();

	/**
	 * Sets the value of the '{@link defaultname.Document#getRacine <em>Racine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Racine</em>' reference.
	 * @see #getRacine()
	 * @generated
	 */
	void setRacine(SectionComponent value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	SectionComponent getSectionComponent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SectionComposite addSection(String title, String text);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Section addSubsection(String id, String title, String text);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getContent(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void saveText(String id, String currentText);

} // Document
