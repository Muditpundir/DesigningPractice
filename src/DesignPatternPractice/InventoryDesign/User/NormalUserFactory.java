package DesignPatternPractice.InventoryDesign.User;

public class NormalUserFactory implements  UserFactory{
    public User createObject(){
        return  new NormalUser();
    }

}
