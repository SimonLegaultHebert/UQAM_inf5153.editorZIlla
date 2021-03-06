/**
 */
package defaultname.util;

import defaultname.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see defaultname.DefaultnamePackage
 * @generated
 */
public class DefaultnameSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DefaultnamePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultnameSwitch() {
		if (modelPackage == null) {
			modelPackage = DefaultnamePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DefaultnamePackage.SECTION_COMPONENT: {
				SectionComponent sectionComponent = (SectionComponent)theEObject;
				T result = caseSectionComponent(sectionComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultnamePackage.SECTION_COMPOSITE: {
				SectionComposite sectionComposite = (SectionComposite)theEObject;
				T result = caseSectionComposite(sectionComposite);
				if (result == null) result = caseSectionComponent(sectionComposite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultnamePackage.SECTION: {
				Section section = (Section)theEObject;
				T result = caseSection(section);
				if (result == null) result = caseSectionComponent(section);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultnamePackage.DOCUMENT: {
				Document document = (Document)theEObject;
				T result = caseDocument(document);
				if (result == null) result = caseDocumentBuilder(document);
				if (result == null) result = caseDocumentStrategy(document);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultnamePackage.DOCUMENT_BUILDER: {
				DocumentBuilder documentBuilder = (DocumentBuilder)theEObject;
				T result = caseDocumentBuilder(documentBuilder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultnamePackage.DOCUMENT_STRATEGY: {
				DocumentStrategy documentStrategy = (DocumentStrategy)theEObject;
				T result = caseDocumentStrategy(documentStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultnamePackage.XMI_STRATEGY: {
				XMIStrategy xmiStrategy = (XMIStrategy)theEObject;
				T result = caseXMIStrategy(xmiStrategy);
				if (result == null) result = caseDocumentStrategy(xmiStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultnamePackage.PRESSE_PAPIER: {
				PressePapier pressePapier = (PressePapier)theEObject;
				T result = casePressePapier(pressePapier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultnamePackage.EXPORT_STRATEGY: {
				ExportStrategy exportStrategy = (ExportStrategy)theEObject;
				T result = caseExportStrategy(exportStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultnamePackage.HTML_STRATEGY: {
				HTMLStrategy htmlStrategy = (HTMLStrategy)theEObject;
				T result = caseHTMLStrategy(htmlStrategy);
				if (result == null) result = caseExportStrategy(htmlStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultnamePackage.MOMENTO: {
				Momento momento = (Momento)theEObject;
				T result = caseMomento(momento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultnamePackage.CARETAKER: {
				Caretaker caretaker = (Caretaker)theEObject;
				T result = caseCaretaker(caretaker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultnamePackage.RECEIVER: {
				Receiver receiver = (Receiver)theEObject;
				T result = caseReceiver(receiver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultnamePackage.ADD_SECTION: {
				addSection addSection = (addSection)theEObject;
				T result = caseaddSection(addSection);
				if (result == null) result = caseReceiver(addSection);
				if (result == null) result = caseCommand(addSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultnamePackage.REMOVE_SECTION: {
				RemoveSection removeSection = (RemoveSection)theEObject;
				T result = caseRemoveSection(removeSection);
				if (result == null) result = caseReceiver(removeSection);
				if (result == null) result = caseCommand(removeSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultnamePackage.COMPOSITE_COMMAND: {
				CompositeCommand compositeCommand = (CompositeCommand)theEObject;
				T result = caseCompositeCommand(compositeCommand);
				if (result == null) result = caseReceiver(compositeCommand);
				if (result == null) result = caseCommand(compositeCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DefaultnamePackage.COMMAND: {
				Command command = (Command)theEObject;
				T result = caseCommand(command);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSectionComponent(SectionComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSectionComposite(SectionComposite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Builder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Builder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentBuilder(DocumentBuilder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentStrategy(DocumentStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XMI Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XMI Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMIStrategy(XMIStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Presse Papier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Presse Papier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePressePapier(PressePapier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Export Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Export Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExportStrategy(ExportStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTML Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTML Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTMLStrategy(HTMLStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Momento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Momento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMomento(Momento object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Caretaker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Caretaker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaretaker(Caretaker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receiver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiver(Receiver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>add Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>add Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseaddSection(addSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveSection(RemoveSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeCommand(CompositeCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommand(Command object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DefaultnameSwitch
