package FactoryDesignPattern.DocumentFactory;

import FactoryDesignPattern.Base.Document;
import FactoryDesignPattern.Base.PdFDoc;

import javax.print.Doc;

public class PdfDocumentFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdFDoc();
    }
}
