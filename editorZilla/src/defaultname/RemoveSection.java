/**
 */
package defaultname;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link defaultname.RemoveSection#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link defaultname.RemoveSection#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see defaultname.DefaultnamePackage#getRemoveSection()
 * @model
 * @generated
 */
public interface RemoveSection extends Receiver, Command {
	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' reference.
	 * @see #setEReference0(Receiver)
	 * @see defaultname.DefaultnamePackage#getRemoveSection_EReference0()
	 * @model
	 * @generated
	 */
	Receiver getEReference0();

	/**
	 * Sets the value of the '{@link defaultname.RemoveSection#getEReference0 <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference0</em>' reference.
	 * @see #getEReference0()
	 * @generated
	 */
	void setEReference0(Receiver value);

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
	 * @see defaultname.DefaultnamePackage#getRemoveSection_State()
	 * @model
	 * @generated
	 */
	Object getState();

	/**
	 * Sets the value of the '{@link defaultname.RemoveSection#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

} // RemoveSection
