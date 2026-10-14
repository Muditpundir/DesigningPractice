package FactoryDesignPattern.Services;

import FactoryDesignPattern.Base.Document;
import FactoryDesignPattern.DocumentFactory.DocumentFactory;

import javax.print.Doc;

public class PrinterService {
    public DocumentFactory document;

    public PrinterService(DocumentFactory document){
        this.document=document;
    }
    public void printDocument(){
       Document document1= document.createDocument();
        document1.open();
        System.out.println("Document Printed");
    }
}
