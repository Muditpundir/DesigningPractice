package DesignPatternPractice.DesignCache.EvictionStrategy;

import DesignPatternPractice.DesignCache.Entity.DoublyLinkedList;
import DesignPatternPractice.DesignCache.Entity.Node;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LFUCache implements CacheStrategy{

    Map<String, Node> keyNodeMapping;
    Map<Integer, DoublyLinkedList>frequencyNodeMapping;
    int capacity;
    int mnfrq;

    public LFUCache(int capacity){
        this.capacity=capacity;
        keyNodeMapping=new HashMap<>();
        frequencyNodeMapping=new HashMap<>();
        mnfrq=0;
    }


    @Override
    public void remove() {

        DoublyLinkedList list=frequencyNodeMapping.get(mnfrq);
        Node node= list.removeConnection(list.tail);
        capacity++;
        keyNodeMapping.remove(node.key);
        System.out.println("Node been removed "+node.key);
    }

    @Override
    public Object get(String key) {
        Node node=keyNodeMapping.get(key);
        if(node==null){System.out.println("Sorry no key exist");}
        else {
            update(node);
            System.out.println("Found the key");
            return node.key;
        }
        return null;
    }

    @Override
    public void put(String key, String value) {
        Node node=keyNodeMapping.get(key);

        if(node!=null)System.out.println("Key Already Exist");
        else {
            DoublyLinkedList list=frequencyNodeMapping.get(1);
            node=new Node(key,value);
            node.frq=1;
            if(capacity==0)remove();
            mnfrq=1;
            if(list==null) {
                list = new DoublyLinkedList();
                frequencyNodeMapping.put(1,list);
            }
            keyNodeMapping.put(key,node);
            list.addFirst(node);
            System.out.println("Inserted "+key);
            capacity--;
        }
    }
    public void update(Node node){
        DoublyLinkedList currentList=frequencyNodeMapping.get(node.frq);
        DoublyLinkedList moveToList=frequencyNodeMapping.get(node.frq+1);
        currentList.removeConnection(node);
        if(moveToList==null) {
            moveToList = new DoublyLinkedList();
            frequencyNodeMapping.put(node.frq+1,moveToList);
        }
        moveToList.addFirst(node);
        if(currentList.sz==0&&node.frq==mnfrq)mnfrq++;
        node.frq++;
    }
}
