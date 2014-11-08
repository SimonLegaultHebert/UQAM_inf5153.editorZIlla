package controller;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import defaultname.*;

public class Controller {

	DocumentBuilder documentBuilder;
	SectionComposite racine;
	
	//Quand on ouvre le logiciel, le documentBuilder est créer par défaut.
	public Controller(){	
		DefaultnamePackage.eINSTANCE.eClass();
		this.documentBuilder = DefaultnameFactory.eINSTANCE.createDocumentBuilder();
		Document document = DefaultnameFactory.eINSTANCE.createDocument();
		racine = DefaultnameFactory.eINSTANCE.createSectionComposite();
		racine.setTitle("Section Register");
		document.setRacine(racine);
		document.setCurrentSectionText(racine.getText());
		document.setCurrentSectionTitle(racine.getTitle());
		documentBuilder.setDocument(document);
	}
	
	public SectionComposite addSection(){
		SectionComposite newSection = DefaultnameFactory.eINSTANCE.createSectionComposite();
		newSection.setTitle(newSection.getTitle() + " " + (racine.getSectionComponentList().size() + 1));
		
		String title = newSection.getTitle();
		newSection.setText("Ce texte est implémenté dans le controller pour les tests!" + " " + title + "\n" + "Voici l'id de la section: " + newSection.getId());
		
		racine.add(newSection);
		return newSection;	
	}
	
	public Section addSubSection(String sectionId){
		Section newSubSection = DefaultnameFactory.eINSTANCE.createSection();
		EList<SectionComponent> sectionComponentList = racine.getSectionComponentList();
		SectionComposite childSection = null;
		for(SectionComponent sectionWithId : sectionComponentList){
			if(sectionWithId.getId().equals(sectionId)){
				childSection = (SectionComposite)sectionWithId;
			}
			
		}
		newSubSection.setTitle(newSubSection.getTitle() + "-" + (childSection.getSectionComponentList().size() + 1));		
		String title = newSubSection.getTitle();
		newSubSection.setText("Ce texte est implémenté dans le controller pour les tests!" + " " + title + "\n" + "Voici l'id de la sous-section: " + newSubSection.getId());
		
		childSection.add(newSubSection);			
		return newSubSection;
	}
	
	public String getContent(String sectionComponentid){
		EList<SectionComponent> sectionComponentList = racine.getSectionComponentList();
		String currentText = "";
		for(SectionComponent rootChild : sectionComponentList){
			SectionComposite section = (SectionComposite)rootChild;
			if(section.getId().equals(sectionComponentid)){
				currentText = section.getText();
			}else{
				EList<SectionComponent> subSectionList = section.getSectionComponentList();
				for(SectionComponent subSectionComponent : subSectionList){
					if(subSectionComponent.getId().equals(sectionComponentid)){
						currentText = subSectionComponent.getText();
						break;
					}
				}
			}
		}
		return currentText;
	}
	
	public void saveText(String sectionComponentid, String currentText){
		EList<SectionComponent> sectionComponentList = racine.getSectionComponentList();
		for(SectionComponent rootChild : sectionComponentList){
			SectionComposite section = (SectionComposite)rootChild;
			if(section.getId().equals(sectionComponentid)){
				section.setText(currentText);
			}else{
				EList<SectionComponent> subSectionList = section.getSectionComponentList();
				for(SectionComponent subSectionComponent : subSectionList){
					if(subSectionComponent.getId().equals(sectionComponentid)){
						Section subSection = (Section)subSectionComponent;
						subSection.setText(currentText);
						break;
					}
				}
			}
		}
	}
	
	public void save(){
        	
     	Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("website", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();

        // create a resource
        Resource resource = resSet.createResource(URI
            .createURI("website/My2.website"));
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        
        EList<SectionComponent> sectionComponentList = racine.getSectionComponentList();
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
	
	

	

}
