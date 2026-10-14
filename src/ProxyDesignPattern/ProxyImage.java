package ProxyDesignPattern;

public class ProxyImage implements  Image{

    public String text;
    public RealImage realImage;

    public ProxyImage(String text){
        this.text=text;
    }

    @Override
    public void display() {
         if(realImage==null){
             System.out.println("Rendering image ");
             realImage=new RealImage(this.text);
         }else{
             System.out.println("Fetching the catched instances");
         }
         realImage.display();
    }

}
