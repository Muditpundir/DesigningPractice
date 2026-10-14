package DesignPatternPractice.InventoryDesign.Role;

import DesignPatternPractice.InventoryDesign.User.User;
import DesignPatternPractice.InventoryDesign.User.Users;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Roles {

    Map<Users, List<Actions>>allowedOperations;

    public  Roles(){
        allowedOperations=new HashMap<>();
        allowedOperations.put(Users.ADMIN, Arrays.asList(Actions.UPDATE,Actions.TRANSFER));
        allowedOperations.put(Users.NORMAL,null);
    }
    public boolean checkAllowed(Users user,Actions actions){
         if(allowedOperations.get(user)!=null&&allowedOperations.get(user).contains(actions))return true;
         return false;
    }
}
