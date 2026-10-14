package DesignPatternPractice.DesignCache.Entity;

public class Node {

    public String value;
    public String key;
    public  Node next;
    public   Node prev;
    public int frq;

    public  Node(String key,String value){
        this.key=key;
        this.value=value;
        this.next=null;
        this.prev=null;
        frq=0;
    }

}
