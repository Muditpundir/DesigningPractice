package FactoryDesignPattern.Services;

import FactoryDesignPattern.Base.Document;
import FactoryDesignPattern.DocumentFactory.DocumentFactory;

public class EmailService {
    public DocumentFactory documentFactory;

    public  EmailService(DocumentFactory documentFactory){
        this.documentFactory=documentFactory;
    }
    public void sendEmail(){
        Document doc=documentFactory.createDocument();
        doc.open();
        System.out.println("Sending email");
    }
}
