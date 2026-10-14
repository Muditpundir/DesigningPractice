package AbstractFactoryPattern.Products;

public class WordExporter implements  Exporter{
    @Override
    public void export() {
        System.out.println("Word Exporter");
    }
}
