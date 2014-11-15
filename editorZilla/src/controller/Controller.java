package controller;

import org.eclipse.emf.common.util.EList;

import defaultname.*;

public class Controller {

	DocumentBuilder documentBuilder;
	Document document;
	
	//Quand on ouvre le logiciel, le documentBuilder est créer par défaut.
	public Controller(){	
		DefaultnamePackage.eINSTANCE.eClass();
		this.documentBuilder = DefaultnameFactory.eINSTANCE.createDocumentBuilder();
		this.document = DefaultnameFactory.eINSTANCE.createDocument();
		this.documentBuilder.setDocument(document);
	}
	
	public SectionComposite addSection(String title, String text){
		return document.addSection(title, text);
	}
	
	//id de la section dans laquelle la sous-section est ajoutée
	public Section addSubSection(String id, String title, String text){
		return document.addSubsection(id, title, text);
	}
	
	//id du SectionComponent
	public String getContent(String id){
		return document.getContent(id);
	}
	
	//id du SectionComponent
	public void saveText(String id, String currentText){
		document.saveText(id, currentText);
	}
	
	public void createNewDocument(){
		documentBuilder = DefaultnameFactory.eINSTANCE.createDocumentBuilder();
		document = DefaultnameFactory.eINSTANCE.createDocument();
		document.setName("Document par défaut");
		documentBuilder.setDocument(document);
	}
	
	public void save(String filePath){
		documentBuilder.setFilePath(filePath);
		documentBuilder.save(document);
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
	
	public Document getDocument(){
		return document;
	}
	
	

	

}
