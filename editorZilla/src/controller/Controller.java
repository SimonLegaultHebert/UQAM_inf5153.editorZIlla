package controller;

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
	
	public SectionComposite addSection(){
		return document.addSection();
	}
	
	public Section addSubSection(String id){
		return document.addSubsection(id);
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
		documentBuilder.setDocument(newDocument);
	}
	
	

	

}
