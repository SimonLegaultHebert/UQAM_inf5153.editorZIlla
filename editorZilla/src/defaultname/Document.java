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
 *   <li>{@link defaultname.Document#getCurrentSectionTitle <em>Current Section Title</em>}</li>
 *   <li>{@link defaultname.Document#getCurrentSectionText <em>Current Section Text</em>}</li>
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see defaultname.DefaultnamePackage#getDocument_Name()
	 * @model
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
	 * Returns the value of the '<em><b>Current Section Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Section Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Section Title</em>' attribute.
	 * @see #setCurrentSectionTitle(String)
	 * @see defaultname.DefaultnamePackage#getDocument_CurrentSectionTitle()
	 * @model
	 * @generated
	 */
	String getCurrentSectionTitle();

	/**
	 * Sets the value of the '{@link defaultname.Document#getCurrentSectionTitle <em>Current Section Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Section Title</em>' attribute.
	 * @see #getCurrentSectionTitle()
	 * @generated
	 */
	void setCurrentSectionTitle(String value);

	/**
	 * Returns the value of the '<em><b>Current Section Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Section Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Section Text</em>' attribute.
	 * @see #setCurrentSectionText(String)
	 * @see defaultname.DefaultnamePackage#getDocument_CurrentSectionText()
	 * @model
	 * @generated
	 */
	String getCurrentSectionText();

	/**
	 * Sets the value of the '{@link defaultname.Document#getCurrentSectionText <em>Current Section Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Section Text</em>' attribute.
	 * @see #getCurrentSectionText()
	 * @generated
	 */
	void setCurrentSectionText(String value);

} // Document
