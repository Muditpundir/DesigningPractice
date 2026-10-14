package FactoryDesignPattern.DocumentFactory;

import FactoryDesignPattern.Base.Document;
import FactoryDesignPattern.Base.WordDoc;

public class WordDocFactory implements DocumentFactory{
    @Override
    public Document createDocument() {
        return new WordDoc();
    }
}
