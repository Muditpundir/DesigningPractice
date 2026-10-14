package AbstractFactoryPattern.Products;

import javax.print.Doc;

public class WordDoc implements Document {
    @Override
    public void openDoc() {
        System.out.println("Opening Word doc");
    }
}
