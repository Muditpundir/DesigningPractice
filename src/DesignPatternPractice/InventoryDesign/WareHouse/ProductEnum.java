package DesignPatternPractice.InventoryDesign.WareHouse;

public enum ProductEnum {
    MOBILE("Mobile",100),KEYBOARD("Keyboard",20),MOUSE("Mouse",30),LOWLIMIT("Low",2);
    String name;
    int val;
    ProductEnum(String name,int val){
        this.name=name;
        this.val=val;
    }
    public String getName(){return  this.name;}
    public  int val(){return this.val;}

}
