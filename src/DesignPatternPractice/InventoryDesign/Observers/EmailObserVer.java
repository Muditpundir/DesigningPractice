package DesignPatternPractice.InventoryDesign.Observers;

public class EmailObserVer implements Observer {
    public  String email;
    public  EmailObserVer(String email){
        this.email=email;
    }
    @Override
    public void update(String wareHouseName, String productName, String quant) {
        System.out.println("Message sent to "+this.email);
        System.out.println("In wareHouse "+wareHouseName+" product "+productName+" is on low stock with "+quant);
    }

}
