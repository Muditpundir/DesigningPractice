package ProtoTypeDesingPattern;

import javax.print.Doc;

public class Document implements  ProtoType<Document>{
    public String docType;
    public String docColor;

    public Document(String docColor,String docType){
        this.docColor=docColor;
        this.docType=docType;
    }
    private  Document(Document doc){
        this.docType=doc.docType+"Cloned";
        this.docColor=doc.docColor;
    }
    @Override
    public Document clone() {
        return new Document(this);
    }
    public String getDocType(){
        return this.docType;
    }
}
