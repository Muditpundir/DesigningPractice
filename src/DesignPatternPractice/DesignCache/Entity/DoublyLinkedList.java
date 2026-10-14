package DesignPatternPractice.DesignCache.Entity;

public class DoublyLinkedList {
   public Node head;
   public   Node tail;
   public int sz=0;



    public void addFirst(Node node){
         node.next=head;
         node.prev=null;
         if(head==null)tail=node;
         else head.prev=node;
         head=node;
         this.sz++;
    }

    public Node removeConnection(Node node){

           Node next=node.next;
           Node prev=node.prev;
           if(next!=null)next.prev=prev;
           else tail=prev;
           if(prev!=null)prev.next=next;
           else head=next;
           if(head==tail&&head==null)sz=0;
           else sz--;
           node.next=null;

           node.prev=null;
           return  node;

    }

}
