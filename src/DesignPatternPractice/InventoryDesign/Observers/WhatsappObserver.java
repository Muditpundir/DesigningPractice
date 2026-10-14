package DesignPatternPractice.InventoryDesign.Observers;

public class WhatsappObserver implements  Observer{
    private  int num;
    public WhatsappObserver(int num){this.num=num;}


    @Override
    public void update(String wareHouseName, String productName, String quant) {
        System.out.println("Message sent to "+this.num);
        System.out.println("In wareHouse "+wareHouseName+" product "+productName+" is on low stock with "+quant);
    }
}
