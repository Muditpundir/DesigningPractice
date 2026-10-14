package DesignPatternPractice.InventoryDesign.User;

public class AdminUserFactoryf implements  UserFactory{
    public User createObject(){
        return new AdminUser();
    }
}
