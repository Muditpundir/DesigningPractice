package DesignPatternPractice.DesignCache.EvictionStrategy;

import DesignPatternPractice.DesignCache.Entity.Node;

import java.util.HashMap;
import java.util.Map;

public class LRUCache implements  CacheStrategy{

    Map<String, Node> keyNodeMapping;
    Node head;
    Node tail;
    int capacity;

    public   LRUCache(int cap){
        this.keyNodeMapping=new HashMap<>();
        this.head=null;
        this.tail=null;
        this.capacity=cap;
    }


    @Override
    public Object get(String key) {
      Node node=keyNodeMapping.get(key);
      if(node!=null) {
          updateDoublyLinkedList(node);
          return node.value;
      }
      else {
          System.out.println("NO key exist");
      }
      return  null;
    }

    @Override
    public void put(String key,String value) {
         if(keyNodeMapping.get(key)==null){
             System.out.println("Adding new key as it doesn't exist");
             if(this.capacity==0){
                remove();
             }
              Node node=new Node(key,value);
              updateDoublyLinkedList(node);
              keyNodeMapping.put(key,node);
              System.out.println("Cached Successfully");
              capacity--;
         }
         else {
             System.out.println("Key Already Exist");
         }
    }

    public void remove(){

          keyNodeMapping.remove(tail.key);
          System.out.println("Removed the key because cache was full "+ tail.key+" "+tail.value);
          tail=tail.prev;
          tail.next=null;
          capacity++;
    }

    public void updateDoublyLinkedList(Node node){
        if(head==null||head==node) {
            head = node;
            tail=node;

        }
        else {
            Node nodeNext=node.next;
            Node nodePrev=node.prev;
            if(nodeNext!=null)nodeNext.prev=nodePrev;
            if(nodePrev!=null)nodePrev.next=nodeNext;
            if(nodeNext==null&&nodePrev!=null)tail=nodePrev;
            node.next=head;
            node.prev=null;
            head.prev=node;
            head=node;

        }

    }



}
