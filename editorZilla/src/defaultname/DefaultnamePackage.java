/**
 */
package defaultname;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see defaultname.DefaultnameFactory
 * @model kind="package"
 * @generated
 */
public interface DefaultnamePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "defaultname";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://defaultname/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "defaultname";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DefaultnamePackage eINSTANCE = defaultname.impl.DefaultnamePackageImpl.init();

	/**
	 * The meta object id for the '{@link defaultname.impl.SectionComponentImpl <em>Section Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see defaultname.impl.SectionComponentImpl
	 * @see defaultname.impl.DefaultnamePackageImpl#getSectionComponent()
	 * @generated
	 */
	int SECTION_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Section Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link defaultname.impl.SectionCompositeImpl <em>Section Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see defaultname.impl.SectionCompositeImpl
	 * @see defaultname.impl.DefaultnamePackageImpl#getSectionComposite()
	 * @generated
	 */
	int SECTION_COMPOSITE = 1;

	/**
	 * The feature id for the '<em><b>Section Component List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_COMPOSITE__SECTION_COMPONENT_LIST = SECTION_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_COMPOSITE__TITLE = SECTION_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_COMPOSITE__TEXT = SECTION_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_COMPOSITE__ID = SECTION_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Section Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_COMPOSITE_FEATURE_COUNT = SECTION_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link defaultname.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see defaultname.impl.SectionImpl
	 * @see defaultname.impl.DefaultnamePackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TITLE = SECTION_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TEXT = SECTION_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__ID = SECTION_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = SECTION_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link defaultname.impl.DocumentBuilderImpl <em>Document Builder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see defaultname.impl.DocumentBuilderImpl
	 * @see defaultname.impl.DefaultnamePackageImpl#getDocumentBuilder()
	 * @generated
	 */
	int DOCUMENT_BUILDER = 4;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_BUILDER__DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_BUILDER__FILE_PATH = 1;

	/**
	 * The feature id for the '<em><b>Document Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_BUILDER__DOCUMENT_STRATEGY = 2;

	/**
	 * The feature id for the '<em><b>Export Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_BUILDER__EXPORT_STRATEGY = 3;

	/**
	 * The number of structural features of the '<em>Document Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_BUILDER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link defaultname.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see defaultname.impl.DocumentImpl
	 * @see defaultname.impl.DefaultnamePackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 3;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DOCUMENT = DOCUMENT_BUILDER__DOCUMENT;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__FILE_PATH = DOCUMENT_BUILDER__FILE_PATH;

	/**
	 * The feature id for the '<em><b>Document Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DOCUMENT_STRATEGY = DOCUMENT_BUILDER__DOCUMENT_STRATEGY;

	/**
	 * The feature id for the '<em><b>Export Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__EXPORT_STRATEGY = DOCUMENT_BUILDER__EXPORT_STRATEGY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = DOCUMENT_BUILDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Racine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__RACINE = DOCUMENT_BUILDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Presse Papier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__PRESSE_PAPIER = DOCUMENT_BUILDER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__STATE = DOCUMENT_BUILDER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__EREFERENCE0 = DOCUMENT_BUILDER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EReference1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__EREFERENCE1 = DOCUMENT_BUILDER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>EReference2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__EREFERENCE2 = DOCUMENT_BUILDER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = DOCUMENT_BUILDER_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link defaultname.DocumentStrategy <em>Document Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see defaultname.DocumentStrategy
	 * @see defaultname.impl.DefaultnamePackageImpl#getDocumentStrategy()
	 * @generated
	 */
	int DOCUMENT_STRATEGY = 5;

	/**
	 * The number of structural features of the '<em>Document Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_STRATEGY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link defaultname.impl.XMIStrategyImpl <em>XMI Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see defaultname.impl.XMIStrategyImpl
	 * @see defaultname.impl.DefaultnamePackageImpl#getXMIStrategy()
	 * @generated
	 */
	int XMI_STRATEGY = 6;

	/**
	 * The number of structural features of the '<em>XMI Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMI_STRATEGY_FEATURE_COUNT = DOCUMENT_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link defaultname.impl.PressePapierImpl <em>Presse Papier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see defaultname.impl.PressePapierImpl
	 * @see defaultname.impl.DefaultnamePackageImpl#getPressePapier()
	 * @generated
	 */
	int PRESSE_PAPIER = 7;

	/**
	 * The feature id for the '<em><b>Text Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSE_PAPIER__TEXT_SELECTED = 0;

	/**
	 * The feature id for the '<em><b>Presse Paper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSE_PAPIER__PRESSE_PAPER = 1;

	/**
	 * The feature id for the '<em><b>Start Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSE_PAPIER__START_POSITION = 2;

	/**
	 * The number of structural features of the '<em>Presse Papier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSE_PAPIER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link defaultname.ExportStrategy <em>Export Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see defaultname.ExportStrategy
	 * @see defaultname.impl.DefaultnamePackageImpl#getExportStrategy()
	 * @generated
	 */
	int EXPORT_STRATEGY = 8;

	/**
	 * The number of structural features of the '<em>Export Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPORT_STRATEGY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link defaultname.impl.HTMLStrategyImpl <em>HTML Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see defaultname.impl.HTMLStrategyImpl
	 * @see defaultname.impl.DefaultnamePackageImpl#getHTMLStrategy()
	 * @generated
	 */
	int HTML_STRATEGY = 9;

	/**
	 * The number of structural features of the '<em>HTML Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_STRATEGY_FEATURE_COUNT = EXPORT_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link defaultname.impl.MomentoImpl <em>Momento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see defaultname.impl.MomentoImpl
	 * @see defaultname.impl.DefaultnamePackageImpl#getMomento()
	 * @generated
	 */
	int MOMENTO = 10;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOMENTO__STATE = 0;

	/**
	 * The number of structural features of the '<em>Momento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOMENTO_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link defaultname.impl.CaretakerImpl <em>Caretaker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see defaultname.impl.CaretakerImpl
	 * @see defaultname.impl.DefaultnamePackageImpl#getCaretaker()
	 * @generated
	 */
	int CARETAKER = 11;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARETAKER__EREFERENCE0 = 0;

	/**
	 * The number of structural features of the '<em>Caretaker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARETAKER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link defaultname.impl.ReceiverImpl <em>Receiver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see defaultname.impl.ReceiverImpl
	 * @see defaultname.impl.DefaultnamePackageImpl#getReceiver()
	 * @generated
	 */
	int RECEIVER = 12;

	/**
	 * The number of structural features of the '<em>Receiver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link defaultname.impl.addSectionImpl <em>add Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see defaultname.impl.addSectionImpl
	 * @see defaultname.impl.DefaultnamePackageImpl#getaddSection()
	 * @generated
	 */
	int ADD_SECTION = 13;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SECTION__EREFERENCE0 = RECEIVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EReference1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SECTION__EREFERENCE1 = RECEIVER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SECTION__STATE = RECEIVER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>add Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SECTION_FEATURE_COUNT = RECEIVER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link defaultname.impl.RemoveSectionImpl <em>Remove Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see defaultname.impl.RemoveSectionImpl
	 * @see defaultname.impl.DefaultnamePackageImpl#getRemoveSection()
	 * @generated
	 */
	int REMOVE_SECTION = 14;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_SECTION__EREFERENCE0 = RECEIVER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_SECTION__STATE = RECEIVER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Remove Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_SECTION_FEATURE_COUNT = RECEIVER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link defaultname.impl.CompositeCommandImpl <em>Composite Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see defaultname.impl.CompositeCommandImpl
	 * @see defaultname.impl.DefaultnamePackageImpl#getCompositeCommand()
	 * @generated
	 */
	int COMPOSITE_COMMAND = 15;

	/**
	 * The number of structural features of the '<em>Composite Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMMAND_FEATURE_COUNT = RECEIVER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link defaultname.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see defaultname.impl.CommandImpl
	 * @see defaultname.impl.DefaultnamePackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 16;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link defaultname.SectionComponent <em>Section Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section Component</em>'.
	 * @see defaultname.SectionComponent
	 * @generated
	 */
	EClass getSectionComponent();

	/**
	 * Returns the meta object for class '{@link defaultname.SectionComposite <em>Section Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section Composite</em>'.
	 * @see defaultname.SectionComposite
	 * @generated
	 */
	EClass getSectionComposite();

	/**
	 * Returns the meta object for the reference list '{@link defaultname.SectionComposite#getSectionComponentList <em>Section Component List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Section Component List</em>'.
	 * @see defaultname.SectionComposite#getSectionComponentList()
	 * @see #getSectionComposite()
	 * @generated
	 */
	EReference getSectionComposite_SectionComponentList();

	/**
	 * Returns the meta object for the attribute '{@link defaultname.SectionComposite#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see defaultname.SectionComposite#getTitle()
	 * @see #getSectionComposite()
	 * @generated
	 */
	EAttribute getSectionComposite_Title();

	/**
	 * Returns the meta object for the attribute '{@link defaultname.SectionComposite#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see defaultname.SectionComposite#getText()
	 * @see #getSectionComposite()
	 * @generated
	 */
	EAttribute getSectionComposite_Text();

	/**
	 * Returns the meta object for the attribute '{@link defaultname.SectionComposite#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see defaultname.SectionComposite#getId()
	 * @see #getSectionComposite()
	 * @generated
	 */
	EAttribute getSectionComposite_Id();

	/**
	 * Returns the meta object for class '{@link defaultname.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see defaultname.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the attribute '{@link defaultname.Section#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see defaultname.Section#getTitle()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Title();

	/**
	 * Returns the meta object for the attribute '{@link defaultname.Section#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see defaultname.Section#getText()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Text();

	/**
	 * Returns the meta object for the attribute '{@link defaultname.Section#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see defaultname.Section#getId()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Id();

	/**
	 * Returns the meta object for class '{@link defaultname.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see defaultname.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the attribute '{@link defaultname.Document#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see defaultname.Document#getName()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Name();

	/**
	 * Returns the meta object for the reference '{@link defaultname.Document#getRacine <em>Racine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Racine</em>'.
	 * @see defaultname.Document#getRacine()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Racine();

	/**
	 * Returns the meta object for the reference '{@link defaultname.Document#getPressePapier <em>Presse Papier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Presse Papier</em>'.
	 * @see defaultname.Document#getPressePapier()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_PressePapier();

	/**
	 * Returns the meta object for the attribute '{@link defaultname.Document#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see defaultname.Document#getState()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_State();

	/**
	 * Returns the meta object for the reference list '{@link defaultname.Document#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EReference0</em>'.
	 * @see defaultname.Document#getEReference0()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_EReference0();

	/**
	 * Returns the meta object for the reference '{@link defaultname.Document#getEReference1 <em>EReference1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference1</em>'.
	 * @see defaultname.Document#getEReference1()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_EReference1();

	/**
	 * Returns the meta object for the reference '{@link defaultname.Document#getEReference2 <em>EReference2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference2</em>'.
	 * @see defaultname.Document#getEReference2()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_EReference2();

	/**
	 * Returns the meta object for class '{@link defaultname.DocumentBuilder <em>Document Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Builder</em>'.
	 * @see defaultname.DocumentBuilder
	 * @generated
	 */
	EClass getDocumentBuilder();

	/**
	 * Returns the meta object for the reference '{@link defaultname.DocumentBuilder#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see defaultname.DocumentBuilder#getDocument()
	 * @see #getDocumentBuilder()
	 * @generated
	 */
	EReference getDocumentBuilder_Document();

	/**
	 * Returns the meta object for the attribute '{@link defaultname.DocumentBuilder#getFilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Path</em>'.
	 * @see defaultname.DocumentBuilder#getFilePath()
	 * @see #getDocumentBuilder()
	 * @generated
	 */
	EAttribute getDocumentBuilder_FilePath();

	/**
	 * Returns the meta object for the containment reference '{@link defaultname.DocumentBuilder#getDocumentStrategy <em>Document Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document Strategy</em>'.
	 * @see defaultname.DocumentBuilder#getDocumentStrategy()
	 * @see #getDocumentBuilder()
	 * @generated
	 */
	EReference getDocumentBuilder_DocumentStrategy();

	/**
	 * Returns the meta object for the containment reference '{@link defaultname.DocumentBuilder#getExportStrategy <em>Export Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Export Strategy</em>'.
	 * @see defaultname.DocumentBuilder#getExportStrategy()
	 * @see #getDocumentBuilder()
	 * @generated
	 */
	EReference getDocumentBuilder_ExportStrategy();

	/**
	 * Returns the meta object for class '{@link defaultname.DocumentStrategy <em>Document Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Strategy</em>'.
	 * @see defaultname.DocumentStrategy
	 * @generated
	 */
	EClass getDocumentStrategy();

	/**
	 * Returns the meta object for class '{@link defaultname.XMIStrategy <em>XMI Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XMI Strategy</em>'.
	 * @see defaultname.XMIStrategy
	 * @generated
	 */
	EClass getXMIStrategy();

	/**
	 * Returns the meta object for class '{@link defaultname.PressePapier <em>Presse Papier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presse Papier</em>'.
	 * @see defaultname.PressePapier
	 * @generated
	 */
	EClass getPressePapier();

	/**
	 * Returns the meta object for the attribute '{@link defaultname.PressePapier#getTextSelected <em>Text Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Selected</em>'.
	 * @see defaultname.PressePapier#getTextSelected()
	 * @see #getPressePapier()
	 * @generated
	 */
	EAttribute getPressePapier_TextSelected();

	/**
	 * Returns the meta object for the reference '{@link defaultname.PressePapier#getPressePaper <em>Presse Paper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Presse Paper</em>'.
	 * @see defaultname.PressePapier#getPressePaper()
	 * @see #getPressePapier()
	 * @generated
	 */
	EReference getPressePapier_PressePaper();

	/**
	 * Returns the meta object for the attribute '{@link defaultname.PressePapier#getStartPosition <em>Start Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Position</em>'.
	 * @see defaultname.PressePapier#getStartPosition()
	 * @see #getPressePapier()
	 * @generated
	 */
	EAttribute getPressePapier_StartPosition();

	/**
	 * Returns the meta object for class '{@link defaultname.ExportStrategy <em>Export Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Export Strategy</em>'.
	 * @see defaultname.ExportStrategy
	 * @generated
	 */
	EClass getExportStrategy();

	/**
	 * Returns the meta object for class '{@link defaultname.HTMLStrategy <em>HTML Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTML Strategy</em>'.
	 * @see defaultname.HTMLStrategy
	 * @generated
	 */
	EClass getHTMLStrategy();

	/**
	 * Returns the meta object for class '{@link defaultname.Momento <em>Momento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Momento</em>'.
	 * @see defaultname.Momento
	 * @generated
	 */
	EClass getMomento();

	/**
	 * Returns the meta object for the attribute '{@link defaultname.Momento#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see defaultname.Momento#getState()
	 * @see #getMomento()
	 * @generated
	 */
	EAttribute getMomento_State();

	/**
	 * Returns the meta object for class '{@link defaultname.Caretaker <em>Caretaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Caretaker</em>'.
	 * @see defaultname.Caretaker
	 * @generated
	 */
	EClass getCaretaker();

	/**
	 * Returns the meta object for the reference '{@link defaultname.Caretaker#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see defaultname.Caretaker#getEReference0()
	 * @see #getCaretaker()
	 * @generated
	 */
	EReference getCaretaker_EReference0();

	/**
	 * Returns the meta object for class '{@link defaultname.Receiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receiver</em>'.
	 * @see defaultname.Receiver
	 * @generated
	 */
	EClass getReceiver();

	/**
	 * Returns the meta object for class '{@link defaultname.addSection <em>add Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>add Section</em>'.
	 * @see defaultname.addSection
	 * @generated
	 */
	EClass getaddSection();

	/**
	 * Returns the meta object for the reference '{@link defaultname.addSection#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see defaultname.addSection#getEReference0()
	 * @see #getaddSection()
	 * @generated
	 */
	EReference getaddSection_EReference0();

	/**
	 * Returns the meta object for the reference '{@link defaultname.addSection#getEReference1 <em>EReference1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference1</em>'.
	 * @see defaultname.addSection#getEReference1()
	 * @see #getaddSection()
	 * @generated
	 */
	EReference getaddSection_EReference1();

	/**
	 * Returns the meta object for the attribute '{@link defaultname.addSection#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see defaultname.addSection#getState()
	 * @see #getaddSection()
	 * @generated
	 */
	EAttribute getaddSection_State();

	/**
	 * Returns the meta object for class '{@link defaultname.RemoveSection <em>Remove Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Section</em>'.
	 * @see defaultname.RemoveSection
	 * @generated
	 */
	EClass getRemoveSection();

	/**
	 * Returns the meta object for the reference '{@link defaultname.RemoveSection#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see defaultname.RemoveSection#getEReference0()
	 * @see #getRemoveSection()
	 * @generated
	 */
	EReference getRemoveSection_EReference0();

	/**
	 * Returns the meta object for the attribute '{@link defaultname.RemoveSection#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see defaultname.RemoveSection#getState()
	 * @see #getRemoveSection()
	 * @generated
	 */
	EAttribute getRemoveSection_State();

	/**
	 * Returns the meta object for class '{@link defaultname.CompositeCommand <em>Composite Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Command</em>'.
	 * @see defaultname.CompositeCommand
	 * @generated
	 */
	EClass getCompositeCommand();

	/**
	 * Returns the meta object for class '{@link defaultname.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see defaultname.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DefaultnameFactory getDefaultnameFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link defaultname.impl.SectionComponentImpl <em>Section Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see defaultname.impl.SectionComponentImpl
		 * @see defaultname.impl.DefaultnamePackageImpl#getSectionComponent()
		 * @generated
		 */
		EClass SECTION_COMPONENT = eINSTANCE.getSectionComponent();

		/**
		 * The meta object literal for the '{@link defaultname.impl.SectionCompositeImpl <em>Section Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see defaultname.impl.SectionCompositeImpl
		 * @see defaultname.impl.DefaultnamePackageImpl#getSectionComposite()
		 * @generated
		 */
		EClass SECTION_COMPOSITE = eINSTANCE.getSectionComposite();

		/**
		 * The meta object literal for the '<em><b>Section Component List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_COMPOSITE__SECTION_COMPONENT_LIST = eINSTANCE.getSectionComposite_SectionComponentList();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION_COMPOSITE__TITLE = eINSTANCE.getSectionComposite_Title();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION_COMPOSITE__TEXT = eINSTANCE.getSectionComposite_Text();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION_COMPOSITE__ID = eINSTANCE.getSectionComposite_Id();

		/**
		 * The meta object literal for the '{@link defaultname.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see defaultname.impl.SectionImpl
		 * @see defaultname.impl.DefaultnamePackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__TITLE = eINSTANCE.getSection_Title();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__TEXT = eINSTANCE.getSection_Text();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__ID = eINSTANCE.getSection_Id();

		/**
		 * The meta object literal for the '{@link defaultname.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see defaultname.impl.DocumentImpl
		 * @see defaultname.impl.DefaultnamePackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__NAME = eINSTANCE.getDocument_Name();

		/**
		 * The meta object literal for the '<em><b>Racine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__RACINE = eINSTANCE.getDocument_Racine();

		/**
		 * The meta object literal for the '<em><b>Presse Papier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__PRESSE_PAPIER = eINSTANCE.getDocument_PressePapier();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__STATE = eINSTANCE.getDocument_State();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__EREFERENCE0 = eINSTANCE.getDocument_EReference0();

		/**
		 * The meta object literal for the '<em><b>EReference1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__EREFERENCE1 = eINSTANCE.getDocument_EReference1();

		/**
		 * The meta object literal for the '<em><b>EReference2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__EREFERENCE2 = eINSTANCE.getDocument_EReference2();

		/**
		 * The meta object literal for the '{@link defaultname.impl.DocumentBuilderImpl <em>Document Builder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see defaultname.impl.DocumentBuilderImpl
		 * @see defaultname.impl.DefaultnamePackageImpl#getDocumentBuilder()
		 * @generated
		 */
		EClass DOCUMENT_BUILDER = eINSTANCE.getDocumentBuilder();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_BUILDER__DOCUMENT = eINSTANCE.getDocumentBuilder_Document();

		/**
		 * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_BUILDER__FILE_PATH = eINSTANCE.getDocumentBuilder_FilePath();

		/**
		 * The meta object literal for the '<em><b>Document Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_BUILDER__DOCUMENT_STRATEGY = eINSTANCE.getDocumentBuilder_DocumentStrategy();

		/**
		 * The meta object literal for the '<em><b>Export Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_BUILDER__EXPORT_STRATEGY = eINSTANCE.getDocumentBuilder_ExportStrategy();

		/**
		 * The meta object literal for the '{@link defaultname.DocumentStrategy <em>Document Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see defaultname.DocumentStrategy
		 * @see defaultname.impl.DefaultnamePackageImpl#getDocumentStrategy()
		 * @generated
		 */
		EClass DOCUMENT_STRATEGY = eINSTANCE.getDocumentStrategy();

		/**
		 * The meta object literal for the '{@link defaultname.impl.XMIStrategyImpl <em>XMI Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see defaultname.impl.XMIStrategyImpl
		 * @see defaultname.impl.DefaultnamePackageImpl#getXMIStrategy()
		 * @generated
		 */
		EClass XMI_STRATEGY = eINSTANCE.getXMIStrategy();

		/**
		 * The meta object literal for the '{@link defaultname.impl.PressePapierImpl <em>Presse Papier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see defaultname.impl.PressePapierImpl
		 * @see defaultname.impl.DefaultnamePackageImpl#getPressePapier()
		 * @generated
		 */
		EClass PRESSE_PAPIER = eINSTANCE.getPressePapier();

		/**
		 * The meta object literal for the '<em><b>Text Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESSE_PAPIER__TEXT_SELECTED = eINSTANCE.getPressePapier_TextSelected();

		/**
		 * The meta object literal for the '<em><b>Presse Paper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESSE_PAPIER__PRESSE_PAPER = eINSTANCE.getPressePapier_PressePaper();

		/**
		 * The meta object literal for the '<em><b>Start Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESSE_PAPIER__START_POSITION = eINSTANCE.getPressePapier_StartPosition();

		/**
		 * The meta object literal for the '{@link defaultname.ExportStrategy <em>Export Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see defaultname.ExportStrategy
		 * @see defaultname.impl.DefaultnamePackageImpl#getExportStrategy()
		 * @generated
		 */
		EClass EXPORT_STRATEGY = eINSTANCE.getExportStrategy();

		/**
		 * The meta object literal for the '{@link defaultname.impl.HTMLStrategyImpl <em>HTML Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see defaultname.impl.HTMLStrategyImpl
		 * @see defaultname.impl.DefaultnamePackageImpl#getHTMLStrategy()
		 * @generated
		 */
		EClass HTML_STRATEGY = eINSTANCE.getHTMLStrategy();

		/**
		 * The meta object literal for the '{@link defaultname.impl.MomentoImpl <em>Momento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see defaultname.impl.MomentoImpl
		 * @see defaultname.impl.DefaultnamePackageImpl#getMomento()
		 * @generated
		 */
		EClass MOMENTO = eINSTANCE.getMomento();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOMENTO__STATE = eINSTANCE.getMomento_State();

		/**
		 * The meta object literal for the '{@link defaultname.impl.CaretakerImpl <em>Caretaker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see defaultname.impl.CaretakerImpl
		 * @see defaultname.impl.DefaultnamePackageImpl#getCaretaker()
		 * @generated
		 */
		EClass CARETAKER = eINSTANCE.getCaretaker();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARETAKER__EREFERENCE0 = eINSTANCE.getCaretaker_EReference0();

		/**
		 * The meta object literal for the '{@link defaultname.impl.ReceiverImpl <em>Receiver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see defaultname.impl.ReceiverImpl
		 * @see defaultname.impl.DefaultnamePackageImpl#getReceiver()
		 * @generated
		 */
		EClass RECEIVER = eINSTANCE.getReceiver();

		/**
		 * The meta object literal for the '{@link defaultname.impl.addSectionImpl <em>add Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see defaultname.impl.addSectionImpl
		 * @see defaultname.impl.DefaultnamePackageImpl#getaddSection()
		 * @generated
		 */
		EClass ADD_SECTION = eINSTANCE.getaddSection();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_SECTION__EREFERENCE0 = eINSTANCE.getaddSection_EReference0();

		/**
		 * The meta object literal for the '<em><b>EReference1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_SECTION__EREFERENCE1 = eINSTANCE.getaddSection_EReference1();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_SECTION__STATE = eINSTANCE.getaddSection_State();

		/**
		 * The meta object literal for the '{@link defaultname.impl.RemoveSectionImpl <em>Remove Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see defaultname.impl.RemoveSectionImpl
		 * @see defaultname.impl.DefaultnamePackageImpl#getRemoveSection()
		 * @generated
		 */
		EClass REMOVE_SECTION = eINSTANCE.getRemoveSection();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_SECTION__EREFERENCE0 = eINSTANCE.getRemoveSection_EReference0();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_SECTION__STATE = eINSTANCE.getRemoveSection_State();

		/**
		 * The meta object literal for the '{@link defaultname.impl.CompositeCommandImpl <em>Composite Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see defaultname.impl.CompositeCommandImpl
		 * @see defaultname.impl.DefaultnamePackageImpl#getCompositeCommand()
		 * @generated
		 */
		EClass COMPOSITE_COMMAND = eINSTANCE.getCompositeCommand();

		/**
		 * The meta object literal for the '{@link defaultname.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see defaultname.impl.CommandImpl
		 * @see defaultname.impl.DefaultnamePackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

	}

} //DefaultnamePackage
