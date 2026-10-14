package DesignPatternPractice.InventoryDesign.User;

public class NormalUser implements  User{

    @Override
    public Users getUserType() {
        return Users.NORMAL;
    }
}
