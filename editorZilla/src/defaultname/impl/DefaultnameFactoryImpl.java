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
			case DefaultnamePackage.MOMENTO: return createMomento();
			case DefaultnamePackage.CARETAKER: return createCaretaker();
			case DefaultnamePackage.RECEIVER: return createReceiver();
			case DefaultnamePackage.ADD_SECTION: return createaddSection();
			case DefaultnamePackage.REMOVE_SECTION: return createRemoveSection();
			case DefaultnamePackage.COMPOSITE_COMMAND: return createCompositeCommand();
			case DefaultnamePackage.COMMAND: return createCommand();
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
	public Momento createMomento() {
		MomentoImpl momento = new MomentoImpl();
		return momento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Caretaker createCaretaker() {
		CaretakerImpl caretaker = new CaretakerImpl();
		return caretaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receiver createReceiver() {
		ReceiverImpl receiver = new ReceiverImpl();
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public addSection createaddSection() {
		addSectionImpl addSection = new addSectionImpl();
		return addSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveSection createRemoveSection() {
		RemoveSectionImpl removeSection = new RemoveSectionImpl();
		return removeSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeCommand createCompositeCommand() {
		CompositeCommandImpl compositeCommand = new CompositeCommandImpl();
		return compositeCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command createCommand() {
		CommandImpl command = new CommandImpl();
		return command;
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
