package controller;

import defaultname.*;

public class Controller {

	DocumentBuilder documentBuilder;
	
	//Quand on ouvre le logiciel, le documentBuilder est créer par défaut.
	public Controller(){	
		DefaultnamePackage.eINSTANCE.eClass();
		this.documentBuilder = DefaultnameFactory.eINSTANCE.createDocumentBuilder();
		Document document = DefaultnameFactory.eINSTANCE.createDocument();
		SectionComposite racine = DefaultnameFactory.eINSTANCE.createSectionComposite();
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
	

}
