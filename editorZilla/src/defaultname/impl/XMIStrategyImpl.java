/**
 */
package defaultname.impl;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import defaultname.DefaultnameFactory;
import defaultname.DefaultnamePackage;
import defaultname.Document;
import defaultname.Section;
import defaultname.SectionComponent;
import defaultname.SectionComposite;
import defaultname.XMIStrategy;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XMI Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class XMIStrategyImpl extends EObjectImpl implements XMIStrategy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMIStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DefaultnamePackage.Literals.XMI_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Document load(String filePath) {
		Document document = DefaultnameFactory.eINSTANCE.createDocument();
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("website", new XMIResourceFactoryImpl());
		// Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();
	    // Get the resource
	    Resource resource = resSet.getResource(URI.createURI(filePath + ".website"), true);
	    
	    SectionComposite racine = DefaultnameFactory.eINSTANCE.createSectionComposite();
	    int lastSection = -1;
	    for(EObject object : resource.getContents()){
	    	
	    	if(object.eClass().getName().equals("SectionComposite")){
	    		SectionComposite sectionComposite = (SectionComposite)object;
	    		racine.add(sectionComposite);
	    		++lastSection;
	    	}else{	    		
	    		Section subSection = (Section)object;
	    		EList<SectionComponent> sectionList = racine.getSectionComponentList();
	    		SectionComposite sectionComposite = (SectionComposite)sectionList.get(lastSection);
	    		sectionComposite.add(subSection);  		
	    		sectionList.remove(lastSection);
	    		sectionList.add(lastSection, sectionComposite);
	    		racine.setSectionComponentList(sectionList);
	    	}
	    
	    }
	    
	    document.setRacine(racine);	    
	    document.setName("Document par défaut");
	    return document;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	//save
	public void save(Document document, String filePath) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	      Map<String, Object> m = reg.getExtensionToFactoryMap();
	      m.put("website", new XMIResourceFactoryImpl());

	      // Obtain a new resource set
	      ResourceSet resSet = new ResourceSetImpl();

	      // create a resource
	      Resource resource = resSet.createResource(URI.createURI(filePath + "/" + document.getName() + ".website"));
	          
	      // Get the first model element and cast it to the right type, in my
	      // example everything is hierarchical included in this first node
	      
	      SectionComposite racineComposite = (SectionComposite)document.getRacine();
	      EList<SectionComponent> sectionComponentList = racineComposite.getSectionComponentList();
	      for(SectionComponent sectionComponent : sectionComponentList){
	      
	      	SectionComposite section = (SectionComposite)sectionComponent;
	      	resource.getContents().add(section);
	      	
	      	EList<SectionComponent> subSectionComponentList = section.getSectionComponentList();
	      	for(SectionComponent subSectionComponent : subSectionComponentList){
	      		Section subSection = (Section)subSectionComponent;
	      		resource.getContents().add(subSection);
	      	}
	      }
	      // now save the content.
	      try {       
	        resource.save(Collections.EMPTY_MAP);       
	      } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	     } 
	}

} //XMIStrategyImpl
