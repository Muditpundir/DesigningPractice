package AbstractFactoryPattern.suite;

import AbstractFactoryPattern.Products.Document;
import AbstractFactoryPattern.Products.Exporter;

public interface DocumentSuite {
    public Document getDocument();
    public Exporter getExporter();
}
