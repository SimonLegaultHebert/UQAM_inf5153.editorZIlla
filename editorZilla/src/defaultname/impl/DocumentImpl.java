/**
 */
package defaultname.impl;

import defaultname.DefaultnamePackage;
import defaultname.Document;

import defaultname.DefaultnameFactory;
import defaultname.Section;
import defaultname.SectionComponent;
import defaultname.SectionComposite;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link defaultname.impl.DocumentImpl#getName <em>Name</em>}</li>
 *   <li>{@link defaultname.impl.DocumentImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link defaultname.impl.DocumentImpl#getRacine <em>Racine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentImpl extends DocumentBuilderImpl implements Document {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRacine() <em>Racine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRacine()
	 * @generated NOT
	 * @ordered
	 */
	protected SectionComponent racine = DefaultnameFactory.eINSTANCE.createSectionComposite();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DefaultnamePackage.Literals.DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.DOCUMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.DOCUMENT__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionComponent getRacine() {
		if (racine != null && racine.eIsProxy()) {
			InternalEObject oldRacine = (InternalEObject)racine;
			racine = (SectionComponent)eResolveProxy(oldRacine);
			if (racine != oldRacine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DefaultnamePackage.DOCUMENT__RACINE, oldRacine, racine));
			}
		}
		return racine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionComponent basicGetRacine() {
		return racine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRacine(SectionComponent newRacine) {
		SectionComponent oldRacine = racine;
		racine = newRacine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.DOCUMENT__RACINE, oldRacine, racine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SectionComponent getSectionComponent() {
		return racine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SectionComposite addSection(String title, String text) {
		SectionComposite newSection = DefaultnameFactory.eINSTANCE.createSectionComposite();
		SectionComposite racineComposite = (SectionComposite)getRacine();
		newSection.setTitle(title);
		newSection.setText(text);		
		racineComposite.add(newSection);
		setRacine(racineComposite);
		return newSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Section addSubsection(String id, String title, String text) {
		Section newSubsection = DefaultnameFactory.eINSTANCE.createSection();
		SectionComposite racineComposite = (SectionComposite)getRacine();
		EList<SectionComponent> sectionComponentList = racineComposite.getSectionComponentList();
		SectionComposite childSection = null;
		for(SectionComponent sectionWithId : sectionComponentList){
			if(sectionWithId.getId().equals(id)){
				childSection = (SectionComposite)sectionWithId;
			}
			
		}
	
		newSubsection.setTitle(title);
		newSubsection.setText(text);
		
		childSection.add(newSubsection);	
		setRacine(racineComposite);
		return newSubsection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getContent(String id) {
		SectionComposite racineComposite = (SectionComposite)getRacine();
		EList<SectionComponent> sectionComponentList = racineComposite.getSectionComponentList();
		String currentText = "";
		for(SectionComponent rootChild : sectionComponentList){
			SectionComposite section = (SectionComposite)rootChild;
			if(section.getId().equals(id)){
				currentText = section.getText();
			}else{
				EList<SectionComponent> subSectionList = section.getSectionComponentList();
				for(SectionComponent subSectionComponent : subSectionList){
					if(subSectionComponent.getId().equals(id)){
						currentText = subSectionComponent.getText();
						break;
					}
				}
			}
		}
		return currentText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void saveText(String id, String currentText) {
		SectionComposite racineComposite = (SectionComposite)getRacine();
		EList<SectionComponent> sectionComponentList = racineComposite.getSectionComponentList();
		for(SectionComponent rootChild : sectionComponentList){
			SectionComposite section = (SectionComposite)rootChild;
			if(section.getId().equals(id)){
				section.setText(currentText);
			}else{
				EList<SectionComponent> subSectionList = section.getSectionComponentList();
				for(SectionComponent subSectionComponent : subSectionList){
					if(subSectionComponent.getId().equals(id)){
						Section subSection = (Section)subSectionComponent;
						subSection.setText(currentText);
						break;
					}
				}
			}
		}
		setRacine(racineComposite);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void save(Document document, String filePath) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DefaultnamePackage.DOCUMENT__NAME:
				return getName();
			case DefaultnamePackage.DOCUMENT__FORMAT:
				return getFormat();
			case DefaultnamePackage.DOCUMENT__RACINE:
				if (resolve) return getRacine();
				return basicGetRacine();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DefaultnamePackage.DOCUMENT__NAME:
				setName((String)newValue);
				return;
			case DefaultnamePackage.DOCUMENT__FORMAT:
				setFormat((String)newValue);
				return;
			case DefaultnamePackage.DOCUMENT__RACINE:
				setRacine((SectionComponent)newValue);
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
			case DefaultnamePackage.DOCUMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DefaultnamePackage.DOCUMENT__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case DefaultnamePackage.DOCUMENT__RACINE:
				setRacine((SectionComponent)null);
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
			case DefaultnamePackage.DOCUMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DefaultnamePackage.DOCUMENT__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case DefaultnamePackage.DOCUMENT__RACINE:
				return racine != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", format: ");
		result.append(format);
		result.append(')');
		return result.toString();
	}

} //DocumentImpl
