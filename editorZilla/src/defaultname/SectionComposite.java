/**
 */
package defaultname;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link defaultname.SectionComposite#getSectionComponentList <em>Section Component List</em>}</li>
 *   <li>{@link defaultname.SectionComposite#getTitle <em>Title</em>}</li>
 *   <li>{@link defaultname.SectionComposite#getText <em>Text</em>}</li>
 *   <li>{@link defaultname.SectionComposite#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see defaultname.DefaultnamePackage#getSectionComposite()
 * @model
 * @generated
 */
public interface SectionComposite extends SectionComponent {
	/**
	 * Returns the value of the '<em><b>Section Component List</b></em>' reference list.
	 * The list contents are of type {@link defaultname.SectionComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section Component List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Component List</em>' reference list.
	 * @see defaultname.DefaultnamePackage#getSectionComposite_SectionComponentList()
	 * @model
	 * @generated
	 */
	EList<SectionComponent> getSectionComponentList();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * The default value is <code>"Section"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see defaultname.DefaultnamePackage#getSectionComposite_Title()
	 * @model default="Section"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link defaultname.SectionComposite#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see defaultname.DefaultnamePackage#getSectionComposite_Text()
	 * @model default=""
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link defaultname.SectionComposite#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see defaultname.DefaultnamePackage#getSectionComposite_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link defaultname.SectionComposite#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void remove(SectionComponent sectionComponent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void add(SectionComponent sectionComponent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SectionComponent getChild(int index);

} // SectionComposite
