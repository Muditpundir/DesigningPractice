package AbstractFactoryPattern.suite;

import AbstractFactoryPattern.Products.Document;
import AbstractFactoryPattern.Products.Exporter;
import AbstractFactoryPattern.Products.WordDoc;
import AbstractFactoryPattern.Products.WordExporter;

public class WordSuite implements  DocumentSuite{
    @Override
    public Document getDocument() {
        return new WordDoc();
    }

    @Override
    public Exporter getExporter() {
        return new WordExporter();
    }
}
