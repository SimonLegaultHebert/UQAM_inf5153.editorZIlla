/**
 */
package defaultname.impl;

import defaultname.DefaultnameFactory;
import defaultname.DefaultnamePackage;
import defaultname.Document;
import defaultname.DocumentBuilder;
import defaultname.DocumentStrategy;
import defaultname.Section;
import defaultname.SectionComponent;
import defaultname.SectionComposite;
import defaultname.XMLStrategy;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DefaultnamePackageImpl extends EPackageImpl implements DefaultnamePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionCompositeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentBuilderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlStrategyEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see defaultname.DefaultnamePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DefaultnamePackageImpl() {
		super(eNS_URI, DefaultnameFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DefaultnamePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DefaultnamePackage init() {
		if (isInited) return (DefaultnamePackage)EPackage.Registry.INSTANCE.getEPackage(DefaultnamePackage.eNS_URI);

		// Obtain or create and register package
		DefaultnamePackageImpl theDefaultnamePackage = (DefaultnamePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DefaultnamePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DefaultnamePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDefaultnamePackage.createPackageContents();

		// Initialize created meta-data
		theDefaultnamePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDefaultnamePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DefaultnamePackage.eNS_URI, theDefaultnamePackage);
		return theDefaultnamePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSectionComponent() {
		return sectionComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSectionComposite() {
		return sectionCompositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionComposite_SectionComponentList() {
		return (EReference)sectionCompositeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectionComposite_Title() {
		return (EAttribute)sectionCompositeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectionComposite_Text() {
		return (EAttribute)sectionCompositeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSection() {
		return sectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSection_Title() {
		return (EAttribute)sectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSection_Text() {
		return (EAttribute)sectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_Name() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_Format() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_Racine() {
		return (EReference)documentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_CurrentSectionTitle() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_CurrentSectionText() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentBuilder() {
		return documentBuilderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentBuilder_Document() {
		return (EReference)documentBuilderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentBuilder_FilePath() {
		return (EAttribute)documentBuilderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentBuilder_Strategy() {
		return (EReference)documentBuilderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentStrategy() {
		return documentStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMLStrategy() {
		return xmlStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultnameFactory getDefaultnameFactory() {
		return (DefaultnameFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sectionComponentEClass = createEClass(SECTION_COMPONENT);

		sectionCompositeEClass = createEClass(SECTION_COMPOSITE);
		createEReference(sectionCompositeEClass, SECTION_COMPOSITE__SECTION_COMPONENT_LIST);
		createEAttribute(sectionCompositeEClass, SECTION_COMPOSITE__TITLE);
		createEAttribute(sectionCompositeEClass, SECTION_COMPOSITE__TEXT);

		sectionEClass = createEClass(SECTION);
		createEAttribute(sectionEClass, SECTION__TITLE);
		createEAttribute(sectionEClass, SECTION__TEXT);

		documentEClass = createEClass(DOCUMENT);
		createEAttribute(documentEClass, DOCUMENT__NAME);
		createEAttribute(documentEClass, DOCUMENT__FORMAT);
		createEReference(documentEClass, DOCUMENT__RACINE);
		createEAttribute(documentEClass, DOCUMENT__CURRENT_SECTION_TITLE);
		createEAttribute(documentEClass, DOCUMENT__CURRENT_SECTION_TEXT);

		documentBuilderEClass = createEClass(DOCUMENT_BUILDER);
		createEReference(documentBuilderEClass, DOCUMENT_BUILDER__DOCUMENT);
		createEAttribute(documentBuilderEClass, DOCUMENT_BUILDER__FILE_PATH);
		createEReference(documentBuilderEClass, DOCUMENT_BUILDER__STRATEGY);

		documentStrategyEClass = createEClass(DOCUMENT_STRATEGY);

		xmlStrategyEClass = createEClass(XML_STRATEGY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sectionCompositeEClass.getESuperTypes().add(this.getSectionComponent());
		sectionEClass.getESuperTypes().add(this.getSectionComponent());
		documentEClass.getESuperTypes().add(this.getDocumentBuilder());
		documentEClass.getESuperTypes().add(this.getDocumentStrategy());
		xmlStrategyEClass.getESuperTypes().add(this.getDocumentStrategy());

		// Initialize classes and features; add operations and parameters
		initEClass(sectionComponentEClass, SectionComponent.class, "SectionComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(sectionComponentEClass, ecorePackage.getEString(), "getText", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(sectionComponentEClass, ecorePackage.getEString(), "getTitle", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sectionCompositeEClass, SectionComposite.class, "SectionComposite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSectionComposite_SectionComponentList(), this.getSectionComponent(), null, "sectionComponentList", null, 0, -1, SectionComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSectionComposite_Title(), ecorePackage.getEString(), "title", "Section", 0, 1, SectionComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSectionComposite_Text(), ecorePackage.getEString(), "text", "", 0, 1, SectionComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(sectionCompositeEClass, null, "remove", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSectionComponent(), "sectionComponent", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sectionCompositeEClass, null, "add", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSectionComponent(), "sectionComponent", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sectionCompositeEClass, this.getSectionComponent(), "getChild", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSection_Title(), ecorePackage.getEString(), "title", "Sous-Section", 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSection_Text(), ecorePackage.getEString(), "text", "", 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocument_Name(), ecorePackage.getEString(), "name", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_Format(), ecorePackage.getEString(), "format", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_Racine(), this.getSectionComponent(), null, "racine", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_CurrentSectionTitle(), ecorePackage.getEString(), "currentSectionTitle", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_CurrentSectionText(), ecorePackage.getEString(), "currentSectionText", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(documentEClass, this.getSectionComponent(), "getSectionComponent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(documentBuilderEClass, DocumentBuilder.class, "DocumentBuilder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentBuilder_Document(), this.getDocument(), null, "document", null, 1, 1, DocumentBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentBuilder_FilePath(), ecorePackage.getEString(), "filePath", null, 0, 1, DocumentBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentBuilder_Strategy(), this.getDocumentStrategy(), null, "strategy", null, 1, 1, DocumentBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(documentBuilderEClass, this.getDocument(), "delete", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "documentName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(documentBuilderEClass, this.getDocument(), "load", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "documentName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(documentBuilderEClass, null, "export", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "documentName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(documentBuilderEClass, null, "save", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDocument(), "document", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(documentStrategyEClass, DocumentStrategy.class, "DocumentStrategy", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(documentStrategyEClass, this.getDocument(), "load", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(documentStrategyEClass, null, "save", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDocument(), "document", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(xmlStrategyEClass, XMLStrategy.class, "XMLStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DefaultnamePackageImpl
