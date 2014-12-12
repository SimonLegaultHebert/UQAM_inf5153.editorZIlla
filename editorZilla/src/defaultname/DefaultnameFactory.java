/**
 */
package defaultname;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see defaultname.DefaultnamePackage
 * @generated
 */
public interface DefaultnameFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DefaultnameFactory eINSTANCE = defaultname.impl.DefaultnameFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Section Composite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section Composite</em>'.
	 * @generated
	 */
	SectionComposite createSectionComposite();

	/**
	 * Returns a new object of class '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section</em>'.
	 * @generated
	 */
	Section createSection();

	/**
	 * Returns a new object of class '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document</em>'.
	 * @generated
	 */
	Document createDocument();

	/**
	 * Returns a new object of class '<em>Document Builder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Builder</em>'.
	 * @generated
	 */
	DocumentBuilder createDocumentBuilder();

	/**
	 * Returns a new object of class '<em>XMI Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XMI Strategy</em>'.
	 * @generated
	 */
	XMIStrategy createXMIStrategy();

	/**
	 * Returns a new object of class '<em>Presse Papier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Presse Papier</em>'.
	 * @generated
	 */
	PressePapier createPressePapier();

	/**
	 * Returns a new object of class '<em>HTML Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTML Strategy</em>'.
	 * @generated
	 */
	HTMLStrategy createHTMLStrategy();

	/**
	 * Returns a new object of class '<em>Momento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Momento</em>'.
	 * @generated
	 */
	Momento createMomento();

	/**
	 * Returns a new object of class '<em>Caretaker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Caretaker</em>'.
	 * @generated
	 */
	Caretaker createCaretaker();

	/**
	 * Returns a new object of class '<em>Receiver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receiver</em>'.
	 * @generated
	 */
	Receiver createReceiver();

	/**
	 * Returns a new object of class '<em>add Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>add Section</em>'.
	 * @generated
	 */
	addSection createaddSection();

	/**
	 * Returns a new object of class '<em>Remove Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Section</em>'.
	 * @generated
	 */
	RemoveSection createRemoveSection();

	/**
	 * Returns a new object of class '<em>Composite Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Command</em>'.
	 * @generated
	 */
	CompositeCommand createCompositeCommand();

	/**
	 * Returns a new object of class '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command</em>'.
	 * @generated
	 */
	Command createCommand();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DefaultnamePackage getDefaultnamePackage();

} //DefaultnameFactory
