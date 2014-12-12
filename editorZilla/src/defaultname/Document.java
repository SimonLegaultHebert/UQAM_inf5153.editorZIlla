/**
 */
package defaultname;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link defaultname.Document#getName <em>Name</em>}</li>
 *   <li>{@link defaultname.Document#getRacine <em>Racine</em>}</li>
 *   <li>{@link defaultname.Document#getPressePapier <em>Presse Papier</em>}</li>
 *   <li>{@link defaultname.Document#getState <em>State</em>}</li>
 *   <li>{@link defaultname.Document#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link defaultname.Document#getEReference1 <em>EReference1</em>}</li>
 *   <li>{@link defaultname.Document#getEReference2 <em>EReference2</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(Object)
	 * @see defaultname.DefaultnamePackage#getDocument_State()
	 * @model extendedMetaData="kind='attribute'"
	 * @generated
	 */
	Object getState();

	/**
	 * Sets the value of the '{@link defaultname.Document#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(Object value);

	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' reference list.
	 * The list contents are of type {@link defaultname.Momento}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' reference list.
	 * @see defaultname.DefaultnamePackage#getDocument_EReference0()
	 * @model
	 * @generated
	 */
	EList<Momento> getEReference0();

	/**
	 * Returns the value of the '<em><b>EReference1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference1</em>' reference.
	 * @see #setEReference1(Document)
	 * @see defaultname.DefaultnamePackage#getDocument_EReference1()
	 * @model
	 * @generated
	 */
	Document getEReference1();

	/**
	 * Sets the value of the '{@link defaultname.Document#getEReference1 <em>EReference1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference1</em>' reference.
	 * @see #getEReference1()
	 * @generated
	 */
	void setEReference1(Document value);

	/**
	 * Returns the value of the '<em><b>EReference2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference2</em>' reference.
	 * @see #setEReference2(Receiver)
	 * @see defaultname.DefaultnamePackage#getDocument_EReference2()
	 * @model
	 * @generated
	 */
	Receiver getEReference2();

	/**
	 * Sets the value of the '{@link defaultname.Document#getEReference2 <em>EReference2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference2</em>' reference.
	 * @see #getEReference2()
	 * @generated
	 */
	void setEReference2(Receiver value);

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deleteSection(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void changeSectionTitle(String id, String newTitle);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setMomento(Momento m);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createMomento();

} // Document
