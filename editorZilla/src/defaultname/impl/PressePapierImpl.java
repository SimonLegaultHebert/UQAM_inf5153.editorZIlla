/**
 */
package defaultname.impl;

import defaultname.DefaultnamePackage;
import defaultname.PressePapier;
import defaultname.SectionComponent;

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
 *   <li>{@link defaultname.impl.PressePapierImpl#getContient <em>Contient</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PressePapierImpl extends EObjectImpl implements PressePapier {
	/**
	 * The cached value of the '{@link #getContient() <em>Contient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContient()
	 * @generated
	 * @ordered
	 */
	protected SectionComponent contient;

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
	public SectionComponent getContient() {
		if (contient != null && contient.eIsProxy()) {
			InternalEObject oldContient = (InternalEObject)contient;
			contient = (SectionComponent)eResolveProxy(oldContient);
			if (contient != oldContient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DefaultnamePackage.PRESSE_PAPIER__CONTIENT, oldContient, contient));
			}
		}
		return contient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionComponent basicGetContient() {
		return contient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContient(SectionComponent newContient) {
		SectionComponent oldContient = contient;
		contient = newContient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.PRESSE_PAPIER__CONTIENT, oldContient, contient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DefaultnamePackage.PRESSE_PAPIER__CONTIENT:
				if (resolve) return getContient();
				return basicGetContient();
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
			case DefaultnamePackage.PRESSE_PAPIER__CONTIENT:
				setContient((SectionComponent)newValue);
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
			case DefaultnamePackage.PRESSE_PAPIER__CONTIENT:
				setContient((SectionComponent)null);
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
			case DefaultnamePackage.PRESSE_PAPIER__CONTIENT:
				return contient != null;
		}
		return super.eIsSet(featureID);
	}

} //PressePapierImpl
