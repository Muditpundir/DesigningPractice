package AbstractFactoryPattern.Products;

public class PdfExporter implements  Exporter{
    @Override
    public void export() {
        System.out.println("PDF Exporter");
    }
}
