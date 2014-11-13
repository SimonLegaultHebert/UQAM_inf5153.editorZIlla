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
		this.document.setName("Document par défaut");
		this.documentBuilder.setDocument(document);
	}
	
	public SectionComposite addSection(String title, String text){
		return document.addSection(title, text);
	}
	
	public Section addSubSection(String id, String title, String text){
		return document.addSubsection(id, title, text);
	}
	
	public String getContent(String id){
		return document.getContent(id);
	}
	
	public void saveText(String id, String currentText){
		document.saveText(id, currentText);
	}
	
	public void save(){
        documentBuilder.save(document);
	}
	
	public void load(String filePath){
		Document newDocument = documentBuilder.load(filePath);
		document = newDocument;
		documentBuilder.setDocument(newDocument);
	}
	
	

	

}
