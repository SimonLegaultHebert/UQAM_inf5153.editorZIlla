/**
 */
package defaultname.impl;

import defaultname.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DefaultnameFactoryImpl extends EFactoryImpl implements DefaultnameFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DefaultnameFactory init() {
		try {
			DefaultnameFactory theDefaultnameFactory = (DefaultnameFactory)EPackage.Registry.INSTANCE.getEFactory("http://defaultname/1.0"); 
			if (theDefaultnameFactory != null) {
				return theDefaultnameFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DefaultnameFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultnameFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DefaultnamePackage.SECTION_COMPOSITE: return createSectionComposite();
			case DefaultnamePackage.SECTION: return createSection();
			case DefaultnamePackage.DOCUMENT: return createDocument();
			case DefaultnamePackage.DOCUMENT_BUILDER: return createDocumentBuilder();
			case DefaultnamePackage.XMI_STRATEGY: return createXMIStrategy();
			case DefaultnamePackage.PRESSE_PAPIER: return createPressePapier();
			case DefaultnamePackage.HTML_STRATEGY: return createHTMLStrategy();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionComposite createSectionComposite() {
		SectionCompositeImpl sectionComposite = new SectionCompositeImpl();
		return sectionComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentBuilder createDocumentBuilder() {
		DocumentBuilderImpl documentBuilder = new DocumentBuilderImpl();
		return documentBuilder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMIStrategy createXMIStrategy() {
		XMIStrategyImpl xmiStrategy = new XMIStrategyImpl();
		return xmiStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PressePapier createPressePapier() {
		PressePapierImpl pressePapier = new PressePapierImpl();
		return pressePapier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTMLStrategy createHTMLStrategy() {
		HTMLStrategyImpl htmlStrategy = new HTMLStrategyImpl();
		return htmlStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultnamePackage getDefaultnamePackage() {
		return (DefaultnamePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DefaultnamePackage getPackage() {
		return DefaultnamePackage.eINSTANCE;
	}

} //DefaultnameFactoryImpl
