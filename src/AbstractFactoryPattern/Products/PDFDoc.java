package AbstractFactoryPattern.Products;

public class PDFDoc implements Document{
    @Override
    public void openDoc() {
        System.out.println("Opening Pdf Doc");
    }
}
