package MementoDesignPattern;

public class TextEditor {
    public  String content="";

    public void type(String text){
        this.content+=text;
    }
    public String getContent(){
        return this.content;
    }
    public EditorMemento save(){
        return new EditorMemento(this.content);
    }
   public void restore(EditorMemento editorMemento){
        this.content=editorMemento.getText();
   }
}
