package DesignPatternPractice.VendingMachine.Enums;

public interface VendingMachineEnum {
    public  enum Products{
        BISCUT(10),CHIPS(10),COLDRINK(30);
        int val;
        Products(int val){
            this.val=val;
        }
    }
    public enum States{
        READY,ITEMSELECTED,DISPENSE,PAYMENT,MAINTINANCE;
    }
}
