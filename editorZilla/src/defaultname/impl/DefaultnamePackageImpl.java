/**
 */
package defaultname.impl;

import defaultname.Caretaker;
import defaultname.Command;
import defaultname.CompositeCommand;
import defaultname.DefaultnameFactory;
import defaultname.DefaultnamePackage;
import defaultname.Document;
import defaultname.DocumentBuilder;
import defaultname.DocumentStrategy;
import defaultname.ExportStrategy;
import defaultname.HTMLStrategy;
import defaultname.Momento;
import defaultname.PressePapier;
import defaultname.Receiver;
import defaultname.RemoveSection;
import defaultname.Section;
import defaultname.SectionComponent;
import defaultname.SectionComposite;
import defaultname.XMIStrategy;

import defaultname.addSection;
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
	private EClass xmiStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pressePapierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exportStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass momentoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caretakerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEClass = null;

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
	public EAttribute getSectionComposite_Id() {
		return (EAttribute)sectionCompositeEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getSection_Id() {
		return (EAttribute)sectionEClass.getEStructuralFeatures().get(2);
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
	public EReference getDocument_Racine() {
		return (EReference)documentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_PressePapier() {
		return (EReference)documentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_State() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_EReference0() {
		return (EReference)documentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_EReference1() {
		return (EReference)documentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_EReference2() {
		return (EReference)documentEClass.getEStructuralFeatures().get(6);
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
	public EReference getDocumentBuilder_DocumentStrategy() {
		return (EReference)documentBuilderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentBuilder_ExportStrategy() {
		return (EReference)documentBuilderEClass.getEStructuralFeatures().get(3);
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
	public EClass getXMIStrategy() {
		return xmiStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPressePapier() {
		return pressePapierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPressePapier_TextSelected() {
		return (EAttribute)pressePapierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPressePapier_PressePaper() {
		return (EReference)pressePapierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPressePapier_StartPosition() {
		return (EAttribute)pressePapierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExportStrategy() {
		return exportStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHTMLStrategy() {
		return htmlStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMomento() {
		return momentoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMomento_State() {
		return (EAttribute)momentoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaretaker() {
		return caretakerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCaretaker_EReference0() {
		return (EReference)caretakerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiver() {
		return receiverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getaddSection() {
		return addSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getaddSection_EReference0() {
		return (EReference)addSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getaddSection_EReference1() {
		return (EReference)addSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getaddSection_State() {
		return (EAttribute)addSectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveSection() {
		return removeSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveSection_EReference0() {
		return (EReference)removeSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveSection_State() {
		return (EAttribute)removeSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeCommand() {
		return compositeCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommand() {
		return commandEClass;
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
		createEAttribute(sectionCompositeEClass, SECTION_COMPOSITE__ID);

		sectionEClass = createEClass(SECTION);
		createEAttribute(sectionEClass, SECTION__TITLE);
		createEAttribute(sectionEClass, SECTION__TEXT);
		createEAttribute(sectionEClass, SECTION__ID);

		documentEClass = createEClass(DOCUMENT);
		createEAttribute(documentEClass, DOCUMENT__NAME);
		createEReference(documentEClass, DOCUMENT__RACINE);
		createEReference(documentEClass, DOCUMENT__PRESSE_PAPIER);
		createEAttribute(documentEClass, DOCUMENT__STATE);
		createEReference(documentEClass, DOCUMENT__EREFERENCE0);
		createEReference(documentEClass, DOCUMENT__EREFERENCE1);
		createEReference(documentEClass, DOCUMENT__EREFERENCE2);

		documentBuilderEClass = createEClass(DOCUMENT_BUILDER);
		createEReference(documentBuilderEClass, DOCUMENT_BUILDER__DOCUMENT);
		createEAttribute(documentBuilderEClass, DOCUMENT_BUILDER__FILE_PATH);
		createEReference(documentBuilderEClass, DOCUMENT_BUILDER__DOCUMENT_STRATEGY);
		createEReference(documentBuilderEClass, DOCUMENT_BUILDER__EXPORT_STRATEGY);

		documentStrategyEClass = createEClass(DOCUMENT_STRATEGY);

		xmiStrategyEClass = createEClass(XMI_STRATEGY);

		pressePapierEClass = createEClass(PRESSE_PAPIER);
		createEAttribute(pressePapierEClass, PRESSE_PAPIER__TEXT_SELECTED);
		createEReference(pressePapierEClass, PRESSE_PAPIER__PRESSE_PAPER);
		createEAttribute(pressePapierEClass, PRESSE_PAPIER__START_POSITION);

		exportStrategyEClass = createEClass(EXPORT_STRATEGY);

		htmlStrategyEClass = createEClass(HTML_STRATEGY);

		momentoEClass = createEClass(MOMENTO);
		createEAttribute(momentoEClass, MOMENTO__STATE);

		caretakerEClass = createEClass(CARETAKER);
		createEReference(caretakerEClass, CARETAKER__EREFERENCE0);

		receiverEClass = createEClass(RECEIVER);

		addSectionEClass = createEClass(ADD_SECTION);
		createEReference(addSectionEClass, ADD_SECTION__EREFERENCE0);
		createEReference(addSectionEClass, ADD_SECTION__EREFERENCE1);
		createEAttribute(addSectionEClass, ADD_SECTION__STATE);

		removeSectionEClass = createEClass(REMOVE_SECTION);
		createEReference(removeSectionEClass, REMOVE_SECTION__EREFERENCE0);
		createEAttribute(removeSectionEClass, REMOVE_SECTION__STATE);

		compositeCommandEClass = createEClass(COMPOSITE_COMMAND);

		commandEClass = createEClass(COMMAND);
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
		xmiStrategyEClass.getESuperTypes().add(this.getDocumentStrategy());
		htmlStrategyEClass.getESuperTypes().add(this.getExportStrategy());
		addSectionEClass.getESuperTypes().add(this.getReceiver());
		addSectionEClass.getESuperTypes().add(this.getCommand());
		removeSectionEClass.getESuperTypes().add(this.getReceiver());
		removeSectionEClass.getESuperTypes().add(this.getCommand());
		compositeCommandEClass.getESuperTypes().add(this.getReceiver());
		compositeCommandEClass.getESuperTypes().add(this.getCommand());

		// Initialize classes and features; add operations and parameters
		initEClass(sectionComponentEClass, SectionComponent.class, "SectionComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(sectionComponentEClass, ecorePackage.getEString(), "getText", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(sectionComponentEClass, ecorePackage.getEString(), "getTitle", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(sectionComponentEClass, ecorePackage.getEString(), "getId", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sectionCompositeEClass, SectionComposite.class, "SectionComposite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSectionComposite_SectionComponentList(), this.getSectionComponent(), null, "sectionComponentList", null, 0, -1, SectionComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSectionComposite_Title(), ecorePackage.getEString(), "title", "Section Register", 0, 1, SectionComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSectionComposite_Text(), ecorePackage.getEString(), "text", "", 0, 1, SectionComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSectionComposite_Id(), ecorePackage.getEString(), "id", null, 0, 1, SectionComposite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(sectionCompositeEClass, null, "remove", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSectionComponent(), "sectionComponent", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sectionCompositeEClass, null, "add", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSectionComponent(), "sectionComponent", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sectionCompositeEClass, this.getSectionComponent(), "getChild", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSection_Title(), ecorePackage.getEString(), "title", "Sous-Section", 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSection_Text(), ecorePackage.getEString(), "text", "", 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSection_Id(), ecorePackage.getEString(), "id", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocument_Name(), ecorePackage.getEString(), "name", "document", 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_Racine(), this.getSectionComponent(), null, "racine", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_PressePapier(), this.getPressePapier(), null, "pressePapier", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_State(), ecorePackage.getEJavaObject(), "state", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_EReference0(), this.getMomento(), null, "EReference0", null, 0, -1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_EReference1(), this.getDocument(), null, "EReference1", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_EReference2(), this.getReceiver(), null, "EReference2", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(documentEClass, this.getSectionComponent(), "getSectionComponent", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(documentEClass, this.getSectionComposite(), "addSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "title", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "text", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(documentEClass, this.getSection(), "addSubsection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "title", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "text", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(documentEClass, ecorePackage.getEString(), "getContent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(documentEClass, null, "saveText", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "currentText", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(documentEClass, null, "deleteSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(documentEClass, null, "changeSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "newTitle", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(documentEClass, null, "setMomento", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMomento(), "m", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(documentEClass, null, "createMomento", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(documentBuilderEClass, DocumentBuilder.class, "DocumentBuilder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentBuilder_Document(), this.getDocument(), null, "document", null, 1, 1, DocumentBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentBuilder_FilePath(), ecorePackage.getEString(), "filePath", "DossierDefaut", 0, 1, DocumentBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentBuilder_DocumentStrategy(), this.getDocumentStrategy(), null, "documentStrategy", null, 1, 1, DocumentBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentBuilder_ExportStrategy(), this.getExportStrategy(), null, "exportStrategy", null, 1, 1, DocumentBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(documentBuilderEClass, this.getDocument(), "load", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filePath", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(documentBuilderEClass, null, "export", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "documentName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(documentBuilderEClass, null, "save", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDocument(), "document", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(documentStrategyEClass, DocumentStrategy.class, "DocumentStrategy", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(documentStrategyEClass, this.getDocument(), "load", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filePath", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(documentStrategyEClass, null, "save", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDocument(), "document", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filePath", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(xmiStrategyEClass, XMIStrategy.class, "XMIStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pressePapierEClass, PressePapier.class, "PressePapier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPressePapier_TextSelected(), ecorePackage.getEString(), "textSelected", "", 0, 1, PressePapier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPressePapier_PressePaper(), this.getDocument(), null, "pressePaper", null, 0, 1, PressePapier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPressePapier_StartPosition(), ecorePackage.getEInt(), "startPosition", null, 0, 1, PressePapier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(pressePapierEClass, null, "copyText", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "textToCopy", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(pressePapierEClass, ecorePackage.getEInt(), "moveText", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(pressePapierEClass, ecorePackage.getEString(), "pasteText", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(exportStrategyEClass, ExportStrategy.class, "ExportStrategy", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(exportStrategyEClass, null, "export", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDocument(), "document", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filePath", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(htmlStrategyEClass, HTMLStrategy.class, "HTMLStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(momentoEClass, Momento.class, "Momento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMomento_State(), ecorePackage.getEJavaObject(), "state", null, 0, 1, Momento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(momentoEClass, this.getMomento(), "getMomento", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(momentoEClass, null, "setMomento", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMomento(), "m", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(caretakerEClass, Caretaker.class, "Caretaker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCaretaker_EReference0(), this.getMomento(), null, "EReference0", null, 0, 1, Caretaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(receiverEClass, Receiver.class, "Receiver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addSectionEClass, addSection.class, "addSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getaddSection_EReference0(), this.getDocument(), null, "EReference0", null, 0, 1, addSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getaddSection_EReference1(), this.getReceiver(), null, "EReference1", null, 0, 1, addSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getaddSection_State(), ecorePackage.getEJavaObject(), "state", null, 0, 1, addSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(addSectionEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(removeSectionEClass, RemoveSection.class, "RemoveSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoveSection_EReference0(), this.getReceiver(), null, "EReference0", null, 0, 1, RemoveSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveSection_State(), ecorePackage.getEJavaObject(), "state", null, 0, 1, RemoveSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(removeSectionEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(compositeCommandEClass, CompositeCommand.class, "CompositeCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(commandEClass, null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (getDocument_State(), 
		   source, 
		   new String[] {
			 "kind", "attribute"
		   });
	}

} //DefaultnamePackageImpl
