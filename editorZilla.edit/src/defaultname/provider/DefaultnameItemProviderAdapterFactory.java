/**
 */
package defaultname.provider;


import defaultname.util.DefaultnameAdapterFactory;
import java.util.ArrayList;
import java.util.Collection;

import model.util.DefaultnameAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DefaultnameItemProviderAdapterFactory extends DefaultnameAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultnameItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link defaultname.SectionComposite} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionCompositeItemProvider sectionCompositeItemProvider;

	/**
	 * This creates an adapter for a {@link defaultname.SectionComposite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSectionCompositeAdapter() {
		if (sectionCompositeItemProvider == null) {
			sectionCompositeItemProvider = new SectionCompositeItemProvider(this);
		}

		return sectionCompositeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link defaultname.Section} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionItemProvider sectionItemProvider;

	/**
	 * This creates an adapter for a {@link defaultname.Section}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSectionAdapter() {
		if (sectionItemProvider == null) {
			sectionItemProvider = new SectionItemProvider(this);
		}

		return sectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link defaultname.Document} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentItemProvider documentItemProvider;

	/**
	 * This creates an adapter for a {@link defaultname.Document}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDocumentAdapter() {
		if (documentItemProvider == null) {
			documentItemProvider = new DocumentItemProvider(this);
		}

		return documentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link defaultname.DocumentBuilder} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentBuilderItemProvider documentBuilderItemProvider;

	/**
	 * This creates an adapter for a {@link defaultname.DocumentBuilder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDocumentBuilderAdapter() {
		if (documentBuilderItemProvider == null) {
			documentBuilderItemProvider = new DocumentBuilderItemProvider(this);
		}

		return documentBuilderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link defaultname.XMIStrategy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMIStrategyItemProvider xmiStrategyItemProvider;

	/**
	 * This creates an adapter for a {@link defaultname.XMIStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXMIStrategyAdapter() {
		if (xmiStrategyItemProvider == null) {
			xmiStrategyItemProvider = new XMIStrategyItemProvider(this);
		}

		return xmiStrategyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link defaultname.PressePapier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PressePapierItemProvider pressePapierItemProvider;

	/**
	 * This creates an adapter for a {@link defaultname.PressePapier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPressePapierAdapter() {
		if (pressePapierItemProvider == null) {
			pressePapierItemProvider = new PressePapierItemProvider(this);
		}

		return pressePapierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link defaultname.HTMLStrategy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HTMLStrategyItemProvider htmlStrategyItemProvider;

	/**
	 * This creates an adapter for a {@link defaultname.HTMLStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHTMLStrategyAdapter() {
		if (htmlStrategyItemProvider == null) {
			htmlStrategyItemProvider = new HTMLStrategyItemProvider(this);
		}

		return htmlStrategyItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (sectionCompositeItemProvider != null) sectionCompositeItemProvider.dispose();
		if (sectionItemProvider != null) sectionItemProvider.dispose();
		if (documentItemProvider != null) documentItemProvider.dispose();
		if (documentBuilderItemProvider != null) documentBuilderItemProvider.dispose();
		if (xmiStrategyItemProvider != null) xmiStrategyItemProvider.dispose();
		if (pressePapierItemProvider != null) pressePapierItemProvider.dispose();
		if (htmlStrategyItemProvider != null) htmlStrategyItemProvider.dispose();
	}

}
