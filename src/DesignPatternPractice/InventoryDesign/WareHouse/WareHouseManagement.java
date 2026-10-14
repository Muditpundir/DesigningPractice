package DesignPatternPractice.InventoryDesign.WareHouse;

import DesignPatternPractice.InventoryDesign.Observers.Observer;
import DesignPatternPractice.InventoryDesign.OperationsStrategy.Strategy;
import DesignPatternPractice.InventoryDesign.Role.Actions;
import DesignPatternPractice.InventoryDesign.Role.Roles;
import DesignPatternPractice.InventoryDesign.User.User;
import DesignPatternPractice.InventoryDesign.User.Users;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WareHouseManagement {
   public List<WareHouse>wareHouses;
   public List<Observer>toNotifyUsers;
   public Strategy strategy;
   public Roles roles;


   public  WareHouseManagement(Strategy strategy){
      this.strategy=strategy;
      wareHouses=new ArrayList<>();
      toNotifyUsers=new ArrayList<>();
      roles=new Roles();
   }
   public void addWareHoue(WareHouse house){
      wareHouses.add(house);
   }

   public void addUserToNotifyAlert(Observer user){
           toNotifyUsers.add(user);
   }

   public void addProduct(User user,ProductEnum productEnum,int quantity){
      if(roles.checkAllowed(user.getUserType(), Actions.UPDATE))
      strategy.addStock(this,productEnum,quantity);
      else System.out.println("Only admin can perfom this action");
   }
   public  void transeferStock(User user,ProductEnum productEnum,int q,WareHouse a,WareHouse b){
      if(roles.checkAllowed(user.getUserType(), Actions.TRANSFER)) {
         strategy.TransFerStock(productEnum, q, a, b);
         notifyForLowStock(productEnum,a);
      }
      else System.out.println("Only admin can perfom this action");
   }

   public void notifyForLowStock(ProductEnum productEnum,WareHouse wareHouse){
            if(wareHouse.stock.get(productEnum)<ProductEnum.LOWLIMIT.val()){
               for(Observer obj:toNotifyUsers){
                  obj.update(wareHouse.name,productEnum.name,wareHouse.stock.get(productEnum).toString());
               }
            }
         }

}
