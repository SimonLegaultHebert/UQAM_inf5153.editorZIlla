/**
 */
package defaultname.impl;


import defaultname.DefaultnameFactory;
import defaultname.DefaultnamePackage;
import defaultname.Document;
import defaultname.DocumentBuilder;
import defaultname.DocumentStrategy;
import defaultname.ExportStrategy;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link defaultname.impl.DocumentBuilderImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link defaultname.impl.DocumentBuilderImpl#getFilePath <em>File Path</em>}</li>
 *   <li>{@link defaultname.impl.DocumentBuilderImpl#getDocumentStrategy <em>Document Strategy</em>}</li>
 *   <li>{@link defaultname.impl.DocumentBuilderImpl#getExportStrategy <em>Export Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentBuilderImpl extends EObjectImpl implements DocumentBuilder {
	/**
	 * The cached value of the '{@link #getDocument() <em>Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected Document document;
	
	private static DocumentBuilder instance = null;
	
	public DocumentBuilder getInstance(){
		if(instance == null){
			instance = DefaultnameFactory.eINSTANCE.createDocumentBuilder();
		}		
		return instance;
	}

	/**
	 * The default value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_PATH_EDEFAULT = "DossierDefaut";

	/**
	 * The cached value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected String filePath = FILE_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDocumentStrategy() <em>Document Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentStrategy()
	 * @generated NOT
	 * @ordered
	 */
	protected DocumentStrategy documentStrategy = DefaultnameFactory.eINSTANCE.createXMIStrategy();

	/**
	 * The cached value of the '{@link #getExportStrategy() <em>Export Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportStrategy()
	 * @generated
	 * @ordered
	 */
	protected ExportStrategy exportStrategy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentBuilderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DefaultnamePackage.Literals.DOCUMENT_BUILDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document getDocument() {
		if (document != null && document.eIsProxy()) {
			InternalEObject oldDocument = (InternalEObject)document;
			document = (Document)eResolveProxy(oldDocument);
			if (document != oldDocument) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DefaultnamePackage.DOCUMENT_BUILDER__DOCUMENT, oldDocument, document));
			}
		}
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document basicGetDocument() {
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocument(Document newDocument) {
		Document oldDocument = document;
		document = newDocument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.DOCUMENT_BUILDER__DOCUMENT, oldDocument, document));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilePath(String newFilePath) {
		String oldFilePath = filePath;
		filePath = newFilePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.DOCUMENT_BUILDER__FILE_PATH, oldFilePath, filePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentStrategy getDocumentStrategy() {
		return documentStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentStrategy(DocumentStrategy newDocumentStrategy, NotificationChain msgs) {
		DocumentStrategy oldDocumentStrategy = documentStrategy;
		documentStrategy = newDocumentStrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DefaultnamePackage.DOCUMENT_BUILDER__DOCUMENT_STRATEGY, oldDocumentStrategy, newDocumentStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentStrategy(DocumentStrategy newDocumentStrategy) {
		if (newDocumentStrategy != documentStrategy) {
			NotificationChain msgs = null;
			if (documentStrategy != null)
				msgs = ((InternalEObject)documentStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DefaultnamePackage.DOCUMENT_BUILDER__DOCUMENT_STRATEGY, null, msgs);
			if (newDocumentStrategy != null)
				msgs = ((InternalEObject)newDocumentStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DefaultnamePackage.DOCUMENT_BUILDER__DOCUMENT_STRATEGY, null, msgs);
			msgs = basicSetDocumentStrategy(newDocumentStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.DOCUMENT_BUILDER__DOCUMENT_STRATEGY, newDocumentStrategy, newDocumentStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportStrategy getExportStrategy() {
		return exportStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExportStrategy(ExportStrategy newExportStrategy, NotificationChain msgs) {
		ExportStrategy oldExportStrategy = exportStrategy;
		exportStrategy = newExportStrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DefaultnamePackage.DOCUMENT_BUILDER__EXPORT_STRATEGY, oldExportStrategy, newExportStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExportStrategy(ExportStrategy newExportStrategy) {
		if (newExportStrategy != exportStrategy) {
			NotificationChain msgs = null;
			if (exportStrategy != null)
				msgs = ((InternalEObject)exportStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DefaultnamePackage.DOCUMENT_BUILDER__EXPORT_STRATEGY, null, msgs);
			if (newExportStrategy != null)
				msgs = ((InternalEObject)newExportStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DefaultnamePackage.DOCUMENT_BUILDER__EXPORT_STRATEGY, null, msgs);
			msgs = basicSetExportStrategy(newExportStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DefaultnamePackage.DOCUMENT_BUILDER__EXPORT_STRATEGY, newExportStrategy, newExportStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Document load(String filePath) {
		Document newDocument = documentStrategy.load(filePath);
		return newDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void export(String documentName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void save(Document document) {
		documentStrategy.save(document, getFilePath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DefaultnamePackage.DOCUMENT_BUILDER__DOCUMENT_STRATEGY:
				return basicSetDocumentStrategy(null, msgs);
			case DefaultnamePackage.DOCUMENT_BUILDER__EXPORT_STRATEGY:
				return basicSetExportStrategy(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DefaultnamePackage.DOCUMENT_BUILDER__DOCUMENT:
				if (resolve) return getDocument();
				return basicGetDocument();
			case DefaultnamePackage.DOCUMENT_BUILDER__FILE_PATH:
				return getFilePath();
			case DefaultnamePackage.DOCUMENT_BUILDER__DOCUMENT_STRATEGY:
				return getDocumentStrategy();
			case DefaultnamePackage.DOCUMENT_BUILDER__EXPORT_STRATEGY:
				return getExportStrategy();
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
			case DefaultnamePackage.DOCUMENT_BUILDER__DOCUMENT:
				setDocument((Document)newValue);
				return;
			case DefaultnamePackage.DOCUMENT_BUILDER__FILE_PATH:
				setFilePath((String)newValue);
				return;
			case DefaultnamePackage.DOCUMENT_BUILDER__DOCUMENT_STRATEGY:
				setDocumentStrategy((DocumentStrategy)newValue);
				return;
			case DefaultnamePackage.DOCUMENT_BUILDER__EXPORT_STRATEGY:
				setExportStrategy((ExportStrategy)newValue);
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
			case DefaultnamePackage.DOCUMENT_BUILDER__DOCUMENT:
				setDocument((Document)null);
				return;
			case DefaultnamePackage.DOCUMENT_BUILDER__FILE_PATH:
				setFilePath(FILE_PATH_EDEFAULT);
				return;
			case DefaultnamePackage.DOCUMENT_BUILDER__DOCUMENT_STRATEGY:
				setDocumentStrategy((DocumentStrategy)null);
				return;
			case DefaultnamePackage.DOCUMENT_BUILDER__EXPORT_STRATEGY:
				setExportStrategy((ExportStrategy)null);
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
			case DefaultnamePackage.DOCUMENT_BUILDER__DOCUMENT:
				return document != null;
			case DefaultnamePackage.DOCUMENT_BUILDER__FILE_PATH:
				return FILE_PATH_EDEFAULT == null ? filePath != null : !FILE_PATH_EDEFAULT.equals(filePath);
			case DefaultnamePackage.DOCUMENT_BUILDER__DOCUMENT_STRATEGY:
				return documentStrategy != null;
			case DefaultnamePackage.DOCUMENT_BUILDER__EXPORT_STRATEGY:
				return exportStrategy != null;
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
		result.append(" (filePath: ");
		result.append(filePath);
		result.append(')');
		return result.toString();
	}

} //DocumentBuilderImpl
