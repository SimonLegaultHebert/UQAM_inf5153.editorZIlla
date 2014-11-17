/**
 */
package defaultname.impl;

import defaultname.DefaultnamePackage;
import defaultname.Document;
import defaultname.PressePapier;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presse Papier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link defaultname.impl.PressePapierImpl#getTextSelected <em>Text Selected</em>}</li>
 *   <li>{@link defaultname.impl.PressePapierImpl#getPressePaper <em>Presse Paper</em>}</li>
 *   <li>{@link defaultname.impl.PressePapierImpl#getStartPosition <em>Start Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PressePapierImpl extends EObjectImpl implements PressePapier {
	/**
	 * The default value of the '{@link #getTextSelected() <em>Text Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextSelected()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_SELECTED_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTextSelected() <em>Text Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextSelected()
	 * @generated
	 * @ordered
	 */
	protected String textSelected = TEXT_SELECTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPressePaper() <em>Presse Paper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressePaper()
	 * @generated
	 * @ordered
	 */
	protected Document pressePaper;

	/**
	 * The default value of the '{@link #getStartPosition() <em>Start Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int START_POSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartPosition() <em>Start Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPosition()
	 * @generated
	 * @ordered
	 */
	protected int startPosition = START_POSITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PressePapierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DefaultnamePackage.Literals.PRESSE_PAPIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextSelected() {
		return textSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextSelected(String newTextSelected) {
		String oldTextSelected = textSelected;
		textSelected = newTextSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.PRESSE_PAPIER__TEXT_SELECTED, oldTextSelected, textSelected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document getPressePaper() {
		if (pressePaper != null && pressePaper.eIsProxy()) {
			InternalEObject oldPressePaper = (InternalEObject)pressePaper;
			pressePaper = (Document)eResolveProxy(oldPressePaper);
			if (pressePaper != oldPressePaper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DefaultnamePackage.PRESSE_PAPIER__PRESSE_PAPER, oldPressePaper, pressePaper));
			}
		}
		return pressePaper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document basicGetPressePaper() {
		return pressePaper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressePaper(Document newPressePaper) {
		Document oldPressePaper = pressePaper;
		pressePaper = newPressePaper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.PRESSE_PAPIER__PRESSE_PAPER, oldPressePaper, pressePaper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartPosition() {
		return startPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartPosition(int newStartPosition) {
		int oldStartPosition = startPosition;
		startPosition = newStartPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.PRESSE_PAPIER__START_POSITION, oldStartPosition, startPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void copyText(String textToCopy) {
		textSelected = textToCopy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int moveText() {
		return startPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String pasteText() {
		return textSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String applyMarkdownToText(String currentText) {
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
			case DefaultnamePackage.PRESSE_PAPIER__TEXT_SELECTED:
				return getTextSelected();
			case DefaultnamePackage.PRESSE_PAPIER__PRESSE_PAPER:
				if (resolve) return getPressePaper();
				return basicGetPressePaper();
			case DefaultnamePackage.PRESSE_PAPIER__START_POSITION:
				return getStartPosition();
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
			case DefaultnamePackage.PRESSE_PAPIER__TEXT_SELECTED:
				setTextSelected((String)newValue);
				return;
			case DefaultnamePackage.PRESSE_PAPIER__PRESSE_PAPER:
				setPressePaper((Document)newValue);
				return;
			case DefaultnamePackage.PRESSE_PAPIER__START_POSITION:
				setStartPosition((Integer)newValue);
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
			case DefaultnamePackage.PRESSE_PAPIER__TEXT_SELECTED:
				setTextSelected(TEXT_SELECTED_EDEFAULT);
				return;
			case DefaultnamePackage.PRESSE_PAPIER__PRESSE_PAPER:
				setPressePaper((Document)null);
				return;
			case DefaultnamePackage.PRESSE_PAPIER__START_POSITION:
				setStartPosition(START_POSITION_EDEFAULT);
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
			case DefaultnamePackage.PRESSE_PAPIER__TEXT_SELECTED:
				return TEXT_SELECTED_EDEFAULT == null ? textSelected != null : !TEXT_SELECTED_EDEFAULT.equals(textSelected);
			case DefaultnamePackage.PRESSE_PAPIER__PRESSE_PAPER:
				return pressePaper != null;
			case DefaultnamePackage.PRESSE_PAPIER__START_POSITION:
				return startPosition != START_POSITION_EDEFAULT;
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
		result.append(" (textSelected: ");
		result.append(textSelected);
		result.append(", startPosition: ");
		result.append(startPosition);
		result.append(')');
		return result.toString();
	}

} //PressePapierImpl
