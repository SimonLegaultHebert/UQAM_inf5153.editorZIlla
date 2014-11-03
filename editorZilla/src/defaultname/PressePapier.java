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
 *   <li>{@link defaultname.PressePapier#getContient <em>Contient</em>}</li>
 * </ul>
 * </p>
 *
 * @see defaultname.DefaultnamePackage#getPressePapier()
 * @model
 * @generated
 */
public interface PressePapier extends EObject {
	/**
	 * Returns the value of the '<em><b>Contient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contient</em>' reference.
	 * @see #setContient(SectionComponent)
	 * @see defaultname.DefaultnamePackage#getPressePapier_Contient()
	 * @model
	 * @generated
	 */
	SectionComponent getContient();

	/**
	 * Sets the value of the '{@link defaultname.PressePapier#getContient <em>Contient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contient</em>' reference.
	 * @see #getContient()
	 * @generated
	 */
	void setContient(SectionComponent value);

} // PressePapier
