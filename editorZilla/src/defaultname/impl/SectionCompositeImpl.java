/**
 */
package defaultname.impl;


import defaultname.DefaultnamePackage;
import defaultname.SectionComponent;
import defaultname.SectionComposite;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import java.util.UUID;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link defaultname.impl.SectionCompositeImpl#getSectionComponentList <em>Section Component List</em>}</li>
 *   <li>{@link defaultname.impl.SectionCompositeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link defaultname.impl.SectionCompositeImpl#getText <em>Text</em>}</li>
 *   <li>{@link defaultname.impl.SectionCompositeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SectionCompositeImpl extends SectionComponentImpl implements SectionComposite {
	/**
	 * The cached value of the '{@link #getSectionComponentList() <em>Section Component List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionComponentList()
	 * @generated
	 * @ordered
	 */
	protected EList<SectionComponent> sectionComponentList;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = "Section Register";

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionCompositeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DefaultnamePackage.Literals.SECTION_COMPOSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SectionComponent> getSectionComponentList() {
		if (sectionComponentList == null) {
			sectionComponentList = new EObjectResolvingEList<SectionComponent>(SectionComponent.class, this, DefaultnamePackage.SECTION_COMPOSITE__SECTION_COMPONENT_LIST);
		}
		return sectionComponentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.SECTION_COMPOSITE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.SECTION_COMPOSITE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getId() {
		if(id == null){
			id = UUID.randomUUID().toString();
		}
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.SECTION_COMPOSITE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void remove(SectionComponent sectionComponent) {
		if(sectionComponentList.contains(sectionComponent)){
			sectionComponentList.remove(sectionComponent);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void add(SectionComponent sectionComponent) {
		getSectionComponentList();
		sectionComponentList.add(sectionComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SectionComponent getChild(int index) {
		SectionComponent sectionComponent = null;
		try{
			sectionComponent = sectionComponentList.get(index);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("L'index n'existe pas dans la liste");
		}
		return sectionComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DefaultnamePackage.SECTION_COMPOSITE__SECTION_COMPONENT_LIST:
				return getSectionComponentList();
			case DefaultnamePackage.SECTION_COMPOSITE__TITLE:
				return getTitle();
			case DefaultnamePackage.SECTION_COMPOSITE__TEXT:
				return getText();
			case DefaultnamePackage.SECTION_COMPOSITE__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DefaultnamePackage.SECTION_COMPOSITE__SECTION_COMPONENT_LIST:
				getSectionComponentList().clear();
				getSectionComponentList().addAll((Collection<? extends SectionComponent>)newValue);
				return;
			case DefaultnamePackage.SECTION_COMPOSITE__TITLE:
				setTitle((String)newValue);
				return;
			case DefaultnamePackage.SECTION_COMPOSITE__TEXT:
				setText((String)newValue);
				return;
			case DefaultnamePackage.SECTION_COMPOSITE__ID:
				setId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DefaultnamePackage.SECTION_COMPOSITE__SECTION_COMPONENT_LIST:
				getSectionComponentList().clear();
				return;
			case DefaultnamePackage.SECTION_COMPOSITE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case DefaultnamePackage.SECTION_COMPOSITE__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case DefaultnamePackage.SECTION_COMPOSITE__ID:
				setId(ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DefaultnamePackage.SECTION_COMPOSITE__SECTION_COMPONENT_LIST:
				return sectionComponentList != null && !sectionComponentList.isEmpty();
			case DefaultnamePackage.SECTION_COMPOSITE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case DefaultnamePackage.SECTION_COMPOSITE__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case DefaultnamePackage.SECTION_COMPOSITE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return title;
	}

} //SectionCompositeImpl
