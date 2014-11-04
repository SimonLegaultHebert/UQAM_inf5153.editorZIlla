package controller;

import org.eclipse.emf.common.util.EList;

import defaultname.*;

public class Controller {

	DocumentBuilder documentBuilder;
	static int sectionCount = 1;
	
	//Quand on ouvre le logiciel, le documentBuilder est créer par défaut.
	public Controller(){	
		DefaultnamePackage.eINSTANCE.eClass();
		this.documentBuilder = DefaultnameFactory.eINSTANCE.createDocumentBuilder();
		Document document = DefaultnameFactory.eINSTANCE.createDocument();
		SectionComposite racine = DefaultnameFactory.eINSTANCE.createSectionComposite();
		racine.setTitle("Section Register");
		document.setRacine(racine);
		document.setCurrentSectionText(racine.getText());
		document.setCurrentSectionTitle(racine.getTitle());
		documentBuilder.setDocument(document);
	}
	
	public String getCurrentSectionContent(){
		String currentSectionContent = "";
		Document document = documentBuilder.getDocument();
		String title = document.getCurrentSectionTitle();
		String text = document.getCurrentSectionText();
		currentSectionContent = title + "\n" + text + "\n";
		return currentSectionContent;		
	}
	
	public SectionComposite addSection(){
		SectionComposite racine = (SectionComposite)documentBuilder.getDocument().getRacine();
		SectionComposite newSection = DefaultnameFactory.eINSTANCE.createSectionComposite();
		racine.add(newSection);
		newSection.setTitle("Section " + racine.getSectionComponentList().size());
		return newSection;	
	}
	
	public Section addSubSection(int sectionNumber){
		SectionComposite racine = (SectionComposite)documentBuilder.getDocument().getRacine();
		Section newSubSection = DefaultnameFactory.eINSTANCE.createSection();
		EList<SectionComponent> sectionComponentList = racine.getSectionComponentList();
		SectionComposite childSection = (SectionComposite)sectionComponentList.get(sectionNumber - 1);
		childSection.add(newSubSection);	
		newSubSection.setTitle(childSection.getTitle() + "-" + childSection.getSectionComponentList().size());
		return newSubSection;
	}
	

}
