package controller;

import org.eclipse.emf.common.util.EList;

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
	
	

	

}
