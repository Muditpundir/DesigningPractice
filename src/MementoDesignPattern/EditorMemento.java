package MementoDesignPattern;

public class EditorMemento {
    public final String text;

    EditorMemento(String text){
        this.text=text;
    }

    public String getText(){
        return this.text;
    }

}
