/**
 */
package defaultname;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Presse Papier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link defaultname.PressePapier#getTextSelected <em>Text Selected</em>}</li>
 *   <li>{@link defaultname.PressePapier#getPressePaper <em>Presse Paper</em>}</li>
 *   <li>{@link defaultname.PressePapier#getStartPosition <em>Start Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see defaultname.DefaultnamePackage#getPressePapier()
 * @model
 * @generated
 */
public interface PressePapier extends EObject {
	/**
	 * Returns the value of the '<em><b>Text Selected</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Selected</em>' attribute.
	 * @see #setTextSelected(String)
	 * @see defaultname.DefaultnamePackage#getPressePapier_TextSelected()
	 * @model default=""
	 * @generated
	 */
	String getTextSelected();

	/**
	 * Sets the value of the '{@link defaultname.PressePapier#getTextSelected <em>Text Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Selected</em>' attribute.
	 * @see #getTextSelected()
	 * @generated
	 */
	void setTextSelected(String value);

	/**
	 * Returns the value of the '<em><b>Presse Paper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presse Paper</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presse Paper</em>' reference.
	 * @see #setPressePaper(Document)
	 * @see defaultname.DefaultnamePackage#getPressePapier_PressePaper()
	 * @model
	 * @generated
	 */
	Document getPressePaper();

	/**
	 * Sets the value of the '{@link defaultname.PressePapier#getPressePaper <em>Presse Paper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presse Paper</em>' reference.
	 * @see #getPressePaper()
	 * @generated
	 */
	void setPressePaper(Document value);

	/**
	 * Returns the value of the '<em><b>Start Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Position</em>' attribute.
	 * @see #setStartPosition(int)
	 * @see defaultname.DefaultnamePackage#getPressePapier_StartPosition()
	 * @model
	 * @generated
	 */
	int getStartPosition();

	/**
	 * Sets the value of the '{@link defaultname.PressePapier#getStartPosition <em>Start Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Position</em>' attribute.
	 * @see #getStartPosition()
	 * @generated
	 */
	void setStartPosition(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void copyText(String textToCopy);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int moveText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String pasteText();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String applyMarkdownToText(String currentText);

} // PressePapier
