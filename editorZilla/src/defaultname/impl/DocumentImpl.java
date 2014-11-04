/**
 */
package defaultname.impl;

import defaultname.DefaultnamePackage;
import defaultname.Document;

import defaultname.SectionComponent;
import org.eclipse.emf.common.notify.Notification;

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
 *   <li>{@link defaultname.impl.DocumentImpl#getCurrentSectionTitle <em>Current Section Title</em>}</li>
 *   <li>{@link defaultname.impl.DocumentImpl#getCurrentSectionText <em>Current Section Text</em>}</li>
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
	 * @generated
	 * @ordered
	 */
	protected SectionComponent racine;

	/**
	 * The default value of the '{@link #getCurrentSectionTitle() <em>Current Section Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSectionTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_SECTION_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentSectionTitle() <em>Current Section Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSectionTitle()
	 * @generated
	 * @ordered
	 */
	protected String currentSectionTitle = CURRENT_SECTION_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentSectionText() <em>Current Section Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSectionText()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_SECTION_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentSectionText() <em>Current Section Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSectionText()
	 * @generated
	 * @ordered
	 */
	protected String currentSectionText = CURRENT_SECTION_TEXT_EDEFAULT;

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
	 * @generated
	 */
	public String getCurrentSectionTitle() {
		return currentSectionTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentSectionTitle(String newCurrentSectionTitle) {
		String oldCurrentSectionTitle = currentSectionTitle;
		currentSectionTitle = newCurrentSectionTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.DOCUMENT__CURRENT_SECTION_TITLE, oldCurrentSectionTitle, currentSectionTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrentSectionText() {
		return currentSectionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentSectionText(String newCurrentSectionText) {
		String oldCurrentSectionText = currentSectionText;
		currentSectionText = newCurrentSectionText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.DOCUMENT__CURRENT_SECTION_TEXT, oldCurrentSectionText, currentSectionText));
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
			case DefaultnamePackage.DOCUMENT__CURRENT_SECTION_TITLE:
				return getCurrentSectionTitle();
			case DefaultnamePackage.DOCUMENT__CURRENT_SECTION_TEXT:
				return getCurrentSectionText();
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
			case DefaultnamePackage.DOCUMENT__CURRENT_SECTION_TITLE:
				setCurrentSectionTitle((String)newValue);
				return;
			case DefaultnamePackage.DOCUMENT__CURRENT_SECTION_TEXT:
				setCurrentSectionText((String)newValue);
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
			case DefaultnamePackage.DOCUMENT__CURRENT_SECTION_TITLE:
				setCurrentSectionTitle(CURRENT_SECTION_TITLE_EDEFAULT);
				return;
			case DefaultnamePackage.DOCUMENT__CURRENT_SECTION_TEXT:
				setCurrentSectionText(CURRENT_SECTION_TEXT_EDEFAULT);
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
			case DefaultnamePackage.DOCUMENT__CURRENT_SECTION_TITLE:
				return CURRENT_SECTION_TITLE_EDEFAULT == null ? currentSectionTitle != null : !CURRENT_SECTION_TITLE_EDEFAULT.equals(currentSectionTitle);
			case DefaultnamePackage.DOCUMENT__CURRENT_SECTION_TEXT:
				return CURRENT_SECTION_TEXT_EDEFAULT == null ? currentSectionText != null : !CURRENT_SECTION_TEXT_EDEFAULT.equals(currentSectionText);
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
		result.append(", currentSectionTitle: ");
		result.append(currentSectionTitle);
		result.append(", currentSectionText: ");
		result.append(currentSectionText);
		result.append(')');
		return result.toString();
	}

} //DocumentImpl
