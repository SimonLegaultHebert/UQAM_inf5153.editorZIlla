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
	
//	public String getCurrentSectionContent(){
//		String currentSectionContent = "";
//		Document document = documentBuilder.getDocument();
//		String title = document.getCurrentSectionTitle();
//		String text = document.getCurrentSectionText();
//		currentSectionContent = title + "\n" + text + "\n";
//		return currentSectionContent;		
//	}
	
	public SectionComposite addSection(){
		SectionComposite newSection = DefaultnameFactory.eINSTANCE.createSectionComposite();
		newSection.setTitle(newSection.getTitle() + " " + (racine.getSectionComponentList().size() + 1));
		
		String title = newSection.getTitle();
		newSection.setText("Ce texte est implémenté dans le controller pour les tests!" + " " + title);
		
		racine.add(newSection);
		return newSection;	
	}
	
	public Section addSubSection(int sectionNumber){
		Section newSubSection = DefaultnameFactory.eINSTANCE.createSection();
		EList<SectionComponent> sectionComponentList = racine.getSectionComponentList();
		SectionComposite childSection = (SectionComposite)sectionComponentList.get(sectionNumber - 1);
		newSubSection.setTitle(newSubSection.getTitle() + " " + sectionNumber + "-" + (childSection.getSectionComponentList().size() + 1));
		
		String title = newSubSection.getTitle();
		newSubSection.setText("Ce texte est implémenté dans le controller pour les tests!" + " " + title);
		
		childSection.add(newSubSection);			
		return newSubSection;
	}
	
	public String getContent(int sectionNumber){
		EList<SectionComponent> sectionComponentList = racine.getSectionComponentList();
		SectionComposite sectionComposite = (SectionComposite)sectionComponentList.get(sectionNumber - 1);
		return sectionComposite.getText();
	}
	
	public String getContent(int sectionNumber, int subSectionNumber){
		EList<SectionComponent> sectionComponentList = racine.getSectionComponentList();
		SectionComposite sectionComposite = (SectionComposite)sectionComponentList.get(sectionNumber - 1);
		EList<SectionComponent> subSectionList = sectionComposite.getSectionComponentList();
		Section subSection = (Section)subSectionList.get(subSectionNumber - 1);
		return subSection.getText();
	}
	

}
