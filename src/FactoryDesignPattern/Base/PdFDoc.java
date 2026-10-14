package FactoryDesignPattern.Base;

public class PdFDoc implements  Document{
    @Override
    public void open() {
        System.out.println("Opening Pdf document");
    }

    @Override
    public void save() {
       System.out.println("Saving Pdf Doc");
    }
}
