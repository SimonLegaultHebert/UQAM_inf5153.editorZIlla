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
	 * The feature id for the '<em><b>Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_BUILDER__STRATEGY = 2;

	/**
	 * The number of structural features of the '<em>Document Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_BUILDER_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__STRATEGY = DOCUMENT_BUILDER__STRATEGY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = DOCUMENT_BUILDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__FORMAT = DOCUMENT_BUILDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Racine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__RACINE = DOCUMENT_BUILDER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current Section Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CURRENT_SECTION_TITLE = DOCUMENT_BUILDER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Current Section Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CURRENT_SECTION_TEXT = DOCUMENT_BUILDER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = DOCUMENT_BUILDER_FEATURE_COUNT + 5;

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
	 * The number of structural features of the '<em>Presse Papier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESSE_PAPIER_FEATURE_COUNT = 2;

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
	 * Returns the meta object for the attribute '{@link defaultname.Document#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see defaultname.Document#getFormat()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Format();

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
	 * Returns the meta object for the attribute '{@link defaultname.Document#getCurrentSectionTitle <em>Current Section Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Section Title</em>'.
	 * @see defaultname.Document#getCurrentSectionTitle()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_CurrentSectionTitle();

	/**
	 * Returns the meta object for the attribute '{@link defaultname.Document#getCurrentSectionText <em>Current Section Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Section Text</em>'.
	 * @see defaultname.Document#getCurrentSectionText()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_CurrentSectionText();

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
	 * Returns the meta object for the containment reference '{@link defaultname.DocumentBuilder#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strategy</em>'.
	 * @see defaultname.DocumentBuilder#getStrategy()
	 * @see #getDocumentBuilder()
	 * @generated
	 */
	EReference getDocumentBuilder_Strategy();

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
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__FORMAT = eINSTANCE.getDocument_Format();

		/**
		 * The meta object literal for the '<em><b>Racine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__RACINE = eINSTANCE.getDocument_Racine();

		/**
		 * The meta object literal for the '<em><b>Current Section Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__CURRENT_SECTION_TITLE = eINSTANCE.getDocument_CurrentSectionTitle();

		/**
		 * The meta object literal for the '<em><b>Current Section Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__CURRENT_SECTION_TEXT = eINSTANCE.getDocument_CurrentSectionText();

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
		 * The meta object literal for the '<em><b>Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_BUILDER__STRATEGY = eINSTANCE.getDocumentBuilder_Strategy();

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

	}

} //DefaultnamePackage
