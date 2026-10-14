package AbstractFactoryPattern.FactoryOfFactory;

import AbstractFactoryPattern.Products.Document;
import AbstractFactoryPattern.Products.Exporter;
import AbstractFactoryPattern.suite.DocumentSuite;

public class NewService {
    public Document document;
    public Exporter exporter;

    public NewService(DocumentSuite documentSuite){
        this.document=documentSuite.getDocument();
        this.exporter=documentSuite.getExporter();
    }
    public void processService(){
        document.openDoc();
        exporter.export();
    }
}
