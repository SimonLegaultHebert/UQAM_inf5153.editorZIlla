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
 *   <li>{@link defaultname.Document#getPressePapier <em>Presse Papier</em>}</li>
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
	 * Returns the value of the '<em><b>Presse Papier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presse Papier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presse Papier</em>' reference.
	 * @see #setPressePapier(PressePapier)
	 * @see defaultname.DefaultnamePackage#getDocument_PressePapier()
	 * @model required="true"
	 * @generated
	 */
	PressePapier getPressePapier();

	/**
	 * Sets the value of the '{@link defaultname.Document#getPressePapier <em>Presse Papier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presse Papier</em>' reference.
	 * @see #getPressePapier()
	 * @generated
	 */
	void setPressePapier(PressePapier value);

} // Document
