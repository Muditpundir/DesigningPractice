package AbstractFactoryPattern.suite;

import AbstractFactoryPattern.Products.Document;
import AbstractFactoryPattern.Products.Exporter;
import AbstractFactoryPattern.Products.PDFDoc;
import AbstractFactoryPattern.Products.PdfExporter;

public class PDFSuite implements  DocumentSuite{

    @Override
    public Document getDocument() {
        return new PDFDoc();
    }

    @Override
    public Exporter getExporter() {
        return new PdfExporter();
    }
}
