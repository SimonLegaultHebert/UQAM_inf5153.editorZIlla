/**
 */
package defaultname.impl;

import defaultname.DefaultnamePackage;
import defaultname.Document;

import defaultname.Momento;
import defaultname.PressePapier;
import defaultname.Receiver;
import defaultname.DefaultnameFactory;
import defaultname.Section;
import defaultname.SectionComponent;
import defaultname.SectionComposite;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link defaultname.impl.DocumentImpl#getName <em>Name</em>}</li>
 *   <li>{@link defaultname.impl.DocumentImpl#getRacine <em>Racine</em>}</li>
 *   <li>{@link defaultname.impl.DocumentImpl#getPressePapier <em>Presse Papier</em>}</li>
 *   <li>{@link defaultname.impl.DocumentImpl#getState <em>State</em>}</li>
 *   <li>{@link defaultname.impl.DocumentImpl#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link defaultname.impl.DocumentImpl#getEReference1 <em>EReference1</em>}</li>
 *   <li>{@link defaultname.impl.DocumentImpl#getEReference2 <em>EReference2</em>}</li>
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
	protected static final String NAME_EDEFAULT = "document";

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
	 * The cached value of the '{@link #getRacine() <em>Racine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRacine()
	 * @generated NOT
	 * @ordered
	 */
	protected SectionComponent racine = DefaultnameFactory.eINSTANCE.createSectionComposite();
	

	/**
	 * The cached value of the '{@link #getPressePapier() <em>Presse Papier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressePapier()
	 * @generated NOT
	 * @ordered
	 */
	protected PressePapier pressePapier = DefaultnameFactory.eINSTANCE.createPressePapier();


	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final Object STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected Object state = STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEReference0() <em>EReference0</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference0()
	 * @generated
	 * @ordered
	 */
	protected EList<Momento> eReference0;

	/**
	 * The cached value of the '{@link #getEReference1() <em>EReference1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference1()
	 * @generated
	 * @ordered
	 */
	protected Document eReference1;

	/**
	 * The cached value of the '{@link #getEReference2() <em>EReference2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference2()
	 * @generated
	 * @ordered
	 */
	protected Receiver eReference2;


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
	 * @generated
	 */
	public PressePapier getPressePapier() {
		if (pressePapier != null && pressePapier.eIsProxy()) {
			InternalEObject oldPressePapier = (InternalEObject)pressePapier;
			pressePapier = (PressePapier)eResolveProxy(oldPressePapier);
			if (pressePapier != oldPressePapier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DefaultnamePackage.DOCUMENT__PRESSE_PAPIER, oldPressePapier, pressePapier));
			}
		}
		return pressePapier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PressePapier basicGetPressePapier() {
		return pressePapier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressePapier(PressePapier newPressePapier) {
		PressePapier oldPressePapier = pressePapier;
		pressePapier = newPressePapier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.DOCUMENT__PRESSE_PAPIER, oldPressePapier, pressePapier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(Object newState) {
		Object oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.DOCUMENT__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Momento> getEReference0() {
		if (eReference0 == null) {
			eReference0 = new EObjectResolvingEList<Momento>(Momento.class, this, DefaultnamePackage.DOCUMENT__EREFERENCE0);
		}
		return eReference0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document getEReference1() {
		if (eReference1 != null && eReference1.eIsProxy()) {
			InternalEObject oldEReference1 = (InternalEObject)eReference1;
			eReference1 = (Document)eResolveProxy(oldEReference1);
			if (eReference1 != oldEReference1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DefaultnamePackage.DOCUMENT__EREFERENCE1, oldEReference1, eReference1));
			}
		}
		return eReference1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document basicGetEReference1() {
		return eReference1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference1(Document newEReference1) {
		Document oldEReference1 = eReference1;
		eReference1 = newEReference1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.DOCUMENT__EREFERENCE1, oldEReference1, eReference1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receiver getEReference2() {
		if (eReference2 != null && eReference2.eIsProxy()) {
			InternalEObject oldEReference2 = (InternalEObject)eReference2;
			eReference2 = (Receiver)eResolveProxy(oldEReference2);
			if (eReference2 != oldEReference2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DefaultnamePackage.DOCUMENT__EREFERENCE2, oldEReference2, eReference2));
			}
		}
		return eReference2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receiver basicGetEReference2() {
		return eReference2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference2(Receiver newEReference2) {
		Receiver oldEReference2 = eReference2;
		eReference2 = newEReference2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.DOCUMENT__EREFERENCE2, oldEReference2, eReference2));
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
	 * @generated NOT
	 */
	public void deleteSection(String id) {
		SectionComposite racineComposite = (SectionComposite)getRacine();
		EList<SectionComponent> sectionComponentList = racineComposite.getSectionComponentList();
		SectionComponent sectionToRemove = null;
		Section subsectionToRemove = null;
		for(SectionComponent rootChild : sectionComponentList){
			SectionComposite section = (SectionComposite)rootChild;
			if(section.getId().equals(id)){
				sectionToRemove = section;
			}else{
				EList<SectionComponent> subSectionList = section.getSectionComponentList();
				for(SectionComponent subSectionComponent : subSectionList){
					if(subSectionComponent.getId().equals(id)){
						subsectionToRemove = (Section)subSectionComponent;
						break;
					}
				}	
				if(subsectionToRemove != null){
					subSectionList.remove(subsectionToRemove);
					section.setSectionComponentList(subSectionList);
				}
			}
		}	
		
		if(sectionToRemove != null){
			sectionComponentList.remove(sectionToRemove);
		}		
		setRacine(racineComposite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	
	public void changeSectionTitle(String id, String newTitle) {
		SectionComposite racineComposite = (SectionComposite)getRacine();
		EList<SectionComponent> sectionComponentList = racineComposite.getSectionComponentList();
		for(SectionComponent rootChild : sectionComponentList){
			SectionComposite section = (SectionComposite)rootChild;
			if(section.getId().equals(id)){
				section.setTitle(newTitle);
			}else{
				EList<SectionComponent> subSectionList = section.getSectionComponentList();
				for(SectionComponent subSectionComponent : subSectionList){
					if(subSectionComponent.getId().equals(id)){
						Section subSection = (Section)subSectionComponent;
						subSection.setTitle(newTitle);
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
	public void setMomento(Momento m) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createMomento() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	//	public void changeSectionTitle(String id, String newTitle) {
//		SectionComposite racineComposite = (SectionComposite)getRacine();
//		EList<SectionComponent> sectionComponentList = racineComposite.getSectionComponentList();
//		for(int x = 0; x < sectionComponentList.size(); ++x){
//			SectionComposite section = (SectionComposite)sectionComponentList.get(x);
//			if(section.getId().equals(id)){
//				section.setTitle(newTitle);
//				sectionComponentList.set(x, section);
//			}else{
//				EList<SectionComponent> subSectionList = section.getSectionComponentList();
//				for(int i = 0; i < subSectionList.size(); ++i){
//					if(subSectionList.get(i).getId().equals(id)){
//						Section subSection = (Section)subSectionList.get(i);
//						subSection.setTitle(newTitle);
//						subSectionList.set(i, subSection);
//						break;
//					}
//				}			
//			}
//		}
//		racineComposite.setSectionComponentList(sectionComponentList);
//		setRacine(racineComposite);
//	}

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
			case DefaultnamePackage.DOCUMENT__RACINE:
				if (resolve) return getRacine();
				return basicGetRacine();
			case DefaultnamePackage.DOCUMENT__PRESSE_PAPIER:
				if (resolve) return getPressePapier();
				return basicGetPressePapier();
			case DefaultnamePackage.DOCUMENT__STATE:
				return getState();
			case DefaultnamePackage.DOCUMENT__EREFERENCE0:
				return getEReference0();
			case DefaultnamePackage.DOCUMENT__EREFERENCE1:
				if (resolve) return getEReference1();
				return basicGetEReference1();
			case DefaultnamePackage.DOCUMENT__EREFERENCE2:
				if (resolve) return getEReference2();
				return basicGetEReference2();
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
			case DefaultnamePackage.DOCUMENT__NAME:
				setName((String)newValue);
				return;
			case DefaultnamePackage.DOCUMENT__RACINE:
				setRacine((SectionComponent)newValue);
				return;
			case DefaultnamePackage.DOCUMENT__PRESSE_PAPIER:
				setPressePapier((PressePapier)newValue);
				return;
			case DefaultnamePackage.DOCUMENT__STATE:
				setState(newValue);
				return;
			case DefaultnamePackage.DOCUMENT__EREFERENCE0:
				getEReference0().clear();
				getEReference0().addAll((Collection<? extends Momento>)newValue);
				return;
			case DefaultnamePackage.DOCUMENT__EREFERENCE1:
				setEReference1((Document)newValue);
				return;
			case DefaultnamePackage.DOCUMENT__EREFERENCE2:
				setEReference2((Receiver)newValue);
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
			case DefaultnamePackage.DOCUMENT__RACINE:
				setRacine((SectionComponent)null);
				return;
			case DefaultnamePackage.DOCUMENT__PRESSE_PAPIER:
				setPressePapier((PressePapier)null);
				return;
			case DefaultnamePackage.DOCUMENT__STATE:
				setState(STATE_EDEFAULT);
				return;
			case DefaultnamePackage.DOCUMENT__EREFERENCE0:
				getEReference0().clear();
				return;
			case DefaultnamePackage.DOCUMENT__EREFERENCE1:
				setEReference1((Document)null);
				return;
			case DefaultnamePackage.DOCUMENT__EREFERENCE2:
				setEReference2((Receiver)null);
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
			case DefaultnamePackage.DOCUMENT__RACINE:
				return racine != null;
			case DefaultnamePackage.DOCUMENT__PRESSE_PAPIER:
				return pressePapier != null;
			case DefaultnamePackage.DOCUMENT__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case DefaultnamePackage.DOCUMENT__EREFERENCE0:
				return eReference0 != null && !eReference0.isEmpty();
			case DefaultnamePackage.DOCUMENT__EREFERENCE1:
				return eReference1 != null;
			case DefaultnamePackage.DOCUMENT__EREFERENCE2:
				return eReference2 != null;
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
		result.append(", state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //DocumentImpl
