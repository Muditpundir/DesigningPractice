package FactoryDesignPattern.Services;

import FactoryDesignPattern.Base.Document;
import FactoryDesignPattern.DocumentFactory.DocumentFactory;

public class EditService {
    public DocumentFactory documentFactory;

    public EditService(DocumentFactory documentFactory){
        this.documentFactory=documentFactory;
    }

    public  void editDocument(){
        Document doc=documentFactory.createDocument();
        doc.open();
        System.out.println("Edited ");
    }
}
