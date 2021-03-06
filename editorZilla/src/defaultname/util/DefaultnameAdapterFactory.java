/**
 */
package defaultname.util;

import defaultname.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see defaultname.DefaultnamePackage
 * @generated
 */
public class DefaultnameAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DefaultnamePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultnameAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DefaultnamePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultnameSwitch<Adapter> modelSwitch =
		new DefaultnameSwitch<Adapter>() {
			@Override
			public Adapter caseSectionComponent(SectionComponent object) {
				return createSectionComponentAdapter();
			}
			@Override
			public Adapter caseSectionComposite(SectionComposite object) {
				return createSectionCompositeAdapter();
			}
			@Override
			public Adapter caseSection(Section object) {
				return createSectionAdapter();
			}
			@Override
			public Adapter caseDocument(Document object) {
				return createDocumentAdapter();
			}
			@Override
			public Adapter caseDocumentBuilder(DocumentBuilder object) {
				return createDocumentBuilderAdapter();
			}
			@Override
			public Adapter caseDocumentStrategy(DocumentStrategy object) {
				return createDocumentStrategyAdapter();
			}
			@Override
			public Adapter caseXMIStrategy(XMIStrategy object) {
				return createXMIStrategyAdapter();
			}
			@Override
			public Adapter casePressePapier(PressePapier object) {
				return createPressePapierAdapter();
			}
			@Override
			public Adapter caseExportStrategy(ExportStrategy object) {
				return createExportStrategyAdapter();
			}
			@Override
			public Adapter caseHTMLStrategy(HTMLStrategy object) {
				return createHTMLStrategyAdapter();
			}
			@Override
			public Adapter caseMomento(Momento object) {
				return createMomentoAdapter();
			}
			@Override
			public Adapter caseCaretaker(Caretaker object) {
				return createCaretakerAdapter();
			}
			@Override
			public Adapter caseReceiver(Receiver object) {
				return createReceiverAdapter();
			}
			@Override
			public Adapter caseaddSection(addSection object) {
				return createaddSectionAdapter();
			}
			@Override
			public Adapter caseRemoveSection(RemoveSection object) {
				return createRemoveSectionAdapter();
			}
			@Override
			public Adapter caseCompositeCommand(CompositeCommand object) {
				return createCompositeCommandAdapter();
			}
			@Override
			public Adapter caseCommand(Command object) {
				return createCommandAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link defaultname.SectionComponent <em>Section Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see defaultname.SectionComponent
	 * @generated
	 */
	public Adapter createSectionComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link defaultname.SectionComposite <em>Section Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see defaultname.SectionComposite
	 * @generated
	 */
	public Adapter createSectionCompositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link defaultname.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see defaultname.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link defaultname.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see defaultname.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link defaultname.DocumentBuilder <em>Document Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see defaultname.DocumentBuilder
	 * @generated
	 */
	public Adapter createDocumentBuilderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link defaultname.DocumentStrategy <em>Document Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see defaultname.DocumentStrategy
	 * @generated
	 */
	public Adapter createDocumentStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link defaultname.XMIStrategy <em>XMI Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see defaultname.XMIStrategy
	 * @generated
	 */
	public Adapter createXMIStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link defaultname.PressePapier <em>Presse Papier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see defaultname.PressePapier
	 * @generated
	 */
	public Adapter createPressePapierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link defaultname.ExportStrategy <em>Export Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see defaultname.ExportStrategy
	 * @generated
	 */
	public Adapter createExportStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link defaultname.HTMLStrategy <em>HTML Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see defaultname.HTMLStrategy
	 * @generated
	 */
	public Adapter createHTMLStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link defaultname.Momento <em>Momento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see defaultname.Momento
	 * @generated
	 */
	public Adapter createMomentoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link defaultname.Caretaker <em>Caretaker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see defaultname.Caretaker
	 * @generated
	 */
	public Adapter createCaretakerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link defaultname.Receiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see defaultname.Receiver
	 * @generated
	 */
	public Adapter createReceiverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link defaultname.addSection <em>add Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see defaultname.addSection
	 * @generated
	 */
	public Adapter createaddSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link defaultname.RemoveSection <em>Remove Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see defaultname.RemoveSection
	 * @generated
	 */
	public Adapter createRemoveSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link defaultname.CompositeCommand <em>Composite Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see defaultname.CompositeCommand
	 * @generated
	 */
	public Adapter createCompositeCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link defaultname.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see defaultname.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DefaultnameAdapterFactory
