package DesignPatternPractice.InventoryDesign.User;

public class AdminUser implements  User{
    @Override
    public Users getUserType() {
        return Users.ADMIN;
    }
}
