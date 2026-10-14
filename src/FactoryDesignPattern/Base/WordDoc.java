package FactoryDesignPattern.Base;

import javax.print.Doc;

public class WordDoc implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word Doc");
    }

    @Override
    public void save() {
     System.out.println("Saving word doc");
    }
}
