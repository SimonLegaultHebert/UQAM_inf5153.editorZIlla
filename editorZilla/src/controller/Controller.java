package controller;

import defaultname.*;

public class Controller {

	DocumentBuilder documentBuilder;
	Document document;
	
	//Quand on ouvre le logiciel, le documentBuilder est cr�er par d�faut.
	public Controller(){	
		DefaultnamePackage.eINSTANCE.eClass();
		this.documentBuilder = DefaultnameFactory.eINSTANCE.createDocument().getInstance();
		this.document = DefaultnameFactory.eINSTANCE.createDocument();
		this.documentBuilder.setDocument(document);
	}
	
	public SectionComposite createRoot(){
		SectionComposite racineComposite = (SectionComposite)document.getRacine();
		racineComposite.setTitle(document.getName());
		document.setRacine(racineComposite);
		return racineComposite;
	}
	
	public SectionComposite addSection(String title, String text){
		return document.addSection(title, text);
	}
	
	//id de la section dans laquelle la sous-section est ajout�e
	public Section addSubSection(String id, String title, String text){
		return document.addSubsection(id, title, text);
	}
	
	public void deleteSection(String id){
		document.deleteSection(id);
	}
	
	public void changeSectionTitle(String id, String newTitle){
		document.changeSectionTitle(id, newTitle);
	}
	
	//id du SectionComponent
	public String getContent(String id){
		return document.getContent(id);
	}
	
	//id du SectionComponent
	public void saveText(String id, String currentText){
		document.saveText(id, currentText);
	}
	
	public void saveRacine(String currentText){
		SectionComponent racine = document.getRacine();
		document.saveText(racine.getId(), currentText);
	}
	
	public void createNewDocument(){
		documentBuilder = DefaultnameFactory.eINSTANCE.createDocumentBuilder();
		document = DefaultnameFactory.eINSTANCE.createDocument();
		documentBuilder.setDocument(document);
	}
	
	public void save(String filePath){
		documentBuilder.setFilePath(filePath);
		documentBuilder.save(document);
	}
	
	public void export(String filePath){
		
	}
	
	public void quickSave(){
		documentBuilder.save(document);
	}
	
	public void load(String filePath){
		Document newDocument = documentBuilder.load(filePath);
		document = newDocument;
		documentBuilder.setFilePath(filePath);
		documentBuilder.setDocument(newDocument);
	}
	
	public void copyText(String textToCopy, int startPosition){
		PressePapier pressePapier = document.getPressePapier();
		pressePapier.copyText(textToCopy);
		pressePapier.setStartPosition(startPosition);
		document.setPressePapier(pressePapier);		
	}
	
	public String pasteText(){
		PressePapier pressePapier = document.getPressePapier();
		String textToPaste = pressePapier.pasteText();
		return textToPaste;
	}
	
	public int moveText(){
		PressePapier pressePapier = document.getPressePapier();
		int startPosition = pressePapier.moveText();
		return startPosition;
	}
	
	public void removeTextSelected(){
		PressePapier pressePapier = document.getPressePapier();
		pressePapier.setTextSelected("");
		document.setPressePapier(pressePapier);
	}
	
	public Document getDocument(){
		return document;
	}
	
	public void faire() {
		
	}
	
	public void defaire(){
		
	}

	

}
